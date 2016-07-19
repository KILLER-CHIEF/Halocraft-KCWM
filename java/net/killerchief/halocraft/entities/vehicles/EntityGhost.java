package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.vehicles.ModelGhost;
import net.killerchief.halocraft.client.models.vehicles.ModelGhostDamage1;
import net.killerchief.halocraft.client.models.vehicles.ModelGhostDamage2;
import net.killerchief.halocraft.client.models.vehicles.ModelGhostDamage3;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityGhost extends EntityVehicle
{
	public static final int maxHurtResistantTime = 10;
	private static final double frictionFactor = 0.97D;
	private double pseudoHandling = 2F;
	private float yawPointer = 0F;
	private double fwdVelocity = 0D;
	private double strafe = 0D;

	private float raiseModel = 0F;//0.36F;

	public int shootDelay = 0;

	public EntityGhost(World par1World)
	{
		super(par1World);
		this.setSize(1.8F, 1.4F);
		this.stepHeight = 1.0F;
		this.yOffset = height / 2.0F;
	}

	public EntityGhost(World par1World, double par2, double par4, double par6)
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
	}

	@Override
	public String getEntityTexture()
	{
		return null;
	}

	@Override
	protected String[] getSoundLoopRun() {
		return new String[]{Halocraft.MODID+":entities.ghost.GhostLoopRun"};
	}

	@Override
	protected String[] getSoundLoopIdle() {
		return new String[]{Halocraft.MODID+":entities.ghost.GhostLoopIdle"};
	}

	@Override
	protected String[] getSoundEnter() {
		return new String[]{Halocraft.MODID+":entities.ghost.GhostEnter"};
	}

	@Override
	protected String[] getSoundExit() {
		return new String[]{Halocraft.MODID+":entities.ghost.GhostExit"};
	}

	@Override
	protected int getBeginLoopSoundDelay() {
		return 10;
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

		return false;
	}

	@Override
	public void updateRiderPosition()
	{
		if (this.riddenByEntity != null)
		{
			this.riddenByEntity.setPosition(this.posX + (Math.sin(Math.toRadians(this.rotationYaw))*0.85D), this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset() + this.raiseModel - 1.06F, this.posZ + (-Math.cos(Math.toRadians(this.rotationYaw))*0.85D));

			if (this.riddenByEntity instanceof EntityLivingBase)
			{
				((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.rotationYaw;
				if (Halocraft.proxy.isSideClient() && Minecraft.getMinecraft().gameSettings.thirdPersonView == 1)
					((EntityLivingBase)this.riddenByEntity).cameraPitch = -10F;
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

		if (this.shootDelay > 0)
		{
			this.shootDelay--;
		}

		if (this.worldObj.isRemote)
		{
			this.handleEffects();

			if (Halocraft.proxy.isSideClient())
			{
				this.updateModel();
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
					this.strafe+=0.01D;
					this.setMovingLeft(true);
				}
				else
				{
					this.setMovingLeft(false);
				}

				if (TickHandler.RightMap.get(this.riddenByEntity) && this.onGround)
				{
					this.strafe-=0.01D;
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
				if (!TickHandler.LeftMap.get(this.riddenByEntity) && !TickHandler.RightMap.get(this.riddenByEntity))
				{
					this.strafe *= 0.96D;
				}
			}
		}

		this.rotationYaw += this.onGround ? this.yawPointer * this.pseudoHandling : this.yawPointer * this.pseudoHandling * 0.3D;

		this.motionX += -Math.sin(Math.toRadians(this.rotationYaw))*this.fwdVelocity;
		this.motionZ += Math.cos(Math.toRadians(this.rotationYaw))*this.fwdVelocity;
		this.fwdVelocity *= this.onGround?this.frictionFactor:0.99F;

		this.motionX += -Math.sin(Math.toRadians(this.rotationYaw-90D))*this.strafe;
		this.motionZ += Math.cos(Math.toRadians(this.rotationYaw-90D))*this.strafe;
		this.strafe *= 0.96F;

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
		this.pseudoHandling = 0.1F;
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

	private void handleEffects()
	{
		if ((int)(this.raiseModel*10) > 0)
		{
			for (int i = 0; i < (int)(this.raiseModel*12)*3; i++) {//Front Wings
				double random1 = this.rand.nextDouble()/1.5;
				double random2 = this.rand.nextDouble();
				double xOffset = (-Math.sin(Math.toRadians(this.rotationYaw+53))*(2.1D-random1))+(Math.cos(Math.toRadians(this.rotationYaw))*(2.7D*random2));
				double zOffset = (Math.cos(Math.toRadians(this.rotationYaw+53))*(2.1D-random1))+(Math.sin(Math.toRadians(this.rotationYaw))*(2.7D*random2));
				//this.worldObj.spawnParticle("flame", this.posX+xOffset, this.posY + 0.2D + this.raiseModel - 0.36F, this.posZ+zOffset, this.motionX, this.motionY-0.3D, this.motionZ);
				Halocraft.proxy.ParticleFX(1, this.worldObj, this.prevPosX+xOffset, this.prevPosY + 0.2D + this.raiseModel - 0.6F, this.prevPosZ+zOffset, this.motionX, this.motionY-0.3D, this.motionZ);
			}
			for (int i = 0; i < (int)(this.raiseModel*8)*3; i++) {//Center Body
				double random1 = this.rand.nextDouble();
				double random2 = this.rand.nextDouble();
				double xOffset = (-Math.sin(Math.toRadians(this.rotationYaw+14))*(0.8D))+(Math.cos(Math.toRadians(this.rotationYaw))*(0.53D*random1))+(Math.sin(Math.toRadians(this.rotationYaw))*(2.2D*random2));
				double zOffset = (Math.cos(Math.toRadians(this.rotationYaw+14))*(0.8D))+(Math.sin(Math.toRadians(this.rotationYaw))*(0.53D*random1))-(Math.cos(Math.toRadians(this.rotationYaw))*(2.2D*random2));
				//this.worldObj.spawnParticle("flame", this.posX+xOffset, this.posY + 0.2D + this.raiseModel - 0.36F, this.posZ+zOffset, this.motionX, this.motionY-0.3D, this.motionZ);
				Halocraft.proxy.ParticleFX(1, this.worldObj, this.prevPosX+xOffset, this.prevPosY + 0.2D + this.raiseModel - 0.7F, this.prevPosZ+zOffset, this.motionX, this.motionY-0.3D, this.motionZ);
			}
		}

		/*if(this.getHealth()<=30 && !isInWater())
		{
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
		}*/
	}

	public float getRaiseModel()
	{
		return this.raiseModel;
	}

	public static final Model3DBase Damage0Model = new ModelGhost();
	public static final ResourceLocation Damage0TextureOn = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhost.png");
	public static final ResourceLocation Damage0TextureOff = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostOff.png");
	public static final Model3DBase Damage1Model = new ModelGhostDamage1();
	public static final ResourceLocation Damage1TextureOn = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG1.png");
	public static final ResourceLocation Damage1TextureOff = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG1Off.png");
	public static final Model3DBase Damage2Model = new ModelGhostDamage2();
	public static final ResourceLocation Damage2TextureOn = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG2.png");
	public static final ResourceLocation Damage2TextureOff = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG2Off.png");
	public static final Model3DBase Damage3Model = new ModelGhostDamage3();
	public static final ResourceLocation Damage3TextureOn = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG3.png");
	public static final ResourceLocation Damage3TextureOff = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostDMG3Off.png");
	//public static final Model3DBase Damage4Model = new ModelGhost();
	//public static final ResourceLocation Damage4TextureOn = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhost.png");
	//public static final ResourceLocation Damage4TextureOff = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinGhostOFF.png");

	private Model3DBase model = this.Damage0Model;
	private ResourceLocation texture = this.Damage0TextureOff;

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
		if (Minecraft.getMinecraft().inGameHasFocus)
		{
			if (this.riddenByEntity == null) {
				if (this.raiseModel > 0F)
					this.raiseModel -= 0.03F;
			} else {
				if (this.raiseModel < 0.48F)
					this.raiseModel += 0.03F;
			}
		}

		if (this.getHealth() <= 15)
		{
			this.model = this.Damage3Model;
			if (this.riddenByEntity == null)
				this.texture = this.Damage3TextureOff;
			else
				this.texture = this.Damage3TextureOn;
		}
		else if (this.getHealth() <= 40)
		{
			this.model = this.Damage2Model;
			if (this.riddenByEntity == null)
				this.texture = this.Damage2TextureOff;
			else
				this.texture = this.Damage2TextureOn;
		}
		else if (this.getHealth() <= 60)
		{
			this.model = this.Damage1Model;
			if (this.riddenByEntity == null)
				this.texture = this.Damage1TextureOff;
			else
				this.texture = this.Damage1TextureOn;
		}
		else
		{
			this.model = this.Damage0Model;
			if (this.riddenByEntity == null)
				this.texture = this.Damage0TextureOff;
			else
				this.texture = this.Damage0TextureOn;
		}
	}
}
