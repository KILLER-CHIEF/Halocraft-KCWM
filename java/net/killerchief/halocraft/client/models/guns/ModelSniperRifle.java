//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelSniperRifle extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelSniperRifle()
	{
		bodyModel = new ModelRendererTurbo[44];
		bodyModel[0] = new ModelRendererTurbo(this, 97, 157, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 62, 193, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 62, 193, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 104, 125, textureX, textureY); // Box 18
		bodyModel[4] = new ModelRendererTurbo(this, 104, 125, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 104, 125, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 54, 113, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 54, 113, textureX, textureY); // Box 22
		bodyModel[8] = new ModelRendererTurbo(this, 54, 151, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 50, 129, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 125, 105, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 105, 87, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 105, 87, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 105, 87, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 114, 139, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 125, 105, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 125, 104, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 176, 108, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 198, 108, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 198, 108, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 77, 106, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 77, 106, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 77, 106, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 77, 106, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 54, 210, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 54, 210, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 54, 231, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 54, 231, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 115, 201, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 115, 201, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 149, 164, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 190, 173, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 179, 167, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 186, 190, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 41, 159, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 41, 159, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 41, 159, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 29, 159, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 146, 95, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 146, 95, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 147, 97, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 151, 165, textureX, textureY); // Box 45

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 18, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, -1F, -5F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 7, 8, 0F); // Box 16
		bodyModel[1].setRotationPoint(0F, -1F, 13F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 3, 8, 0F); // Box 17
		bodyModel[2].setRotationPoint(0F, 3F, 21F);

		bodyModel[3].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[3].setRotationPoint(1F, 0F, 21F);

		bodyModel[4].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 19
		bodyModel[4].setRotationPoint(1F, 3F, 21F);

		bodyModel[5].addBox(0F, -1F, 0F, 4, 2, 8, 0F); // Box 20
		bodyModel[5].setRotationPoint(1F, 1F, 21F);

		bodyModel[6].addShapeBox(0F, -1F, 0F, 3, 1, 33, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[6].setRotationPoint(1.5F, 0.5F, 28F);

		bodyModel[7].addShapeBox(0F, -1F, 0F, 3, 1, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[7].setRotationPoint(1.5F, 2.5F, 28F);

		bodyModel[8].addBox(0F, -1F, 0F, 3, 1, 33, 0F); // Box 23
		bodyModel[8].setRotationPoint(1.5F, 1.5F, 28F);

		bodyModel[9].addBox(0F, -1F, 0F, 5, 3, 6, 0F); // Box 24
		bodyModel[9].setRotationPoint(0.5F, 0.5F, 54F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[10].setRotationPoint(0F, -6F, 3F);

		bodyModel[11].addShapeBox(0F, -1F, 0F, 3, 1, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(1F, -4F, 15F);

		bodyModel[12].addShapeBox(0F, -1F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(1F, -2F, 15F);

		bodyModel[13].addBox(0F, -1F, 0F, 3, 1, 9, 0F); // Box 29
		bodyModel[13].setRotationPoint(1F, -3F, 15F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 30
		bodyModel[14].setRotationPoint(1F, -2F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(0F, -3F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 2, 13, 0F); // Box 17
		bodyModel[16].setRotationPoint(0F, -5F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 3, 2, 0F); // Box 18
		bodyModel[17].setRotationPoint(1F, -5.5F, 1F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(1F, -5.5F, 0F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 20
		bodyModel[19].setRotationPoint(8F, -5.5F, 0F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 21
		bodyModel[20].setRotationPoint(-1F, -5F, 26F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 22
		bodyModel[21].setRotationPoint(6F, -5F, 26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-1F, -6F, 26F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-1F, 2F, 26F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 25
		bodyModel[24].setRotationPoint(0F, 4F, 26F);
		bodyModel[24].rotateAngleX = 1.04719755F;
		bodyModel[24].rotateAngleZ = -0.41887902F;

		bodyModel[25].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 26
		bodyModel[25].setRotationPoint(5F, 4F, 26F);
		bodyModel[25].rotateAngleX = 1.04719755F;
		bodyModel[25].rotateAngleZ = 0.41887902F;

		bodyModel[26].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 27
		bodyModel[26].setRotationPoint(-3F, 10F, 36F);
		bodyModel[26].rotateAngleX = 1.04719755F;
		bodyModel[26].rotateAngleZ = -0.41887902F;

		bodyModel[27].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 28
		bodyModel[27].setRotationPoint(7F, 10F, 36.3F);
		bodyModel[27].rotateAngleX = 1.04719755F;
		bodyModel[27].rotateAngleZ = 0.41887902F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 29
		bodyModel[28].setRotationPoint(1F, 6F, 26F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 30
		bodyModel[29].setRotationPoint(1F, 8F, 16F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 6, 9, 0F); // Box 31
		bodyModel[30].setRotationPoint(2F, 5F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 32
		bodyModel[31].setRotationPoint(1.5F, 10F, 3F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 13, 0F); // Box 33
		bodyModel[32].setRotationPoint(0F, -1F, -18F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 5, 11, 0F); // Box 34
		bodyModel[33].setRotationPoint(0F, 5F, -18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(0F, 6F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[35].setRotationPoint(0F, 5F, -3F);

		bodyModel[36].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(1.5F, 6F, 28F);

		bodyModel[37].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(1.5F, 4F, 28F);

		bodyModel[38].addBox(0F, -1F, 0F, 3, 1, 6, 0F); // Box 40
		bodyModel[38].setRotationPoint(1.5F, 5F, 28F);

		bodyModel[39].addBox(0F, -1F, 0F, 1, 1, 2, 0F); // Box 41
		bodyModel[39].setRotationPoint(2.5F, 5F, 34F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(1F, -7F, 4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(1F, -7F, 6F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 44
		bodyModel[42].setRotationPoint(1F, -7F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 45
		bodyModel[43].setRotationPoint(-1F, 0F, 5F);

		//translateAll(0F, 0F, 0F);
		//flipAll();
		
		flip(bodyModel);
	}
}