package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTurretSeat extends EntityPassengerSeat {
	
	public static float pitchOffset = 0F;

	public EntityTurretSeat(World par1World) {
		super(par1World);
	}

	public EntityTurretSeat(World par1World, EntityVehicle vehicle, double par2, double par4, double par6) {
		super(par1World, vehicle, par2, par4, par6);
	}

	@Override
	public void updateRiderPosition()
	{
		super.updateRiderPosition();
		if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase)
		{
			if (this.parentBody != null && this.parentBody instanceof EntityWarthog)
			{
				EntityLivingBase entity = ((EntityLivingBase)this.riddenByEntity);
				if (entity.rotationPitch > 30F) {
					entity.rotationPitch = 30F;
				} else if (entity.rotationPitch < -50F) {
					entity.rotationPitch = -50F;
				}
				if (Halocraft.proxy.isSideClient() && Minecraft.getMinecraft().gameSettings.thirdPersonView == 1) {
					pitchOffset = -10F;
					((EntityLivingBase)this.riddenByEntity).cameraPitch = pitchOffset;
				}
				else
					pitchOffset = 0F;
			}
		}
	}

	public int shootDelay = 0;

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (this.shootDelay > 0)
		{
			this.shootDelay--;
		}
	}
}
