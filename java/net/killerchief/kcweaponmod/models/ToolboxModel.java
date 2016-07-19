//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.kcweaponmod.models;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ToolboxModel extends Model3DWeaponBase
{
	int textureX = 256;
	int textureY = 256;

	public ToolboxModel()
	{
		bodyModel = new ModelRendererTurbo[3];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 1
		bodyModel[1].setRotationPoint(-5F, 0F, 7F);
		bodyModel[1].rotateAngleY = -0.78539816F;

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 2
		bodyModel[2].setRotationPoint(4F, 4F, 8F);
		bodyModel[2].rotateAngleX = 0.78539816F;
		bodyModel[2].rotateAngleZ = 0.78539816F;

		flipAll();
	}
}