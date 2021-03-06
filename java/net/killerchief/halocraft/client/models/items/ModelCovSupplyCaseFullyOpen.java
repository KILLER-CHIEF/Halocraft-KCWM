//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelCovSupplyCaseFullyOpen extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelCovSupplyCaseFullyOpen()
	{
		bodyModel = new ModelRendererTurbo[31];
		bodyModel[0] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 90, 7, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 90, 7, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 102, 32, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 89, 32, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 102, 32, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 89, 32, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 100, 218, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 100, 192, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 100, 192, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 100, 218, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 100, 85, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 100, 85, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 100, 84, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 100, 85, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 78, 103, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 100, 164, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 113, 107, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 113, 107, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 97, 135, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 97, 135, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 97, 135, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 97, 135, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 150, 134, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 150, 134, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 150, 134, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 150, 134, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-9F, 1F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 1F, 7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-7F, -18F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-7F, -18F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[4].setRotationPoint(-7F, -21F, 9F);
		bodyModel[4].rotateAngleX = -0.52359878F;
		bodyModel[4].rotateAngleY = 0.34906585F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(6F, -18F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F); // Box 14
		bodyModel[6].setRotationPoint(6F, -18F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 15
		bodyModel[7].setRotationPoint(8F, 1F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18
		bodyModel[8].setRotationPoint(8F, 1F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 19
		bodyModel[9].setRotationPoint(-8F, 1F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 20
		bodyModel[10].setRotationPoint(-6F, -18F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(-6F, -18F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(-8F, 1F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[13].setRotationPoint(-6F, -18F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-6F, -18F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(0F, -18F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(0F, -18F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-8F, -19.5F, -11F);
		bodyModel[17].rotateAngleX = 0.52359878F;
		bodyModel[17].rotateAngleY = -0.34906585F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(7F, -19.5F, -12F);
		bodyModel[18].rotateAngleX = 0.52359878F;
		bodyModel[18].rotateAngleY = 0.34906585F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(6F, -21F, 9F);
		bodyModel[19].rotateAngleX = -0.52359878F;
		bodyModel[19].rotateAngleY = -0.34906585F;

		bodyModel[20].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 30
		bodyModel[20].setRotationPoint(-8F, 14F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 31, 16, 0F); // Box 31
		bodyModel[21].setRotationPoint(-3F, -17F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 31, 16, 0F); // Box 32
		bodyModel[22].setRotationPoint(2F, -17F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(-8F, -17F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-8F, 1F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 35
		bodyModel[25].setRotationPoint(-8F, 1F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(-8F, -17F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(3F, -17F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(3F, 1F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(3F, -17F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(3F, 1F, -7F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}