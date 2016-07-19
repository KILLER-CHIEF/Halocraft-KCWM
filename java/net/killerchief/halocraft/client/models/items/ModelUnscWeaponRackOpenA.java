//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelUnscWeaponRackOpenA extends Model3DBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelUnscWeaponRackOpenA()
	{
		bodyModel = new ModelRendererTurbo[22];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 42, 114, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 309, 120, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 309, 130, textureX, textureY); // Box 23

		bodyModel[0].addBox(0F, 0F, 0F, 16, 32, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -16F, 7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 32, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-8F, -16F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 32, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[2].setRotationPoint(5F, -16F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 32, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-8F, -16F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 32, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-8F, -16F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 32, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(5F, -16F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 2, 14, 0F); // Box 7
		bodyModel[6].setRotationPoint(-8F, -16F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 16, 4, 14, 0F); // Box 8
		bodyModel[7].setRotationPoint(-8F, 12F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 26, 14, 0F); // Box 9
		bodyModel[8].setRotationPoint(-5F, -14F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 10
		bodyModel[9].setRotationPoint(-7F, 7F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 21, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(-7F, -14F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 12
		bodyModel[11].setRotationPoint(-7F, 2F, 3F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 13
		bodyModel[12].setRotationPoint(-7F, -3F, 3F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 15
		bodyModel[13].setRotationPoint(5F, 7F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 21, 1, 0F); // Box 16
		bodyModel[14].setRotationPoint(5F, -14F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 17
		bodyModel[15].setRotationPoint(5F, 2F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 18
		bodyModel[16].setRotationPoint(5F, -3F, -7F);

		bodyModel[17].addBox(0.5F, 0F, 0F, 0, 26, 14, 0F); // Box 19
		bodyModel[17].setRotationPoint(-8F, -14F, -7F);

		bodyModel[18].addBox(0.5F, 0F, 0F, 0, 2, 14, 0F); // Box 20
		bodyModel[18].setRotationPoint(7F, -14F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 128, 320, 0, 0F, 0F, 0F, 0F, -126F, 0F, 0F, -126F, 0F, 0F, 0F, 0F, 0F, 0F, -315F, 0F, -126F, -315F, 0F, -126F, -315F, 0F, 0F, -315F, 0F); // Box 21
		bodyModel[19].setRotationPoint(1F, -14F, 8.1F);

		bodyModel[20].addShapeBox(0.1F, 0F, 0F, 0, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, 0F, -6F, -12F); // Box 22
		bodyModel[20].setRotationPoint(8F, 13F, -7F);

		bodyModel[21].addShapeBox(-0.1F, 0F, 0F, 0, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, 0F, -6F, -12F); // Box 23
		bodyModel[21].setRotationPoint(-8F, 13F, 3F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}