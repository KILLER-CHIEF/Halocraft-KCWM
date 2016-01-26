package net.killerchief.halocraft.entities.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityPassengerSeat extends Entity {

	/** The Vehicle Entity this is Attached To */
	public EntityVehicle parentBody;

	public boolean shouldRiderSit = true;
	public boolean forceRotation = true;

	public EntityPassengerSeat(World par1World)
	{
		super(par1World);
		this.setSize(0.0F, 0.0F);
	}

	public EntityPassengerSeat(World par1World, EntityVehicle vehicle, double par2, double par4, double par6)
	{
		this(par1World);
		this.setPosition(par2, par4 , par6);
		this.parentBody = vehicle;
	}

	@Override
	protected void entityInit()
	{
		this.dataWatcher.addObject(25, new Integer(0));
	}

	/**
	 * Called when the entity is attacked.
	 */
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	{
		return this.isEntityInvulnerable() ? false : (this.parentBody == null ? false : this.parentBody.attackEntityFrom(par1DamageSource, par2));
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height;
	}

	@Override
	public void updateRiderPosition()
	{
		if (this.riddenByEntity != null)
		{
			this.riddenByEntity.setPosition(this.posX, this.posY + this.riddenByEntity.getYOffset(), this.posZ);

			if (this.forceRotation && this.riddenByEntity instanceof EntityLivingBase)
			{
				EntityLivingBase entity = ((EntityLivingBase)this.riddenByEntity);
				entity.renderYawOffset = this.rotationYaw;
				if (this.parentBody != null && this.parentBody instanceof EntityWarthog)
				{
					if (entity.rotationYaw > this.parentBody.rotationYaw + 100F) {
						entity.rotationYaw = this.parentBody.rotationYaw + 100F;
					} else if (entity.rotationYaw < this.parentBody.rotationYaw + -80F) {
						entity.rotationYaw = this.parentBody.rotationYaw + -80F;
					}
				}
				//((EntityLivingBase)this.riddenByEntity).cameraPitch = -5F;
			}
		}
	}

	/**
	 * First layer of player interaction
	 */
	@Override
	public boolean interactFirst(EntityPlayer par1EntityPlayer)
	{
		if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != par1EntityPlayer)
		{
			return true;
		}
		else
		{
			if (!this.worldObj.isRemote)
			{
				par1EntityPlayer.mountEntity(this);
			}
			return true;
		}
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
		return null;//return par1Entity.boundingBox;
	}

	/**
	 * returns the bounding box for this entity
	 */
	@Override
	public AxisAlignedBB getBoundingBox()
	{
		return null;//return this.boundingBox;
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
		return false;//!this.isDead;
	}

	/**
	 * Used in model rendering to determine if the entity riding this entity should be in the 'sitting' position.
	 * @return false to prevent an entity that is mounted to this entity from displaying the 'sitting' animation.
	 */
	@Override
	public boolean shouldRiderSit()
	{
		return this.shouldRiderSit;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (!this.worldObj.isRemote)
		{
			if (this.parentBody != null && this.dataWatcher.getWatchableObjectInt(25) <= 0)
			{
				this.dataWatcher.updateObject(25, this.parentBody.getEntityId());
			}
		}
		else
		{
			if (this.parentBody == null)
			{
				int id = this.dataWatcher.getWatchableObjectInt(25);
				if (id > 0)
					if (this.worldObj.getEntityByID(id) instanceof EntityVehicle)
						this.parentBody = (EntityVehicle)this.worldObj.getEntityByID(id);
			}
		}

		//worldObj.spawnParticle("flame", posX, posY, posZ, 0D, 0D, 0D);
		if (!this.worldObj.isRemote)
		{
			if(this.riddenByEntity != null && this.riddenByEntity.isDead)
			{
				this.riddenByEntity = null;
			}
			if (this.parentBody == null || this.parentBody.isDead)
			{
				this.setDead();
			}
		}
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		//this.parentBody = (par1NBTTagCompound.get("parentBody"));
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		//par1NBTTagCompound.set("parentBody", this.parentBody);
	}
}
