package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGunHolderMount extends ModelBase {

	private ModelRenderer Shape1;
	private ModelRenderer Shape2;
	private ModelRenderer Shape3;
	private ModelRenderer Shape4;
	private ModelRenderer Shape5;
	private ModelRenderer Shape6;

	public ModelGunHolderMount(){
		textureWidth = 64;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(2F, 0F, 0F, 12, 2, 16);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(textureWidth, textureHeight);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 18);
		Shape2.addBox(4F, 2F, 0F, 2, 1, 16);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(textureWidth, textureHeight);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 18);
		Shape3.addBox(10F, 2F, 0F, 2, 1, 16);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(textureWidth, textureHeight);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 18);
		Shape4.addBox(6F, 1.5F, 1F, 4, 1, 2);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(textureWidth, textureHeight);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 18);
		Shape5.addBox(6F, 1.5F, 13F, 4, 1, 2);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(textureWidth, textureHeight);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 18);
		Shape6.addBox(6F, 1.5F, 7F, 4, 1, 2);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(textureWidth, textureHeight);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(TileEntityGunHolder tileentitycbe, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.Shape1.render(par7);
		this.Shape2.render(par7);
		this.Shape3.render(par7);
		this.Shape4.render(par7);
		this.Shape5.render(par7);
		this.Shape6.render(par7);
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