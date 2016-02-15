package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogGold;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogGoldDmg1;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogGoldDmg2;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogGoldDmg3;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityWarthogGold extends EntityWarthog {

	public EntityWarthogGold(World par1World) {
		super(par1World);
		Damage0Model = new ModelWarthogGold();
		Damage0Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogGold.png");
		Damage1Model = new ModelWarthogGoldDmg1();
		Damage1Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogGoldDmg1.png");
		Damage2Model = new ModelWarthogGoldDmg2();
		Damage2Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogGoldDmg2.png");
		Damage3Model = new ModelWarthogGoldDmg3();
		Damage3Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogGoldDmg3.png");
	}
	
	public EntityWarthogGold(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
	}
	
	private boolean InitSwag = false;
	
	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if (this.worldObj.isRemote && Halocraft.proxy.isSideClient())
		{
			if (!this.InitSwag && Minecraft.getMinecraft().getSoundHandler() != null)
			{
				Halocraft.proxy.initVehicleLoopSounds(this, 0, Halocraft.MODID+":entities.warthog.rvbhogmus");
				InitSwag = true;
			}
		}
	}
	
}