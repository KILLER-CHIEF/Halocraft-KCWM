package net.killerchief.halocraft.entities.mobs;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class EntityHalocraftMob extends EntityMob {

	public static Class[] mobKillList = {EntityPlayer.class, EntityVillager.class, 
		EntityZombie.class, EntityCreeper.class, EntitySpider.class, EntityCaveSpider.class, 
		EntityEnderman.class, EntityWolf.class, EntityPigZombie.class, EntitySilverfish.class, 
		EntityBlaze.class, EntitySkeleton.class};

	public static Class[] mobWatchList = {EntityPlayer.class, EntityChicken.class, 
		EntityCow.class, EntityOcelot.class, EntitySheep.class, EntitySlime.class, 
		EntityMagmaCube.class, EntityPig.class, EntitySnowman.class, EntityIronGolem.class, 
		EntityCreeper.class, EntityEliteSword.class, EntityEliteCarbine.class, EntityElitePlasmaRifle.class, 
		EntityGruntPlasmaPistol.class};

	public EntityHalocraftMob(World par1World) {
		super(par1World);
	}
}