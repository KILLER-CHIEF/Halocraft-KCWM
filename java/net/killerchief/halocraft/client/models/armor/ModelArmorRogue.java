//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.armor;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelArmorRogue extends Model3DArmor
{
	int textureX = 256;
	int textureY = 256;

	public ModelArmorRogue()
	{
		headModel = new ModelRendererTurbo[11];
		headModel[0] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Import ImportNoPartSelected
		headModel[1] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Import ImportNoPartSelected
		headModel[2] = new ModelRendererTurbo(this, 98, 16, textureX, textureY); // Import ImportNoPartSelected
		headModel[3] = new ModelRendererTurbo(this, 98, 16, textureX, textureY); // Import ImportNoPartSelected
		headModel[4] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import LightsHead
		headModel[5] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import LightsHead
		headModel[6] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import LightsHead
		headModel[7] = new ModelRendererTurbo(this, 98, 7, textureX, textureY); // Import LightsHead
		headModel[8] = new ModelRendererTurbo(this, 43, 34, textureX, textureY); // Box 0
		headModel[9] = new ModelRendererTurbo(this, 58, 28, textureX, textureY); // Box 1
		headModel[10] = new ModelRendererTurbo(this, 58, 28, textureX, textureY); // Box 2

		headModel[0].addShapeBox(-4.5F, -9F, -4.5F, 9, 9, 9, 0F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Import ImportNoPartSelected
		headModel[0].setRotationPoint(0F, -1.5F, 0F);

		headModel[1].addShapeBox(-4.5F, -7.4F, -4.5F, 112, 40, 32, 0F, 0.1F, 0.3F, 0.1F, -102.9F, 0.3F, 0.1F, -102.8F, 0.3F, -27.8F, 0.2F, 0.3F, -27.8F, 0.1F, -34.2F, 0.1F, -102.9F, -34.2F, 0.1F, -102.8F, -34.2F, -27.8F, 0.2F, -34.2F, -27.8F); // Import ImportNoPartSelected
		headModel[1].setRotationPoint(0F, -1.5F, 0F);

		headModel[2].addShapeBox(-5.8F, -2.5F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F); // Import ImportNoPartSelected
		headModel[2].setRotationPoint(0F, -1.5F, 0F);

		headModel[3].addShapeBox(4.6F, -2.5F, 0F, 1, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F); // Import ImportNoPartSelected
		headModel[3].setRotationPoint(0F, -1.5F, 0F);

		headModel[4].addShapeBox(4.6F, -2.6F, -0.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Import LightsHead
		headModel[4].setRotationPoint(0F, -1.5F, 0F);

		headModel[5].addShapeBox(4.6F, -1.4F, -0.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Import LightsHead
		headModel[5].setRotationPoint(0F, -1.5F, 0F);

		headModel[6].addShapeBox(-5.8F, -2.6F, -0.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Import LightsHead
		headModel[6].setRotationPoint(0F, -1.5F, 0F);

		headModel[7].addShapeBox(-5.8F, -1.4F, -0.1F, 4, 4, 0, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Import LightsHead
		headModel[7].setRotationPoint(0F, -1.5F, 0F);

		headModel[8].addShapeBox(-4.5F, -9F, -7.2F, 9, 2, 2, 0F, -2.8F, -2F, 0.2F, -2.8F, -2F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, -2.8F, 0.2F, 0.2F, -2.8F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F); // Box 0
		headModel[8].setRotationPoint(0F, -1.5F, 0F);

		headModel[9].addShapeBox(-4.5F, -3F, -5.7F, 2, 3, 1, 0F, 0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, -1F, 0F, -1.8F, -0.5F, 0F, -1.8F, 0F, 0.2F, 0.2F, 0F); // Box 1
		headModel[9].setRotationPoint(0F, -1.5F, 0F);

		headModel[10].addShapeBox(2.5F, -3F, -5.7F, 2, 3, 1, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.5F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0F, -1.8F, 0F); // Box 2
		headModel[10].setRotationPoint(0F, -1.5F, 0F);

		//translateAll(0F, 0F, 0F);

		flipAll();
	}
}