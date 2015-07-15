package net.killerchief.halocraft.client;

import net.killerchief.halocraft.CommonProxy;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.guns.ModelAssaultRifle;
import net.killerchief.halocraft.client.models.guns.ModelBattleRifle;
import net.killerchief.halocraft.client.models.guns.ModelBeamRifle;
import net.killerchief.halocraft.client.models.guns.ModelCarbine;
import net.killerchief.halocraft.client.models.guns.ModelDMR;
import net.killerchief.halocraft.client.models.guns.ModelEnergySword;
import net.killerchief.halocraft.client.models.guns.ModelFlamethrower;
import net.killerchief.halocraft.client.models.guns.ModelMagnum;
import net.killerchief.halocraft.client.models.guns.ModelMauler;
import net.killerchief.halocraft.client.models.guns.ModelNeedler;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaPistol;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaPistolOpen;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaRifle;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaRifleOpen;
import net.killerchief.halocraft.client.models.guns.ModelRocketLauncher;
import net.killerchief.halocraft.client.models.guns.ModelSMG;
import net.killerchief.halocraft.client.models.guns.ModelSentinelBeam;
import net.killerchief.halocraft.client.models.guns.ModelShotgun;
import net.killerchief.halocraft.client.models.guns.ModelSniperRifle;
import net.killerchief.halocraft.client.models.guns.ModelSpiker;
import net.killerchief.halocraft.client.models.mobs.ModelElite;
import net.killerchief.halocraft.client.models.mobs.ModelGrunt;
import net.killerchief.halocraft.client.render.RenderEliteGun;
import net.killerchief.halocraft.client.render.RenderEliteSword;
import net.killerchief.halocraft.client.render.RenderGhost;
import net.killerchief.halocraft.client.render.RenderGruntPlasmaPistol;
import net.killerchief.halocraft.client.render.RenderGun;
import net.killerchief.halocraft.client.render.RenderGunHolder;
import net.killerchief.halocraft.client.render.RenderHealthPack;
import net.killerchief.halocraft.client.render.RenderMongoose;
import net.killerchief.halocraft.client.render.RenderProjectile;
import net.killerchief.halocraft.client.render.RenderProjectile.EnumType;
import net.killerchief.halocraft.client.render.RenderWarthog;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.EntityDeployableGravityLift;
import net.killerchief.halocraft.entities.EntityGravityLiftFX;
import net.killerchief.halocraft.entities.mobs.EntityEliteCarbine;
import net.killerchief.halocraft.entities.mobs.EntityElitePlasmaRifle;
import net.killerchief.halocraft.entities.mobs.EntityEliteSword;
import net.killerchief.halocraft.entities.mobs.EntityGruntPlasmaPistol;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseBlue;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseDefault;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseGreen;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseRed;
import net.killerchief.halocraft.entities.vehicles.EntityVehicle;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.halocraft.entities.vehicles.MovingVehicleSoundLoop;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registers()
	{
		//KeyBindings.init();
	}

	public static int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEliteSword.class, new RenderEliteSword(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityEliteCarbine.class, new RenderEliteGun(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityElitePlasmaRifle.class, new RenderEliteGun(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGruntPlasmaPistol.class, new RenderGruntPlasmaPistol(new ModelGrunt(), 0.0F));
			
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.SniperRifle, (IItemRenderer)new RenderGun(new ModelSniperRifle(), Halocraft.MODID+":textures/guns/SkinSniperRifle.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.DMR, (IItemRenderer)new RenderGun(new ModelDMR(), Halocraft.MODID+":textures/guns/SkinDMR.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.PlasmaPistol, (IItemRenderer)new RenderGun(new ModelPlasmaPistol(), Halocraft.MODID+":textures/guns/SkinPlasmaPistol.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.PlasmaRifle, (IItemRenderer)new RenderGun(new ModelPlasmaRifle(), Halocraft.MODID+":textures/guns/SkinPlasmaRifle.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Magnum, (IItemRenderer)new RenderGun(new ModelMagnum(), Halocraft.MODID+":textures/guns/SkinMagnum.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.AssaultRifle, (IItemRenderer)new RenderGun(new ModelAssaultRifle(), Halocraft.MODID+":textures/guns/SkinAssaultRifle.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Needler, (IItemRenderer)new RenderGun(new ModelNeedler(), Halocraft.MODID+":textures/guns/SkinNeedler.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Carbine, (IItemRenderer)new RenderGun(new ModelCarbine(), Halocraft.MODID+":textures/guns/SkinCarbine.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItems.SwordHilt, (IItemRenderer)new RenderGun(new ModelEnergySword(), Halocraft.MODID+":textures/guns/SkinEnergySwordOff.png", true));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.EnergySword, (IItemRenderer)new RenderGun(new ModelEnergySword(), Halocraft.MODID+":textures/guns/SkinEnergySword.png", true));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.RocketLauncher, (IItemRenderer)new RenderGun(new ModelRocketLauncher(), Halocraft.MODID+":textures/guns/SkinRocketLauncher.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Flamethrower, (IItemRenderer)new RenderGun(new ModelFlamethrower(), Halocraft.MODID+":textures/guns/SkinFlamethrower.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.BattleRifle, (IItemRenderer)new RenderGun(new ModelBattleRifle(), Halocraft.MODID+":textures/guns/SkinBattleRifle.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Spiker, (IItemRenderer)new RenderGun(new ModelSpiker(), Halocraft.MODID+":textures/guns/SkinSpiker.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.SMG, (IItemRenderer)new RenderGun(new ModelSMG(), Halocraft.MODID+":textures/guns/SkinSMG.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Shotgun, (IItemRenderer)new RenderGun(new ModelShotgun(), Halocraft.MODID+":textures/guns/SkinShotgun.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.BeamRifle, (IItemRenderer)new RenderGun(new ModelBeamRifle(), Halocraft.MODID+":textures/guns/SkinBeamRifle.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Mauler, (IItemRenderer)new RenderGun(new ModelMauler(), Halocraft.MODID+":textures/guns/SkinMauler.png", false));
		
		//FIXME: Add New Gun Models
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.AssaultRifle, (IItemRenderer)new RenderGun(new ModelGravityHammer(), Halocraft.MODID+":textures/guns/SkinBruteHammer.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Carbine, (IItemRenderer)new RenderGun(new ModelBruteShot(), Halocraft.MODID+":textures/guns/SkinBruteShot.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.RocketLauncher, (IItemRenderer)new RenderGun(new ModelFuelRodCannon(), Halocraft.MODID+":textures/guns/SkinFuelRodGun.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Magnum, (IItemRenderer)new RenderGun(new ModelSentinelBeam(), Halocraft.MODID+":textures/guns/SkinSentinelBeam.png", false));
		MinecraftForgeClient.registerItemRenderer(KCWeaponMod.weapons[HalocraftItemsWeapons.ModMapOffset+19], (IItemRenderer)new RenderGun(new ModelSentinelBeam(), Halocraft.MODID+":textures/guns/SkinSentinelBeamMajor.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.SniperRifle, (IItemRenderer)new RenderGun(new ModelSpartanLaser(), Halocraft.MODID+":textures/guns/SkinSpartanLaser.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Carbine, (IItemRenderer)new RenderGun(new ModelPlasmaRifleOpen(), Halocraft.MODID+":textures/guns/SkinPlasmaRifle_Open.png", false));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Magnum, (IItemRenderer)new RenderGun(new ModelPlasmaPistolOpen(), Halocraft.MODID+":textures/guns/SkinPlasmaPistol_Open.png", false));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseDefault.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseGreen.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseBlue.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseRed.class, new RenderMongoose());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderGhost());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthog.class, new RenderWarthog());

		RenderingRegistry.registerEntityRenderingHandler(EntityDeployableGravityLift.class, new RenderProjectile(EnumType.DeployableGravityLift61));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHealthPack.class, new RenderHealthPack());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGunHolder.class, new RenderGunHolder());
	}

	@Override
	public boolean isSideClient()
	{
		return true;
	}

	@Override
	public void ParticleFX(int type, World worldObj, double posX, double posY, double posZ, double motionX, double motionY, double motionZ)
	{
		net.minecraft.client.particle.EffectRenderer effectR = Minecraft.getMinecraft().effectRenderer;
		if (type == 1)
		{
			effectR.addEffect(new EntityGravityLiftFX(worldObj, posX, posY, posZ, motionX, motionY, motionZ));
		}
	}
	
	@Override
	public boolean initializeVehicleLoopingSounds(EntityVehicle vehicle, String soundIdle, String soundRun)
	{
		if (Minecraft.getMinecraft().getSoundHandler() != null && vehicle != null)
		{
			try {
				if (soundIdle != null)
					Minecraft.getMinecraft().getSoundHandler().playSound(new MovingVehicleSoundLoop.Idle(vehicle, soundIdle));
				if (soundRun != null)
					Minecraft.getMinecraft().getSoundHandler().playSound(new MovingVehicleSoundLoop(vehicle, soundRun));
			} catch(Exception e) { return false; }
			return true;
		}
		return false;
	}
}