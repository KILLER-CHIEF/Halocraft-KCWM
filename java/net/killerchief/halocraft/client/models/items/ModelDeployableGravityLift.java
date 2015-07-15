package net.killerchief.halocraft.client.models.items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelDeployableGravityLift extends ModelBase {

	public ModelRenderer Main;
	public ModelRenderer Main2;
	public ModelRenderer Main3;
	public ModelRenderer FrontTop;
	public ModelRenderer FrontBottom;
	public ModelRenderer FrontBottomLeg;
	public ModelRenderer BackLeftTop;
	public ModelRenderer BackLeftBottom;
	public ModelRenderer BackLeftBottomLeg;
	public ModelRenderer BackRightTop;
	public ModelRenderer BackRightBottom;
	public ModelRenderer BackRightBottomLeg;

	public ModelDeployableGravityLift()
	{
		textureWidth = 64;
		textureHeight = 64;

		Main = new ModelRenderer(this, 0, 0);
		Main.addBox(-1.5F, -1F, -1.5F, 3, 3, 3);
		Main.setRotationPoint(0F, 0F, 0F);
		Main.setTextureSize(64, 64);
		Main.mirror = true;
		setRotation(Main, 0F, 0F, 0F);
		Main2 = new ModelRenderer(this, 0, 0);
		Main2.addBox(-1.5F, -1F, -1.5F, 3, 3, 3);
		Main2.setRotationPoint(0F, 0F, 0F);
		Main2.setTextureSize(64, 64);
		Main2.mirror = true;
		setRotation(Main2, 0F, 0.5235988F, 0F);
		Main3 = new ModelRenderer(this, 0, 0);
		Main3.addBox(-1.5F, -1F, -1.5F, 3, 3, 3);
		Main3.setRotationPoint(0F, 0F, 0F);
		Main3.setTextureSize(64, 64);
		Main3.mirror = true;
		setRotation(Main3, 0F, 1.047198F, 0F);
		FrontTop = new ModelRenderer(this, 0, 0);
		FrontTop.addBox(-1.5F, 0F, 0F, 3, 1, 4);
		FrontTop.setRotationPoint(0F, 0F, 0F);
		FrontTop.setTextureSize(64, 64);
		FrontTop.mirror = true;
		setRotation(FrontTop, 0.2617994F, 0F, 0F);
		FrontBottom = new ModelRenderer(this, 0, 0);
		FrontBottom.addBox(-1.5F, 0F, 0F, 3, 1, 5);
		FrontBottom.setRotationPoint(0F, 1F, 0F);
		FrontBottom.setTextureSize(64, 64);
		FrontBottom.mirror = true;
		setRotation(FrontBottom, 0F, 0F, 0F);
		FrontBottomLeg = new ModelRenderer(this, 0, 0);
		FrontBottomLeg.addBox(-0.5F, 0F, 5F, 1, 1, 5);
		FrontBottomLeg.setRotationPoint(0F, 1F, 0F);
		FrontBottomLeg.setTextureSize(64, 64);
		FrontBottomLeg.mirror = true;
		setRotation(FrontBottomLeg, 0F, 0F, 0F);
		BackLeftTop = new ModelRenderer(this, 0, 0);
		BackLeftTop.addBox(-1.5F, 0F, -4F, 3, 1, 4);
		BackLeftTop.setRotationPoint(0F, 0F, 0F);
		BackLeftTop.setTextureSize(64, 64);
		BackLeftTop.mirror = true;
		setRotation(BackLeftTop, -0.2617994F, -1.047198F, 0F);
		BackLeftBottom = new ModelRenderer(this, 0, 0);
		BackLeftBottom.addBox(-1.5F, 0F, -5F, 3, 1, 5);
		BackLeftBottom.setRotationPoint(0F, 1F, 0F);
		BackLeftBottom.setTextureSize(64, 64);
		BackLeftBottom.mirror = true;
		setRotation(BackLeftBottom, 0F, -1.047198F, 0F);
		BackLeftBottomLeg = new ModelRenderer(this, 0, 0);
		BackLeftBottomLeg.addBox(-0.5F, 0F, -10F, 1, 1, 5);
		BackLeftBottomLeg.setRotationPoint(0F, 1F, 0F);
		BackLeftBottomLeg.setTextureSize(64, 64);
		BackLeftBottomLeg.mirror = true;
		setRotation(BackLeftBottomLeg, 0F, -1.047198F, 0F);
		BackRightTop = new ModelRenderer(this, 0, 0);
		BackRightTop.addBox(-1.5F, 0F, -4F, 3, 1, 3);
		BackRightTop.setRotationPoint(0F, 0F, 0F);
		BackRightTop.setTextureSize(64, 64);
		BackRightTop.mirror = true;
		setRotation(BackRightTop, -0.2617994F, 1.047198F, 0F);
		BackRightBottom = new ModelRenderer(this, 0, 0);
		BackRightBottom.addBox(-1.5F, 0F, -5F, 3, 1, 5);
		BackRightBottom.setRotationPoint(0F, 1F, 0F);
		BackRightBottom.setTextureSize(64, 64);
		BackRightBottom.mirror = true;
		setRotation(BackRightBottom, 0F, 1.047198F, 0F);
		BackRightBottomLeg = new ModelRenderer(this, 0, 0);
		BackRightBottomLeg.addBox(-0.5F, 0F, -10F, 1, 1, 5);
		BackRightBottomLeg.setRotationPoint(0F, 1F, 0F);
		BackRightBottomLeg.setTextureSize(64, 64);
		BackRightBottomLeg.mirror = true;
		setRotation(BackRightBottomLeg, 0F, 1.047198F, 0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Main.render(par7);
		this.Main2.render(par7);
		this.Main3.render(par7);
		this.FrontTop.render(par7);
		this.FrontBottom.render(par7);
		this.FrontBottomLeg.render(par7);
		this.BackLeftTop.render(par7);
		this.BackLeftBottom.render(par7);
		this.BackLeftBottomLeg.render(par7);
		this.BackRightTop.render(par7);
		this.BackRightBottom.render(par7);
		this.BackRightBottomLeg.render(par7);
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