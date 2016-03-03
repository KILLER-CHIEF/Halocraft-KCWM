//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorEOD extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorEOD()
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import ImportNoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import ImportNoPartSelected
		headModel[2] = new ModelRendererTurbo(this, 27, 8, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 9, 11, textureX, textureY); // Box 2
		headModel[4] = new ModelRendererTurbo(this, 9, 11, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import ImportNoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-4.5F, -7.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import ImportNoPartSelected
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-4.5F, -9F, -5.7F, 9, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Import Box0
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(-4.8F, -2F, -5.7F, 3, 2, 5, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F); // Box 2
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(1.8F, -2F, -5.7F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F); // Box 3
		headModel[4].setRotationPoint(0F, -1.5F, 0F);


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

		bodyModel[3].addShapeBox(2.5F, 0F, -4.5F, 2, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Body
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3F, -4.5F, 9, 3, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Body
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, -4.5F, 2, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Body
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


		leftArmModel = new ModelRendererTurbo[8];
		leftArmModel[0] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import LeftArm
		leftArmModel[1] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Import LeftArm
		leftArmModel[2] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Import LeftArm
		leftArmModel[3] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 4
		leftArmModel[4] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 5
		leftArmModel[5] = new ModelRendererTurbo(this, 118, 52, textureX, textureY); // Box 6
		leftArmModel[6] = new ModelRendererTurbo(this, 107, 55, textureX, textureY); // Box 7
		leftArmModel[7] = new ModelRendererTurbo(this, 107, 55, textureX, textureY); // Box 8

		leftArmModel[0].addShapeBox(0.5F, 0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import LeftArm
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -2.5F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import LeftArm
		leftArmModel[1].setRotationPoint(4F, 0F, 0F);

		leftArmModel[2].addShapeBox(5F, -4F, -2F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftArm
		leftArmModel[2].setRotationPoint(4F, 0F, 0F);

		leftArmModel[3].addShapeBox(5F, -4F, 2F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftArmModel[3].setRotationPoint(4F, 0F, 0F);

		leftArmModel[4].addShapeBox(5F, -4F, -4F, 2, 5, 2, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[4].setRotationPoint(4F, 0F, 0F);

		leftArmModel[5].addShapeBox(2F, -4F, -2F, 3, 5, 4, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftArmModel[5].setRotationPoint(4F, 0F, 0F);

		leftArmModel[6].addShapeBox(2F, -4F, 2F, 3, 5, 2, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftArmModel[6].setRotationPoint(4F, 0F, 0F);

		leftArmModel[7].addShapeBox(2F, -4F, -4F, 3, 5, 2, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[7].setRotationPoint(4F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[8];
		rightArmModel[0] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Import Head
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Import Head
		rightArmModel[2] = new ModelRendererTurbo(this, 107, 55, textureX, textureY); // Box 9
		rightArmModel[3] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 10
		rightArmModel[4] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 11
		rightArmModel[5] = new ModelRendererTurbo(this, 118, 52, textureX, textureY); // Box 12
		rightArmModel[6] = new ModelRendererTurbo(this, 107, 55, textureX, textureY); // Box 13
		rightArmModel[7] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 14

		rightArmModel[0].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Head
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, -0.5F, -3F, 5, 4, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Head
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-5F, -4.5F, -4F, 3, 5, 2, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightArmModel[2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[3].addShapeBox(-7F, -4.5F, -4F, 2, 5, 2, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightArmModel[3].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[4].addShapeBox(-7F, -4.5F, -2F, 2, 5, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightArmModel[4].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[5].addShapeBox(-5F, -4.5F, -2F, 3, 5, 4, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightArmModel[5].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[6].addShapeBox(-5F, -4.5F, 2F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightArmModel[6].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[7].addShapeBox(-7F, -4.5F, 2F, 2, 5, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		rightArmModel[7].setRotationPoint(-4F, 0.5F, 0F);



		leftArmLightsModel = new ModelRendererTurbo[1];
		leftArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import LeftLight

		leftArmLightsModel [0].addBox(7.02F, 0F, -0.97F, 0, 1, 2, 0F); // Import LeftLight
		leftArmLightsModel [0].setRotationPoint(4F, 0F, 0F);


		rightArmLightsModel = new ModelRendererTurbo[1];
		rightArmLightsModel [0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // Import RightLight

		rightArmLightsModel [0].addBox(-7.02F, -0.5F, -0.97F, 0, 1, 2, 0F); // Import RightLight
		rightArmLightsModel [0].setRotationPoint(-4F, 0.5F, 0F);


		bodyLightsModel = new ModelRendererTurbo[3];
		bodyLightsModel [0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso
		bodyLightsModel [2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import LightsTorso

		bodyLightsModel [0].addShapeBox(-0.65F, 5F, -4.54F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [0].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [1].addShapeBox(-3.57F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [1].setRotationPoint(0F, -2F, 0F);

		bodyLightsModel [2].addShapeBox(2.43F, 5F, 3.52F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import LightsTorso
		bodyLightsModel [2].setRotationPoint(0F, -2F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}