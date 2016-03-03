//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorMarkVI extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorMarkVI()
	{
		headModel = new ModelRendererTurbo[19];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import NoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import NoPartSelected
		headModel[2] = new ModelRendererTurbo(this, 146, 7, textureX, textureY); // Import NoPartSelected
		headModel[3] = new ModelRendererTurbo(this, 140, 7, textureX, textureY); // Import NoPartSelected
		headModel[4] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import NoPartSelected
		headModel[5] = new ModelRendererTurbo(this, 137, 19, textureX, textureY); // Import NoPartSelected
		headModel[6] = new ModelRendererTurbo(this, 138, 23, textureX, textureY); // Import NoPartSelected
		headModel[7] = new ModelRendererTurbo(this, 135, 12, textureX, textureY); // Import NoPartSelected
		headModel[8] = new ModelRendererTurbo(this, 148, 19, textureX, textureY); // Import NoPartSelected
		headModel[9] = new ModelRendererTurbo(this, 146, 12, textureX, textureY); // Import NoPartSelected
		headModel[10] = new ModelRendererTurbo(this, 148, 27, textureX, textureY); // Import NoPartSelected
		headModel[11] = new ModelRendererTurbo(this, 156, 12, textureX, textureY); // Import NoPartSelected
		headModel[12] = new ModelRendererTurbo(this, 156, 19, textureX, textureY); // Import NoPartSelected
		headModel[13] = new ModelRendererTurbo(this, 156, 27, textureX, textureY); // Import NoPartSelected
		headModel[14] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import NoPartSelected
		headModel[15] = new ModelRendererTurbo(this, 164, 12, textureX, textureY); // Import NoPartSelected
		headModel[16] = new ModelRendererTurbo(this, 164, 23, textureX, textureY); // Import NoPartSelected
		headModel[17] = new ModelRendererTurbo(this, 163, 19, textureX, textureY); // Import NoPartSelected
		headModel[18] = new ModelRendererTurbo(this, 140, 7, textureX, textureY); // Import NoPartSelected

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import NoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-4.5F, -7.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import NoPartSelected
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-4.4F, -7.5F, 5F, 9, 3, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Import NoPartSelected
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(4.6F, -6.5F, 0F, 1, 4, 0, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(-5.8F, -2.5F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[4].setRotationPoint(0F, -1.5F, 0F);

		headModel[5].addShapeBox(-3.4F, -7.5F, -6.7F, 2, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[5].setRotationPoint(0F, -1.5F, 0F);

		headModel[6].addShapeBox(-4.4F, -7.5F, -6.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F); // Import NoPartSelected
		headModel[6].setRotationPoint(0F, -1.5F, 0F);

		headModel[7].addShapeBox(-5.8F, -7.5F, -4.7F, 1, 1, 4, 0F, -0.5F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.7F, -0.5F, 0F, 0.7F); // Import NoPartSelected
		headModel[7].setRotationPoint(0F, -1.5F, 0F);

		headModel[8].addShapeBox(-5.8F, -7.5F, 0F, 1, 5, 2, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[8].setRotationPoint(0F, -1.5F, 0F);

		headModel[9].addShapeBox(-5.8F, -7.5F, 2F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[9].setRotationPoint(0F, -1.5F, 0F);

		headModel[10].addShapeBox(-5.8F, -2.5F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Import NoPartSelected
		headModel[10].setRotationPoint(0F, -1.5F, 0F);

		headModel[11].addShapeBox(4.6F, -7.5F, 2F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import NoPartSelected
		headModel[11].setRotationPoint(0F, -1.5F, 0F);

		headModel[12].addShapeBox(4.6F, -7.5F, 0F, 1, 5, 2, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[12].setRotationPoint(0F, -1.5F, 0F);

		headModel[13].addShapeBox(4.6F, -2.5F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F); // Import NoPartSelected
		headModel[13].setRotationPoint(0F, -1.5F, 0F);

		headModel[14].addShapeBox(4.6F, -2.5F, -2F, 1, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import NoPartSelected
		headModel[14].setRotationPoint(0F, -1.5F, 0F);

		headModel[15].addShapeBox(4.6F, -7.5F, -4.7F, 1, 1, 4, 0F, 0F, 0.4F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.7F, 0F, 0.5F, 0.7F); // Import NoPartSelected
		headModel[15].setRotationPoint(0F, -1.5F, 0F);

		headModel[16].addShapeBox(3.2F, -7.5F, -6.7F, 1, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[16].setRotationPoint(0F, -1.5F, 0F);

		headModel[17].addShapeBox(1.2F, -7.5F, -6.7F, 2, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[17].setRotationPoint(0F, -1.5F, 0F);

		headModel[18].addShapeBox(-5.8F, -6.5F, 0F, 1, 4, 0, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[18].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Body
		bodyModel[1] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Body
		bodyModel[2] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Body
		bodyModel[3] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Body
		bodyModel[4] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // Body
		bodyModel[5] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Body
		bodyModel[6] = new ModelRendererTurbo(this, 48, 37, textureX, textureY); // Body
		bodyModel[7] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Body
		bodyModel[8] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Body
		bodyModel[9] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Body
		bodyModel[10] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Body

		bodyModel[0].addShapeBox(2.5F, -1F, 2.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -1F, 2.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[1].setRotationPoint(0F, -2F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 0F, 2.5F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Body
		bodyModel[2].setRotationPoint(0F, -2F, 0F);

		bodyModel[3].addShapeBox(2.5F, 0F, -3.5F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Body
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -3.5F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Body
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, -3.5F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[5].setRotationPoint(0F, -2F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 0F, -2.5F, 9, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Body
		bodyModel[6].setRotationPoint(0F, -2F, 0F);

		bodyModel[7].addShapeBox(2.5F, 2F, 2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Body
		bodyModel[7].setRotationPoint(0F, -2F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 2F, 2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Body
		bodyModel[8].setRotationPoint(0F, -2F, 0F);

		bodyModel[9].addShapeBox(1.5F, 0F, 2.5F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Body
		bodyModel[9].setRotationPoint(0F, -2F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 0F, 2.5F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Body
		bodyModel[10].setRotationPoint(0F, -2F, 0F);


		leftBootModel = new ModelRendererTurbo[1];
		leftBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Head

		leftBootModel[0].addShapeBox(-0.5F, 9.5F, -2.5F, 5, 3, 5, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Head
		leftBootModel[0].setRotationPoint(0F, 10.5F, 0F);


		rightBootModel= new ModelRendererTurbo[1];
		rightBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Head

		rightBootModel[0].addShapeBox(-4.5F, 9.5F, -2.5F, 5, 3, 5, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Head
		rightBootModel[0].setRotationPoint(0F, 10.5F, 0F);


		leftArmModel = new ModelRendererTurbo[6];
		leftArmModel[0] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // LeftArm
		leftArmModel[1] = new ModelRendererTurbo(this, 107, 34, textureX, textureY); // Left Arm
		leftArmModel[2] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Left Arm
		leftArmModel[3] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Left Arm
		leftArmModel[4] = new ModelRendererTurbo(this, 109, 34, textureX, textureY); // Left Arm
		leftArmModel[5] = new ModelRendererTurbo(this, 107, 34, textureX, textureY); // Left Arm

		leftArmModel[0].addShapeBox(5F, -3F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Arm
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(5F, 1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left Arm
		leftArmModel[1].setRotationPoint(4F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.5F, 0.5F, -3F, 5, 4, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Left Arm
		leftArmModel[2].setRotationPoint(4F, 0F, 0F);

		leftArmModel[3].addShapeBox(0F, -2.5F, -2.5F, 5, 13, 5, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Left Arm
		leftArmModel[3].setRotationPoint(4F, 0F, 0F);

		leftArmModel[4].addBox(5F, -1F, -2F, 1, 2, 4, 0F); // Left Arm
		leftArmModel[4].setRotationPoint(4F, 0F, 0F);

		leftArmModel[5].addShapeBox(5F, 1F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Left Arm
		leftArmModel[5].setRotationPoint(4F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[6];
		rightArmModel [0] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Head
		rightArmModel [1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Head
		rightArmModel [2] = new ModelRendererTurbo(this, 109, 34, textureX, textureY); // Head
		rightArmModel [3] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // Head
		rightArmModel [4] = new ModelRendererTurbo(this, 107, 34, textureX, textureY); // Head
		rightArmModel [5] = new ModelRendererTurbo(this, 107, 34, textureX, textureY); // Head

		rightArmModel [0].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Head
		rightArmModel [0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel [1].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Head
		rightArmModel [1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel [2].addBox(-6F, -2F, -2F, 1, 2, 4, 0F); // Head
		rightArmModel [2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel [3].addShapeBox(-6F, -4F, -2F, 1, 2, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head
		rightArmModel [3].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel [4].addShapeBox(-6F, 0F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Head
		rightArmModel [4].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel [5].addShapeBox(-6F, 0F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Head
		rightArmModel [5].setRotationPoint(-4F, 0.5F, 0F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Left Light

		leftArmLightsModel [0].addBox(5.51F, 1F, -0.97F, 0, 1, 2, 0F); // Left Light
		leftArmLightsModel [0].setRotationPoint(4F, 0F, 0F);


		rightArmLightsModel = new ModelRendererTurbo[1];
		rightArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Right Light

		rightArmLightsModel [0].addBox(-5.52F, 0F, -0.97F, 0, 1, 2, 0F); // Right Light
		rightArmLightsModel [0].setRotationPoint(-4F, 0.5F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 66, 58, textureX, textureY); // Head

		leftLegModel[0].addBox(-0.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Head
		leftLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		rightLegModel= new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 40, 58, textureX, textureY); // Head

		rightLegModel[0].addBox(-4.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Head
		rightLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		bodyLightsModel = new ModelRendererTurbo[4];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Lights Torso
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Lights Torso
		bodyLightsModel [2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Lights Torso
		bodyLightsModel [3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Lights Torso

		bodyLightsModel [0].addShapeBox(1.43F, 5F, -3.51F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lights Torso
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(-2.57F, 5F, -3.51F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lights Torso
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [2].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lights Torso
		bodyLightsModel [2].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [3].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lights Torso
		bodyLightsModel [3].setRotationPoint(0F, -2F, 0F);


		headLightsModel = new ModelRendererTurbo[4];
		headLightsModel [0] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Lights Head
		headLightsModel [1] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Lights Head
		headLightsModel [2] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Lights Head
		headLightsModel [3] = new ModelRendererTurbo(this, 98, 12, textureX, textureY); // Lights Head

		headLightsModel [0].addShapeBox(4.6F, -2.6F, -2.1F, 4, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Lights Head
		headLightsModel [0].setRotationPoint(0F, -1.5F, 0F);

		headLightsModel [1].addShapeBox(4.6F, -1.4F, -2.1F, 4, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Lights Head
		headLightsModel [1].setRotationPoint(0F, -1.5F, 0F);

		headLightsModel [2].addShapeBox(-5.8F, -2.6F, -2.1F, 4, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Lights Head
		headLightsModel [2].setRotationPoint(0F, -1.5F, 0F);

		headLightsModel [3].addShapeBox(-5.8F, -1.4F, -2.1F, 4, 4, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Lights Head
		headLightsModel [3].setRotationPoint(0F, -1.5F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}