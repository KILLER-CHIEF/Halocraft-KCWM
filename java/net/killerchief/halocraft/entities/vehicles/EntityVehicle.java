package net.killerchief.halocraft.entities.vehicles;

import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
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
		return true;
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
			//this.passengerSeats = this.getPassengerSeats();
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

	public void setRiderLocation(EntityPassengerSeat seat, double yOffset, double forwardOffset, double leftOffset, boolean shouldSit)
	{
		if (seat != null)
		{
			seat.forceRotation = false;
			this.setRiderLocation(seat, yOffset, forwardOffset, leftOffset, shouldSit, this.rotationYaw);
		}
	}

	public void setRiderLocation(EntityPassengerSeat seat, double yOffset, double forwardOffset, double leftOffset, boolean shouldSit, float rotate)
	{
		if (seat != null)
		{
			seat.setLocationAndAngles(this.posX + Math.cos(Math.toRadians(this.rotationYaw))*leftOffset - Math.sin(Math.toRadians(this.rotationYaw))*forwardOffset, this.posY + this.getMountedYOffset() + yOffset, this.posZ + Math.sin(Math.toRadians(this.rotationYaw))*leftOffset + Math.cos(Math.toRadians(this.rotationYaw))*forwardOffset, rotate, 0.0F);
			seat.shouldRiderSit = shouldSit;
		}
	}
}
