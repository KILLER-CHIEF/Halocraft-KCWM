//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelMagnumM6G extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelMagnumM6G()
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 102, 94, textureX, textureY); // Box 9
		gunModel[2] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 10
		gunModel[3] = new ModelRendererTurbo(this, 68, 103, textureX, textureY); // Box 11
		gunModel[4] = new ModelRendererTurbo(this, 80, 120, textureX, textureY); // Box 12
		gunModel[5] = new ModelRendererTurbo(this, 105, 124, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 171, 34, textureX, textureY); // Box 24
		gunModel[7] = new ModelRendererTurbo(this, 198, 28, textureX, textureY); // Box 25
		gunModel[8] = new ModelRendererTurbo(this, 119, 28, textureX, textureY); // Box 26
		gunModel[9] = new ModelRendererTurbo(this, 103, 115, textureX, textureY); // Box 27
		gunModel[10] = new ModelRendererTurbo(this, 103, 115, textureX, textureY); // Box 28
		gunModel[11] = new ModelRendererTurbo(this, 89, 90, textureX, textureY); // Box 29
		gunModel[12] = new ModelRendererTurbo(this, 195, 56, textureX, textureY); // Box 31
		gunModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 32
		gunModel[14] = new ModelRendererTurbo(this, 41, 48, textureX, textureY); // Box 33
		gunModel[15] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 35
		gunModel[16] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 42
		gunModel[17] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 43
		gunModel[18] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 44
		gunModel[19] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 45
		gunModel[20] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 46
		gunModel[21] = new ModelRendererTurbo(this, 111, 41, textureX, textureY); // Box 47
		gunModel[22] = new ModelRendererTurbo(this, 111, 41, textureX, textureY); // Box 48
		gunModel[23] = new ModelRendererTurbo(this, 179, 58, textureX, textureY); // Box 49
		gunModel[24] = new ModelRendererTurbo(this, 179, 58, textureX, textureY); // Box 50
		gunModel[25] = new ModelRendererTurbo(this, 179, 58, textureX, textureY); // Box 51
		gunModel[26] = new ModelRendererTurbo(this, 179, 58, textureX, textureY); // Box 52
		gunModel[27] = new ModelRendererTurbo(this, 42, 65, textureX, textureY); // Box 53
		gunModel[28] = new ModelRendererTurbo(this, 218, 54, textureX, textureY); // Box 54
		gunModel[29] = new ModelRendererTurbo(this, 218, 46, textureX, textureY); // Box 56
		gunModel[30] = new ModelRendererTurbo(this, 78, 104, textureX, textureY); // Box 57
		gunModel[31] = new ModelRendererTurbo(this, 72, 33, textureX, textureY); // Box 58
		gunModel[32] = new ModelRendererTurbo(this, 114, 56, textureX, textureY); // Box 59
		gunModel[33] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 60
		gunModel[34] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 62
		gunModel[35] = new ModelRendererTurbo(this, 218, 46, textureX, textureY); // Box 38

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(1.5F, -6F, -8.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[1].setRotationPoint(1.5F, 0F, -3F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 10
		gunModel[2].setRotationPoint(1F, -4F, -9F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		gunModel[3].setRotationPoint(2F, 0F, 5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		gunModel[4].setRotationPoint(2F, 7F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 13
		gunModel[5].setRotationPoint(1.5F, 7F, -4F);

		gunModel[6].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 24
		gunModel[6].setRotationPoint(1F, -4F, -7F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[7].setRotationPoint(1F, -5F, -9F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F); // Box 26
		gunModel[8].setRotationPoint(1F, -1F, -7F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		gunModel[9].setRotationPoint(2F, 7F, -3.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 28
		gunModel[10].setRotationPoint(2F, 9F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[11].setRotationPoint(1.5F, 0F, -5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		gunModel[12].setRotationPoint(1F, -1F, -9F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0.5F, -3F, -1F, 0.5F, -3F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[13].setRotationPoint(1F, -6F, 3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 33
		gunModel[14].setRotationPoint(1F, -5F, 3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 35
		gunModel[15].setRotationPoint(5F, -4F, 10F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[16].setRotationPoint(1F, -4F, 10F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 43
		gunModel[17].setRotationPoint(5F, -2F, 10F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[18].setRotationPoint(1F, -2F, 10F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		gunModel[19].setRotationPoint(2.5F, -4F, 10F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		gunModel[20].setRotationPoint(2.5F, -1.5F, 10F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		gunModel[21].setRotationPoint(3F, -6.2F, 10F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 48
		gunModel[22].setRotationPoint(3F, -6.2F, 10F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		gunModel[23].setRotationPoint(0.7F, -3.2F, 7F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 50
		gunModel[24].setRotationPoint(0.7F, -3.2F, 7F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		gunModel[25].setRotationPoint(5.3F, -3.2F, 7F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 52
		gunModel[26].setRotationPoint(5.3F, -3.2F, 7F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 53
		gunModel[27].setRotationPoint(1F, -4F, 4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		gunModel[28].setRotationPoint(3F, -4F, -9.1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 56
		gunModel[29].setRotationPoint(4F, -5.4F, -8.2F);
		gunModel[29].rotateAngleX = -0.6981317F;

		gunModel[30].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 57
		gunModel[30].setRotationPoint(3F, 0F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[31].setRotationPoint(1F, -5F, 3F);

		gunModel[32].addBox(0F, 0F, 0F, 5, 3, 7, 0F); // Box 59
		gunModel[32].setRotationPoint(1F, -4F, 3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[33].setRotationPoint(2.5F, -3.2F, 1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		gunModel[34].setRotationPoint(2.5F, -2.2F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 38
		gunModel[35].setRotationPoint(2F, -5.4F, -8.2F);
		gunModel[35].rotateAngleX = -0.6981317F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(gunModel);
	}
}