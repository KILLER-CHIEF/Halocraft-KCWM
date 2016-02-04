package net.killerchief.halocraft.entities;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityLightBridgeFX extends EntityGravityLiftFX {

	public EntityLightBridgeFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
		this(par1World, par2, par4, par6, par8, par10, par12, 1.0F);
	}

	public EntityLightBridgeFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12, float par14) {
		super(par1World, par2, par4, par6, par8, par10, par12, par14);
		texture = new ResourceLocation(Halocraft.MODID+":textures/particleFX/LightBridgeFX.png");
		particleRed = 0.9F;
		particleGreen = 0.9F;
		particleBlue = 0.9F;
	}

}
