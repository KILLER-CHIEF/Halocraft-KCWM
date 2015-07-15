package net.killerchief.halocraft.entities;

import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EntityDeployableGravityLift extends Entity implements IProjectile
{
    /**
     * Is the entity that throws this 'thing' (snowball, ender pearl, eye of ender or potion)
     */
    private EntityLivingBase thrower;
    private String throwerName;
	private float Gravity;
	private float ProjectileSpeed;
	private int Damage;
	private double BounceFactor;
	private int LifespanTimer;
	private boolean stopped;

    public EntityDeployableGravityLift(World par1World)
    {
        super(par1World);
        this.setSize(1.0F, 0.5F);
        this.stopped = false;
    }

    protected void entityInit()
    {
    	this.dataWatcher.addObject(21, Float.valueOf((float)this.posX));
    	this.dataWatcher.addObject(22, Float.valueOf((float)this.posY));
    	this.dataWatcher.addObject(23, Float.valueOf((float)this.posZ));
    }
    
    private void setPosX(double value)
	{
		this.dataWatcher.updateObject(21, Float.valueOf((float)value));
	}
    private Double getPosX()
	{
		return (double)this.dataWatcher.getWatchableObjectFloat(21);
	}
    private void setPosY(double value)
	{
		this.dataWatcher.updateObject(22, Float.valueOf((float)value));
	}
    private Double getPosY()
	{
		return (double)this.dataWatcher.getWatchableObjectFloat(22);
	}
    private void setPosZ(double value)
	{
		this.dataWatcher.updateObject(23, Float.valueOf((float)value));
	}
    private Double getPosZ()
	{
		return (double)this.dataWatcher.getWatchableObjectFloat(23);
	}

    @SideOnly(Side.CLIENT)
    /**
     * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
     * length * 64 * renderDistanceWeight Args: distance
     */
    public boolean isInRangeToRenderDist(double par1)
    {
        double d1 = this.boundingBox.getAverageEdgeLength() * 4.0D;
        d1 *= 64.0D;
        return par1 < d1 * d1;
    }

    public EntityDeployableGravityLift(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World);
        this.thrower = par2EntityLivingBase;
        this.Gravity = 0.04F;
        float projectileSpeed = 1.5F;
        this.ProjectileSpeed = 1.5F;
        float Accuracy = 1.0F;
        this.Damage = 1;
        this.BounceFactor = 0.1D;
        this.LifespanTimer = 500;
        //this.setProjectileType(projectileType);
        this.setLocationAndAngles(par2EntityLivingBase.posX, par2EntityLivingBase.posY + (double)par2EntityLivingBase.getEyeHeight(), par2EntityLivingBase.posZ, par2EntityLivingBase.rotationYaw, par2EntityLivingBase.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        float f = 0.4F;
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        this.motionY = (double)(-MathHelper.sin((this.rotationPitch + this.func_70183_g()) / 180.0F * (float)Math.PI) * f);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, projectileSpeed, Accuracy);
    }

    public EntityDeployableGravityLift(World par1World, double par2, double par4, double par6)
    {
        super(par1World);
        this.setPosition(par2, par4, par6);
        this.yOffset = 0.0F;
    }

    protected float func_70183_g()
    {
        return 0.0F;
    }
    
    /**
	 * Sets the position and rotation. Only difference from the other one is no bounding on the rotation. Args: posX,
	 * posY, posZ, yaw, pitch
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9)
	{//This is Very Important in getting the entity to render smoothly!
		this.setPosition(par1, par3, par5);
        this.setRotation(par7, par8);
		/*this.posX = par1;
		this.posY = par3;
		this.posZ = par5;
		this.rotationYaw = par7;
		this.rotationPitch = par8;
		//this.turnProgress = par9;
		//this.motionX = this.velocityX;
		//this.motionY = this.velocityY;
		//this.motionZ = this.velocityZ;*/
	}

    /**
     * Similar to setArrowHeading, it's point the throwable entity to a x, y, z direction.
     */
    public void setThrowableHeading(double par1, double par3, double par5, float par7, float par8)
    {
        float f2 = MathHelper.sqrt_double(par1 * par1 + par3 * par3 + par5 * par5);
        par1 /= (double)f2;
        par3 /= (double)f2;
        par5 /= (double)f2;
        par1 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par3 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par5 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par1 *= (double)par7;
        par3 *= (double)par7;
        par5 *= (double)par7;
        this.motionX = par1;
        this.motionY = par3;
        this.motionZ = par5;
        float f3 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, (double)f3) * 180.0D / Math.PI);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    public void setVelocity(double par1, double par3, double par5)
    {
        this.motionX = par1;
        this.motionY = par3;
        this.motionZ = par5;

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float f = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, (double)f) * 180.0D / Math.PI);
        }
    }
    
    /**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	protected boolean canTriggerWalking()
	{
		return false;
	}

	/**
	 * Returns a boundingBox used to collide the entity with other entities and blocks. This enables the entity to be
	 * pushable on contact, like boats or minecarts.
	 */
	public AxisAlignedBB getCollisionBox(Entity par1Entity)
	{
		return null;//par1Entity.boundingBox;
	}

	/**
	 * returns the bounding box for this entity
	 */
	public AxisAlignedBB getBoundingBox()
	{
		return null;//this.boundingBox;
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	public boolean canBePushed()
	{
		return false;
	}

	/**
	 * Returns true if other Entities should be prevented from moving through this Entity.
	 */
	public boolean canBeCollidedWith()
	{
		return false;//!this.isDead;
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public float getShadowSize()
    {
        return 0.2F;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
    	if (this.worldObj.isRemote)
		{
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.1F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.1F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.2F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.2F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.3F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.3F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.4F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.4F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.5F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.5F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.6F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.6F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.7F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.7F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.8F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.8F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.9F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 0.9F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 1.0F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		Halocraft.proxy.ParticleFX(1, worldObj, this.posX + this.worldObj.rand.nextFloat() - this.width/2, this.posY + 1.0F, this.posZ + this.worldObj.rand.nextFloat() - this.width/2, 0.0D, 1.0D, 0.0D);
    		
		}
    	if (!this.worldObj.isRemote)
    	{
    		this.setPosX(this.posX);
    		this.setPosY(this.posY);
    		this.setPosZ(this.posZ);
    	}
    	else
    	{
    		this.posX = this.getPosX();
    		this.posY = this.getPosY();
    		this.posZ = this.getPosZ();
    	}
    	
    	if (!this.worldObj.isRemote)
    	{
    		if (this.LifespanTimer-- <= 0)
    		{
        		//worldObj.playSoundAtEntity(this, HalocraftHelper.MODID+":weapons.PlasmaGrenadeExplode", 1.0F, 1.0F);
        		this.setDead();
    		}
    		
    		if(!this.stopped && !this.isDead)
    		{
    			double d = this.motionX;
    			double d1 = this.motionY;
    			double d2 = this.motionZ;
    			this.prevPosX = this.posX;
    			this.prevPosY = this.posY;
    			this.prevPosZ = this.posZ;
    			moveEntity(this.motionX, this.motionY, this.motionZ);
    			boolean flag = false;
    			if(this.motionX != d)
    			{
    				this.motionX = -d;
    				flag = true;
    			}
    			if(this.motionZ != d2)
    			{
    				this.motionZ = -d2;
    				flag = true;
    			}
    			if(this.motionY != d1)
    			{
    				this.motionY = -d1;
    				flag = true;
    			} else
    			{
    				this.motionY -= this.Gravity;
    			}
    			if(flag)
    			{
    				this.motionX *= this.BounceFactor;
    				this.motionY *= this.BounceFactor;
    				this.motionZ *= this.BounceFactor;
    			}
    			this.motionX *= 0.99D;
    			this.motionY *= 0.99D;
    			this.motionZ *= 0.99D;
    			if(this.onGround && this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ < 0.01D)
    			{
    				this.stopped = true;
    				this.motionX = 0.0D;
    				this.motionY = 0.0D;
    				this.motionZ = 0.0D;
    			}
    		}
    		
    	}
    	
    	List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(0.0D, 4.5D, 0.0D));

		if (list != null && !list.isEmpty())
		{
			for (int chkLst = 0; chkLst < list.size(); ++chkLst)
			{
				Entity entity = (Entity)list.get(chkLst);
				
				if (entity instanceof EntityDeployableGravityLift)
				{
					if (entity.posY > this.posY)
					{
						if (!(entity.motionY > 1.0D))
						{
							entity.motionY += 0.2D;
						}
						entity.fallDistance = 0.0F;
					}
				}
				else
				{
					if (!(entity.motionY > 1.0D))
					{
						entity.motionY += 0.2D;
					}
					entity.fallDistance = 0.0F;
				}
			}
		}
        
        //if (!this.worldObj.isRemote)
		//{
			//List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(0.0D, 4.5D, 0.0D));

			//if (list != null && !list.isEmpty())
			//{
				//for (int var27 = 0; var27 < list.size(); ++var27)
				//{
					//Entity entity = (Entity)list.get(var27);

					//if(entity instanceof EntityLiving)
					//{
					/*if (entity instanceof net.minecraft.entity.player.EntityPlayerMP)//EntityClientPlayerMP)
					{
						net.minecraft.client.entity.EntityClientPlayerMP.motionY = 1;
					}else
					{
						
					}*/
					
					/*if (entity instanceof HCEntityDeployableGravityLift)
					{
						
					}
					//else if (entity instanceof net.minecraft.client.entity.EntityClientPlayerMP)
					//{
						
					//}
					else
					{
						if (entity.motionY > 1.0D)
						{
							
						} else {
							entity.motionY += 0.2D;
						}
						entity.fallDistance = 0.0F;
						System.out.println("Entity Detected");
						System.out.println(entity);
					}*/
						
						/*if(entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.riddenByEntity), 10))
						{
							worldObj.playSoundAtEntity(this, Halocraft.modid+":damage.hurtflesh", 1F, 0.5F);
						}*/
					//}

					//if (entity.canBePushed() && entity instanceof HCEntityMongoose)
					//{
						//entity.applyEntityCollision(this);
					//}
				//}
			//}
		//}
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer)
        {
            this.throwerName = this.thrower.getCommandSenderName();
        }
        par1NBTTagCompound.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
        par1NBTTagCompound.setFloat("Gravity", this.Gravity);
        par1NBTTagCompound.setFloat("ProjectileSpeed", this.ProjectileSpeed);
        par1NBTTagCompound.setInteger("Damage", this.Damage);
        par1NBTTagCompound.setDouble("BounceFactor", this.BounceFactor);
        par1NBTTagCompound.setInteger("LifespanTimer", this.LifespanTimer);
        //par1NBTTagCompound.setInteger("ProjectileType", this.getProjectileType());
        
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        this.throwerName = par1NBTTagCompound.getString("ownerName");
        if (this.throwerName != null && this.throwerName.length() == 0)
        {
            this.throwerName = null;
        }
        this.Gravity = par1NBTTagCompound.getFloat("Gravity");
        this.ProjectileSpeed = par1NBTTagCompound.getFloat("ProjectileSpeed");
        this.Damage = par1NBTTagCompound.getInteger("Damage");
        this.BounceFactor = par1NBTTagCompound.getDouble("BounceFactor");
        this.LifespanTimer = par1NBTTagCompound.getInteger("LifespanTimer");
        //this.setProjectileType(par1NBTTagCompound.getInteger("ProjectileType"));
    }

    public EntityLivingBase getThrower()
    {
        if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0)
        {
            this.thrower = this.worldObj.getPlayerEntityByName(this.throwerName);
        }

        return this.thrower;
    }
}

