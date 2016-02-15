package net.killerchief.halocraft.entities;

import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.world.World;

public class EntityFlameQuickFX extends EntityFlameFX {

	public EntityFlameQuickFX(World world, double posx, double posy, double posz, double motionx, double motiony, double motionz) {
		super(world, posx, posy, posz, motionx, motiony, motionz);
		this.particleMaxAge = world.rand.nextInt(4) + 4;
	}

}
