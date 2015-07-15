//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.vehicles;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelGhostDamage4 extends Model3DBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelGhostDamage4()
	{
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 228, 257, textureX, textureY); // Import StevesRightArm
		bodyModel[1] = new ModelRendererTurbo(this, 161, 259, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 190, 318, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 237, 318, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 283, 328, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 100, 309, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 175, 193, textureX, textureY); // Box 32
		bodyModel[7] = new ModelRendererTurbo(this, 231, 192, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 119, 133, textureX, textureY); // Box 43
		bodyModel[9] = new ModelRendererTurbo(this, 90, 132, textureX, textureY); // Box 44
		bodyModel[10] = new ModelRendererTurbo(this, 96, 147, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 115, 171, textureX, textureY); // Box 46
		bodyModel[12] = new ModelRendererTurbo(this, 88, 171, textureX, textureY); // Box 47
		bodyModel[13] = new ModelRendererTurbo(this, 78, 159, textureX, textureY); // Box 49
		bodyModel[14] = new ModelRendererTurbo(this, 78, 159, textureX, textureY); // Box 50
		bodyModel[15] = new ModelRendererTurbo(this, 100, 199, textureX, textureY); // Box 51
		bodyModel[16] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 52
		bodyModel[17] = new ModelRendererTurbo(this, 100, 199, textureX, textureY); // Box 53
		bodyModel[18] = new ModelRendererTurbo(this, 101, 201, textureX, textureY); // Box 54
		bodyModel[19] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 55
		bodyModel[20] = new ModelRendererTurbo(this, 100, 201, textureX, textureY); // Box 56
		bodyModel[21] = new ModelRendererTurbo(this, 146, 200, textureX, textureY); // Box 57
		bodyModel[22] = new ModelRendererTurbo(this, 146, 200, textureX, textureY); // Box 58
		bodyModel[23] = new ModelRendererTurbo(this, 146, 200, textureX, textureY); // Box 59
		bodyModel[24] = new ModelRendererTurbo(this, 99, 103, textureX, textureY); // Box 61
		bodyModel[25] = new ModelRendererTurbo(this, 139, 362, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 123, 362, textureX, textureY); // Box 64
		bodyModel[27] = new ModelRendererTurbo(this, 121, 376, textureX, textureY); // Box 69
		bodyModel[28] = new ModelRendererTurbo(this, 121, 376, textureX, textureY); // Box 70
		bodyModel[29] = new ModelRendererTurbo(this, 336, 354, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 312, 355, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 320, 354, textureX, textureY); // Box 64
		bodyModel[32] = new ModelRendererTurbo(this, 119, 133, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 86, 145, textureX, textureY); // Box 64
		bodyModel[34] = new ModelRendererTurbo(this, 161, 259, textureX, textureY); // Box 69
		bodyModel[35] = new ModelRendererTurbo(this, 161, 259, textureX, textureY); // Box 70
		bodyModel[36] = new ModelRendererTurbo(this, 283, 358, textureX, textureY); // Box 59
		bodyModel[37] = new ModelRendererTurbo(this, 283, 358, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 283, 374, textureX, textureY); // Box 61
		bodyModel[39] = new ModelRendererTurbo(this, 283, 374, textureX, textureY); // Box 62
		bodyModel[40] = new ModelRendererTurbo(this, 207, 257, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 19, 18, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import StevesRightArm
		bodyModel[0].setRotationPoint(1F, -11F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 19, 18, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(10F, -11F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 15, 6, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -6F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[2].setRotationPoint(10F, -7F, 15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 15, 6, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(1F, -7F, 15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 10, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, 8F, 1F, -1F, 7F); // Box 19
		bodyModel[4].setRotationPoint(-9F, -2F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[5].setRotationPoint(-9F, -3F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 8, 12, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[6].setRotationPoint(10F, -2F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 8, 12, 0F, -6F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[7].setRotationPoint(0F, -2F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -3.5F, -2F, 0F, -3.5F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[8].setRotationPoint(-2F, -3F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[9].setRotationPoint(-2F, -3F, -4F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 45
		bodyModel[10].setRotationPoint(-2F, 1F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[11].setRotationPoint(-2F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 47
		bodyModel[12].setRotationPoint(-2F, 3F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 49
		bodyModel[13].setRotationPoint(-2.5F, 6F, -7.5F);
		bodyModel[13].rotateAngleX = 2.19911486F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 50
		bodyModel[14].setRotationPoint(-2.5F, 4F, 1F);
		bodyModel[14].rotateAngleX = -2.19911486F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[15].setRotationPoint(17F, -1F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 52
		bodyModel[16].setRotationPoint(17F, 0F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 53
		bodyModel[17].setRotationPoint(17F, 2F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[18].setRotationPoint(0F, -1F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 55
		bodyModel[19].setRotationPoint(0F, 0F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 56
		bodyModel[20].setRotationPoint(0F, 2F, -6F);

		bodyModel[21].addShapeBox(0F, 1F, 2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 57
		bodyModel[21].setRotationPoint(16F, -5F, -11F);
		bodyModel[21].rotateAngleX = -0.15707963F;
		bodyModel[21].rotateAngleY = -0.20943951F;
		bodyModel[21].rotateAngleZ = -0.40142573F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 58
		bodyModel[22].setRotationPoint(16F, -5F, -11F);
		bodyModel[22].rotateAngleX = -0.15707963F;
		bodyModel[22].rotateAngleY = -0.20943951F;
		bodyModel[22].rotateAngleZ = -0.40142573F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 59
		bodyModel[23].setRotationPoint(4F, -4F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 61
		bodyModel[24].setRotationPoint(-12F, 3F, 12F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 63
		bodyModel[25].setRotationPoint(-2F, 2F, 15F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 64
		bodyModel[26].setRotationPoint(-2F, 2F, 19F);
		bodyModel[26].rotateAngleX = 0.15707963F;
		bodyModel[26].rotateAngleY = -0.10471976F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[27].setRotationPoint(-2F, 3.5F, 19F);
		bodyModel[27].rotateAngleX = -0.26179939F;

		bodyModel[28].addShapeBox(0F, 1F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[28].setRotationPoint(-2F, 3.5F, 19F);
		bodyModel[28].rotateAngleX = -0.26179939F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 14, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 61
		bodyModel[29].setRotationPoint(-14F, -2F, 7F);
		bodyModel[29].rotateAngleX = 0.87266463F;

		bodyModel[30].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 62
		bodyModel[30].setRotationPoint(-11F, -2F, 11F);
		bodyModel[30].rotateAngleX = 0.71558499F;

		bodyModel[31].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 64
		bodyModel[31].setRotationPoint(-14F, -2F, 9F);
		bodyModel[31].rotateAngleX = 0.78539816F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -3.5F, -2F, 0F, -3.5F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[32].setRotationPoint(2F, -3F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[33].setRotationPoint(-1F, -2F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 69
		bodyModel[34].setRotationPoint(12F, -7F, 13F);
		bodyModel[34].rotateAngleZ = -0.43633231F;

		bodyModel[35].addBox(-2F, 0F, 0F, 2, 4, 2, 0F); // Box 70
		bodyModel[35].setRotationPoint(8F, -7F, 13F);
		bodyModel[35].rotateAngleZ = 0.41887902F;

		bodyModel[36].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 59
		bodyModel[36].setRotationPoint(16F, -2F, 9F);
		bodyModel[36].rotateAngleX = 0.78539816F;

		bodyModel[37].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 60
		bodyModel[37].setRotationPoint(16F, -2F, 11F);
		bodyModel[37].rotateAngleX = 0.31415927F;

		bodyModel[38].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 61
		bodyModel[38].setRotationPoint(16F, 1F, 10F);
		bodyModel[38].rotateAngleX = 0.78539816F;
		bodyModel[38].rotateAngleZ = -0.40142573F;

		bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 62
		bodyModel[39].setRotationPoint(16F, 1F, 11F);
		bodyModel[39].rotateAngleX = 0.78539816F;
		bodyModel[39].rotateAngleZ = 0.38397244F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 55
		bodyModel[40].setRotationPoint(9F, -12F, -2F);
		bodyModel[40].rotateAngleX = -0.2268928F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(bodyModel);
	}
}