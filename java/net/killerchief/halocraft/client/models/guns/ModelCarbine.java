//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelCarbine extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelCarbine()
	{
		bodyModel = new ModelRendererTurbo[38];
		bodyModel[0] = new ModelRendererTurbo(this, 82, 192, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 4, 200, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 20, 63, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 35, 63, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 50, 63, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 70, 63, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 90, 63, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 110, 63, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 63, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 35, 63, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 50, 63, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 65, 63, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 80, 63, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 95, 63, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 110, 63, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 125, 63, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 140, 63, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 159, 200, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 159, 200, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 180, 63, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 155, 63, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 180, 100, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 159, 200, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 161, 98, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 219, 200, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 98, 97, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 45, 127, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 219, 200, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 239, 200, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 50, 110, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 50, 10, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 70, 10, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 90, 10, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 140, 63, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 155, 63, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 175, 0, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 176, 0, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -2F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, -18F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(0.5F, 0F, -15F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 3
		bodyModel[3].setRotationPoint(0.5F, 0F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 4
		bodyModel[4].setRotationPoint(0.5F, 0F, -14F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 5
		bodyModel[5].setRotationPoint(0.5F, 5F, -14F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 6
		bodyModel[6].setRotationPoint(0.5F, 5F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 7
		bodyModel[7].setRotationPoint(0.5F, 0F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(0.5F, 1F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(0.5F, 4F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(0.5F, 1F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(0.5F, 4F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(0.5F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[13].setRotationPoint(0.5F, 1F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(0.5F, 1F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(0.5F, 4F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 9, 2, 0F); // Box 17
		bodyModel[16].setRotationPoint(0.5F, 0F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(0F, 9F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F); // Box 19
		bodyModel[18].setRotationPoint(0F, 9F, 1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(0.5F, 0F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 21
		bodyModel[20].setRotationPoint(0.5F, 8F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 22
		bodyModel[21].setRotationPoint(0.5F, 1F, 1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F); // Box 23
		bodyModel[22].setRotationPoint(0F, 7F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 24
		bodyModel[23].setRotationPoint(0.5F, 1F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -2F, -1F, -1F, -2F); // Box 25
		bodyModel[24].setRotationPoint(0F, 5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F); // Box 26
		bodyModel[25].setRotationPoint(0.5F, 1F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(0F, -2F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(0F, 7F, -18F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(0F, -2F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(0F, 7F, -15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(0F, -3F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(1F, -5F, 3F);
		bodyModel[31].rotateAngleX = -0.54105207F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(1F, -3.3F, 2F);
		bodyModel[32].rotateAngleX = -0.54105207F;

		bodyModel[33].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 34
		bodyModel[33].setRotationPoint(1F, -4.15F, 2.5F);
		bodyModel[33].rotateAngleX = -0.54105207F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(0.5F, 1F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(0.5F, 7F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-1F, 1F, 10F);
		bodyModel[36].rotateAngleY = -0.78539816F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(3F, 1F, 7F);
		bodyModel[37].rotateAngleY = 0.78539816F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}