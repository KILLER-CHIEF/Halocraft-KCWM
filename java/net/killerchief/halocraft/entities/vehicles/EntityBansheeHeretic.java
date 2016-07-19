package net.killerchief.halocraft.entities.vehicles;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBansheeHeretic extends EntityBanshee {

	public EntityBansheeHeretic(World par1World) {
		super(par1World);
		TextureBase0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecovery.png");
		TextureBaseOn0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryOn.png");
		TextureTop0 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryTop.png");
		TextureBase1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryDamaged1.png");
		TextureBaseOn1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryDamaged1On.png");
		TextureTop1 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryTopDamaged1.png");
		TextureBase2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryDamaged2.png");
		TextureBaseOn2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryDamaged2On.png");
		TextureTop2 = new ResourceLocation(Halocraft.MODID+":textures/entities/banshee/heretic/SkinBansheeRecoveryTopDamaged2.png");
	}

	public EntityBansheeHeretic(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
	}

}
