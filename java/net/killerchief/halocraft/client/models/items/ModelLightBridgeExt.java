//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.tileentity.TileEntity;

public class ModelLightBridgeExt extends Model3DBase
{
	protected ModelRendererTurbo[] bodyModel;
	protected ModelRendererTurbo[] edgeAModel;
	protected ModelRendererTurbo[] edgeBModel;
	protected ModelRendererTurbo[] edgeCModel;
	protected ModelRendererTurbo[] edgeDModel;
	
	int textureX = 256;
	int textureY = 256;

	public ModelLightBridgeExt()
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box1
		edgeAModel = new ModelRendererTurbo[1];
		edgeAModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		edgeBModel = new ModelRendererTurbo[1];
		edgeBModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		edgeCModel = new ModelRendererTurbo[1];
		edgeCModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		edgeDModel = new ModelRendererTurbo[1];
		edgeDModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3

		bodyModel[0].addShapeBox(0F, 1.6F, 0F, 12, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		edgeAModel[0].addShapeBox(0F, 1.6F, -4F, 16, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		edgeAModel[0].setRotationPoint(0F, 0F, 0F);

		edgeBModel[0].addShapeBox(0F, 1.6F, 16F, 16, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		edgeBModel[0].setRotationPoint(0F, 0F, 0F);

		edgeCModel[0].addShapeBox(-4F, 1.6F, 0F, 4, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		edgeCModel[0].setRotationPoint(0F, 0F, 0F);

		edgeDModel[0].addShapeBox(16F, 1.6F, 0F, 4, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		edgeDModel[0].setRotationPoint(0F, 0F, 0F);

		this.flip(this.bodyModel);
		this.flip(this.edgeAModel);
		this.flip(this.edgeBModel);
		this.flip(this.edgeCModel);
		this.flip(this.edgeDModel);
	}
	
	public void renderModel(int model, float par7)
	{
		if (model == 0)
		{
			if (this.bodyModel != null)
			{
				for (ModelRendererTurbo part : this.bodyModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
		else if (model == 1)
		{
			if (this.edgeAModel != null)
			{
				for (ModelRendererTurbo part : this.edgeAModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
		else if (model == 2)
		{
			if (this.edgeBModel != null)
			{
				for (ModelRendererTurbo part : this.edgeBModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
		else if (model == 3)
		{
			if (this.edgeCModel != null)
			{
				for (ModelRendererTurbo part : this.edgeCModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
		else if (model == 4)
		{
			if (this.edgeDModel != null)
			{
				for (ModelRendererTurbo part : this.edgeDModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
	}
	
	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(TileEntity tileentity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.edgeAModel != null)
		{
			for (ModelRendererTurbo part : this.edgeAModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.edgeBModel != null)
		{
			for (ModelRendererTurbo part : this.edgeBModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.edgeCModel != null)
		{
			for (ModelRendererTurbo part : this.edgeCModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.edgeDModel != null)
		{
			for (ModelRendererTurbo part : this.edgeDModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
	}
}