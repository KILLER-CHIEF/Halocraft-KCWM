package net.killerchief.halocraft.entities.mobs;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityEliteSword extends EntityEliteBase
{
	private double movementSpeed = 0.3D;
	private double runSpeed = 0.5D;

	public EntityEliteSword(World par1World)
	{
		super(par1World);
		//this.setAIMoveSpeed((float)this.movementSpeed);
		this.setSize(0.6F, 1.9F);
		this.initAIMeleeTasks(this.movementSpeed, this.runSpeed);

		if (!this.worldObj.isRemote)
			this.setCurrentItemOrArmor(0, new ItemStack(HalocraftItems.SwordHilt));
	}

	public EntityEliteSword(World par1World, ItemStack helditem)
	{
		super(par1World);
		//this.setAIMoveSpeed((float)this.movementSpeed);
		this.setSize(0.6F, 1.9F);
		this.initAIMeleeTasks(this.movementSpeed, this.runSpeed);

		if (!this.worldObj.isRemote)
			this.setCurrentItemOrArmor(0, helditem);
	}

	@Override
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
		boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), this.getEquipmentInSlot(0) != null && this.getEquipmentInSlot(0).getItem() == HalocraftItemsWeapons.EnergySword ? Damage : Damage/6);
		//boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 22F);
		//this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
		return flag;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (this.getEquipmentInSlot(0) != null && this.getEquipmentInSlot(0).getItem() != null && this.getEquipmentInSlot(0).getItem() instanceof ItemWeapon)
		{
			EntityEliteCarbine entity = new EntityEliteCarbine(this.worldObj, this.getEquipmentInSlot(0));
			entity.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
			entity.setTarget(this.getAttackTarget());
			entity.setHealth(this.getHealth());
			if (!this.worldObj.isRemote)
			{
				this.worldObj.spawnEntityInWorld(entity);
				this.setDead();
			}
			return;
		}

		//System.out.println(this.attackTime);

		if (!this.worldObj.isRemote)
		{
			if (this.getAttackTarget() != null)
			{
				this.attackTime = 100;
			}
			if (this.attackTime > 0)
			{
				this.attackTime--;
			}

			if (this.getAttackTarget() == null && this.attackTime <= 0 && this.getEquipmentInSlot(0) != null && this.getEquipmentInSlot(0).getItem() != null && this.getEquipmentInSlot(0).getItem() == HalocraftItemsWeapons.EnergySword)
			{
				this.setCurrentItemOrArmor(0, new ItemStack(HalocraftItems.SwordHilt));
				this.playSound(Halocraft.MODID+":weapons.EnergySwordDeactivate", 0.8F, 1.0F);
			}
			else if (this.getAttackTarget() != null && this.getEquipmentInSlot(0) != null && this.getEquipmentInSlot(0).getItem() == HalocraftItems.SwordHilt)
			{
				this.setCurrentItemOrArmor(0, new ItemStack(HalocraftItemsWeapons.EnergySword));
				this.playSound(Halocraft.MODID+":weapons.EnergySwordEquip", 0.3F, 1.0F);
			}
		}
	}
}