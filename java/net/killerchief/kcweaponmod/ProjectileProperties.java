package net.killerchief.kcweaponmod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import cpw.mods.fml.common.registry.GameRegistry;

public class ProjectileProperties {

	public static void callTags(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{// nxtLvl split multiTags tagcall
		if (args != null)
		{
			if (args instanceof Object[])
			{
				for (Object arg : (Object[])args)
				{
					KCUtils.CallPropertyParts(projectile, collidedObject, arg);
				}
			}
			else
			{
				KCUtils.CallPropertyParts(projectile, collidedObject, args);
			}
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to callTags function is null!");
		}
	}

	public static void Die(EntityProjectile projectile, MovingObjectPosition collidedObject)
	{
		//System.out.println("Die");
		if (!projectile.worldObj.isRemote)
		{
			projectile.setDead();
		}
		projectile.tagLoopExitBreakout = true;
	}

	public static void Explode(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (args.length >= 2 && args[0] instanceof String)
		{
			if (!projectile.worldObj.isRemote)
			{
				projectile.worldObj.createExplosion(projectile, projectile.posX, projectile.posY, projectile.posZ, Float.parseFloat(args[0].toString()), KCWeaponMod.ExplosionBlockDamage);
			}
			KCUtils.CallPropertyParts(projectile, collidedObject, args[1]);
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to Explode function is invalid!");
		}
	}

	public static Object[] initImpactBlock(Object[] input)
	{
		//System.out.println("init impact block: "+input.length);
		if (input != null && input.length >= 2 & input[0] instanceof String && input[1] instanceof String)
		{
			Object[] output = new Object[3];
			output[0] = GetBlocksFromString(((String)input[0]).split("\\+"));//ignoreBlocks
			output[1] = GetBlocksFromString(((String)input[1]).split("\\+"));//destroyBlocks
			output[2] = input[2];
			return output;
		}
		System.err.println("ERROR: \"initImpactBlock\" input arguments are not valid! \n"+input);
		return input;
	}

	public static Block[] GetBlocksFromString(String[] input)
	{
		List<Block> blocks = new ArrayList<Block>();
		for (Object arg : input)
		{
			String[] block = arg.toString().split(":");
			if (block.length == 1)
			{
				Block b = Block.getBlockFromName(block[0]);
				if (b != null)
					blocks.add(b);
				else
					System.err.println("ERROR: Failed to find block with name: "+block[0]);
			}
			else if (block.length > 1)
			{
				Block b = GameRegistry.findBlock(block[0], block[1]);
				if (b != null)
					blocks.add(b);
				else
					System.err.println("ERROR: Failed to find block with name: "+block[0]+":"+block[1]);
			}
		}
		return blocks.toArray(new Block[blocks.size()]);
	}

	public static Item[] GetItemsFromString(String[] input)
	{
		List<Item> items = new ArrayList<Item>();
		for (Object arg : input)
		{
			String[] item = arg.toString().split(":");
			if (item.length == 1)
			{
				Item i = GameRegistry.findItem("minecraft", item[0]);
				if (i != null)
					items.add(i);
				else
					System.err.println("ERROR: Failed to find item with name: "+item[0]);
			}
			else if (item.length > 1)
			{
				Item i = GameRegistry.findItem(item[0], item[1]);
				if (i != null)
					items.add(i);
				else
					System.err.println("ERROR: Failed to find item with name: "+item[0]+":"+item[1]);
			}
		}
		return items.toArray(new Item[items.size()]);
	}

	/** Takes 3 Object arguments: 1=What blocks to ignore, 2=What blocks to destroy, 3=What to do when destroyed a block */
	public static void ImpactBlock(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (collidedObject.entityHit == null)
		{
			if (args.length == 1 && args[0] instanceof Object[])//Repeated in caller.
			{
				args = (Object[])args[0];
			}
			//System.out.println("Block Impact");
			//projectile.xTile = collidedObject.blockX;
			//projectile.yTile = collidedObject.blockY;
			//projectile.zTile = collidedObject.blockZ;
			Block inTile = projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ);
			if (args.length >= 3 && args[0] instanceof Block[] && args[1] instanceof Block[])
			{
				for (Block block : (Block[])args[0])
				{
					if (inTile == block)
					{
						//Do Nothing and Exit completely
						projectile.tagLoopExitBreakout = true;
						return;
					}
				}
				for (Block block : (Block[])args[1])
				{
					if (inTile == block)
					{
						if (!projectile.worldObj.isRemote && KCWeaponMod.ExplosionBlockDamage)
						{
							if (inTile == Blocks.double_plant && projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY-1, collidedObject.blockZ) == Blocks.double_plant)
							{
								projectile.worldObj.func_147480_a(collidedObject.blockX, collidedObject.blockY-1, collidedObject.blockZ, false);//destroyBlock
							}
							projectile.worldObj.func_147480_a(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ, false);//destroyBlock
							//Minecraft.getMinecraft().sndManager.playSound(block.stepSound.getBreakSound(), (float)collidedObject.blockX + 0.5F, (float)collidedObject.blockY + 0.5F, (float)collidedObject.blockZ + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
						}
						//System.out.println(args[2]);
						//Die or continue without consequence here
						KCUtils.CallPropertyParts(projectile, collidedObject, args[2]);
						break;
					}
				}
			}
			else
			{
				//Unknown Arguments
				System.err.println("ERROR: Method \"ImpactBlock\" was passed invalid Object arguments: "+args);
				KCUtils.CallPropertyParts(projectile, collidedObject, "Die");
			}
		}
		//else //return as it actually hit something else
	}

	public static void ImpactEntity(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (args.length >= 3 && args[0] instanceof String && args[1] instanceof String)
		{
			if (collidedObject.entityHit != null)
			{
				if (collidedObject.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(projectile, projectile.thrower), (projectile.ticksExisted >= projectile.MaxEffectiveTicksAlive ? (Integer.parseInt(args[0].toString())/2) : Integer.parseInt(args[0].toString()))))
				{
					collidedObject.entityHit.hurtResistantTime = Integer.parseInt(args[1].toString());
					collidedObject.entityHit.motionY -= 0.3;
				}
				//worldObj.playSoundAtEntity(this, "BulletHit", 0.8F, 1.0F);
				KCUtils.CallPropertyParts(projectile, collidedObject, args[2]);
			}
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to HurtStuck function is invalid!");
		}
	}

	public static void StickEntity(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (collidedObject.entityHit != null)
		{
			projectile.stuckEntity = collidedObject.entityHit;
			KCUtils.CallPropertyParts(projectile, collidedObject, args);
		}
	}

	public static void HurtStuck(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (args.length >= 3 && args[0] instanceof String && args[1] instanceof String)
		{
			if (projectile.stuckEntity != null)
			{
				if (projectile.stuckEntity.attackEntityFrom(DamageSource.causeThrownDamage(projectile, projectile.thrower), Integer.parseInt(args[0].toString())))
				{
					projectile.stuckEntity.hurtResistantTime = Integer.parseInt(args[1].toString());
					projectile.stuckEntity.motionY -= 0.3;
				}
				KCUtils.CallPropertyParts(projectile, collidedObject, args[2]);
			}
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to HurtStuck function is invalid!");
		}
	}

	public static void PlaySound(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (args.length >= 3 && args[0] instanceof String && args[1] instanceof String)
		{
			float volume = 1F;
			if (Float.parseFloat(args[0].toString()) > 0)
			{
				if (Math.sqrt((projectile.prevMotionX * projectile.prevMotionX) + (projectile.prevMotionY * projectile.prevMotionY) + (projectile.prevMotionZ * projectile.prevMotionZ)) > 0.04D)
				{
					volume = Float.parseFloat(args[0].toString()) * (float)Math.sqrt((projectile.prevMotionX * projectile.prevMotionX) + (projectile.prevMotionY * projectile.prevMotionY) + (projectile.prevMotionZ * projectile.prevMotionZ));
				}
				else
				{
					volume = 0F;
				}
			}
			projectile.worldObj.playSoundAtEntity(projectile, args[1].toString(), volume, 1.0F);
			KCUtils.CallPropertyParts(projectile, collidedObject, args[2]);
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to PlaySound function is invalid!");
		}
	}

	public static void Bounce(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (collidedObject.typeOfHit == MovingObjectPosition.MovingObjectType.MISS)
			return;
		if (args.length >= 3 && args[0] instanceof String && args[1] instanceof String)
		{
			if (collidedObject.entityHit == null)
			{
				double bounceFactor = Double.parseDouble(args[0].toString());
				double ricochetFactor = Double.parseDouble(args[1].toString());

				projectile.motionX *= bounceFactor;
				projectile.motionY *= bounceFactor;
				projectile.motionZ *= bounceFactor;

				if (collidedObject.sideHit == 0 || collidedObject.sideHit == 1)
				{
					if (ricochetFactor < 0 || Math.abs(projectile.motionY) * ricochetFactor < Math.abs(projectile.motionX) + Math.abs(projectile.motionZ))
					{
						projectile.motionY *= -1;
					}
				}
				else if (collidedObject.sideHit == 2 || collidedObject.sideHit == 3)
				{
					if (ricochetFactor < 0 || Math.abs(projectile.motionZ) * ricochetFactor < Math.abs(projectile.motionX) + Math.abs(projectile.motionY))
					{
						projectile.motionZ *= -1;
					}
				}
				else if (collidedObject.sideHit == 4 || collidedObject.sideHit == 5)
				{
					if (ricochetFactor < 0 || Math.abs(projectile.motionX) * ricochetFactor < Math.abs(projectile.motionY) + Math.abs(projectile.motionZ))
					{
						projectile.motionX *= -1;
					}
				}
				else
				{
					projectile.motionX *= bounceFactor;
					projectile.motionY *= bounceFactor;
					projectile.motionZ *= bounceFactor;
				}
				++projectile.EncounteredEntities;

				KCUtils.CallPropertyParts(projectile, collidedObject, args[2]);
			}
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to Bounce function is invalid!");
		}
	}

	public static void ExceededMaxEncounteredEntities(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{//Increment for other collision types!
		if (args.length >= 2 && args[0] instanceof String)
		{
			if (projectile.EncounteredEntities > Integer.parseInt(args[0].toString()))
			{
				KCUtils.CallPropertyParts(projectile, collidedObject, args[1]);
			}
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to ExcededEncounteredEntities function is invalid!");
		}
	}

	public static void StartFuse(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (args.length >= 2 && args[0] instanceof String)
		{
			if (projectile.Fuse <= 0)
			{
				projectile.Fuse = Integer.parseInt(args[0].toString());
			}
			KCUtils.CallPropertyParts(projectile, collidedObject, args[1]);
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Object Passed to StartFuse function is invalid!");
		}
	}

	public static void Fuse(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (projectile.Fuse > 0)
		{
			if (projectile.Fuse == 1)
			{
				KCUtils.CallPropertyParts(projectile, collidedObject, args);
			}
			--projectile.Fuse;
		}
		//System.out.println("Fuse Continue");
	}

	/** Takes [1]: Remaining time an entity will be "immune" to further damage after being hurt. */
	public static void SetEntityHurtResistantTime(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (collidedObject.entityHit != null)
		{
			if (args.length >= 2 && args[0] instanceof String)
			{
				collidedObject.entityHit.hurtResistantTime = Integer.parseInt(args[0].toString());
				KCUtils.CallPropertyParts(projectile, collidedObject, args[1]);
			}
			else
			{
				System.err.println("KCWeaponMod - ERROR: Object Passed to SetEntityHurtResistantTime function is invalid!");
			}
		}
	}

	/** Takes [1]: Sets entity to burn for x amount of seconds. */
	public static void SetEntityOnFire(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (collidedObject.entityHit != null)
		{
			if (args.length >= 2 && args[0] instanceof String)
			{
				collidedObject.entityHit.setFire(Integer.parseInt(args[0].toString()));
				KCUtils.CallPropertyParts(projectile, collidedObject, args[1]);
			}
			else
			{
				System.err.println("KCWeaponMod - ERROR: Object Passed to SetEntityOnFire function is invalid!");
			}
		}
	}

	public static void IsInLiquid(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (projectile.isInWater())//TODO: Lava & other check
		{
			KCUtils.CallPropertyParts(projectile, collidedObject, args);
		}
	}
}
