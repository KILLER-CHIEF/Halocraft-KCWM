//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelBeamRifle extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelBeamRifle()
	{
		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 179, 33, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 55, 35, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 130, 35, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 31, 80, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 29, 122, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 29, 99, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 219, 31, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 173, 94, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 173, 105, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 105, 82, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 90, 0, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 115, 0, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 45, 0, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 110, 38, textureX, textureY); // Box 16

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, 8F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F); // Box 3
		bodyModel[1].setRotationPoint(0F, 8F, 7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 5, 32, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(0F, 0F, 5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(0F, 0F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 6
		bodyModel[4].setRotationPoint(0F, 6F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 7
		bodyModel[5].setRotationPoint(0F, 2F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F, -2F, 4F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(0F, -1F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[7].setRotationPoint(1F, -2F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(1F, 2F, -3F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 22, 0F); // Box 11
		bodyModel[9].setRotationPoint(2F, 5F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		bodyModel[10].setRotationPoint(0F, 6F, 26F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(4F, 6F, 26F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[12].setRotationPoint(2F, 5.5F, 33F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[13].setRotationPoint(2F, 5F, 33F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(1F, -4F, 5F);
		bodyModel[14].rotateAngleX = -0.15707963F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}