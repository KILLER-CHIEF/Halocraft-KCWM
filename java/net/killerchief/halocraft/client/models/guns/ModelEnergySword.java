//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelEnergySword extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelEnergySword()
	{
		bodyModel = new ModelRendererTurbo[14];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 80, 0, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 105, 0, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 130, 0, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 150, 0, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 165, 0, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 180, 0, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 180, 0, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 195, 0, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 210, 0, textureX, textureY); // Box 12

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Shape2
		bodyModel[0].setRotationPoint(2F, -1F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(2F, 6F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(2F, 2F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 2F, -1F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 2F, -1F, -1F, 2F); // Box 2
		bodyModel[3].setRotationPoint(2F, 2F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[4].setRotationPoint(2F, -3F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[5].setRotationPoint(2F, 9F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 5
		bodyModel[6].setRotationPoint(4F, -9F, -14F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 5, 6, 0F); // Box 6
		bodyModel[7].setRotationPoint(4F, -9F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 7
		bodyModel[8].setRotationPoint(4F, -9F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 8
		bodyModel[9].setRotationPoint(4F, -3F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 9
		bodyModel[10].setRotationPoint(4F, 6F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 10
		bodyModel[11].setRotationPoint(4F, 11F, 0F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 5, 6, 0F); // Box 11
		bodyModel[12].setRotationPoint(4F, 12F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[13].setRotationPoint(4F, 9F, -14F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}