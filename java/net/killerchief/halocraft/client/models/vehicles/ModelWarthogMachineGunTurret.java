//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.vehicles;

import org.lwjgl.opengl.GL11;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWarthogMachineGunTurret extends Model3DBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelWarthogMachineGunTurret()
	{
		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 86, 55, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 86, 55, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 41

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 7
		bodyModel[0].setRotationPoint(-2F, -13F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(-2F, -14F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[2].setRotationPoint(-2F, -11F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[3].setRotationPoint(2F, -13F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(2F, -11F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		bodyModel[5].setRotationPoint(2F, -17F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[6].setRotationPoint(-7F, -17F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(-7F, -13F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-7F, -11F, -18F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 21, 0F); // Box 19
		bodyModel[9].setRotationPoint(-0.5F, -13.5F, -39F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 21, 0F); // Box 20
		bodyModel[10].setRotationPoint(-1.5F, -12F, -39F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 21, 0F); // Box 21
		bodyModel[11].setRotationPoint(0.5F, -12F, -39F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(-1F, -10F, -16F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[13].setRotationPoint(-2F, -14F, -38F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(-2F, -14F, -27F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 27
		bodyModel[15].setRotationPoint(2F, -13F, -15F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 28
		bodyModel[16].setRotationPoint(-3F, -13F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 29
		bodyModel[17].setRotationPoint(2F, -15F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[18].setRotationPoint(2F, -11F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		bodyModel[19].setRotationPoint(-3F, -15F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(-3F, -11F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		bodyModel[21].setRotationPoint(2F, -9F, -14F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 35
		bodyModel[22].setRotationPoint(2F, -11F, -14F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[23].setRotationPoint(2F, -11F, -15F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[24].setRotationPoint(-3F, -11F, -15F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 40
		bodyModel[25].setRotationPoint(-3F, -11F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 41
		bodyModel[26].setRotationPoint(-3F, -9F, -14F);


		bodyDoorOpenModel = new ModelRendererTurbo[14];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 1
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 45, 70, textureX, textureY); // Box 3
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 4
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 5
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 22, 37, textureX, textureY); // Box 6
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 42
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 43
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 44
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 45
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 46
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 47
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Box 48
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Box 52
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Box 53

		bodyDoorOpenModel[0].addBox(-6F, 0F, -6F, 16, 1, 6, 0F); // Box 1
		bodyDoorOpenModel[0].setRotationPoint(-2F, 10F, 0F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 9F); // Box 3
		bodyDoorOpenModel[1].setRotationPoint(-1.5F, -6F, -16F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyDoorOpenModel[2].setRotationPoint(-2F, -9F, -16F);

		bodyDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyDoorOpenModel[3].setRotationPoint(-2F, -5F, -16F);

		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 6
		bodyDoorOpenModel[4].setRotationPoint(-2F, -8F, -16F);

		bodyDoorOpenModel[5].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 42
		bodyDoorOpenModel[5].setRotationPoint(9F, 10F, 6F);

		bodyDoorOpenModel[6].addBox(-6F, 0F, -6F, 6, 1, 5, 0F); // Box 43
		bodyDoorOpenModel[6].setRotationPoint(3F, 10F, 6F);

		bodyDoorOpenModel[7].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 44
		bodyDoorOpenModel[7].setRotationPoint(-2F, 10F, 6F);

		bodyDoorOpenModel[8].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyDoorOpenModel[8].setRotationPoint(-2F, 10F, -5F);

		bodyDoorOpenModel[9].addBox(-6F, 0F, -6F, 6, 1, 5, 0F); // Box 46
		bodyDoorOpenModel[9].setRotationPoint(3F, 10F, -5F);

		bodyDoorOpenModel[10].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyDoorOpenModel[10].setRotationPoint(9F, 10F, -5F);

		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyDoorOpenModel[11].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[11].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[12].addBox(0F, 0F, 1F, 4, 9, 1, 0F); // Box 52
		bodyDoorOpenModel[12].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[12].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[13].addShapeBox(0F, 0F, 2F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyDoorOpenModel[13].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[13].rotateAngleX = 0.54105207F;

		this.flip(this.bodyModel);
		this.flip(this.bodyDoorOpenModel);

		//translateAll(0F, 0F, 0F);
		//flipAll();
	}
	
	@Override
	protected void renderAllParts(Entity entity, float par7)
	{
		/*if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				if (part != null)
				{
					part.rotateAngleY = ((EntityWarthog)entity).getWheelTurnAngle();
				}
			}
		}
		if (this.bodyDoorOpenModel != null)
		{
			for (ModelRendererTurbo part : this.bodyDoorOpenModel)
			{
				if (part != null)
				{
					part.rotateAngleY = ((EntityWarthog)entity).getWheelTurnAngle();
				}
			}
		}*/
		//this.renderAllParts(par7);
	}
	
	public void renderSomeParts(boolean isturret, float par7)
	{
		if (isturret)
		{
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
		}
		else
		{
			if (this.bodyDoorOpenModel != null)
			{
				for (ModelRendererTurbo part : this.bodyDoorOpenModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
	}
}