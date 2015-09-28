package net.killerchief.halocraft.client.models;

import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class Model3DArmor extends ModelBiped
{
	//int textureX = 128;
	//int textureY = 128;

	public ModelRendererTurbo[] headModel;
	public ModelRendererTurbo[] bodyModel;
	public ModelRendererTurbo[] leftArmModel;
	public ModelRendererTurbo[] rightArmModel;
	public ModelRendererTurbo[] leftLegModel;
	public ModelRendererTurbo[] rightLegModel;
	public ModelRendererTurbo[] leftBootModel;
	public ModelRendererTurbo[] rightBootModel;

	public void flipAll()
	{
		flip(this.headModel);
		flip(this.bodyModel);
		flip(this.leftArmModel);
		flip(this.rightArmModel);
		flip(this.leftLegModel);
		flip(this.rightLegModel);
		flip(this.leftBootModel);
		flip(this.rightBootModel);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity tileentity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, tileentity);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 1, 0, 0);
		GL11.glTranslated(0.0F, -0.1F, 0F);
		if (this.headModel != null)
		{
			for (ModelRendererTurbo part : this.headModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftArmModel != null)
		{
			for (ModelRendererTurbo part : this.leftArmModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightArmModel != null)
		{
			for (ModelRendererTurbo part : this.rightArmModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftLegModel != null)
		{
			for (ModelRendererTurbo part : this.leftLegModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightLegModel != null)
		{
			for (ModelRendererTurbo part : this.rightLegModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftBootModel != null)
		{
			for (ModelRendererTurbo part : this.leftBootModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightBootModel != null)
		{
			for (ModelRendererTurbo part : this.rightBootModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		GL11.glPopMatrix();
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
		for (ModelRendererTurbo part : this.headModel)
		{
			part.rotateAngleX = this.bipedHead.rotateAngleX;
			part.rotateAngleY = -this.bipedHead.rotateAngleY;
			part.rotateAngleZ = -this.bipedHead.rotateAngleZ;
			part.rotationPointX = this.bipedHead.rotationPointX;
			part.rotationPointY = -this.bipedHead.rotationPointY+2F;
			part.rotationPointZ = -this.bipedHead.rotationPointZ;
		}
		for (ModelRendererTurbo part : this.bodyModel)
		{
			part.rotateAngleX = this.bipedBody.rotateAngleX;
			part.rotateAngleY = -this.bipedBody.rotateAngleY;
			part.rotateAngleZ = -this.bipedBody.rotateAngleZ;
		}
		for (ModelRendererTurbo part : this.leftArmModel)
		{
			part.rotateAngleX = this.bipedLeftArm.rotateAngleX;
			part.rotateAngleY = -this.bipedLeftArm.rotateAngleY;
			part.rotateAngleZ = -this.bipedLeftArm.rotateAngleZ;
		}
		for (ModelRendererTurbo part : this.rightArmModel)
		{
			part.rotateAngleX = this.bipedRightArm.rotateAngleX;
			part.rotateAngleY = -this.bipedRightArm.rotateAngleY;
			part.rotateAngleZ = -this.bipedRightArm.rotateAngleZ;
		}
		for (ModelRendererTurbo part : this.leftLegModel)
		{
			part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
			part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
			part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
			part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.8F;
			part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
			part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
		}
		for (ModelRendererTurbo part : this.rightLegModel)
		{
			part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
			part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
			part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
			part.rotationPointX = this.bipedRightLeg.rotationPointX+1.8F;
			part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
			part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
		}
		for (ModelRendererTurbo part : this.leftBootModel)
		{
			part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
			part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
			part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
			part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.8F;
			part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
			part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
		}
		for (ModelRendererTurbo part : this.rightBootModel)
		{
			part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
			part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
			part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
			part.rotationPointX = this.bipedRightLeg.rotationPointX+1.8F;
			part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
			part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
		}
	}

	protected void flip(ModelRendererTurbo[] model)
	{
		if (model != null)
		{
			for (ModelRendererTurbo part : model)
			{
				if (part != null)
				{
					part.doMirror(false, true, true);
					part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
				}
			}
		}
	}
}