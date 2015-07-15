package net.killerchief.kcweaponmod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWeapon extends Item implements InterfaceZoomReticle {
	
	public ItemWeaponProperties Properties;
	private boolean IsEquipment = false;//was blank ;
	private boolean loweredweapon = false;
	
	public ItemWeapon(ItemWeaponProperties properties) {
		super();
		this.Properties = properties;
		this.setUnlocalizedName(properties.Name);
		this.setCreativeTab(properties.InventoryTab);
		this.maxStackSize = this.Properties.ItemStackDecreaseOnUse ? this.Properties.ItemStackMaxStackSize : 1;
		this.setMaxDamage(this.Properties.MagazineSize);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(this.Properties.Texture);
	}
	
	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par3EntityPlayer.isSprinting())
		{
			this.loweredweapon = false;
			if (!this.Properties.IsAutomaticOrHasSecondaryShoot)
			{
				if (!this.Properties.ItemStackDecreaseOnUse || (this.Properties.ItemStackDecreaseOnUse && par1ItemStack.stackSize >= this.Properties.RequiredUsesPerShot))
				{
					if (this.Properties.GunShootDelay <= 0)
					{
						if (!par2World.isRemote)
						{
							if (!TickHandler.ShootDelayMap.containsKey(par3EntityPlayer))
							{
								TickHandler.ShootDelayMap.put(par3EntityPlayer, new Integer(0));
							}
							if (!TickHandler.ReloadDelayMap.containsKey(par3EntityPlayer))
							{
								TickHandler.ReloadDelayMap.put(par3EntityPlayer, new Integer(0));
							}
						}
						if (TickHandler.ShootDelayMap.containsKey(par3EntityPlayer) && TickHandler.ShootDelayMap.get(par3EntityPlayer) <= 0)
						{
							PacketShoot.Handler.shoot(FMLCommonHandler.instance().getEffectiveSide(), par3EntityPlayer, this, par1ItemStack, false);
						}
					}
					else
					{
						if (FMLCommonHandler.instance().getEffectiveSide().isClient())
						{
							KCWeaponMod.network.sendToServer(new PacketShoot(0F, 0, false, false, null, 0));
						}
					}
				}
			}
		}
		else
		{
			par3EntityPlayer.setSprinting(false);
			if (par2World.isRemote && par3EntityPlayer.isSwingInProgress && !par3EntityPlayer.onGround && par3EntityPlayer.moveStrafing > 0)
			{
				this.loweredweapon = true;
			}
		}
		
		return par1ItemStack;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}
	
	public boolean isEquipment()
	{
		return this.IsEquipment;
	}
	
	public boolean doloweredweapon()
	{
		return this.loweredweapon;
	}

	@Override
	public boolean IsZoomable() {
		return this.Properties.IsZoomable;
	}

	@Override
	public int[] ZoomMultiplier() {
		return this.Properties.ZoomMultiplier;
	}

	@Override
	public String ZoomTexture() {
		return this.Properties.ZoomTexture;
	}
	
	@Override
	public boolean ZoomLikeHelmet() {
		return false;
	}
	
	@Override
	public boolean HasReticle() {
		return false;
	}

	@Override
	public String ReticleTexture() {
		return null;
	}

	@Override
	public int[] ReticleProperties() {
		return null;
	}
}
