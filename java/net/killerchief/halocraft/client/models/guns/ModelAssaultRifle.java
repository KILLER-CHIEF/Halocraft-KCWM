//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelAssaultRifle extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelAssaultRifle()
	{
		bodyModel = new ModelRendererTurbo[16];
		bodyModel[0] = new ModelRendererTurbo(this, 56, 40, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 14, 39, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 56, 42, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 103, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 21, 64, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 166, 80, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 171, 53, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 177, 117, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 134, 116, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 151, 135, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 21, 64, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 21, 64, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 16, 78, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 16, 78, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 16, 78, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 108, 71, textureX, textureY); // Box 22

		bodyModel[0].addBox(0F, 0F, 0F, 6, 4, 50, 0F); // Box 0
		bodyModel[0].setRotationPoint(1F, -4F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 5, 11, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -9F, 20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 5, 12, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(1F, -9F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F); // Box 4
		bodyModel[3].setRotationPoint(1F, 0F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(2.5F, -4F, 31F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 4, 23, 0F); // Box 11
		bodyModel[5].setRotationPoint(1F, 0F, -19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[6].setRotationPoint(1F, -5F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 2F, 0F, -1F, 2F, 0F); // Box 13
		bodyModel[7].setRotationPoint(1F, 4F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 14
		bodyModel[8].setRotationPoint(2F, 4F, 0F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 15
		bodyModel[9].setRotationPoint(2F, 8F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 16
		bodyModel[10].setRotationPoint(2.5F, -3F, 31F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		bodyModel[11].setRotationPoint(2.5F, -2F, 31F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(2.5F, 1F, 26F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 20
		bodyModel[13].setRotationPoint(2.5F, 2F, 26F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(2.5F, 3F, 26F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(-0.5F, -3F, -1F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}