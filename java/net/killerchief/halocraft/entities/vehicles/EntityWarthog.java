package net.killerchief.halocraft.entities.vehicles;

import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWarthog extends EntityVehicle
{
	private static final double frictionFactor = 0.97D;
	private double pseudoHandling = 2F;
	private float yawPointer = 0F;
	private double fwdVelocity = 0D;
	private float wheelTurnAngle = 0F;
	private float steeringTurnAngle = 0F;
	private float rotateWheelSpeed = 0F;
	private float rotatePassengerFrame = 0F;
	private float entityRiderYawDelta = 0F;
	private double entityRiderPitchDelta = 0D;

	public EntityWarthog(World par1World)
	{
		super(par1World);
		this.setSize(1.3F, 0.85F);
		this.stepHeight = 1.0F;
		this.yOffset = height / 2.0F;
	}

	public EntityWarthog(World par1World, double par2, double par4, double par6)
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
		super.entityInit();
		this.dataWatcher.addObject(25, new Integer(0));//MovingLeft
		this.dataWatcher.addObject(26, new Integer(0));//MovingRight
		this.dataWatcher.addObject(27, new Float(0));//fwdVelocity
	}
	
	@Override
	protected String getSoundLoopIdle()
	{
		return Halocraft.MODID+":entities.mongoose.MongooseEngineIdle";
	}
	
	@Override
	protected String getSoundLoopRun()
	{
		return Halocraft.MODID+":entities.mongoose.MongooseEngineHigh";
	}
	
	@Override
	protected String getSoundEnter()
	{
		return Halocraft.MODID+":entities.mongoose.MongooseEnter";
	}
	
	@Override
	protected String getSoundExit()
	{
		return Halocraft.MODID+":entities.mongoose.MongooseExit";
	}
	
	private int[][] PassengerSeatAttributes = new int[][]{new int[]{0}};
	
	@Override
	protected int[][] getPassengerSeatAttributes()
	{
		return this.PassengerSeatAttributes;
	}
	
	@Override
	protected int getSoundLoopDelay() {
		return 10;
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height - 0.7D;
	}

	/** Gets whether the entity is moving left.*/
	private Boolean isMovingLeft()
	{
		if (this.dataWatcher.getWatchableObjectInt(25) == 0)
		{
			return false;
		}
		return true;
	}

	/** Sets if the entity is moving left.*/
	private void setMovingLeft(boolean isMovingLeft)
	{
		if (isMovingLeft)
		{
			this.dataWatcher.updateObject(25, Integer.valueOf(1));
		}
		else
		{
			this.dataWatcher.updateObject(25, Integer.valueOf(0));
		}
	}

	/** Gets whether the entity is moving right.*/
	private Boolean isMovingRight()
	{
		if (this.dataWatcher.getWatchableObjectInt(26) == 0)
		{
			return false;
		}
		return true;
	}

	/** Sets if the entity is moving right.*/
	private void setMovingRight(boolean isMovingRight)
	{
		if (isMovingRight)
		{
			this.dataWatcher.updateObject(26, Integer.valueOf(1));
		}
		else
		{
			this.dataWatcher.updateObject(26, Integer.valueOf(0));
		}
	}
	
	private void setFwdVelocity(double vel)
	{
		this.dataWatcher.updateObject(27, (float)vel);
	}
	
	private double getFwdVelocity()
	{
		return (float)this.dataWatcher.getWatchableObjectFloat(27);
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
				par1EntityPlayer.rotationYaw = this.rotationYaw;
				par1EntityPlayer.rotationPitch = 10F;
				par1EntityPlayer.mountEntity(this);
			}
			return true;
		}
		else
		{
			if (this.riddenByEntity != par1EntityPlayer && this.passengerSeats != null && this.passengerSeats[0] != null && this.passengerSeats[0].riddenByEntity == null)
			{
				if (!this.worldObj.isRemote)
				{
					par1EntityPlayer.mountEntity(this.passengerSeats[0]);
				}
				return true;
			}
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
	            //((EntityLivingBase)this.riddenByEntity).cameraPitch = -10F;
	        }
		}
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
			this.handleDyingEffects();
			
			if (Halocraft.proxy.isSideClient())
			{
				this.updateModel();
			}
		}

		this.setFwdVelocity(this.fwdVelocity);
	}

	@Override
	public void updateMotionAndRotation()
	{
		this.smoothHandling();

		if(this.riddenByEntity == null)
		{
			this.fwdVelocity*=0.9;
			this.yawPointer = 0F;
		}
		else
		{
			/*if (this.riddenByEntity instanceof EntityPlayer)//(this.riddenByEntity instanceof EntityLiving)// && this.riddenByEntity instanceof EntityPlayer)// && this.riddenByEntity instanceof EntityPlayerMP)
			{
				//EntityPlayerMP entityplayermp = (EntityPlayerMP) this.riddenByEntity;
				EntityPlayer entityplayer = (EntityPlayer) this.riddenByEntity;
				if (entityplayer.moveForward > 0 && this.onGround)
				{
					fwdVelocity+=0.02;
				}
				if (entityplayer.moveForward < 0 && this.onGround)
				{
					fwdVelocity-=0.02;
					fwdVelocity*=0.94;
				}
				if (entityplayer.moveStrafing > 0 && this.onGround)
				{
					rotationYaw-=pseudoHandling*fwdVelocity;
					this.setMovingLeft(true);
				} else {
					this.setMovingLeft(false);
				}
				if (entityplayer.moveStrafing < 0 && this.onGround)
				{
					rotationYaw+=pseudoHandling*fwdVelocity;
					this.setMovingRight(true);
				} else {
					this.setMovingRight(false);
				}
			}*/
			while (this.rotationYaw < 0F)
				this.rotationYaw = this.rotationYaw + 360F;
			while (this.rotationYaw > 360F)
				this.rotationYaw = this.rotationYaw - 360F;
			//System.out.println("R: "+this.riddenByEntity.rotationYaw);
			//System.out.println("G: "+this.rotationYaw);
			float i = Math.signum(this.riddenByEntity.rotationYaw) >= 0 ? this.riddenByEntity.rotationYaw : 360F - Math.abs(this.riddenByEntity.rotationYaw);
			float j = this.rotationYaw > i ? i - this.rotationYaw : i - (this.rotationYaw + 360F);
			this.yawPointer = (float) (Math.abs(j) > 180F ? 360F + j : j);
			//System.out.println("P: "+this.yawPointer+"\n");
			
			if (TickHandler.ForwardMap.containsKey(this.riddenByEntity) && TickHandler.BackwardMap.containsKey(this.riddenByEntity) && TickHandler.LeftMap.containsKey(this.riddenByEntity) && TickHandler.RightMap.containsKey(this.riddenByEntity))
			{
				if (TickHandler.ForwardMap.get(this.riddenByEntity) && this.onGround)
				{
					this.fwdVelocity+=0.02;
				}
				
				if (TickHandler.BackwardMap.get(this.riddenByEntity) && this.onGround)
				{
					this.fwdVelocity-=0.02;
					this.fwdVelocity*=0.94;
				}
				
				if (TickHandler.LeftMap.get(this.riddenByEntity) && this.onGround)
				{
					//this.rotationYaw-=this.pseudoHandling*this.fwdVelocity;
					this.setMovingLeft(true);
				}
				else
				{
					this.setMovingLeft(false);
				}
				
				if (TickHandler.RightMap.get(this.riddenByEntity) && this.onGround)
				{
					//this.rotationYaw+=this.pseudoHandling*this.fwdVelocity;
					this.setMovingRight(true);
				}
				else
				{
					this.setMovingRight(false);
				}
				
				if (!TickHandler.ForwardMap.get(this.riddenByEntity) && !TickHandler.BackwardMap.get(this.riddenByEntity))
				{
					this.fwdVelocity *= 0.96D;
				}
			}
		}
		
		this.rotationYaw += (this.onGround ? this.yawPointer * this.pseudoHandling : this.yawPointer * this.pseudoHandling * 0.3D) * this.speed/6;

		this.motionX += -Math.sin(Math.toRadians(this.rotationYaw))*this.fwdVelocity;
		this.motionZ += Math.cos(Math.toRadians(this.rotationYaw))*this.fwdVelocity;
		this.fwdVelocity *= this.onGround?this.frictionFactor:0.99F;
		
		if (this.fwdVelocity<0.01 && this.fwdVelocity>-0.01) {
			this.fwdVelocity = 0;
		}

		this.smoothMotion();

		this.motionX = this.motionX*0.5;
		this.motionY = this.motionY > -2 ? this.motionY - 0.08 : this.motionY;
		this.motionZ = this.motionZ * 0.5D;
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
	}

	private void smoothHandling()
	{
		this.pseudoHandling = -0.03D * this.speed/10 + 0.08F;
		
		
		/*if (this.speed < 0.1D)
		{
			this.pseudoHandling = 18D;
		}
		else if (this.speed > 30D)
		{
			this.pseudoHandling = 1D;
		}
		else if (this.speed > 26D)
		{
			this.pseudoHandling = 1.5D;
		}
		else if (this.speed > 21D)
		{
			this.pseudoHandling = 2D;
		}
		else
		{
			this.pseudoHandling = 0.0018D*Math.pow(this.speed, 3) - 0.072D*Math.pow(this.speed, 2) - 0.03D*this.speed + 18;
		}*/
	}

	private void smoothMotion()
	{
		if (isInWater()){
			this.fwdVelocity *= 0.94D;
		}else{
			if (this.fwdVelocity > (0.06D*this.speed + 0.07D))
			{
				this.fwdVelocity = 0.06D*this.speed + 0.05D;
			}
			else if (this.fwdVelocity < (-0.06D*this.speed - 0.07D))
			{
				this.fwdVelocity = -0.06D*this.speed - 0.05D;
			}
		}
	}
	
	public float getWheelTurnAngle()
	{
		return this.wheelTurnAngle;
	}
	
	public float getSteeringTurnAngle()
	{
		return this.steeringTurnAngle;
	}
	
	public float getRotateWheelSpeed()
	{
		return this.rotateWheelSpeed;
	}
	
	public float getRotatePassengerFrame()
	{
		return (float)Math.toRadians(-this.rotatePassengerFrame);
	}

	private void updateModel()
	{
		if (Minecraft.getMinecraft().inGameHasFocus)
		{
			this.rotateWheelSpeed += Math.sqrt((motionX * motionX) + (motionZ * motionZ)) * Math.signum(this.getFwdVelocity()) * 1.4F;
			rotateWheelSpeed = rotateWheelSpeed>=360?rotateWheelSpeed-360:rotateWheelSpeed;
			rotateWheelSpeed = rotateWheelSpeed<0?rotateWheelSpeed+360:rotateWheelSpeed;

			//this.passengerSeats[0] = (EntityPassengerSeat)this.worldObj.getEntityByID(115955);
			if (this.passengerSeats != null && this.passengerSeats.length > 0 && this.passengerSeats[0] != null && this.passengerSeats[0].riddenByEntity != null) {
				if (this.rotatePassengerFrame < 90F)
					this.rotatePassengerFrame += 9F;
			} else {
				if (this.rotatePassengerFrame > 0F)
					this.rotatePassengerFrame -= 9F;
			}
			
			float turnSpeed = 0.08F;
			
			if (this.isMovingLeft() && this.isMovingRight()) {
				this.wheelTurnAngle *= turnSpeed*6;
				this.steeringTurnAngle *= turnSpeed*6;
			}
			else if (!this.isMovingLeft() && !this.isMovingRight()) {
				this.wheelTurnAngle *= turnSpeed*6;
				this.steeringTurnAngle *= turnSpeed*6;
			}
			else if (this.isMovingLeft()) {
				this.wheelTurnAngle = this.wheelTurnAngle<0.3F?this.wheelTurnAngle+turnSpeed:0.3F;
				this.steeringTurnAngle = this.steeringTurnAngle>-0.25F?this.steeringTurnAngle-turnSpeed:-0.25F;
			}
			else if (this.isMovingRight()) {
				this.wheelTurnAngle = this.wheelTurnAngle>-0.3F?this.wheelTurnAngle-turnSpeed:-0.3F;
				this.steeringTurnAngle = this.steeringTurnAngle<0.25F?this.steeringTurnAngle+turnSpeed:0.25F;
			}
		}
	}

	private void handleDyingEffects()
	{
		//if(riddenByEntity!=null) worldObj.spawnParticle("smoke", posX, posY-0.15, posZ, 0, 0, 0);
		if(this.getHealth()<=30 && !isInWater())
		{
			double xOffset = -Math.sin(Math.toRadians(rotationYaw+50-rand.nextInt(101))) * 0.6;
			double zOffset = Math.cos(Math.toRadians(rotationYaw+50-rand.nextInt(101))) * 0.6;
			worldObj.spawnParticle("smoke", posX+xOffset, posY+0.16, posZ+zOffset, this.motionX/2, this.motionY/2, this.motionZ/2);
			if (this.getHealth()<=20 && rand.nextInt(100)<20)
			{
				worldObj.spawnParticle("flame", posX+xOffset, posY+0.2, posZ+zOffset, this.motionX/2, this.motionY/2, this.motionZ/2);
			}
			if (this.getHealth()<10 && rand.nextInt(100)<60)
			{
				worldObj.spawnParticle("flame", posX+xOffset, posY+0.2, posZ+zOffset, this.motionX/2, this.motionY/2, this.motionZ/2);
				worldObj.spawnParticle("smoke", posX+xOffset, posY+0.16, posZ+zOffset, this.motionX/2, this.motionY/2, this.motionZ/2);
			}
		}
	}

	@Override
	public String getEntityTexture() {
		return null;
	}
}
