//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelRechargeStation extends Model3DBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelRechargeStation()
	{
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 48

		bodyModel[0].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, 0F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 3, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-8F, 13F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(-4F, 0F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[3].setRotationPoint(-3F, 0F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(-6F, 0F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[5].setRotationPoint(-8F, 0F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(1F, 0F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[7].setRotationPoint(3F, 0F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[8].setRotationPoint(4F, 0F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(6F, 0F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-6F, 0F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 20
		bodyModel[11].setRotationPoint(-4F, 0F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[12].setRotationPoint(-8F, 0F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F); // Box 22
		bodyModel[13].setRotationPoint(1F, 0F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F); // Box 23
		bodyModel[14].setRotationPoint(-3F, 0F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 24
		bodyModel[15].setRotationPoint(3F, 0F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[16].setRotationPoint(4F, 0F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[17].setRotationPoint(6F, 0F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(-8F, 0F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[19].setRotationPoint(6F, 0F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 29
		bodyModel[20].setRotationPoint(-1F, 0F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(-1F, 0F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 12, 9, 12, 0F); // Box 31
		bodyModel[22].setRotationPoint(-6F, 3F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(-8F, 12F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 33
		bodyModel[24].setRotationPoint(-8F, 3F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 34
		bodyModel[25].setRotationPoint(-8F, 5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(-8F, 7F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-8F, 9F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-8F, 9F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-8F, 7F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[30].setRotationPoint(-8F, 5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[31].setRotationPoint(-8F, 3F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[32].setRotationPoint(6F, 9F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[33].setRotationPoint(6F, 9F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[34].setRotationPoint(6F, 7F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 44
		bodyModel[35].setRotationPoint(6F, 5F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[36].setRotationPoint(6F, 3F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(6F, 3F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[38].setRotationPoint(6F, 5F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[39].setRotationPoint(6F, 7F, 6F);

		this.flip(this.bodyModel);
	}
}