package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.halocraft.client.models.armor.ModelMarkVArmor;
import net.killerchief.kcweaponmod.InterfaceZoomReticle;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCustomArmor extends net.minecraft.item.ItemArmor implements InterfaceZoomReticle {

	private String Texture;
	private boolean IsZoomable = false;
	private String ZoomTexture = null;
	private Model3DArmor ArmorModel;
	private String ArmorTex;

	public ItemCustomArmor(String name, String texture, Model3DArmor armorModel, String armorTex, int armorType, ArmorMaterial par2EnumArmorMaterial, int renderIndex)
	{
		super(par2EnumArmorMaterial, renderIndex, armorType);
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.ArmorModel = armorModel;
		this.ArmorTex = armorTex;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}

	public ItemCustomArmor(String name, String texture, Model3DArmor armorModel, String armorTex, int armorType, ArmorMaterial par2EnumArmorMaterial, int renderIndex, boolean iszoomable, String zoomtexture)
	{
		this(name, texture, armorModel, armorTex, armorType, par2EnumArmorMaterial, renderIndex);
		this.IsZoomable = iszoomable;
		this.ZoomTexture = zoomtexture;
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(Halocraft.MODID + ":" + this.Texture);
	}

	/**
	 * This interface has to return the path to a file that is the same
	 * format as iron_1.png (or any of the other armor files). It will be
	 * applied to the player skin when the armor is worn.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	{
		if (entity.isInvisible())
		{
			return Halocraft.MODID+":textures/armor/Transparent.png";
		}

		if (this.ArmorModel == null)
		{
			if (slot == 2)
			{
				return this.ArmorTex.substring(0, this.ArmorTex.length()-4)+"2.png";
			}
			else
			{
				return this.ArmorTex.substring(0, this.ArmorTex.length()-4)+"1.png";
			}
		}

		return this.ArmorTex;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
	{
		ModelBiped armorModel = null;
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof ItemCustomArmor)
			{
				armorModel = Halocraft.proxy.isSideClient() ? this.ArmorModel : null;
			}
			if(armorModel != null)
			{
				armorModel.bipedHead.showModel = false;
				armorModel.bipedHeadwear.showModel = false;
				armorModel.bipedBody.showModel = false;
				armorModel.bipedRightArm.showModel = false;
				armorModel.bipedLeftArm.showModel = false;
				armorModel.bipedRightLeg.showModel = false;
				armorModel.bipedLeftLeg.showModel = false;

				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).headModel)
				{
					part.showModel  = armorSlot == 0;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).bodyModel)
				{
					part.showModel = armorSlot == 1;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).leftArmModel)
				{
					part.showModel  = armorSlot == 1;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).rightArmModel)
				{
					part.showModel  = armorSlot == 1;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).leftLegModel)
				{
					part.showModel  = armorSlot == 2;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).rightLegModel)
				{
					part.showModel  = armorSlot == 2;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).leftBootModel)
				{
					part.showModel  = armorSlot == 3;
				}
				for (ModelRendererTurbo part : ((ModelMarkVArmor)armorModel).rightBootModel)
				{
					part.showModel  = armorSlot == 3;
				}
				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = ((EntityPlayer)entityLiving).getCurrentEquippedItem() != null ? 1 : 0;
				if (entityLiving instanceof EntityPlayer) {
					armorModel.aimedBow = ((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				}
				return armorModel;
			}
		}
		return null;
	}

	@Override
	public boolean IsZoomable() {
		return this.IsZoomable;
	}

	@Override
	public int[] ZoomMultiplier() {
		return new int[]{3};
	}

	@Override
	public String ZoomTexture() {
		return this.ZoomTexture;
	}

	@Override
	public boolean ZoomLikeHelmet() {
		return true;
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