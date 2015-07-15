//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelShotgun extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelShotgun()
	{
		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 90, 125, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 34, 85, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 179, 107, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 179, 107, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 179, 107, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 191, 185, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 181, 184, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 78, 77, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 48, 129, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 50, 142, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 94, 60, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 66, 55, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 99, 171, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 87, 203, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 92, 45, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 92, 45, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 82, 40, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 168, 173, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 168, 163, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 90, 0, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 106, 3, textureX, textureY); // Box 32

		bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 29, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -2F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, -4.5F, 14F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 2, 20, 0F); // Box 4
		bodyModel[2].setRotationPoint(0F, -3.5F, 14F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 15, 0F); // Box 6
		bodyModel[3].setRotationPoint(1F, 0F, 24F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(1F, 1F, 24F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(1F, -1F, 24F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(1F, 4F, 24F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 10
		bodyModel[7].setRotationPoint(1F, 3F, 24F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(1F, 2F, 24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 15, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-1F, 0F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 3, 15, 0F); // Box 13
		bodyModel[10].setRotationPoint(-1F, 1F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(-1F, 4F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-1F, 1F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 36, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(0F, -4F, -22F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 18
		bodyModel[14].setRotationPoint(0F, 3F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 19
		bodyModel[15].setRotationPoint(0F, 4F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 20
		bodyModel[16].setRotationPoint(2F, -5F, 32F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 21
		bodyModel[17].setRotationPoint(2F, -5F, 14F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 3, 17, 0F); // Box 22
		bodyModel[18].setRotationPoint(0F, -2F, -22F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 23
		bodyModel[19].setRotationPoint(0F, 1F, -22F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(1F, -6F, 14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(3F, -6F, 14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(2F, -6F, 34F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-1F, 4F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(-1F, 0F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 31
		bodyModel[25].setRotationPoint(2F, 5F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 32
		bodyModel[26].setRotationPoint(2F, 3F, 3F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}