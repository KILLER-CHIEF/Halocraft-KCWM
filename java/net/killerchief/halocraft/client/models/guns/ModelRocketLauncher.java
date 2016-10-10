//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelRocketLauncher extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelRocketLauncher()
	{
		gunModel = new ModelRendererTurbo[27];
		gunModel[0] = new ModelRendererTurbo(this, 145, 189, textureX, textureY); // Import Box99
		gunModel[1] = new ModelRendererTurbo(this, 124, 190, textureX, textureY); // Import Box100
		gunModel[2] = new ModelRendererTurbo(this, 56, 221, textureX, textureY); // Import Box101
		gunModel[3] = new ModelRendererTurbo(this, 76, 216, textureX, textureY); // Import Box102
		gunModel[4] = new ModelRendererTurbo(this, 53, 150, textureX, textureY); // Import Box103
		gunModel[5] = new ModelRendererTurbo(this, 42, 219, textureX, textureY); // Import Box104
		gunModel[6] = new ModelRendererTurbo(this, 120, 93, textureX, textureY); // Import Box105
		gunModel[7] = new ModelRendererTurbo(this, 101, 97, textureX, textureY); // Import Box106
		gunModel[8] = new ModelRendererTurbo(this, 101, 97, textureX, textureY); // Import Box107
		gunModel[9] = new ModelRendererTurbo(this, 101, 96, textureX, textureY); // Import Box108
		gunModel[10] = new ModelRendererTurbo(this, 28, 214, textureX, textureY); // Import Box109
		gunModel[11] = new ModelRendererTurbo(this, 107, 86, textureX, textureY); // Import Box110
		gunModel[12] = new ModelRendererTurbo(this, 102, 111, textureX, textureY); // Import Box111
		gunModel[13] = new ModelRendererTurbo(this, 102, 123, textureX, textureY); // Import Box112
		gunModel[14] = new ModelRendererTurbo(this, 102, 123, textureX, textureY); // Import Box113
		gunModel[15] = new ModelRendererTurbo(this, 17, 226, textureX, textureY); // Import Box114
		gunModel[16] = new ModelRendererTurbo(this, 18, 219, textureX, textureY); // Import Box115
		gunModel[17] = new ModelRendererTurbo(this, 40, 194, textureX, textureY); // Import Box65
		gunModel[18] = new ModelRendererTurbo(this, 40, 154, textureX, textureY); // Import Box66
		gunModel[19] = new ModelRendererTurbo(this, 28, 224, textureX, textureY); // Import Box101
		gunModel[20] = new ModelRendererTurbo(this, 72, 222, textureX, textureY); // Import Box118
		gunModel[21] = new ModelRendererTurbo(this, 27, 52, textureX, textureY); // Import Box119
		gunModel[22] = new ModelRendererTurbo(this, 126, 174, textureX, textureY); // Box 1
		gunModel[23] = new ModelRendererTurbo(this, 125, 174, textureX, textureY); // Box 2
		gunModel[24] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 3
		gunModel[25] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 6
		gunModel[26] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 7

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box99
		gunModel[0].setRotationPoint(0F, -3F, -8.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box100
		gunModel[1].setRotationPoint(0F, -3F, 3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		gunModel[2].setRotationPoint(3F, 3F, -8.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		gunModel[3].setRotationPoint(3F, 2F, -9.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		gunModel[4].setRotationPoint(3F, 0F, -29.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Import Box104
		gunModel[5].setRotationPoint(3F, 3F, 1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		gunModel[6].setRotationPoint(3F, 0F, 1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box106
		gunModel[7].setRotationPoint(3F, 1F, 10.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		gunModel[8].setRotationPoint(3F, 1.5F, 10.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box108
		gunModel[9].setRotationPoint(3F, 2F, 10.5F);

		gunModel[10].addBox(-1F, 2F, 0F, 2, 5, 3, 0F); // Import Box109
		gunModel[10].setRotationPoint(4F, 2F, 17.5F);
		gunModel[10].rotateAngleZ = -0.6981317F;

		gunModel[11].addBox(-1F, -1F, 0F, 2, 3, 5, 0F); // Import Box110
		gunModel[11].setRotationPoint(4F, 2F, 15.5F);
		gunModel[11].rotateAngleZ = -0.6981317F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		gunModel[12].setRotationPoint(0F, -0.5F, -6.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box112
		gunModel[13].setRotationPoint(0F, -1F, -6.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box113
		gunModel[14].setRotationPoint(0F, 0F, -6.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box114
		gunModel[15].setRotationPoint(3.5F, 8F, 7F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		gunModel[16].setRotationPoint(3.5F, 3F, 9.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.3F); // Import Box65
		gunModel[17].setRotationPoint(-1F, -1.2F, 3.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		gunModel[18].setRotationPoint(3F, 1F, -10.5F);

		gunModel[19].addShapeBox(-1F, 7F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box101
		gunModel[19].setRotationPoint(4F, 2F, 17.5F);
		gunModel[19].rotateAngleZ = -0.6981317F;

		gunModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box118
		gunModel[20].setRotationPoint(3.5F, 3F, 5.5F);
		gunModel[20].rotateAngleX = 0.31415927F;

		gunModel[21].addShapeBox(-0.3F, 0.2F, 0.2F, 0, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, -10.2F, 0F, 0F, -10.2F, 0F, 0F, -10.2F, -10.5F, 0F, -10.2F, -10.5F); // Import Box119
		gunModel[21].setRotationPoint(0F, -1.2F, 3.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[22].setRotationPoint(9F, -4F, -8.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[23].setRotationPoint(9F, -4F, 3.5F);

		gunModel[24].addBox(0F, 0F, 0F, 1, 5, 14, 0F); // Box 3
		gunModel[24].setRotationPoint(8F, -4F, -8.5F);

		gunModel[25].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 6
		gunModel[25].setRotationPoint(2F, 0F, -8.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[26].setRotationPoint(6F, -2F, -8.5F);


		defaultBarrelModel = new ModelRendererTurbo[47];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 39, 137, textureX, textureY); // Import Box54
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box64
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box65
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 145, 116, textureX, textureY); // Import Box73
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Import Box74
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 145, 106, textureX, textureY); // Import Box75
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 140, 87, textureX, textureY); // Import Box76
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box67
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box68
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box69
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box70
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box71
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box72
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 39, 136, textureX, textureY); // Import Box73
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box74
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box75
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box76
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box77
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box78
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box79
		defaultBarrelModel[20] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box80
		defaultBarrelModel[21] = new ModelRendererTurbo(this, 116, 161, textureX, textureY); // Import Box81
		defaultBarrelModel[22] = new ModelRendererTurbo(this, 153, 84, textureX, textureY); // Import Box82
		defaultBarrelModel[23] = new ModelRendererTurbo(this, 145, 135, textureX, textureY); // Import Box83
		defaultBarrelModel[24] = new ModelRendererTurbo(this, 145, 126, textureX, textureY); // Import Box84
		defaultBarrelModel[25] = new ModelRendererTurbo(this, 164, 87, textureX, textureY); // Import Box85
		defaultBarrelModel[26] = new ModelRendererTurbo(this, 165, 144, textureX, textureY); // Import Box86
		defaultBarrelModel[27] = new ModelRendererTurbo(this, 147, 144, textureX, textureY); // Import Box87
		defaultBarrelModel[28] = new ModelRendererTurbo(this, 130, 145, textureX, textureY); // Import Box88
		defaultBarrelModel[29] = new ModelRendererTurbo(this, 193, 100, textureX, textureY); // Import Box89
		defaultBarrelModel[30] = new ModelRendererTurbo(this, 220, 62, textureX, textureY); // Import Box90
		defaultBarrelModel[31] = new ModelRendererTurbo(this, 200, 64, textureX, textureY); // Import Box91
		defaultBarrelModel[32] = new ModelRendererTurbo(this, 180, 62, textureX, textureY); // Import Box92
		defaultBarrelModel[33] = new ModelRendererTurbo(this, 192, 83, textureX, textureY); // Import Box93
		defaultBarrelModel[34] = new ModelRendererTurbo(this, 192, 118, textureX, textureY); // Import Box94
		defaultBarrelModel[35] = new ModelRendererTurbo(this, 192, 137, textureX, textureY); // Import Box95
		defaultBarrelModel[36] = new ModelRendererTurbo(this, 219, 172, textureX, textureY); // Import Box96
		defaultBarrelModel[37] = new ModelRendererTurbo(this, 185, 172, textureX, textureY); // Import Box97
		defaultBarrelModel[38] = new ModelRendererTurbo(this, 193, 154, textureX, textureY); // Import Box98
		defaultBarrelModel[39] = new ModelRendererTurbo(this, 201, 189, textureX, textureY); // Import Box99
		defaultBarrelModel[40] = new ModelRendererTurbo(this, 52, 101, textureX, textureY); // Import Box103
		defaultBarrelModel[41] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Import Box104
		defaultBarrelModel[42] = new ModelRendererTurbo(this, 27, 74, textureX, textureY); // Import Box107
		defaultBarrelModel[43] = new ModelRendererTurbo(this, 27, 74, textureX, textureY); // Import Box108
		defaultBarrelModel[44] = new ModelRendererTurbo(this, 174, 100, textureX, textureY); // Import Box116
		defaultBarrelModel[45] = new ModelRendererTurbo(this, 180, 108, textureX, textureY); // Import Box118
		defaultBarrelModel[46] = new ModelRendererTurbo(this, 174, 100, textureX, textureY); // Import Box100

		defaultBarrelModel[0].addBox(-4F, 0.5F, 4F, 4, 1, 65, 0F); // Import Box54
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[1].addShapeBox(-4F, -0.2F, 4F, 1, 1, 65, 0F,-0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box64
		defaultBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[2].addShapeBox(-3F, -0.2F, 4F, 1, 1, 65, 0F,0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box65
		defaultBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[3].addBox(-4.5F, -1F, 7F, 9, 2, 6, 0F); // Import Box73
		defaultBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[4].addShapeBox(-4F, -3F, 7F, 8, 1, 6, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		defaultBarrelModel[4].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[5].addShapeBox(-4.5F, -2F, 7F, 9, 1, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		defaultBarrelModel[5].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[6].addShapeBox(-3F, -4F, 7F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import Box76
		defaultBarrelModel[6].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[7].addShapeBox(-3F, 1.2F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F); // Import Box67
		defaultBarrelModel[7].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[8].addShapeBox(-4F, 1.2F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F); // Import Box68
		defaultBarrelModel[8].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[9].addShapeBox(-2F, 1.2F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F); // Import Box69
		defaultBarrelModel[9].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[10].addShapeBox(-1F, 1.2F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F); // Import Box70
		defaultBarrelModel[10].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[11].addShapeBox(-1F, -0.2F, 4F, 1, 1, 65, 0F,0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box71
		defaultBarrelModel[11].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[12].addShapeBox(-2F, -0.2F, 4F, 1, 1, 65, 0F,0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box72
		defaultBarrelModel[12].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[13].addBox(0F, -1.5F, 4F, 4, 1, 65, 0F); // Import Box73
		defaultBarrelModel[13].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[14].addShapeBox(0F, -0.8F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F); // Import Box74
		defaultBarrelModel[14].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[15].addShapeBox(2F, -0.8F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F); // Import Box75
		defaultBarrelModel[15].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[16].addShapeBox(1F, -0.8F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F); // Import Box76
		defaultBarrelModel[16].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[17].addShapeBox(3F, -0.8F, 4F, 1, 1, 65, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F); // Import Box77
		defaultBarrelModel[17].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[18].addShapeBox(0F, -2.2F, 4F, 1, 1, 65, 0F,-0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box78
		defaultBarrelModel[18].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[19].addShapeBox(1F, -2.2F, 4F, 1, 1, 65, 0F,0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box79
		defaultBarrelModel[19].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[20].addShapeBox(2F, -2.2F, 4F, 1, 1, 65, 0F,0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box80
		defaultBarrelModel[20].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[21].addShapeBox(3F, -2.2F, 4F, 1, 1, 65, 0F,0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box81
		defaultBarrelModel[21].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[22].addBox(-1F, -4.5F, 7F, 2, 2, 6, 0F); // Import Box82
		defaultBarrelModel[22].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[23].addShapeBox(-4F, 2F, 7F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Import Box83
		defaultBarrelModel[23].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[24].addShapeBox(-4.5F, 1F, 7F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box84
		defaultBarrelModel[24].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[25].addShapeBox(1F, -4F, 7F, 2, 1, 6, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		defaultBarrelModel[25].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[26].addShapeBox(1F, 3F, 7F, 2, 1, 6, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F); // Import Box86
		defaultBarrelModel[26].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[27].addBox(-1F, 2.5F, 7F, 2, 2, 6, 0F); // Import Box87
		defaultBarrelModel[27].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[28].addShapeBox(-3F, 3F, 7F, 2, 1, 6, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F); // Import Box88
		defaultBarrelModel[28].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[29].addShapeBox(-4F, -3F, 29F, 8, 1, 15, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		defaultBarrelModel[29].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[30].addShapeBox(-3F, -4F, 29F, 2, 1, 15, 0F,-1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import Box90
		defaultBarrelModel[30].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[31].addBox(-1F, -4.5F, 29F, 2, 2, 15, 0F); // Import Box91
		defaultBarrelModel[31].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[32].addShapeBox(1F, -4F, 29F, 2, 1, 15, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		defaultBarrelModel[32].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[33].addShapeBox(-4.5F, -2F, 29F, 9, 1, 15, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		defaultBarrelModel[33].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[34].addBox(-4.5F, -1F, 29F, 9, 2, 15, 0F); // Import Box94
		defaultBarrelModel[34].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[35].addShapeBox(-4.5F, 1F, 29F, 9, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box95
		defaultBarrelModel[35].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[36].addShapeBox(-3F, 3F, 29F, 2, 1, 15, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F); // Import Box96
		defaultBarrelModel[36].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[37].addShapeBox(1F, 3F, 29F, 2, 1, 15, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F); // Import Box97
		defaultBarrelModel[37].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[38].addShapeBox(-4F, 2F, 29F, 8, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Import Box98
		defaultBarrelModel[38].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[39].addBox(-1F, 2.5F, 29F, 2, 2, 15, 0F); // Import Box99
		defaultBarrelModel[39].setRotationPoint(0F, 0F, -1F);

		defaultBarrelModel[40].addShapeBox(-4.01F, 0F, 13F, 0, 12, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -10F, 0F, -10F, -10F); // Import Box103
		defaultBarrelModel[40].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[41].addShapeBox(4.03F, -2F, 13F, 0, 12, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -10F, 0F, -10F, -10F); // Import Box104
		defaultBarrelModel[41].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[42].addShapeBox(4.1F, -2F, 44F, 0, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -10F, 0F, -10F, -10F); // Import Box107
		defaultBarrelModel[42].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[43].addShapeBox(-4.1F, 0F, 44F, 0, 12, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -10F, 0F, -10F, -10F); // Import Box108
		defaultBarrelModel[43].setRotationPoint(0F, 0F, 0F);
		
		defaultBarrelModel[44].addShapeBox(-1F, -4.5F, 1F, 2, 1, 6, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		defaultBarrelModel[44].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[45].addShapeBox(-0.5F, -3.5F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		defaultBarrelModel[45].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[46].addShapeBox(-1F, 3.5F, 1F, 2, 1, 6, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		defaultBarrelModel[46].setRotationPoint(0F, 0F, 0F);
		


		sideModel = new ModelRendererTurbo[10];
		sideModel [0] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Import Box33
		sideModel [1] = new ModelRendererTurbo(this, 143, 163, textureX, textureY); // Import Box95
		sideModel [2] = new ModelRendererTurbo(this, 125, 174, textureX, textureY); // Import Box98
		sideModel [3] = new ModelRendererTurbo(this, 157, 161, textureX, textureY); // Import Box117
		sideModel [4] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 0
		sideModel [5] = new ModelRendererTurbo(this, 63, 76, textureX, textureY); // Box 4
		sideModel [6] = new ModelRendererTurbo(this, 125, 174, textureX, textureY); // Box 8
		sideModel [7] = new ModelRendererTurbo(this, 143, 163, textureX, textureY); // Box 9
		sideModel [8] = new ModelRendererTurbo(this, 157, 161, textureX, textureY); // Box 10
		sideModel [9] = new ModelRendererTurbo(this, 157, 161, textureX, textureY); // Box 11

		sideModel [0].addBox(-7F, -6F, -7F, 7, 1, 14, 0F); // Import Box33
		sideModel [0].setRotationPoint(0F, 0F, 0F);

		sideModel [1].addShapeBox(-9F, -6F, -7F, 2, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Import Box95
		sideModel [1].setRotationPoint(0F, 0F, 0F);

		sideModel [2].addShapeBox(0F, -6F, 5F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box98
		sideModel [2].setRotationPoint(0F, 0F, 0F);

		sideModel [3].addShapeBox(-8F, -6.5F, 2.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Import Box117
		sideModel [3].setRotationPoint(0F, 0F, 0F);

		sideModel [4].addBox(-1F, -5F, -7F, 1, 5, 14, 0F); // Box 0
		sideModel [4].setRotationPoint(0F, 0F, 0F);

		sideModel [5].addShapeBox(-3F, -5F, -7F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 4
		sideModel [5].setRotationPoint(0F, 0F, 0F);

		sideModel [6].addShapeBox(0F, -6F, -7F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		sideModel [6].setRotationPoint(0F, 0F, 0F);

		sideModel [7].addShapeBox(-9F, -6F, 5F, 2, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 9
		sideModel [7].setRotationPoint(0F, 0F, 0F);

		sideModel [8].addShapeBox(-8F, -6.5F, -1.5F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 10
		sideModel [8].setRotationPoint(0F, 0F, 0F);

		sideModel [9].addShapeBox(-8F, -6.5F, -1.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 11
		sideModel [9].setRotationPoint(0F, 0F, 0F);
		
		flipAll();
		translateParts(defaultBarrelModel, 4F, 4.5F, 38F);
		translateParts(sideModel, 9F, 3.6F, 1.5F);

		//translateAll(0F, 0F, 0F);


	}
}