package net.killerchief.halocraft.entities.mobs;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;


public class EntityEliteSword extends EntityHalocraftMob
{
	/** The ItemStack the Elite Holds. */
	private static final ItemStack defaultHeldItem = new ItemStack(HalocraftItemsWeapons.EnergySword, 1);

	private double movementSpeed = 0.3D;
	private double runSpeed = 0.5D;

	public EntityEliteSword(World par1World)
	{
		super(par1World);
		//this.setAIMoveSpeed((float)this.movementSpeed);
		this.setSize(0.6F, 1.9F);
		getNavigator().setBreakDoors(true);
		getNavigator().setAvoidsWater(false);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIBreakDoor(this));
		for (int i = 0; i < mobKillList.length; i++) {
			tasks.addTask(2, new EntityAIAttackOnCollide(this, mobKillList[i], this.runSpeed, false));
		}
		tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, this.movementSpeed));
		tasks.addTask(4, new EntityAIMoveThroughVillage(this, this.runSpeed, false));
		tasks.addTask(5, new EntityAIWander(this, this.movementSpeed));
		for (int i = 0; i < mobWatchList.length; i++) {
			tasks.addTask(6, new EntityAIWatchClosest(this, mobWatchList[i], 8F));
		}
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		for (int i = 0; i < mobKillList.length; i++) {
			targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, mobKillList[i], 0, true));
		}
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		//this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.699999988079071D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(100.0D);
	}

	protected void entityInit()
	{
		super.entityInit();
		//this.dataWatcher.addObject(22, new Integer(0));
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	public boolean attackEntityAsMob(Entity par1Entity)
	{
		float Damage = 0F;
		if (this.worldObj.difficultySetting.getDifficultyId() == 1) {
			Damage = 33F;
		} else if (this.worldObj.difficultySetting.getDifficultyId() == 2) {
			Damage = 22F;
		} else if (this.worldObj.difficultySetting.getDifficultyId() == 3) {
			Damage = 17F;
		} else {
			Damage = 20F;
		}
		boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), Damage);
		//boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 22F);
		//this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
		return flag;
	}

	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	@Override
	public boolean getCanSpawnHere()
	{
		return this.worldObj.difficultySetting.getDifficultyId() > 0 && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (!this.worldObj.isRemote && this.worldObj.difficultySetting.getDifficultyId() < 1)
		{
			this.setDead();
		}
	}

	/**
	 * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
	 */
	@Override
	public int getTotalArmorValue()
	{
		return 4;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return Halocraft.MODID+":mob.elite.EliteLiving";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return Halocraft.MODID+":mob.elite.EliteHurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return Halocraft.MODID+":mob.elite.EliteDeath";
	}

	@Override
	protected float getSoundVolume()
	{
		return 0.8F;
	}

	@Override
	protected boolean canDespawn()
	{
		return false;
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	@Override
	protected Item getDropItem()
	{
		return HalocraftItems.PurpleMetalPlate;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
		int i = rand.nextInt(2 + par2);

		for (int j = 0; j < i; j++)
		{
			dropItem(HalocraftItems.PurpleMetalPlate, 1);
		}

		i = rand.nextInt(2 + par2);

		for (int k = 0; k < i; k++)
		{
			dropItem(HalocraftItems.EliteMeat, 1);
		}

		i = rand.nextInt(2 + par2);

		for (int l = 0; l < i; l++)
		{
			dropItem(HalocraftItems.SwordHilt, 1);
		}
	}

	@Override
	protected void dropRareDrop(int par1)
	{
		switch (rand.nextInt(4))
		{
		case 0:
			dropItem(HalocraftItemsWeapons.Magnum, 1);
			break;

		case 1:
		{
			int chance = rand.nextInt(4);
			if (chance == 0) {
				dropItem(HalocraftItemsArmor.MarkVHelmetBlack, 1);
			}
			else if (chance == 1) {
				dropItem(HalocraftItemsArmor.MarkVHelmetGreen, 1);
			}
			else if (chance == 2) {
				dropItem(HalocraftItemsArmor.MarkVHelmetBlue, 1);
			}
			else if (chance == 3) {
				dropItem(HalocraftItemsArmor.MarkVHelmetRed, 1);
			}
			break;
		}
		case 2:
			dropItem(HalocraftItemsWeapons.PlasmaGrenade, 1);
			break;

		case 3:
			dropItem(HalocraftItemsWeapons.FirebombGrenade, 1);
			break;
		}
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItem()
	{
		return defaultHeldItem;
	}
}