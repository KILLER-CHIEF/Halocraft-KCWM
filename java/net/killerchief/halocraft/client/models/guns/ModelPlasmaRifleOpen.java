//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelPlasmaRifleOpen extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelPlasmaRifleOpen()
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 13, 55, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 15, 68, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 32, 38, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 37, 68, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 74, 66, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 137, 37, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 128, 69, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 130, 32, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 130, 32, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 136, 87, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 136, 87, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 74, 59, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 102, 53, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 102, 53, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 74, 59, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 115, 12, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 115, 12, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 65, 12, textureX, textureY); // Box 19

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 5, 20, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(0F, -5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 2
		bodyModel[1].setRotationPoint(2F, 0F, 11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(2F, 5F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, -1.5F, 0F, 1F, -1.6F, 0F, 1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, -4F, 9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 1F, -1.6F, 0F, 1F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 5
		bodyModel[4].setRotationPoint(0F, 8F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 6
		bodyModel[5].setRotationPoint(0F, 8F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, -3F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F); // Box 9
		bodyModel[7].setRotationPoint(0F, 9F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		bodyModel[8].setRotationPoint(8F, -2F, -19F);
		bodyModel[8].rotateAngleY = 0.43633231F;
		bodyModel[8].rotateAngleZ = 1.3962634F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-1F, -1.5F, -19F);
		bodyModel[9].rotateAngleY = -0.19198622F;
		bodyModel[9].rotateAngleZ = 1.74532925F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[10].setRotationPoint(8F, 9F, -14F);
		bodyModel[10].rotateAngleY = 0.43633231F;
		bodyModel[10].rotateAngleZ = 1.3962634F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-1F, 9.5F, -14F);
		bodyModel[11].rotateAngleY = -0.19198622F;
		bodyModel[11].rotateAngleZ = 1.74532925F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 14
		bodyModel[12].setRotationPoint(3F, 0F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[13].setRotationPoint(3F, 0F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 17
		bodyModel[14].setRotationPoint(3F, 5F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 18
		bodyModel[15].setRotationPoint(3F, 4F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-3F, -2F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 17
		bodyModel[17].setRotationPoint(-3F, -1F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 0, 7, 0F); // Box 18
		bodyModel[18].setRotationPoint(7F, -1F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(10F, -2F, -6F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}