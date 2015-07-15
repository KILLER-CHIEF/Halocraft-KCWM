package net.killerchief.kcweaponmod;

import io.netty.buffer.ByteBuf;

import java.lang.reflect.InvocationTargetException;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class PacketShoot implements IMessage {

	private float GunRecoil = 0F;
	private int GunSlot = 0;
	private boolean ItemStackDecreaseOnUse = false;
	private boolean AmmoFeedsFromInventory = false;
	private ItemStack GunAmmoType = null;
	private int GunUses = 1;

	public PacketShoot() { }

	public PacketShoot(float recoil, int gunslot, boolean itemstackdecreaseonuse, boolean ammofeedsfrominventory, ItemStack ammotype, int uses){
		this.GunRecoil = recoil;
		this.GunSlot = gunslot;
		this.ItemStackDecreaseOnUse = itemstackdecreaseonuse;
		this.AmmoFeedsFromInventory = ammofeedsfrominventory;
		this.GunAmmoType = ammotype;
		this.GunUses = uses;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeFloat(this.GunRecoil);
		buf.writeInt(this.GunSlot);
		buf.writeBoolean(this.ItemStackDecreaseOnUse);
		buf.writeBoolean(this.AmmoFeedsFromInventory);
		ByteBufUtils.writeItemStack(buf, this.GunAmmoType);
		buf.writeInt(this.GunUses);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.GunRecoil = buf.readFloat();
		this.GunSlot = buf.readInt();
		this.ItemStackDecreaseOnUse = buf.readBoolean();
		this.AmmoFeedsFromInventory = buf.readBoolean();
		this.GunAmmoType = ByteBufUtils.readItemStack(buf);
		this.GunUses = buf.readInt();
	}

	public static class Handler implements IMessageHandler<PacketShoot, IMessage>
	{
		@Override
		public IMessage onMessage(PacketShoot message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				ItemStack playerCurrentItemStack = ctx.getServerHandler().playerEntity.inventory.getCurrentItem();

				if (!TickHandler.ShootDelayMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ShootDelayMap.put(player, new Integer(0));
				}
				if (TickHandler.ShootDelayMap.containsKey(player))
				{
					if (TickHandler.ShootDelayMap.get(player) <= 0)
					{
						if (player.inventory != null && playerCurrentItemStack != null)
						{
							if (playerCurrentItemStack.getItem() instanceof ItemWeapon)
							{
								this.shoot(ctx.side, player, (ItemWeapon)playerCurrentItemStack.getItem(), playerCurrentItemStack, true);
							}
						}
					}
				}
			}
			
			if(ctx.side.isClient())
			{
				TickHandlerClient.Recoil += message.GunRecoil;
				if (Minecraft.getMinecraft().thePlayer.inventory != null)
				{
					ItemStack itemstack = Minecraft.getMinecraft().thePlayer.inventory.mainInventory[message.GunSlot];
					if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 0 && itemstack.getItem() instanceof ItemWeapon)//&& is not equipment
					{
						Minecraft.getMinecraft().thePlayer.swingItem();//swingProgressInt isSwingInProgress
						Minecraft.getMinecraft().thePlayer.swingProgressInt = -1;
						Minecraft.getMinecraft().thePlayer.isSwingInProgress = true;
					}
					
					if (!message.ItemStackDecreaseOnUse)
					{
						if (!message.AmmoFeedsFromInventory)
						{
							if (Minecraft.getMinecraft().thePlayer.inventory.mainInventory[message.GunSlot] != null)
							{
								//XXX: Minecraft.getMinecraft().thePlayer.inventory.player must use second reference to player due to EntityClientPlayerMP reference from the first breaking the server
								Minecraft.getMinecraft().thePlayer.inventory.getStackInSlot(message.GunSlot).damageItem(message.GunUses,  Minecraft.getMinecraft().thePlayer.inventory.player);
							}
						}
						else
						{
							if (message.GunAmmoType != null)
							{
								for (int i = 0; i < message.GunUses; i++) {
									Minecraft.getMinecraft().thePlayer.inventory.consumeInventoryItem(message.GunAmmoType.getItem());
								}
							}
						}
					}
					else
					{
						if (!Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode && Minecraft.getMinecraft().thePlayer.inventory.mainInventory[message.GunSlot] != null)
						{
							Minecraft.getMinecraft().thePlayer.inventory.getStackInSlot(message.GunSlot).stackSize -= message.GunUses;
							if (Minecraft.getMinecraft().thePlayer.inventory.getStackInSlot(message.GunSlot).stackSize <= 0)
							{
								Minecraft.getMinecraft().thePlayer.inventory.mainInventory[message.GunSlot] = null;
								TickHandlerClient.KillItWithFire = 10;
								TickHandlerClient.KillItWithFireSlot = message.GunSlot;
							}
						}
					}
				}
			}
			return null; // no response in this case
		}
		
		public static void shoot(Side side, EntityPlayer player, ItemWeapon weapon, ItemStack playerCurrentItemStack, boolean isFromPacketClass)
		{
			if (side.isServer() && (TickHandler.ReloadDelayMap.get(player) != null && TickHandler.ReloadDelayMap.get(player) != 0))
			{
				TickHandler.ReloadDelayMap.put(player, new Integer(0));
				KCWeaponMod.network.sendTo(new PacketReload(0, 0), (EntityPlayerMP)player);
			}
			int AmmoAvailable = 0;
			if (weapon.Properties.AmmoType != null && weapon.Properties.AmmoFeedsFromInventory)
			{
				for(int i = 0; i <= player.inventory.mainInventory.length; i++) {
					if(player.inventory.mainInventory[i] != null) {
						if(player.inventory.mainInventory[i].getItem() == weapon.Properties.AmmoType.getItem()) {
							AmmoAvailable += player.inventory.mainInventory[i].stackSize;
						}
					}
				}
			}
			if (player.capabilities.isCreativeMode || (weapon.Properties.ItemStackDecreaseOnUse && playerCurrentItemStack.stackSize >= weapon.Properties.RequiredUsesPerShot) || (weapon.Properties.AmmoFeedsFromInventory && weapon.Properties.AmmoType != null && AmmoAvailable >= weapon.Properties.RequiredUsesPerShot) || (!weapon.Properties.AmmoFeedsFromInventory && playerCurrentItemStack.getItemDamage() + weapon.Properties.RequiredUsesPerShot <= playerCurrentItemStack.getMaxDamage()))
			{
				int uses = 0;
				float recoil = 0F;
				if (side.isServer())
				{
					TickHandler.ShootDelayMap.put(player, new Integer(weapon.Properties.GunShootDelay));
				}
				if (weapon.Properties.PerformOnly1ShootSound)
				{
					player.worldObj.playSoundAtEntity(player, weapon.Properties.ShootSound, 1.0F, 1.0F);
				}
				for (int b = 0; b < weapon.Properties.ShootBurstCount; b++) {
					if (player.capabilities.isCreativeMode || (weapon.Properties.ItemStackDecreaseOnUse && playerCurrentItemStack.stackSize >= weapon.Properties.RequiredUsesPerShot) || (weapon.Properties.AmmoFeedsFromInventory && weapon.Properties.AmmoType != null && AmmoAvailable >= weapon.Properties.RequiredUsesPerShot) || (!weapon.Properties.AmmoFeedsFromInventory && playerCurrentItemStack.getItemDamage() + weapon.Properties.RequiredUsesPerShot <= playerCurrentItemStack.getMaxDamage()))
					{
						uses += weapon.Properties.RequiredUsesPerShot;
						recoil += weapon.Properties.Recoil;
						if (!weapon.Properties.PerformOnly1ShootSound)
						{
							player.worldObj.playSoundAtEntity(player, weapon.Properties.ShootSound, 1.0F, 1.0F);
						}
						if (!weapon.Properties.ItemStackDecreaseOnUse)
						{
							if (weapon.Properties.AmmoFeedsFromInventory)
							{
								if (weapon.Properties.AmmoType != null)
								{
									for (int i = 0; i < weapon.Properties.RequiredUsesPerShot; i++) {
										player.inventory.consumeInventoryItem(weapon.Properties.AmmoType.getItem());
									}
								}
							}
							else
							{
								player.inventory.getStackInSlot(player.inventory.currentItem).damageItem(weapon.Properties.RequiredUsesPerShot, player);
							}
						}
						else
						{
							if (!player.capabilities.isCreativeMode)
								playerCurrentItemStack.stackSize -= weapon.Properties.RequiredUsesPerShot;
						}
						if (!player.worldObj.isRemote)
						{
							for (int s = 0; s < weapon.Properties.SingleShotProjectileCount; s++) {
								//FIXME: KCWM Projectile from another class reflection.
								try {
									player.worldObj.spawnEntityInWorld(((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[weapon.Properties.ProjectileID]).getConstructor(World.class, EntityLivingBase.class, int.class, String.class).newInstance(player.worldObj, player, weapon.Properties.ID, ""));
								} catch (InstantiationException e) {
									e.printStackTrace();
								} catch (IllegalAccessException e) {
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									e.printStackTrace();
								} catch (NoSuchMethodException e) {
									e.printStackTrace();
								} catch (SecurityException e) {
									e.printStackTrace();
								} catch (ClassNotFoundException e) {
									e.printStackTrace();
								}
							}
							if (player.worldObj instanceof WorldServer)//Visible recoil on body to other players (if executed on target player they will swing their hand on screen which is bad for looks but doesn't actually do anything)
					        {
					            ((WorldServer)player.worldObj).getEntityTracker().func_151247_a((EntityLivingBase)player, new S0BPacketAnimation((EntityLivingBase)player, 0));
					        }
						}
					}
				}
				if (isFromPacketClass)
				{
					KCWeaponMod.network.sendTo(new PacketShoot(recoil, player.inventory.currentItem, weapon.Properties.ItemStackDecreaseOnUse, weapon.Properties.AmmoFeedsFromInventory, weapon.Properties.AmmoType, uses), (EntityPlayerMP)player);
				}
			}
		}
	}
}
