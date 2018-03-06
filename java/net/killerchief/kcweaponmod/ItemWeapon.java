package net.killerchief.kcweaponmod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWeapon extends Item implements InterfaceWeaponProperties, InterfaceZoomReticle, InterfaceTracking {
	
	public ItemWeaponProperties Properties;
	private boolean loweredweapon = false;
	private ResourceLocation ScopeTexture = null;
	
	public ItemWeapon(ItemWeaponProperties properties) {
		super();
		this.Properties = properties;
		this.ScopeTexture = new ResourceLocation(properties.ScopeTexture);
		this.setUnlocalizedName(properties.Name);
		this.setCreativeTab(properties.InventoryTab);
		this.maxStackSize = this.Properties.ItemStackDecreaseOnUse ? this.Properties.ItemStackMaxStackSize : 1;
		this.setMaxDamage(this.Properties.MagazineSize);
	}
	
	@Override
	public String toString() {
		return this.Properties.Name;
	}
	
	@Override
	public ItemWeaponProperties Properties() {
		return this.Properties;
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
						if (!par2World.isRemote)//Put this v inside?
						{
							if (!TickHandler.ShootDelayMap.containsKey(par3EntityPlayer))
							{
								PacketShoot.Handler.shoot(FMLCommonHandler.instance().getEffectiveSide(), par3EntityPlayer, this, par1ItemStack, false);
							}
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
	
	@Override
	public boolean doLoweredWeapon()
	{
		return this.loweredweapon;
	}

	@Override
	public boolean IsZoomable() {
		return this.Properties.ZoomMultiplier != null;
	}

	@Override
	public int[] ZoomMultiplier() {
		return this.Properties.ZoomMultiplier;
	}
	
	@Override
	public boolean ZoomLikeHelmet() {
		return false;
	}

	@Override
	public ResourceLocation ScopeTexture() {
		return this.ScopeTexture;
	}

	@Override
	public float ScopeBGOpacity() {
		return this.Properties.ScopeBGOpacity;
	}

	@Override
	public int[] ScopeProperties() {
		return this.Properties.ScopeProperties;
	}
	
	@Override
	public boolean HasReticle() {
		return this.Properties.HasReticle;
	}

	@Override
	public ResourceLocation ReticleTexture() {
		return new ResourceLocation(this.Properties.ReticleTexture);
	}
	
	@Override
	public float ReticleOpacity() {
		return this.Properties.ReticleOpacity;
	}

	@Override
	public int[] ReticleProperties() {
		return this.Properties.ReticleProperties;
	}

	@Override
	public boolean CanTrack() {
		return this.Properties.TrackSensitivity > 0F;
	}

	@Override
	public float TrackSensitivity() {
		return this.Properties.TrackSensitivity;
	}

	@Override
	public int TrackDelay() {
		return this.Properties.TrackLastDelay;
	}
	
	@Override
	public int TrackType() {
		return this.Properties.TrackType;
	}
	
	@Override
	public int TrackDistance() {
		return this.Properties.TrackDistance;
	}

}
