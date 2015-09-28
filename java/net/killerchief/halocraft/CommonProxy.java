package net.killerchief.halocraft;

import net.killerchief.halocraft.entities.vehicles.EntityMongoose;
import net.killerchief.halocraft.entities.vehicles.EntityVehicle;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.world.World;

public class CommonProxy {

	public void registers()
	{
		
	}
	
	public static int addArmor(String armor)
    {
        return 0;
    }
	
	public void registerRenderers() {}
	
	public boolean isSideClient()
	{
		return false;
	}
	
	public void ParticleFX(int type, World par1World, double posX, double posY, double posZ, double motionX, double motionY, double motionZ) {}

	public boolean initializeVehicleLoopingSounds(EntityVehicle vehicle, String soundRun, String soundIdle) { return false; }
	
}
