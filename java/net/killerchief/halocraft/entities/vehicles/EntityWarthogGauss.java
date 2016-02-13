package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogTurretGauss;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityWarthogGauss extends EntityWarthog {

	public EntityWarthogGauss(World par1World) {
		super(par1World);
		TurretModel = new ModelWarthogTurretGauss();
		TurretTexture = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinTurretGauss.png");
		TurretTextureSeeThrough = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinTurretGaussTransScreen.png");
	}
	
	public EntityWarthogGauss(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
	}
	
	public ResourceLocation TurretTextureSeeThrough = null;
	
	@Override
	public ResourceLocation getTurretTexture()
	{
		return this.seatGunner != null && this.seatGunner.riddenByEntity != null ? this.TurretTextureSeeThrough : this.TurretTexture;
	}
	
	@Override
	protected void handleAttachedEntities()
	{
		super.handleAttachedEntities();

		if (this.seatGunner != null)
		{
			//this.setRiderLocation(this.seatGunner, 0.22D, -0.2D, -0.44D, true, this.rotationYaw+20F);
			this.setRiderLocation(this.seatGunner, 0.95D, -1.56D, 0D, false);
		}
		else
		{
			if (!this.worldObj.isRemote)
			{
				this.seatGunner = new EntityTurretSeat(this.worldObj, this, this.posX, this.posY, this.posZ);
				this.setRiderLocation(this.seatGunner, 0.95D, -1.56D, 0D, false);
				this.worldObj.spawnEntityInWorld(this.seatGunner);
				this.dataWatcher.updateObject(30, this.seatGunner.getEntityId());
			}
			else
			{
				int id = this.dataWatcher.getWatchableObjectInt(30);
				if (id > 0)
					this.seatGunner = (EntityTurretSeat)this.worldObj.getEntityByID(id);
			}
		}
	}

}
