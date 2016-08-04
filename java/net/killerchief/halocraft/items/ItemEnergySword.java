package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.guns.ModelEnergySword;
import net.killerchief.kcweaponmod.InterfaceWeaponProperties;
import net.killerchief.kcweaponmod.InterfaceZoomReticle;
import net.killerchief.kcweaponmod.ItemWeaponModel;
import net.killerchief.kcweaponmod.ItemWeaponProperties;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnergySword extends HalocraftItem implements InterfaceWeaponProperties, InterfaceZoomReticle {

	private int weaponDamage;
	public static ItemWeaponProperties Properties = null;

	public ItemEnergySword(String name, String texture) {
		super(name, texture, KCWeaponMod.InventoryTab);
		this.setMaxDamage(25);
		this.maxStackSize = 1;
		this.weaponDamage = 24;
	}

	@Override
	public ItemWeaponProperties Properties() {
		if (this.Properties == null) {
			this.Properties = new ItemWeaponProperties(Halocraft.MODID+".EnergySword");
			this.Properties.WeaponModel = new ItemWeaponModel(new ModelEnergySword(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySword.png"), true, true);
		}
		return this.Properties;
	}

	@Override
	public boolean doLoweredWeapon() {
		return false;
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

	/**
	 * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
	 * sword
	 */
	@Override
	public float func_150893_a(ItemStack itemstack, Block block)//getStrVsBlock
	{
		if (block == Blocks.web)
		{
			return 15.0F;
		}
		else
		{
			Material material = block.getMaterial();
			return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
		}
	}

	/**
	 * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
	 * the damage on the stack.
	 */
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_)
	{
		if ((double)p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
		{
			p_150894_1_.damageItem(2, p_150894_7_);
		}

		return true;
	}

	/**
	 * Returns if the item (tool) can harvest results from the block type.
	 */
	@Override
	public boolean func_150897_b(Block par1Block)//canHarvestBlock
	{
		return par1Block == Blocks.web;
	}

	/**
	 * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
	 */
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
		return multimap;
	}

	/*/*
	 * returns the action that specifies what animation to play when the items is being used
	 */
	/*public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }*/

	/*/*
	 * How long it takes to use or consume an item
	 */
	/*public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }*/

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.block;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		//par1ItemStack = new ItemStack(Halocraft.SwordHilt, 1, par1ItemStack.getItemDamage());
		//par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));

		float forwardForce = 0.6F;

		float f1 = MathHelper.sin(par3EntityPlayer.rotationYaw * (float)Math.PI / 180.0F);
		float f2 = MathHelper.cos(par3EntityPlayer.rotationYaw * (float)Math.PI / 180.0F);
		float f3 = (-forwardForce * f1);
		float f4 = (forwardForce * f2);
		float f5 = MathHelper.sqrt_float((float)(((par3EntityPlayer.motionX * par3EntityPlayer.motionX) + (par3EntityPlayer.motionZ * par3EntityPlayer.motionZ))*10));
		float f6 = MathHelper.sqrt_float((float)((f3 * f3)+(f4 * f4)));
		//System.out.println("f5:" + f5);
		//System.out.println("f6:" + f6);
		if (f5 < ((f6/3)*2))
		{
			par3EntityPlayer.motionX += (double)f3;
			par3EntityPlayer.motionZ += (double)f4;
		}
		else if (f5 < f6)
		{
			par3EntityPlayer.motionX += (double)f3/2;
			par3EntityPlayer.motionZ += (double)f4/2;
		}
		else
		{
			par3EntityPlayer.motionX += (double)f3/6;
			par3EntityPlayer.motionZ += (double)f4/6;
		}

		/*float f7 = f5/f6;
        float f8 = 1F - MathHelper.clamp_float(f7, 0F, 1F);

        System.out.println("f6:" + f6);
        System.out.println("f7:" + f7);
        System.out.println("f8:" + f8);

		par3EntityPlayer.motionX += (double)(f3 * f8);
		par3EntityPlayer.motionZ += (double)(f4 * f8);
		 */

		if (par3EntityPlayer.onGround)
		{
			float f10 = (((par3EntityPlayer.rotationPitch/-1)+20)/100);
			float f11 = 1.8F - (f10+0.7F);
			float f12 = -(f11*f11) + 1;
			float f13 = -0.2F * (f12*f12) - (0.13F * f12) + 1F;
			float f14 = (f12 * f13);
			par3EntityPlayer.onGround = false;
			par3EntityPlayer.motionY += f14;
		}

		return par1ItemStack;
	}

	@Override
	public boolean IsZoomable() {
		return false;
	}

	@Override
	public int[] ZoomMultiplier() {
		return null;
	}

	@Override
	public ResourceLocation ZoomTexture() {
		return null;
	}

	@Override
	public boolean ZoomLikeHelmet() {
		return false;
	}

	@Override
	public boolean HasReticle() {
		return true;
	}

	@Override
	public ResourceLocation ReticleTexture() {
		return new ResourceLocation(Halocraft.MODID+":textures/overlays/Reticle.png");
	}

	@Override
	public float ReticleTransparency() {
		return 1.0F;
	}

	@Override
	public int[] ReticleProperties() {
		return new int[]{43, 75, 41, 41, 20, 20};
	}


	/*/*
	 * Return whether this item is repairable in an anvil.
	 */
	/*public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return Halocraft.PlasmaPowerCore.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }*/
}