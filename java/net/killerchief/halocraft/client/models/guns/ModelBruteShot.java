//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelBruteShot extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelBruteShot()
	{
		bodyModel = new ModelRendererTurbo[29];
		bodyModel[0] = new ModelRendererTurbo(this, 42, 59, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 43, 88, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 93, 49, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 93, 97, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 93, 73, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 68, 28, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 93, 29, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 121, 29, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 21, 49, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 21, 49, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 21, 62, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 136, 115, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 136, 134, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 136, 47, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 136, 66, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 208, 66, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 173, 60, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 173, 82, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 208, 90, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 53, 28, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 53, 28, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 53, 22, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 141, 29, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 143, 98, textureX, textureY); // Box 34

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(0F, -2F, 3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 9, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, -2F, -1F, 4F, -2F, -1F, -1F, -4F, -1F, -1F, -4F); // Box 0
		bodyModel[1].setRotationPoint(0F, 3F, 3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(0.5F, -2F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[3].setRotationPoint(0.5F, 7F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 5, 13, 0F); // Box 3
		bodyModel[4].setRotationPoint(0.5F, 2F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 3F); // Box 4
		bodyModel[5].setRotationPoint(0F, -3F, -1F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 5
		bodyModel[6].setRotationPoint(0F, -3F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 6
		bodyModel[7].setRotationPoint(0F, -3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[8].setRotationPoint(1F, -1F, 19F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(1F, 2F, 19F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 10
		bodyModel[10].setRotationPoint(1F, 0F, 19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(1.5F, 6F, 15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(1.5F, 7F, 15F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 16
		bodyModel[13].setRotationPoint(2.5F, 4F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 17
		bodyModel[14].setRotationPoint(2.5F, 4F, 29F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 18
		bodyModel[15].setRotationPoint(2.5F, 5F, 33F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(2F, 13F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(2F, 14F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, -1F, 12F, -8F, -1F, 12F, -8F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(2F, 13F, -23F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, -8F, 0F, -6F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, -8F, -1F, 6F, -8F); // Box 22
		bodyModel[19].setRotationPoint(2F, 8F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(2F, 0F, -35F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 26
		bodyModel[21].setRotationPoint(2F, 0F, -29F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -1F, -8F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -8F, -1F, 0F, -8F); // Box 27
		bodyModel[22].setRotationPoint(2F, 5F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(2F, 3F, -35F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(0F, -6F, 17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(5F, -6F, 17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[26].setRotationPoint(1F, -6F, 13.5F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 6, 4, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[27].setRotationPoint(0F, 1F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 34
		bodyModel[28].setRotationPoint(1.5F, 14F, -2F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}