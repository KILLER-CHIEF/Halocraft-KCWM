package net.killerchief.halocraft.entities.vehicles;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class EntityVehicle extends Entity
{
	/** Returns the texture's file path as a String. (used in the render class) */
	public abstract String getEntityTexture();
	
	/** Do All Vehicle Control & Movement Stuff Here */
	abstract void updateMotionAndRotation();
	
	protected abstract String getSoundLoopRun();
	protected abstract String getSoundLoopIdle();
	protected abstract String getSoundEnter();
	protected abstract String getSoundExit();
	
	protected abstract int[][] getPassengerSeatAttributes();
	
	public static final int maxHurtResistantTime = 10;
	public double speed = 0D;
	public int waterTimer = 0;

	/** 
	 * Actually appears to be a client render update ticker.
	 * Not "appears to be the progress of the turn"
	 */
	
	//These are used to smooth out the vehicles movement & rotation to make it look nice.
	public int vehiclePosRotUpdate;
	public double vehicleX;
	public double vehicleY;
	public double vehicleZ;
	public double vehicleYaw;
	public double vehiclePitch;

	/** An Array of all Passenger Seats for this Vehicle */
	public EntityPassengerSeat[] passengerSeats;

	protected abstract int getSoundLoopDelay();
	public int enterSoundDelay = this.getSoundLoopDelay();
	private Entity prevRiddenByEntity = null;
	private boolean InitializedVehicleLoopingSounds = false;

	public EntityVehicle(World par1World)
	{
		super(par1World);
		this.preventEntitySpawning = true;
		//this.setSize(1.3F, 0.85F);
		//this.stepHeight = 1.0F;
		//this.yOffset = height / 2.0F;
		this.ignoreFrustumCheck = true;
	}

	public EntityVehicle(World par1World, double par2, double par4, double par6)
	{
		this(par1World);
		this.setPosition(par2, par4 + (double)this.yOffset, par6);
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	@Override
	protected void entityInit()
	{
		this.dataWatcher.addObject(22, new Float(100.0F));//health
		this.dataWatcher.addObject(23, new String(""));
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}

	/**
	 * Returns a boundingBox used to collide the entity with other entities and blocks. This enables the entity to be
	 * pushable on contact, like boats or minecarts.
	 */
	@Override
	public AxisAlignedBB getCollisionBox(Entity par1Entity)
	{
		return null;//par1Entity.boundingBox;
	}

	/**
	 * returns the bounding box for this entity
	 */
	@Override
	public AxisAlignedBB getBoundingBox()
	{
		return this.boundingBox;
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	@Override
	public boolean canBePushed()
	{
		return false;
	}

	/**
	 * Returns true if other Entities should be prevented from moving through this Entity.
	 */
	@Override
	public boolean canBeCollidedWith()
	{
		return !this.isDead;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public float getShadowSize()
	{
		return 0.0F;
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height - 0.7D;
	}

	/** Gets the entity's health.*/
	public float getHealth()
	{
		return this.dataWatcher.getWatchableObjectFloat(22);
	}

	/** Sets the entity's health.*/
	public void setHealth(float health)
	{
		this.dataWatcher.updateObject(22, Float.valueOf(health));
	}

	public EntityPassengerSeat[] getPassengerSeats()
	{
		String[] s = this.dataWatcher.getWatchableObjectString(23).split(":");
		EntityPassengerSeat[] seats = new EntityPassengerSeat[s.length-1];
		for (int i = 1; i < s.length; i++) {
			if (s[i] != null && this.worldObj.getEntityByID(Integer.parseInt(s[i])) instanceof EntityPassengerSeat)
			seats[i-1] = (EntityPassengerSeat)this.worldObj.getEntityByID(Integer.parseInt(s[i]));
		}
		return seats;
	}

	/** Sets the entity's health.*/
	public void setPassengerSeats(EntityPassengerSeat[] seats)
	{
		String out = "";
		for(EntityPassengerSeat seat : seats)
		{
			out = out + ":" + seat.getEntityId();
		}
		this.dataWatcher.updateObject(23, out);
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		par1NBTTagCompound.setFloat("Health", this.getHealth());
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		this.setHealth(par1NBTTagCompound.getFloat("Health"));
	}

	/**
	 * First layer of player interaction
	 */
	@Override
	public boolean interactFirst(EntityPlayer par1EntityPlayer)
	{
		ItemStack heldItem = par1EntityPlayer.getCurrentEquippedItem();
		if(heldItem!=null)
		{
			if(heldItem.getItem() == HalocraftItems.Wrench) {
				if(getHealth()<99) {
					setHealth(getHealth() + 2);
					heldItem.damageItem(1, par1EntityPlayer);
					if(heldItem.getItemDamage()>=40) {
						par1EntityPlayer.inventory.mainInventory[par1EntityPlayer.inventory.currentItem] = null;
						this.playSound("random.break", 1.0F, 1.0F);
						worldObj.playSoundAtEntity(this, "random.break", 1.0F, 1.0F);
					}
					worldObj.playSoundAtEntity(this, Halocraft.MODID+":items.WrenchFix", 1.0F, 1.0F);
					return true;
				}
				return false;
			}
			/*if(heldItem.itemID==Halocraft.MetalRod.itemID) {
				setHealth(getHealth() - 1);
				return false;
			}*/
		}

		if (this.riddenByEntity == null)
		{
			if (!this.worldObj.isRemote)
			{
				par1EntityPlayer.mountEntity(this);
			}
			return true;
		}
		
		return false;
	}

	@Override
	public void updateRiderPosition()
	{
		if (this.riddenByEntity != null)
		{
			this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ);
			
			if (this.riddenByEntity instanceof EntityLivingBase)
	        {
	            ((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.rotationYaw;
	        }
		}
	}

	/** Damages the entity on command*/
	private void damageEntity(float damage)
	{
		if (!this.isDead)
		{
			this.setHealth(this.getHealth() - damage);
			
			if (this.getHealth() <= 0) {
				this.setHealth(0);
				this.setDead();
				this.onDeath();
			}
			this.setBeenAttacked();
		}
		else
		{
			this.setHealth(0);
		}
	}

	private void onDeath()
	{
		this.worldObj.createExplosion(this, posX, posY, posZ, 0F, false);
		this.worldObj.playSoundAtEntity(this, Halocraft.MODID+":entities.mongoose.MongooseExplode", 1.5F, rand.nextFloat());
	}

	/**
	 * Will get destroyed next tick.
	 */
	@Override
	public void setDead()
	{
		super.setDead();
		for (EntityPassengerSeat seat : this.passengerSeats)
			if (seat != null)
				seat.setDead();
	}

	/**
	 * Called when the entity is attacked.
	 */
	@Override
	public boolean attackEntityFrom(DamageSource source, float damage)
	{
		if (this.hurtResistantTime <= 0) {
			this.worldObj.playSoundAtEntity(this, Halocraft.MODID+":entities.mongoose.MongooseHit", 0.8F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
			this.setBeenAttacked();
			this.damageEntity(damage);
			this.hurtResistantTime = this.maxHurtResistantTime;
			return true;
		}
		return false;
	}

	/**
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	@Override
	protected void fall(float fallDist)
	{
		super.fall(fallDist/2);
		int damage = (int)Math.ceil(fallDist - 6F);
		if(damage > 0){
			attackEntityFrom(DamageSource.fall, damage/2);
		}
	}

	/**
	 * Sets the position and rotation. Only difference from the other one is no bounding on the rotation. Args: posX,
	 * posY, posZ, yaw, pitch
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9)
	{//This is Very Important in getting the entity to render smoothly!
		this.vehicleX = par1;
		this.vehicleY = par3;
		this.vehicleZ = par5;
		this.vehicleYaw = (double)par7;
		this.vehiclePitch = (double)par8;
		this.vehiclePosRotUpdate = par9;
		//this.motionX = this.velocityX;
		//this.motionY = this.velocityY;
		//this.motionZ = this.velocityZ;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if (this.worldObj.isRemote)
		{
			this.passengerSeats = this.getPassengerSeats();
			if (this.vehiclePosRotUpdate != 0)
			{
				double var46 = this.posX + (this.vehicleX - this.posX);
				double var48 = this.posY + (this.vehicleY - this.posY);
				double var5 = this.posZ + (this.vehicleZ - this.posZ);
				double var7 = MathHelper.wrapAngleTo180_double(this.vehicleYaw - (double)this.rotationYaw);
				this.rotationYaw = (float)((double)this.rotationYaw + var7);
				this.rotationPitch = (float)((double)this.rotationPitch + (this.vehiclePitch - (double)this.rotationPitch));
				this.setPosition(var46, var48, var5);
				this.setRotation(this.rotationYaw, this.rotationPitch);
			}
			else
			{
				this.setPosition(this.posX, this.posY, this.posZ);
				this.setRotation(this.rotationYaw, this.rotationPitch);
			}
			
			this.handleLoopingSoundEffects();
		}
		else
		{
			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;
			
			this.handleSoundEffects();
			this.handleEntityCollisions();
			this.damageHandling();
			this.updateMotionAndRotation();
		}
		
		this.speed = Math.sqrt((this.motionX * this.motionX) + (this.motionZ * this.motionZ)) * 25D;
		if (this.speed < 0.01 && this.speed > -0.01) {
			this.speed = 0;
		}
		
		if (this.hurtResistantTime > 0)
        {
            --this.hurtResistantTime;
        }
		
		this.handlePassengerSeats();
	}
	
	public void handleSoundEffects()
	{
		if (this.riddenByEntity != null && this.prevRiddenByEntity == null)
		{
			this.prevRiddenByEntity = this.riddenByEntity;
			if (this.getSoundEnter() != null)
			{
				worldObj.playSoundAtEntity(this, this.getSoundEnter(), 1.0F, 1.0F);
			}
		}
		if (this.riddenByEntity == null && this.prevRiddenByEntity != null)
		{
			this.prevRiddenByEntity = null;
			if (this.getSoundExit() != null)
			{
				worldObj.playSoundAtEntity(this, this.getSoundExit(), 1.0F, 1.0F);
			}
		}
	}

	public void handleLoopingSoundEffects()
	{
		if (this.riddenByEntity != null && this.prevRiddenByEntity == null)
		{
			this.prevRiddenByEntity = this.riddenByEntity;
			//TODO: is it needed on dedicated servers? (same as further below)
			//worldObj.playSoundAtEntity(this, this.getSoundEnter(), 1.0F, 1.0F);

			if (!this.InitializedVehicleLoopingSounds && Halocraft.proxy.isSideClient())
			{
				if (Minecraft.getMinecraft().getSoundHandler() != null)
				{
					Halocraft.proxy.initializeVehicleLoopingSounds(this, this.getSoundLoopIdle(), this.getSoundLoopRun());
					this.InitializedVehicleLoopingSounds = true;
				}
			}
		}
		if (this.riddenByEntity == null && this.prevRiddenByEntity != null)
		{
			this.prevRiddenByEntity = null;
			//worldObj.playSoundAtEntity(this, this.getSoundExit(), 1.0F, 1.0F);
		}

		if (this.riddenByEntity != null && this.enterSoundDelay > -20)
		{
			--this.enterSoundDelay;
		}

		if (this.riddenByEntity == null && this.enterSoundDelay != this.getSoundLoopDelay())
		{
			this.enterSoundDelay = this.getSoundLoopDelay();
		}
	}
	
	public void handleEntityCollisions()
	{
		if (!this.worldObj.isRemote)
		{
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(0.2D, 0.0D, 0.2D));
			int var27;

			if (list != null && !list.isEmpty())
			{
				for (var27 = 0; var27 < list.size(); ++var27)
				{
					Entity entity = (Entity)list.get(var27);

					if(riddenByEntity!=null && entity!=riddenByEntity && entity instanceof EntityLiving && speed>12)
					{
						if(entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.riddenByEntity), 10))
						{
							worldObj.playSoundAtEntity(this, Halocraft.MODID+":damage.hurtflesh", 1F, 0.5F);
						}
					}else if(riddenByEntity!=null && entity!=riddenByEntity && entity instanceof EntityLiving && speed>10)
					{
						if(entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.riddenByEntity), 6))
						{
							worldObj.playSoundAtEntity(this, Halocraft.MODID+":damage.hurtflesh", 1F, 0.5F);
						}
					}else if(riddenByEntity!=null && entity!=riddenByEntity && entity instanceof EntityLiving && speed>8)
					{
						if(entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.riddenByEntity), 4))
						{
							worldObj.playSoundAtEntity(this, Halocraft.MODID+":damage.hurtflesh", 1F, 0.5F);
						}
					}else{}

					if (entity != this.riddenByEntity && entity.canBePushed() && entity instanceof EntityVehicle)
					{
						entity.applyEntityCollision(this);
					}
				}
			}
		}
	}
	
	public void damageHandling()
	{
		if (isInWater()) {
			waterTimer++;
		} else {
			waterTimer=0;
		}	
		if (waterTimer>20) {
			damageEntity(1);
			waterTimer=0;
		}

		if (!this.worldObj.isRemote)
		{
			if(getHealth()<=5 && rand.nextInt(100)<5)
			{
				damageEntity(1);
			}
		}
		else
		{
			this.setHealth(this.getHealth());
		}
	}
	
	public void handlePassengerSeats()
	{
		if (this.getPassengerSeatAttributes() != null)
		{
			if (this.passengerSeats != null)
			{
				for (int i = 0; i < passengerSeats.length; i++) {
					EntityPassengerSeat seat = passengerSeats[i];
					if (this instanceof EntityMongoose && i == 0 && seat != null)
					{
						double xOffset = -Math.sin(Math.toRadians(this.rotationYaw)) * 0.9;
						double zOffset = Math.cos(Math.toRadians(this.rotationYaw)) * 0.9;
						seat.setLocationAndAngles(this.posX - xOffset, this.posY + 1.1D, this.posZ - zOffset, 0.0F, 0.0F);
						//this.passengerseat.moveEntity(this.velocityX, this.velocityY, this.velocityZ);
					}
					else if (this instanceof EntityWarthog)
					{
						if (i == 0 && seat != null)
						{
							seat.setLocationAndAngles(this.posX - Math.cos(Math.toRadians(this.rotationYaw))*0.44D, this.posY, this.posZ - Math.sin(Math.toRadians(this.rotationYaw))*0.44D, 0.0F, 0.0F);
						}
						else if (i == 1 && seat != null)
						{
							seat.setLocationAndAngles(this.posX + Math.sin(Math.toRadians(this.rotationYaw))*1.4D, this.posY + 1.48D, this.posZ - Math.cos(Math.toRadians(this.rotationYaw))*1.4D, 0.0F, 0.0F);
						}
						else if (seat != null)
							seat.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
					}
					else if (seat != null)
						seat.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
				}
//				for (EntityPassengerSeat seat : this.passengerSeats)
//				{
//					if (seat != null)
//					{
//						double xOffset = -Math.sin(Math.toRadians(this.rotationYaw)) * 0.9;
//						double zOffset = Math.cos(Math.toRadians(this.rotationYaw)) * 0.9;
//						seat.setLocationAndAngles(this.posX - xOffset, this.posY + 1.1D, this.posZ - zOffset, 0.0F, 0.0F);
//						//this.passengerseat.moveEntity(this.velocityX, this.velocityY, this.velocityZ);
//					}
//				}
			}
			else
			{
				if (!this.worldObj.isRemote)
				{
					this.passengerSeats = new EntityPassengerSeat[this.getPassengerSeatAttributes().length];
					int i = 0;
					for (int[] seatAttributes : this.getPassengerSeatAttributes())
					{
						if (this.passengerSeats.length > i)
						{
							//TODO: perform seat attributes
							this.passengerSeats[i] = new EntityPassengerSeat(this.worldObj, this, this.posX, this.posY, this.posZ);
						}
						else
						{
							System.err.println("Passenger seat list is not big enough, something went terribly wrong!\nDefining Seat Array: "+this.getPassengerSeatAttributes()+"\nPassenger Seat Array: "+this.passengerSeats+"\nContinuing, however bug should be ammended asap!");
						}
						++i;
					}
					if (this.passengerSeats.length != i)
					{
						this.passengerSeats = Arrays.copyOf(this.passengerSeats, i);
						System.err.println("The following vehicle entity has a number of undefined passenger seat elements: "+this+"\nContinuing, however the defining array should be ammended.");
					}
					for (EntityPassengerSeat seat : this.passengerSeats)
					{
						this.worldObj.spawnEntityInWorld(seat);
					}
					this.setPassengerSeats(this.passengerSeats);
				}
			}
		}
	}

}
