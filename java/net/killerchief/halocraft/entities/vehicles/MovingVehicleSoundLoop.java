package net.killerchief.halocraft.entities.vehicles;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MovingVehicleSoundLoop extends MovingSound
{
	private final EntityVehicle Vehicle;

	public MovingVehicleSoundLoop(EntityVehicle vehicle, String sound)
	{
		super(new ResourceLocation(sound));
		this.Vehicle = vehicle;
		this.repeat = true;
		this.field_147665_h = 0;
		this.volume = 0.1F;
	}

	/**
	 * Updates the JList with a new model.
	 */
	public void update()
	{
		if (this.Vehicle.isDead)
		{
			this.donePlaying = true;
		}
		else
		{
			this.xPosF = (float)this.Vehicle.posX;
			this.yPosF = (float)this.Vehicle.posY;
			this.zPosF = (float)this.Vehicle.posZ;

			if (this.Vehicle.riddenByEntity != null)
			{
				if (this.volume < 1F)
					this.volume += 0.02F;
			}
			else
			{
				if (this.volume > 0F)
					this.volume -= 0.02F;
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static class High extends MovingSound
	{
		private final EntityVehicle Vehicle;

		public High(EntityVehicle vehicle, String sound)
		{
			super(new ResourceLocation(sound));
			this.Vehicle = vehicle;
			this.repeat = true;
			this.field_147665_h = 0;
			this.volume = 0.1F;
		}

		/**
		 * Updates the JList with a new model.
		 */
		public void update()
		{
			if (this.Vehicle.isDead)
			{
				this.donePlaying = true;
			}
			else
			{
				this.xPosF = (float)this.Vehicle.posX;
				this.yPosF = (float)this.Vehicle.posY;
				this.zPosF = (float)this.Vehicle.posZ;

				if (this.Vehicle.riddenByEntity != null && this.Vehicle.enterSoundDelay <= 0)
				{
					double vehicleSpeed = (double)MathHelper.sqrt_double(this.Vehicle.motionX * this.Vehicle.motionX + (this.Vehicle.getSoundOnYMotion() ? this.Vehicle.motionY * this.Vehicle.motionY : 0) + this.Vehicle.motionZ * this.Vehicle.motionZ);
					this.volume = (float)vehicleSpeed * 0.9F * ((float)Math.abs(this.Vehicle.enterSoundDelay)/20F);
					//System.out.println("High: "+this.volume);
				}
				else
				{
					this.volume = 0.0F;
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public static class Idle extends MovingSound
	{
		private final EntityVehicle Vehicle;

		public Idle(EntityVehicle vehicle, String sound)
		{
			super(new ResourceLocation(sound));
			this.Vehicle = vehicle;
			this.repeat = true;
			this.field_147665_h = 0;
			this.volume = 0.1F;
		}

		/**
		 * Updates the JList with a new model.
		 */
		public void update()
		{
			if (this.Vehicle.isDead)
			{
				this.donePlaying = true;
			}
			else
			{
				this.xPosF = (float)this.Vehicle.posX;
				this.yPosF = (float)this.Vehicle.posY;
				this.zPosF = (float)this.Vehicle.posZ;

				if (this.Vehicle.riddenByEntity != null && this.Vehicle.enterSoundDelay <= 0)
				{
					double vehicleSpeed = (double)MathHelper.sqrt_double(this.Vehicle.motionX * this.Vehicle.motionX + (this.Vehicle.getSoundOnYMotion() ? this.Vehicle.motionY * this.Vehicle.motionY : 0) + this.Vehicle.motionZ * this.Vehicle.motionZ);
					this.volume = (1.0F - ((float)vehicleSpeed)) * 0.8F * ((float)Math.abs(this.Vehicle.enterSoundDelay)/20F);
					//System.out.println("Idle: "+this.volume);
				}
				else
				{
					this.volume = 0.0F;
				}
			}
		}
	}
}
