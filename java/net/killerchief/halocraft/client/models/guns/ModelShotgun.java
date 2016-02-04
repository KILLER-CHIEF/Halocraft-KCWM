//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelShotgun extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelShotgun()
	{
		gunModel = new ModelRendererTurbo[84];
		gunModel[0] = new ModelRendererTurbo(this, 72, 120, textureX, textureY); // Import Shape1
		gunModel[1] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 31, 94, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 191, 185, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 181, 184, textureX, textureY); // Box 16
		gunModel[9] = new ModelRendererTurbo(this, 58, 13, textureX, textureY); // Box 17
		gunModel[10] = new ModelRendererTurbo(this, 48, 129, textureX, textureY); // Box 18
		gunModel[11] = new ModelRendererTurbo(this, 50, 142, textureX, textureY); // Box 19
		gunModel[12] = new ModelRendererTurbo(this, 94, 60, textureX, textureY); // Box 20
		gunModel[13] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 21
		gunModel[14] = new ModelRendererTurbo(this, 29, 188, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 91, 48, textureX, textureY); // Box 27
		gunModel[16] = new ModelRendererTurbo(this, 168, 173, textureX, textureY); // Box 28
		gunModel[17] = new ModelRendererTurbo(this, 168, 163, textureX, textureY); // Box 29
		gunModel[18] = new ModelRendererTurbo(this, 114, 8, textureX, textureY); // Box 31
		gunModel[19] = new ModelRendererTurbo(this, 106, 3, textureX, textureY); // Box 32
		gunModel[20] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 27
		gunModel[21] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 28
		gunModel[22] = new ModelRendererTurbo(this, 34, 85, textureX, textureY); // Box 29
		gunModel[23] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 30
		gunModel[24] = new ModelRendererTurbo(this, 68, 87, textureX, textureY); // Box 31
		gunModel[25] = new ModelRendererTurbo(this, 90, 36, textureX, textureY); // Box 36
		gunModel[26] = new ModelRendererTurbo(this, 90, 36, textureX, textureY); // Box 37
		gunModel[27] = new ModelRendererTurbo(this, 91, 41, textureX, textureY); // Box 43
		gunModel[28] = new ModelRendererTurbo(this, 94, 76, textureX, textureY); // Box 44
		gunModel[29] = new ModelRendererTurbo(this, 90, 36, textureX, textureY); // Box 45
		gunModel[30] = new ModelRendererTurbo(this, 90, 36, textureX, textureY); // Box 46
		gunModel[31] = new ModelRendererTurbo(this, 91, 41, textureX, textureY); // Box 47
		gunModel[32] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 48
		gunModel[33] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 49
		gunModel[34] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 50
		gunModel[35] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 51
		gunModel[36] = new ModelRendererTurbo(this, 181, 184, textureX, textureY); // Box 52
		gunModel[37] = new ModelRendererTurbo(this, 168, 173, textureX, textureY); // Box 53
		gunModel[38] = new ModelRendererTurbo(this, 157, 95, textureX, textureY); // Box 54
		gunModel[39] = new ModelRendererTurbo(this, 157, 95, textureX, textureY); // Box 55
		gunModel[40] = new ModelRendererTurbo(this, 157, 95, textureX, textureY); // Box 56
		gunModel[41] = new ModelRendererTurbo(this, 147, 86, textureX, textureY); // Box 57
		gunModel[42] = new ModelRendererTurbo(this, 147, 86, textureX, textureY); // Box 58
		gunModel[43] = new ModelRendererTurbo(this, 147, 86, textureX, textureY); // Box 59
		gunModel[44] = new ModelRendererTurbo(this, 143, 95, textureX, textureY); // Box 61
		gunModel[45] = new ModelRendererTurbo(this, 143, 92, textureX, textureY); // Box 62
		gunModel[46] = new ModelRendererTurbo(this, 143, 98, textureX, textureY); // Box 63
		gunModel[47] = new ModelRendererTurbo(this, 158, 84, textureX, textureY); // Box 64
		gunModel[48] = new ModelRendererTurbo(this, 164, 84, textureX, textureY); // Box 65
		gunModel[49] = new ModelRendererTurbo(this, 164, 84, textureX, textureY); // Box 66
		gunModel[50] = new ModelRendererTurbo(this, 164, 84, textureX, textureY); // Box 67
		gunModel[51] = new ModelRendererTurbo(this, 170, 103, textureX, textureY); // Box 68
		gunModel[52] = new ModelRendererTurbo(this, 170, 103, textureX, textureY); // Box 69
		gunModel[53] = new ModelRendererTurbo(this, 170, 103, textureX, textureY); // Box 71
		gunModel[54] = new ModelRendererTurbo(this, 182, 69, textureX, textureY); // Box 72
		gunModel[55] = new ModelRendererTurbo(this, 171, 69, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 193, 70, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 204, 71, textureX, textureY); // Box 77
		gunModel[58] = new ModelRendererTurbo(this, 94, 60, textureX, textureY); // Box 78
		gunModel[59] = new ModelRendererTurbo(this, 94, 60, textureX, textureY); // Box 79
		gunModel[60] = new ModelRendererTurbo(this, 94, 60, textureX, textureY); // Box 80
		gunModel[61] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 81
		gunModel[62] = new ModelRendererTurbo(this, 69, 87, textureX, textureY); // Box 82
		gunModel[63] = new ModelRendererTurbo(this, 34, 62, textureX, textureY); // Box 83
		gunModel[64] = new ModelRendererTurbo(this, 30, 7, textureX, textureY); // Box 65
		gunModel[65] = new ModelRendererTurbo(this, 3, 3, textureX, textureY); // Box 66
		gunModel[66] = new ModelRendererTurbo(this, 4, 25, textureX, textureY); // Box 67
		gunModel[67] = new ModelRendererTurbo(this, 76, 182, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 49, 178, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 21, 160, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 41, 158, textureX, textureY); // Box 74
		gunModel[71] = new ModelRendererTurbo(this, 59, 160, textureX, textureY); // Box 75
		gunModel[72] = new ModelRendererTurbo(this, 85, 193, textureX, textureY); // Box 76
		gunModel[73] = new ModelRendererTurbo(this, 54, 213, textureX, textureY); // Box 78
		gunModel[74] = new ModelRendererTurbo(this, 53, 202, textureX, textureY); // Box 79
		gunModel[75] = new ModelRendererTurbo(this, 57, 222, textureX, textureY); // Box 82
		gunModel[76] = new ModelRendererTurbo(this, 48, 221, textureX, textureY); // Box 83
		gunModel[77] = new ModelRendererTurbo(this, 43, 221, textureX, textureY); // Box 85
		gunModel[78] = new ModelRendererTurbo(this, 48, 221, textureX, textureY); // Box 86
		gunModel[79] = new ModelRendererTurbo(this, 105, 45, textureX, textureY); // Box 81
		gunModel[80] = new ModelRendererTurbo(this, 105, 45, textureX, textureY); // Box 82
		gunModel[81] = new ModelRendererTurbo(this, 105, 45, textureX, textureY); // Box 83
		gunModel[82] = new ModelRendererTurbo(this, 105, 45, textureX, textureY); // Box 84
		gunModel[83] = new ModelRendererTurbo(this, 106, 41, textureX, textureY); // Box 85

		gunModel[0].addBox(0F, 0F, 0F, 5, 5, 29, 0F); // Import Shape1
		gunModel[0].setRotationPoint(0F, -2F, -5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,-0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(0F, -4.5F, 7F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Box 4
		gunModel[2].setRotationPoint(0F, -3.5F, 7F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 1, 15, 0F); // Box 6
		gunModel[3].setRotationPoint(1.5F, 0F, 24F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[4].setRotationPoint(1.5F, -1F, 24F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[5].setRotationPoint(-1F, 0F, 12F);

		gunModel[6].addBox(0F, 0F, 0F, 7, 3, 12, 0F); // Box 13
		gunModel[6].setRotationPoint(-1F, 1F, 12F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		gunModel[7].setRotationPoint(-1F, 4F, 12F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		gunModel[8].setRotationPoint(-1F, 1F, 9F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[9].setRotationPoint(0F, -3F, -13F);

		gunModel[10].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 18
		gunModel[10].setRotationPoint(0F, 3F, -5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 19
		gunModel[11].setRotationPoint(0F, 4F, -5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		gunModel[12].setRotationPoint(2F, -5F, 32F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 21
		gunModel[13].setRotationPoint(2F, -5F, 8F);

		gunModel[14].addBox(0F, 0F, 0F, 5, 3, 8, 0F); // Box 22
		gunModel[14].setRotationPoint(0F, -2F, -13F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[15].setRotationPoint(2F, -6.4F, 32F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		gunModel[16].setRotationPoint(-1F, 4F, 11F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[17].setRotationPoint(-1F, 0F, 11F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[18].setRotationPoint(2F, 5F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 32
		gunModel[19].setRotationPoint(2F, 3F, 2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[20].setRotationPoint(3F, -4.5F, 7F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[21].setRotationPoint(0F, -4.5F, 33F);

		gunModel[22].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 29
		gunModel[22].setRotationPoint(0F, -3.5F, 33F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, -0.2F, -0.5F); // Box 30
		gunModel[23].setRotationPoint(0F, -2.5F, 33F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F); // Box 31
		gunModel[24].setRotationPoint(0F, -2.5F, 7F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 36
		gunModel[25].setRotationPoint(3F, -6.5F, 7F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -1.4F, 0F, 0F, -1.8F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		gunModel[26].setRotationPoint(2.5F, -6.5F, 7F);

		gunModel[27].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 43
		gunModel[27].setRotationPoint(3F, -5.5F, 8F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[28].setRotationPoint(2F, -5F, 6.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.8F, -0.5F, -0.5F, -1.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[29].setRotationPoint(1.5F, -6.5F, 7F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[30].setRotationPoint(1F, -6.5F, 7F);

		gunModel[31].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 47
		gunModel[31].setRotationPoint(1F, -5.5F, 8F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 48
		gunModel[32].setRotationPoint(1.5F, 1F, 24F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[33].setRotationPoint(1.5F, 1.5F, 24F);

		gunModel[34].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 50
		gunModel[34].setRotationPoint(1.5F, 2.5F, 24F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 51
		gunModel[35].setRotationPoint(1.5F, 3.5F, 24F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 52
		gunModel[36].setRotationPoint(-1F, 3F, 9F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[37].setRotationPoint(-1F, 1F, 11F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[38].setRotationPoint(-2F, -2.5F, 19F);

		gunModel[39].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 55
		gunModel[39].setRotationPoint(-2F, -1.5F, 19F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 56
		gunModel[40].setRotationPoint(-2F, -0.5F, 19F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 57
		gunModel[41].setRotationPoint(-2F, -1.5F, 22.4F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 58
		gunModel[42].setRotationPoint(-2F, -2.5F, 22.4F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 59
		gunModel[43].setRotationPoint(-2F, -0.5F, 22.4F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 61
		gunModel[44].setRotationPoint(-2F, -1.5F, 23.4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 62
		gunModel[45].setRotationPoint(-2F, -2.5F, 23.4F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 63
		gunModel[46].setRotationPoint(-2F, -0.5F, 23.4F);

		gunModel[47].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 64
		gunModel[47].setRotationPoint(-1F, -2.5F, 21F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 65
		gunModel[48].setRotationPoint(-2F, -2.5F, 21F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 66
		gunModel[49].setRotationPoint(-2F, -1.5F, 21F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 67
		gunModel[50].setRotationPoint(-2F, -0.5F, 21F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[51].setRotationPoint(-2F, -1.5F, 18F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.8F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[52].setRotationPoint(-2F, -2.5F, 18F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, -0.6F, -0.8F, -0.8F, -0.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 71
		gunModel[53].setRotationPoint(-2F, -0.5F, 18F);

		gunModel[54].addShapeBox(-1F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 72
		gunModel[54].setRotationPoint(-0.5F, -1.5F, 18F);
		gunModel[54].rotateAngleY = 0.34906585F;

		gunModel[55].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 75
		gunModel[55].setRotationPoint(-1.2F, -1.5F, 18.5F);
		gunModel[55].rotateAngleY = -0.66322512F;
		gunModel[55].rotateAngleZ = -0.12217305F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 76
		gunModel[56].setRotationPoint(-1.4F, -1.5F, 17.7F);
		gunModel[56].rotateAngleY = -0.75049158F;

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[57].setRotationPoint(-0.4F, -1.5F, 15.7F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 78
		gunModel[58].setRotationPoint(2F, -4F, 32F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[59].setRotationPoint(2F, -3F, 33F);

		gunModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 80
		gunModel[60].setRotationPoint(2F, -2F, 33F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, 0F, 0F, -0.5F); // Box 81
		gunModel[61].setRotationPoint(3F, -2.5F, 33F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[62].setRotationPoint(3F, -2.5F, 7F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[63].setRotationPoint(3F, -4.5F, 33F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,-0.5F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[64].setRotationPoint(0.2F, -4F, -13F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,-0.2F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[65].setRotationPoint(2.8F, -4F, -13F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[66].setRotationPoint(2F, -4F, -13F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F); // Box 70
		gunModel[67].setRotationPoint(0F, -1F, -17F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -4F, 0.3F, 0F, -4F); // Box 71
		gunModel[68].setRotationPoint(0F, -3F, -20F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,-0.5F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.2F, -0.5F, 0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[69].setRotationPoint(0F, -4F, -20F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[70].setRotationPoint(2F, -4F, -20F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0.6F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[71].setRotationPoint(3F, -4F, -20F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[72].setRotationPoint(0F, 0F, -16F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F); // Box 78
		gunModel[73].setRotationPoint(0F, 3F, -21F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[74].setRotationPoint(0F, -1F, -21F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 82
		gunModel[75].setRotationPoint(0F, -3F, -21F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, -0.7F, -0.2F, 0F, -0.5F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[76].setRotationPoint(3F, -4F, -21F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[77].setRotationPoint(2F, -4F, -21F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.7F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.6F, 0F, -0.5F, 0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[78].setRotationPoint(0F, -4F, -21F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 81
		gunModel[79].setRotationPoint(1F, -6.5F, 6.9F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1.8F, -0.5F, -0.5F, -1.4F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 82
		gunModel[80].setRotationPoint(1.5F, -6.5F, 6.9F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, -1.4F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 83
		gunModel[81].setRotationPoint(2.5F, -6.5F, 6.9F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 84
		gunModel[82].setRotationPoint(3F, -6.5F, 6.9F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 85
		gunModel[83].setRotationPoint(2F, -6.4F, 31.9F);


		firestarModel = new ModelRendererTurbo[3];
		firestarModel[0] = new ModelRendererTurbo(this, 187, 6, textureX, textureY); // Box 86
		firestarModel[1] = new ModelRendererTurbo(this, 172, 42, textureX, textureY); // Box 86
		firestarModel[2] = new ModelRendererTurbo(this, 190, 7, textureX, textureY); // Box 86

		firestarModel[0].addBox(0F, 0F, 0F, 0, 15, 18, 0F); // Box 86
		firestarModel[0].setRotationPoint(2.5F, -7F, 39.5F);

		firestarModel[1].addBox(0F, 0F, 0F, 15, 0, 18, 0F); // Box 86
		firestarModel[1].setRotationPoint(-5F, 0.5F, 39.5F);

		firestarModel[2].addBox(0F, 0F, 0F, 15, 15, 0, 0F); // Box 86
		firestarModel[2].setRotationPoint(-5F, -7F, 39.5F);

		//translateAll(0F, 0F, 0F);
		flipAll();
	}
}