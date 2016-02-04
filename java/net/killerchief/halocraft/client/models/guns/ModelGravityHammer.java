//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelGravityHammer extends Model3DWeaponBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelGravityHammer()
	{
		bodyModel = new ModelRendererTurbo[14];
		bodyModel[0] = new ModelRendererTurbo(this, 56, 57, textureX, textureY); // Import Shape2
		bodyModel[1] = new ModelRendererTurbo(this, 56, 57, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 46, 23, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 83, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 103, 35, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 103, 23, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 103, 35, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 103, 54, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 53, 119, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 53, 119, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 45, 92, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 45, 92, textureX, textureY); // Box 15

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 55, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Shape2
		bodyModel[0].setRotationPoint(0F, -20F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 55, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, -20F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 20, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-1F, -39F, -3F);
		bodyModel[2].rotateAngleX = -0.08726646F;

		bodyModel[3].addBox(0F, 0F, 0F, 3, 14, 4, 0F); // Box 3
		bodyModel[3].setRotationPoint(0.5F, -34F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(1F, -35F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 2F, -1F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(1F, -37F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 11, 4, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(1F, -24F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 2F, -1F, 1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 8
		bodyModel[7].setRotationPoint(1F, -13F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 9
		bodyModel[8].setRotationPoint(0.5F, -17F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 10
		bodyModel[9].setRotationPoint(0.5F, -14F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 12
		bodyModel[10].setRotationPoint(-1F, 35F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-1F, 35F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(1F, 30F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 15
		bodyModel[13].setRotationPoint(1F, 13F, 2F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		this.flip(this.bodyModel);
	}
}