//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelBattleRifle extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelBattleRifle()
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyModel[0] = new ModelRendererTurbo(this, 131, 32, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 199, 88, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 203, 39, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 175, 100, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 184, 122, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 151, 54, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 85, 0, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 165, 0, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 85, 0, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 105, 0, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 122, 33, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 147, 33, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 131, 52, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 44, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -2F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 0
		bodyModel[1].setRotationPoint(0F, 2F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(1F, -3F, -21F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 8, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(0.5F, 1F, -2F);
		bodyModel[3].rotateAngleX = -0.31415927F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, -2F, -2F, 2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 3
		bodyModel[4].setRotationPoint(0F, 2F, 5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(1F, -6F, 19F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 6
		bodyModel[6].setRotationPoint(2F, -6F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(1F, -6F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		bodyModel[8].setRotationPoint(2F, -2F, 20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(2F, -1F, 20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(2F, -1.5F, 18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(2F, 1F, 21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(2F, 1.5F, 21F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[13].setRotationPoint(2F, 0.5F, 21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[14].setRotationPoint(2F, -9F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 17
		bodyModel[15].setRotationPoint(2F, -8.5F, 2F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 18
		bodyModel[16].setRotationPoint(2F, -9F, 4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(2F, -8F, 2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-0.5F, -2F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 24
		bodyModel[19].setRotationPoint(-0.5F, -1F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(0F, -1.8F, -1.25F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}