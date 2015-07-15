//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSentinelBeam extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelSentinelBeam()
	{
		bodyModel = new ModelRendererTurbo[23];
		bodyModel[0] = new ModelRendererTurbo(this, 83, 46, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 36, 45, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 36, 45, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 77, 20, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 83, 70, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 36, 76, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 36, 76, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 36, 76, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 108, 24, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 36, 92, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 36, 76, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 36, 108, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 131, 46, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 131, 79, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 154, 79, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 87, 74, textureX, textureY); // Box 35

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(0F, -4F, 3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(1F, 2F, 7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(1F, 4F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 3
		bodyModel[3].setRotationPoint(1F, -4F, 19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(1F, -6F, 3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(1F, 0F, 3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(1F, 4F, 7F);
		bodyModel[6].rotateAngleX = 0.20943951F;
		bodyModel[6].rotateAngleY = 0.80285146F;
		bodyModel[6].rotateAngleZ = -0.17453293F;

		bodyModel[7].addShapeBox(0F, -4F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(1F, 4F, 7F);
		bodyModel[7].rotateAngleX = 0.20943951F;
		bodyModel[7].rotateAngleY = 0.80285146F;
		bodyModel[7].rotateAngleZ = -0.17453293F;

		bodyModel[8].addShapeBox(0F, -5F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(1F, 4F, 7F);
		bodyModel[8].rotateAngleX = 0.20943951F;
		bodyModel[8].rotateAngleY = 0.80285146F;
		bodyModel[8].rotateAngleZ = -0.17453293F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(0F, -5F, 4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[10].setRotationPoint(0F, -6F, 4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(5F, -6F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(5F, -5F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(1F, -6F, 17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(4F, -6F, 17F);

		bodyModel[15].addShapeBox(1F, -5F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(3.5F, 4.5F, 8F);
		bodyModel[15].rotateAngleX = 0.17453293F;
		bodyModel[15].rotateAngleY = -0.80285146F;
		bodyModel[15].rotateAngleZ = 0.20943951F;

		bodyModel[16].addShapeBox(1F, -4F, 0F, 1, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(3.5F, 4.5F, 8F);
		bodyModel[16].rotateAngleX = 0.17453293F;
		bodyModel[16].rotateAngleY = -0.80285146F;
		bodyModel[16].rotateAngleZ = 0.20943951F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(3.5F, 4.5F, 8F);
		bodyModel[17].rotateAngleX = 0.17453293F;
		bodyModel[17].rotateAngleY = -0.80285146F;
		bodyModel[17].rotateAngleZ = 0.20943951F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, -3F, 6F, 0F, -3F, 6F, 0F, 13F, 0F, 0F, 13F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, -13F, 0F, -2F, -13F, 0F); // Box 31
		bodyModel[18].setRotationPoint(0F, 9F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 14, 5, 0F); // Box 32
		bodyModel[19].setRotationPoint(6F, -2F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 33
		bodyModel[20].setRotationPoint(8F, -2F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 34
		bodyModel[21].setRotationPoint(-2F, 0F, -1F);
		bodyModel[21].rotateAngleX = -0.68067841F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(6F, 0F, -1F);
		bodyModel[22].rotateAngleX = -0.68067841F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}