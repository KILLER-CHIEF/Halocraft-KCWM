//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import org.lwjgl.opengl.GL11;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class ModelArmorMarkV extends Model3DArmor
{

	/*public ModelArmorMarkV()
	{
		int textureX = 256;
		int textureY = 256;

		headModel = new ModelRendererTurbo[10];
		headModel[0] = new ModelRendererTurbo(this, 53, 38, textureX, textureY); // Helmet1
		headModel[1] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Helmet2
		headModel[2] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Helmet3
		headModel[3] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Helmet4
		headModel[4] = new ModelRendererTurbo(this, 113, 16, textureX, textureY); // Helmet5
		headModel[5] = new ModelRendererTurbo(this, 113, 16, textureX, textureY); // Helmet6
		headModel[6] = new ModelRendererTurbo(this, 56, 16, textureX, textureY); // Helmet7
		headModel[7] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet9
		headModel[8] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet10
		headModel[9] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet11


		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F); // Helmet1
		headModel[0].setRotationPoint(0F, -15F, 0F);

		headModel[1].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Helmet2
		headModel[1].setRotationPoint(0F, -15F, 0F);

		headModel[2].addShapeBox(-5F, -7F, 0F, 4, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Helmet3
		headModel[2].setRotationPoint(0F, -15F, 0F);

		headModel[3].addShapeBox(1F, -7F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Helmet4
		headModel[3].setRotationPoint(0F, -15F, 0F);

		headModel[4].addShapeBox(-4.5F, -3F, -1F, 1, 3, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Helmet5
		headModel[4].setRotationPoint(-1F, -15F, 0F);

		headModel[5].addShapeBox(5.5F, -3F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Helmet6
		headModel[5].setRotationPoint(-1F, -15F, 0F);

		headModel[6].addShapeBox(-4F, -6F, 0F, 8, 4, 4, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Helmet7
		headModel[6].setRotationPoint(0F, -15F, 0F);

		headModel[7].addBox(4.1F, 2F, -2F, 0, 1, 1, 0F); // Helmet9
		headModel[7].setRotationPoint(0F, -15F, -1F);

		headModel[8].addBox(-3.1F, 5F, -2F, 0, 1, 1, 0F); // Helmet10
		headModel[8].setRotationPoint(0F, -15F, -1F);

		headModel[9].addBox(-4.1F, 2F, -2F, 0, 1, 1, 0F); // Helmet11
		headModel[9].setRotationPoint(0F, -15F, -1F);


		visorModel = new ModelRendererTurbo[1];

		visorModel[0].addBox(3.1F, 5F, -2F, 0, 1, 1, 0F); // VISOR
		visorModel[0].setRotationPoint(0F, -15F, -1F);

		helmetModelLights = new ModelRendererTurbo[2];

		helmetModelLights[0].addShapeBox(-4.5F, -2.6F, 1.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // HelmetLIGHTS
		helmetModelLights[0].setRotationPoint(-1F, -15F, 0F);

		helmetModelLights[1].addShapeBox(-4.5F, -1.4F, 1.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // HelmetLIGHTS
		helmetModelLights[1].setRotationPoint(-1F, -15F, 0F);


		bodyModel = new ModelRendererTurbo[13];
		bodyModel[0] = new ModelRendererTurbo(this, 99, 74, textureX, textureY); // Chest1
		bodyModel[1] = new ModelRendererTurbo(this, 116, 50, textureX, textureY); // Chest2
		bodyModel[2] = new ModelRendererTurbo(this, 90, 54, textureX, textureY); // Chest3
		bodyModel[3] = new ModelRendererTurbo(this, 119, 72, textureX, textureY); // Chest4
		bodyModel[4] = new ModelRendererTurbo(this, 90, 71, textureX, textureY); // Chest5
		bodyModel[5] = new ModelRendererTurbo(this, 104, 80, textureX, textureY); // Chest6
		bodyModel[6] = new ModelRendererTurbo(this, 105, 85, textureX, textureY); // Chest7
		bodyModel[7] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // Chest12
		bodyModel[8] = new ModelRendererTurbo(this, 92, 106, textureX, textureY); // Chest13
		bodyModel[9] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Chest14
		bodyModel[10] = new ModelRendererTurbo(this, 114, 101, textureX, textureY); // Chest15
		bodyModel[11] = new ModelRendererTurbo(this, 116, 106, textureX, textureY); // Chest16
		bodyModel[12] = new ModelRendererTurbo(this, 102, 113, textureX, textureY); // Chest17


		bodyModel[0].addShapeBox(-4F, 3F, 2F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Chest1
		bodyModel[0].setRotationPoint(0F, -15F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, 2F, 3, 3, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Chest2
		bodyModel[1].setRotationPoint(0F, -15F, 0F);

		bodyModel[2].addShapeBox(1F, 0F, 2F, 3, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Chest3
		bodyModel[2].setRotationPoint(0F, -15F, 0F);

		bodyModel[3].addShapeBox(-4F, 5F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.9F, 0F, 0F, -1.9F); // Chest4
		bodyModel[3].setRotationPoint(0F, -15F, 0F);

		bodyModel[4].addShapeBox(2F, 5F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F, 0F, -1.9F); // Chest5
		bodyModel[4].setRotationPoint(0F, -15F, 0F);

		bodyModel[5].addShapeBox(-2F, 6F, 2F, 4, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Chest6
		bodyModel[5].setRotationPoint(0F, -15F, 0F);

		bodyModel[6].addShapeBox(-1F, 7F, 2F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest7
		bodyModel[6].setRotationPoint(0F, -15F, 0F);

		bodyModel[11].addShapeBox(-3F, 1F, -3F, 6, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Chest12
		bodyModel[11].setRotationPoint(0F, -15F, -1F);

		bodyModel[12].addShapeBox(-4F, 1F, -3F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Chest13
		bodyModel[12].setRotationPoint(0F, -15F, -1F);

		bodyModel[13].addShapeBox(-4F, -1F, -3F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chest14
		bodyModel[13].setRotationPoint(0F, -15F, -1F);

		bodyModel[14].addShapeBox(2F, -1F, -3F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chest15
		bodyModel[14].setRotationPoint(0F, -15F, -1F);

		bodyModel[15].addShapeBox(3F, 1F, -3F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Chest16
		bodyModel[15].setRotationPoint(0F, -15F, -1F);

		bodyModel[16].addShapeBox(-2F, 8F, -2.5F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest17
		bodyModel[16].setRotationPoint(0F, -15F, 0F);


		bodyModelLights = new ModelRendererTurbo[5];

		bodyModelLights[0].addBox(-2F, 4F, 4.1F, 2, 1, 0, 0F); // Chest18
		bodyModelLights[0].setRotationPoint(0F, -15F, 0F);

		bodyModelLights[1].addShapeBox(-3.5F, 7F, 2F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest8
		bodyModelLights[1].setRotationPoint(0F, -15F, 0F);

		bodyModelLights[2].addShapeBox(1.5F, 7F, 2F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest9
		bodyModelLights[2].setRotationPoint(0F, -15F, 0F);

		bodyModelLights[3].addShapeBox(4F, 7F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Chest10
		bodyModelLights[3].setRotationPoint(0F, -15F, 0F);

		bodyModelLights[4].addShapeBox(-4.5F, 7F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Chest11
		bodyModelLights[4].setRotationPoint(0F, -15F, 0F);


		leftArmModel = new ModelRendererTurbo[8];
		leftArmModel[0] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Left Arm1
		leftArmModel[1] = new ModelRendererTurbo(this, 43, 57, textureX, textureY); // Left Arm2
		leftArmModel[2] = new ModelRendererTurbo(this, 43, 65, textureX, textureY); // Left Arm3
		leftArmModel[3] = new ModelRendererTurbo(this, 8, 81, textureX, textureY); // Left Arm4
		leftArmModel[4] = new ModelRendererTurbo(this, 8, 91, textureX, textureY); // Left Arm5
		leftArmModel[5] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Left Arm6
		leftArmModel[6] = new ModelRendererTurbo(this, 18, 105, textureX, textureY); // Left Arm7
		leftArmModel[7] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Left Arm8

		leftArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left Arm1
		leftArmModel[0].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[1].addShapeBox(-4F, -2F, -2F, 1, 3, 4, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Arm2
		leftArmModel[1].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[2].addShapeBox(-4F, 1F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Left Arm3
		leftArmModel[2].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[3].addShapeBox(-3F, 2F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Left Arm4
		leftArmModel[3].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[4].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Left Arm5
		leftArmModel[4].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[5].addShapeBox(-4F, 9F, -3.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -2F, 0F, -0.8F, -2F, 0F); // Left Arm6
		leftArmModel[5].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[6].addShapeBox(-4F, 9F, -2.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, -0.8F, -2F, 0F); // Left Arm7
		leftArmModel[6].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[7].addShapeBox(-4F, 9F, -1.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2F, -2F, 0F, -2F, -2F, 0F, -2.5F, 0F, -0.8F, -2.5F, 0F); // Left Arm8
		leftArmModel[7].setRotationPoint(-5F, -13F, 0F);


		rightArmModel = new ModelRendererTurbo[8];
		rightArmModel[0] = new ModelRendererTurbo(this, 8, 52, textureX, textureY); // Right arm1
		rightArmModel[1] = new ModelRendererTurbo(this, 8, 81, textureX, textureY); // Right arm2
		rightArmModel[2] = new ModelRendererTurbo(this, 8, 91, textureX, textureY); // Right arm3
		rightArmModel[3] = new ModelRendererTurbo(this, 43, 65, textureX, textureY); // Right arm4
		rightArmModel[4] = new ModelRendererTurbo(this, 43, 57, textureX, textureY); // Right arm5
		rightArmModel[5] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Right arm7
		rightArmModel[6] = new ModelRendererTurbo(this, 18, 105, textureX, textureY); // Right arm8
		rightArmModel[7] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Right arm9

		rightArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right arm1
		rightArmModel[0].setRotationPoint(5F, -13F, 0F);

		rightArmModel[1].addShapeBox(-1F, 2F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Right arm2
		rightArmModel[1].setRotationPoint(5F, -13F, 0F);

		rightArmModel[2].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Right arm3
		rightArmModel[2].setRotationPoint(5F, -13F, 0F);

		rightArmModel[3].addShapeBox(3F, 1F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Right arm4
		rightArmModel[3].setRotationPoint(5F, -13F, 0F);

		rightArmModel[4].addShapeBox(3F, -2F, -2F, 1, 3, 4, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right arm5
		rightArmModel[4].setRotationPoint(5F, -13F, 0F);


		rightArmModel[5].addShapeBox(3F, 9F, -1.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2F, -0.8F, -2F, -2F, -0.8F, -2.5F, 0F, 0F, -2.5F, 0F); // Right arm7
		rightArmModel[5].setRotationPoint(5F, -13F, 0F);

		rightArmModel[6].addShapeBox(3F, 9F, -2.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2F, -0.8F, -2F, -2F, -0.8F, -2F, 0F, 0F, -2F, 0F); // Right arm8
		rightArmModel[6].setRotationPoint(5F, -13F, 0F);

		rightArmModel[7].addShapeBox(3F, 9F, -3.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -2F, -0.8F, -2.5F, -2F, -0.8F, -2F, 0F, 0F, -2F, 0F); // Right arm9
		rightArmModel[7].setRotationPoint(5F, -13F, 0F);

		rightArmModelLights = new ModelRendererTurbo[1];

		rightArmModelLights[0].addBox(4.1F, 1F, -1F, 0, 1, 2, 0F); // Right arm6
		rightArmModelLights[0].setRotationPoint(5F, -13F, 0F);

		leftArmModelLights = new ModelRendererTurbo[1];

		leftArmModelLights[0].addBox(-4.1F, 1F, -1F, 0, 1, 2, 0F); // Left Arm9
		leftArmModelLights[0].setRotationPoint(-5F, -13F, 0F);

		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 72, 83, textureX, textureY); // Left leg1

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left leg1
		leftLegModel[0].setRotationPoint(-2F, -3F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 55, 83, textureX, textureY); // Right leg1

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right leg1
		rightLegModel[0].setRotationPoint(2F, -3F, 0F);


		rightBootModel = new ModelRendererTurbo[1];
		rightBootModel[0] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Right boot1

		rightBootModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right boot1
		rightBootModel[0].setRotationPoint(2F, 3F, 0F);


		leftBootModel = new ModelRendererTurbo[1];
		leftBootModel[0] = new ModelRendererTurbo(this, 72, 94, textureX, textureY); // Left boot1

		leftBootModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left boot1
		leftBootModel[0].setRotationPoint(-2F, 3F, 0F);

		flipAll();	
	}*/
	
	public ModelArmorMarkV()
	{
		int textureX = 256;
		int textureY = 256;
		
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 74, 6, textureX, textureY); // Import Head1
		headModel[1] = new ModelRendererTurbo(this, 74, 6, textureX, textureY); // Import Head2
		headModel[2] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import Head3
		headModel[3] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import Head4
		headModel[4] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import Head7

		headModel[0].addShapeBox(1F, -7.5F, -5.5F, 4, 1, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Head1
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-5F, -7.5F, -5.5F, 4, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Head2
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import Head3
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(-5.6F, -4.5F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Head4
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(4.6F, -4.5F, -2F, 1, 2, 2, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import Head7
		headModel[4].setRotationPoint(0F, -1.5F, 0F);


		bodyModel = new ModelRendererTurbo[16];
		bodyModel[0] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // body1
		bodyModel[1] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // body2
		bodyModel[2] = new ModelRendererTurbo(this, 40, 103, textureX, textureY); // body3
		bodyModel[3] = new ModelRendererTurbo(this, 54, 95, textureX, textureY); // body4
		bodyModel[4] = new ModelRendererTurbo(this, 75, 103, textureX, textureY); // body5
		bodyModel[5] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // body6
		bodyModel[6] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // body7
		bodyModel[7] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // body8
		bodyModel[8] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // body9
		bodyModel[9] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // body10
		bodyModel[10] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // body11
		bodyModel[11] = new ModelRendererTurbo(this, 91, 71, textureX, textureY); // body12
		bodyModel[12] = new ModelRendererTurbo(this, 48, 37, textureX, textureY); // body13
		bodyModel[13] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // body14
		bodyModel[14] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // body15
		bodyModel[15] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // body16

		bodyModel[0].addBox(-5F, 8F, -3F, 1, 3, 2, 0F); // body1
		bodyModel[0].setRotationPoint(0F, -2F, 0F);

		bodyModel[1].addBox(-3.5F, 8F, -3F, 2, 3, 1, 0F); // body2
		bodyModel[1].setRotationPoint(0F, -2F, 0F);

		bodyModel[2].addShapeBox(3.5F, 2F, 2.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // body3
		bodyModel[2].setRotationPoint(0F, -2F, 0F);

		bodyModel[3].addShapeBox(1.5F, 0F, 2.5F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // body4
		bodyModel[3].setRotationPoint(0F, -2F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 2F, 2.5F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // body5
		bodyModel[4].setRotationPoint(0F, -2F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 0F, 2.5F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // body6
		bodyModel[5].setRotationPoint(0F, -2F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 2F, 2.5F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // body7
		bodyModel[6].setRotationPoint(0F, -2F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 5F, -3.5F, 2, 3, 1, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // body8
		bodyModel[7].setRotationPoint(0F, -2F, 0F);

		bodyModel[8].addShapeBox(2.5F, 5F, -3.5F, 2, 3, 1, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // body9
		bodyModel[8].setRotationPoint(0F, -2F, 0F);

		bodyModel[9].addShapeBox(2.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // body10
		bodyModel[9].setRotationPoint(0F, -2F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 3F, -4.5F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // body11
		bodyModel[10].setRotationPoint(0F, -2F, 0F);

		bodyModel[11].addShapeBox(-4.5F, 0F, -3.5F, 2, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F); // body12
		bodyModel[11].setRotationPoint(0F, -2F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 0F, -2.5F, 9, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // body13
		bodyModel[12].setRotationPoint(0F, -2F, 0F);

		bodyModel[13].addBox(1.5F, 8F, -3F, 2, 3, 1, 0F); // body14
		bodyModel[13].setRotationPoint(0F, -2F, 0F);

		bodyModel[14].addBox(-1F, 8F, -3F, 2, 3, 1, 0F); // body15
		bodyModel[14].setRotationPoint(0F, -2F, 0F);

		bodyModel[15].addBox(4F, 8F, -3F, 1, 3, 2, 0F); // body16
		bodyModel[15].setRotationPoint(0F, -2F, 0F);


		leftArmModel = new ModelRendererTurbo[4];
		leftArmModel[0] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // LEFTarm01
		leftArmModel[1] = new ModelRendererTurbo(this, 109, 35, textureX, textureY); // LEFTarm02
		leftArmModel[2] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // LEFTarm03
		leftArmModel[3] = new ModelRendererTurbo(this, 82, 36, textureX, textureY); // LEFTarm04

		leftArmModel[0].addShapeBox(5F, -3F, -2F, 1, 3, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LEFTarm01
		leftArmModel[0].setRotationPoint(4F, 0F, 0F);

		leftArmModel[1].addShapeBox(5F, 0F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // LEFTarm02
		leftArmModel[1].setRotationPoint(4F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.5F, 0.5F, -3F, 5, 3, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // LEFTarm03
		leftArmModel[2].setRotationPoint(4F, 0F, 0F);

		leftArmModel[3].addShapeBox(0F, -2.5F, -2.5F, 5, 13, 5, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // LEFTarm04
		leftArmModel[3].setRotationPoint(4F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[4];
		rightArmModel[0] = new ModelRendererTurbo(this, 109, 35, textureX, textureY); // RIGHTarm01
		rightArmModel[1] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // RIGHTarm02
		rightArmModel[2] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // RIGHTarm03
		rightArmModel[3] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // RIGHTarm04

		rightArmModel[0].addShapeBox(-6F, -0.5F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // RIGHTarm01
		rightArmModel[0].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[1].addShapeBox(-5.5F, 0.5F, -3F, 5, 3, 6, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // RIGHTarm02
		rightArmModel[1].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[2].addShapeBox(-6F, -3.5F, -2F, 1, 3, 4, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RIGHTarm03
		rightArmModel[2].setRotationPoint(-4F, 0.5F, 0F);

		rightArmModel[3].addShapeBox(-5F, -3F, -2.5F, 5, 13, 5, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // RIGHTarm04
		rightArmModel[3].setRotationPoint(-4F, 0.5F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 66, 58, textureX, textureY); // LEFTleg1

		leftLegModel[0].addBox(-0.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // LEFTleg1
		leftLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 40, 58, textureX, textureY); // RIGHTleg01

		rightLegModel[0].addBox(-4.5F, -0.5F, -2.5F, 5, 13, 5, 0F); // RIGHTleg01
		rightLegModel[0].setRotationPoint(0F, 10.5F, 0F);


		leftBootModel = new ModelRendererTurbo[1];
		leftBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // LEFTboot1

		leftBootModel[0].addShapeBox(-0.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // LEFTboot1
		leftBootModel[0].setRotationPoint(0F, 10.5F, 0F);



		leftArmModelLights = new ModelRendererTurbo[1];
		leftArmModelLights[0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // LEFTarm05

		leftArmModelLights[0].addBox(6.01F, 0F, -0.97F, 0, 1, 2, 0F); // Import LEFTarm05
		leftArmModelLights[0].setRotationPoint(4F, 0F, 0F);

		rightArmModelLights = new ModelRendererTurbo[1];
		rightArmModelLights[0] = new ModelRendererTurbo(this, 3, 0, textureX, textureY); // RIGHTarm05

		rightArmModelLights[0].addBox(-6.01F, -0.5F, -1.03F, 0, 1, 2, 0F); // Import RIGHTarm05
		rightArmModelLights[0].setRotationPoint(-4F, 0.5F, 0F);



		bodyModelLights = new ModelRendererTurbo[1];
		bodyModelLights[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // body17

		bodyModelLights[0].addShapeBox(0.43F, 4F, -4.51F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import body17
		bodyModelLights[0].setRotationPoint(0F, -2F, 0F);

		rightBootModel = new ModelRendererTurbo[1];
		rightBootModel[0] = new ModelRendererTurbo(this, 39, 79, textureX, textureY); // RIGHTboot1


		rightBootModel[0].addShapeBox(-4.5F, 9.5F, -2.5F, 5, 3, 5, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // RIGHTboot1
		rightBootModel[0].setRotationPoint(0F, 10.5F, 0F);



		visorModel = new ModelRendererTurbo[1];
		visorModel[0] = new ModelRendererTurbo(this, 0, 194, 357, 204); // Head6

		visorModel[0].addShapeBox(-4.5F, -7.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import Head6
		visorModel[0].setRotationPoint(0F, -1.5F, 0F);


		//translateAll(0F, 0F, 0F);
		flipAll();
	}
	

	/*public ModelArmorMarkV()
	{
		int textureX = 128;
		int textureY = 128;

		headModel = new ModelRendererTurbo[13];
		headModel[0] = new ModelRendererTurbo(this, 53, 38, textureX, textureY); // Helmet1
		headModel[1] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Helmet2
		headModel[2] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Helmet3
		headModel[3] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Helmet4
		headModel[4] = new ModelRendererTurbo(this, 113, 16, textureX, textureY); // Helmet5
		headModel[5] = new ModelRendererTurbo(this, 113, 16, textureX, textureY); // Helmet6
		headModel[6] = new ModelRendererTurbo(this, 56, 16, textureX, textureY); // Helmet7
		headModel[7] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet8
		headModel[8] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet9
		headModel[9] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet10
		headModel[10] = new ModelRendererTurbo(this, 109, 99, textureX, textureY); // Helmet11
		headModel[11] = new ModelRendererTurbo(this, 103, 17, textureX, textureY); // Helmet12
		headModel[12] = new ModelRendererTurbo(this, 103, 17, textureX, textureY); // Helmet13

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F); // Helmet1
		headModel[0].setRotationPoint(0F, -15F, 0F);

		headModel[1].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Helmet2
		headModel[1].setRotationPoint(0F, -15F, 0F);

		headModel[2].addShapeBox(-5F, -7F, 0F, 4, 1, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Helmet3
		headModel[2].setRotationPoint(0F, -15F, 0F);

		headModel[3].addShapeBox(1F, -7F, 0F, 4, 1, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Helmet4
		headModel[3].setRotationPoint(0F, -15F, 0F);

		headModel[4].addShapeBox(-4.5F, -3F, -1F, 1, 3, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Helmet5
		headModel[4].setRotationPoint(-1F, -15F, 0F);

		headModel[5].addShapeBox(5.5F, -3F, -1F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Helmet6
		headModel[5].setRotationPoint(-1F, -15F, 0F);

		headModel[6].addShapeBox(-4F, -6F, 0F, 8, 4, 4, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Helmet7
		headModel[6].setRotationPoint(0F, -15F, 0F);

		headModel[7].addBox(3.1F, 5F, -2F, 0, 1, 1, 0F); // Helmet8
		headModel[7].setRotationPoint(0F, -15F, -1F);

		headModel[8].addBox(4.1F, 2F, -2F, 0, 1, 1, 0F); // Helmet9
		headModel[8].setRotationPoint(0F, -15F, -1F);

		headModel[9].addBox(-3.1F, 5F, -2F, 0, 1, 1, 0F); // Helmet10
		headModel[9].setRotationPoint(0F, -15F, -1F);

		headModel[10].addBox(-4.1F, 2F, -2F, 0, 1, 1, 0F); // Helmet11
		headModel[10].setRotationPoint(0F, -15F, -1F);

		headModel[11].addShapeBox(-4.5F, -2.6F, 1.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Helmet12
		headModel[11].setRotationPoint(-1F, -15F, 0F);

		headModel[12].addShapeBox(-4.5F, -1.4F, 1.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Helmet13
		headModel[12].setRotationPoint(-1F, -15F, 0F);


		bodyModel = new ModelRendererTurbo[18];
		bodyModel[0] = new ModelRendererTurbo(this, 99, 74, textureX, textureY); // Chest1
		bodyModel[1] = new ModelRendererTurbo(this, 116, 50, textureX, textureY); // Chest2
		bodyModel[2] = new ModelRendererTurbo(this, 90, 54, textureX, textureY); // Chest3
		bodyModel[3] = new ModelRendererTurbo(this, 119, 72, textureX, textureY); // Chest4
		bodyModel[4] = new ModelRendererTurbo(this, 90, 71, textureX, textureY); // Chest5
		bodyModel[5] = new ModelRendererTurbo(this, 104, 80, textureX, textureY); // Chest6
		bodyModel[6] = new ModelRendererTurbo(this, 105, 85, textureX, textureY); // Chest7
		bodyModel[7] = new ModelRendererTurbo(this, 112, 85, textureX, textureY); // Chest8
		bodyModel[8] = new ModelRendererTurbo(this, 98, 85, textureX, textureY); // Chest9
		bodyModel[9] = new ModelRendererTurbo(this, 117, 118, textureX, textureY); // Chest10
		bodyModel[10] = new ModelRendererTurbo(this, 90, 117, textureX, textureY); // Chest11
		bodyModel[11] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // Chest12
		bodyModel[12] = new ModelRendererTurbo(this, 92, 106, textureX, textureY); // Chest13
		bodyModel[13] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Chest14
		bodyModel[14] = new ModelRendererTurbo(this, 114, 101, textureX, textureY); // Chest15
		bodyModel[15] = new ModelRendererTurbo(this, 116, 106, textureX, textureY); // Chest16
		bodyModel[16] = new ModelRendererTurbo(this, 102, 113, textureX, textureY); // Chest17
		bodyModel[17] = new ModelRendererTurbo(this, 122, 77, textureX, textureY); // Chest18

		bodyModel[0].addShapeBox(-4F, 3F, 2F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Chest1
		bodyModel[0].setRotationPoint(0F, -15F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, 2F, 3, 3, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Chest2
		bodyModel[1].setRotationPoint(0F, -15F, 0F);

		bodyModel[2].addShapeBox(1F, 0F, 2F, 3, 3, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Chest3
		bodyModel[2].setRotationPoint(0F, -15F, 0F);

		bodyModel[3].addShapeBox(-4F, 5F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.9F, 0F, 0F, -1.9F); // Chest4
		bodyModel[3].setRotationPoint(0F, -15F, 0F);

		bodyModel[4].addShapeBox(2F, 5F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F, 0F, -1.9F); // Chest5
		bodyModel[4].setRotationPoint(0F, -15F, 0F);

		bodyModel[5].addShapeBox(-2F, 6F, 2F, 4, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Chest6
		bodyModel[5].setRotationPoint(0F, -15F, 0F);

		bodyModel[6].addShapeBox(-1F, 7F, 2F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest7
		bodyModel[6].setRotationPoint(0F, -15F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 7F, 2F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest8
		bodyModel[7].setRotationPoint(0F, -15F, 0F);

		bodyModel[8].addShapeBox(1.5F, 7F, 2F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest9
		bodyModel[8].setRotationPoint(0F, -15F, 0F);

		bodyModel[9].addShapeBox(4F, 7F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Chest10
		bodyModel[9].setRotationPoint(0F, -15F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 7F, 0F, 1, 3, 2, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Chest11
		bodyModel[10].setRotationPoint(0F, -15F, 0F);

		bodyModel[11].addShapeBox(-3F, 1F, -3F, 6, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Chest12
		bodyModel[11].setRotationPoint(0F, -15F, -1F);

		bodyModel[12].addShapeBox(-4F, 1F, -3F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Chest13
		bodyModel[12].setRotationPoint(0F, -15F, -1F);

		bodyModel[13].addShapeBox(-4F, -1F, -3F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chest14
		bodyModel[13].setRotationPoint(0F, -15F, -1F);

		bodyModel[14].addShapeBox(2F, -1F, -3F, 2, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chest15
		bodyModel[14].setRotationPoint(0F, -15F, -1F);

		bodyModel[15].addShapeBox(3F, 1F, -3F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Chest16
		bodyModel[15].setRotationPoint(0F, -15F, -1F);

		bodyModel[16].addShapeBox(-2F, 8F, -2.5F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Chest17
		bodyModel[16].setRotationPoint(0F, -15F, 0F);

		bodyModel[17].addBox(-2F, 4F, 4.1F, 2, 1, 0, 0F); // Chest18
		bodyModel[17].setRotationPoint(0F, -15F, 0F);


		leftArmModel = new ModelRendererTurbo[9];
		leftArmModel[0] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Left Arm1
		leftArmModel[1] = new ModelRendererTurbo(this, 43, 57, textureX, textureY); // Left Arm2
		leftArmModel[2] = new ModelRendererTurbo(this, 43, 65, textureX, textureY); // Left Arm3
		leftArmModel[3] = new ModelRendererTurbo(this, 8, 81, textureX, textureY); // Left Arm4
		leftArmModel[4] = new ModelRendererTurbo(this, 8, 91, textureX, textureY); // Left Arm5
		leftArmModel[5] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Left Arm6
		leftArmModel[6] = new ModelRendererTurbo(this, 18, 105, textureX, textureY); // Left Arm7
		leftArmModel[7] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Left Arm8
		leftArmModel[8] = new ModelRendererTurbo(this, 51, 64, textureX, textureY); // Left Arm9

		leftArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left Arm1
		leftArmModel[0].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[1].addShapeBox(-4F, -2F, -2F, 1, 3, 4, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Arm2
		leftArmModel[1].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[2].addShapeBox(-4F, 1F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Left Arm3
		leftArmModel[2].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[3].addShapeBox(-3F, 2F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Left Arm4
		leftArmModel[3].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[4].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Left Arm5
		leftArmModel[4].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[5].addShapeBox(-4F, 9F, -3.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -2F, 0F, -0.8F, -2F, 0F); // Left Arm6
		leftArmModel[5].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[6].addShapeBox(-4F, 9F, -2.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, -0.8F, -2F, 0F); // Left Arm7
		leftArmModel[6].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[7].addShapeBox(-4F, 9F, -1.5F, 1, 3, 3, 0F, -0.8F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -2F, -2F, 0F, -2F, -2F, 0F, -2.5F, 0F, -0.8F, -2.5F, 0F); // Left Arm8
		leftArmModel[7].setRotationPoint(-5F, -13F, 0F);

		leftArmModel[8].addBox(-4.1F, 1F, -1F, 0, 1, 2, 0F); // Left Arm9
		leftArmModel[8].setRotationPoint(-5F, -13F, 0F);


		rightArmModel = new ModelRendererTurbo[9];
		rightArmModel[0] = new ModelRendererTurbo(this, 8, 52, textureX, textureY); // Right arm1
		rightArmModel[1] = new ModelRendererTurbo(this, 8, 81, textureX, textureY); // Right arm2
		rightArmModel[2] = new ModelRendererTurbo(this, 8, 91, textureX, textureY); // Right arm3
		rightArmModel[3] = new ModelRendererTurbo(this, 43, 65, textureX, textureY); // Right arm4
		rightArmModel[4] = new ModelRendererTurbo(this, 43, 57, textureX, textureY); // Right arm5
		rightArmModel[5] = new ModelRendererTurbo(this, 51, 64, textureX, textureY); // Right arm6
		rightArmModel[6] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Right arm7
		rightArmModel[7] = new ModelRendererTurbo(this, 18, 105, textureX, textureY); // Right arm8
		rightArmModel[8] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Right arm9

		rightArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 12, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right arm1
		rightArmModel[0].setRotationPoint(5F, -13F, 0F);

		rightArmModel[1].addShapeBox(-1F, 2F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Right arm2
		rightArmModel[1].setRotationPoint(5F, -13F, 0F);

		rightArmModel[2].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Right arm3
		rightArmModel[2].setRotationPoint(5F, -13F, 0F);

		rightArmModel[3].addShapeBox(3F, 1F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Right arm4
		rightArmModel[3].setRotationPoint(5F, -13F, 0F);

		rightArmModel[4].addShapeBox(3F, -2F, -2F, 1, 3, 4, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right arm5
		rightArmModel[4].setRotationPoint(5F, -13F, 0F);

		rightArmModel[5].addBox(4.1F, 1F, -1F, 0, 1, 2, 0F); // Right arm6
		rightArmModel[5].setRotationPoint(5F, -13F, 0F);

		rightArmModel[6].addShapeBox(3F, 9F, -1.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2F, -0.8F, -2F, -2F, -0.8F, -2.5F, 0F, 0F, -2.5F, 0F); // Right arm7
		rightArmModel[6].setRotationPoint(5F, -13F, 0F);

		rightArmModel[7].addShapeBox(3F, 9F, -2.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2F, -0.8F, -2F, -2F, -0.8F, -2F, 0F, 0F, -2F, 0F); // Right arm8
		rightArmModel[7].setRotationPoint(5F, -13F, 0F);

		rightArmModel[8].addShapeBox(3F, 9F, -3.5F, 1, 3, 3, 0F, 0F, 0.5F, -2F, -0.8F, 0.5F, -2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -2F, -0.8F, -2.5F, -2F, -0.8F, -2F, 0F, 0F, -2F, 0F); // Right arm9
		rightArmModel[8].setRotationPoint(5F, -13F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 72, 83, textureX, textureY); // Left leg1

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left leg1
		leftLegModel[0].setRotationPoint(-2F, -3F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 55, 83, textureX, textureY); // Right leg1

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right leg1
		rightLegModel[0].setRotationPoint(2F, -3F, 0F);


		rightBootModel = new ModelRendererTurbo[1];
		rightBootModel[0] = new ModelRendererTurbo(this, 55, 94, textureX, textureY); // Right boot1

		rightBootModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Right boot1
		rightBootModel[0].setRotationPoint(2F, 3F, 0F);


		leftBootModel = new ModelRendererTurbo[1];
		leftBootModel[0] = new ModelRendererTurbo(this, 72, 94, textureX, textureY); // Left boot1

		leftBootModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Left boot1
		leftBootModel[0].setRotationPoint(-2F, 3F, 0F);

		//flipAll();
	}*/
}