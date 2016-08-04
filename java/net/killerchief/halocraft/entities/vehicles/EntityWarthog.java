package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthog;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogDamage1;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogDamage2;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogDamage3;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogTurretChainGun;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
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
		this.setSize(1.8F, 1.3F);
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

		this.dataWatcher.addObject(28, new Integer(0));//backEntity
		this.dataWatcher.addObject(29, new Integer(0));//seatShotgun
		this.dataWatcher.addObject(30, new Integer(0));//seatGunner
	}

	@Override
	public String getEntityTexture() {
		return null;
	}

	@Override
	protected String[] getSoundLoopIdle()
	{
		return new String[]{Halocraft.MODID+":entities.warthog.WarthogEngineIdle"};
	}

	@Override
	protected String[] getSoundLoopRun()
	{
		return new String[]{Halocraft.MODID+":entities.warthog.WarthogEngineHigh"};
	}

	@Override
	protected String[] getSoundEnter()
	{
		return new String[]{Halocraft.MODID+":entities.warthog.WarthogEnter"};
	}

	@Override
	protected String[] getSoundExit()
	{
		return new String[]{Halocraft.MODID+":entities.warthog.WarthogExit"};
	}

	@Override
	protected int getBeginLoopSoundDelay() {
		return 14;
	}
	
	@Override
	protected boolean getSoundOnYMotion() {
		return false;
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
		if (heldItem != null && par1EntityPlayer.isSneaking())
		{
			if (heldItem.getItem() == HalocraftItems.Wrench) {
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
		
		if (par1EntityPlayer.isSneaking())
			return false;

		if (this.riddenByEntity == null && (this.seatShotgun != null && this.entityonecloser(par1EntityPlayer, this, this.seatShotgun)))
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
			if (this.riddenByEntity != par1EntityPlayer && this.seatShotgun != null && this.seatShotgun.riddenByEntity == null)
			{
				//par1EntityPlayer.rotationYaw = this.rotationYaw;
				if (!this.worldObj.isRemote)
				{
					par1EntityPlayer.mountEntity(this.seatShotgun);
				}
				return true;
			}
		}

		return false;
	}

	public boolean entityonecloser(Entity main, Entity one, Entity two)
	{
		if (main != null && one != null && two != null) {
			double a = main.posX - one.posX;
			double b = main.posY - one.posY;
			double c = main.posZ - one.posZ;
			double d = main.posX - two.posX;
			double e = main.posY - two.posY;
			double f = main.posZ - two.posZ;
			return Math.sqrt(a*a + b*b + c*c) < Math.sqrt(d*d + e*e + f*f);
		} else
			return false;
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height - 1.22D;
	}

	@Override
	public void updateRiderPosition()
	{
		if (this.riddenByEntity != null)
		{
			double offsetLeft = 0.44D;
			double offsetForward = -0.1D;
			this.riddenByEntity.setPosition(this.posX + Math.cos(Math.toRadians(this.rotationYaw))*offsetLeft - Math.sin(Math.toRadians(this.rotationYaw))*offsetForward, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + Math.sin(Math.toRadians(this.rotationYaw))*offsetLeft + Math.cos(Math.toRadians(this.rotationYaw))*offsetForward);

			if (this.riddenByEntity instanceof EntityLivingBase)
			{
				((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.rotationYaw;
				if (Halocraft.proxy.isSideClient() && Minecraft.getMinecraft().gameSettings.thirdPersonView == 1)
					((EntityLivingBase)this.riddenByEntity).cameraPitch = -10F;
			}
		}
	}

	/**
	 * Will get destroyed next tick.
	 */
	@Override
	public void setDead()
	{
		super.setDead();
		if (this.entityback != null)
			this.entityback.setDead();
		if (this.seatShotgun != null)
			this.seatShotgun.setDead();
		if (this.seatGunner != null)
			this.seatGunner.setDead();
	}

	public EntityWarthogBack entityback = null;
	public EntityPassengerSeat seatShotgun = null;
	public EntityTurretSeat seatGunner = null;

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

		this.handleAttachedEntities();
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	@Override
	public boolean canBePushed()
	{
		if ((this.seatShotgun != null && this.seatShotgun.riddenByEntity != null) || (this.seatGunner != null && this.seatGunner.riddenByEntity != null))
			return false;
		return true;
	}

	protected void handleAttachedEntities()
	{
		if (this.entityback != null)
		{
			//this.setRiderLocation(this.seatShotgun, 0.95D, -1.56D, 0D, false);
			//this.setRiderLocation(this.seatShotgun, 0.22D, -0.2D, -0.44D, true, this.rotationYaw+20F);
		}
		else
		{
			if (!this.worldObj.isRemote)
			{
				this.entityback = new EntityWarthogBack(this.worldObj, this, this.posX, this.posY, this.posZ);
				double xOffset = -Math.sin(Math.toRadians(this.rotationYaw)) * 2.2;
				double zOffset = Math.cos(Math.toRadians(this.rotationYaw)) * 2.2;
				this.entityback.setPositionAndRotation(this.posX - xOffset, this.posY - 0.4, this.posZ - zOffset, 0F, 0F);
				//this.setRiderLocation(this.seatShotgun, 0.22D, -0.2D, -0.44D, true, this.rotationYaw+20F);
				this.worldObj.spawnEntityInWorld(this.entityback);
				this.dataWatcher.updateObject(28, this.entityback.getEntityId());
			}
			else
			{
				int id = this.dataWatcher.getWatchableObjectInt(28);
				if (id > 0)
					this.entityback = (EntityWarthogBack)this.worldObj.getEntityByID(id);//Code for case of invalid id (on update detect for) maybe?
			}
		}

		if (this.seatShotgun != null)
		{
			//this.setRiderLocation(this.seatShotgun, 0.95D, -1.56D, 0D, false);
			this.setRiderLocation(this.seatShotgun, 0.22D, -0.2D, -0.44D, true, this.rotationYaw+20F);
		}
		else
		{
			if (!this.worldObj.isRemote)
			{
				this.seatShotgun = new EntityPassengerSeat(this.worldObj, this, this.posX, this.posY, this.posZ);
				this.setRiderLocation(this.seatShotgun, 0.22D, -0.2D, -0.44D, true, this.rotationYaw+20F);
				this.worldObj.spawnEntityInWorld(this.seatShotgun);
				this.dataWatcher.updateObject(29, this.seatShotgun.getEntityId());
			}
			else
			{
				int id = this.dataWatcher.getWatchableObjectInt(29);
				if (id > 0)
					this.seatShotgun = (EntityPassengerSeat)this.worldObj.getEntityByID(id);//Code for case of invalid id (on update detect for) maybe?
			}
		}
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
			int reverse = this.fwdVelocity >= 0 ? 1 : -1;
			if (this.isMovingLeft()) {
				this.yawPointer -= 60F * reverse;
			}
			if (this.isMovingRight()) {
				this.yawPointer += 60F * reverse;
			}

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

		this.fwdVelocity *= this.onGround ? this.frictionFactor : 0.99F;
		if (this.fwdVelocity < 0.01D && this.fwdVelocity > -0.01D) {
			this.fwdVelocity = 0;
		}

		this.smoothMotion();

		this.motionX = this.motionX * 0.5D;
		this.motionY = this.motionY > -2D ? this.motionY - 0.08D : this.motionY;
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

	public ModelWarthogTurretChainGun TurretModel = null;
	public ResourceLocation TurretTexture = null;
	public ModelWarthogTurretChainGun getTurretModel()
	{
		return this.TurretModel;
	}
	public ResourceLocation getTurretTexture()
	{
		return this.TurretTexture;
	}

	public Model3DBase Damage0Model = new ModelWarthog();
	public ResourceLocation Damage0Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogModel.png");
	public Model3DBase Damage1Model = new ModelWarthogDamage1();
	public ResourceLocation Damage1Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogModel_Damaged.png");
	public Model3DBase Damage2Model = new ModelWarthogDamage2();
	public ResourceLocation Damage2Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogModel_Damaged_2.png");
	public Model3DBase Damage3Model = new ModelWarthogDamage3();
	public ResourceLocation Damage3Texture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogModel_Damaged_3.png");

	private Model3DBase model = this.Damage0Model;
	private ResourceLocation texture = this.Damage0Texture;

	public Model3DBase getModel()
	{
		return this.model;
	}

	public ResourceLocation getTexture()
	{
		return this.texture;
	}

	private void updateModel()
	{
		if (this.getHealth() <= 15)
		{
			this.model = this.Damage3Model;
			this.texture = this.Damage3Texture;
		}
		else if (this.getHealth() <= 40)
		{
			this.model = this.Damage2Model;
			this.texture = this.Damage2Texture;
		}
		else if (this.getHealth() <= 60)
		{
			this.model = this.Damage1Model;
			this.texture = this.Damage1Texture;
		}
		else
		{
			this.model = this.Damage0Model;
			this.texture = this.Damage0Texture;
		}

		if (Minecraft.getMinecraft().inGameHasFocus)
		{
			this.rotateWheelSpeed += Math.sqrt((motionX * motionX) + (motionZ * motionZ)) * Math.signum(this.getFwdVelocity()) * 1.4F;
			rotateWheelSpeed = rotateWheelSpeed>=360?rotateWheelSpeed-360:rotateWheelSpeed;
			rotateWheelSpeed = rotateWheelSpeed<0?rotateWheelSpeed+360:rotateWheelSpeed;

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
}
