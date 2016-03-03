//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorSecurity extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorSecurity()
	{
		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import ImportNoPartSelected

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import ImportNoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[17];
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
		bodyModel[11] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 78, 86, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Import Body
		bodyModel[14] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Import Body
		bodyModel[15] = new ModelRendererTurbo(this, 66, 58, textureX, textureY); // Import Body
		bodyModel[16] = new ModelRendererTurbo(this, 40, 58, textureX, textureY); // Import Body

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

		bodyModel[11].addShapeBox(-5F, -1F, 2.5F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[11].setRotationPoint(0F, -2F, 0F);

		bodyModel[12].addShapeBox(-5.2F, -5F, 2.5F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 23
		bodyModel[12].setRotationPoint(0F, -2F, 0F);
		
		bodyModel[13].addShapeBox(-0.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Head
		bodyModel[13].setRotationPoint(0F, 10.5F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Head
		bodyModel[14].setRotationPoint(0F, 10.5F, 0F);

		bodyModel[15].addBox(-0.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Import Body
		bodyModel[15].setRotationPoint(0F, 10.5F, 0F);

		bodyModel[16].addBox(-4.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Import Body
		bodyModel[16].setRotationPoint(0F, 10.5F, 0F);


		leftArmModel = new ModelRendererTurbo[11];
		leftArmModel[0] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import LeftArm
		leftArmModel[1] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Import LeftArm
		leftArmModel[2] = new ModelRendererTurbo(this, 128, 18, textureX, textureY); // Box 1
		leftArmModel[3] = new ModelRendererTurbo(this, 119, 18, textureX, textureY); // Box 2
		leftArmModel[4] = new ModelRendererTurbo(this, 110, 18, textureX, textureY); // Box 3
		leftArmModel[5] = new ModelRendererTurbo(this, 118, 23, textureX, textureY); // Box 4
		leftArmModel[6] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 5
		leftArmModel[7] = new ModelRendererTurbo(this, 123, 29, textureX, textureY); // Box 6
		leftArmModel[8] = new ModelRendererTurbo(this, 122, 44, textureX, textureY); // Box 8
		leftArmModel[9] = new ModelRendererTurbo(this, 125, 36, textureX, textureY); // Box 9
		leftArmModel[10] = new ModelRendererTurbo(this, 116, 36, textureX, textureY); // Box 10

		leftArmModel[0].addShapeBox(0.5F, 0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import LeftArm
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -2.5F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import LeftArm
		leftArmModel[1].setRotationPoint(4F, 0F, 0F);

		leftArmModel[2].addShapeBox(3F, -4F, -2F, 2, 2, 2, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[2].setRotationPoint(5F, 0F, -1F);

		leftArmModel[3].addBox(3F, -4F, 0F, 2, 2, 2, 0F); // Box 2
		leftArmModel[3].setRotationPoint(5F, 0F, -1F);

		leftArmModel[4].addShapeBox(3F, -4F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[4].setRotationPoint(5F, 0F, -1F);

		leftArmModel[5].addBox(3.5F, -2F, 0F, 3, 3, 2, 0F); // Box 4
		leftArmModel[5].setRotationPoint(4F, 0F, -1F);

		leftArmModel[6].addShapeBox(3.5F, -2F, 2F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 5
		leftArmModel[6].setRotationPoint(4F, 0F, -1F);

		leftArmModel[7].addShapeBox(3.5F, -2F, -3F, 3, 3, 3, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftArmModel[7].setRotationPoint(4F, 0F, -1F);

		leftArmModel[8].addBox(5.5F, 1F, 0F, 1, 3, 2, 0F); // Box 8
		leftArmModel[8].setRotationPoint(4F, 0F, -1F);

		leftArmModel[9].addShapeBox(5.5F, 1F, -3F, 1, 3, 3, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftArmModel[9].setRotationPoint(4F, 0F, -1F);

		leftArmModel[10].addShapeBox(4.5F, 1F, 1.5F, 1, 3, 3, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftArmModel[10].setRotationPoint(4F, 0F, -1F);


		rightArmModel = new ModelRendererTurbo[11];
		rightArmModel[0] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Import Head
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import Head
		rightArmModel[2] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 11
		rightArmModel[3] = new ModelRendererTurbo(this, 123, 29, textureX, textureY); // Box 12
		rightArmModel[4] = new ModelRendererTurbo(this, 118, 23, textureX, textureY); // Box 13
		rightArmModel[5] = new ModelRendererTurbo(this, 128, 18, textureX, textureY); // Box 14
		rightArmModel[6] = new ModelRendererTurbo(this, 119, 18, textureX, textureY); // Box 15
		rightArmModel[7] = new ModelRendererTurbo(this, 110, 18, textureX, textureY); // Box 16
		rightArmModel[8] = new ModelRendererTurbo(this, 116, 36, textureX, textureY); // Box 17
		rightArmModel[9] = new ModelRendererTurbo(this, 122, 44, textureX, textureY); // Box 18
		rightArmModel[10] = new ModelRendererTurbo(this, 125, 36, textureX, textureY); // Box 19

		rightArmModel[0].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Head
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Head
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-6.5F, -2F, 2F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		rightArmModel[2].setRotationPoint(-4F, 0F, -1F);

		rightArmModel[3].addShapeBox(-6.5F, -2F, -3F, 3, 3, 3, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightArmModel[3].setRotationPoint(-4F, 0F, -1F);

		rightArmModel[4].addBox(-6.5F, -2F, 0F, 3, 3, 2, 0F); // Box 13
		rightArmModel[4].setRotationPoint(-4F, 0F, -1F);

		rightArmModel[5].addShapeBox(-7F, -4F, -2F, 2, 2, 2, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightArmModel[5].setRotationPoint(-3F, 0F, -1F);

		rightArmModel[6].addBox(-7F, -4F, 0F, 2, 2, 2, 0F); // Box 15
		rightArmModel[6].setRotationPoint(-3F, 0F, -1F);

		rightArmModel[7].addShapeBox(-7F, -4F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		rightArmModel[7].setRotationPoint(-3F, 0F, -1F);

		rightArmModel[8].addShapeBox(-5.5F, 1F, 1.5F, 1, 3, 3, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightArmModel[8].setRotationPoint(-4F, 0F, -1F);

		rightArmModel[9].addBox(-6.5F, 1F, 0F, 1, 3, 2, 0F); // Box 18
		rightArmModel[9].setRotationPoint(-4F, 0F, -1F);

		rightArmModel[10].addShapeBox(-6.5F, 1F, -3F, 1, 3, 3, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightArmModel[10].setRotationPoint(-4F, 0F, -1F);


		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import LeftLight

		leftArmLightsModel [0].addBox(6.51F, 2F, -0.97F, 0, 1, 2, 0F); // Import LeftLight
		leftArmLightsModel [0].setRotationPoint(4F, 0F, 0F);


		rightArmLightsModel = new ModelRendererTurbo[1];
		rightArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Box 20

		rightArmLightsModel [0].addBox(-6.52F, 2F, -0.97F, 0, 1, 2, 0F); // Box 20
		rightArmLightsModel [0].setRotationPoint(-4F, 0F, 0F);


		bodyLightsModel = new ModelRendererTurbo[4];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso

		bodyLightsModel [0].addShapeBox(1.43F, 5F, -3.51F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(-2.57F, 5F, -3.51F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [2].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [2].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [3].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [3].setRotationPoint(0F, -2F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}