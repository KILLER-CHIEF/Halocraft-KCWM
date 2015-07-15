package net.killerchief.halocraft.client.models.grenades;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFirebombGrenade extends ModelBase {

	public ModelRenderer Middle;
	public ModelRenderer BottomMain;
	public ModelRenderer BottomSideX;
	public ModelRenderer BottomSideZ;
	public ModelRenderer TopMain;
	public ModelRenderer TopMiddle;
	public ModelRenderer TopSideX;
	public ModelRenderer TopSideZ;

	public ModelFirebombGrenade()
	{
		textureWidth = 32;
		textureHeight = 32;

		Middle = new ModelRenderer(this, 0, 0);
		Middle.addBox(-1F, -4.5F, -1.033333F, 2, 7, 2);
		Middle.setRotationPoint(0F, -2F, 0F);
		Middle.setTextureSize(32, 32);
		Middle.mirror = true;
		setRotation(Middle, 0F, 0F, 0F);
		BottomMain = new ModelRenderer(this, 0, 10);
		BottomMain.addBox(-1.5F, -1F, -1.5F, 3, 3, 3);
		BottomMain.setRotationPoint(0F, -2F, 0F);
		BottomMain.setTextureSize(32, 32);
		BottomMain.mirror = true;
		setRotation(BottomMain, 0F, 0F, 0F);
		BottomSideX = new ModelRenderer(this, 0, 17);
		BottomSideX.addBox(-2.033333F, -0.5F, -1F, 4, 2, 2);
		BottomSideX.setRotationPoint(0F, -2F, 0F);
		BottomSideX.setTextureSize(32, 32);
		BottomSideX.mirror = true;
		setRotation(BottomSideX, 0F, 0F, 0F);
		BottomSideZ = new ModelRenderer(this, 0, 22);
		BottomSideZ.addBox(-1F, -0.5F, -2F, 2, 2, 4);
		BottomSideZ.setRotationPoint(0F, -2F, 0F);
		BottomSideZ.setTextureSize(32, 32);
		BottomSideZ.mirror = true;
		setRotation(BottomSideZ, 0F, 0F, 0F);
		TopMain = new ModelRenderer(this, 14, 0);
		TopMain.addBox(-1.5F, -5.5F, -1.5F, 3, 2, 3);
		TopMain.setRotationPoint(0F, -2F, 0F);
		TopMain.setTextureSize(32, 32);
		TopMain.mirror = true;
		setRotation(TopMain, 0F, 0F, 0F);
		TopMiddle = new ModelRenderer(this, 14, 6);
		TopMiddle.addBox(-1F, -6F, -1.033333F, 2, 1, 2);
		TopMiddle.setRotationPoint(0F, -2F, 0F);
		TopMiddle.setTextureSize(32, 32);
		TopMiddle.mirror = true;
		setRotation(TopMiddle, 0F, 0F, 0F);
		TopSideX = new ModelRenderer(this, 14, 10);
		TopSideX.addBox(-2.033333F, -5F, -1F, 4, 1, 2);
		TopSideX.setRotationPoint(0F, -2F, 0F);
		TopSideX.setTextureSize(32, 32);
		TopSideX.mirror = true;
		setRotation(TopSideX, 0F, 0F, 0F);
		TopSideZ = new ModelRenderer(this, 14, 14);
		TopSideZ.addBox(-1F, -5F, -2F, 2, 1, 4);
		TopSideZ.setRotationPoint(0F, -2F, 0F);
		TopSideZ.setTextureSize(32, 32);
		TopSideZ.mirror = true;
		setRotation(TopSideZ, 0F, 0F, 0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Middle.render(par7);
		this.BottomMain.render(par7);
		this.BottomSideX.render(par7);
		this.BottomSideZ.render(par7);
		this.TopMain.render(par7);
		this.TopMiddle.render(par7);
		this.TopSideX.render(par7);
		this.TopSideZ.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	}
}