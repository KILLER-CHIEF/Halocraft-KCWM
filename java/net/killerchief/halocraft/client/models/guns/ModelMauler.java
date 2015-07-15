//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.5
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelMauler extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelMauler()
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyModel[0] = new ModelRendererTurbo(this, 85, 62, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 107, 47, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 97, 100, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 117, 100, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 46, 74, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 42, 96, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 80, 0, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 105, 0, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 150, 116, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 126, 50, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 163, 53, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 72, 100, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 75, 139, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 68, 117, textureX, textureY); // Box 21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -3F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(4F, -4F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[2].setRotationPoint(0F, 0F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F); // Box 2
		bodyModel[3].setRotationPoint(0F, -1F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[4].setRotationPoint(0F, -2F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[5].setRotationPoint(0F, -3F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 5
		bodyModel[6].setRotationPoint(0F, 1F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(0F, -3F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -2F, 2F, -1F, -2F, 2F); // Box 7
		bodyModel[8].setRotationPoint(0F, 1F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[9].setRotationPoint(1F, 7F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0.2F, 1F, -2F, 0.2F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 9
		bodyModel[10].setRotationPoint(1F, 7F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 10
		bodyModel[11].setRotationPoint(1.5F, 1F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 13
		bodyModel[12].setRotationPoint(0F, 0F, 1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 14
		bodyModel[13].setRotationPoint(-2F, 3F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 15
		bodyModel[14].setRotationPoint(0F, 5F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, -6F, -1.5F, 0F, -6F); // Box 16
		bodyModel[15].setRotationPoint(1F, 6F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(0F, -4F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(4F, -3F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(1F, -4F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(1F, -2F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 13, 0F); // Box 21
		bodyModel[20].setRotationPoint(1F, -3F, -3F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}