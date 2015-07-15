//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSMG extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelSMG()
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 97, 23, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 51, 71, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 35
		bodyModel[3] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 47, 101, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 126, 78, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 130, 99, textureX, textureY); // Box 41
		bodyModel[8] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 42
		bodyModel[9] = new ModelRendererTurbo(this, 200, 70, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 185, 94, textureX, textureY); // Box 44
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[12] = new ModelRendererTurbo(this, 99, 93, textureX, textureY); // Box 46
		bodyModel[13] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 47
		bodyModel[14] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 50
		bodyModel[15] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Box 51
		bodyModel[16] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 50, 0, textureX, textureY); // Box 54
		bodyModel[18] = new ModelRendererTurbo(this, 87, 47, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Box 56

		bodyModel[0].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -2F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 1, 22, 0F); // Box 34
		bodyModel[1].setRotationPoint(0F, 1F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[2].setRotationPoint(1F, -2F, 14F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 36
		bodyModel[3].setRotationPoint(1F, -1F, 14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[4].setRotationPoint(1F, 0F, 14F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 38
		bodyModel[5].setRotationPoint(1F, 1F, 13F);
		bodyModel[5].rotateAngleX = -0.34906585F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 39
		bodyModel[6].setRotationPoint(1F, 0F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		bodyModel[7].setRotationPoint(1F, 5F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 42
		bodyModel[8].setRotationPoint(1.5F, -2F, -16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 12, 5, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[9].setRotationPoint(1F, -3F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[10].setRotationPoint(1F, 5F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		bodyModel[11].setRotationPoint(1.5F, 2F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 46
		bodyModel[12].setRotationPoint(1.5F, 4F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[13].setRotationPoint(1F, -4F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[14].setRotationPoint(3F, -4F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[15].setRotationPoint(1F, -4F, 13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 53
		bodyModel[16].setRotationPoint(3F, -4F, 13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[17].setRotationPoint(2.25F, -3.5F, 13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 22, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[18].setRotationPoint(0F, -3F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 56
		bodyModel[19].setRotationPoint(4F, -2F, 5F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}