//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelMarkVArmor extends Model3DArmor
{
	int textureX = 128;
	int textureY = 128;

	public ModelMarkVArmor()
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Head1
		headModel[1] = new ModelRendererTurbo(this, 74, 6, textureX, textureY); // Head2
		headModel[2] = new ModelRendererTurbo(this, 74, 6, textureX, textureY); // Head3
		headModel[3] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Head4
		headModel[4] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Head5

		headModel[0].addShapeBox(4.4F, -2F, -2F, 1, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Head1
		headModel[0].setRotationPoint(0F, -3F, 0F);

		headModel[1].addShapeBox(1F, -6F, -5.5F, 4, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head2
		headModel[1].setRotationPoint(0F, -3F, 0F);

		headModel[2].addShapeBox(-5F, -6F, -5.5F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Head3
		headModel[2].setRotationPoint(0F, -3F, 0F);

		headModel[3].addShapeBox(-4.5F, -7.5F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Head4
		headModel[3].setRotationPoint(0F, -3F, 0F);

		headModel[4].addShapeBox(-5.6F, -2F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Head5
		headModel[4].setRotationPoint(0F, -3F, 0F);


		bodyModel = new ModelRendererTurbo[16];
		bodyModel[0] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this, 40, 103, textureX, textureY); // Body3
		bodyModel[3] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // Body4
		bodyModel[4] = new ModelRendererTurbo(this, 75, 103, textureX, textureY); // Body5
		bodyModel[5] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Body6
		bodyModel[6] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Body7
		bodyModel[7] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // Body8
		bodyModel[8] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // Body9
		bodyModel[9] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Body10
		bodyModel[10] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // Body11
		bodyModel[11] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // Body12
		bodyModel[12] = new ModelRendererTurbo(this, 48, 37, textureX, textureY); // Body13
		bodyModel[13] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Body14
		bodyModel[14] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Body15
		bodyModel[15] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Body16

		bodyModel[0].addBox(-5F, 8F, -3F, 1, 3, 2, 0F); // Body1
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addBox(-3.5F, 8F, -3F, 2, 3, 1, 0F); // Body2
		bodyModel[1].setRotationPoint(0F, -2F, 0F);

		bodyModel[2].addShapeBox(3.5F, 2F, 2.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Body3
		bodyModel[2].setRotationPoint(0F, -2F, 0F);

		bodyModel[3].addShapeBox(1.5F, 0F, 2.5F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body4
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 2F, 2.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Body5
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, 2.5F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body6
		bodyModel[5].setRotationPoint(0F, -2F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 2F, 2.5F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Body7
		bodyModel[6].setRotationPoint(0F, -2F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 5F, -3.5F, 2, 3, 1, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Body8
		bodyModel[7].setRotationPoint(0F, -2F, 0F);

		bodyModel[8].addShapeBox(2.5F, 5F, -3.5F, 2, 3, 1, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Body9
		bodyModel[8].setRotationPoint(0F, -2F, 0F);

		bodyModel[9].addShapeBox(2.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Body10
		bodyModel[9].setRotationPoint(0F, -2F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 3F, -4.5F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body11
		bodyModel[10].setRotationPoint(0F, -2F, 0F);

		bodyModel[11].addShapeBox(-4.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F); // Body12
		bodyModel[11].setRotationPoint(0F, -2F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 0F, -2.5F, 9, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Body13
		bodyModel[12].setRotationPoint(0F, -2F, 0F);

		bodyModel[13].addBox(1.5F, 8F, -3F, 2, 3, 1, 0F); // Body14
		bodyModel[13].setRotationPoint(0F, -2F, 0F);

		bodyModel[14].addBox(-1F, 8F, -3F, 2, 3, 1, 0F); // Body15
		bodyModel[14].setRotationPoint(0F, -2F, 0F);

		bodyModel[15].addBox(4F, 8F, -3F, 1, 3, 2, 0F); // Body16
		bodyModel[15].setRotationPoint(0F, -2F, 0F);


		leftArmModel = new ModelRendererTurbo[4];
		leftArmModel[0] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // Boot Right1
		leftArmModel[1] = new ModelRendererTurbo(this, 109, 35, textureX, textureY); // Boot Right2
		leftArmModel[2] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Boot Right3
		leftArmModel[3] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // Boot Right4

		leftArmModel[0].addShapeBox(5F, -3F, -2F, 1, 3, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Boot Right1
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(5F, 0F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Boot Right2
		leftArmModel[1].setRotationPoint(4F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.5F, 0.5F, -3F, 5, 3, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Boot Right3
		leftArmModel[2].setRotationPoint(4F, 0F, 0F);

		leftArmModel[3].addShapeBox(0F, -2.5F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Boot Right4
		leftArmModel[3].setRotationPoint(4F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[4];
		rightArmModel[0] = new ModelRendererTurbo(this, 109, 35, textureX, textureY); // Right Arm1
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Right Arm2
		rightArmModel[2] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // Right Arm3
		rightArmModel[3] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Right Arm4

		rightArmModel[0].addShapeBox(-6F, -0.5F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Right Arm1
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, 0.5F, -3F, 5, 3, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Right Arm2
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-6F, -3.5F, -2F, 1, 3, 4, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right Arm3
		rightArmModel[2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[3].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Right Arm4
		rightArmModel[3].setRotationPoint(-4F, 0.5F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 66, 58, textureX, textureY); // Left Leg1

		leftLegModel[0].addBox(-0.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Left Leg1
		leftLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 40, 58, textureX, textureY); // Right Leg1

		rightLegModel[0].addBox(-4.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // Right Leg1
		rightLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		leftBootModel = new ModelRendererTurbo[1];
		leftBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Boot Left01

		leftBootModel[0].addShapeBox(-0.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Boot Left01
		leftBootModel[0].setRotationPoint(0F, 10.5F, 0F);


		rightBootModel = new ModelRendererTurbo[1];
		rightBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // Boot Right 1

		rightBootModel[0].addShapeBox(-4.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Boot Left02
		rightBootModel[0].setRotationPoint(0F, 10.5F, 0F);

		//translateAll(0F, 0F, 0F);
		flipAll();
	}
}