//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelNeedler extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelNeedler()
	{
		bodyModel = new ModelRendererTurbo[22];
		bodyModel[0] = new ModelRendererTurbo(this, 76, 45, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 71, 139, textureX, textureY); // Box 17
		bodyModel[2] = new ModelRendererTurbo(this, 38, 89, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 38, 122, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 116, 101, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 85, 82, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 107, 71, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 41
		bodyModel[9] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 42
		bodyModel[10] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 43
		bodyModel[11] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 44
		bodyModel[12] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 45
		bodyModel[13] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 46
		bodyModel[14] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 46, 108, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 82, 108, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 96, 23, textureX, textureY); // Box 21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 5, 16, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(0F, -4F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 5, 26, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 17
		bodyModel[1].setRotationPoint(0F, 7F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[2].setRotationPoint(0F, -2F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -2F, 0F, -2F, -2F, 0F); // Box 25
		bodyModel[3].setRotationPoint(0F, 5F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[4].setRotationPoint(0F, 0F, 3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[5].setRotationPoint(2F, -2F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 0, 0, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F, 0F, -3F, -4F, 0F, -3F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 29
		bodyModel[7].setRotationPoint(1F, -4F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[8].setRotationPoint(-1F, -14F, -8F);
		bodyModel[8].rotateAngleX = 0.38397244F;
		bodyModel[8].rotateAngleZ = 0.17453293F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[9].setRotationPoint(-1F, -12F, -10F);
		bodyModel[9].rotateAngleX = 0.38397244F;
		bodyModel[9].rotateAngleZ = 0.17453293F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[10].setRotationPoint(7F, -14F, -8F);
		bodyModel[10].rotateAngleX = 0.38397244F;
		bodyModel[10].rotateAngleZ = -0.17453293F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[11].setRotationPoint(7F, -12F, -10F);
		bodyModel[11].rotateAngleX = 0.38397244F;
		bodyModel[11].rotateAngleZ = -0.20943951F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[12].setRotationPoint(7F, -11F, -4F);
		bodyModel[12].rotateAngleX = 0.38397244F;
		bodyModel[12].rotateAngleZ = -0.20943951F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[13].setRotationPoint(-1F, -11F, -4F);
		bodyModel[13].rotateAngleX = 0.38397244F;
		bodyModel[13].rotateAngleZ = 0.17453293F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[14].setRotationPoint(-1F, -10F, -1F);
		bodyModel[14].rotateAngleX = 0.38397244F;
		bodyModel[14].rotateAngleZ = 0.17453293F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[15].setRotationPoint(7F, -10F, -1F);
		bodyModel[15].rotateAngleX = 0.38397244F;
		bodyModel[15].rotateAngleZ = -0.20943951F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 49
		bodyModel[16].setRotationPoint(0F, 3F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[17].setRotationPoint(2F, 4F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(3F, -12F, -1F);
		bodyModel[18].rotateAngleX = 0.38397244F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(3F, -14F, -10F);
		bodyModel[19].rotateAngleX = 0.38397244F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(3F, -16F, -8F);
		bodyModel[20].rotateAngleX = 0.38397244F;
		bodyModel[20].rotateAngleZ = 0.03490659F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(3F, -13F, -4F);
		bodyModel[21].rotateAngleX = 0.38397244F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}
}