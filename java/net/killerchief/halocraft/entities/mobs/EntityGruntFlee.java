package net.killerchief.halocraft.entities.mobs;

import net.killerchief.kcweaponmod.ItemWeapon;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityGruntFlee extends EntityGruntBase {

	private double movementSpeed = 0.3D;
	private double fleeSpeed = 0.4D;
	private double runSpeed = 0.5D;
	
	public EntityGruntFlee(World par1World) {
		super(par1World);
		this.setSize(0.6F, 1.9F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0F, this.fleeSpeed, this.runSpeed));
        this.tasks.addTask(2, new EntityAIPanic(this, this.runSpeed));
        this.tasks.addTask(3, new EntityAIWander(this, this.movementSpeed));
        for (int i = 0; i < mobWatchList.length; i++)
        	this.tasks.addTask(4, new EntityAIWatchClosest(this, mobWatchList[i], 6.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
	}
	
	public EntityGruntFlee(World par1World, ItemStack helditem) {
		super(par1World);
		this.setSize(0.6F, 1.9F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0F, this.fleeSpeed, this.runSpeed));
        this.tasks.addTask(2, new EntityAIPanic(this, this.runSpeed));
        this.tasks.addTask(3, new EntityAIWander(this, this.movementSpeed));
        for (int i = 0; i < mobWatchList.length; i++)
        	this.tasks.addTask(4, new EntityAIWatchClosest(this, mobWatchList[i], 6.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        
        if (!this.worldObj.isRemote)
			this.setCurrentItemOrArmor(0, helditem);
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
			EntityGruntPlasmaPistol entity = new EntityGruntPlasmaPistol(this.worldObj, this.getEquipmentInSlot(0));
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
	}
}
