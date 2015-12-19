//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorLights extends Model3DArmor
{
	int textureX = 32;
	int textureY = 31;

	public ModelArmorLights()
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 32

		bodyModel[0].addShapeBox(0.5F, 4F, -4.5F, 2, 1, 0, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[0].setRotationPoint(-0.1F, -2F, -0.1F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 19, -26, textureX, textureY); // Box 33
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 42, textureX, textureY); // Box 37

		leftArmModel[0].addBox(5F, 0F, -2F, 0, 1, 2, 0F); // Box 33
		leftArmModel[0].setRotationPoint(5.6F, 0F, 1F);

		leftArmModel[1].addBox(6.1F, -0.5F, -0.9F, 0, 1, 2, 0F); // Box 37
		leftArmModel[1].setRotationPoint(4.5F, 0.5F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, -33, -19, textureX, textureY); // Box 34

		rightArmModel[0].addBox(-6.1F, -0.5F, -0.9F, 0, 1, 2, 0F); // Box 34
		rightArmModel[0].setRotationPoint(-4.5F, 0.5F, 0F);

		//flipAll();
	}
}