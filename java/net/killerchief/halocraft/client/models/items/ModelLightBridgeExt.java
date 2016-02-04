//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.items;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;

public class ModelLightBridgeExt extends Model3DBase
{
	int textureX = 256;
	int textureY = 256;
	
	protected ModelRendererTurbo[] skidsModel;
	protected ModelRendererTurbo[] noseModel;
	protected ModelRendererTurbo[] tailModel;
	protected ModelRendererTurbo[] bayModel;
	protected ModelRendererTurbo[] leftWingModel;
	protected ModelRendererTurbo[] rightWingModel;
	protected ModelRendererTurbo[] topWingModel;
	protected ModelRendererTurbo[] yawFlapModel;
	protected ModelRendererTurbo[] pitchFlapLeftModel;

	public ModelLightBridgeExt()
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Main1D

		bodyModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 64, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, -48F, 0F, 0F, -48F); // Main1D
		bodyModel[0].setRotationPoint(0F, 1.6F, 0F);
		
		
		skidsModel = new ModelRendererTurbo[1];
		skidsModel[0] = new ModelRendererTurbo(this, 0, 66, textureX, textureY); // Main2D

		skidsModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 64, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, -48F, 0F, 0F, -48F); // Main2D
		skidsModel[0].setRotationPoint(0F, 1.6F, 0F);


		noseModel = new ModelRendererTurbo[1];
		noseModel[0] = new ModelRendererTurbo(this, 132, 154, textureX, textureY); // Part0A

		noseModel[0].addShapeBox(-1F, -10F, 0F, 1, 15, 56, 0F, -2F, -10.5F, 0F, 2F, -10F, 0F, 2F, -10F, -48F, -2F, -10.5F, -48F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, -48F, 0F, 0F, -48F); // Part0A
		noseModel[0].setRotationPoint(-2F, 1.6F, 0F);


		tailModel = new ModelRendererTurbo[1];
		tailModel[0] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Part1A

		tailModel[0].addShapeBox(-1F, -10F, 0F, 1, 15, 64, 0F, -2F, -10.5F, 1F, 2F, -10F, 0F, 2F, -10F, -56F, -2F, -10.5F, -56F, 0F, 0F, 3F, 2F, -4F, 0F, 2F, -4F, -56F, 0F, 0F, -56F); // Part1A
		tailModel[0].setRotationPoint(-2F, 1.6F, 0F);


		bayModel = new ModelRendererTurbo[1];
		bayModel[0] = new ModelRendererTurbo(this, 123, 69, textureX, textureY); // Part-1A

		bayModel[0].addShapeBox(-1F, -10F, 0F, 1, 15, 64, 0F, -2F, -10.5F, -1F, 2F, -10F, 0F, 2F, -10F, -56F, -2F, -10.5F, -56F, 0F, 0F, -3F, 2F, -4F, 0F, 2F, -4F, -56F, 0F, 0F, -56F); // Part-1A
		bayModel[0].setRotationPoint(-2F, 1.6F, 0F);


		leftWingModel = new ModelRendererTurbo[1];
		leftWingModel[0] = new ModelRendererTurbo(this, 13, 172, textureX, textureY); // Part2A

		leftWingModel[0].addShapeBox(-1F, -10F, 0F, 1, 15, 64, 0F, -3F, -10.5F, 1.5F, 2F, -10F, 0F, 2F, -10F, -56F, -2F, -10.5F, -56F, -3F, 0F, 4F, 2F, -4F, 0F, 2F, -4F, -56F, 0F, 0F, -56F); // Part2A
		leftWingModel[0].setRotationPoint(-2F, 1.6F, 0F);


		rightWingModel = new ModelRendererTurbo[1];
		rightWingModel[0] = new ModelRendererTurbo(this, 132, 154, textureX, textureY); // Part0B

		rightWingModel[0].addShapeBox(-1F, -10F, -40F, 1, 15, 56, 0F, -2F, -10.5F, -48F, 2F, -10F, -48F, 2F, -10F, 0F, -2F, -10.5F, 0F, 0F, 0F, -48F, 2F, -4F, -48F, 2F, -4F, 0F, 0F, 0F, 0F); // Part0B
		rightWingModel[0].setRotationPoint(-2F, 1.6F, 0F);


		topWingModel = new ModelRendererTurbo[1];
		topWingModel[0] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Part1B

		topWingModel[0].addShapeBox(-1F, -10F, -48F, 1, 15, 64, 0F, -2F, -10.5F, -56F, 2F, -10F, -56F, 2F, -10F, 0F, -2F, -10.5F, 1F, 0F, 0F, -56F, 2F, -4F, -56F, 2F, -4F, 0F, 0F, 0F, 3F); // Part1B
		topWingModel[0].setRotationPoint(-2F, 1.6F, 0F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 123, 69, textureX, textureY); // Part-1B

		yawFlapModel[0].addShapeBox(-1F, -10F, -48F, 1, 15, 64, 0F, -2F, -10.5F, -56F, 2F, -10F, -56F, 2F, -10F, 0F, -2F, -10.5F, -1F, 0F, 0F, -56F, 2F, -4F, -56F, 2F, -4F, 0F, 0F, 0F, -3F); // Part-1B
		yawFlapModel[0].setRotationPoint(-2F, 1.6F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 13, 172, textureX, textureY); // Part2B

		pitchFlapLeftModel[0].addShapeBox(-1F, -10F, -48F, 1, 15, 64, 0F, -2F, -10.5F, -56F, 2F, -10F, -56F, 2F, -10F, 0F, -3F, -10.5F, 1.5F, 0F, 0F, -56F, 2F, -4F, -56F, 2F, -4F, 0F, -3F, 0F, 4F); // Part2B
		pitchFlapLeftModel[0].setRotationPoint(-2F, 1.6F, 0F);

		//translateAll(0F, 0F, 0F);
		//flipAll();
		
		this.flip(this.bodyModel);
		this.flip(this.skidsModel);
		this.flip(this.noseModel);
		this.flip(this.tailModel);
		this.flip(this.bayModel);
		this.flip(this.leftWingModel);
		this.flip(this.rightWingModel);
		this.flip(this.topWingModel);
		this.flip(this.yawFlapModel);
		this.flip(this.pitchFlapLeftModel);
	}
	
	public void renderModel(boolean isA, int section, float par7)
	{
		if (section == 4)
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
		else if (section == 5)
		{
			if (this.skidsModel != null)
			{
				for (ModelRendererTurbo part : this.skidsModel)
				{
					if (part != null)
					{
						part.render(par7);
					}
				}
			}
		}
		else if (isA)
		{
			if (section == 0)
			{
				if (this.noseModel != null)
				{
					for (ModelRendererTurbo part : this.noseModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == 1)
			{
				if (this.tailModel != null)
				{
					for (ModelRendererTurbo part : this.tailModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == -1)
			{
				if (this.bayModel != null)
				{
					for (ModelRendererTurbo part : this.bayModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == 2)
			{
				if (this.leftWingModel != null)
				{
					for (ModelRendererTurbo part : this.leftWingModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
		}
		else
		{
			if (section == 0)
			{
				if (this.rightWingModel != null)
				{
					for (ModelRendererTurbo part : this.rightWingModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == 1)
			{
				if (this.topWingModel != null)
				{
					for (ModelRendererTurbo part : this.topWingModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == -1)
			{
				if (this.yawFlapModel != null)
				{
					for (ModelRendererTurbo part : this.yawFlapModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
			else if (section == 2)
			{
				if (this.pitchFlapLeftModel != null)
				{
					for (ModelRendererTurbo part : this.pitchFlapLeftModel)
					{
						if (part != null)
						{
							part.render(par7);
						}
					}
				}
			}
		}
	}
}