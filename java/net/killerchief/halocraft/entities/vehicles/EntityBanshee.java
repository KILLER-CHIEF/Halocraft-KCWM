package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.vehicles.ModelBansheeBase;
import net.killerchief.halocraft.client.models.vehicles.ModelBansheeBaseDamaged1;
import net.killerchief.halocraft.client.models.vehicles.ModelBansheeTop;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBanshee extends EntityVehicle
{
	private static final double frictionFactor = 0.98D;
	private double pseudoHandling = 2F;
	private float yawPointer = 0F;
	private float pitchPointer = 0F;
	private double fwdVelocity = 0D;
	private float wheelTurnAngle = 0F;
	private float steeringTurnAngle = 0F;
	private float rotateWheelSpeed = 0F;
	private float entityRiderYawDelta = 0F;
	private double entityRiderPitchDelta = 0D;
	
	public int shootDelay = 0;

	public EntityBanshee(World par1World)
	{
		super(par1World);
		this.setSize(2.4F, 2.4F);
		this.stepHeight = 1.0F;
		this.yOffset = height / 2.0F;
	}

	public EntityBanshee(World par1World, double par2, double par4, double par6)
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

		this.dataWatcher.addObject(28, new Integer(0));//seatPassenger
	}

	@Override
	protected String[] getSoundLoopIdle()
	{
		return new String[]{Halocraft.MODID+":entities.banshee.BansheeEngineLoop"};
	}

	@Override
	protected String[] getSoundLoopRun()
	{
		return new String[]{Halocraft.MODID+":entities.banshee.BansheeBoostLoop", Halocraft.MODID+":entities.banshee.BansheeContrailLoop"};
	}

	@Override
	protected String[] getSoundEnter()
	{
		return new String[]{Halocraft.MODID+":entities.banshee.BansheeEngineIn", Halocraft.MODID+":entities.banshee.BansheeOpen"};
	}

	@Override
	protected String[] getSoundExit()
	{
		return new String[]{Halocraft.MODID+":entities.banshee.BansheeEngineOut", Halocraft.MODID+":entities.banshee.BansheeClose"};
	}

	@Override
	protected int getBeginLoopSoundDelay() {
		return 10;
	}
	
	@Override
	protected boolean getSoundOnYMotion() {
		return true;
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height - 2.74D;
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
		
		if (par1EntityPlayer.isSneaking())
			return false;

		if (this.riddenByEntity == null)
		{
			if (!this.worldObj.isRemote)
			{
				par1EntityPlayer.rotationYaw = this.rotationYaw;
				par1EntityPlayer.rotationPitch = 10F;
				par1EntityPlayer.mountEntity(this);
				if (Halocraft.proxy.isSideClient() && par1EntityPlayer.getCommandSenderName().equals(Minecraft.getMinecraft().thePlayer.getCommandSenderName())) {
					localPlayerViewStore = Minecraft.getMinecraft().gameSettings.thirdPersonView;
					Minecraft.getMinecraft().gameSettings.thirdPersonView = 1;
				}
			}
			return true;
		}

		return false;
	}
	
	private int localPlayerViewStore = 0;
	
	@Override
	public void dismounted(Entity entity) {
		super.dismounted(entity);
		if (Halocraft.proxy.isSideClient() && entity.getCommandSenderName().equals(Minecraft.getMinecraft().thePlayer.getCommandSenderName())) {
			Minecraft.getMinecraft().gameSettings.thirdPersonView = localPlayerViewStore;
		}
	}

	@Override
	public void updateRiderPosition()
	{
		if (this.riddenByEntity != null)
		{
			double offsetLeft = 0D;
			double offsetForward = -0.1D;
			this.riddenByEntity.setPosition(this.posX + Math.cos(Math.toRadians(this.rotationYaw))*offsetLeft - Math.sin(Math.toRadians(this.rotationYaw))*offsetForward, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + Math.sin(Math.toRadians(this.rotationYaw))*offsetLeft + Math.cos(Math.toRadians(this.rotationYaw))*offsetForward);

			if (this.riddenByEntity instanceof EntityLivingBase)
			{
				((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.rotationYaw;
				if (Halocraft.proxy.isSideClient() && Minecraft.getMinecraft().gameSettings.thirdPersonView == 1)
					((EntityLivingBase)this.riddenByEntity).cameraPitch = -20F;
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
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	@Override
	protected void fall(float fallDist)
	{
		//super.fall(fallDist/2);
		/*int damage = (int)Math.ceil(fallDist - 6F);
		if(damage > 0){
			attackEntityFrom(DamageSource.fall, damage/2);
		}*/
	}

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
			this.pitchPointer = 0F;
			this.rotationPitch += (-25F - this.rotationPitch)/10F;
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
			
			this.pitchPointer = this.riddenByEntity.rotationPitch - this.rotationPitch - 20F;

			if (TickHandler.ForwardMap.containsKey(this.riddenByEntity) && TickHandler.BackwardMap.containsKey(this.riddenByEntity) && TickHandler.LeftMap.containsKey(this.riddenByEntity) && TickHandler.RightMap.containsKey(this.riddenByEntity))
			{
				if (TickHandler.ForwardMap.get(this.riddenByEntity))// && this.onGround
				{
					this.fwdVelocity+=0.02;
				}

				if (TickHandler.BackwardMap.get(this.riddenByEntity))// && this.onGround
				{
					this.fwdVelocity-=0.02;
					this.fwdVelocity*=0.94;
				}

				if (TickHandler.LeftMap.get(this.riddenByEntity))// && this.onGround
				{
					//this.rotationYaw-=this.pseudoHandling*this.fwdVelocity;
					this.setMovingLeft(true);
				}
				else
				{
					this.setMovingLeft(false);
				}

				if (TickHandler.RightMap.get(this.riddenByEntity))// && this.onGround
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

		//this.rotationYaw += (this.onGround ? this.yawPointer * this.pseudoHandling : this.yawPointer * this.pseudoHandling * 0.3D) * this.speed/6;
		this.rotationYaw += this.yawPointer * this.pseudoHandling * this.speed/6;
		this.rotationPitch += this.pitchPointer * this.pseudoHandling * this.speed/6;

		this.motionX += -Math.sin(Math.toRadians(this.rotationYaw))*this.fwdVelocity*Math.toRadians(90-Math.abs(this.rotationPitch));
		this.motionY -= Math.toRadians(this.rotationPitch-10F)*this.fwdVelocity;
		this.motionZ += Math.cos(Math.toRadians(this.rotationYaw))*this.fwdVelocity*Math.toRadians(90-Math.abs(this.rotationPitch));
		
		this.fwdVelocity *= this.frictionFactor;//this.onGround ? this.frictionFactor : 0.99F;
		if (this.fwdVelocity<0.01 && this.fwdVelocity>-0.01) {
			this.fwdVelocity = 0;
		}

		this.smoothMotion();

		this.motionX = this.motionX * 0.5D;
		this.motionY *= this.riddenByEntity != null ? 0.5D : 0.8D;
		this.motionZ = this.motionZ * 0.5D;
		
		double invSpeed = 1D/(Math.sqrt((this.motionX * this.motionX) + (this.motionZ * this.motionZ)) * 25D);
		//System.out.println(invSpeed);
		this.motionY -= 0.08D * ((invSpeed > 2D) ? 2D : (invSpeed < 0D ? 0D: invSpeed ));
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
	}

	private void smoothHandling()
	{
		this.pseudoHandling = 0.0000474D * this.speed * this.speed - 0.00358D * this.speed + 0.0781D;
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

	private void updateModel()
	{
		updateModel2();
		
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
	
	public Model3DBase ModelBase0 = new ModelBansheeBase();
	public ResourceLocation TextureBase0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBanshee.png");
	public ResourceLocation TextureBaseOn0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeOn.png");
	public Model3DBase ModelTop0 = new ModelBansheeTop();
	public ResourceLocation TextureTop0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeTop.png");
	
	public Model3DBase ModelBase1 = new ModelBansheeBaseDamaged1();
	public ResourceLocation TextureBase1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeDamaged1.png");
	public ResourceLocation TextureBaseOn1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeDamaged1On.png");
	public Model3DBase ModelTop1 = ModelTop0;
	public ResourceLocation TextureTop1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeTopDamaged1.png");

	public Model3DBase ModelBase2 = ModelBase1;
	public ResourceLocation TextureBase2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeDamaged2.png");
	public ResourceLocation TextureBaseOn2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeDamaged2On.png");
	public Model3DBase ModelTop2 = ModelTop0;
	public ResourceLocation TextureTop2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/SkinBansheeTopDamaged2.png");
	
	private Model3DBase modelBase = this.ModelBase0;
	private ResourceLocation textureBase = this.TextureBase0;
	private Model3DBase modelTop = this.ModelTop0;
	private ResourceLocation textureTop = this.TextureTop0;

	public Model3DBase getModelBase()
	{
		return this.modelBase;
	}
	public ResourceLocation getTextureBase()
	{
		return this.textureBase;
	}
	public Model3DBase getModelTop()
	{
		return this.modelTop;
	}
	public ResourceLocation getTextureTop()
	{
		return this.textureTop;
	}
	
	public float topRotationProgress = 1F;
	
	private void updateModel2() {
		if (this.getHealth() <= 30)
		{
			this.modelBase = this.ModelBase2;
			if (this.riddenByEntity == null)
				this.textureBase = this.TextureBase2;
			else
				this.textureBase = this.TextureBaseOn2;
			this.modelTop = this.ModelTop2;
			this.textureTop = this.TextureTop2;
		}
		else if (this.getHealth() <= 60)
		{
			this.modelBase = this.ModelBase1;
			if (this.riddenByEntity == null)
				this.textureBase = this.TextureBase1;
			else
				this.textureBase = this.TextureBaseOn1;
			this.modelTop = this.ModelTop1;
			this.textureTop = this.TextureTop1;
		}
		else
		{
			this.modelBase = this.ModelBase0;
			if (this.riddenByEntity == null)
				this.textureBase = this.TextureBase0;
			else
				this.textureBase = this.TextureBaseOn0;
			this.modelTop = this.ModelTop0;
			this.textureTop = this.TextureTop0;
		}
		
		if (this.riddenByEntity == null)
		{
			if (this.topRotationProgress < 1F)
			{
				this.topRotationProgress += 0.06F;
			}
			this.textureBase = this.TextureBase0;
		}
		else
		{
			if (this.topRotationProgress > 0F)
			{
				this.topRotationProgress -= 0.06F;
			}
			this.textureBase = this.TextureBaseOn0;
		}
	}

	@Override
	public String getEntityTexture() {
		return null;
	}
}
