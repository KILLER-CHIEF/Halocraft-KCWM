package net.killerchief.halocraft;

import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.halocraft.entities.vehicles.EntityMongoose;
import net.killerchief.halocraft.entities.vehicles.EntityVehicle;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.world.World;

public class CommonProxy {

	public void registers()
	{
		
	}
	
	public int addArmor(String armor)
    {
        return 0;
    }
	
	public Model3DArmor armor3DType(int t)
    {
        return null;
    }
	
	public void registerRenderers() {}
	
	public boolean isSideClient()
	{
		return false;
	}
	
	public void ParticleFX(int type, World par1World, double posX, double posY, double posZ, double motionX, double motionY, double motionZ) {}

	public boolean initializeVehicleLoopingSounds(EntityVehicle vehicle, String soundRun, String soundIdle) { return false; }

	public boolean initVehicleLoopSounds(EntityVehicle vehicle, int soundHandlerType, String soundFile) { return false; }
	
}
