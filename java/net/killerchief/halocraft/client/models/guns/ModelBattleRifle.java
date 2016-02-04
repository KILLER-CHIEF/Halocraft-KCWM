//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelBattleRifle extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelBattleRifle()
	{
		gunModel = new ModelRendererTurbo[52];
		gunModel[0] = new ModelRendererTurbo(this, 110, 118, textureX, textureY); // Import Shape1
		gunModel[1] = new ModelRendererTurbo(this, 209, 87, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 203, 39, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 172, 108, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 184, 122, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 37, 29, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 141, 59, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 81, 83, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 81, 109, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 81, 98, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 116, 121, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 115, 130, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 118, 112, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 120, 28, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 82, 47, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 119, 37, textureX, textureY); // Box 22
		gunModel[18] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 131, 52, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 110, 168, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 22, 29, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 82, 47, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 106, 37, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 108, 30, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 84, 28, textureX, textureY); // Box 34
		gunModel[31] = new ModelRendererTurbo(this, 83, 33, textureX, textureY); // Box 35
		gunModel[32] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 36
		gunModel[33] = new ModelRendererTurbo(this, 96, 35, textureX, textureY); // Box 37
		gunModel[34] = new ModelRendererTurbo(this, 96, 30, textureX, textureY); // Box 38
		gunModel[35] = new ModelRendererTurbo(this, 95, 39, textureX, textureY); // Box 40
		gunModel[36] = new ModelRendererTurbo(this, 82, 47, textureX, textureY); // Box 41
		gunModel[37] = new ModelRendererTurbo(this, 82, 54, textureX, textureY); // Box 42
		gunModel[38] = new ModelRendererTurbo(this, 59, 101, textureX, textureY); // Box 43
		gunModel[39] = new ModelRendererTurbo(this, 59, 93, textureX, textureY); // Box 44
		gunModel[40] = new ModelRendererTurbo(this, 58, 85, textureX, textureY); // Box 45
		gunModel[41] = new ModelRendererTurbo(this, 134, 119, textureX, textureY); // Box 46
		gunModel[42] = new ModelRendererTurbo(this, 192, 90, textureX, textureY); // Box 47
		gunModel[43] = new ModelRendererTurbo(this, 193, 100, textureX, textureY); // Box 48
		gunModel[44] = new ModelRendererTurbo(this, 179, 101, textureX, textureY); // Box 49
		gunModel[45] = new ModelRendererTurbo(this, 179, 101, textureX, textureY); // Box 50
		gunModel[46] = new ModelRendererTurbo(this, 174, 100, textureX, textureY); // Box 51
		gunModel[47] = new ModelRendererTurbo(this, 97, 21, textureX, textureY); // Box 48
		gunModel[48] = new ModelRendererTurbo(this, 121, 34, textureX, textureY); // Box 54
		gunModel[49] = new ModelRendererTurbo(this, 121, 34, textureX, textureY); // Box 55
		gunModel[50] = new ModelRendererTurbo(this, 121, 34, textureX, textureY); // Box 56
		gunModel[51] = new ModelRendererTurbo(this, 131, 52, textureX, textureY); // Box 57

		gunModel[0].addBox(0F, 0F, 0F, 5, 3, 44, 0F); // Import Shape1
		gunModel[0].setRotationPoint(0F, -1F, -22F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(0F, 2F, -22F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[2].setRotationPoint(1F, -3F, -19F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 8, 3, 0F); // Box 2
		gunModel[3].setRotationPoint(0.5F, 1F, -2F);
		gunModel[3].rotateAngleX = -0.31415927F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -5F, -2F, 1F, -5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 3
		gunModel[4].setRotationPoint(0F, 2F, 7F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 4
		gunModel[5].setRotationPoint(2.5F, -6F, 16F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 6
		gunModel[6].setRotationPoint(1.5F, -6F, 8F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F,-0.5F, -2F, -2F, -2.5F, -2F, -2F, -2.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(1F, -8F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		gunModel[8].setRotationPoint(1.5F, -2F, 22F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(1.5F, -1F, 22F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[10].setRotationPoint(1.5F, -1.5F, 22F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[11].setRotationPoint(1.5F, 1F, 21F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(1.5F, 1.5F, 21F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		gunModel[13].setRotationPoint(1.5F, 0.5F, 21F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		gunModel[14].setRotationPoint(1.5F, -9F, 2F);

		gunModel[15].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 17
		gunModel[15].setRotationPoint(1.5F, -8.5F, 2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[16].setRotationPoint(1.5F, -9F, 4F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		gunModel[17].setRotationPoint(1.5F, -8F, 2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[18].setRotationPoint(-1.5F, -3F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 24
		gunModel[19].setRotationPoint(-1.5F, -2F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[20].setRotationPoint(-1F, -2.8F, -1.25F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 44, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[21].setRotationPoint(0F, -2F, -22F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 24
		gunModel[22].setRotationPoint(2.5F, -5.5F, 18F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, -1F, 0F, 2F); // Box 25
		gunModel[23].setRotationPoint(2.5F, -4.5F, 18F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 0.5F, 0F, 2F); // Box 26
		gunModel[24].setRotationPoint(1.5F, -4.5F, 18F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		gunModel[25].setRotationPoint(1.5F, -6F, 16F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 28
		gunModel[26].setRotationPoint(1.5F, -5.5F, 18F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // Box 29
		gunModel[27].setRotationPoint(1.5F, -8F, 4F);

		gunModel[28].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 30
		gunModel[28].setRotationPoint(1.5F, -8.5F, 5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		gunModel[29].setRotationPoint(1.5F, -9F, 5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 34
		gunModel[30].setRotationPoint(1.75F, -9F, 10F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 35
		gunModel[31].setRotationPoint(1.75F, -8.5F, 10F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[32].setRotationPoint(1.75F, -7.5F, 10F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 37
		gunModel[33].setRotationPoint(1.75F, -8.5F, 8F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 38
		gunModel[34].setRotationPoint(1.75F, -9F, 8F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[35].setRotationPoint(1.75F, -7.5F, 8F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[36].setRotationPoint(1.5F, -9F, 7F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F); // Box 42
		gunModel[37].setRotationPoint(1.5F, -8F, 7F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 43
		gunModel[38].setRotationPoint(1.5F, -2F, 30F);

		gunModel[39].addShapeBox(-1F, -0.25F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 44
		gunModel[39].setRotationPoint(3.1F, -0.5F, 30F);
		gunModel[39].rotateAngleZ = 0.9424778F;

		gunModel[40].addShapeBox(-1F, -0.25F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 45
		gunModel[40].setRotationPoint(1.9F, -0.5F, 30F);
		gunModel[40].rotateAngleZ = -0.9424778F;

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[41].setRotationPoint(2F, 0F, 21F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Box 47
		gunModel[42].setRotationPoint(0F, 2F, -10F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, -3F, 0F, 0.3F, -3F, 0F); // Box 48
		gunModel[43].setRotationPoint(1F, 5F, -10F);

		gunModel[44].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 49
		gunModel[44].setRotationPoint(2F, 4F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 50
		gunModel[45].setRotationPoint(2F, 2F, 2F);

		gunModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 51
		gunModel[46].setRotationPoint(2F, 2F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 48
		gunModel[47].setRotationPoint(1.5F, -9.4F, 5F);

		gunModel[48].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 54
		gunModel[48].setRotationPoint(3.5F, -8.5F, 1.2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 55
		gunModel[49].setRotationPoint(3F, -9F, 1.2F);
		gunModel[49].rotateAngleZ = 0.73303829F;

		gunModel[50].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[50].setRotationPoint(3.7F, -7.7F, 1.2F);
		gunModel[50].rotateAngleZ = -0.80285146F;

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[51].setRotationPoint(0.2F, -2.75F, -1.25F);
		gunModel[51].rotateAngleZ = -0.45378561F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 160, 57, textureX, textureY); // Box 52

		ammoModel[0].addShapeBox(0F, -5.5F, 0F, 7, 7, 0, 0F,0F, -5F, 0F, -4.8F, -5F, 0F, -4.8F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, 0F, 0F, 0F); // Box 52
		ammoModel[0].setRotationPoint(1.4F, -3.5F, 0.7F);
		ammoModel[0].rotateAngleX = -0.45378561F;


		firestarModel = new ModelRendererTurbo[5];
		firestarModel[0] = new ModelRendererTurbo(this, 59, 120, textureX, textureY); // Box 49
		firestarModel[1] = new ModelRendererTurbo(this, 59, 120, textureX, textureY); // Box 50
		firestarModel[2] = new ModelRendererTurbo(this, 59, 120, textureX, textureY); // Box 51
		firestarModel[3] = new ModelRendererTurbo(this, 59, 120, textureX, textureY); // Box 52
		firestarModel[4] = new ModelRendererTurbo(this, 59, 120, textureX, textureY); // Box 53

		firestarModel[0].addShapeBox(-1.5F, 0F, 0F, 3, 8, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 49
		firestarModel[0].setRotationPoint(-4F, -6F, 31F);
		firestarModel[0].rotateAngleZ = 0.9250245F;

		firestarModel[1].addShapeBox(-1.5F, 0F, 0F, 3, 8, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 50
		firestarModel[1].setRotationPoint(9F, -6F, 31F);
		firestarModel[1].rotateAngleZ = -0.9250245F;

		firestarModel[2].addShapeBox(-1.5F, 0F, 0F, 3, 8, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 51
		firestarModel[2].setRotationPoint(2.5F, 7F, 31F);
		firestarModel[2].rotateAngleZ = -3.14159265F;

		firestarModel[3].addBox(-1.5F, 0F, 0F, 3, 0, 10, 0F); // Box 52
		firestarModel[3].setRotationPoint(2.5F, -1F, 31F);

		firestarModel[4].addBox(-1.5F, 0F, 0F, 0, 3, 10, 0F); // Box 53
		firestarModel[4].setRotationPoint(4F, -2.5F, 31F);

		//translateAll(0F, 0F, 0F);
		flipAll();
	}
}