//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelMachineGun extends Model3DWeaponBase
{
	int textureX = 512;
	int textureY = 512;
	
	private ModelRendererTurbo[] baseModel;
	private ModelRendererTurbo[][] barrelModel;
	private int barrelX;
	private int barrelY;
	private int barrelZ;

	public ModelMachineGun()
	{
		baseModel = new ModelRendererTurbo[42];
		baseModel[0] = new ModelRendererTurbo(this, 40, 246, textureX, textureY); // Box 34
		baseModel[1] = new ModelRendererTurbo(this, 155, 243, textureX, textureY); // Box 43
		baseModel[2] = new ModelRendererTurbo(this, 89, 50, textureX, textureY); // Box 65
		baseModel[3] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[4] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[5] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[6] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[7] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[8] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		baseModel[9] = new ModelRendererTurbo(this, 41, 150, textureX, textureY); // Box 94
		baseModel[10] = new ModelRendererTurbo(this, 41, 150, textureX, textureY); // Box 95
		baseModel[11] = new ModelRendererTurbo(this, 41, 150, textureX, textureY); // Box 96
		baseModel[12] = new ModelRendererTurbo(this, 143, 3, textureX, textureY); // Box 97
		baseModel[13] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 98
		baseModel[14] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 99
		baseModel[15] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 100
		baseModel[16] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 101
		baseModel[17] = new ModelRendererTurbo(this, 43, 155, textureX, textureY); // Box 102
		baseModel[18] = new ModelRendererTurbo(this, 157, 30, textureX, textureY); // Box 103
		baseModel[19] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 104
		baseModel[20] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 105
		baseModel[21] = new ModelRendererTurbo(this, 179, 30, textureX, textureY); // Box 106
		baseModel[22] = new ModelRendererTurbo(this, 43, 155, textureX, textureY); // Box 107
		baseModel[23] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 108
		baseModel[24] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 110
		baseModel[25] = new ModelRendererTurbo(this, 143, 3, textureX, textureY); // Box 111
		baseModel[26] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 112
		baseModel[27] = new ModelRendererTurbo(this, 157, 30, textureX, textureY); // Box 113
		baseModel[28] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 114
		baseModel[29] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 115
		baseModel[30] = new ModelRendererTurbo(this, 179, 30, textureX, textureY); // Box 116
		baseModel[31] = new ModelRendererTurbo(this, 43, 155, textureX, textureY); // Box 117
		baseModel[32] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 118
		baseModel[33] = new ModelRendererTurbo(this, 143, 3, textureX, textureY); // Box 119
		baseModel[34] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 120
		baseModel[35] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 121
		baseModel[36] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 122
		baseModel[37] = new ModelRendererTurbo(this, 157, 30, textureX, textureY); // Box 123
		baseModel[38] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 124
		baseModel[39] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 125
		baseModel[40] = new ModelRendererTurbo(this, 179, 30, textureX, textureY); // Box 126
		baseModel[41] = new ModelRendererTurbo(this, 41, 150, textureX, textureY); // Box 127

		baseModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		baseModel[0].setRotationPoint(-3F, -11F, -58F);

		baseModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		baseModel[1].setRotationPoint(3F, -11F, -58F);

		baseModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		baseModel[2].setRotationPoint(-3F, -16F, 22F);

		baseModel[3].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		baseModel[3].setRotationPoint(-2F, -4F, -1F);

		baseModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		baseModel[4].setRotationPoint(1F, -4F, -1F);

		baseModel[5].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 93
		baseModel[5].setRotationPoint(0F, -4F, -1F);

		baseModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 93
		baseModel[6].setRotationPoint(1F, -4F, 2F);

		baseModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 93
		baseModel[7].setRotationPoint(-2F, -4F, 2F);

		baseModel[8].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 93
		baseModel[8].setRotationPoint(0F, -4F, 2F);

		baseModel[9].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 94
		baseModel[9].setRotationPoint(-3F, 2F, -1F);

		baseModel[10].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		baseModel[10].setRotationPoint(-3F, 2F, -2F);

		baseModel[11].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 96
		baseModel[11].setRotationPoint(-3F, 2F, 4F);

		baseModel[12].addBox(-2F, 0F, -1F, 4, 35, 2, 0F); // Box 97
		baseModel[12].setRotationPoint(-5F, 8F, -3.5F);
		baseModel[12].rotateAngleX = -0.4712389F;
		baseModel[12].rotateAngleY = -0.89011792F;

		baseModel[13].addShapeBox(-2F, 0F, -2F, 4, 35, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		baseModel[13].setRotationPoint(-5F, 8F, -3.5F);
		baseModel[13].rotateAngleX = -0.4712389F;
		baseModel[13].rotateAngleY = -0.89011792F;

		baseModel[14].addShapeBox(-2F, 0F, 1F, 4, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 99
		baseModel[14].setRotationPoint(-5F, 8F, -3.5F);
		baseModel[14].rotateAngleX = -0.4712389F;
		baseModel[14].rotateAngleY = -0.89011792F;

		baseModel[15].addBox(-2F, -3F, -1F, 1, 3, 2, 0F); // Box 100
		baseModel[15].setRotationPoint(-5F, 8F, -3.5F);
		baseModel[15].rotateAngleX = -0.4712389F;
		baseModel[15].rotateAngleY = -0.89011792F;

		baseModel[16].addBox(1F, -3F, -1F, 1, 3, 2, 0F); // Box 101
		baseModel[16].setRotationPoint(-5F, 8F, -3.5F);
		baseModel[16].rotateAngleX = -0.4712389F;
		baseModel[16].rotateAngleY = -0.89011792F;

		baseModel[17].addBox(-2F, 0F, -1F, 3, 2, 2, 0F); // Box 102
		baseModel[17].setRotationPoint(-3F, 5F, -2F);
		baseModel[17].rotateAngleY = 0.6981317F;

		baseModel[18].addBox(-8F, 0F, -3F, 7, 3, 6, 0F); // Box 103
		baseModel[18].setRotationPoint(-14F, 37F, -11F);
		baseModel[18].rotateAngleY = 0.61086524F;

		baseModel[19].addShapeBox(-9F, 0F, -3F, 1, 3, 3, 0F,0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 104
		baseModel[19].setRotationPoint(-14F, 37F, -11F);
		baseModel[19].rotateAngleY = 0.61086524F;

		baseModel[20].addShapeBox(-9F, 0F, 0F, 1, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 105
		baseModel[20].setRotationPoint(-14F, 37F, -11F);
		baseModel[20].rotateAngleY = 0.61086524F;

		baseModel[21].addBox(-8F, -2F, -0.5F, 1, 2, 1, 0F); // Box 106
		baseModel[21].setRotationPoint(-14F, 37F, -11F);
		baseModel[21].rotateAngleY = 0.61086524F;

		baseModel[22].addBox(-1F, 0F, -1F, 3, 2, 2, 0F); // Box 107
		baseModel[22].setRotationPoint(4F, 5F, -2F);
		baseModel[22].rotateAngleY = -0.6981317F;

		baseModel[23].addBox(1F, -3F, -1F, 1, 3, 2, 0F); // Box 108
		baseModel[23].setRotationPoint(6F, 8F, -3.5F);
		baseModel[23].rotateAngleX = -0.4712389F;
		baseModel[23].rotateAngleY = 0.89011792F;

		baseModel[24].addShapeBox(-2F, 0F, -2F, 4, 35, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		baseModel[24].setRotationPoint(6F, 8F, -3.5F);
		baseModel[24].rotateAngleX = -0.4712389F;
		baseModel[24].rotateAngleY = 0.89011792F;

		baseModel[25].addBox(-2F, 0F, -1F, 4, 35, 2, 0F); // Box 111
		baseModel[25].setRotationPoint(6F, 8F, -3.5F);
		baseModel[25].rotateAngleX = -0.4712389F;
		baseModel[25].rotateAngleY = 0.89011792F;

		baseModel[26].addShapeBox(-2F, 0F, 1F, 4, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 112
		baseModel[26].setRotationPoint(6F, 8F, -3.5F);
		baseModel[26].rotateAngleX = -0.4712389F;
		baseModel[26].rotateAngleY = 0.89011792F;

		baseModel[27].addBox(-8F, 0F, -3F, 7, 3, 6, 0F); // Box 113
		baseModel[27].setRotationPoint(15F, 37F, -11F);
		baseModel[27].rotateAngleY = 2.35619449F;

		baseModel[28].addShapeBox(-9F, 0F, -3F, 1, 3, 3, 0F,0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 114
		baseModel[28].setRotationPoint(15F, 37F, -11F);
		baseModel[28].rotateAngleY = 2.35619449F;

		baseModel[29].addShapeBox(-9F, 0F, 0F, 1, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 115
		baseModel[29].setRotationPoint(15F, 37F, -11F);
		baseModel[29].rotateAngleY = 2.35619449F;

		baseModel[30].addBox(-8F, -2F, -0.5F, 1, 2, 1, 0F); // Box 116
		baseModel[30].setRotationPoint(15F, 37F, -11F);
		baseModel[30].rotateAngleY = 2.35619449F;

		baseModel[31].addBox(-2F, 0F, -1F, 2, 2, 3, 0F); // Box 117
		baseModel[31].setRotationPoint(1.5F, 5F, 6F);

		baseModel[32].addShapeBox(-2F, 0F, -2F, 4, 35, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		baseModel[32].setRotationPoint(0.5F, 8F, 8.5F);
		baseModel[32].rotateAngleX = -0.4712389F;
		baseModel[32].rotateAngleY = 3.21140582F;

		baseModel[33].addBox(-2F, 0F, -1F, 4, 35, 2, 0F); // Box 119
		baseModel[33].setRotationPoint(0.5F, 8F, 8.5F);
		baseModel[33].rotateAngleX = -0.4712389F;
		baseModel[33].rotateAngleY = 3.21140582F;

		baseModel[34].addShapeBox(-2F, 0F, 1F, 4, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		baseModel[34].setRotationPoint(0.5F, 8F, 8.5F);
		baseModel[34].rotateAngleX = -0.4712389F;
		baseModel[34].rotateAngleY = 3.21140582F;

		baseModel[35].addBox(-2F, -3F, -1F, 1, 3, 2, 0F); // Box 121
		baseModel[35].setRotationPoint(0.5F, 8F, 8.5F);
		baseModel[35].rotateAngleX = -0.4712389F;
		baseModel[35].rotateAngleY = 3.21140582F;

		baseModel[36].addBox(1F, -3F, -1F, 1, 3, 2, 0F); // Box 122
		baseModel[36].setRotationPoint(0.5F, 8F, 8.5F);
		baseModel[36].rotateAngleX = -0.4712389F;
		baseModel[36].rotateAngleY = 3.21140582F;

		baseModel[37].addBox(-8F, 0F, -3F, 7, 3, 6, 0F); // Box 123
		baseModel[37].setRotationPoint(-0.5F, 37F, 21F);
		baseModel[37].rotateAngleY = -1.57079633F;

		baseModel[38].addShapeBox(-9F, 0F, 0F, 1, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 124
		baseModel[38].setRotationPoint(-0.5F, 37F, 21F);
		baseModel[38].rotateAngleY = -1.57079633F;

		baseModel[39].addShapeBox(-9F, 0F, -3F, 1, 3, 3, 0F,0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 125
		baseModel[39].setRotationPoint(-0.5F, 37F, 21F);
		baseModel[39].rotateAngleY = -1.57079633F;

		baseModel[40].addBox(-8F, -2F, -0.5F, 1, 2, 1, 0F); // Box 126
		baseModel[40].setRotationPoint(-0.5F, 37F, 21F);
		baseModel[40].rotateAngleY = -1.57079633F;

		baseModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		baseModel[41].setRotationPoint(-1F, 7F, 0F);


		gunModel = new ModelRendererTurbo[66];
		gunModel[0] = new ModelRendererTurbo(this, 86, 162, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 81, 126, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 135, 100, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 37, 100, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 137, 168, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 44, 167, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 88, 51, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 97, 196, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 43, 204, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 178, 71, textureX, textureY); // Box 52
		gunModel[19] = new ModelRendererTurbo(this, 179, 50, textureX, textureY); // Box 53
		gunModel[20] = new ModelRendererTurbo(this, 180, 84, textureX, textureY); // Box 54
		gunModel[21] = new ModelRendererTurbo(this, 180, 84, textureX, textureY); // Box 55
		gunModel[22] = new ModelRendererTurbo(this, 178, 71, textureX, textureY); // Box 56
		gunModel[23] = new ModelRendererTurbo(this, 179, 50, textureX, textureY); // Box 57
		gunModel[24] = new ModelRendererTurbo(this, 192, 28, textureX, textureY); // Box 58
		gunModel[25] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 59
		gunModel[26] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 60
		gunModel[27] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 61
		gunModel[28] = new ModelRendererTurbo(this, 200, 30, textureX, textureY); // Box 62
		gunModel[29] = new ModelRendererTurbo(this, 192, 28, textureX, textureY); // Box 63
		gunModel[30] = new ModelRendererTurbo(this, 75, 41, textureX, textureY); // Box 64
		gunModel[31] = new ModelRendererTurbo(this, 55, 50, textureX, textureY); // Box 66
		gunModel[32] = new ModelRendererTurbo(this, 54, 66, textureX, textureY); // Box 67
		gunModel[33] = new ModelRendererTurbo(this, 90, 66, textureX, textureY); // Box 68
		gunModel[34] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 69
		gunModel[35] = new ModelRendererTurbo(this, 64, 63, textureX, textureY); // Box 70
		gunModel[36] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 71
		gunModel[37] = new ModelRendererTurbo(this, 64, 53, textureX, textureY); // Box 72
		gunModel[38] = new ModelRendererTurbo(this, 215, 62, textureX, textureY); // Box 73
		gunModel[39] = new ModelRendererTurbo(this, 218, 84, textureX, textureY); // Box 74
		gunModel[40] = new ModelRendererTurbo(this, 218, 84, textureX, textureY); // Box 75
		gunModel[41] = new ModelRendererTurbo(this, 219, 49, textureX, textureY); // Box 76
		gunModel[42] = new ModelRendererTurbo(this, 219, 49, textureX, textureY); // Box 77
		gunModel[43] = new ModelRendererTurbo(this, 219, 49, textureX, textureY); // Box 78
		gunModel[44] = new ModelRendererTurbo(this, 219, 49, textureX, textureY); // Box 79
		gunModel[45] = new ModelRendererTurbo(this, 127, 62, textureX, textureY); // Box 80
		gunModel[46] = new ModelRendererTurbo(this, 178, 118, textureX, textureY); // Box 81
		gunModel[47] = new ModelRendererTurbo(this, 94, 12, textureX, textureY); // Box 82
		gunModel[48] = new ModelRendererTurbo(this, 111, 11, textureX, textureY); // Box 83
		gunModel[49] = new ModelRendererTurbo(this, 111, 11, textureX, textureY); // Box 84
		gunModel[50] = new ModelRendererTurbo(this, 111, 11, textureX, textureY); // Box 85
		gunModel[51] = new ModelRendererTurbo(this, 111, 11, textureX, textureY); // Box 86
		gunModel[52] = new ModelRendererTurbo(this, 94, 12, textureX, textureY); // Box 87
		gunModel[53] = new ModelRendererTurbo(this, 100, 71, textureX, textureY); // Box 88
		gunModel[54] = new ModelRendererTurbo(this, 100, 71, textureX, textureY); // Box 90
		gunModel[55] = new ModelRendererTurbo(this, 100, 71, textureX, textureY); // Box 91
		gunModel[56] = new ModelRendererTurbo(this, 165, 205, textureX, textureY); // Box 92
		gunModel[57] = new ModelRendererTurbo(this, 100, 202, textureX, textureY); // Box 93
		gunModel[58] = new ModelRendererTurbo(this, 100, 202, textureX, textureY); // Box 94
		gunModel[59] = new ModelRendererTurbo(this, 100, 202, textureX, textureY); // Box 95
		gunModel[60] = new ModelRendererTurbo(this, 100, 202, textureX, textureY); // Box 96
		gunModel[61] = new ModelRendererTurbo(this, 101, 27, textureX, textureY); // Box 97
		gunModel[62] = new ModelRendererTurbo(this, 47, 139, textureX, textureY); // Box 93
		gunModel[63] = new ModelRendererTurbo(this, 145, 42, textureX, textureY); // Box 109
		gunModel[64] = new ModelRendererTurbo(this, 81, 111, textureX, textureY); // Box 128
		gunModel[65] = new ModelRendererTurbo(this, 101, 27, textureX, textureY); // Box 132

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 30, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(-4F, -10F, -8F);

		gunModel[1].addBox(0F, 0F, 0F, 11, 2, 30, 0F); // Box 3
		gunModel[1].setRotationPoint(-5F, -12F, -8F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(-4F, -14F, -8F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,-2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(-4F, -16F, -8F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,0F, 0.4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(1F, -16F, -8F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F); // Box 7
		gunModel[5].setRotationPoint(-4F, -8F, -8F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.4F, 0F); // Box 8
		gunModel[6].setRotationPoint(1F, -8F, -8F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[7].setRotationPoint(-5F, -12F, -10F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[8].setRotationPoint(-5F, -14F, -10F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 11
		gunModel[9].setRotationPoint(-3F, -16F, -10F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		gunModel[10].setRotationPoint(-5F, -10F, -10F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[11].setRotationPoint(1F, -16F, -10F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, -1F, 0F, 0F); // Box 17
		gunModel[12].setRotationPoint(-3F, -8F, -10F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F); // Box 18
		gunModel[13].setRotationPoint(1F, -8F, -10F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 30, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[14].setRotationPoint(0F, -17F, -8F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 20
		gunModel[15].setRotationPoint(0F, -8F, -8F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[16].setRotationPoint(0F, -17F, -10F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 23
		gunModel[17].setRotationPoint(0F, -8F, -10F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 12, 7, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[18].setRotationPoint(-15F, -16F, -12F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 12, 10, 2, 0F,-9F, 0F, -4F, -2F, 0F, -4F, -1F, 0F, 4F, -8F, 0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[19].setRotationPoint(-15F, -26F, -12F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -1F, -5F, 1F, 1F, -1F, 1F, 1F); // Box 54
		gunModel[20].setRotationPoint(-15F, -9F, -12F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -2F, 0F, -1F, -1F, 1F, 1F, -5F, 1F, 1F); // Box 55
		gunModel[21].setRotationPoint(4F, -9F, -12F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 12, 7, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[22].setRotationPoint(4F, -16F, -12F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 10, 2, 0F,-2F, 0F, -4F, -9F, 0F, -4F, -8F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[23].setRotationPoint(4F, -26F, -12F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 58
		gunModel[24].setRotationPoint(-6F, -13F, -2F);

		gunModel[25].addBox(0F, -2F, -10F, 1, 2, 12, 0F); // Box 59
		gunModel[25].setRotationPoint(-6F, -11F, -2F);
		gunModel[25].rotateAngleX = -0.48869219F;
		gunModel[25].rotateAngleY = -0.26179939F;

		gunModel[26].addBox(0F, -2F, -10F, 1, 2, 12, 0F); // Box 60
		gunModel[26].setRotationPoint(-6F, -9F, -2F);
		gunModel[26].rotateAngleX = 0.48869219F;
		gunModel[26].rotateAngleY = -0.26179939F;

		gunModel[27].addBox(0F, -2F, -10F, 1, 2, 12, 0F); // Box 61
		gunModel[27].setRotationPoint(6F, -9F, -2F);
		gunModel[27].rotateAngleX = 0.48869219F;
		gunModel[27].rotateAngleY = 0.26179939F;

		gunModel[28].addBox(0F, -2F, -10F, 1, 2, 12, 0F); // Box 62
		gunModel[28].setRotationPoint(6F, -11F, -2F);
		gunModel[28].rotateAngleX = -0.48869219F;
		gunModel[28].rotateAngleY = 0.26179939F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[29].setRotationPoint(5F, -13F, -2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[30].setRotationPoint(0F, -17F, 22F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.4F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[31].setRotationPoint(1F, -16F, 22F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F); // Box 67
		gunModel[32].setRotationPoint(1F, -8F, 22F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F); // Box 68
		gunModel[33].setRotationPoint(-3F, -8F, 22F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 69
		gunModel[34].setRotationPoint(0F, -8F, 22F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 70
		gunModel[35].setRotationPoint(-5F, -10F, 22F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 71
		gunModel[36].setRotationPoint(-5F, -12F, 22F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 72
		gunModel[37].setRotationPoint(-5F, -14F, 22F);

		gunModel[38].addBox(0F, 0F, 0F, 7, 12, 7, 0F); // Box 73
		gunModel[38].setRotationPoint(8F, -13F, -9F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[39].setRotationPoint(8F, -14F, -9F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 75
		gunModel[40].setRotationPoint(8F, -1F, -9F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		gunModel[41].setRotationPoint(10F, -15F, -7F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 77
		gunModel[42].setRotationPoint(9F, -15F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F); // Box 78
		gunModel[43].setRotationPoint(8F, -15F, 2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 79
		gunModel[44].setRotationPoint(4F, -15F, 2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -7F, 0F, -0.6F, -7F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		gunModel[45].setRotationPoint(-1F, -19F, -7F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[46].setRotationPoint(-1F, -17F, 12F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 82
		gunModel[47].setRotationPoint(-4F, -9F, 21F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[48].setRotationPoint(-4F, -14F, 29F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[49].setRotationPoint(-4F, -16F, 27F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[50].setRotationPoint(3F, -16F, 27F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[51].setRotationPoint(3F, -14F, 29F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		gunModel[52].setRotationPoint(3F, -9F, 21F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[53].setRotationPoint(0F, -14F, 27F);

		gunModel[54].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 90
		gunModel[54].setRotationPoint(0F, -8F, 23F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[55].setRotationPoint(0F, -15F, 23F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 92
		gunModel[56].setRotationPoint(-2F, -6F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 93
		gunModel[57].setRotationPoint(-3F, -8F, 1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[58].setRotationPoint(-3F, -8F, -2F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		gunModel[59].setRotationPoint(3F, -8F, 1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[60].setRotationPoint(3F, -8F, -2F);

		gunModel[61].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 97
		gunModel[61].setRotationPoint(-4F, -3F, -2F);

		gunModel[62].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 93
		gunModel[62].setRotationPoint(-2F, -4F, 1F);

		gunModel[63].addBox(-2F, -3F, -1F, 1, 3, 2, 0F); // Box 109
		gunModel[63].setRotationPoint(6F, 8F, -3.5F);
		gunModel[63].rotateAngleX = -0.4712389F;
		gunModel[63].rotateAngleY = 0.89011792F;

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		gunModel[64].setRotationPoint(-6F, -16F, 3F);

		gunModel[65].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 132
		gunModel[65].setRotationPoint(4F, -3F, -2F);


		barrelModel[0] = new ModelRendererTurbo[25];
		barrelModel[0][0] = new ModelRendererTurbo(this, 40, 246, textureX, textureY); // Box 24
		barrelModel[0][1] = new ModelRendererTurbo(this, 99, 234, textureX, textureY); // Box 25
		barrelModel[0][2] = new ModelRendererTurbo(this, 155, 243, textureX, textureY); // Box 27
		barrelModel[0][3] = new ModelRendererTurbo(this, 96, 295, textureX, textureY); // Box 28
		barrelModel[0][4] = new ModelRendererTurbo(this, 36, 302, textureX, textureY); // Box 30
		barrelModel[0][5] = new ModelRendererTurbo(this, 99, 349, textureX, textureY); // Box 31
		barrelModel[0][6] = new ModelRendererTurbo(this, 155, 303, textureX, textureY); // Box 32
		barrelModel[0][7] = new ModelRendererTurbo(this, 96, 295, textureX, textureY); // Box 33
		barrelModel[0][8] = new ModelRendererTurbo(this, 99, 234, textureX, textureY); // Box 35
		barrelModel[0][9] = new ModelRendererTurbo(this, 155, 243, textureX, textureY); // Box 36
		barrelModel[0][10] = new ModelRendererTurbo(this, 155, 303, textureX, textureY); // Box 37
		barrelModel[0][11] = new ModelRendererTurbo(this, 98, 349, textureX, textureY); // Box 38
		barrelModel[0][12] = new ModelRendererTurbo(this, 36, 302, textureX, textureY); // Box 39
		barrelModel[0][13] = new ModelRendererTurbo(this, 96, 295, textureX, textureY); // Box 40
		barrelModel[0][14] = new ModelRendererTurbo(this, 40, 246, textureX, textureY); // Box 41
		barrelModel[0][15] = new ModelRendererTurbo(this, 99, 234, textureX, textureY); // Box 42
		barrelModel[0][16] = new ModelRendererTurbo(this, 155, 303, textureX, textureY); // Box 44
		barrelModel[0][17] = new ModelRendererTurbo(this, 36, 302, textureX, textureY); // Box 45
		barrelModel[0][18] = new ModelRendererTurbo(this, 36, 302, textureX, textureY); // Box 46
		barrelModel[0][19] = new ModelRendererTurbo(this, 7, 100, textureX, textureY); // Box 49
		barrelModel[0][20] = new ModelRendererTurbo(this, 11, 76, textureX, textureY); // Box 50
		barrelModel[0][21] = new ModelRendererTurbo(this, 11, 76, textureX, textureY); // Box 51
		barrelModel[0][22] = new ModelRendererTurbo(this, 11, 65, textureX, textureY); // Box 129
		barrelModel[0][23] = new ModelRendererTurbo(this, 11, 65, textureX, textureY); // Box 130
		barrelModel[0][24] = new ModelRendererTurbo(this, 11, 65, textureX, textureY); // Box 131

		barrelModel[0][0].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		barrelModel[0][0].setRotationPoint(-1F, -14.9F, -58F);

		barrelModel[0][1].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 25
		barrelModel[0][1].setRotationPoint(0F, -14.9F, -58F);

		barrelModel[0][2].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		barrelModel[0][2].setRotationPoint(1F, -14.9F, -58F);

		barrelModel[0][3].addBox(0F, 0F, 0F, 3, 1, 48, 0F); // Box 28
		barrelModel[0][3].setRotationPoint(-1F, -13.9F, -58F);

		barrelModel[0][4].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F); // Box 30
		barrelModel[0][4].setRotationPoint(-1F, -12.9F, -58F);

		barrelModel[0][5].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 31
		barrelModel[0][5].setRotationPoint(0F, -12.9F, -58F);

		barrelModel[0][6].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 32
		barrelModel[0][6].setRotationPoint(1F, -12.9F, -58F);

		barrelModel[0][7].addBox(0F, 0F, 0F, 3, 1, 48, 0F); // Box 33
		barrelModel[0][7].setRotationPoint(-3F, -10F, -58F);

		barrelModel[0][8].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 35
		barrelModel[0][8].setRotationPoint(-2F, -11F, -58F);

		barrelModel[0][9].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		barrelModel[0][9].setRotationPoint(-1F, -11F, -58F);

		barrelModel[0][10].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 37
		barrelModel[0][10].setRotationPoint(-1F, -9F, -58F);

		barrelModel[0][11].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 38
		barrelModel[0][11].setRotationPoint(-2F, -9F, -58F);

		barrelModel[0][12].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F); // Box 39
		barrelModel[0][12].setRotationPoint(-3F, -9F, -58F);

		barrelModel[0][13].addBox(0F, 0F, 0F, 3, 1, 48, 0F); // Box 40
		barrelModel[0][13].setRotationPoint(1F, -10F, -58F);

		barrelModel[0][14].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,-0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		barrelModel[0][14].setRotationPoint(1F, -11F, -58F);

		barrelModel[0][15].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 42
		barrelModel[0][15].setRotationPoint(2F, -11F, -58F);

		barrelModel[0][16].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 44
		barrelModel[0][16].setRotationPoint(3F, -9F, -58F);

		barrelModel[0][17].addBox(0F, 0F, 0F, 1, 1, 48, 0F); // Box 45
		barrelModel[0][17].setRotationPoint(2F, -9F, -58F);

		barrelModel[0][18].addShapeBox(0F, 0F, 0F, 1, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F); // Box 46
		barrelModel[0][18].setRotationPoint(1F, -9F, -58F);

		barrelModel[0][19].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		barrelModel[0][19].setRotationPoint(-4F, -8.9F, -65F);

		barrelModel[0][20].addShapeBox(0F, 0F, 0F, 5, 7, 14, 0F,-0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F); // Box 50
		barrelModel[0][20].setRotationPoint(-0.5F, -15.9F, -65F);

		barrelModel[0][21].addShapeBox(0F, 0F, 0F, 5, 7, 14, 0F,-3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		barrelModel[0][21].setRotationPoint(-3.5F, -15.9F, -65F);

		barrelModel[0][22].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,-0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F); // Box 129
		barrelModel[0][22].setRotationPoint(-0.5F, -15.9F, -46F);

		barrelModel[0][23].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,-3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 130
		barrelModel[0][23].setRotationPoint(-3.5F, -15.9F, -46F);

		barrelModel[0][24].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 131
		barrelModel[0][24].setRotationPoint(-4F, -8.9F, -46F);



		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;


		flipAll();
	}
}