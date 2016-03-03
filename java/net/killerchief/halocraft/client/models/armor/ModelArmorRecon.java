//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorRecon extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorRecon()
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import ImportNoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 0
		headModel[2] = new ModelRendererTurbo(this, 31, 21, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 55, 28, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 5
		headModel[5] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 3
		headModel[6] = new ModelRendererTurbo(this, 90, 4, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 8

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import ImportNoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-1.5F, -9.5F, -3.5F, 3, 0, 8, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 2.2F, 0.2F, 0.2F, 2.2F, 0.2F, 0.2F, 2.2F, 0F, 0.5F, 2.2F, 0F, 0.5F); // Box 0
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-1.5F, -10F, -4.5F, 3, 1, 1, 0F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 1.6F, -0.5F, -0.2F, 1.6F, -0.5F, -0.2F); // Box 2
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(-1.6F, -1.8F, -5.8F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(4.8F, -6F, -4F, 1, 2, 9, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, 0.5F); // Box 5
		headModel[4].setRotationPoint(0F, -1.5F, 0F);

		headModel[5].addShapeBox(-5.6F, -1.8F, -5.3F, 11, 2, 11, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[5].setRotationPoint(0F, -1.5F, 0F);

		headModel[6].addShapeBox(-4.7F, -6F, 4.5F, 10, 2, 1, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 7
		headModel[6].setRotationPoint(0F, -1.5F, 0F);

		headModel[7].addShapeBox(-5.8F, -6F, -4F, 1, 2, 9, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.2F, -0.5F); // Box 8
		headModel[7].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[11];
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
		bodyModel[10] = new ModelRendererTurbo(this, 65, 104, textureX, textureY); // Import Body

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

		bodyModel[10].addShapeBox(-1.5F, 0F, 2.5F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Body
		bodyModel[10].setRotationPoint(0F, -2F, 0F);


		leftArmModel = new ModelRendererTurbo[11];
		leftArmModel[0] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import LeftArm
		leftArmModel[1] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Import LeftArm
		leftArmModel[2] = new ModelRendererTurbo(this, 133, 46, textureX, textureY); // Box 18
		leftArmModel[3] = new ModelRendererTurbo(this, 133, 46, textureX, textureY); // Box 19
		leftArmModel[4] = new ModelRendererTurbo(this, 121, 38, textureX, textureY); // Box 20
		leftArmModel[5] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 21
		leftArmModel[6] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 22
		leftArmModel[7] = new ModelRendererTurbo(this, 138, 27, textureX, textureY); // Box 23
		leftArmModel[8] = new ModelRendererTurbo(this, 121, 47, textureX, textureY); // Box 24
		leftArmModel[9] = new ModelRendererTurbo(this, 132, 51, textureX, textureY); // Box 25
		leftArmModel[10] = new ModelRendererTurbo(this, 132, 51, textureX, textureY); // Box 26

		leftArmModel[0].addShapeBox(0.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import LeftArm
		leftArmModel[0].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[1].addShapeBox(0F, -3F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import LeftArm
		leftArmModel[1].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[2].addShapeBox(5.8F, -1.5F, -3F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftArmModel[2].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[3].addShapeBox(5.8F, -1.5F, 2F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 19
		leftArmModel[3].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[4].addShapeBox(5.8F, -3.5F, -2F, 1, 3, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftArmModel[4].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[5].addShapeBox(5.8F, -3.5F, 2F, 1, 2, 2, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 21
		leftArmModel[5].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[6].addShapeBox(5.8F, -3.5F, -4F, 1, 2, 2, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 22
		leftArmModel[6].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[7].addShapeBox(5.8F, -3.5F, -1F, 1, 3, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 23
		leftArmModel[7].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[8].addBox(5F, -0.5F, -2F, 1, 4, 4, 0F); // Box 24
		leftArmModel[8].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[9].addShapeBox(5F, 1.5F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftArmModel[9].setRotationPoint(4F, 0.5F, 0F);

		leftArmModel[10].addShapeBox(5F, 1.5F, -4F, 1, 2, 2, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftArmModel[10].setRotationPoint(4F, 0.5F, 0F);


		rightArmModel = new ModelRendererTurbo[11];
		rightArmModel[0] = new ModelRendererTurbo(this, 121, 38, textureX, textureY); // Import LeftArm
		rightArmModel[1] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Import Head
		rightArmModel[2] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import Head
		rightArmModel[3] = new ModelRendererTurbo(this, 109, 34, textureX, textureY); // Box 10
		rightArmModel[4] = new ModelRendererTurbo(this, 133, 46, textureX, textureY); // Box 11
		rightArmModel[5] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 12
		rightArmModel[6] = new ModelRendererTurbo(this, 121, 47, textureX, textureY); // Box 13
		rightArmModel[7] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 14
		rightArmModel[8] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 15
		rightArmModel[9] = new ModelRendererTurbo(this, 132, 41, textureX, textureY); // Box 16
		rightArmModel[10] = new ModelRendererTurbo(this, 125, 30, textureX, textureY); // Box 17

		rightArmModel[0].addShapeBox(-6.2F, -3F, -2F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Import LeftArm
		rightArmModel[0].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[1].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Head
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Head
		rightArmModel[2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[3].addShapeBox(-6.2F, -1F, -3F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightArmModel[3].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[4].addShapeBox(-6.2F, -1F, 2F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 11
		rightArmModel[4].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[5].addShapeBox(-6.2F, -3F, 2F, 1, 2, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		rightArmModel[5].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[6].addBox(-6F, 0F, -2F, 1, 4, 4, 0F); // Box 13
		rightArmModel[6].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[7].addShapeBox(-6F, 2F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		rightArmModel[7].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[8].addShapeBox(-6F, 2F, -4F, 1, 2, 2, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightArmModel[8].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[9].addShapeBox(-6.2F, -3F, -4F, 1, 2, 2, 0F, -1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		rightArmModel[9].setRotationPoint(-4F, 0F, 0F);

		rightArmModel[10].addShapeBox(-6.2F, -3F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightArmModel[10].setRotationPoint(-4F, 0F, 0F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import LeftLight

		leftArmLightsModel [0].addBox(6.01F, 3F, -0.97F, 0, 1, 2, 0F); // Import LeftLight
		leftArmLightsModel [0].setRotationPoint(4F, 0F, 0F);


		rightArmLightsModel = new ModelRendererTurbo[1];
		rightArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 27

		rightArmLightsModel [0].addBox(-6.04F, 3F, -0.97F, 0, 1, 2, 0F); // Box 27
		rightArmLightsModel [0].setRotationPoint(-4F, 0F, 0F);


		bodyLightsModel = new ModelRendererTurbo[3];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso

		bodyLightsModel [0].addShapeBox(-0.7F, 5F, -3.51F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [2].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [2].setRotationPoint(0F, -2F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}