package net.killerchief.halocraft.entities.mobs;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
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
import net.minecraft.world.World;

public class EntityGruntBase extends EntityHalocraftMob {

	public EntityGruntBase(World par1World) {
		super(par1World);
	}
	
	protected void initAIRangedTasks(double movementSpeed, double runSpeed, EntityAIBase shootAttack)
	{
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(false);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, shootAttack);
		for (int i = 0; i < mobKillList.length; i++) {
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, mobKillList[i], runSpeed, false));
		}
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, movementSpeed));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, runSpeed, false));
		this.tasks.addTask(6, new EntityAIWander(this, movementSpeed));
		for (int i = 0; i < mobWatchList.length; i++) {
			this.tasks.addTask(7, new EntityAIWatchClosest(this, mobWatchList[i], 8F));
		}
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		for (int i = 0; i < mobKillList.length; i++) {
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, mobKillList[i], 0, true));
		}
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
		//this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.699999988079071D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(100.0D);
	}

	protected void entityInit()
	{
		super.entityInit();
		//this.dataWatcher.addObject(22, (byte)0);
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	protected boolean isAIEnabled()
	{
		return true;
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
		return Halocraft.MODID+":mob.grunt.GruntLiving";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return Halocraft.MODID+":mob.grunt.GruntHurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return Halocraft.MODID+":mob.grunt.GruntDeath";
	}

	@Override
	protected float getSoundVolume()
	{
		return 0.7F;
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
			dropItem(HalocraftItemsWeapons.PlasmaGrenade, 1);
		}

		i = rand.nextInt(2 + par2);

		for (int l = 0; l < i; l++)
		{
			if (this.getEquipmentInSlot(0) != null && this.getEquipmentInSlot(0).getItem() != null)
			{
				Item item = this.getEquipmentInSlot(0).getItem();
				if (item == HalocraftItemsWeapons.EnergySword)
					item = HalocraftItems.SwordHilt;
				this.entityDropItem(new ItemStack(item, 1, item.isDamageable() ? (int)(item.getMaxDamage()/(1.5 + this.rand.nextDouble()/2)) : 0), 0F);
			}
		}
	}

	@Override
	protected void dropRareDrop(int par1)
	{
		switch (rand.nextInt(3))
		{
		case 0:
			this.entityDropItem(new ItemStack(HalocraftItemsWeapons.Magnum, 1, (int)(HalocraftItemsWeapons.Magnum.getMaxDamage()/(1 + this.rand.nextDouble()/2))), 0F);
			break;

		case 1:
		{
			int chance = rand.nextInt(4);
			if (chance == 0)
				this.entityDropItem(new ItemStack(HalocraftItemsArmor.MarkVBootsBlack, 1, (int)(HalocraftItemsArmor.MarkVBootsBlack.getMaxDamage()/(1 + this.rand.nextDouble()/2))), 0F);
			else if (chance == 1)
				this.entityDropItem(new ItemStack(HalocraftItemsArmor.MarkVBootsGreen, 1, (int)(HalocraftItemsArmor.MarkVBootsGreen.getMaxDamage()/(1 + this.rand.nextDouble()/2))), 0F);
			else if (chance == 2)
				this.entityDropItem(new ItemStack(HalocraftItemsArmor.MarkVBootsBlue, 1, (int)(HalocraftItemsArmor.MarkVBootsBlue.getMaxDamage()/(1 + this.rand.nextDouble()/2))), 0F);
			else if (chance == 3)
				this.entityDropItem(new ItemStack(HalocraftItemsArmor.MarkVBootsRed, 1, (int)(HalocraftItemsArmor.MarkVBootsRed.getMaxDamage()/(1 + this.rand.nextDouble()/2))), 0F);
			break;
		}
		case 2:
			dropItem(HalocraftItemsWeapons.PlasmaGrenade, 1);
			break;
		}
	}
}
