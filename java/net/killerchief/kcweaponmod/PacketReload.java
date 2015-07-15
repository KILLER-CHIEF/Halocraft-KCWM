package net.killerchief.kcweaponmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketReload implements IMessage {
	
	/** 0 = not reloading, 1 = reloading, 2 = single ammo loading */
	private int IsReloadingState;
	private int LoadedItemsCount;

	public PacketReload() { }

	public PacketReload(int isreloadingstate, int loadeditemscount) {
		this.IsReloadingState = isreloadingstate;
		this.LoadedItemsCount = loadeditemscount;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.IsReloadingState);
		buf.writeInt(this.LoadedItemsCount);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.IsReloadingState = buf.readInt();
		this.LoadedItemsCount = buf.readInt();
	}

	public static class Handler implements IMessageHandler<PacketReload, IMessage>
	{
		@Override
		public IMessage onMessage(PacketReload message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				if (!TickHandler.ShootDelayMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ShootDelayMap.put(ctx.getServerHandler().playerEntity, new Integer(0));
				}
				if (message.IsReloadingState == 0 || !TickHandler.ReloadDelayMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ReloadDelayMap.put(ctx.getServerHandler().playerEntity, new Integer(0));
				}
				if (message.IsReloadingState == 1 && TickHandler.ReloadDelayMap.containsKey(ctx.getServerHandler().playerEntity) && TickHandler.ShootDelayMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					if (TickHandler.ReloadDelayMap.get(ctx.getServerHandler().playerEntity) <= 0 && (TickHandler.ShootDelayMap.get(ctx.getServerHandler().playerEntity) == null || TickHandler.ShootDelayMap.get(ctx.getServerHandler().playerEntity) <= 0))
					{
						if (ctx.getServerHandler().playerEntity.inventory != null && ctx.getServerHandler().playerEntity.inventory.getCurrentItem() != null)
						{
							Item item = ctx.getServerHandler().playerEntity.inventory.getCurrentItem().getItem();
							if (item instanceof ItemWeapon)
							{
								ItemWeapon weapon = (ItemWeapon)item;
								if (!weapon.Properties.AmmoFeedsFromInventory)
								{
									if ((weapon.Properties.AmmoType != null && ctx.getServerHandler().playerEntity.inventory.hasItem(weapon.Properties.AmmoType.getItem())) || ctx.getServerHandler().playerEntity.capabilities.isCreativeMode)
									{
										TickHandler.ReloadDelayMap.put(ctx.getServerHandler().playerEntity, new Integer(weapon.Properties.ReloadTime));
										ctx.getServerHandler().playerEntity.worldObj.playSoundAtEntity(ctx.getServerHandler().playerEntity, weapon.Properties.ReloadSound, 1.0F, 1.0F);
										//System.out.println("Server Processed Packet");
									}
								}
							}
						}
					}
				}
			}
			if(ctx.side.isClient())
			{
				if (message.IsReloadingState == 0) {
					TickHandlerClient.IsReloading = false;
					TickHandlerClient.ReloadingWeapon = null;
				}
				if (message.IsReloadingState >= 1)
				{
					if (Minecraft.getMinecraft().thePlayer.inventory != null && Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem() != null)
					{
						Item item = Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem().getItem();
						for (ItemWeapon weapon : KCWeaponMod.weapons)
						{
							if (item == weapon)
							{
								Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem().setItemDamage(Minecraft.getMinecraft().thePlayer.inventory.getCurrentItem().getItemDamage() - message.LoadedItemsCount);
								if (message.IsReloadingState == 1)
								{
									TickHandlerClient.IsReloading = false;
									TickHandlerClient.ReloadingWeapon = null;
								}
								if (weapon.Properties.AmmoType != null)
								{
									int t = 0;
									while (t < message.LoadedItemsCount)
									{
										Minecraft.getMinecraft().thePlayer.inventory.consumeInventoryItem(weapon.Properties.AmmoType.getItem());
										t++;
									}
								}
							}
						}
					}
				}
			}
			return null; // no response in this case
		}
	}
}