//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSpartanLaser extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelSpartanLaser()
	{
		bodyModel = new ModelRendererTurbo[38];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 34, 83, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 34, 107, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 34, 83, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 95, 111, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 11, 150, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 11, 149, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 9, 148, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 10, 149, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 105, 66, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 21, 67, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 21, 67, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 21, 67, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 115, 96, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 91, 96, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 177, 43, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 177, 43, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 177, 43, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 33, 43, textureX, textureY); // Box 39

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 14, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-1F, -8F, -36F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 3, 12, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1F, -8F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-1F, -9F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-1F, -8F, 12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-1F, -9F, 12F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(-1F, -1F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(1F, -5F, -1F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 16, 0F); // Box 7
		bodyModel[7].setRotationPoint(1F, -4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(1F, -2F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 9
		bodyModel[9].setRotationPoint(1F, 2F, 11F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 7, 36, 0F); // Box 10
		bodyModel[10].setRotationPoint(-1F, -5F, -36F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 11
		bodyModel[11].setRotationPoint(1F, 2F, -4F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 12
		bodyModel[12].setRotationPoint(1F, 5F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		bodyModel[13].setRotationPoint(1F, 3F, 2F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 14
		bodyModel[14].setRotationPoint(1F, 2F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		bodyModel[15].setRotationPoint(1F, 2F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[16].setRotationPoint(1F, 8F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 17
		bodyModel[17].setRotationPoint(1F, 2F, -14F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 18
		bodyModel[18].setRotationPoint(1F, 2F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(1F, 2F, -23F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 23, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-1F, -6F, -23F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 23
		bodyModel[21].setRotationPoint(-1F, 1F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-1F, -5F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(6F, -5F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 26
		bodyModel[24].setRotationPoint(6F, -2F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 27
		bodyModel[25].setRotationPoint(-1F, -2F, 0F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 28
		bodyModel[26].setRotationPoint(1F, 2F, -27F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 9, 0F); // Box 29
		bodyModel[27].setRotationPoint(1F, 2F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		bodyModel[28].setRotationPoint(1F, 4F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		bodyModel[29].setRotationPoint(2F, 2.5F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(2F, 4.5F, -4F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 33
		bodyModel[31].setRotationPoint(2F, 3.5F, -4F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 34
		bodyModel[32].setRotationPoint(-4F, -2F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[33].setRotationPoint(-5F, -2F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(2.5F, -1F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[35].setRotationPoint(2.5F, 2F, 17F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 38
		bodyModel[36].setRotationPoint(2.5F, 0F, 22F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 39
		bodyModel[37].setRotationPoint(1F, 2F, 15F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}