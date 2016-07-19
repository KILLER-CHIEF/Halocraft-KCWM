//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelCovSupplyCaseClosed extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelCovSupplyCaseClosed()
	{
		bodyModel = new ModelRendererTurbo[60];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 66
		bodyModel[59] = new ModelRendererTurbo(this, 87, 127, textureX, textureY); // Box 67

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-9F, 1F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 1F, 7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-7F, -18F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-7F, -18F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(-8F, 1F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-8F, 1F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-6F, -18F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-6F, -18F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(6F, -18F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(5F, -18F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(5F, -18F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F); // Box 14
		bodyModel[11].setRotationPoint(6F, -18F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 15
		bodyModel[12].setRotationPoint(8F, 1F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(7F, 1F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[14].setRotationPoint(7F, 1F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18
		bodyModel[15].setRotationPoint(8F, 1F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-6F, -18F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-8F, 1F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-6F, -18F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-6F, -18F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(0F, -18F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(0F, -18F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, -3F, 0F, -3F, 2F, 0F, -4F, 1F, -1F, 3F, -2F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(5F, -21F, 6F);

		bodyModel[23].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 30
		bodyModel[23].setRotationPoint(-8F, 14F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 31, 16, 0F); // Box 31
		bodyModel[24].setRotationPoint(-3F, -17F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 31, 16, 0F); // Box 32
		bodyModel[25].setRotationPoint(2F, -17F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[26].setRotationPoint(-8F, -17F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-8F, 1F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 35
		bodyModel[28].setRotationPoint(-8F, 1F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(-8F, -17F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(3F, -17F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(3F, 1F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(3F, -17F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(3F, 1F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, -2F, -1F, 3F, 1F, -1F, 3F, 2F, 0F, -4F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 39
		bodyModel[34].setRotationPoint(5F, -21F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 2F, 0F, -4F, -3F, 0F, -3F, -2F, -1F, 3F, 1F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-7F, -21F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 1F, -1F, 3F, -2F, -1F, 3F, -3F, 0F, -3F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-7F, -21F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 42
		bodyModel[37].setRotationPoint(3F, -1F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 45
		bodyModel[38].setRotationPoint(3F, -1F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
		bodyModel[39].setRotationPoint(3F, 2F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[40].setRotationPoint(3F, 2F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 48
		bodyModel[41].setRotationPoint(-4F, 2F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 49
		bodyModel[42].setRotationPoint(-4F, -1F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		bodyModel[43].setRotationPoint(-4F, 2F, 2F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 51
		bodyModel[44].setRotationPoint(-4F, -1F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 52
		bodyModel[45].setRotationPoint(-2F, 1F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[46].setRotationPoint(2F, 1F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(2F, -18F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(-2F, -18F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 56
		bodyModel[49].setRotationPoint(-2F, 1F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 2F); // Box 57
		bodyModel[50].setRotationPoint(-8F, 1F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 3F); // Box 58
		bodyModel[51].setRotationPoint(2F, 1F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F); // Box 59
		bodyModel[52].setRotationPoint(2F, -18F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 60
		bodyModel[53].setRotationPoint(-2F, -18F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F); // Box 61
		bodyModel[54].setRotationPoint(-6F, -18F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[55].setRotationPoint(4F, -18.5F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[56].setRotationPoint(4F, -18.5F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[57].setRotationPoint(-7F, -18.5F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[58].setRotationPoint(-7F, -18.5F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 64, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, -15F, 0F, -60F, -15F); // Box 67
		bodyModel[59].setRotationPoint(7F, -13F, -4F);
		bodyModel[59].rotateAngleY = -0.17453293F;
		bodyModel[59].rotateAngleZ = 0.10471976F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}