package net.killerchief.halocraft.client.models.vehicles;

import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelWarthogTurretRocket extends ModelWarthogTurretChainGun {

	public ModelWarthogTurretRocket()
	{
		bodyModel = new ModelRendererTurbo[44];
		bodyModel[0] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box7
		bodyModel[1] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box8
		bodyModel[2] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box9
		bodyModel[3] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Import Box10
		bodyModel[4] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Import Box11
		bodyModel[5] = new ModelRendererTurbo(this, 86, 55, textureX, textureY); // Import Box12
		bodyModel[6] = new ModelRendererTurbo(this, 86, 55, textureX, textureY); // Import Box16
		bodyModel[7] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Import Box17
		bodyModel[8] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Import Box18
		bodyModel[9] = new ModelRendererTurbo(this, 89, 22, textureX, textureY); // Import Box21
		bodyModel[10] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Import Box22
		bodyModel[11] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Import Box27
		bodyModel[12] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Import Box28
		bodyModel[13] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box29
		bodyModel[14] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box30
		bodyModel[15] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box31
		bodyModel[16] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box32
		bodyModel[17] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box34
		bodyModel[18] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box35
		bodyModel[19] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Import Box38
		bodyModel[20] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Import Box39
		bodyModel[21] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box40
		bodyModel[22] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box41
		bodyModel[23] = new ModelRendererTurbo(this, 71, 25, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 90, 39, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 89, 22, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 71, 25, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 90, 39, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 89, 22, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 71, 25, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 90, 39, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 4, 62, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 4, 48, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 4, 48, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 104, 7, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 104, 7, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 104, 7, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 119, 5, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 119, 5, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 119, 5, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 59, 94, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 30, 51, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Box 61

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Import Box7
		bodyModel[0].setRotationPoint(-2F, -13F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[1].setRotationPoint(-2F, -14F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box9
		bodyModel[2].setRotationPoint(-2F, -11F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[3].setRotationPoint(2F, -13F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[4].setRotationPoint(2F, -11F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box12
		bodyModel[5].setRotationPoint(2F, -17F, -16F);

		bodyModel[6].addShapeBox(0F, -4F, 3F, 5, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box16
		bodyModel[6].setRotationPoint(-7F, -13F, -16F);
		bodyModel[6].rotateAngleX = -0.29670597F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[7].setRotationPoint(-7F, -13F, -16F);
		bodyModel[7].rotateAngleX = -0.29670597F;

		bodyModel[8].addShapeBox(0F, 2F, -2F, 5, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		bodyModel[8].setRotationPoint(-7F, -13F, -16F);
		bodyModel[8].rotateAngleX = -0.29670597F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[9].setRotationPoint(1F, -13F, -36F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[10].setRotationPoint(-1F, -10F, -16F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Import Box27
		bodyModel[11].setRotationPoint(2F, -13F, -15F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Import Box28
		bodyModel[12].setRotationPoint(-3F, -13F, -15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box29
		bodyModel[13].setRotationPoint(2F, -15F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[14].setRotationPoint(2F, -11F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box31
		bodyModel[15].setRotationPoint(-3F, -15F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[16].setRotationPoint(-3F, -11F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box34
		bodyModel[17].setRotationPoint(2F, -9F, -14F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box35
		bodyModel[18].setRotationPoint(2F, -11F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box38
		bodyModel[19].setRotationPoint(2F, -11F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box39
		bodyModel[20].setRotationPoint(-3F, -11F, -15F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box40
		bodyModel[21].setRotationPoint(-3F, -11F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box41
		bodyModel[22].setRotationPoint(-3F, -9F, -14F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(1F, -12F, -36F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[24].setRotationPoint(1F, -11F, -36F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-1F, -13F, -36F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-1F, -12F, -36F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-1F, -11F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[28].setRotationPoint(-3F, -13F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-3F, -12F, -36F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 44
		bodyModel[30].setRotationPoint(-3F, -11F, -36F);

		bodyModel[31].addBox(0F, 0F, 0F, 7, 2, 8, 0F); // Box 45
		bodyModel[31].setRotationPoint(-3.5F, -12.5F, -23F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[32].setRotationPoint(-3.5F, -13.5F, -23F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[33].setRotationPoint(-3.5F, -10.5F, -23F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 48
		bodyModel[34].setRotationPoint(3F, -12F, -17F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[35].setRotationPoint(3F, -13F, -17F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		bodyModel[36].setRotationPoint(3F, -10F, -17F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 51
		bodyModel[37].setRotationPoint(6F, -12F, -16F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 52
		bodyModel[38].setRotationPoint(6F, -12F, -13F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 53
		bodyModel[39].setRotationPoint(7F, -12F, -16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 32, 32, 1, 0F,0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -29F, 0F, -29F, -29F, 0F, -29F, -29F, -0.5F, 0F, -29F, -0.5F); // Box 58
		bodyModel[40].setRotationPoint(-1.5F, -14F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[41].setRotationPoint(-0.5F, -16F, -16F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 60
		bodyModel[42].setRotationPoint(-0.5F, -16F, -16F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 61
		bodyModel[43].setRotationPoint(-0.5F, -15.5F, -7.5F);


		bodyDoorOpenModel = new ModelRendererTurbo[16];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box1
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 45, 70, textureX, textureY); // Import Box3
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Import Box4
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Import Box5
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 22, 37, textureX, textureY); // Import Box6
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box42
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box43
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box44
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box45
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box46
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Import Box47
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 3, 82, textureX, textureY); // Import Box52
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 3, 82, textureX, textureY); // Box 54
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 3, 82, textureX, textureY); // Box 55
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 56
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 57

		bodyDoorOpenModel[0].addBox(-6F, 0F, -6F, 16, 1, 6, 0F); // Import Box1
		bodyDoorOpenModel[0].setRotationPoint(-2F, 10F, 0F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 9F); // Import Box3
		bodyDoorOpenModel[1].setRotationPoint(-1.5F, -6F, -16F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyDoorOpenModel[2].setRotationPoint(-2F, -9F, -16F);

		bodyDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box5
		bodyDoorOpenModel[3].setRotationPoint(-2F, -5F, -16F);

		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Import Box6
		bodyDoorOpenModel[4].setRotationPoint(-2F, -8F, -16F);

		bodyDoorOpenModel[5].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Import Box42
		bodyDoorOpenModel[5].setRotationPoint(9F, 10F, 6F);

		bodyDoorOpenModel[6].addBox(-6F, 0F, -6F, 6, 1, 5, 0F); // Import Box43
		bodyDoorOpenModel[6].setRotationPoint(3F, 10F, 6F);

		bodyDoorOpenModel[7].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Import Box44
		bodyDoorOpenModel[7].setRotationPoint(-2F, 10F, 6F);

		bodyDoorOpenModel[8].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		bodyDoorOpenModel[8].setRotationPoint(-2F, 10F, -5F);

		bodyDoorOpenModel[9].addBox(-6F, 0F, -6F, 6, 1, 5, 0F); // Import Box46
		bodyDoorOpenModel[9].setRotationPoint(3F, 10F, -5F);

		bodyDoorOpenModel[10].addShapeBox(-6F, 0F, -6F, 5, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyDoorOpenModel[10].setRotationPoint(9F, 10F, -5F);

		bodyDoorOpenModel[11].addBox(0F, 0F, 1F, 1, 9, 3, 0F); // Import Box52
		bodyDoorOpenModel[11].setRotationPoint(3.5F, -3F, -15F);
		bodyDoorOpenModel[11].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[12].addBox(0F, 0F, 1F, 1, 9, 3, 0F); // Box 54
		bodyDoorOpenModel[12].setRotationPoint(2.3F, -3F, -15F);
		bodyDoorOpenModel[12].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[13].addBox(0F, 0F, 1F, 1, 9, 3, 0F); // Box 55
		bodyDoorOpenModel[13].setRotationPoint(1F, -3F, -15F);
		bodyDoorOpenModel[13].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[14].addBox(0F, 2F, 0.7F, 4, 1, 3, 0F); // Box 56
		bodyDoorOpenModel[14].setRotationPoint(1F, -3F, -15F);
		bodyDoorOpenModel[14].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[15].addBox(0F, 6F, 0.7F, 4, 1, 3, 0F); // Box 57
		bodyDoorOpenModel[15].setRotationPoint(1F, -3F, -15F);
		bodyDoorOpenModel[15].rotateAngleX = 0.54105207F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
		this.flip(this.bodyDoorOpenModel);
	}
}
