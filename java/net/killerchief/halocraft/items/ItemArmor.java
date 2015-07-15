package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.kcweaponmod.InterfaceZoomReticle;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmor extends net.minecraft.item.ItemArmor implements InterfaceZoomReticle {

	private String Texture;
	private boolean IsZoomable;
	private String ZoomTexture;

	//The First Param Is Item ID, The Second Is Its Material, The Third Is The Rendering ID, and The Final Is The Type (i.e. Helmet, Plate, Boots, Legs)
	public ItemArmor(String name, String texture, boolean CIIAppears, ArmorMaterial par2EnumArmorMaterial, int renderIndex, int armorType)
	{
		super(par2EnumArmorMaterial, renderIndex, armorType);
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		if (CIIAppears) {
			this.setCreativeTab(Halocraft.InvTabHalocraft);
		}
		else {
			this.setCreativeTab(null);
		}
		this.IsZoomable = false;
		this.ZoomTexture = null;
	}
	
	public ItemArmor(String name, String texture, boolean CIIAppears, ArmorMaterial par2EnumArmorMaterial, int renderIndex, int armorType, boolean iszoomable, String zoomtexture)
	{
		this(name, texture, CIIAppears, par2EnumArmorMaterial, renderIndex, armorType);
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

		if (itemstack.getItem() == HalocraftItemsArmor.MarkVHelmetBlack || itemstack.getItem() == HalocraftItemsArmor.MarkVBodyBlack || itemstack.getItem() == HalocraftItemsArmor.MarkVBootsBlack) {
			return Halocraft.MODID+":textures/armor/MarkVBlack1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarkVLegsBlack) {
			return Halocraft.MODID+":textures/armor/MarkVBlack2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.MarkVHelmetGreen || itemstack.getItem() == HalocraftItemsArmor.MarkVBodyGreen || itemstack.getItem() == HalocraftItemsArmor.MarkVBootsGreen) {
			return Halocraft.MODID+":textures/armor/MarkVGreen1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarkVLegsGreen) {
			return Halocraft.MODID+":textures/armor/MarkVGreen2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.MarkVHelmetBlue || itemstack.getItem() == HalocraftItemsArmor.MarkVBodyBlue || itemstack.getItem() == HalocraftItemsArmor.MarkVBootsBlue) {
			return Halocraft.MODID+":textures/armor/MarkVBlue1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarkVLegsBlue) {
			return Halocraft.MODID+":textures/armor/MarkVBlue2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.MarkVHelmetRed || itemstack.getItem() == HalocraftItemsArmor.MarkVBodyRed || itemstack.getItem() == HalocraftItemsArmor.MarkVBootsRed) {
			return Halocraft.MODID+":textures/armor/MarkVRed1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarkVLegsRed) {
			return Halocraft.MODID+":textures/armor/MarkVRed2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.ODSTHelmet || itemstack.getItem() == HalocraftItemsArmor.ODSTBody || itemstack.getItem() == HalocraftItemsArmor.ODSTBoots) {
			return Halocraft.MODID+":textures/armor/ODST1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.ODSTLegs) {
			return Halocraft.MODID+":textures/armor/ODST2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.MarineHelmet || itemstack.getItem() == HalocraftItemsArmor.MarineBody || itemstack.getItem() == HalocraftItemsArmor.MarineBoots) {
			return Halocraft.MODID+":textures/armor/Marine1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarineLegs) {
			return Halocraft.MODID+":textures/armor/Marine2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.MarkVIHelmetGreen || itemstack.getItem() == HalocraftItemsArmor.MarkVIBodyGreen || itemstack.getItem() == HalocraftItemsArmor.MarkVIBootsGreen) {
			return Halocraft.MODID+":textures/armor/MarkVIGreen1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.MarkVILegsGreen) {
			return Halocraft.MODID+":textures/armor/MarkVIGreen2.png";
		}

		if (itemstack.getItem() == HalocraftItemsArmor.ReconHelmet || itemstack.getItem() == HalocraftItemsArmor.ReconBody || itemstack.getItem() == HalocraftItemsArmor.ReconBoots) {
			return Halocraft.MODID+":textures/armor/Recon1.png";
		}
		if (itemstack.getItem() == HalocraftItemsArmor.ReconLegs) {
			return Halocraft.MODID+":textures/armor/Recon2.png";
		}

		return Halocraft.MODID+":textures/armor/MarkVGreen1.png";
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