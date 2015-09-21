package net.killerchief.kcweaponmod;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityProjectile extends Entity implements IProjectile
{
	//public int xTile = -1;//Only set in Impact Methods
	//public int yTile = -1;//Only set in Impact Methods
	//public int zTile = -1;//Only set in Impact Methods
	//private Block inTile = null;

	/** The entity that threw this throwable item. */
	public EntityLivingBase thrower = null;
	private String throwerName = null;
	private int ticksInAir = 0;
	//Added Variables to Original EntityThrowable (for reference in updates)
	private int ticksInWater = 0;
	public double prevMotionX = 0D;
	public double prevMotionY = 0D;
	public double prevMotionZ = 0D;
	public Entity stuckEntity = null;
	private double xSeOffset = 0;
	private double ySeOffset = 0;
	private double zSeOffset = 0;
	private double prevTrackingDistance = 0D;
	public int Fuse = 0;
	public int EncounteredEntities = 0;
	public Entity trackEntity = null;

	//Variables that are set in constructors. Does NOT need to have NBT!
	public float Gravity = 0.0F;
	public int MaxEffectiveTicksAlive = 400;
	public boolean tagLoopExitBreakout = false;
	public Object[] ProjLivingActArgs = new Object[]{};
	public Object[] ProjImpactActArgs = new Object[]{"Die"};
	public Object[] ProjPrematureEndLifeActArgs = new Object[]{};
	public float ProjectileDragInAir = 0.99F;
	public float ProjectileDragInWater = 0.5F;
	public boolean Glows = true;
	public float TrackSensitivity = 0F;

	//public int Damage = 0;
	//public int TargetHurtResistance = 0;
	//public float ExplosionSize = 0F;
	//** The smaller the value below 1, the worse the bounce is */
	//public double BounceFactor = 0D;
	//Add to list
	//** More than 1 is less capable reflection angle. Less than 1 is more reflection angle. */
	//public double RicochetFactor = 1D;
	//public int MaxAllowedEncounteredEntities = 0;//or -1

	//These must stay unaccessible from other classes/code and must NOT be modified.
	private int ID = -1;
	private ItemWeaponProperties properties;//Must not be used or set in NBT.

	public EntityProjectile(World world)
	{
		super(world);
		this.yOffset = 0.0F;
		this.setSize(0.25F, 0.25F);
		this.renderDistanceWeight = 10.0D;
	}

	public EntityProjectile(World world, EntityLivingBase shooter, EntityLivingBase target, int propertiesID)
	{
		super(world);
		if (this.initProperties(propertiesID, KCWeaponMod.weapons.length))
		{
			this.thrower = shooter;

			this.posY = shooter.posY + (double)shooter.getEyeHeight() - 0.10000000149011612D;
			double d0 = target.posX - shooter.posX;
			double d1 = target.boundingBox.minY + (double)(target.height / 3.0F) - this.posY;
			double d2 = target.posZ - shooter.posZ;
			double d3 = (double)MathHelper.sqrt_double(d0 * d0 + d2 * d2);

			if (d3 >= 1.0E-7D)
			{
				float f2 = (float)(Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
				float f3 = (float)(-(Math.atan2(d1, d3) * 180.0D / Math.PI));
				double d4 = d0 / d3;
				double d5 = d2 / d3;
				this.setLocationAndAngles(shooter.posX + d4, this.posY, shooter.posZ + d5, f2, f3);
				this.yOffset = 0.0F;
				float f4 = (float)d3 * 0.2F;
				this.setThrowableHeading(d0, d1 + (double)f4, d2, properties.ProjectileSpeed, properties.Accuracy);
			}
		}
		else
		{
			this.setDead();
		}
	}

	public EntityProjectile(World world, EntityLivingBase thrower, int propertiesID)
	{
		this(world);
		if (this.initProperties(propertiesID, KCWeaponMod.weapons.length))
		{
			this.thrower = thrower;
			this.setLocationAndAngles(thrower.posX, thrower.posY + (double)thrower.getEyeHeight(), thrower.posZ, thrower.rotationYaw, thrower.rotationPitch);
			this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.34F) + (MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.7F * Math.abs((MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * 1F)));
			this.posY -= 0.10000000149011612D + (double)(MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI) * 1.1F);
			this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.34F) - (MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.7F * Math.abs((MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * 1F)));
			this.setPosition(this.posX, this.posY, this.posZ);
			float f = 0.4F;
			this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, properties.ProjectileSpeed, properties.Accuracy);
		}
		else
		{
			this.setDead();
		}
	}

	public EntityProjectile(World world, EntityLivingBase thrower, int propertiesID, Entity trackEntity)
	{
		this(world, thrower, propertiesID);
		this.trackEntity = trackEntity;
	}

	public EntityProjectile(World world, double posx, double posy, double posz, EntityLivingBase thrower, int propertiesID)
	{
		this(world);
		if (this.initProperties(propertiesID, KCWeaponMod.weapons.length))
		{
			this.thrower = thrower;
			this.setLocationAndAngles(posx, posy, posz, thrower.rotationYaw, thrower.rotationPitch);
			float f = 0.4F;
			this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI) * f);
			this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, properties.ProjectileSpeed, properties.Accuracy);
		}
		else
		{
			this.setDead();
		}
	}

	public EntityProjectile(World world, double posx, double posy, double posz, double motionx, double motiony, double motionz, EntityLivingBase thrower, int propertiesID)
	{
		this(world);
		this.thrower = thrower;

		//this.setLocationAndAngles(posx, posy, posz, thrower.rotationYaw, thrower.rotationPitch);
		this.lastTickPosX = this.prevPosX = this.posX = posx;
		this.lastTickPosY = this.prevPosY = this.posY = posy;
		this.lastTickPosZ = this.prevPosZ = this.posZ = posz;
		this.setPosition(this.posX, this.posY, this.posZ);

		this.motionX = motionx;
		this.motionY = motiony;
		this.motionZ = motionz;

		if (!this.initProperties(propertiesID, KCWeaponMod.weapons.length))
		{
			this.setDead();
		}
	}

	public boolean initProperties(int propertiesID, int num)
	{
		if (propertiesID >= 0 && propertiesID < KCWeaponMod.weapons.length && num == KCWeaponMod.weapons.length)
		{
			if (!this.worldObj.isRemote)
			{
				this.setPropertiesID(propertiesID);
				this.setPastWeaponArrayLength(num);
			}
			this.ID = propertiesID;
			this.properties = KCWeaponMod.weapons[propertiesID].Properties;
		}
		else
		{
			return false;
		}
		this.Gravity = this.properties.Gravity;
		this.MaxEffectiveTicksAlive = this.properties.MaxEffectiveTicksAlive;
		this.ProjLivingActArgs = this.properties.ProjLivingActArgs;
		this.ProjImpactActArgs = this.properties.ProjImpactActArgs;
		this.ProjPrematureEndLifeActArgs = this.properties.ProjPrematureEndLifeActArgs;
		this.ProjectileDragInAir = this.properties.ProjectileDragInAir;
		this.ProjectileDragInWater = this.properties.ProjectileDragInWater;
		this.Glows = this.properties.ProjectileGlows;
		this.TrackSensitivity = this.properties.TrackSensitivity;
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getBrightnessForRender(float par1)
	{
		if (this.Glows)
			return 15728880;

		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posZ);

		if (this.worldObj.blockExists(i, 0, j))
		{
			double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
			int k = MathHelper.floor_double(this.posY - (double)this.yOffset + d0);
			return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
		}
		else
		{
			return 0;
		}
	}

	@Override
	protected void entityInit()
	{
		this.dataWatcher.addObject(16, -1);//PropertiesID
		this.dataWatcher.addObject(18, -1);//PastWeaponArrayLength
	}

	public void setPropertiesID(int propertiesID)
	{
		this.dataWatcher.updateObject(16, propertiesID);
	}

	/** Gets the ID of this projectile in the weapon array from KCWeaponMod.weapons (safe to use everywhere). */
	public int getPropertiesID()
	{
		return this.dataWatcher.getWatchableObjectInt(16);
	}

	public void setPastWeaponArrayLength(int num)
	{
		this.dataWatcher.updateObject(18, num);
	}

	public int getPastWeaponArrayLength()
	{
		return this.dataWatcher.getWatchableObjectInt(18);
	}

	/**
	 * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
	 * length * 64 * renderDistanceWeight Args: distance
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isInRangeToRenderDist(double p_70112_1_)
	{
		double d1 = this.boundingBox.getAverageEdgeLength() * 4.0D;
		d1 *= 64.0D;
		return p_70112_1_ < d1 * d1;
	}

	/**
	 * Similar to setArrowHeading, it's point the throwable entity to a x, y, z direction.
	 */
	@Override
	public void setThrowableHeading(double p_70186_1_, double p_70186_3_, double p_70186_5_, float p_70186_7_, float p_70186_8_)
	{
		float f2 = MathHelper.sqrt_double(p_70186_1_ * p_70186_1_ + p_70186_3_ * p_70186_3_ + p_70186_5_ * p_70186_5_);
		p_70186_1_ /= (double)f2;
		p_70186_3_ /= (double)f2;
		p_70186_5_ /= (double)f2;
		p_70186_1_ += this.rand.nextGaussian() * 0.007499999832361937D * (double)p_70186_8_;
		p_70186_3_ += this.rand.nextGaussian() * 0.007499999832361937D * (double)p_70186_8_;
		p_70186_5_ += this.rand.nextGaussian() * 0.007499999832361937D * (double)p_70186_8_;
		p_70186_1_ *= (double)p_70186_7_;
		p_70186_3_ *= (double)p_70186_7_;
		p_70186_5_ *= (double)p_70186_7_;
		this.motionX = p_70186_1_;
		this.motionY = p_70186_3_;
		this.motionZ = p_70186_5_;
		float f3 = MathHelper.sqrt_double(p_70186_1_ * p_70186_1_ + p_70186_5_ * p_70186_5_);
		this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(p_70186_1_, p_70186_5_) * 180.0D / Math.PI);
		this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(p_70186_3_, (double)f3) * 180.0D / Math.PI);
	}

	/**
	 * Sets the velocity to the args. Args: x, y, z
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void setVelocity(double p_70016_1_, double p_70016_3_, double p_70016_5_)
	{
		this.motionX = p_70016_1_;
		this.motionY = p_70016_3_;
		this.motionZ = p_70016_5_;

		if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
		{
			float f = MathHelper.sqrt_double(p_70016_1_ * p_70016_1_ + p_70016_5_ * p_70016_5_);
			this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(p_70016_1_, p_70016_5_) * 180.0D / Math.PI);
			this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(p_70016_3_, (double)f) * 180.0D / Math.PI);
		}
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		if (!this.worldObj.isRemote)
		{
			par1NBTTagCompound.setInteger("PastWeaponArrayLength", this.getPastWeaponArrayLength());
		}
		par1NBTTagCompound.setInteger("ID", this.ID);

		par1NBTTagCompound.setBoolean("Glows", this.Glows);

		par1NBTTagCompound.setInteger("ticksExisted", this.ticksExisted);
		par1NBTTagCompound.setInteger("ticksInAir", this.ticksInAir);
		par1NBTTagCompound.setInteger("ticksInWater", this.ticksInWater);
		par1NBTTagCompound.setInteger("stuckEntity", this.stuckEntity != null ? this.stuckEntity.getEntityId() : 0);
		par1NBTTagCompound.setDouble("xSeOffset", this.xSeOffset);
		par1NBTTagCompound.setDouble("ySeOffset", this.ySeOffset);
		par1NBTTagCompound.setDouble("zSeOffset", this.zSeOffset);
		par1NBTTagCompound.setInteger("EncounteredEntities", this.EncounteredEntities);
		par1NBTTagCompound.setInteger("Fuse", this.Fuse);
		par1NBTTagCompound.setInteger("trackEntity", this.trackEntity != null ? this.trackEntity.getEntityId() : 0);

		//par1NBTTagCompound.setShort("xTile", (short)this.xTile);
		//par1NBTTagCompound.setShort("yTile", (short)this.yTile);
		//par1NBTTagCompound.setShort("zTile", (short)this.zTile);
		//par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock(this.inTile));

		if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer)
		{
			this.throwerName = this.thrower.getCommandSenderName();
		}

		par1NBTTagCompound.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		if (!this.worldObj.isRemote)
		{
			this.setPastWeaponArrayLength(par1NBTTagCompound.getInteger("PastWeaponArrayLength"));
		}
		this.ID = par1NBTTagCompound.getInteger("ID");
		if (!this.worldObj.isRemote)
		{
			this.setPropertiesID(this.ID);
		}

		this.Glows = par1NBTTagCompound.getBoolean("Glows");

		this.ticksExisted = par1NBTTagCompound.getInteger("ticksExisted");
		this.ticksInAir = par1NBTTagCompound.getInteger("ticksInAir");
		this.ticksInWater = par1NBTTagCompound.getInteger("ticksInWater");
		this.stuckEntity = this.worldObj.getEntityByID(par1NBTTagCompound.getInteger("stuckEntity"));
		this.xSeOffset = par1NBTTagCompound.getDouble("xSeOffset");
		this.ySeOffset = par1NBTTagCompound.getDouble("ySeOffset");
		this.zSeOffset = par1NBTTagCompound.getDouble("zSeOffset");
		this.EncounteredEntities = par1NBTTagCompound.getInteger("EncounteredEntities");
		this.Fuse = par1NBTTagCompound.getInteger("Fuse");
		this.trackEntity = this.worldObj.getEntityByID(par1NBTTagCompound.getInteger("trackEntity"));

		//this.xTile = par1NBTTagCompound.getShort("xTile");
		//this.yTile = par1NBTTagCompound.getShort("yTile");
		//this.zTile = par1NBTTagCompound.getShort("zTile");
		//this.inTile = Block.getBlockById(par1NBTTagCompound.getByte("inTile") & 255);

		this.throwerName = par1NBTTagCompound.getString("ownerName");

		if (this.throwerName != null && this.throwerName.length() == 0)
		{
			this.throwerName = null;
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public float getShadowSize()
	{
		return 0.0F;
	}

	public EntityLivingBase getThrower()
	{
		if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0)
		{
			this.thrower = this.worldObj.getPlayerEntityByName(this.throwerName);
		}

		return this.thrower;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()//TODO: Gravity lift doesn't affect projectiles
	{
		if (this.ID >= 0 && this.getPastWeaponArrayLength() != KCWeaponMod.weapons.length)
		{
			if (!this.worldObj.isRemote)
				this.setDead();
			return;
		}
		if (this.ID != this.getPropertiesID())
		{
			this.ID = this.getPropertiesID();
			if (this.ID >= 0)
				if (!this.initProperties(this.ID, this.getPastWeaponArrayLength()))
					if (!this.worldObj.isRemote)
						this.setDead();
		}

		this.prevMotionX = this.motionX;
		this.prevMotionY = this.motionY;
		this.prevMotionZ = this.motionZ;

		this.lastTickPosX = this.posX;
		this.lastTickPosY = this.posY;
		this.lastTickPosZ = this.posZ;
		super.onUpdate();

		if (this.ID >= 0)
		{
			if (this.worldObj.isRemote && 0.04D > Math.sqrt((this.motionX * this.motionX) + (this.motionY * this.motionY) + (this.motionZ * this.motionZ)) && 0.04D > Math.sqrt((this.prevMotionX * this.prevMotionX) + (this.prevMotionY * this.prevMotionY) + (this.prevMotionZ * this.prevMotionZ)))
			{
				//Stop it from jumping around badly on client for stationary grenades etc.
			}
			else if (this.stuckEntity == null)
			{
				float projectileDrag = this.ProjectileDragInAir;

				if (this.isInWater())//TODO: Lava check.
				{
					++this.ticksInWater;
					this.ticksInAir = 0;
					projectileDrag = this.ProjectileDragInWater;
				}
				else
				{
					++this.ticksInAir;
					this.ticksInWater = 0;
				}

				if (this.trackEntity != null && !this.trackEntity.isDead)
				{
					double distance = this.getDistanceSqToEntity(this.trackEntity)/2;
					float sens = this.TrackSensitivity;
					if (distance > this.prevTrackingDistance)
					{
						sens = this.TrackSensitivity/1.6F;
					}
					else
					{
						sens = this.TrackSensitivity*1.4F;
					}
					this.prevTrackingDistance = distance;
					//System.out.println(this.motionY);
					double speed = Math.sqrt((this.motionX * this.motionX) + (this.motionY * this.motionY) + (this.motionZ * this.motionZ));
					this.motionX *= 1/speed;
					this.motionY *= 1/speed;
					this.motionZ *= 1/speed;
					//if (Math.abs(this.motionX) < 2)
					this.motionX -= (this.posX - this.trackEntity.posX) * Math.abs(this.posX - this.trackEntity.posX) * (sens / distance) * 1.2;
					//if (Math.abs(this.motionY) < 2)
					this.motionY -= (this.posY - this.trackEntity.posY) * Math.abs(this.posY - this.trackEntity.posY) * (sens / distance) * 1.2;
					//if (Math.abs(this.motionZ) < 2)
					this.motionZ -= (this.posZ - this.trackEntity.posZ) * Math.abs(this.posZ - this.trackEntity.posZ) * (sens / distance) * 1.2;
				}

				/*if (this.inGround)
				{
					if (this.worldObj.getBlock(this.xTile, this.yTile, this.zTile) == this.inTile)//fFIXME: Um wtf bad! is not even set anywhere but in the impact code (or was)
					{
						++this.ticksInGround;

						if (this.ticksInGround >= 1200)//fFIXME: Length of time in ground for final action
						{
							//fFIXME: when in ground for too long
							//this.worldObj.createExplosion(this, posX, posY, posZ, 4F, HalocraftConfig.ExplosionBlockDamage);
							//this.explodeWithEntity(true, 1, 2.0D);
							//this.explodeWithEntity(false, 2, 5.0D);

							this.setDead();
						}
						return;
					}

					this.inGround = false;
					this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
					this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
					this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
					this.ticksInGround = 0;
					this.ticksInAir = 0;
				}
				else
				{
					++this.ticksInAir;
				}*/

				Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
				Vec3 vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
				MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec3, vec31);
				vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
				vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

				if (movingobjectposition != null)
				{
					vec31 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
				}

				if (!this.worldObj.isRemote)
				{
					Entity entity = null;
					List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
					double d0 = 0.0D;
					EntityLivingBase entitylivingbase = this.getThrower();

					for (int j = 0; j < list.size(); ++j)
					{
						Entity entity1 = (Entity)list.get(j);

						if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5))
						{
							float f = 0.3F;
							AxisAlignedBB axisalignedbb = entity1.boundingBox.expand((double)f, (double)f, (double)f);
							MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

							if (movingobjectposition1 != null)
							{
								double d1 = vec3.distanceTo(movingobjectposition1.hitVec);

								if (d1 < d0 || d0 == 0.0D)
								{
									entity = entity1;
									d0 = d1;
								}
							}
						}
					}

					if (entity != null)
					{
						movingobjectposition = new MovingObjectPosition(entity);
					}
				}

				if (movingobjectposition != null)
				{
					if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.portal)
					{
						this.setInPortal();
					}
					else
					{
						//System.out.println("Impact: "+movingobjectposition.typeOfHit.name());
						for (Object arg : this.ProjImpactActArgs)
						{
							KCUtils.CallPropertyParts(this, movingobjectposition, arg);
							if (this.tagLoopExitBreakout)
							{
								//System.out.println("Broke Away...");
								break;
							}
						}
						//System.out.println("End");
						this.tagLoopExitBreakout = false;
					}
				}

				this.posX += this.motionX;
				this.posY += this.motionY;
				this.posZ += this.motionZ;
				float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

				for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f1) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
				{
					;
				}

				while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
				{
					this.prevRotationPitch += 360.0F;
				}

				while (this.rotationYaw - this.prevRotationYaw < -180.0F)
				{
					this.prevRotationYaw -= 360.0F;
				}

				while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
				{
					this.prevRotationYaw += 360.0F;
				}

				this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
				this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;

				this.motionX *= (double)projectileDrag;
				this.motionY *= (double)projectileDrag;
				this.motionZ *= (double)projectileDrag;
				this.motionY -= (double)this.Gravity;
			}
			else
			{
				if (!this.stuckEntity.isDead)
				{
					this.posX = this.stuckEntity.posX + this.xSeOffset;
					this.posY = this.stuckEntity.posY + this.ySeOffset;
					this.posZ = this.stuckEntity.posZ + this.zSeOffset;
				}
				else
				{
					this.Fuse = 1;
				}
			}

			//System.out.println(this.posY+"Fuse: "+ this.Fuse);
			for (Object arg : this.ProjLivingActArgs)
			{
				KCUtils.CallPropertyParts(this, null, arg);
				if (this.tagLoopExitBreakout)
				{
					//System.out.println("Broke Away...");
					break;
				}
			}
			//System.out.println("End");
			this.tagLoopExitBreakout = false;
		}

		if (this.ID < 0 || this.ticksExisted > this.MaxEffectiveTicksAlive)
		{
			//System.out.println("Premature Death");
			for (Object arg : this.ProjPrematureEndLifeActArgs)
			{
				KCUtils.CallPropertyParts(this, null, arg);
				if (this.tagLoopExitBreakout)
				{
					//System.out.println("Broke Away...");
					break;
				}
			}
			//System.out.println("End");
			this.tagLoopExitBreakout = false;

			//U w1ll dI3
			if (!this.worldObj.isRemote)
			{
				this.setDead();
			}
		}

		this.setPosition(this.posX, this.posY, this.posZ);
	}

	public void inWaterEffects()
	{
		for (int i = 0; i < 4; ++i)
		{
			float f4 = 0.25F;
			this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
		}
	}
}
