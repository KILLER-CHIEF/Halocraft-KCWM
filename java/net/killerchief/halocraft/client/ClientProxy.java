package net.killerchief.halocraft.client;

import net.killerchief.halocraft.CommonProxy;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DArmor;
import net.killerchief.halocraft.client.models.armor.ModelArmorCQB;
import net.killerchief.halocraft.client.models.armor.ModelArmorEOD;
import net.killerchief.halocraft.client.models.armor.ModelArmorEVA;
import net.killerchief.halocraft.client.models.armor.ModelArmorHayabusa;
import net.killerchief.halocraft.client.models.armor.ModelArmorMarkV;
import net.killerchief.halocraft.client.models.armor.ModelArmorMarkVI;
import net.killerchief.halocraft.client.models.armor.ModelArmorRecon;
import net.killerchief.halocraft.client.models.armor.ModelArmorRogue;
import net.killerchief.halocraft.client.models.armor.ModelArmorScout;
import net.killerchief.halocraft.client.models.armor.ModelArmorSecurity;
import net.killerchief.halocraft.client.models.guns.ModelEnergySword;
import net.killerchief.halocraft.client.models.mobs.ModelElite;
import net.killerchief.halocraft.client.models.mobs.ModelGrunt;
import net.killerchief.halocraft.client.render.RenderBanshee;
import net.killerchief.halocraft.client.render.RenderClientTargeter;
import net.killerchief.halocraft.client.render.RenderEliteGun;
import net.killerchief.halocraft.client.render.RenderEliteSword;
import net.killerchief.halocraft.client.render.RenderGhost;
import net.killerchief.halocraft.client.render.RenderGruntPlasmaPistol;
import net.killerchief.halocraft.client.render.RenderGunHolder;
import net.killerchief.halocraft.client.render.RenderHealthPack;
import net.killerchief.halocraft.client.render.RenderLightBridgeExt;
import net.killerchief.halocraft.client.render.RenderMongoose;
import net.killerchief.halocraft.client.render.RenderProjectile;
import net.killerchief.halocraft.client.render.RenderProjectile.EnumType;
import net.killerchief.halocraft.client.render.RenderWarthog;
import net.killerchief.halocraft.client.render.RenderWarthogBack;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.EntityClientTargeter;
import net.killerchief.halocraft.entities.EntityDeployableGravityLift;
import net.killerchief.halocraft.entities.EntityFlameQuickFX;
import net.killerchief.halocraft.entities.EntityGravityLiftFX;
import net.killerchief.halocraft.entities.EntityLightBridgeFX;
import net.killerchief.halocraft.entities.mobs.EntityEliteCarbine;
import net.killerchief.halocraft.entities.mobs.EntityElitePlasmaRifle;
import net.killerchief.halocraft.entities.mobs.EntityEliteSword;
import net.killerchief.halocraft.entities.mobs.EntityGruntFlee;
import net.killerchief.halocraft.entities.mobs.EntityGruntPlasmaPistol;
import net.killerchief.halocraft.entities.vehicles.EntityBanshee;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseBlue;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseDefault;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseGreen;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseRed;
import net.killerchief.halocraft.entities.vehicles.EntityVehicle;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogBack;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogChainGun;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogGauss;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogGold;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogRocket;
import net.killerchief.halocraft.entities.vehicles.MovingVehicleSoundLoop;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeExt;
import net.killerchief.kcweaponmod.ItemWeaponModel;
import net.killerchief.kcweaponmod.RenderWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
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

	@Override
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	@Override
	public String getClientUsername()
	{
		return Minecraft.getMinecraft().getSession().getUsername();
	}

	@Override
	public Model3DArmor armor3DType(String type)
	{
		if (type == null)
			return null;
		
		if (type.equalsIgnoreCase("markv"))
			return new ModelArmorMarkV();
		else if (type.equalsIgnoreCase("markvi"))
			return new ModelArmorMarkVI();
		else if (type.equalsIgnoreCase("cqb"))
			return new ModelArmorCQB();
		else if (type.equalsIgnoreCase("eod"))
			return new ModelArmorEOD();
		else if (type.equalsIgnoreCase("eva"))
			return new ModelArmorEVA();
		else if (type.equalsIgnoreCase("hayabusa"))
			return new ModelArmorHayabusa();
		else if (type.equalsIgnoreCase("recon"))
			return new ModelArmorRecon();
		else if (type.equalsIgnoreCase("rogue"))
			return new ModelArmorRogue();
		else if (type.equalsIgnoreCase("scout"))
			return new ModelArmorScout();
		else if (type.equalsIgnoreCase("security"))
			return new ModelArmorSecurity();
		
		return null;
	}

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEliteSword.class, new RenderEliteSword(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityEliteCarbine.class, new RenderEliteGun(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityElitePlasmaRifle.class, new RenderEliteGun(new ModelElite(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGruntPlasmaPistol.class, new RenderGruntPlasmaPistol(new ModelGrunt(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGruntFlee.class, new RenderGruntPlasmaPistol(new ModelGrunt(), 0.0F));

		MinecraftForgeClient.registerItemRenderer(HalocraftItems.SwordHilt, (IItemRenderer)new RenderWeapon(new ItemWeaponModel(new ModelEnergySword(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySwordOff.png"), true)));
		MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.EnergySword, (IItemRenderer)new RenderWeapon(new ItemWeaponModel(new ModelEnergySword(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySword.png"), false, true)));

		//FIXME: Add New Gun Models
		//MinecraftForgeClient.registerItemRenderer(KCWeaponMod.weapons[HalocraftItemsWeapons.ModMapOffset+19], (IItemRenderer)new RenderGun(new ModelSentinelBeam(), Halocraft.MODID+":textures/guns/SkinSentinelBeamMajor.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.AssaultRifle, (IItemRenderer)new RenderGun(new ModelGravityHammer(), Halocraft.MODID+":textures/guns/SkinBruteHammer.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.RocketLauncher, (IItemRenderer)new RenderGun(new ModelFuelRodCannon(), Halocraft.MODID+":textures/guns/SkinFuelRodGun.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Magnum, (IItemRenderer)new RenderGun(new ModelSentinelBeam(), Halocraft.MODID+":textures/guns/SkinSentinelBeam.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.SniperRifle, (IItemRenderer)new RenderGun(new ModelSpartanLaser(), Halocraft.MODID+":textures/guns/SkinSpartanLaser.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Carbine, (IItemRenderer)new RenderGun(new ModelPlasmaRifleOpen(), Halocraft.MODID+":textures/guns/SkinPlasmaRifle_Open.png", false));
		//MinecraftForgeClient.registerItemRenderer(HalocraftItemsWeapons.Magnum, (IItemRenderer)new RenderGun(new ModelPlasmaPistolOpen(), Halocraft.MODID+":textures/guns/SkinPlasmaPistol_Open.png", false));

		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseDefault.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseGreen.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseBlue.class, new RenderMongoose());
		RenderingRegistry.registerEntityRenderingHandler(EntityMongooseRed.class, new RenderMongoose());

		RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderGhost());

		RenderingRegistry.registerEntityRenderingHandler(EntityWarthog.class, new RenderWarthog());
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthogBack.class, new RenderWarthogBack());
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthogChainGun.class, new RenderWarthog());
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthogGauss.class, new RenderWarthog());
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthogRocket.class, new RenderWarthog());
		RenderingRegistry.registerEntityRenderingHandler(EntityWarthogGold.class, new RenderWarthog());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBanshee.class, new RenderBanshee());

		RenderingRegistry.registerEntityRenderingHandler(EntityDeployableGravityLift.class, new RenderProjectile(EnumType.DeployableGravityLift61));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHealthPack.class, new RenderHealthPack());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGunHolder.class, new RenderGunHolder());
		//TODO: STRIPED - CovSupplyCase
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCovSupplyCase.class, new RenderCovSupplyCase());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightBridgeExt.class, new RenderLightBridgeExt());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityClientTargeter.class, new RenderClientTargeter());
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
		else if (type == 2)
		{
			effectR.addEffect(new EntityLightBridgeFX(worldObj, posX, posY, posZ, motionX, motionY, motionZ));
		}
		else if (type == 3)
		{
			effectR.addEffect(new EntityFlameQuickFX(worldObj, posX, posY, posZ, motionX, motionY, motionZ));
		}
	}

	@Override
	public boolean initVehicleLoopSounds(EntityVehicle vehicle, int soundHandlerType, String soundFile)
	{
		if (Minecraft.getMinecraft().getSoundHandler() != null && vehicle != null)
		{
			try {
				if (soundHandlerType == 0)
					Minecraft.getMinecraft().getSoundHandler().playSound(new MovingVehicleSoundLoop(vehicle, soundFile));
				else if (soundHandlerType == 1)
					Minecraft.getMinecraft().getSoundHandler().playSound(new MovingVehicleSoundLoop.Idle(vehicle, soundFile));
				else if (soundHandlerType == 2)
					Minecraft.getMinecraft().getSoundHandler().playSound(new MovingVehicleSoundLoop.High(vehicle, soundFile));
			} catch(Exception e) { return false; }
			return true;
		}
		return false;
	}
}