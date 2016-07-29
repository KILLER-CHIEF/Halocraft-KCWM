package net.killerchief.halocraft;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.halocraft.entities.vehicles.EntityVehicle;
import net.minecraft.world.World;

public class CommonProxy {

	public void registers()
	{

	}

	public int addArmor(String armor)
	{
		return 0;
	}

	public String getClientUsername()
	{
		return "";
	}

	public Model3DArmor armor3DType(String type)
	{
		return null;
	}

	public void registerRenderers() {}

	public boolean isSideClient()
	{
		return false;
	}

	public World getClientWorld()
	{
		return null;
	}

	public void ParticleFX(int type, World par1World, double posX, double posY, double posZ, double motionX, double motionY, double motionZ) {}

	public boolean initVehicleLoopSounds(EntityVehicle vehicle, int soundHandlerType, String soundFile) { return false; }

}
