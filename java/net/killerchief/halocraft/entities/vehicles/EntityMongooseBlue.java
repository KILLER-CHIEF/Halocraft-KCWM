package net.killerchief.halocraft.entities.vehicles;

import net.minecraft.world.World;

public class EntityMongooseBlue extends EntityMongoose
{
	public EntityMongooseBlue(World par1World)
	{
		super(par1World);
	}

	public EntityMongooseBlue(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	/**
	 * Returns the texture's file path as a String. (used in the render class)
	 */
	@Override
	public String getEntityTexture()
	{
		return ":textures/entities/MongooseModelBlue.png";
	}
}
