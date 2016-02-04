//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelEnergySword extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelEnergySword()
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 66, 76, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 40, 70, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 40, 93, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 64, 94, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 18
		gunModel[5] = new ModelRendererTurbo(this, 66, 76, textureX, textureY); // Box 20
		gunModel[6] = new ModelRendererTurbo(this, 66, 70, textureX, textureY); // Box 21
		gunModel[7] = new ModelRendererTurbo(this, 64, 94, textureX, textureY); // Box 22
		gunModel[8] = new ModelRendererTurbo(this, 64, 95, textureX, textureY); // Box 23
		gunModel[9] = new ModelRendererTurbo(this, 66, 87, textureX, textureY); // Box 24
		gunModel[10] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // Box 25
		gunModel[11] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // Box 26
		gunModel[12] = new ModelRendererTurbo(this, 40, 93, textureX, textureY); // Box 27
		gunModel[13] = new ModelRendererTurbo(this, 40, 70, textureX, textureY); // Box 28
		gunModel[14] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 29
		gunModel[15] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 33
		gunModel[16] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 34
		gunModel[17] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 36
		gunModel[18] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 38
		gunModel[19] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 39
		gunModel[20] = new ModelRendererTurbo(this, 66, 70, textureX, textureY); // Box 40
		gunModel[21] = new ModelRendererTurbo(this, 66, 76, textureX, textureY); // Box 41
		gunModel[22] = new ModelRendererTurbo(this, 66, 76, textureX, textureY); // Box 42
		gunModel[23] = new ModelRendererTurbo(this, 66, 87, textureX, textureY); // Box 43
		gunModel[24] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // Box 44
		gunModel[25] = new ModelRendererTurbo(this, 66, 86, textureX, textureY); // Box 45
		gunModel[26] = new ModelRendererTurbo(this, 64, 94, textureX, textureY); // Box 46
		gunModel[27] = new ModelRendererTurbo(this, 64, 95, textureX, textureY); // Box 47
		gunModel[28] = new ModelRendererTurbo(this, 64, 94, textureX, textureY); // Box 48

		gunModel[0].addShapeBox(0F, -1F, -1F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(2.5F, 6F, -2F);
		gunModel[0].rotateAngleX = 0.13962634F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(2F, 3F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -0.5F, 1.8F, -1.2F, -0.5F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F); // Box 2
		gunModel[2].setRotationPoint(2F, 3F, 0F);

		gunModel[3].addShapeBox(0F, 3F, -2F, 4, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(2F, 6F, -2F);
		gunModel[3].rotateAngleX = 0.13962634F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[4].setRotationPoint(4F, 5F, 8F);

		gunModel[5].addShapeBox(0F, -1F, 1F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		gunModel[5].setRotationPoint(2.5F, 6F, -2F);
		gunModel[5].rotateAngleX = 0.13962634F;

		gunModel[6].addBox(0F, -1F, 0F, 3, 4, 1, 0F); // Box 21
		gunModel[6].setRotationPoint(2.5F, 6F, -2F);
		gunModel[6].rotateAngleX = 0.13962634F;

		gunModel[7].addShapeBox(0F, 3F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F); // Box 22
		gunModel[7].setRotationPoint(2F, 6F, -2F);
		gunModel[7].rotateAngleX = 0.13962634F;

		gunModel[8].addShapeBox(0F, 3F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		gunModel[8].setRotationPoint(2F, 6F, -2F);
		gunModel[8].rotateAngleX = 0.13962634F;

		gunModel[9].addShapeBox(0F, 2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[9].setRotationPoint(2F, 6F, -2F);
		gunModel[9].rotateAngleX = 0.13962634F;

		gunModel[10].addShapeBox(0F, 2F, -2F, 4, 1, 2, 0F,-1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[10].setRotationPoint(2F, 6F, -2F);
		gunModel[10].rotateAngleX = 0.13962634F;

		gunModel[11].addShapeBox(0F, 2F, 1F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		gunModel[11].setRotationPoint(2F, 6F, -2F);
		gunModel[11].rotateAngleX = 0.13962634F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -0.5F, 1.8F, -1.2F, -0.5F, 1.8F); // Box 27
		gunModel[12].setRotationPoint(2F, 4F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 28
		gunModel[13].setRotationPoint(2F, 4F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 29
		gunModel[14].setRotationPoint(2F, 4F, -4F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1.2F, -1F, 0F, -1.2F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[15].setRotationPoint(2F, 2F, -4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[16].setRotationPoint(2F, 2F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 36
		gunModel[17].setRotationPoint(2F, 4F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		gunModel[18].setRotationPoint(2F, 2F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 39
		gunModel[19].setRotationPoint(2F, 4F, -2F);

		gunModel[20].addBox(0F, -2F, 0F, 3, 4, 1, 0F); // Box 40
		gunModel[20].setRotationPoint(2.5F, 1F, -2F);
		gunModel[20].rotateAngleX = -0.13962634F;

		gunModel[21].addShapeBox(0F, -2F, -1F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[21].setRotationPoint(2.5F, 1F, -2F);
		gunModel[21].rotateAngleX = -0.13962634F;

		gunModel[22].addShapeBox(0F, -2F, 1F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 42
		gunModel[22].setRotationPoint(2.5F, 1F, -2F);
		gunModel[22].rotateAngleX = -0.13962634F;

		gunModel[23].addShapeBox(0F, -2F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		gunModel[23].setRotationPoint(2F, 1F, -2F);
		gunModel[23].rotateAngleX = -0.13962634F;

		gunModel[24].addShapeBox(0F, -2F, 1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F); // Box 44
		gunModel[24].setRotationPoint(2F, 1F, -2F);
		gunModel[24].rotateAngleX = -0.13962634F;

		gunModel[25].addShapeBox(0F, -2F, -2F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		gunModel[25].setRotationPoint(2F, 1F, -2F);
		gunModel[25].rotateAngleX = -0.13962634F;

		gunModel[26].addShapeBox(0F, -3F, 1F, 4, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		gunModel[26].setRotationPoint(2F, 0F, -1.9F);
		gunModel[26].rotateAngleX = -0.13962634F;

		gunModel[27].addShapeBox(0F, -3F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[27].setRotationPoint(2F, 0F, -1.9F);
		gunModel[27].rotateAngleX = -0.13962634F;

		gunModel[28].addShapeBox(0F, -3F, -2F, 4, 2, 2, 0F,-1.5F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[28].setRotationPoint(2F, 0F, -1.9F);
		gunModel[28].rotateAngleX = -0.13962634F;


		bladeModel = new ModelRendererTurbo[15];
		bladeModel[0] = new ModelRendererTurbo(this, 102, 60, textureX, textureY); // Box 10
		bladeModel[1] = new ModelRendererTurbo(this, 117, 60, textureX, textureY); // Box 11
		bladeModel[2] = new ModelRendererTurbo(this, 102, 65, textureX, textureY); // Box 14
		bladeModel[3] = new ModelRendererTurbo(this, 102, 75, textureX, textureY); // Box 15
		bladeModel[4] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 16
		bladeModel[5] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 17
		bladeModel[6] = new ModelRendererTurbo(this, 132, 63, textureX, textureY); // Box 19
		bladeModel[7] = new ModelRendererTurbo(this, 102, 65, textureX, textureY); // Box 49
		bladeModel[8] = new ModelRendererTurbo(this, 102, 75, textureX, textureY); // Box 50
		bladeModel[9] = new ModelRendererTurbo(this, 102, 60, textureX, textureY); // Box 51
		bladeModel[10] = new ModelRendererTurbo(this, 117, 60, textureX, textureY); // Box 52
		bladeModel[11] = new ModelRendererTurbo(this, 132, 63, textureX, textureY); // Box 53
		bladeModel[12] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 54
		bladeModel[13] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 55
		bladeModel[14] = new ModelRendererTurbo(this, 102, 58, textureX, textureY); // Box 56

		bladeModel[0].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bladeModel[0].setRotationPoint(4F, 6F, 3F);

		bladeModel[1].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 11
		bladeModel[1].setRotationPoint(4F, 12F, -2F);

		bladeModel[2].addShapeBox(0F, 0F, 0F, 0, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 14
		bladeModel[2].setRotationPoint(4F, 6F, 13F);

		bladeModel[3].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bladeModel[3].setRotationPoint(4F, 6F, 8F);

		bladeModel[4].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bladeModel[4].setRotationPoint(4F, 5F, 9F);

		bladeModel[5].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bladeModel[5].setRotationPoint(4F, 5F, 12F);

		bladeModel[6].addShapeBox(0F, 0F, 0F, 0, 5, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 19
		bladeModel[6].setRotationPoint(4F, 9F, -12F);

		bladeModel[7].addShapeBox(0F, 0F, 0F, 0, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bladeModel[7].setRotationPoint(4F, -2F, 13F);

		bladeModel[8].addShapeBox(0F, 0F, 0F, 0, 4, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bladeModel[8].setRotationPoint(4F, -2F, 8F);

		bladeModel[9].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bladeModel[9].setRotationPoint(4F, -4F, 3F);

		bladeModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 52
		bladeModel[10].setRotationPoint(4F, -10F, -2F);

		bladeModel[11].addShapeBox(0F, 0F, 0F, 0, 5, 10, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 53
		bladeModel[11].setRotationPoint(4F, -6F, -12F);

		bladeModel[12].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bladeModel[12].setRotationPoint(4F, 2F, 8F);

		bladeModel[13].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 55
		bladeModel[13].setRotationPoint(4F, 2F, 9F);

		bladeModel[14].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 56
		bladeModel[14].setRotationPoint(4F, 2F, 12F);

		//translateAll(0F, 0F, 0F);
		flipAll();
	}
}