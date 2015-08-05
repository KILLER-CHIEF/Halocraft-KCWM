package net.killerchief.halocraft.entities.mobs;

import java.lang.reflect.InvocationTargetException;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityElitePlasmaRifle extends EntityEliteBase implements IRangedAttackMob
{
	private double movementSpeed = 0.3D;
	private double runSpeed = 0.4D;

	public EntityElitePlasmaRifle(World par1World)
	{
		super(par1World);
		this.setSize(0.6F, 1.9F);
		//EntityAIShootAttack(Mob, MoveSpeed, ShootSpeed, WithinDistanceToShoot)
		this.initAIRangedTasks(this.movementSpeed, this.runSpeed, new EntityAIShootAttack(this, this.runSpeed, 6, 40F));

		if (!this.worldObj.isRemote)
			this.setCurrentItemOrArmor(0, new ItemStack(HalocraftItemsWeapons.PlasmaRifle));
	}

	/**
	 * Attack the specified entity using a ranged attack.
	 */
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float par2)
	{
		int BulletDamage = 1 + (int)(this.worldObj.difficultySetting.getDifficultyId() * 1.5);//Player's Gun Damage: 5
		EntityCustomProjectileHelper.ProjPropElitePlasmaRifle.ProjImpactActArgs = new Object[]{EntityCustomProjectileHelper.ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{Integer.toString(BulletDamage), "0", "Die"}}};
		this.playSound(Halocraft.MODID+":weapons.shoot.PlasmaRifleShoot", 1.0F, 1.0F);

		double varX = target.posX + target.motionX - this.posX;
		double varY = target.posY + (double)target.getEyeHeight() - 1.100000023841858D - this.posY;
		double varZ = target.posZ + target.motionZ - this.posZ;

		try {
			Entity projectile = ((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[EntityCustomProjectileHelper.ProjPropElitePlasmaRifle.ProjectileID]).getConstructor(World.class, EntityLivingBase.class, EntityLivingBase.class, int.class, String.class).newInstance(this.worldObj, this, target, -1, "net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper.ProjPropElitePlasmaRifle");
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
}