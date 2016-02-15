package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWarthogBack extends Entity {

	/** The Vehicle Entity this is Attached To */
	private EntityWarthog parentBody;

	public EntityWarthogBack(World par1World)
	{
		super(par1World);
		this.setSize(1.0F, 1.1F);
		this.noClip = true;
	}

	public EntityWarthogBack(World par1World, EntityWarthog vehicle, double par2, double par4, double par6)
	{
		this(par1World);
		this.setPosition(par2, par4 , par6);
		this.parentBody = vehicle;
	}

	@Override
	protected void entityInit(){}

	/**
	 * Called when the entity is attacked.
	 */
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	{
		//if (this.parentBody != null && this.hurtResistantTime +1 < this.parentBody.hurtResistantTime)
		//	this.parentBody.hurtResistantTime = this.hurtResistantTime;
		return this.isEntityInvulnerable() ? false : (this.parentBody == null ? false : this.parentBody.attackEntityFrom(par1DamageSource, par2));
	}

	/**
	 * Returns the Y offset from the entity's position for any entity riding this one.
	 */
	@Override
	public double getMountedYOffset()
	{
		return (double)this.height - 0.7D;
	}

	/**
	 * First layer of player interaction
	 */
	@Override
	public boolean interactFirst(EntityPlayer par1EntityPlayer)
	{
		ItemStack heldItem = par1EntityPlayer.getCurrentEquippedItem();
		if(heldItem != null && this.parentBody != null)
		{
			if(heldItem.getItem() == HalocraftItems.Wrench) {
				if(this.parentBody.getHealth()<99) {
					this.parentBody.setHealth(this.parentBody.getHealth() + 2);
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
		}
		//System.out.println(this.parentBody);//FIXME: Warthog Back: null for client (need data watchers)
		if (this.parentBody != null && this.parentBody.seatGunner != null && this.parentBody.seatGunner.riddenByEntity == null)
		{
			if (!this.worldObj.isRemote)
			{
				par1EntityPlayer.rotationYaw = this.parentBody.rotationYaw;
				par1EntityPlayer.rotationPitch = 0F;
				par1EntityPlayer.mountEntity(this.parentBody.seatGunner);
			}
			return true;
		}
		return true;//Prevents accidental shooting for the moment
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

	/**
	 * Used in model rendering to determine if the entity riding this entity should be in the 'sitting' position.
	 * @return false to prevent an entity that is mounted to this entity from displaying the 'sitting' animation.
	 */
	@Override
	public boolean shouldRiderSit()
	{
		return false;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//worldObj.spawnParticle("flame", posX, posY, posZ, 0D, 0D, 0D);
		//System.out.println(this.parentBody !=null?this.parentBody.getHealth():0);//this.worldObj.isRemote + " : " + this.getEntityId() + " : "+
		if (this.parentBody != null)
		{
			//if (this.hurtResistantTime +1 < this.parentBody.hurtResistantTime)
			//	this.parentBody.hurtResistantTime = this.hurtResistantTime;
			//this.hurtResistantTime = this.parentBody.hurtResistantTime;

			double xOffset = -Math.sin(Math.toRadians(this.parentBody.rotationYaw)) * 2.2;
			double zOffset = Math.cos(Math.toRadians(this.parentBody.rotationYaw)) * 2.2;
			//this.prevPosX = this.posX = this.parentBody.posX - xOffset;
			//this.prevPosY = this.posY = this.parentBody.posY - 0.4D;
			//this.prevPosZ = this.posZ = this.parentBody.posZ - zOffset;
			this.setPositionAndRotation(this.parentBody.posX - xOffset, this.parentBody.posY - 0.4, this.parentBody.posZ - zOffset, 0F, 0F);
		}
		if (!this.worldObj.isRemote)
		{
			if(riddenByEntity != null && riddenByEntity.isDead)
			{
				riddenByEntity = null;
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
