package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelHealthPack extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;

	public ModelHealthPack(){
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-6F, 0F, -3F, 12, 2, 6);
		Shape1.setRotationPoint(8F, 0F, 8F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 8);
		Shape2.addBox(-2.5F, 0F, -5F, 5, 2, 10);
		Shape2.setRotationPoint(8F, 0F, 8F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 20);
		Shape3.addBox(-1.5F, 0F, -1F, 4, 2, 2);
		Shape3.setRotationPoint(3.8F, 0F, 10.9F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, -0.5235988F, 0F);
		Shape4 = new ModelRenderer(this, 0, 24);
		Shape4.addBox(-1.5F, 0F, -1F, 4, 2, 2);
		Shape4.setRotationPoint(3.8F, 0F, 5.1F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0.5235988F, 0F);
		Shape5 = new ModelRenderer(this, 12, 20);
		Shape5.addBox(-2.5F, 0F, -1F, 4, 2, 2);
		Shape5.setRotationPoint(12.2F, 0F, 5.1F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, -0.5235988F, 0F);
		Shape6 = new ModelRenderer(this, 12, 24);
		Shape6.addBox(-2.5F, 0F, -1F, 4, 2, 2);
		Shape6.setRotationPoint(12.2F, 0F, 10.9F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0.5235988F, 0F);
		Shape7 = new ModelRenderer(this, 40, 0);
		Shape7.addBox(-2F, 0F, -2F, 4, 1, 4);
		Shape7.setRotationPoint(8F, 2F, 8F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 32, 16);
		Shape8.addBox(-2F, 0F, 0F, 4, 1, 3);
		Shape8.setRotationPoint(8F, 2F, 9.7F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0.3141593F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 32, 12);
		Shape9.addBox(-2F, 0F, -3F, 4, 1, 3);
		Shape9.setRotationPoint(8F, 2F, 6.3F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, -0.3141593F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 32, 20);
		Shape10.addBox(0F, 0F, -2F, 4, 1, 4);
		Shape10.setRotationPoint(9.7F, 2F, 8F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, -0.2443461F);
		Shape11 = new ModelRenderer(this, 32, 25);
		Shape11.addBox(-4F, 0F, -2F, 4, 1, 4);
		Shape11.setRotationPoint(6.3F, 2F, 8F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0.2443461F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(TileEntityHealthPack tileentitycbe, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.Shape1.render(par7);
		this.Shape2.render(par7);
		this.Shape3.render(par7);
		this.Shape4.render(par7);
		this.Shape5.render(par7);
		this.Shape6.render(par7);
		this.Shape7.render(par7);
		this.Shape8.render(par7);
		this.Shape9.render(par7);
		this.Shape10.render(par7);
		this.Shape11.render(par7);
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