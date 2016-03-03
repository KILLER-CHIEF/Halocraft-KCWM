//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorCQB extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorCQB()
	{
		headModel = new ModelRendererTurbo[15];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import NoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import NoPartSelected
		headModel[2] = new ModelRendererTurbo(this, 13, 6, textureX, textureY); // Import NoPartSelected
		headModel[3] = new ModelRendererTurbo(this, 6, 3, textureX, textureY); // Import NoPartSelected
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import NoPartSelected
		headModel[5] = new ModelRendererTurbo(this, 8, 22, textureX, textureY); // Import NoPartSelected
		headModel[6] = new ModelRendererTurbo(this, 10, 31, textureX, textureY); // Import NoPartSelected
		headModel[7] = new ModelRendererTurbo(this, 19, 31, textureX, textureY); // Import NoPartSelected
		headModel[8] = new ModelRendererTurbo(this, 21, 22, textureX, textureY); // Import NoPartSelected
		headModel[9] = new ModelRendererTurbo(this, 27, 2, textureX, textureY); // Import NoPartSelected
		headModel[10] = new ModelRendererTurbo(this, 30, 17, textureX, textureY); // Import NoPartSelected
		headModel[11] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Import NoPartSelected
		headModel[12] = new ModelRendererTurbo(this, 7, 12, textureX, textureY); // Import NoPartSelected
		headModel[13] = new ModelRendererTurbo(this, 32, 11, textureX, textureY); // Import NoPartSelected
		headModel[14] = new ModelRendererTurbo(this, 44, 25, textureX, textureY); // Import NoPartSelected

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import NoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-4.5F, -6.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import NoPartSelected
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-1.5F, -9.9F, -5F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(-5.5F, -9.9F, -1F, 4, 6, 2, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import NoPartSelected
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(-5.5F, -3.9F, -2F, 1, 4, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import NoPartSelected
		headModel[4].setRotationPoint(0F, -1.5F, 0F);

		headModel[5].addShapeBox(-5.5F, -4.9F, -5F, 2, 5, 3, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import NoPartSelected
		headModel[5].setRotationPoint(0F, -1.5F, 0F);

		headModel[6].addShapeBox(-4F, -3.9F, -5F, 2, 4, 1, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Import NoPartSelected
		headModel[6].setRotationPoint(0F, -1.5F, 0F);

		headModel[7].addShapeBox(2F, -3.9F, -5F, 2, 4, 1, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Import NoPartSelected
		headModel[7].setRotationPoint(0F, -1.5F, 0F);

		headModel[8].addShapeBox(3.5F, -4.9F, -5F, 2, 5, 3, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[8].setRotationPoint(0F, -1.5F, 0F);

		headModel[9].addShapeBox(1.5F, -9.9F, -1F, 4, 6, 2, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[9].setRotationPoint(0F, -1.5F, 0F);

		headModel[10].addShapeBox(4F, -3.9F, -2F, 1, 4, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import NoPartSelected
		headModel[10].setRotationPoint(0F, -1.5F, 0F);

		headModel[11].addShapeBox(-0.5F, -10.2F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[11].setRotationPoint(0F, -1.5F, 0F);

		headModel[12].addShapeBox(-5.5F, -9.2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[12].setRotationPoint(0F, -1.5F, 0F);

		headModel[13].addShapeBox(4.5F, -9.2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		headModel[13].setRotationPoint(0F, -1.5F, 0F);

		headModel[14].addShapeBox(-5.5F, -3.9F, 1F, 11, 2, 4, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import NoPartSelected
		headModel[14].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[13];
		bodyModel[0] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import NoPartSelected
		bodyModel[1] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Import NoPartSelected
		bodyModel[2] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Import NoPartSelected
		bodyModel[3] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Import NoPartSelected
		bodyModel[4] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // Import NoPartSelected
		bodyModel[5] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Import NoPartSelected
		bodyModel[6] = new ModelRendererTurbo(this, 48, 37, textureX, textureY); // Import NoPartSelected
		bodyModel[7] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import NoPartSelected
		bodyModel[8] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Import NoPartSelected
		bodyModel[9] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Import NoPartSelected
		bodyModel[10] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Import NoPartSelected
		bodyModel[11] = new ModelRendererTurbo(this, 100, 69, textureX, textureY); // Import NoPartSelected
		bodyModel[12] = new ModelRendererTurbo(this, 100, 75, textureX, textureY); // Import NoPartSelected

		bodyModel[0].addShapeBox(2.5F, -1F, 2.5F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -1F, 2.5F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyModel[1].setRotationPoint(0F, -2F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 0F, 2.5F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import NoPartSelected
		bodyModel[2].setRotationPoint(0F, -2F, 0F);

		bodyModel[3].addShapeBox(2.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import NoPartSelected
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -3.5F, 9, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import NoPartSelected
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyModel[5].setRotationPoint(0F, -2F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 0F, -2.5F, 9, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import NoPartSelected
		bodyModel[6].setRotationPoint(0F, -2F, 0F);

		bodyModel[7].addShapeBox(2.5F, 2F, 2.5F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import NoPartSelected
		bodyModel[7].setRotationPoint(0F, -2F, 0F);

		bodyModel[8].addShapeBox(-4.5F, 2F, 2.5F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import NoPartSelected
		bodyModel[8].setRotationPoint(0F, -2F, 0F);

		bodyModel[9].addShapeBox(1.5F, 0F, 2.5F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import NoPartSelected
		bodyModel[9].setRotationPoint(0F, -2F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 0F, 2.5F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import NoPartSelected
		bodyModel[10].setRotationPoint(0F, -2F, 0F);

		bodyModel[11].addShapeBox(1.5F, 2F, -4.5F, 1, 3, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyModel[11].setRotationPoint(0F, -2F, 0F);

		bodyModel[12].addShapeBox(1.5F, 5F, -4.5F, 1, 3, 1, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0F, -0.2F, -1F, 0F); // Import NoPartSelected
		bodyModel[12].setRotationPoint(0F, -2F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import NoPartSelected
		leftArmModel[1] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Import NoPartSelected
		leftArmModel[2] = new ModelRendererTurbo(this, 109, 44, textureX, textureY); // Import NoPartSelected
		leftArmModel[3] = new ModelRendererTurbo(this, 119, 54, textureX, textureY); // Import NoPartSelected
		leftArmModel[4] = new ModelRendererTurbo(this, 112, 55, textureX, textureY); // Import NoPartSelected

		leftArmModel[0].addShapeBox(0.5F, 0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import NoPartSelected
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -3F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import NoPartSelected
		leftArmModel[1].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[2].addBox(5F, -1F, -2F, 1, 4, 5, 0F); // Import NoPartSelected
		leftArmModel[2].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[3].addShapeBox(5F, -1F, 3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import NoPartSelected
		leftArmModel[3].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[4].addShapeBox(5F, -1F, -4F, 1, 4, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		leftArmModel[4].setRotationPoint(4F, 0.5F, 0F);


		rightArmModel = new ModelRendererTurbo[5];
		rightArmModel[0] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Import NoPartSelected
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import NoPartSelected
		rightArmModel[2] = new ModelRendererTurbo(this, 112, 55, textureX, textureY); // Import NoPartSelected
		rightArmModel[3] = new ModelRendererTurbo(this, 109, 44, textureX, textureY); // Import NoPartSelected
		rightArmModel[4] = new ModelRendererTurbo(this, 119, 54, textureX, textureY); // Import NoPartSelected

		rightArmModel[0].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import NoPartSelected
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import NoPartSelected
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-6F, -0.5F, -4F, 1, 4, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		rightArmModel[2].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[3].addBox(-6F, -0.5F, -2F, 1, 4, 5, 0F); // Import NoPartSelected
		rightArmModel[3].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[4].addShapeBox(-6F, -0.5F, 3F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import NoPartSelected
		rightArmModel[4].setRotationPoint(-4F, 0F, 0F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import NoPartSelected

		leftArmLightsModel [0].addBox(-6.1F, 0F, -1.97F, 0, 2, 1, 0F); // Import NoPartSelected
		leftArmLightsModel [0].setRotationPoint(-4F, 0.5F, 0F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import NoPartSelected

		leftArmLightsModel [0].addBox(6.1F, 0F, -1.97F, 0, 2, 1, 0F); // Import NoPartSelected
		leftArmLightsModel [0].setRotationPoint(4F, 0.5F, 0F);


		bodyLightsModel = new ModelRendererTurbo[4];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import NoPartSelected
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import NoPartSelected
		bodyLightsModel [2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import NoPartSelected
		bodyLightsModel [3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23

		bodyLightsModel [0].addShapeBox(-2.57F, 5F, -3.51F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Import NoPartSelected
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [2].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import NoPartSelected
		bodyLightsModel [2].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [3].addShapeBox(-2.57F, 5F, -3.51F, 2, 1, 0, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyLightsModel [3].setRotationPoint(0F, -2F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}