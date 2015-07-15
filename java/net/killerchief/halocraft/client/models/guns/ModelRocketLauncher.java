//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelRocketLauncher extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelRocketLauncher()
	{
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this, 69, 203, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 26, 226, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 11, 80, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 10, 134, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 11, 189, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 10, 134, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 11, 80, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 11, 189, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 200, 110, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 182, 120, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 179, 132, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 70, 54, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 90, 52, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 154, 166, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 75, 134, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 69, 81, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 89, 6, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 102, 10, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 95, 9, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 109, 185, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 85, 216, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 35, 155, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 25, 197, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 175, 108, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 17, 162, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 15, 141, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 82, 157, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 119, 215, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 142, 226, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 145, 216, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 91, 219, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 28, 45, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 85, 53, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 43

		bodyModel[0].addBox(0F, 0F, 0F, 9, 7, 2, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(0F, -8F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, -9F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(0F, -1F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 50, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(1F, -5.5F, -28F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 50, 0F); // Box 7
		bodyModel[4].setRotationPoint(1F, -4.5F, -28F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 50, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(1F, -3.5F, -28F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 50, 0F); // Box 9
		bodyModel[6].setRotationPoint(4F, -6.5F, -28F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 50, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(4F, -7.5F, -28F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 50, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(4F, -5.5F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(0.5F, -8.5F, -26F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 13
		bodyModel[10].setRotationPoint(0.5F, -6.5F, -26F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(0.5F, -3.5F, -26F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 15
		bodyModel[12].setRotationPoint(3F, -7F, -30F);
		bodyModel[12].rotateAngleX = 0.27925268F;

		bodyModel[13].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 16
		bodyModel[13].setRotationPoint(3F, -3F, -30F);
		bodyModel[13].rotateAngleX = -0.26179939F;

		bodyModel[14].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 17
		bodyModel[14].setRotationPoint(3F, -7F, -30F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 5, 16, 0F); // Box 18
		bodyModel[15].setRotationPoint(0.5F, -7.5F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(0.5F, -8.5F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(0.5F, -2.5F, -12F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 21
		bodyModel[18].setRotationPoint(5F, -8F, 10F);
		bodyModel[18].rotateAngleZ = -0.87266463F;

		bodyModel[19].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 22
		bodyModel[19].setRotationPoint(7.5F, -5.5F, 10F);
		bodyModel[19].rotateAngleZ = -0.89011792F;

		bodyModel[20].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 23
		bodyModel[20].setRotationPoint(7.5F, -5.5F, 10F);
		bodyModel[20].rotateAngleZ = -2.70526034F;

		bodyModel[21].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 24
		bodyModel[21].setRotationPoint(6.8F, -7.2F, 10F);
		bodyModel[21].rotateAngleZ = -1.95476876F;

		bodyModel[22].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 26
		bodyModel[22].setRotationPoint(0.2F, -4.2F, 10F);
		bodyModel[22].rotateAngleZ = 0.62831853F;

		bodyModel[23].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 27
		bodyModel[23].setRotationPoint(1.2F, -2.8F, 10F);
		bodyModel[23].rotateAngleZ = 1.08210414F;

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 28
		bodyModel[24].setRotationPoint(3F, -1F, 3F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 29
		bodyModel[25].setRotationPoint(3F, -1.5F, 13F);
		bodyModel[25].rotateAngleZ = -0.52359878F;

		bodyModel[26].addBox(0F, 0F, 0F, 9, 7, 2, 0F); // Box 30
		bodyModel[26].setRotationPoint(0F, -8F, 1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(0F, -1F, 1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(0F, -9F, 1F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 7, 10, 0F); // Box 33
		bodyModel[29].setRotationPoint(7F, -8F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(2F, -9F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(2F, -1F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 36
		bodyModel[32].setRotationPoint(3F, -0.5F, -4F);
		bodyModel[32].rotateAngleX = 0.2443461F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 37
		bodyModel[33].setRotationPoint(3F, 6F, -2F);
		bodyModel[33].rotateAngleX = 0.26179939F;

		bodyModel[34].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 38
		bodyModel[34].setRotationPoint(3F, 0F, 3F);
		bodyModel[34].rotateAngleX = -1.60570291F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(3F, -0.5F, -11F);
		bodyModel[35].rotateAngleX = -0.01745329F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(3F, -1.5F, -23F);
		bodyModel[36].rotateAngleX = -0.01745329F;

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 41
		bodyModel[37].setRotationPoint(1F, -9F, -7F);
		bodyModel[37].rotateAngleZ = -0.03490659F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 42
		bodyModel[38].setRotationPoint(1F, -9F, -2F);
		bodyModel[38].rotateAngleZ = -0.03490659F;

		bodyModel[39].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 43
		bodyModel[39].setRotationPoint(1F, -9F, -7F);
		bodyModel[39].rotateAngleZ = -0.03490659F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}