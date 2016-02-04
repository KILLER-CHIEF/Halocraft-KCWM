//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSpiker extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelSpiker()
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 130, 29, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 137, 84, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 136, 60, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 81, 48, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 105, 63, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 150, 113, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 150, 113, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 150, 113, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 210, 68, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 210, 68, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 201, 92, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 201, 92, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 52, 83, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 58, 72, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 98, 104, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 98, 104, textureX, textureY); // Box 22

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -5F, 8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, 1F, 8F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 2, 14, 0F); // Box 1
		bodyModel[2].setRotationPoint(0F, -1F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-0.5F, -5.5F, 2F);

		bodyModel[4].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 3
		bodyModel[4].setRotationPoint(-0.5F, -3.5F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 4
		bodyModel[5].setRotationPoint(0F, -1.5F, 2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[6].setRotationPoint(-0.5F, 1.5F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 6
		bodyModel[7].setRotationPoint(-0.5F, 2.5F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[8].setRotationPoint(-0.5F, 4.5F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, -3F, 1F, -2F, -3F); // Box 9
		bodyModel[9].setRotationPoint(-0.5F, 4F, 15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, -3F, -2F, -1F, -3F); // Box 11
		bodyModel[10].setRotationPoint(5F, 4F, 15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -1F, -3F, 1.5F, -1F, -3F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(5F, 4F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -2F, -3F, -1.5F, -2F, -3F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-0.5F, 4F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(0F, -5F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(0F, -2F, 1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(0F, -3F, 1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(1F, -2F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(1F, -4F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 21
		bodyModel[18].setRotationPoint(1F, 4F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 22
		bodyModel[19].setRotationPoint(1F, 2F, -6F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}