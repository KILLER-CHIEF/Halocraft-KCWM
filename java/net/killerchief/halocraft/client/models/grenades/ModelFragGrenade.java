package net.killerchief.halocraft.client.models.grenades;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFragGrenade extends ModelBase {

	public ModelRenderer Main;
	public ModelRenderer SideX;
	public ModelRenderer SideY;
	public ModelRenderer SideZ;
	public ModelRenderer Top;
	public ModelRenderer TopPin;

	public ModelFragGrenade()
	{
		textureWidth = 32;
		textureHeight = 32;

		Main = new ModelRenderer(this, 0, 0);
		Main.addBox(-1.5F, -2F, -1.5F, 3, 4, 3);
		Main.setRotationPoint(0F, -2F, 0F);
		Main.setTextureSize(32, 32);
		Main.mirror = true;
		setRotation(Main, 0F, 0F, 0F);
		SideX = new ModelRenderer(this, 0, 8);
		SideX.addBox(-2.033333F, -1.5F, -1F, 4, 3, 2);
		SideX.setRotationPoint(0F, -2F, 0F);
		SideX.setTextureSize(32, 32);
		SideX.mirror = true;
		setRotation(SideX, 0F, 0F, 0F);
		SideY = new ModelRenderer(this, 0, 14);
		SideY.addBox(-1F, 1.5F, -1.033333F, 2, 1, 2);
		SideY.setRotationPoint(0F, -2F, 0F);
		SideY.setTextureSize(32, 32);
		SideY.mirror = true;
		setRotation(SideY, 0F, 0F, 0F);
		SideZ = new ModelRenderer(this, 0, 18);
		SideZ.addBox(-1F, -1.5F, -2F, 2, 3, 4);
		SideZ.setRotationPoint(0F, -2F, 0F);
		SideZ.setTextureSize(32, 32);
		SideZ.mirror = true;
		setRotation(SideZ, 0F, 0F, 0F);
		Top = new ModelRenderer(this, 13, 0);
		Top.addBox(-1F, -2.8F, -1F, 2, 2, 2);
		Top.setRotationPoint(0F, -3F, 0F);
		Top.setTextureSize(32, 32);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		TopPin = new ModelRenderer(this, 13, 5);
		TopPin.addBox(-1.5F, -3.5F, -0.5F, 1, 1, 1);
		TopPin.setRotationPoint(0F, -2F, 0F);
		TopPin.setTextureSize(32, 32);
		TopPin.mirror = true;
		setRotation(TopPin, 0F, 0F, 0F);
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
		 this.SideX.render(par7);
		 this.SideY.render(par7);
		 this.SideZ.render(par7);
		 this.Top.render(par7);
		 this.TopPin.render(par7);
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