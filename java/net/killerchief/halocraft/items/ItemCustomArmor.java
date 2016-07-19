package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.halocraft.client.models.armor.ModelArmorMarkV;
import net.killerchief.kcweaponmod.InterfaceZoomReticle;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCustomArmor extends net.minecraft.item.ItemArmor implements InterfaceZoomReticle {

	private String Texture;
	public ResourceLocation VisorHudTexture = null;
	private ResourceLocation ZoomTexture = null;
	private Model3DArmor ArmorModel;
	private String ArmorTex;

	public ItemCustomArmor(String name, String texture, String armorModel, String armorTex, int armorType, ArmorMaterial par2EnumArmorMaterial, int renderIndex)
	{
		super(par2EnumArmorMaterial, renderIndex, armorType);
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.ArmorModel = Halocraft.proxy.armor3DType(armorModel);
		//this.ArmorModel = armorModel;
		this.ArmorTex = armorTex;
		this.setCreativeTab(Halocraft.InvTabHalocraftArmor);
	}

	public ItemCustomArmor(String name, String texture, String armorModel, String armorTex, int armorType, ArmorMaterial par2EnumArmorMaterial, int renderIndex, String visorhudtexture, String zoomtexture)
	{
		this(name, texture, armorModel, armorTex, armorType, par2EnumArmorMaterial, renderIndex);
		this.VisorHudTexture = new ResourceLocation(Halocraft.MODID+":textures/armor/overlays/"+visorhudtexture+".png");
		this.ZoomTexture = new ResourceLocation(Halocraft.MODID+":textures/armor/overlays/"+zoomtexture+".png");
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(Halocraft.MODID + ":armor/" + this.Texture);
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
		Model3DArmor armorModel = null;
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof ItemCustomArmor)
			{
				armorModel = this.ArmorModel;//Halocraft.proxy.isSideClient() ? this.ArmorModel : null;
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

				if (armorModel.headModel != null)
					for (ModelRendererTurbo part : armorModel.headModel)
					{
						part.showModel = armorSlot == 0;
					}
				if (armorModel.bodyModel != null)
					for (ModelRendererTurbo part : armorModel.bodyModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.leftArmModel != null)
					for (ModelRendererTurbo part : armorModel.leftArmModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.rightArmModel != null)
					for (ModelRendererTurbo part : armorModel.rightArmModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.leftLegModel != null)
					for (ModelRendererTurbo part : armorModel.leftLegModel)
					{
						part.showModel = armorSlot == 2;
					}
				if (armorModel.rightLegModel != null)
					for (ModelRendererTurbo part : armorModel.rightLegModel)
					{
						part.showModel = armorSlot == 2;
					}
				if (armorModel.leftBootModel != null)
					for (ModelRendererTurbo part : armorModel.leftBootModel)
					{
						part.showModel = armorSlot == 3;
					}
				if (armorModel.rightBootModel != null)
					for (ModelRendererTurbo part : armorModel.rightBootModel)
					{
						part.showModel = armorSlot == 3;
					}
				if (armorModel.headLightsModel != null)
					for (ModelRendererTurbo part : armorModel.headLightsModel)
					{
						part.showModel = armorSlot == 0;
					}
				if (armorModel.bodyLightsModel != null)
					for (ModelRendererTurbo part : armorModel.bodyLightsModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.leftArmLightsModel != null)
					for (ModelRendererTurbo part : armorModel.leftArmLightsModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.rightArmLightsModel != null)
					for (ModelRendererTurbo part : armorModel.rightArmLightsModel)
					{
						part.showModel = armorSlot == 1;
					}
				if (armorModel.visorModel != null)
					for (ModelRendererTurbo part : armorModel.visorModel)
					{
						part.showModel = armorSlot == 0;
					}
				if (armorModel.visor2Model != null)
					for (ModelRendererTurbo part : armorModel.visor2Model)
					{
						part.showModel = armorSlot == 0;
					}
				if (armorModel.cubemapModel != null)
					for (ModelRendererTurbo part : armorModel.cubemapModel)
					{
						part.showModel = armorSlot == 0;
					}
				
				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				if (entityLiving instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer)entityLiving;
					armorModel.heldItemRight = player.getCurrentEquippedItem() != null ? (player.getItemInUseCount() > 0 && player.getCurrentEquippedItem().getItemUseAction() == EnumAction.block ? 3 : 1) : 0;
					//armorModel.aimedBow = ((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
					armorModel.aimedBow = player.getCurrentEquippedItem() != null && player.getItemInUseCount() > 0 && player.getCurrentEquippedItem().getItemUseAction() == EnumAction.bow;
				}
				return armorModel;
			}
		}
		return null;
	}

	@Override
	public boolean IsZoomable() {
		return this.ZoomTexture != null;
	}

	@Override
	public int[] ZoomMultiplier() {
		return new int[]{3};
	}

	@Override
	public ResourceLocation ZoomTexture() {
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
	public ResourceLocation ReticleTexture() {
		return null;
	}

	@Override
	public float ReticleTransparency() {
		return 1.0F;
	}
	
	@Override
	public int[] ReticleProperties() {
		return null;
	}

}