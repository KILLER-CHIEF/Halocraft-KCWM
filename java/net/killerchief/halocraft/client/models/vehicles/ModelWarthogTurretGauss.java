package net.killerchief.halocraft.client.models.vehicles;

import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelWarthogTurretGauss extends ModelWarthogTurretChainGun {

	public ModelWarthogTurretGauss()
	{
		bodyModel = new ModelRendererTurbo[32];
		bodyModel[0] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box7
		bodyModel[1] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box8
		bodyModel[2] = new ModelRendererTurbo(this, 37, 48, textureX, textureY); // Import Box9
		bodyModel[3] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Import Box10
		bodyModel[4] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Import Box11
		bodyModel[5] = new ModelRendererTurbo(this, 86, 55, textureX, textureY); // Import Box12
		bodyModel[6] = new ModelRendererTurbo(this, 86, 63, textureX, textureY); // Import Box17
		bodyModel[7] = new ModelRendererTurbo(this, 86, 70, textureX, textureY); // Import Box18
		bodyModel[8] = new ModelRendererTurbo(this, 28, 83, textureX, textureY); // Import Box21
		bodyModel[9] = new ModelRendererTurbo(this, 41, 24, textureX, textureY); // Import Box22
		bodyModel[10] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Import Box27
		bodyModel[11] = new ModelRendererTurbo(this, 62, 4, textureX, textureY); // Import Box28
		bodyModel[12] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box29
		bodyModel[13] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box30
		bodyModel[14] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box31
		bodyModel[15] = new ModelRendererTurbo(this, 63, 9, textureX, textureY); // Import Box32
		bodyModel[16] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box34
		bodyModel[17] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box35
		bodyModel[18] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Import Box38
		bodyModel[19] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Import Box39
		bodyModel[20] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box40
		bodyModel[21] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Import Box41
		bodyModel[22] = new ModelRendererTurbo(this, 28, 83, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 4, 23, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 8, 45, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 9, 60, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 87, 31, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 87, 22, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 86, 42, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 82, 31, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 82, 43, textureX, textureY); // Box 48

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Import Box7
		bodyModel[0].setRotationPoint(-2F, -13F, -16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[1].setRotationPoint(-2F, -14F, -16F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box9
		bodyModel[2].setRotationPoint(-2F, -11F, -16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[3].setRotationPoint(2F, -13F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		bodyModel[4].setRotationPoint(2F, -11F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box12
		bodyModel[5].setRotationPoint(2F, -17F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[6].setRotationPoint(-7F, -13F, -16F);

		bodyModel[7].addShapeBox(0F, 2F, -2F, 5, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		bodyModel[7].setRotationPoint(-7F, -13F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import Box21
		bodyModel[8].setRotationPoint(-5.5F, -13F, -34F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[9].setRotationPoint(-1F, -10F, -16F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Import Box27
		bodyModel[10].setRotationPoint(2F, -13F, -15F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Import Box28
		bodyModel[11].setRotationPoint(-3F, -13F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box29
		bodyModel[12].setRotationPoint(2F, -15F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[13].setRotationPoint(2F, -11F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box31
		bodyModel[14].setRotationPoint(-3F, -15F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		bodyModel[15].setRotationPoint(-3F, -11F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box34
		bodyModel[16].setRotationPoint(2F, -9F, -14F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box35
		bodyModel[17].setRotationPoint(2F, -11F, -14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box38
		bodyModel[18].setRotationPoint(2F, -11F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box39
		bodyModel[19].setRotationPoint(-3F, -11F, -15F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Box40
		bodyModel[20].setRotationPoint(-3F, -11F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box41
		bodyModel[21].setRotationPoint(-3F, -9F, -14F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 35, 0F); // Box 37
		bodyModel[22].setRotationPoint(-5.5F, -14F, -34F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 35, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(-5.5F, -15F, -34F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 7, 5, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, -5F, 0F); // Box 39
		bodyModel[24].setRotationPoint(-2F, -18F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(-1F, -19F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-1F, -16F, -14F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 44
		bodyModel[27].setRotationPoint(-8.5F, -14F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[28].setRotationPoint(-8.5F, -15F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[29].setRotationPoint(-8.5F, -12F, -9F);

		bodyModel[30].addShapeBox(-2F, 0F, 0F, 2, 1, 3, 0F,0F, -0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-5.5F, -14F, -12F);
		bodyModel[30].rotateAngleZ = 0.40142573F;

		bodyModel[31].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F); // Box 48
		bodyModel[31].setRotationPoint(-5.5F, -14F, -3F);
		bodyModel[31].rotateAngleZ = 0.40142573F;


		bodyDoorOpenModel = new ModelRendererTurbo[14];
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
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Import Box48
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Import Box52
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 29, 82, textureX, textureY); // Import Box53

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

		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyDoorOpenModel[11].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[11].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[12].addBox(0F, 0F, 1F, 4, 9, 1, 0F); // Import Box52
		bodyDoorOpenModel[12].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[12].rotateAngleX = 0.54105207F;

		bodyDoorOpenModel[13].addShapeBox(0F, 0F, 2F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box53
		bodyDoorOpenModel[13].setRotationPoint(1.5F, -3F, -15F);
		bodyDoorOpenModel[13].rotateAngleX = 0.54105207F;

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
		this.flip(this.bodyDoorOpenModel);
	}
}
