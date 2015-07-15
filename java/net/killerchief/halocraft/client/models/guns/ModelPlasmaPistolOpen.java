//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelPlasmaPistolOpen extends Model3DBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelPlasmaPistolOpen()
	{
		bodyModel = new ModelRendererTurbo[17];
		bodyModel[0] = new ModelRendererTurbo(this, 68, 4, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 59, 68, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 84, 6, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 18, 11, textureX, textureY); // Box 18
		bodyModel[4] = new ModelRendererTurbo(this, 23, 59, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 89, 24, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 89, 42, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 44, 20, textureX, textureY); // Box 22
		bodyModel[8] = new ModelRendererTurbo(this, 44, 42, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 23, 42, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 23, 42, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 53, 85, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 49, 85, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 49, 85, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 37, 5, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 65, 27, textureX, textureY); // Box 19

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(1F, -5F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(1F, 8F, 2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[2].setRotationPoint(1F, -5F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		bodyModel[3].setRotationPoint(1F, -5F, 12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F); // Box 19
		bodyModel[4].setRotationPoint(1F, 8F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 20
		bodyModel[5].setRotationPoint(1F, -1F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 3F, -2F, -1F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[6].setRotationPoint(1F, 4F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 6, 6, 0F); // Box 22
		bodyModel[7].setRotationPoint(2F, -1F, 3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 23
		bodyModel[8].setRotationPoint(2F, 5F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[9].setRotationPoint(2.5F, -5F, 13.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[10].setRotationPoint(2.5F, 3F, 13.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 11
		bodyModel[11].setRotationPoint(2F, -5F, 1F);
		bodyModel[11].rotateAngleX = 0.6981317F;

		bodyModel[12].addShapeBox(0F, 1F, 6F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(2F, -5F, 1F);
		bodyModel[12].rotateAngleX = 0.6981317F;

		bodyModel[13].addShapeBox(0F, 1F, 6F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(5F, -5F, 1F);
		bodyModel[13].rotateAngleX = 0.6981317F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(1F, -5F, 11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(1F, -4F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(2.5F, -5F, 2F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}