//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelArmorVisor extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorVisor()
	{
		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 4, 119, textureX, textureY); // Box 31

		headModel[0].addShapeBox(-4.5F, -6.5F, -4.5F, 112, 40, 32, 0F, -0.1F, 0F, -0.1F, -103.1F, 0F, -0.1F, -103.1F, 0F, -28.1F, -0.1F, 0F, -28.1F, -0.1F, -35F, -0.1F, -103.1F, -35F, -0.1F, -103.1F, -35F, -28.1F, -0.1F, -35F, -28.1F); // Box 31
		headModel[0].setRotationPoint(0F, -2F, 0F);

		//flipAll();
	}
	
	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
		if (this.headModel != null)
		{
			for (ModelRendererTurbo part : this.headModel)
			{
				part.rotateAngleX = this.bipedHead.rotateAngleX;
				part.rotateAngleY = this.bipedHead.rotateAngleY;
				part.rotateAngleZ = -this.bipedHead.rotateAngleZ;
				part.rotationPointX = this.bipedHead.rotationPointX;
				part.rotationPointY = this.bipedHead.rotationPointY+5F;//+1
				part.rotationPointZ = -this.bipedHead.rotationPointZ;
			}
		}
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				part.rotateAngleX = this.bipedBody.rotateAngleX;
				part.rotateAngleY = -this.bipedBody.rotateAngleY;
				part.rotateAngleZ = -this.bipedBody.rotateAngleZ;
				part.rotationPointX = this.bipedBody.rotationPointX;
				part.rotationPointY = -this.bipedBody.rotationPointY+2F;
				part.rotationPointZ = -this.bipedBody.rotationPointZ+0.05F;//-0.05
			}
		}
		if (this.leftArmModel != null)
		{
			for (ModelRendererTurbo part : this.leftArmModel)
			{
				part.rotateAngleX = this.bipedLeftArm.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftArm.rotateAngleZ;
				//part.rotationPointX = this.bipedLeftArm.rotationPointX-1F;
				//part.rotationPointY = -this.bipedLeftArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedLeftArm.rotationPointZ;
			}
		}
		if (this.rightArmModel != null)
		{
			for (ModelRendererTurbo part : this.rightArmModel)
			{
				part.rotateAngleX = this.bipedRightArm.rotateAngleX;
				part.rotateAngleY = -this.bipedRightArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightArm.rotateAngleZ;
				//part.rotationPointX = this.bipedRightArm.rotationPointX+1F;
				//part.rotationPointY = -this.bipedRightArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedRightArm.rotationPointZ;
			}
		}
		if (this.leftLegModel != null)
		{
			for (ModelRendererTurbo part : this.leftLegModel)
			{
				part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
				part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.9F;
				part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
			}
		}
		if (this.rightLegModel != null)
		{
			for (ModelRendererTurbo part : this.rightLegModel)
			{
				part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
				part.rotationPointX = this.bipedRightLeg.rotationPointX+1.9F;
				part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
			}
		}
		if (this.leftBootModel != null)
		{
			for (ModelRendererTurbo part : this.leftBootModel)
			{
				part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
				part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.9F;
				part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
			}
		}
		if (this.rightBootModel != null)
		{
			for (ModelRendererTurbo part : this.rightBootModel)
			{
				part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
				part.rotationPointX = this.bipedRightLeg.rotationPointX+1.9F;
				part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
			}
		}
	}
}