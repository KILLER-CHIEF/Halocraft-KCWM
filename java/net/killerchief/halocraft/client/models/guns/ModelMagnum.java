//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelMagnum extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelMagnum()
	{
		bodyModel = new ModelRendererTurbo[23];
		bodyModel[0] = new ModelRendererTurbo(this, 81, 58, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 135, 58, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 102, 94, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 131, 72, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 68, 103, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 80, 120, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 103, 115, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 102, 126, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 39, 90, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 59, 65, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 59, 65, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 59, 65, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 51, 76, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 33

		bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 16, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(1F, -5F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(1F, -7F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(1F, -5F, 11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[4].setRotationPoint(1F, 0F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(1F, -5F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[6].setRotationPoint(2F, 0F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[7].setRotationPoint(2F, 7F, 0F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 13
		bodyModel[8].setRotationPoint(1.5F, 8F, -4F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 14
		bodyModel[9].setRotationPoint(1.5F, 9F, -4.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 17
		bodyModel[10].setRotationPoint(2F, -5F, 11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[11].setRotationPoint(2F, -1F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(5F, -5F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[13].setRotationPoint(1F, -2F, 11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(5F, -2F, 11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 25
		bodyModel[15].setRotationPoint(2.5F, -7F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 27
		bodyModel[16].setRotationPoint(2.5F, -6F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 28
		bodyModel[17].setRotationPoint(2.5F, -6.5F, 11F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 29
		bodyModel[18].setRotationPoint(1F, 0F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 30
		bodyModel[19].setRotationPoint(1F, 0F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 31
		bodyModel[20].setRotationPoint(2.5F, 1F, 10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 32
		bodyModel[21].setRotationPoint(2.5F, 0F, 10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 33
		bodyModel[22].setRotationPoint(2.5F, 0.5F, 10.5F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}