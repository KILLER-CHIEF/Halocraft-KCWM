//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorHayabusa extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorHayabusa()
	{
		headModel = new ModelRendererTurbo[18];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import ImportNoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import ImportNoPartSelected
		headModel[2] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Import Body
		headModel[3] = new ModelRendererTurbo(this, 133, 10, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 150, 10, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 144, 14, textureX, textureY); // Box 22
		headModel[6] = new ModelRendererTurbo(this, 160, 14, textureX, textureY); // Box 23
		headModel[7] = new ModelRendererTurbo(this, 16, 20, textureX, textureY); // Box 25
		headModel[8] = new ModelRendererTurbo(this, 16, 20, textureX, textureY); // Box 26
		headModel[9] = new ModelRendererTurbo(this, 125, 14, textureX, textureY); // Box 27
		headModel[10] = new ModelRendererTurbo(this, 88, 14, textureX, textureY); // Box 28
		headModel[11] = new ModelRendererTurbo(this, 94, 14, textureX, textureY); // Box 29
		headModel[12] = new ModelRendererTurbo(this, 87, 8, textureX, textureY); // Box 31
		headModel[13] = new ModelRendererTurbo(this, 95, 9, textureX, textureY); // Box 32
		headModel[14] = new ModelRendererTurbo(this, 80, 8, textureX, textureY); // Box 33
		headModel[15] = new ModelRendererTurbo(this, 81, 13, textureX, textureY); // Box 34
		headModel[16] = new ModelRendererTurbo(this, 4, 24, textureX, textureY); // Box 35
		headModel[17] = new ModelRendererTurbo(this, 4, 24, textureX, textureY); // Box 36

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import ImportNoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-4.5F, -7.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import ImportNoPartSelected
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-1.5F, 0F, 2.5F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Body
		headModel[2].setRotationPoint(0F, -2F, 0F);

		headModel[3].addShapeBox(-3.5F, -12.5F, -5.5F, 3, 3, 2, 0F, -3F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 6F, -3F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(0.5F, -12.5F, -5.5F, 3, 3, 2, 0F, 0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[4].setRotationPoint(0F, -1.5F, 0F);

		headModel[5].addShapeBox(-0.5F, -12.5F, -5.5F, 1, 3, 2, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		headModel[5].setRotationPoint(0F, -1.5F, 0F);

		headModel[6].addShapeBox(3.5F, -10.5F, -4.7F, 1, 1, 4, 0F, -1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[6].setRotationPoint(0F, -1.5F, 0F);

		headModel[7].addShapeBox(4.5F, -8.5F, -4.7F, 1, 2, 8, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 1F, -2F, 0F, -2F, -2F, 0F); // Box 25
		headModel[7].setRotationPoint(0F, -1.5F, 0F);

		headModel[8].addShapeBox(-5.5F, -8.5F, -4.7F, 1, 2, 8, 0F, 0F, -1F, -2F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, -2F, -2F, 0F, 1F, -2F, 0F); // Box 26
		headModel[8].setRotationPoint(0F, -1.5F, 0F);

		headModel[9].addShapeBox(-4.5F, -10.5F, -4.7F, 1, 1, 4, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		headModel[9].setRotationPoint(0F, -1.5F, 0F);

		headModel[10].addShapeBox(-0.5F, -8.5F, -5.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[10].setRotationPoint(0F, -1.5F, 0F);

		headModel[11].addShapeBox(0.5F, -8.5F, -5.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[11].setRotationPoint(0F, -1.5F, 0F);

		headModel[12].addBox(-0.5F, -9.5F, -5.5F, 1, 1, 1, 0F); // Box 31
		headModel[12].setRotationPoint(0F, -1.5F, 0F);

		headModel[13].addShapeBox(0.5F, -9.5F, -5.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[13].setRotationPoint(0F, -1.5F, 0F);

		headModel[14].addShapeBox(-2.5F, -9.5F, -5.5F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 33
		headModel[14].setRotationPoint(0F, -1.5F, 0F);

		headModel[15].addShapeBox(-2.5F, -8.5F, -5.5F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		headModel[15].setRotationPoint(0F, -1.5F, 0F);

		headModel[16].addShapeBox(4.5F, -4F, -4.5F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.3F, 0F, 1.5F); // Box 35
		headModel[16].setRotationPoint(0F, -1.5F, 0F);

		headModel[17].addShapeBox(-5.5F, -4F, -4.5F, 1, 4, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 1.5F, 0F, -1F, 0F); // Box 36
		headModel[17].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import Body
		bodyModel[1] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Import Body
		bodyModel[2] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Import Body
		bodyModel[3] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Import Body
		bodyModel[4] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // Import Body
		bodyModel[5] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Import Body
		bodyModel[6] = new ModelRendererTurbo(this, 48, 37, textureX, textureY); // Import Body
		bodyModel[7] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import Body
		bodyModel[8] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import Body
		bodyModel[9] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Import Body
		bodyModel[10] = new ModelRendererTurbo(this, 82, 105, textureX, textureY); // Box 54
		bodyModel[11] = new ModelRendererTurbo(this, 81, 98, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Box 58
		bodyModel[13] = new ModelRendererTurbo(this, 89, 110, textureX, textureY); // Box 59
		bodyModel[14] = new ModelRendererTurbo(this, 96, 115, textureX, textureY); // Box 60

		bodyModel[0].addShapeBox(2.5F, -1F, 2.5F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -1F, 2.5F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Body
		bodyModel[1].setRotationPoint(0F, -2F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 0F, 2.5F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Body
		bodyModel[2].setRotationPoint(0F, -2F, 0F);

		bodyModel[3].addShapeBox(2.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Body
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -3.5F, 9, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Body
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Body
		bodyModel[5].setRotationPoint(0F, -2F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 0F, -2.5F, 9, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Body
		bodyModel[6].setRotationPoint(0F, -2F, 0F);

		bodyModel[7].addShapeBox(2.5F, 2F, 2.5F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Body
		bodyModel[7].setRotationPoint(0F, -2F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 2F, 2.5F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Body
		bodyModel[8].setRotationPoint(0F, -2F, 0F);

		bodyModel[9].addShapeBox(1.5F, 0F, 2.5F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Body
		bodyModel[9].setRotationPoint(0F, -2F, 0F);

		bodyModel[10].addShapeBox(8.5F, -8F, 5.5F, 2, 29, 1, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 18F, -8F, 0F, -19F, -7F, 0F, -19F, -7F, 0F, 18F, -8F, 0F); // Box 54
		bodyModel[10].setRotationPoint(0F, -2F, 0F);

		bodyModel[11].addShapeBox(6.2F, -6F, 5F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, 2F, 0F, 0F); // Box 55
		bodyModel[11].setRotationPoint(0F, -2F, 0F);

		bodyModel[12].addShapeBox(-1.5F, 3F, 4.5F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[12].setRotationPoint(0F, -2F, 0F);

		bodyModel[13].addShapeBox(1.5F, 3F, 2.5F, 1, 1, 3, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 59
		bodyModel[13].setRotationPoint(0F, -2F, 0F);

		bodyModel[14].addShapeBox(-2.5F, 3F, 2.5F, 1, 1, 3, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 60
		bodyModel[14].setRotationPoint(0F, -2F, 0F);


		leftArmModel = new ModelRendererTurbo[11];
		leftArmModel[0] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import LeftArm
		leftArmModel[1] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Import LeftArm
		leftArmModel[2] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 15
		leftArmModel[3] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 16
		leftArmModel[4] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 37
		leftArmModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 38
		leftArmModel[6] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 39
		leftArmModel[7] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 40
		leftArmModel[8] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 41
		leftArmModel[9] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 42
		leftArmModel[10] = new ModelRendererTurbo(this, 109, 33, textureX, textureY); // Box 43

		leftArmModel[0].addShapeBox(1.5F, 0F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import LeftArm
		leftArmModel[0].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[1].addShapeBox(1F, -3F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import LeftArm
		leftArmModel[1].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[2].addShapeBox(6F, -1.5F, -4F, 1, 2, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		leftArmModel[2].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[3].addShapeBox(6F, -1.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		leftArmModel[3].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[4].addShapeBox(6F, -1.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftArmModel[4].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[5].addShapeBox(6F, 0.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftArmModel[5].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[6].addShapeBox(6F, 0.5F, -4F, 1, 2, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 39
		leftArmModel[6].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[7].addShapeBox(6F, 0.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		leftArmModel[7].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[8].addShapeBox(5.5F, -3.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftArmModel[8].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[9].addShapeBox(5.5F, -3.5F, -4F, 1, 2, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 42
		leftArmModel[9].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[10].addShapeBox(5.5F, -3.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		leftArmModel[10].setRotationPoint(4F, 0.5F, 0F);


		rightArmModel = new ModelRendererTurbo[11];
		rightArmModel[0] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Import Head
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import Head
		rightArmModel[2] = new ModelRendererTurbo(this, 116, 41, textureX, textureY); // Box 44
		rightArmModel[3] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 45
		rightArmModel[4] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 46
		rightArmModel[5] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 47
		rightArmModel[6] = new ModelRendererTurbo(this, 116, 41, textureX, textureY); // Box 48
		rightArmModel[7] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 49
		rightArmModel[8] = new ModelRendererTurbo(this, 116, 41, textureX, textureY); // Box 50
		rightArmModel[9] = new ModelRendererTurbo(this, 109, 33, textureX, textureY); // Box 51
		rightArmModel[10] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 52

		rightArmModel[0].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Head
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Head
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-6F, 0.5F, -4F, 1, 2, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 44
		rightArmModel[2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[3].addShapeBox(-6F, 0.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 45
		rightArmModel[3].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[4].addShapeBox(-6F, 0.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightArmModel[4].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[5].addShapeBox(-6F, -1.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightArmModel[5].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[6].addShapeBox(-6F, -1.5F, -4F, 1, 2, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 48
		rightArmModel[6].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[7].addShapeBox(-6F, -1.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 49
		rightArmModel[7].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[8].addShapeBox(-5.5F, -3.5F, -4F, 1, 2, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 50
		rightArmModel[8].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[9].addShapeBox(-5.5F, -3.5F, -2F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 51
		rightArmModel[9].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[10].addShapeBox(-5.5F, -3.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightArmModel[10].setRotationPoint(-4F, 0.5F, 0F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import LeftLight

		leftArmLightsModel [0].addShapeBox(7.61F, -2.5F, -0.97F, 0, 1, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftLight
		leftArmLightsModel [0].setRotationPoint(4F, 0.5F, 0F);


		rightArmLightsModel = new ModelRendererTurbo[1];
		rightArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 53

		rightArmLightsModel [0].addShapeBox(-14.69F, -2.5F, -0.97F, 0, 1, 2, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightArmLightsModel [0].setRotationPoint(4F, 0.5F, 0F);


		bodyLightsModel = new ModelRendererTurbo[2];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso

		bodyLightsModel [0].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}