package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogTurretChainGun;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogTurretRocket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityWarthogRocket extends EntityWarthog {

	public EntityWarthogRocket(World par1World) {
		super(par1World);
		Damage0Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/RockethogModel.png");
		Damage1Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/RockethogModel_Damaged.png");
		Damage2Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/RockethogModel_Damaged_2.png");
		Damage3Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/RockethogModel_Damaged_3.png");
		TurretModel = new ModelWarthogTurretRocket();
		TurretTexture = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinTurretRocket.png");
	}
	
	public EntityWarthogRocket(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
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
					if (this.worldObj.getEntityByID(id) instanceof EntityTurretSeat)
						this.seatGunner = (EntityTurretSeat)this.worldObj.getEntityByID(id);
			}
		}
	}
}
