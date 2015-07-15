//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelDMR extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelDMR()
	{
		bodyModel = new ModelRendererTurbo[18];
		bodyModel[0] = new ModelRendererTurbo(this, 86, 53, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 177, 90, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 84, 103, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 112, 31, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 80, 59, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 80, 59, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 38, 76, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 39, 76, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 90, 14, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 90, 14, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 79, 40, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 90, 14, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 93, 29, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 83, 63, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 142, 128, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 111, 128, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 128, 137, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 149, 79, textureX, textureY); // Box 17

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 38, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -2F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F); // Box 0
		bodyModel[1].setRotationPoint(0F, 2F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, -8F); // Box 1
		bodyModel[2].setRotationPoint(0F, 2F, 5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(1F, -3F, 2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[4].setRotationPoint(2F, -2F, 16F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(2F, -1F, 16F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(2F, 1.5F, 16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(2F, 0.5F, 16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(1.5F, -8F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(1.5F, -6F, -1F);

		bodyModel[10].addBox(0F, -1F, 0F, 4, 2, 5, 0F); // Box 10
		bodyModel[10].setRotationPoint(1F, -3F, 1F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 11
		bodyModel[11].setRotationPoint(1.5F, -7F, -1F);

		bodyModel[12].addBox(0F, -1F, 0F, 3, 4, 4, 0F); // Box 12
		bodyModel[12].setRotationPoint(1.5F, -7F, 1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(2.5F, -6F, 16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 14
		bodyModel[14].setRotationPoint(0F, 2F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 15
		bodyModel[15].setRotationPoint(0F, 2F, 4F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 16
		bodyModel[16].setRotationPoint(2F, 9F, -2F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 17
		bodyModel[17].setRotationPoint(-1F, -3F, -4F);
		bodyModel[17].rotateAngleZ = -0.45378561F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}