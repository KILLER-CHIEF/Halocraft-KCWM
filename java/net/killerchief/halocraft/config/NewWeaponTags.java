package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.kcweaponmod.EntityProjectile;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class NewWeaponTags {
	
	private static void explodeWithEntity(EntityProjectile projectile, boolean allDirections, int entity, double speed)//TODO: Complete.
	{
		if (allDirections)
		{
			for (int sequence = 0; sequence < 8; sequence++)
			{
				String f1 = Integer.toBinaryString(sequence);
				char[] f2 = f1.length() == 1 ? ("00"+f1).toCharArray() : (f1.length() == 2 ? ("0"+f1).toCharArray() : f1.toCharArray());
				int[] bin = {f2[0] == '0'?-1:1, f2[1] == '0'?-1:1, f2[2] == '0'?-1:1};

				double x1 = (bin[0]*(projectile.worldObj.rand.nextDouble()/10) + projectile.motionX)*speed;
				double y1 = (bin[1]*(projectile.worldObj.rand.nextDouble()/10) + projectile.motionY)*speed;
				double z1 = (bin[2]*(projectile.worldObj.rand.nextDouble()/10) + projectile.motionZ)*speed;

				//System.out.println((sequence+1)+":"+x1+"|"+y1+"-|"+z1);
				if (entity == 1) {
					float gravity = 0.004F;
					float bulletSpeed = 0.5F;
					int damage = 4;
					int maxEffectiveDistance = 60;
					byte projectileType = 4;
					//this.worldObj.spawnEntityInWorld(new EntityParticleFire(this.worldObj, this.posX, this.posY + 0.2D, this.posZ, x1, y1, z1, this.thrower, gravity, bulletSpeed, damage, maxEffectiveDistance, projectileType));
				} else if (entity == 2) {
					//Spike Needles
				} else if (entity == 3) {
					//Halocraft.proxy.ParticleFX(1, this.worldObj, this.posX, this.posY + 0.2D, this.posZ, x1, y1, z1);
				} else if (entity == 4) {
					projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY + 0.2D, projectile.posZ, x1, y1, z1);
				} else if (entity == 5) {
					projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY + 0.2D, projectile.posZ, x1, y1, z1);
				}
			}
		}
		else
		{
			System.out.println("Spike Grenade Spikes");
			//Backward and some forward
		}
	}
	public static void ParticleFXFire(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)//TODO
	{
		if (projectile.worldObj.isRemote)
		{
			projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY + 0.2D, projectile.posZ, (double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionX/5, (double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionY/5, (double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionZ/5);
			projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY + 0.2D, projectile.posZ, -((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionX/5, -((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionY/5, -((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionZ/5);
			projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY + 0.2D, projectile.posZ, (double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionX/5, -(double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionY/5, (double)projectile.worldObj.rand.nextInt(2)/25 + projectile.motionZ/5);
			projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY + 0.2D, projectile.posZ, -((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionX/5, ((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionY/5, -((double)projectile.worldObj.rand.nextInt(2)/25) + projectile.motionZ/5);
		}
	}
	public static void ParticleFXFlame(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)//TODO
	{
		if (projectile.worldObj.isRemote)
		{
			explodeWithEntity(projectile, true, 4, 0.5D);
			explodeWithEntity(projectile, true, 5, 0.5D);
		}
	}
	public static void ParticleFXRocket(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)//TODO
	{
		if (projectile.worldObj.isRemote)
		{
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("flame", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
		}
	}
	public static void ParticleFX(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)//TODO
	{
		if (projectile.worldObj.isRemote)
		{
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
			projectile.worldObj.spawnParticle("smoke", projectile.posX, projectile.posY, projectile.posZ, 0.0D, 0.0D, 0.0D);
		}
		//System.out.println("Big Smoke Train");
		
		//fFIXME: Do Living Effects
		/*worldObj.spawnParticle("smoke", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
		worldObj.spawnParticle("flame", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
		this.explodeWithEntity(true, 4, 0.5D);
		if (Halocraft.proxy.isSideClient())
		{
			this.explodeWithEntity(true, 3, 1.0D);
		}*/
		
		//fFIXME: do Living stuff
		//System.out.println("alive");
		/*if (this.motionX < 0.01 && this.motionY < 0.01 && this.motionZ < 0.01 && this.motionX > -0.01 && this.motionY > -0.01 && this.motionZ > -0.01)
		{
			this.setDead();
		}
		this.explodeWithEntity(false, 2, 5.0D);
		this.explodeWithEntity(true, 1, 2.0D);
		this.worldObj.createExplosion(this, posX, posY, posZ, 4F, HalocraftConfig.ExplosionBlockDamage);
		this.setDead();
		*/
	}
	
	public static void onImpactFireParticle(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{//TODO: Make Modular (Place Different Blocks)
		if (collidedObject.entityHit == null)
		{
			//projectile.xTile = collidedObject.blockX;
			//projectile.yTile = collidedObject.blockY;
			//projectile.zTile = collidedObject.blockZ;
			int tileSide = collidedObject.sideHit;
			boolean notDead = true;
			boolean domoarfire = false;
			if (!projectile.worldObj.isRemote)//Put these elsewhere so client can predict movement = smoother. (put set block in own method)
			{
				if (tileSide == 0)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY - 1, collidedObject.blockZ) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY - 1, collidedObject.blockZ))
						{
							projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY - 1, collidedObject.blockZ, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionY = -0.01;
							projectile.posY = projectile.prevPosY;
							projectile.motionX *= 0.6;
							projectile.motionZ *= 0.6;
						}
					}
				}
				else if (tileSide == 1)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY + 1, collidedObject.blockZ) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY + 1, collidedObject.blockZ))
						{
							projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY + 1, collidedObject.blockZ, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionY = 0.01;
							projectile.posY = projectile.prevPosY;
							projectile.motionX *= 0.6;
							projectile.motionZ *= 0.6;
						}
					}
				}
				else if (tileSide == 2)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ - 1) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ - 1))
						{
							projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ - 1, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionZ = -0.01;
							projectile.posZ = projectile.prevPosZ;
							projectile.motionX *= 0.6;
							projectile.motionY *= 0.6;
						}
					}
				}
				else if (tileSide == 3)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ + 1) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ + 1))
						{
							projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ + 1, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionZ = 0.01;
							projectile.posZ = projectile.prevPosZ;
							projectile.motionX *= 0.6;
							projectile.motionY *= 0.6;
						}
					}
				}
				else if (tileSide == 4)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX - 1, collidedObject.blockY, collidedObject.blockZ) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX - 1, collidedObject.blockY, collidedObject.blockZ))
						{
							projectile.worldObj.setBlock(collidedObject.blockX - 1, collidedObject.blockY, collidedObject.blockZ, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionX = -0.01;
							projectile.posX = projectile.prevPosX;
							projectile.motionY *= 0.6;
							projectile.motionZ *= 0.6;
						}
					}
				}
				else if (tileSide == 5)
				{
					if (notDead && projectile.worldObj.getBlock(collidedObject.blockX + 1, collidedObject.blockY, collidedObject.blockZ) == Blocks.air)
					{
						if (Blocks.fire.canPlaceBlockAt(projectile.worldObj, collidedObject.blockX + 1, collidedObject.blockY, collidedObject.blockZ))
						{
							projectile.worldObj.setBlock(collidedObject.blockX + 1, collidedObject.blockY, collidedObject.blockZ, Blocks.fire);
							notDead = false;
						} else {
							projectile.motionX = 0.01;
							projectile.posX = projectile.prevPosX;
							projectile.motionY *= 0.6;
							projectile.motionZ *= 0.6;
						}
					}
				}
				else// if (tileSide == -1)
				{
					domoarfire = true;
					notDead = false;
					//System.out.println("-1");
				}
				//System.out.println("do");
				if (notDead)
				{
					if (isInsideBlocks(projectile.worldObj, collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ))
					{
						notDead = false;
						//System.out.println("inside");
					}
				}
				if (domoarfire)
				{
					//System.out.println("DoMoarFire");
					if (canPlaceFireBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY + 1, collidedObject.blockZ))
					{
						projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY + 1, collidedObject.blockZ, Blocks.fire);
						//System.out.println("Up");
					}
					else if (canPlaceFireBlockAt(projectile.worldObj, collidedObject.blockX + 1, collidedObject.blockY, collidedObject.blockZ))
					{
						projectile.worldObj.setBlock(collidedObject.blockX + 1, collidedObject.blockY, collidedObject.blockZ, Blocks.fire);
					}
					else if (canPlaceFireBlockAt(projectile.worldObj, collidedObject.blockX - 1, collidedObject.blockY, collidedObject.blockZ))
					{
						projectile.worldObj.setBlock(collidedObject.blockX - 1, collidedObject.blockY, collidedObject.blockZ, Blocks.fire);
					}
					else if (canPlaceFireBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ + 1))
					{
						projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ + 1, Blocks.fire);
					}
					else if (canPlaceFireBlockAt(projectile.worldObj, collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ - 1))
					{
						projectile.worldObj.setBlock(collidedObject.blockX, collidedObject.blockY, collidedObject.blockZ - 1, Blocks.fire);
					}
				}
				if (notDead == false)
				{
					//System.out.println("Died");
					projectile.setDead();
				}
			}
		}
	}
	
	/** Checks to see if its valid to put this fire block at the specified coordinates. Args: world, x, y, z */
    private static boolean canPlaceFireBlockAt(World world, int x, int y, int z)
    {
        return world.getBlock(x, y, z) == Blocks.fire || Blocks.fire.canPlaceBlockAt(world, x, y, z);
    }
    
    private static boolean isInsideBlocks(World world, int x, int y, int z)
    {
    	if (world.getBlock(x, y, z).isOpaqueCube() &&
    			world.getBlock(x+1, y, z).isOpaqueCube() && world.getBlock(x-1, y, z).isOpaqueCube() && 
    			world.getBlock(x, y+1, z).isOpaqueCube() && world.getBlock(x, y-1, z).isOpaqueCube() && 
    			world.getBlock(x, y, z+1).isOpaqueCube() && world.getBlock(x, y, z-1).isOpaqueCube())
    		return true;
    	else
    		return false;
    }
    
    public static void onImpactFirebomb(EntityProjectile projectile, MovingObjectPosition collidedObject, Object[] args)
	{
		if (!projectile.worldObj.isRemote)
		{
			if (collidedObject.entityHit != null)
			{
				if (collidedObject.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(projectile, projectile.thrower), 3))
				{
					collidedObject.entityHit.setFire(20);
					for (int x1 = -2; x1 < 1; x1++){
						for (int y1 = -2; y1 < 2; y1++){
							for (int z1 = -1; z1 < 2; z1++){
								for (int x2 = -2; x2 < 1; x2++){
									for (int y2 = -1; y2 < 2; y2++){
										if(projectile.worldObj.getBlock((int)projectile.posX + x1, (int)projectile.posY + y1, (int)projectile.posZ + z1) == Blocks.air || projectile.worldObj.getBlock((int)projectile.posX + x1, (int)projectile.posY + y1, (int)projectile.posZ + z1) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock((int)projectile.posX + x1, (int)projectile.posY + y1, (int)projectile.posZ + z1) == Blocks.snow_layer))
										{
											projectile.worldObj.setBlock((int)projectile.posX + x1, (int)projectile.posY + y1, (int)projectile.posZ + z1, Blocks.fire);
										}
										if(projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ - 2) == Blocks.air || projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ - 2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ - 2) == Blocks.snow_layer))
										{
											projectile.worldObj.setBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ - 2, Blocks.fire);
										}
										if(projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ + 2) == Blocks.air || projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ + 2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ + 2) == Blocks.snow_layer))
										{
											projectile.worldObj.setBlock((int)projectile.posX + x2, (int)projectile.posY + y1, (int)projectile.posZ + 2, Blocks.fire);
										}
										if(projectile.worldObj.getBlock((int)projectile.posX - 3, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.air || projectile.worldObj.getBlock((int)projectile.posX - 3, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock((int)projectile.posX - 3, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.snow_layer))
										{
											projectile.worldObj.setBlock((int)projectile.posX - 3, (int)projectile.posY + y1, (int)projectile.posZ + y2, Blocks.fire);
										}
										if(projectile.worldObj.getBlock((int)projectile.posX + 1, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.air || projectile.worldObj.getBlock((int)projectile.posX + 1, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock((int)projectile.posX + 1, (int)projectile.posY + y1, (int)projectile.posZ + y2) == Blocks.snow_layer))
										{
											projectile.worldObj.setBlock((int)projectile.posX + 1, (int)projectile.posY + y1, (int)projectile.posZ + y2, Blocks.fire);
										}
									}
								}
							}
						}
					}
				}
			}
			else
			{
				int xTile = collidedObject.blockX;
				int yTile = collidedObject.blockY;
				int zTile = collidedObject.blockZ;
				for (int x1 = -1; x1 < 2; x1++){
					for (int y1 = -1; y1 < 3; y1++){
						for (int z1 = -1; z1 < 2; z1++){
							for (int x2 = -1; x2 < 2; x2++){
								for (int y2 = -1; y2 < 2; y2++){
									if(projectile.worldObj.getBlock(xTile + x1, yTile + y1, zTile + z1) == Blocks.air || projectile.worldObj.getBlock(xTile + x1, yTile + y1, zTile + z1) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock(xTile + x1, yTile + y1, zTile + z1) == Blocks.snow_layer))
									{
										projectile.worldObj.setBlock(xTile + x1, yTile + y1, zTile + z1, Blocks.fire);
									}
									if(projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile - 2) == Blocks.air || projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile - 2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile - 2) == Blocks.snow_layer))
									{
										projectile.worldObj.setBlock(xTile + x2, yTile + y1, zTile - 2, Blocks.fire);
									}
									if(projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile + 2) == Blocks.air || projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile + 2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock(xTile + x2, yTile + y1, zTile + 2) == Blocks.snow_layer))
									{
										projectile.worldObj.setBlock(xTile + x2, yTile + y1, zTile + 2, Blocks.fire);
									}
									if(projectile.worldObj.getBlock(xTile - 2, yTile + y1, zTile + y2) == Blocks.air || projectile.worldObj.getBlock(xTile - 2, yTile + y1, zTile + y2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock(xTile - 2, yTile + y1, zTile + y2) == Blocks.snow_layer))
									{
										projectile.worldObj.setBlock(xTile - 2, yTile + y1, zTile + y2, Blocks.fire);
									}
									if(projectile.worldObj.getBlock(xTile + 2, yTile + y1, zTile + y2) == Blocks.air || projectile.worldObj.getBlock(xTile + 2, yTile + y1, zTile + y2) == Blocks.fire || (projectile.worldObj.rand.nextInt(30) == 1 && projectile.worldObj.getBlock(xTile + 2, yTile + y1, zTile + y2) == Blocks.snow_layer))
									{
										projectile.worldObj.setBlock(xTile + 2, yTile + y1, zTile + y2, Blocks.fire);
									}
								}
							}
						}
					}
				}
			}
		}
		projectile.worldObj.playSoundAtEntity(projectile, Halocraft.MODID+":weapons.FirebombExplode", 1.0F, 1.0F);
	}
	
}
