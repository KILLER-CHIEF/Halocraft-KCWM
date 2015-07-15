//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelFlamethrower extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelFlamethrower()
	{
		bodyModel = new ModelRendererTurbo[39];
		bodyModel[0] = new ModelRendererTurbo(this, 99, 80, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 102, 118, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 102, 152, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 15
		bodyModel[17] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 16
		bodyModel[18] = new ModelRendererTurbo(this, 165, 74, textureX, textureY); // Box 17
		bodyModel[19] = new ModelRendererTurbo(this, 165, 97, textureX, textureY); // Box 18
		bodyModel[20] = new ModelRendererTurbo(this, 165, 97, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 11, 96, textureX, textureY); // Box 20
		bodyModel[22] = new ModelRendererTurbo(this, 54, 53, textureX, textureY); // Box 21
		bodyModel[23] = new ModelRendererTurbo(this, 54, 75, textureX, textureY); // Box 22
		bodyModel[24] = new ModelRendererTurbo(this, 17, 77, textureX, textureY); // Box 23
		bodyModel[25] = new ModelRendererTurbo(this, 16, 52, textureX, textureY); // Box 24
		bodyModel[26] = new ModelRendererTurbo(this, 29, 116, textureX, textureY); // Box 25
		bodyModel[27] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 99, 79, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 63, 183, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 92, 194, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 116, 48, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 104, 48, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 124, 40, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 34, 162, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 35, 148, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 34, 178, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 76, 158, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 76, 139, textureX, textureY); // Box 38

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(-2F, 6F, -4F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 0
		bodyModel[1].setRotationPoint(8F, 6F, -4F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 1
		bodyModel[2].setRotationPoint(-2F, 8F, 14F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 2
		bodyModel[3].setRotationPoint(8F, 8F, 14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 3
		bodyModel[4].setRotationPoint(-2F, 14F, 14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 4
		bodyModel[5].setRotationPoint(8F, 14F, 14F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 5
		bodyModel[6].setRotationPoint(-2F, 18F, 1F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 6
		bodyModel[7].setRotationPoint(8F, 18F, 1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[8].setRotationPoint(0F, 10F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 4, 9, 0F); // Box 8
		bodyModel[9].setRotationPoint(0F, 13F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[10].setRotationPoint(0F, 17F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 10
		bodyModel[11].setRotationPoint(8F, 11F, 1F);
		bodyModel[11].rotateAngleX = -0.52359878F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 11
		bodyModel[12].setRotationPoint(8F, 8F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[13].setRotationPoint(-2F, 8F, 0F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 13
		bodyModel[14].setRotationPoint(8.5F, 17F, 10F);
		bodyModel[14].rotateAngleX = -0.52359878F;

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 14
		bodyModel[15].setRotationPoint(8.5F, 11F, -1F);
		bodyModel[15].rotateAngleX = -0.52359878F;

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 11, 0F); // Box 15
		bodyModel[16].setRotationPoint(-2F, 11F, 1F);
		bodyModel[16].rotateAngleX = -0.52359878F;

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 16
		bodyModel[17].setRotationPoint(-1.5F, 11F, -1F);
		bodyModel[17].rotateAngleX = -0.52359878F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 17
		bodyModel[18].setRotationPoint(-1.5F, 17F, 10F);
		bodyModel[18].rotateAngleX = -0.52359878F;

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 18
		bodyModel[19].setRotationPoint(9.5F, 12F, 4.5F);
		bodyModel[19].rotateAngleX = -0.12217305F;
		bodyModel[19].rotateAngleY = 0.48869219F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 19
		bodyModel[20].setRotationPoint(5F, 9F, 0F);
		bodyModel[20].rotateAngleX = -0.38397244F;
		bodyModel[20].rotateAngleY = -0.6981317F;

		bodyModel[21].addBox(0F, 0F, 0F, 4, 5, 34, 0F); // Box 20
		bodyModel[21].setRotationPoint(2F, 8F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[22].setRotationPoint(-2F, 5F, 16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 22
		bodyModel[23].setRotationPoint(-2F, 11F, 16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 23
		bodyModel[24].setRotationPoint(9F, 11F, 16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[25].setRotationPoint(7F, 5F, 16F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1.5F, -1F, -1F, 1.5F); // Box 25
		bodyModel[26].setRotationPoint(2F, 8F, 30F);

		bodyModel[27].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 27
		bodyModel[27].setRotationPoint(0F, 6F, -4F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 28
		bodyModel[28].setRotationPoint(0F, 18F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 4, 10, 0F); // Box 29
		bodyModel[29].setRotationPoint(0F, 6F, -14F);

		bodyModel[30].addShapeBox(0F, 0F, -8F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 30
		bodyModel[30].setRotationPoint(0F, 10F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 31
		bodyModel[31].setRotationPoint(1F, 6F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-4F, 0F, 11F);
		bodyModel[32].rotateAngleZ = -0.01745329F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 33
		bodyModel[33].setRotationPoint(3F, -2F, 11F);
		bodyModel[33].rotateAngleX = -0.27925268F;

		bodyModel[34].addBox(0F, 0F, 0F, 10, 3, 8, 0F); // Box 34
		bodyModel[34].setRotationPoint(-1F, 12F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-1F, 10F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 36
		bodyModel[36].setRotationPoint(-1F, 15F, -13F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 37
		bodyModel[37].setRotationPoint(7.5F, 14.5F, -14F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 38
		bodyModel[38].setRotationPoint(7.5F, 9.5F, -14F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}