package net.killerchief.halocraft.client.models.grenades;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelPlasmaGrenade extends ModelBase {

	public ModelRenderer Main;
	public ModelRenderer SideX;
	public ModelRenderer SideY;
	public ModelRenderer SideZ;

	public ModelPlasmaGrenade()
	{
		textureWidth = 32;
		textureHeight = 32;

		Main = new ModelRenderer(this, 0, 0);
		Main.addBox(-2F, -2F, -2F, 4, 4, 4);
		Main.setRotationPoint(0F, -2F, 0F);
		Main.mirror = false;
		SideX = new ModelRenderer(this, 0, 8);
		SideX.addBox(-2.5F, -1.5F, -1.5F, 5, 3, 3);
		SideX.setRotationPoint(0F, -2F, 0F);
		SideX.mirror = false;
		SideY = new ModelRenderer(this, 0, 14);
		SideY.addBox(-1.5F, -2.5F, -1.5F, 3, 5, 3);
		SideY.setRotationPoint(0F, -2F, 0F);
		SideY.mirror = false;
		SideZ = new ModelRenderer(this, 0, 22);
		SideZ.addBox(-1.5F, -1.5F, -2.5F, 3, 3, 5);
		SideZ.setRotationPoint(0F, -2F, 0F);
		SideZ.mirror = false;
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Main.render(par7);
		this.SideX.render(par7);
		this.SideY.render(par7);
		this.SideZ.render(par7);
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