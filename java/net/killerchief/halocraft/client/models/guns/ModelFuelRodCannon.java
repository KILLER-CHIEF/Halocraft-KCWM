//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelFuelRodCannon extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelFuelRodCannon()
	{
		bodyModel = new ModelRendererTurbo[32];
		bodyModel[0] = new ModelRendererTurbo(this, 75, 158, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 160, 100, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 166, 124, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 160, 161, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 160, 172, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 160, 161, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 30, 88, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 46, 99, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 23, 100, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 30, 69, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 100, 100, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 92, 64, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 113, 64, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 136, 64, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 92, 64, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 113, 64, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 136, 64, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 41, 114, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 41, 125, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 37, 136, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 75, 123, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 75, 133, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 100, 128, textureX, textureY); // Box 33

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 49, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(1F, -2F, -31F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -10F, -31F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 4, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(1F, -6F, -32F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(3F, -10F, -23F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 8
		bodyModel[4].setRotationPoint(2.5F, -10.2F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 11
		bodyModel[5].setRotationPoint(3F, -9F, -23F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[6].setRotationPoint(3F, -12F, -23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 13
		bodyModel[7].setRotationPoint(3F, -11F, -23F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 14
		bodyModel[8].setRotationPoint(3F, -7F, -23F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(3F, -8F, -23F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(2.5F, -12.2F, -21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(1F, -2F, 18F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[12].setRotationPoint(1F, 1F, 18F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 20
		bodyModel[13].setRotationPoint(0F, -8F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F); // Box 21
		bodyModel[14].setRotationPoint(0F, -4F, 14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F); // Box 22
		bodyModel[15].setRotationPoint(7F, -4F, 14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 23
		bodyModel[16].setRotationPoint(0F, -10F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(0F, -4F, -20F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 3F, -4F); // Box 25
		bodyModel[18].setRotationPoint(0F, -4F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 26
		bodyModel[19].setRotationPoint(0F, -10F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(0F, -10F, -16F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(0F, -10F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 2F, -4F); // Box 23
		bodyModel[22].setRotationPoint(7F, -4F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 24
		bodyModel[23].setRotationPoint(7F, -10F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(7F, -10F, -16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -5F, -1F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(7F, -10F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 28
		bodyModel[26].setRotationPoint(0F, 2F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, -1F, 0F, -4F, -1F, 0F, -4F); // Box 29
		bodyModel[27].setRotationPoint(0F, 7F, 1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, -1F, -1F, 1F); // Box 30
		bodyModel[28].setRotationPoint(0F, 9F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		bodyModel[29].setRotationPoint(2F, 2F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		bodyModel[30].setRotationPoint(2F, 4F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(0F, 0F, -20F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}