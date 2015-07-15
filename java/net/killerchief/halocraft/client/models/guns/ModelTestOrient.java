//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelTestOrient extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelTestOrient()
	{
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 50, 50, textureX, textureY); // Import Shape1
		bodyModel[1] = new ModelRendererTurbo(this, 50, 50, textureX, textureY); // Box 21

		bodyModel[0].addBox(0F, 0F, 0F, 6, 8, 2, 0F); // Import Shape1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, -1F, 0F, 3, 1, 33, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[1].setRotationPoint(1.5F, 0.5F, 10F);

		//translateAll(0F, 0F, 0F);
		//flipAll();

		flip(bodyModel);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(entity, par2, par3, par4, par5, par6, par7);
	}
}