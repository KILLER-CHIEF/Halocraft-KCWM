package net.killerchief.halocraft.entities.mobs;

import java.lang.reflect.InvocationTargetException;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.IRangedAttackMob;
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
import net.minecraft.world.World;

public class EntityGruntPlasmaPistol extends EntityHalocraftMob implements IRangedAttackMob
{
	/** The ItemStack the Grunt Holds. */
	private static final ItemStack defaultHeldItem = new ItemStack(HalocraftItemsWeapons.PlasmaPistol, 1);

	private double movementSpeed = 0.3D;
	private double runSpeed = 0.3D;

	public EntityGruntPlasmaPistol(World par1World)
	{
		super(par1World);
		this.setSize(0.7F, 1.6F);
		getNavigator().setBreakDoors(true);
		getNavigator().setAvoidsWater(false);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIBreakDoor(this));
		tasks.addTask(2, new EntityAIShootAttack(this, this.runSpeed, 12, 30F)); //(Mob, MoveSpeed, ShootSpeed, WithinDistanceToShoot)
		for (int i = 0; i < mobKillList.length; i++) {
			tasks.addTask(3, new EntityAIAttackOnCollide(this, mobKillList[i], this.runSpeed, false));
		}
		tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.movementSpeed));
		tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.runSpeed, false));
		tasks.addTask(6, new EntityAIWander(this, this.movementSpeed));
		for (int i = 0; i < mobWatchList.length; i++) {
			tasks.addTask(7, new EntityAIWatchClosest(this, mobWatchList[i], 8F));
		}
		tasks.addTask(7, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		for (int i = 0; i < mobKillList.length; i++) {
			targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, mobKillList[i], 0, true));
		}
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(26.0D);
		//this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.699999988079071D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
	}

	/**
	 * Attack the specified entity using a ranged attack.
	 */
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float par2)
	{
		int BulletDamage = 0 + (int)(this.worldObj.difficultySetting.getDifficultyId() * 1.5);//Player's Gun Damage: 3
		EntityCustomProjectileHelper.ProjPropGruntPlasmaPistol.ProjImpactActArgs = new Object[]{EntityCustomProjectileHelper.ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{Integer.toString(BulletDamage), "0", "Die"}}};
		this.playSound(Halocraft.MODID+":weapons.shoot.PlasmaPistolShoot", 1.0F, 1.0F);

		double varX = target.posX + target.motionX - this.posX;
		double varY = target.posY + (double)target.getEyeHeight() - 1.100000023841858D - this.posY;
		double varZ = target.posZ + target.motionZ - this.posZ;
		
		try {
			Entity projectile = ((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[EntityCustomProjectileHelper.ProjPropGruntPlasmaPistol.ProjectileID]).getConstructor(World.class, EntityLivingBase.class, int.class, String.class).newInstance(this.worldObj, this, -1, "net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper.ProjPropGruntPlasmaPistol");
			if (projectile instanceof IProjectile)
				((IProjectile) projectile).setThrowableHeading(varX, varY, varZ, EntityCustomProjectileHelper.ProjPropElitePlasmaRifle.ProjectileSpeed, EntityCustomProjectileHelper.ProjPropElitePlasmaRifle.Accuracy);
			this.worldObj.spawnEntityInWorld(projectile);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
	 * Returns true if the newer Entity AI code should be run
	 */
	@Override
	protected boolean isAIEnabled()
	{
		return true;
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

	/*/**
	 * Plays step sound at given x, y, z for the entity
	 */
	/*protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.skeleton.step", 0.15F, 1.0F);
    }*/

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
			dropItem(HalocraftItemsWeapons.PlasmaPistol, 1);
		}
	}

	@Override
	protected void dropRareDrop(int par1)
	{
		switch (rand.nextInt(3))
		{
		case 0:
			dropItem(HalocraftItemsWeapons.Magnum, 1);
			break;

		case 1:
		{
			int chance = rand.nextInt(4);
			if (chance == 0) {
				dropItem(HalocraftItemsArmor.MarkVBootsBlack, 1);
			}
			else if (chance == 1) {
				dropItem(HalocraftItemsArmor.MarkVBootsGreen, 1);
			}
			else if (chance == 2) {
				dropItem(HalocraftItemsArmor.MarkVBootsBlue, 1);
			}
			else if (chance == 3) {
				dropItem(HalocraftItemsArmor.MarkVBootsRed, 1);
			}
			break;
		}
		case 2:
			dropItem(HalocraftItemsWeapons.PlasmaGrenade, 1);
			break;

			//case 3:
			//	dropItem(Halocraft.FirebombGrenade, 1);
			//	break;
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
