package net.killerchief.halocraft.config;

import java.util.ArrayList;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.HalocraftUtils;
import net.killerchief.halocraft.client.models.guns.ModelAssaultRifle;
import net.killerchief.halocraft.client.models.guns.ModelBattleRifle;
import net.killerchief.halocraft.client.models.guns.ModelBeamRifle;
import net.killerchief.halocraft.client.models.guns.ModelBruteShot;
import net.killerchief.halocraft.client.models.guns.ModelCarbine;
import net.killerchief.halocraft.client.models.guns.ModelCovPlasmaPistol;
import net.killerchief.halocraft.client.models.guns.ModelCovPlasmaRifle;
import net.killerchief.halocraft.client.models.guns.ModelDMR;
import net.killerchief.halocraft.client.models.guns.ModelFlamethrower;
import net.killerchief.halocraft.client.models.guns.ModelMagnumM6G;
import net.killerchief.halocraft.client.models.guns.ModelMauler;
import net.killerchief.halocraft.client.models.guns.ModelNeedler;
import net.killerchief.halocraft.client.models.guns.ModelRocketLauncher;
import net.killerchief.halocraft.client.models.guns.ModelSMGM7S;
import net.killerchief.halocraft.client.models.guns.ModelSentinelBeam;
import net.killerchief.halocraft.client.models.guns.ModelShotgun;
import net.killerchief.halocraft.client.models.guns.ModelSniperRifle;
import net.killerchief.halocraft.client.models.guns.ModelSpiker;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.ItemWeaponModel;
import net.killerchief.kcweaponmod.ItemWeaponProperties;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class InitHcWeapons {
	
	public static void DefineAndSendWeapons()
	{
		CreativeTabs dev_tab = null;
		if (Halocraft.proxy.isSideClient() && HalocraftUtils.isHcDevTeamMember(Minecraft.getMinecraft().getSession().getUsername())) {
			dev_tab = KCWeaponMod.InventoryTab;
		}
		
		ArrayList<ItemWeapon> weapons = new ArrayList<ItemWeapon>();
		
		//BattleRifle
		ItemWeaponProperties BattleRifle = new ItemWeaponProperties(Halocraft.MODID+".BattleRifle");
		BattleRifle.Texture = Halocraft.MODID + ":BattleRifle";
		BattleRifle.WeaponModel = new ItemWeaponModel(new ModelBattleRifle(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinBattleRifle.png"));
		BattleRifle.IsAutomaticOrHasSecondaryShoot = false;
		BattleRifle.ZoomMultiplier = new int[]{3};
		BattleRifle.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeBattleRifle.png";
		BattleRifle.ScopeBGOpacity = 0.47F;
		BattleRifle.ScopeProperties = new int[]{151, 151, 75, 75};
		BattleRifle.HasReticle = true;
		BattleRifle.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		BattleRifle.ReticleProperties = new int[]{25, 1, 23, 23, 11, 11};
		BattleRifle.GunShootDelay = 600L;
		BattleRifle.Recoil = 0.7F;
		BattleRifle.PerformOnly1ShootSound = true;
		BattleRifle.ShootSound = Halocraft.MODID+":weapons.shoot.BattleRifleShoot";
		//BattleRifle.
		BattleRifle.ReloadTime = 2200L;
		BattleRifle.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		BattleRifle.ReloadMaxAmmoFlow = 0;
		BattleRifle.ReloadTimeLoop = 0L;
		BattleRifle.ReloadSoundLoop = "";
		BattleRifle.ReloadSoundExit = "";
		BattleRifle.AmmoFeedsFromInventory = false;
		BattleRifle.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		BattleRifle.MagazineSize = 36;
		BattleRifle.ItemStackDecreaseOnUse = false;
		BattleRifle.ItemStackMaxStackSize = 1;
		BattleRifle.RequiredUsesPerShot = 1;
		BattleRifle.ShootBurstCount = 3;
		BattleRifle.BurstAccuracyDecrease = 0.6F;
		BattleRifle.SingleShotProjectileCount = 1;
		
		BattleRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		BattleRifle.ProjectileGlows = false;
		
		BattleRifle.ProjectileSpeed = 8F;
		BattleRifle.Accuracy = 1F;
		BattleRifle.Gravity = 0.004F;
		BattleRifle.MaxEffectiveTicksAlive = 100;
		BattleRifle.ProjectileLivingProperties = "null";
		BattleRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		BattleRifle.ProjectileDragInAir = 0.99F;
		BattleRifle.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(BattleRifle));
		
		
		//DMR
		ItemWeaponProperties DMR = new ItemWeaponProperties(Halocraft.MODID+".DMR");
		DMR.Texture = Halocraft.MODID + ":DMR";
		DMR.WeaponModel = new ItemWeaponModel(new ModelDMR(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinDMR.png"));
		DMR.IsAutomaticOrHasSecondaryShoot = false;
		DMR.ZoomMultiplier = new int[]{4};
		DMR.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeDMR.png";
		DMR.ScopeBGOpacity = 0.47F;
		DMR.ScopeProperties = new int[]{151, 151, 75, 75};
		DMR.HasReticle = true;
		DMR.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		DMR.ReticleProperties = new int[]{49, 1, 23, 23, 11, 11};
		DMR.GunShootDelay = 400L;
		DMR.Recoil = 2F;
		DMR.PerformOnly1ShootSound = true;
		DMR.ShootSound = Halocraft.MODID+":weapons.shoot.DMRShoot";
		//DMR.
		DMR.ReloadTime = 2400L;
		DMR.ReloadSound = Halocraft.MODID+":weapons.reload.DMRReload";
		DMR.ReloadMaxAmmoFlow = 0;
		DMR.ReloadTimeLoop = 0L;
		DMR.ReloadSoundLoop = "";
		DMR.ReloadSoundExit = "";
		DMR.AmmoFeedsFromInventory = false;
		DMR.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		DMR.MagazineSize = 15;
		DMR.ItemStackDecreaseOnUse = false;
		DMR.ItemStackMaxStackSize = 1;
		DMR.RequiredUsesPerShot = 1;
		DMR.ShootBurstCount = 1;
		//DMR.BurstAccuracyDecrease = 0.6F;
		DMR.SingleShotProjectileCount = 1;
		
		DMR.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		DMR.ProjectileGlows = false;
		
		DMR.ProjectileSpeed = 8F;
		DMR.Accuracy = 1F;
		DMR.Gravity = 0.004F;
		DMR.MaxEffectiveTicksAlive = 100;
		DMR.ProjectileLivingProperties = "null";
		DMR.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		DMR.ProjectileDragInAir = 0.99F;
		DMR.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(DMR));
		
		
		//AssaultRifle
		ItemWeaponProperties AssaultRifle = new ItemWeaponProperties(Halocraft.MODID+".AssaultRifle");
		AssaultRifle.Texture = Halocraft.MODID + ":AssaultRifle";
		AssaultRifle.WeaponModel = new ItemWeaponModel(new ModelAssaultRifle(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinAssaultRifle.png"));
		AssaultRifle.WeaponModel.TPScale(0.5F, 0.5F, 0.5F).TPTrans(0F, 0F, -1.6F).TPSprintTrans(1F, -0.5F, -1.0F).TPSprintRotate(0F, 0F, -20F);
		AssaultRifle.IsAutomaticOrHasSecondaryShoot = true;
		//AssaultRifle.ZoomMultiplier = new int[]{2};
		//AssaultRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/AssaultRifleOverlay.png";
		AssaultRifle.HasReticle = true;
		AssaultRifle.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		AssaultRifle.ReticleProperties = new int[]{86, 1, 31, 31, 15, 15};
		AssaultRifle.GunShootDelay = 80L;
		AssaultRifle.Recoil = 2F;
		AssaultRifle.PerformOnly1ShootSound = true;
		AssaultRifle.ShootSound = Halocraft.MODID+":weapons.shoot.AssaultRifleShoot";
		//AssaultRifle.
		AssaultRifle.ReloadTime = 2100L;
		AssaultRifle.ReloadSound = Halocraft.MODID+":weapons.reload.AssaultRifleReload";
		AssaultRifle.ReloadMaxAmmoFlow = 0;
		AssaultRifle.ReloadTimeLoop = 0L;
		AssaultRifle.ReloadSoundLoop = "";
		AssaultRifle.ReloadSoundExit = "";
		AssaultRifle.AmmoFeedsFromInventory = false;
		AssaultRifle.AmmoType = new ItemStack(HalocraftItemsWeapons.SmallRounds);
		AssaultRifle.MagazineSize = 32;
		AssaultRifle.ItemStackDecreaseOnUse = false;
		AssaultRifle.ItemStackMaxStackSize = 1;
		AssaultRifle.RequiredUsesPerShot = 1;
		AssaultRifle.ShootBurstCount = 1;
		//AssaultRifle.BurstAccuracyDecrease = 0.6F;
		AssaultRifle.SingleShotProjectileCount = 1;
		
		AssaultRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		AssaultRifle.ProjectileGlows = false;
		
		AssaultRifle.ProjectileSpeed = 8F;
		AssaultRifle.Accuracy = 2.5F;
		AssaultRifle.Gravity = 0.004F;
		AssaultRifle.MaxEffectiveTicksAlive = 100;
		AssaultRifle.ProjectileLivingProperties = "null";
		AssaultRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		AssaultRifle.ProjectileDragInAir = 0.99F;
		AssaultRifle.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(AssaultRifle));
		
		
		//Shotgun
		ItemWeaponProperties Shotgun = new ItemWeaponProperties(Halocraft.MODID+".Shotgun");
		Shotgun.Texture = Halocraft.MODID + ":Shotgun";
		Shotgun.WeaponModel = new ItemWeaponModel(new ModelShotgun(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinShotgun.png"));
		Shotgun.IsAutomaticOrHasSecondaryShoot = false;
		//Shotgun.ZoomMultiplier = new int[]{4};
		//Shotgun.ZoomTexture = Halocraft.MODID+":textures/overlays/ShotgunOverlay.png";
		Shotgun.HasReticle = true;
		Shotgun.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Shotgun.ReticleProperties = new int[]{162, 1, 45, 45, 22, 22};
		Shotgun.GunShootDelay = 1000L;
		Shotgun.Recoil = 6F;
		Shotgun.PerformOnly1ShootSound = true;
		Shotgun.ShootSound = Halocraft.MODID+":weapons.shoot.ShotgunShoot";
		//Shotgun.
		Shotgun.ReloadTime = 1370L;
		Shotgun.ReloadSound = Halocraft.MODID+":weapons.reload.ShotgunReloadEnter";
		Shotgun.ReloadMaxAmmoFlow = 1;
		Shotgun.ReloadTimeLoop = 600L;
		Shotgun.ReloadSoundLoop = Halocraft.MODID+":weapons.reload.ShotgunReloadLoop";
		Shotgun.ReloadSoundExit = Halocraft.MODID+":weapons.reload.ShotgunReloadExit";
		Shotgun.AmmoFeedsFromInventory = false;
		Shotgun.AmmoType = new ItemStack(HalocraftItemsWeapons.ShotgunRounds);
		Shotgun.MagazineSize = 12;
		Shotgun.ItemStackDecreaseOnUse = false;
		Shotgun.ItemStackMaxStackSize = 1;
		Shotgun.RequiredUsesPerShot = 1;
		Shotgun.ShootBurstCount = 1;
		//Shotgun.BurstAccuracyDecrease = 0.6F;
		Shotgun.SingleShotProjectileCount = 12;
		
		Shotgun.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/LeadShotRender.png";
		Shotgun.ProjectileGlows = false;
		
		Shotgun.ProjectileSpeed = 6F;
		Shotgun.Accuracy = 6F;
		Shotgun.Gravity = 0.004F;
		Shotgun.MaxEffectiveTicksAlive = 5;
		Shotgun.ProjectileLivingProperties = "null";
		Shotgun.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		Shotgun.ProjectileDragInAir = 0.96F;
		Shotgun.ProjectileDragInWater = 0.1F;
		
		weapons.add(new ItemWeapon(Shotgun));
		
		
		//SniperRifle
		ItemWeaponProperties SniperRifle = new ItemWeaponProperties(Halocraft.MODID+".SniperRifle");
		SniperRifle.Texture = Halocraft.MODID + ":SniperRifle";
		SniperRifle.WeaponModel = new ItemWeaponModel(new ModelSniperRifle(), new ResourceLocation(Halocraft.MODID+":textures/guns/SRS99AM.png"));
		SniperRifle.WeaponModel.TPScale(0.6F, 0.6F, 0.6F).TPTrans(0.18F, -0.16F, -0.78F).TPRotate(0.5F, -3.5F, 0.0F).TPSprintTrans(0.48F, -0.94F, -0.06F).TPSprintRotate(11.5F, 10.0F, -26.0F).FPTrans(-0.35F, -0.2F, 0.3F).FPRotate(-2.0F, -3.5F, 1.5F).FPSprintTrans(-0.2F, -0.26F, 0.35F).FPSprintRotate(0.0F, 0.0F, -2.0F);
		SniperRifle.IsAutomaticOrHasSecondaryShoot = false;
		SniperRifle.ZoomMultiplier = new int[]{4, 8};
		SniperRifle.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeSniperRifle.png";
		SniperRifle.ScopeBGOpacity = 0.628F;
		SniperRifle.ScopeProperties = new int[]{203, 133, 101, 66};
		SniperRifle.HasReticle = true;
		SniperRifle.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		SniperRifle.ReticleProperties = new int[]{2, 26, 9, 9, 4, 4};
		SniperRifle.GunShootDelay = 1100L;
		SniperRifle.Recoil = 4F;
		SniperRifle.PerformOnly1ShootSound = true;
		SniperRifle.ShootSound = Halocraft.MODID+":weapons.shoot.SniperRifleShoot";
		//SniperRifle.
		SniperRifle.ReloadTime = 3000L;
		SniperRifle.ReloadSound = Halocraft.MODID+":weapons.reload.SniperRifleReload";
		SniperRifle.ReloadMaxAmmoFlow = 0;
		SniperRifle.ReloadTimeLoop = 0L;
		SniperRifle.ReloadSoundLoop = "";
		SniperRifle.ReloadSoundExit = "";
		SniperRifle.AmmoFeedsFromInventory = false;
		SniperRifle.AmmoType = new ItemStack(HalocraftItemsWeapons.LargeRounds);
		SniperRifle.MagazineSize = 4;
		SniperRifle.ItemStackDecreaseOnUse = false;
		SniperRifle.ItemStackMaxStackSize = 1;
		SniperRifle.RequiredUsesPerShot = 1;
		SniperRifle.ShootBurstCount = 1;
		//SniperRifle.BurstAccuracyDecrease = 0.6F;
		SniperRifle.SingleShotProjectileCount = 1;
		
		SniperRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/LargeBulletRender.png";
		SniperRifle.ProjectileGlows = false;
		
		SniperRifle.ProjectileSpeed = 8F;
		SniperRifle.Accuracy = 0.6F;
		SniperRifle.Gravity = 0.004F;
		SniperRifle.MaxEffectiveTicksAlive = 200;
		SniperRifle.ProjectileLivingProperties = "null";
		SniperRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(30, 0, Die)";
		SniperRifle.ProjectileDragInAir = 0.99F;
		SniperRifle.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(SniperRifle));
		
		
		//Magnum
		ItemWeaponProperties Magnum = new ItemWeaponProperties(Halocraft.MODID+".Magnum");
		Magnum.Texture = Halocraft.MODID + ":Magnum";
		Magnum.WeaponModel = new ItemWeaponModel(new ModelMagnumM6G(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinMagnumM6G.png"));
		Magnum.IsAutomaticOrHasSecondaryShoot = false;
		Magnum.ZoomMultiplier = new int[]{2};
		Magnum.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeMagnum.png";
		Magnum.ScopeBGOpacity = 0.47F;
		Magnum.ScopeProperties = new int[]{151, 151, 75, 75};
		Magnum.HasReticle = true;
		Magnum.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Magnum.ReticleProperties = new int[]{1, 1, 23, 23, 11, 11};
		Magnum.GunShootDelay = 100L;
		Magnum.Recoil = 3F;
		Magnum.PerformOnly1ShootSound = true;
		Magnum.ShootSound = Halocraft.MODID+":weapons.shoot.MagnumShoot";
		//Magnum.
		Magnum.ReloadTime = 1500L;
		Magnum.ReloadSound = Halocraft.MODID+":weapons.reload.MagnumReload";
		Magnum.ReloadMaxAmmoFlow = 0;
		Magnum.ReloadTimeLoop = 0L;
		Magnum.ReloadSoundLoop = "";
		Magnum.ReloadSoundExit = "";
		Magnum.AmmoFeedsFromInventory = false;
		Magnum.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		Magnum.MagazineSize = 12;
		Magnum.ItemStackDecreaseOnUse = false;
		Magnum.ItemStackMaxStackSize = 1;
		Magnum.RequiredUsesPerShot = 1;
		Magnum.ShootBurstCount = 1;
		//Magnum.BurstAccuracyDecrease = 0.6F;
		Magnum.SingleShotProjectileCount = 1;
		
		Magnum.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		Magnum.ProjectileGlows = false;
		
		Magnum.ProjectileSpeed = 8F;
		Magnum.Accuracy = 2F;
		Magnum.Gravity = 0.004F;
		Magnum.MaxEffectiveTicksAlive = 100;
		Magnum.ProjectileLivingProperties = "null";
		Magnum.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		Magnum.ProjectileDragInAir = 0.99F;
		Magnum.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(Magnum));
		
		
		//SMG
		ItemWeaponProperties SMG = new ItemWeaponProperties(Halocraft.MODID+".SMG");
		SMG.Texture = Halocraft.MODID + ":SMG";
		SMG.WeaponModel = new ItemWeaponModel(new ModelSMGM7S(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSMGM7.png"));
		SMG.IsAutomaticOrHasSecondaryShoot = true;
		//SMG.ZoomMultiplier = new int[]{2};
		//SMG.ZoomTexture = Halocraft.MODID+":textures/overlays/SMGOverlay.png";
		SMG.HasReticle = true;
		SMG.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		SMG.ReticleProperties = new int[]{118, 1, 43, 43, 21, 21};
		SMG.GunShootDelay = 40L;
		SMG.Recoil = 2F;
		SMG.PerformOnly1ShootSound = true;
		SMG.ShootSound = Halocraft.MODID+":weapons.shoot.SMGShoot";
		//SMG.
		SMG.ReloadTime = 1500L;
		SMG.ReloadSound = Halocraft.MODID+":weapons.reload.SMGReload";
		SMG.ReloadMaxAmmoFlow = 0;
		SMG.ReloadTimeLoop = 0L;
		SMG.ReloadSoundLoop = "";
		SMG.ReloadSoundExit = "";
		SMG.AmmoFeedsFromInventory = false;
		SMG.AmmoType = new ItemStack(HalocraftItemsWeapons.SmallRounds);
		SMG.MagazineSize = 60;
		SMG.ItemStackDecreaseOnUse = false;
		SMG.ItemStackMaxStackSize = 1;
		SMG.RequiredUsesPerShot = 1;
		SMG.ShootBurstCount = 1;
		//SMG.BurstAccuracyDecrease = 0.6F;
		SMG.SingleShotProjectileCount = 1;
		
		SMG.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		SMG.ProjectileGlows = false;
		
		SMG.ProjectileSpeed = 8F;
		SMG.Accuracy = 5F;
		SMG.Gravity = 0.004F;
		SMG.MaxEffectiveTicksAlive = 80;
		SMG.ProjectileLivingProperties = "null";
		SMG.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		SMG.ProjectileDragInAir = 0.99F;
		SMG.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(SMG));
		
		
		//RocketLauncher
		ItemWeaponProperties RocketLauncher = new ItemWeaponProperties(Halocraft.MODID+".RocketLauncher");
		RocketLauncher.Texture = Halocraft.MODID + ":RocketLauncher";
		RocketLauncher.WeaponModel = new ItemWeaponModel(new ModelRocketLauncher(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinRocketLauncher.png"));
		RocketLauncher.WeaponModel.TPTrans(0.08F, 0.15F, 0.48F).FPTrans(-0.4F, 0.27F, -0.01F).FPRotate(-0.5F, -3.5F, 0.0F);
		RocketLauncher.IsAutomaticOrHasSecondaryShoot = false;
		RocketLauncher.ZoomMultiplier = new int[]{2};
		RocketLauncher.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeRocketLauncher.png";
		RocketLauncher.ScopeBGOpacity = 0.47F;
		RocketLauncher.ScopeProperties = new int[]{151, 151, 75, 75};
		RocketLauncher.HasReticle = true;
		RocketLauncher.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		RocketLauncher.ReticleProperties = new int[]{208, 1, 47, 47, 23, 23};
		RocketLauncher.GunShootDelay = 1400L;
		RocketLauncher.Recoil = 12F;
		RocketLauncher.PerformOnly1ShootSound = true;
		RocketLauncher.ShootSound = Halocraft.MODID+":weapons.shoot.RocketLauncherShoot";
		//RocketLauncher.
		RocketLauncher.ReloadTime = 3400L;
		RocketLauncher.ReloadSound = Halocraft.MODID+":weapons.reload.RocketLauncherReload";
		RocketLauncher.ReloadMaxAmmoFlow = 0;
		RocketLauncher.ReloadTimeLoop = 0L;
		RocketLauncher.ReloadSoundLoop = "";
		RocketLauncher.ReloadSoundExit = "";
		RocketLauncher.AmmoFeedsFromInventory = false;
		RocketLauncher.AmmoType = new ItemStack(HalocraftItemsWeapons.Rocket);
		RocketLauncher.MagazineSize = 2;
		RocketLauncher.ItemStackDecreaseOnUse = false;
		RocketLauncher.ItemStackMaxStackSize = 1;
		RocketLauncher.RequiredUsesPerShot = 1;
		RocketLauncher.ShootBurstCount = 1;
		//RocketLauncher.BurstAccuracyDecrease = 0.6F;
		RocketLauncher.SingleShotProjectileCount = 1;
		
		RocketLauncher.TrackLastDelay = 4;
		RocketLauncher.TrackType = 3;
		RocketLauncher.TrackDistance = 50;
		
		RocketLauncher.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/RocketRender.png";
		RocketLauncher.ProjectileGlows = true;
		
		RocketLauncher.ProjectileSpeed = 1.6F;
		RocketLauncher.Accuracy = 1F;
		RocketLauncher.Gravity = 0.002F;
		RocketLauncher.MaxEffectiveTicksAlive = 1000;
		RocketLauncher.ProjectileLivingProperties = "net.killerchief.halocraft.config.NewWeaponTags.ParticleFXRocket()";
		RocketLauncher.ProjectileImpactProperties = "ImpactEntity(36, 0, null), Explode(4, Die), Die";
		RocketLauncher.ProjectileDragInAir = 0.99F;
		RocketLauncher.ProjectileDragInWater = 0.5F;
		
		RocketLauncher.TrackSensitivity = 0.1F;
		
		weapons.add(new ItemWeapon(RocketLauncher));
		
		
		//Carbine
		ItemWeaponProperties Carbine = new ItemWeaponProperties(Halocraft.MODID+".Carbine");
		Carbine.Texture = Halocraft.MODID + ":Carbine";
		Carbine.WeaponModel = new ItemWeaponModel(new ModelCarbine(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinCarbine.png"));
		Carbine.WeaponModel.TPScale(0.7F, 0.7F, 0.7F).TPTrans(0F, -0.4F, -1.65F).TPSprintTrans(0.28F, -0.72F, -1.23F).TPSprintRotate(11.0F, 0.5F, -21.5F).FPTrans(-0.2F, -0.3F, -0.9F).FPRotate(0.5F, -1.0F, 0.0F).FPSprintTrans(-0.28F, -0.18F, -1.0F);
		Carbine.IsAutomaticOrHasSecondaryShoot = false;
		Carbine.ZoomMultiplier = new int[]{4};
		Carbine.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeCarbine.png";
		Carbine.ScopeBGOpacity = 0.47F;
		Carbine.ScopeProperties = new int[]{231, 157, 115, 78};
		Carbine.HasReticle = true;
		Carbine.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Carbine.ReticleProperties = new int[]{115, 47, 27, 23, 13, 11};
		Carbine.GunShootDelay = 300L;
		Carbine.Recoil = 1.6F;
		Carbine.PerformOnly1ShootSound = true;
		Carbine.ShootSound = Halocraft.MODID+":weapons.shoot.CarbineShoot";
		//Carbine.
		Carbine.ReloadTime = 1900L;
		Carbine.ReloadSound = Halocraft.MODID+":weapons.reload.CarbineReload";
		Carbine.ReloadMaxAmmoFlow = 0;
		Carbine.ReloadTimeLoop = 0L;
		Carbine.ReloadSoundLoop = "";
		Carbine.ReloadSoundExit = "";
		Carbine.AmmoFeedsFromInventory = false;
		Carbine.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		Carbine.MagazineSize = 18;
		Carbine.ItemStackDecreaseOnUse = false;
		Carbine.ItemStackMaxStackSize = 1;
		Carbine.RequiredUsesPerShot = 1;
		Carbine.ShootBurstCount = 1;
		//Carbine.BurstAccuracyDecrease = 0.6F;
		Carbine.SingleShotProjectileCount = 1;
		
		Carbine.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		Carbine.ProjectileGlows = true;
		
		Carbine.ProjectileSpeed = 8F;
		Carbine.Accuracy = 1F;
		Carbine.Gravity = 0.004F;
		Carbine.MaxEffectiveTicksAlive = 100;
		Carbine.ProjectileLivingProperties = "null";
		Carbine.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		Carbine.ProjectileDragInAir = 0.99F;
		Carbine.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(Carbine));
		
		
		//PlasmaRifle
		ItemWeaponProperties PlasmaRifle = new ItemWeaponProperties(Halocraft.MODID+".PlasmaRifle");
		PlasmaRifle.Texture = Halocraft.MODID + ":PlasmaRifle";
		PlasmaRifle.WeaponModel = new ItemWeaponModel(new ModelCovPlasmaRifle(), new ResourceLocation(Halocraft.MODID+":textures/guns/T25DER.png"));
		PlasmaRifle.WeaponModel.TPScale(0.6F, 0.6F, 0.6F).TPTrans(0.2F, -0.4F, -0.7F).TPRotate(2.0F, -2.0F, 0.0F).TPSprintTrans(0.51F, -1.23F, -0.12F).TPSprintRotate(-66.5F, -40.5F, -60.0F).FPScale(0.8F, 0.8F, 0.8F).FPTrans(0.1F, -0.57F, -1.14F).FPRotate(1.0F, -1.5F, 0.0F).FPSprintTrans(0.01F, -0.31F, -1.27F).FPSprintRotate(1.0F, 0.0F, -7.5F);
		PlasmaRifle.IsAutomaticOrHasSecondaryShoot = true;
		//PlasmaRifle.ZoomMultiplier = new int[]{2};
		//PlasmaRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/PlasmaRifleOverlay.png";
		PlasmaRifle.HasReticle = true;
		PlasmaRifle.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		PlasmaRifle.ReticleProperties = new int[]{1, 37, 37, 37, 18, 18};
		PlasmaRifle.GunShootDelay = 100L;
		PlasmaRifle.Recoil = 1.6F;
		PlasmaRifle.PerformOnly1ShootSound = true;
		PlasmaRifle.ShootSound = Halocraft.MODID+":weapons.shoot.PlasmaRifleShoot";
		//PlasmaRifle.
		PlasmaRifle.ReloadTime = 2000L;
		PlasmaRifle.ReloadSound = Halocraft.MODID+":weapons.reload.PlasmaRifleReload";
		PlasmaRifle.ReloadMaxAmmoFlow = 0;
		PlasmaRifle.ReloadTimeLoop = 0L;
		PlasmaRifle.ReloadSoundLoop = "";
		PlasmaRifle.ReloadSoundExit = "";
		PlasmaRifle.AmmoFeedsFromInventory = false;
		PlasmaRifle.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		PlasmaRifle.MagazineSize = 200;
		PlasmaRifle.ItemStackDecreaseOnUse = false;
		PlasmaRifle.ItemStackMaxStackSize = 1;
		PlasmaRifle.RequiredUsesPerShot = 2;
		PlasmaRifle.ShootBurstCount = 1;
		//PlasmaRifle.BurstAccuracyDecrease = 0.6F;
		PlasmaRifle.SingleShotProjectileCount = 1;
		
		PlasmaRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		PlasmaRifle.ProjectileGlows = true;
		
		PlasmaRifle.ProjectileSpeed = 4F;
		PlasmaRifle.Accuracy = 3F;
		PlasmaRifle.Gravity = 0.004F;
		PlasmaRifle.MaxEffectiveTicksAlive = 80;
		PlasmaRifle.ProjectileLivingProperties = "null";
		PlasmaRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		PlasmaRifle.ProjectileDragInAir = 0.99F;
		PlasmaRifle.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(PlasmaRifle));
		
		
		//PlasmaPistol
		ItemWeaponProperties PlasmaPistol = new ItemWeaponProperties(Halocraft.MODID+".PlasmaPistol");
		PlasmaPistol.Texture = Halocraft.MODID + ":PlasmaPistol";
		PlasmaPistol.WeaponModel = new ItemWeaponModel(new ModelCovPlasmaPistol(), new ResourceLocation(Halocraft.MODID+":textures/guns/T25DEP.png"));
		PlasmaPistol.WeaponModel.TPScale(0.75F, 0.75F, 0.75F).TPTrans(0.0F, -0.05F, -0.36F).TPRotate(0.0F, -1.5F, 0.0F).TPSprintTrans(0.56F, -0.72F, -0.15F).TPSprintRotate(-73.5F, -35.5F, -61.0F);
		PlasmaPistol.IsAutomaticOrHasSecondaryShoot = false;
		//PlasmaPistol.ZoomMultiplier = new int[]{2};
		//PlasmaPistol.ZoomTexture = Halocraft.MODID+":textures/overlays/PlasmaPistolOverlay.png";
		PlasmaPistol.HasReticle = true;
		PlasmaPistol.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		PlasmaPistol.ReticleProperties = new int[]{39, 37, 37, 37, 18, 18};
		PlasmaPistol.GunShootDelay = 100L;
		PlasmaPistol.Recoil = 1.4F;
		PlasmaPistol.PerformOnly1ShootSound = true;
		PlasmaPistol.ShootSound = Halocraft.MODID+":weapons.shoot.PlasmaPistolShoot";
		//PlasmaPistol.
		PlasmaPistol.ReloadTime = 2000L;
		PlasmaPistol.ReloadSound = Halocraft.MODID+":weapons.reload.PlasmaPistolReload";
		PlasmaPistol.ReloadMaxAmmoFlow = 0;
		PlasmaPistol.ReloadTimeLoop = 0L;
		PlasmaPistol.ReloadSoundLoop = "";
		PlasmaPistol.ReloadSoundExit = "";
		PlasmaPistol.AmmoFeedsFromInventory = false;
		PlasmaPistol.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		PlasmaPistol.MagazineSize = 200;
		PlasmaPistol.ItemStackDecreaseOnUse = false;
		PlasmaPistol.ItemStackMaxStackSize = 1;
		PlasmaPistol.RequiredUsesPerShot = 2;
		PlasmaPistol.ShootBurstCount = 1;
		//PlasmaPistol.BurstAccuracyDecrease = 0.6F;
		PlasmaPistol.SingleShotProjectileCount = 1;
		
		PlasmaPistol.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		PlasmaPistol.ProjectileGlows = true;
		
		PlasmaPistol.ProjectileSpeed = 2F;
		PlasmaPistol.Accuracy = 2F;
		PlasmaPistol.Gravity = 0.004F;
		PlasmaPistol.MaxEffectiveTicksAlive = 80;
		PlasmaPistol.ProjectileLivingProperties = "null";
		PlasmaPistol.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		PlasmaPistol.ProjectileDragInAir = 0.99F;
		PlasmaPistol.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(PlasmaPistol));
		
		
		//Needler
		ItemWeaponProperties Needler = new ItemWeaponProperties(Halocraft.MODID+".Needler");
		Needler.Texture = Halocraft.MODID + ":Needler";
		Needler.WeaponModel = new ItemWeaponModel(new ModelNeedler(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinNeedler.png"));
		Needler.IsAutomaticOrHasSecondaryShoot = true;
		//Needler.ZoomMultiplier = new int[]{2};
		//Needler.ZoomTexture = Halocraft.MODID+":textures/overlays/NeedlerOverlay.png";
		Needler.HasReticle = true;
		Needler.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Needler.ReticleProperties = new int[]{143, 47, 31, 21, 15, 10};
		Needler.GunShootDelay = 80L;
		Needler.Recoil = 1.4F;
		Needler.PerformOnly1ShootSound = true;
		Needler.ShootSound = Halocraft.MODID+":weapons.shoot.NeedlerShoot";
		//Needler.
		Needler.ReloadTime = 2000L;
		Needler.ReloadSound = Halocraft.MODID+":weapons.reload.NeedlerReload";
		Needler.ReloadMaxAmmoFlow = 0;
		Needler.ReloadTimeLoop = 0L;
		Needler.ReloadSoundLoop = "";
		Needler.ReloadSoundExit = "";
		Needler.AmmoFeedsFromInventory = false;
		Needler.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		Needler.MagazineSize = 30;
		Needler.ItemStackDecreaseOnUse = false;
		Needler.ItemStackMaxStackSize = 1;
		Needler.RequiredUsesPerShot = 1;
		Needler.ShootBurstCount = 1;
		//Needler.BurstAccuracyDecrease = 0.6F;
		Needler.SingleShotProjectileCount = 1;
		
		Needler.TrackType = 1;
		
		Needler.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/NeedleRender.png";
		Needler.ProjectileGlows = true;
		
		Needler.ProjectileSpeed = 2F;
		Needler.Accuracy = 3F;
		Needler.Gravity = 0.004F;
		Needler.MaxEffectiveTicksAlive = 100;
		Needler.ProjectileLivingProperties = "null";
		Needler.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(5, 0, Die)";
		Needler.ProjectileDragInAir = 0.99F;
		Needler.ProjectileDragInWater = 0.5F;
		
		Needler.TrackSensitivity = 0.05F;
		
		weapons.add(new ItemWeapon(Needler));
		
		
		//BeamRifle
		ItemWeaponProperties BeamRifle = new ItemWeaponProperties(Halocraft.MODID+".BeamRifle");
		BeamRifle.Texture = Halocraft.MODID + ":BeamRifle";
		BeamRifle.WeaponModel = new ItemWeaponModel(new ModelBeamRifle(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinBeamRifle.png"));
		BeamRifle.IsAutomaticOrHasSecondaryShoot = false;
		BeamRifle.ZoomMultiplier = new int[]{4, 8};
		BeamRifle.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeBeamRifle.png";
		BeamRifle.ScopeBGOpacity = 0.705F;
		BeamRifle.ScopeProperties = new int[]{355, 209, 177, 104};
		BeamRifle.HasReticle = true;
		BeamRifle.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		BeamRifle.ReticleProperties = new int[]{12, 26, 11, 9, 5, 4};
		BeamRifle.GunShootDelay = 1100L;
		BeamRifle.Recoil = 3F;
		BeamRifle.PerformOnly1ShootSound = true;
		BeamRifle.ShootSound = Halocraft.MODID+":weapons.shoot.BeamRifleShoot";
		//BeamRifle.
		BeamRifle.ReloadTime = 3000L;
		BeamRifle.ReloadSound = Halocraft.MODID+":weapons.reload.BeamRifleReload";
		BeamRifle.ReloadMaxAmmoFlow = 0;
		BeamRifle.ReloadTimeLoop = 0L;
		BeamRifle.ReloadSoundLoop = "";
		BeamRifle.ReloadSoundExit = "";
		BeamRifle.AmmoFeedsFromInventory = false;
		BeamRifle.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.LargeRounds);
		BeamRifle.MagazineSize = 100;
		BeamRifle.ItemStackDecreaseOnUse = false;
		BeamRifle.ItemStackMaxStackSize = 1;
		BeamRifle.RequiredUsesPerShot = 6;
		BeamRifle.ShootBurstCount = 1;
		//BeamRifle.BurstAccuracyDecrease = 0.6F;
		BeamRifle.SingleShotProjectileCount = 1;
		
		BeamRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/PurplePlasmaRender.png";
		BeamRifle.ProjectileGlows = true;
		
		BeamRifle.ProjectileSpeed = 8F;
		BeamRifle.Accuracy = 0.6F;
		BeamRifle.Gravity = 0.004F;
		BeamRifle.MaxEffectiveTicksAlive = 200;
		BeamRifle.ProjectileLivingProperties = "null";
		BeamRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(30, 0, Die)";
		BeamRifle.ProjectileDragInAir = 0.99F;
		BeamRifle.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(BeamRifle));
		
		
		//Flamethrower
		ItemWeaponProperties Flamethrower = new ItemWeaponProperties(Halocraft.MODID+".Flamethrower");
		Flamethrower.Texture = Halocraft.MODID + ":Flamethrower";
		Flamethrower.WeaponModel = new ItemWeaponModel(new ModelFlamethrower(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinFlamethrower.png"));
		Flamethrower.IsAutomaticOrHasSecondaryShoot = true;
		//Flamethrower.ZoomMultiplier = new int[]{2};
		//Flamethrower.ZoomTexture = Halocraft.MODID+":textures/overlays/FlamethrowerOverlay.png";
		Flamethrower.HasReticle = true;
		Flamethrower.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Flamethrower.ReticleProperties = new int[]{208, 97, 47, 47, 23, 23};
		Flamethrower.GunShootDelay = 80L;
		Flamethrower.Recoil = 1F;
		Flamethrower.PerformOnly1ShootSound = true;
		Flamethrower.ShootSound = Halocraft.MODID+":weapons.shoot.FlamethrowerShoot";
		//Flamethrower.
		Flamethrower.ReloadTime = 3000L;
		Flamethrower.ReloadSound = Halocraft.MODID+":weapons.reload.FlamethrowerReload";
		Flamethrower.ReloadMaxAmmoFlow = 0;
		Flamethrower.ReloadTimeLoop = 0L;
		Flamethrower.ReloadSoundLoop = "";
		Flamethrower.ReloadSoundExit = "";
		Flamethrower.AmmoFeedsFromInventory = false;
		Flamethrower.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.SmallRounds);
		Flamethrower.MagazineSize = 100;
		Flamethrower.ItemStackDecreaseOnUse = false;
		Flamethrower.ItemStackMaxStackSize = 1;
		Flamethrower.RequiredUsesPerShot = 1;
		Flamethrower.ShootBurstCount = 1;
		//Flamethrower.BurstAccuracyDecrease = 0.6F;
		Flamethrower.SingleShotProjectileCount = 1;
		
		Flamethrower.ProjectileRenderProperties = "1#"+Halocraft.MODID+":textures/entities/FireParticle.png";
		Flamethrower.ProjectileGlows = true;
		
		Flamethrower.ProjectileSpeed = 0.6F;
		Flamethrower.Accuracy = 5F;
		Flamethrower.Gravity = 0.002F;
		Flamethrower.MaxEffectiveTicksAlive = 100;
		Flamethrower.ProjectileLivingProperties = "net.killerchief.halocraft.config.NewWeaponTags.ParticleFXFlame()";
		Flamethrower.ProjectileImpactProperties = "IsInLiquid(Die), ImpactEntity(4, 0, SetEntityOnFire(5, Die)), net.killerchief.halocraft.config.NewWeaponTags.onImpactFireParticle()";
		Flamethrower.ProjectileDragInAir = 0.96F;
		Flamethrower.ProjectileDragInWater = 0.1F;
		
		weapons.add(new ItemWeapon(Flamethrower));
		
		
		//Spiker
		ItemWeaponProperties Spiker = new ItemWeaponProperties(Halocraft.MODID+".Spiker");
		Spiker.Texture = Halocraft.MODID + ":Spiker";
		Spiker.WeaponModel = new ItemWeaponModel(new ModelSpiker(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSpiker.png"));
		Spiker.IsAutomaticOrHasSecondaryShoot = true;
		//Spiker.ZoomMultiplier = new int[]{2};
		//Spiker.ZoomTexture = Halocraft.MODID+":textures/overlays/SpikerOverlay.png";
		Spiker.HasReticle = true;
		Spiker.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Spiker.ReticleProperties = new int[]{77, 33, 37, 35, 18, 17};
		Spiker.GunShootDelay = 90L;
		Spiker.Recoil = 1.5F;
		Spiker.PerformOnly1ShootSound = true;
		Spiker.ShootSound = Halocraft.MODID+":weapons.shoot.SpikeRifleShoot";
		//Spiker.
		Spiker.ReloadTime = 1800L;
		Spiker.ReloadSound = Halocraft.MODID+":weapons.reload.SpikeRifleReload";
		Spiker.ReloadMaxAmmoFlow = 0;
		Spiker.ReloadTimeLoop = 0L;
		Spiker.ReloadSoundLoop = "";
		Spiker.ReloadSoundExit = "";
		Spiker.AmmoFeedsFromInventory = false;
		Spiker.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		Spiker.MagazineSize = 40;
		Spiker.ItemStackDecreaseOnUse = false;
		Spiker.ItemStackMaxStackSize = 1;
		Spiker.RequiredUsesPerShot = 1;
		Spiker.ShootBurstCount = 1;
		//Spiker.BurstAccuracyDecrease = 0.6F;
		Spiker.SingleShotProjectileCount = 1;
		
		Spiker.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/SpikeRender.png";
		Spiker.ProjectileGlows = true;
		
		Spiker.ProjectileSpeed = 1.8F;
		Spiker.Accuracy = 7F;
		Spiker.Gravity = 0.004F;
		Spiker.MaxEffectiveTicksAlive = 100;
		Spiker.ProjectileLivingProperties = "null";
		Spiker.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), Bounce(0.97, 1, ExceededMaxEncounteredEntities(2, Die)), ImpactEntity(5, 0, Die)";
		Spiker.ProjectileDragInAir = 0.99F;
		Spiker.ProjectileDragInWater = 0.5F;
		
		//BounceFactor = 0.97D;
		//RicochetFactor = 1D;
		//MaxAllowedEncounteredEntities = 2;
		
		weapons.add(new ItemWeapon(Spiker));
		
		
		//Mauler
		ItemWeaponProperties Mauler = new ItemWeaponProperties(Halocraft.MODID+".Mauler");
		Mauler.Texture = Halocraft.MODID + ":Mauler";
		Mauler.WeaponModel = new ItemWeaponModel(new ModelMauler(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinMauler.png"));
		Mauler.IsAutomaticOrHasSecondaryShoot = false;
		//Mauler.ZoomMultiplier = new int[]{2};
		//Mauler.ZoomTexture = Halocraft.MODID+":textures/overlays/MaulerOverlay.png";
		Mauler.HasReticle = true;
		Mauler.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		Mauler.ReticleProperties = new int[]{1, 75, 41, 41, 20, 20};
		Mauler.GunShootDelay = 500L;
		Mauler.Recoil = 6F;
		Mauler.PerformOnly1ShootSound = true;
		Mauler.ShootSound = Halocraft.MODID+":weapons.shoot.MaulerShoot";
		//Mauler.
		Mauler.ReloadTime = 1600L;
		Mauler.ReloadSound = Halocraft.MODID+":weapons.reload.MaulerReload";
		Mauler.ReloadMaxAmmoFlow = 0;
		Mauler.ReloadTimeLoop = 0L;
		Mauler.ReloadSoundLoop = "";
		Mauler.ReloadSoundExit = "";
		Mauler.AmmoFeedsFromInventory = false;
		Mauler.AmmoType = new ItemStack(HalocraftItemsWeapons.ShotgunRounds);
		Mauler.MagazineSize = 5;
		Mauler.ItemStackDecreaseOnUse = false;
		Mauler.ItemStackMaxStackSize = 1;
		Mauler.RequiredUsesPerShot = 1;
		Mauler.ShootBurstCount = 1;
		//Mauler.BurstAccuracyDecrease = 0.6F;
		Mauler.SingleShotProjectileCount = 8;
		
		Mauler.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/LeadShotRender.png";
		Mauler.ProjectileGlows = false;
		
		Mauler.ProjectileSpeed = 6F;
		Mauler.Accuracy = 10F;
		Mauler.Gravity = 0.004F;
		Mauler.MaxEffectiveTicksAlive = 1;
		Mauler.ProjectileLivingProperties = "null";
		Mauler.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		Mauler.ProjectileDragInAir = 0.96F;
		Mauler.ProjectileDragInWater = 0.1F;
		
		weapons.add(new ItemWeapon(Mauler));
		
		
		//FragGrenade
		ItemWeaponProperties FragGrenade = new ItemWeaponProperties(Halocraft.MODID+".FragGrenade");
		FragGrenade.Texture = Halocraft.MODID + ":FragGrenade";
		FragGrenade.AimItem = false;
		FragGrenade.IsAutomaticOrHasSecondaryShoot = false;
		FragGrenade.GunShootDelay = 700L;
		FragGrenade.Recoil = 2F;
		FragGrenade.PerformOnly1ShootSound = true;
		FragGrenade.ShootSound = Halocraft.MODID+":weapons.FragThrow";
		//FragGrenade.
		//FragGrenade.ReloadTime = 0;
		//FragGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		//FragGrenade.ReloadMaxAmmoFlow = 0;
		//FragGrenade.ReloadTimeLoop = 0L;
		//FragGrenade.ReloadSoundLoop = "";
		//FragGrenade.ReloadSoundExit = "";
		//FragGrenade.AmmoFeedsFromInventory = false;
		//FragGrenade.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		//FragGrenade.MagazineSize = 36;
		FragGrenade.ItemStackDecreaseOnUse = true;
		FragGrenade.ItemStackMaxStackSize = 8;
		FragGrenade.RequiredUsesPerShot = 1;
		FragGrenade.ShootBurstCount = 1;
		//FragGrenade.BurstAccuracyDecrease = 0.6F;
		FragGrenade.SingleShotProjectileCount = 1;
		
		if (HalocraftConfig.UseGrenade3DModels)
			FragGrenade.ProjectileRenderProperties = "2#"+Halocraft.MODID+":textures/entities/FragGrenadeRender.png#net.killerchief.halocraft.client.models.grenades.ModelFragGrenade";
		else
			FragGrenade.ProjectileRenderProperties = "1#"+Halocraft.MODID+":textures/items/FragGrenade.png";
		FragGrenade.ProjectileGlows = false;
		
		FragGrenade.ProjectileSpeed = 1.5F;
		FragGrenade.Accuracy = 1F;
		//FragGrenade.Damage = 1;
		FragGrenade.Gravity = 0.04F;
		FragGrenade.MaxEffectiveTicksAlive = 600;
		FragGrenade.ProjectileLivingProperties = "Fuse(Explode(3.5, Die)), net.killerchief.halocraft.config.NewWeaponTags.ParticleFX()";
		FragGrenade.ProjectileImpactProperties = "Bounce(0.2, -1, callTags(PlaySound(1,"+Halocraft.MODID+":weapons.FragBounceStone"+",null), StartFuse(20, null))), ImpactEntity(1, 0, callTags(PlaySound(1,"+Halocraft.MODID+":weapons.FragBounceStone"+",null), StartFuse(20, null)))";
		FragGrenade.ProjectileDragInAir = 0.99F;
		FragGrenade.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(FragGrenade));
		
		
		//PlasmaGrenade
		ItemWeaponProperties PlasmaGrenade = new ItemWeaponProperties(Halocraft.MODID+".PlasmaGrenade");
		PlasmaGrenade.Texture = Halocraft.MODID + ":PlasmaGrenade";
		PlasmaGrenade.AimItem = false;
		PlasmaGrenade.IsAutomaticOrHasSecondaryShoot = false;
		PlasmaGrenade.GunShootDelay = 700L;
		PlasmaGrenade.Recoil = 2F;
		PlasmaGrenade.PerformOnly1ShootSound = true;
		PlasmaGrenade.ShootSound = Halocraft.MODID+":weapons.PlasmaGrenadeThrow";
		//PlasmaGrenade.
		//PlasmaGrenade.ReloadTime = 0;
		//PlasmaGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		//PlasmaGrenade.ReloadMaxAmmoFlow = 0;
		//PlasmaGrenade.ReloadTimeLoop = 0L;
		//PlasmaGrenade.ReloadSoundLoop = "";
		//PlasmaGrenade.ReloadSoundExit = "";
		//PlasmaGrenade.AmmoFeedsFromInventory = false;
		//PlasmaGrenade.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		//PlasmaGrenade.MagazineSize = 36;
		PlasmaGrenade.ItemStackDecreaseOnUse = true;
		PlasmaGrenade.ItemStackMaxStackSize = 8;
		PlasmaGrenade.RequiredUsesPerShot = 1;
		PlasmaGrenade.ShootBurstCount = 1;
		//PlasmaGrenade.BurstAccuracyDecrease = 0.6F;
		PlasmaGrenade.SingleShotProjectileCount = 1;
		
		if (HalocraftConfig.UseGrenade3DModels)
			PlasmaGrenade.ProjectileRenderProperties = "2#"+Halocraft.MODID+":textures/entities/PlasmaGrenadeRender.png#net.killerchief.halocraft.client.models.grenades.ModelPlasmaGrenade";
		else
			PlasmaGrenade.ProjectileRenderProperties = "1#"+Halocraft.MODID+":textures/items/PlasmaGrenade.png";
		PlasmaGrenade.ProjectileGlows = true;
		
		PlasmaGrenade.ProjectileSpeed = 1.5F;
		PlasmaGrenade.Accuracy = 1F;
		PlasmaGrenade.Gravity = 0.04F;
		PlasmaGrenade.MaxEffectiveTicksAlive = 600;
		PlasmaGrenade.ProjectileLivingProperties = "Fuse(callTags(HurtStuck(20, 0, null), Explode(3.5, Die))), net.killerchief.halocraft.config.NewWeaponTags.ParticleFX()";
		PlasmaGrenade.ProjectileImpactProperties = "Bounce(0.1, -1, callTags(PlaySound(1,"+Halocraft.MODID+":weapons.FragBounceStone"+",null), StartFuse(30, null))), StickEntity(PlaySound(0,"+Halocraft.MODID+":weapons.PlasmaGrenadeStick"+", ImpactEntity(1, 0, callTags(PlaySound(1,"+Halocraft.MODID+":weapons.FragBounceStone"+",null), StartFuse(30, null)))))";
		PlasmaGrenade.ProjectileDragInAir = 0.99F;
		PlasmaGrenade.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(PlasmaGrenade));
		
		
		//FirebombGrenade
		ItemWeaponProperties FirebombGrenade = new ItemWeaponProperties(Halocraft.MODID+".FirebombGrenade");
		FirebombGrenade.Texture = Halocraft.MODID + ":FirebombGrenade";
		FirebombGrenade.AimItem = false;
		FirebombGrenade.IsAutomaticOrHasSecondaryShoot = false;
		FirebombGrenade.GunShootDelay = 700L;
		FirebombGrenade.Recoil = 2F;
		FirebombGrenade.PerformOnly1ShootSound = true;
		FirebombGrenade.ShootSound = Halocraft.MODID+":weapons.FirebombThrow";
		//FirebombGrenade.
		//FirebombGrenade.ReloadTime = 0;
		//FirebombGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.FirebombGrenadeReload";
		//FirebombGrenade.ReloadMaxAmmoFlow = 0;
		//FirebombGrenade.ReloadTimeLoop = 0L;
		//FirebombGrenade.ReloadSoundLoop = "";
		//FirebombGrenade.ReloadSoundExit = "";
		//FirebombGrenade.AmmoFeedsFromInventory = false;
		//FirebombGrenade.AmmoType = new ItemStack(HalocraftItemsWeapons.MediumRounds);
		//FirebombGrenade.MagazineSize = 36;
		FirebombGrenade.ItemStackDecreaseOnUse = true;
		FirebombGrenade.ItemStackMaxStackSize = 8;
		FirebombGrenade.RequiredUsesPerShot = 1;
		FirebombGrenade.ShootBurstCount = 1;
		//FirebombGrenade.BurstAccuracyDecrease = 0.6F;
		FirebombGrenade.SingleShotProjectileCount = 1;
		
		if (HalocraftConfig.UseGrenade3DModels)
			FirebombGrenade.ProjectileRenderProperties = "2#"+Halocraft.MODID+":textures/entities/FirebombGrenadeRender.png#net.killerchief.halocraft.client.models.grenades.ModelFirebombGrenade";
		else
			FirebombGrenade.ProjectileRenderProperties = "1#"+Halocraft.MODID+":textures/items/FirebombGrenade.png";
		FirebombGrenade.ProjectileGlows = true;
		
		FirebombGrenade.ProjectileSpeed = 1.5F;
		FirebombGrenade.Accuracy = 1F;
		FirebombGrenade.Gravity = 0.04F;
		FirebombGrenade.MaxEffectiveTicksAlive = 600;
		FirebombGrenade.ProjectileLivingProperties = "net.killerchief.halocraft.config.NewWeaponTags.ParticleFXFire()";
		FirebombGrenade.ProjectileImpactProperties = "IsInLiquid(Die), net.killerchief.halocraft.config.NewWeaponTags.onImpactFirebomb(), Die";
		FirebombGrenade.ProjectileDragInAir = 0.98F;
		FirebombGrenade.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(FirebombGrenade));
		
		
		//SpikeGrenade TODO
		/*ItemWeaponProperties SpikeGrenade = new ItemWeaponProperties(Halocraft.MODID+".SpikeGrenade");
		SpikeGrenade.Texture = Halocraft.MODID + ":SpikeGrenade";
		
		/*this.GunDelay = 10;
		this.Recoil = 2F;
		this.ShootSound = Halocraft.MODID+":weapons.SpikeGrenadeThrow";
		this.BulletType = 0;
		this.Gravity = 0.04F;
		this.ProjectileSpeed = 1.5F;
		this.Accuracy = 1.0F;
		this.Damage = 20;
		this.BounceFactor = 0.1D;
		this.Fuse = 30;
		this.MaxEffectiveTicksAlive = 500;
		this.ProjectileType = EntityProjectile.EnumType.SpikeGrenade5.getValue();*/
		
		//weapons[19] = new ItemWeapon(SpikeGrenade);
		
		ItemWeaponProperties SentinelBeam = new ItemWeaponProperties(Halocraft.MODID+".SentinelBeam");
		SentinelBeam.Texture = Halocraft.MODID + ":SentinelBeam";
		SentinelBeam.WeaponModel = new ItemWeaponModel(new ModelSentinelBeam(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSentinelBeam.png"));//SkinSentinelBeamMajor
		SentinelBeam.IsAutomaticOrHasSecondaryShoot = true;
		//SentinelBeam.ZoomMultiplier = new int[]{2};
		//SentinelBeam.ZoomTexture = Halocraft.MODID+":textures/overlays/SentinelBeamOverlay.png";
		SentinelBeam.HasReticle = true;
		SentinelBeam.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		SentinelBeam.ReticleProperties = new int[]{125, 75, 23, 13, 11, 6};
		SentinelBeam.GunShootDelay = 50L;
		SentinelBeam.Recoil = 0.8F;
		SentinelBeam.PerformOnly1ShootSound = true;
		SentinelBeam.ShootSound = Halocraft.MODID+":weapons.shoot.SentinelBeamShoot";
		//SentinelBeam.
		SentinelBeam.ReloadTime = 3000L;
		SentinelBeam.ReloadSound = Halocraft.MODID+":weapons.reload.SentinelBeamReload";
		SentinelBeam.ReloadMaxAmmoFlow = 0;
		SentinelBeam.ReloadTimeLoop = 0L;
		SentinelBeam.ReloadSoundLoop = "";
		SentinelBeam.ReloadSoundExit = "";
		SentinelBeam.AmmoFeedsFromInventory = false;
		SentinelBeam.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.SmallRounds);
		SentinelBeam.MagazineSize = 60;
		SentinelBeam.ItemStackDecreaseOnUse = false;
		SentinelBeam.ItemStackMaxStackSize = 1;
		SentinelBeam.RequiredUsesPerShot = 1;
		SentinelBeam.ShootBurstCount = 1;
		//SentinelBeam.BurstAccuracyDecrease = 0.6F;
		SentinelBeam.SingleShotProjectileCount = 1;
		
		SentinelBeam.ProjectileRenderProperties = "3#"+Halocraft.MODID+":textures/entities/BlueBeamRender.png";
		SentinelBeam.ProjectileGlows = true;
		
		SentinelBeam.ProjectileSpeed = 8F;
		SentinelBeam.Accuracy = 0.4F;
		SentinelBeam.Gravity = 0.0F;
		SentinelBeam.MaxEffectiveTicksAlive = 100;
		SentinelBeam.ProjectileLivingProperties = "null";
		SentinelBeam.ProjectileImpactProperties = "PlaySound(0,"+Halocraft.MODID+":weapons.SentinelBeamImpact"+", null), *ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		SentinelBeam.ProjectileDragInAir = 1F;
		SentinelBeam.ProjectileDragInWater = 1F;
		
		weapons.add(new ItemWeapon(SentinelBeam));

		
		
		//Ghost Plasma Bolts
		ItemWeaponProperties GhostPlasmaBolts = new ItemWeaponProperties(Halocraft.MODID+".Vehicle.GhostPlasmaBolts");
		GhostPlasmaBolts.RegisterItem = false;
		GhostPlasmaBolts.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		GhostPlasmaBolts.ProjectileGlows = true;
		GhostPlasmaBolts.ProjectileSpeed = 4F;
		GhostPlasmaBolts.Accuracy = 4F;
		GhostPlasmaBolts.Gravity = 0.004F;
		GhostPlasmaBolts.MaxEffectiveTicksAlive = 80;
		GhostPlasmaBolts.ProjectileImpactProperties = "";
		//Used as a test: GhostPlasmaBolts.ProjImpactActArgs = new Object[]{new Object[]{"net.killerchief.halocraft.config.NewWeaponTags.ParticleFXRocket", new Object[]{}}, new Object[]{"ImpactEntity", new Object[]{"6", "0", new Object[]{"Explode",new Object[]{"1",new Object[]{"Explode",new Object[]{"2",new Object[]{"Die"}}}}}}}, new Object[]{new Object[]{"Die"}}};
		GhostPlasmaBolts.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"6", "0", "Die"}}};
		GhostPlasmaBolts.ProjectileDragInAir = 0.99F;
		GhostPlasmaBolts.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(GhostPlasmaBolts));


		//Warthog Turret
		ItemWeaponProperties ChainGunBullet = new ItemWeaponProperties(Halocraft.MODID+".Vehicle.ChainGunBullet");
		ChainGunBullet.RegisterItem = false;
		ChainGunBullet.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		ChainGunBullet.ProjectileGlows = false;
		ChainGunBullet.ProjectileSpeed = 7F;
		ChainGunBullet.Accuracy = 5F;
		ChainGunBullet.Gravity = 0.004F;
		ChainGunBullet.MaxEffectiveTicksAlive = 80;
		ChainGunBullet.ProjectileImpactProperties = "";
		ChainGunBullet.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"2", "0", "Die"}}};
		ChainGunBullet.ProjectileDragInAir = 0.99F;
		ChainGunBullet.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(ChainGunBullet));
		
		
		
		//Warthog Gauss Turret
		ItemWeaponProperties GaussSlug = new ItemWeaponProperties(Halocraft.MODID+".Vehicle.GaussSlug");
		GaussSlug.RegisterItem = false;
		GaussSlug.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BulletRender.png";
		GaussSlug.ProjectileGlows = false;
		GaussSlug.ProjectileSpeed = 6F;
		GaussSlug.Accuracy = 1F;
		GaussSlug.Gravity = 0.004F;
		GaussSlug.MaxEffectiveTicksAlive = 80;
		GaussSlug.ProjectileLivingProperties = "net.killerchief.halocraft.config.NewWeaponTags.ParticleFXRocket()";
		GaussSlug.ProjectileImpactProperties = "ImpactEntity(40, 0, null), Explode(2, Die), Die";
		GaussSlug.ProjectileDragInAir = 0.99F;
		GaussSlug.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(GaussSlug));
		

		
		//Elite Carbine
		ItemWeaponProperties EliteCarbine = new ItemWeaponProperties(Halocraft.MODID+".Mob.EliteCarbine");
		EliteCarbine.RegisterItem = false;
		EliteCarbine.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		EliteCarbine.ProjectileGlows = true;
		EliteCarbine.ProjectileSpeed = 8F;
		EliteCarbine.Accuracy = 2F;
		EliteCarbine.Gravity = 0.004F;
		EliteCarbine.MaxEffectiveTicksAlive = 100;
		EliteCarbine.ProjectileImpactProperties = "";
		EliteCarbine.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"4", "0", "Die"}}};
		EliteCarbine.ProjectileDragInAir = 0.99F;
		EliteCarbine.ProjectileDragInWater = 0.5F;

		weapons.add(new ItemWeapon(EliteCarbine));
		

		//Elite Plasma Rifle
		ItemWeaponProperties ElitePlasmaRifle = new ItemWeaponProperties(Halocraft.MODID+".Mob.ElitePlasmaRifle");
		ElitePlasmaRifle.RegisterItem = false;
		ElitePlasmaRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		ElitePlasmaRifle.ProjectileGlows = true;
		ElitePlasmaRifle.ProjectileSpeed = 4F;
		ElitePlasmaRifle.Accuracy = 5F;
		ElitePlasmaRifle.Gravity = 0.004F;
		ElitePlasmaRifle.MaxEffectiveTicksAlive = 80;
		ElitePlasmaRifle.ProjectileImpactProperties = "";
		ElitePlasmaRifle.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"2", "0", "Die"}}};
		ElitePlasmaRifle.ProjectileDragInAir = 0.99F;
		ElitePlasmaRifle.ProjectileDragInWater = 0.5F;

		weapons.add(new ItemWeapon(ElitePlasmaRifle));
		

		//Grunt Plasma Pistol
		ItemWeaponProperties GruntPlasmaPistol = new ItemWeaponProperties(Halocraft.MODID+".Mob.GruntPlasmaPistol");
		GruntPlasmaPistol.RegisterItem = false;
		GruntPlasmaPistol.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		GruntPlasmaPistol.ProjectileGlows = true;
		GruntPlasmaPistol.ProjectileSpeed = 2F;
		GruntPlasmaPistol.Accuracy = 4F;
		GruntPlasmaPistol.Gravity = 0.004F;
		GruntPlasmaPistol.MaxEffectiveTicksAlive = 80;
		GruntPlasmaPistol.ProjectileImpactProperties = "";
		GruntPlasmaPistol.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"2", "0", "Die"}}};
		GruntPlasmaPistol.ProjectileDragInAir = 0.99F;
		GruntPlasmaPistol.ProjectileDragInWater = 0.5F;
		
		weapons.add(new ItemWeapon(GruntPlasmaPistol));
		
		
		//BruteShot
		ItemWeaponProperties BruteShot = new ItemWeaponProperties(Halocraft.MODID+".BruteShot");
		BruteShot.Texture = Halocraft.MODID + ":BruteShot";
		BruteShot.WeaponModel = new ItemWeaponModel(new ModelBruteShot(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinBruteShot.png"));
		BruteShot.IsAutomaticOrHasSecondaryShoot = false;
		//BruteShot.ZoomMultiplier = new int[]{2};
		//BruteShot.ZoomTexture = Halocraft.MODID+":textures/overlays/MagnumOverlay.png";
		BruteShot.HasReticle = true;
		BruteShot.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		BruteShot.ReticleProperties = new int[]{85, 75, 39, 21, 19, 10};
		BruteShot.GunShootDelay = 600L;
		BruteShot.Recoil = 8F;
		BruteShot.PerformOnly1ShootSound = true;
		BruteShot.ShootSound = Halocraft.MODID+":weapons.shoot.BruteShotShoot";
		//BruteShot.
		BruteShot.ReloadTime = 2600L;
		BruteShot.ReloadSound = Halocraft.MODID+":weapons.reload.BruteShotReload";
		BruteShot.ReloadMaxAmmoFlow = 0;
		BruteShot.ReloadTimeLoop = 0L;
		BruteShot.ReloadSoundLoop = "";
		BruteShot.ReloadSoundExit = "";
		BruteShot.AmmoFeedsFromInventory = false;
		BruteShot.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		BruteShot.MagazineSize = 6;
		BruteShot.ItemStackDecreaseOnUse = false;
		BruteShot.ItemStackMaxStackSize = 1;
		BruteShot.RequiredUsesPerShot = 1;
		BruteShot.ShootBurstCount = 1;
		//BruteShot.BurstAccuracyDecrease = 0.6F;
		BruteShot.SingleShotProjectileCount = 1;

		BruteShot.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BruteShotRender.png";
		BruteShot.ProjectileGlows = false;

		BruteShot.ProjectileSpeed = 0.8F;
		BruteShot.Accuracy = 4F;
		BruteShot.Gravity = 0.01F;
		BruteShot.MaxEffectiveTicksAlive = 500;
		BruteShot.ProjectileLivingProperties = "Fuse(Explode(2, Die)), net.killerchief.halocraft.config.NewWeaponTags.ParticleFX()";
		BruteShot.ProjectileImpactProperties = "ImpactEntity(8, 0, Explode(2, Die)), Bounce(0.97, 1.2, StartFuse(6, PlaySound(1,"+Halocraft.MODID+":weapons.BruteShotBounce"+", ExceededMaxEncounteredEntities(1, Explode(2, Die)) )), Explode(2, Die))";
		BruteShot.ProjectileDragInAir = 0.999F;
		BruteShot.ProjectileDragInWater = 0.5F;

		weapons.add(new ItemWeapon(BruteShot));
		
		

		//FuelRodCannon
		ItemWeaponProperties FuelRodCannon = new ItemWeaponProperties(Halocraft.MODID+".FuelRodCannon");
		FuelRodCannon.Texture = Halocraft.MODID + ":FuelRodCannon";
		//FuelRodCannon.WeaponModel = new ItemWeaponModel(new ModelFuelRodCannon(), new ResourceLocation(Halocraft.MODID+":textures/guns/SkinFuelRodCannon.png"));
		FuelRodCannon.IsAutomaticOrHasSecondaryShoot = false;
		FuelRodCannon.ZoomMultiplier = new int[]{2};
		FuelRodCannon.ScopeTexture = Halocraft.MODID+":textures/overlays/ScopeRocketLauncher.png";
		FuelRodCannon.ScopeBGOpacity = 0.47F;
		FuelRodCannon.ScopeProperties = new int[]{151, 151, 75, 75};
		FuelRodCannon.HasReticle = true;
		FuelRodCannon.ReticleTexture = Halocraft.MODID+":textures/overlays/Reticle.png";
		FuelRodCannon.ReticleProperties = new int[]{208, 49, 47, 47, 23, 23};
		FuelRodCannon.GunShootDelay = 800L;
		FuelRodCannon.Recoil = 10F;
		FuelRodCannon.PerformOnly1ShootSound = true;
		FuelRodCannon.ShootSound = Halocraft.MODID+":weapons.shoot.FuelRodCannonShoot";
		//FuelRodCannon.
		FuelRodCannon.ReloadTime = 3000L;
		FuelRodCannon.ReloadSound = Halocraft.MODID+":weapons.reload.FuelRodCannonReload";
		FuelRodCannon.ReloadMaxAmmoFlow = 0;
		FuelRodCannon.ReloadTimeLoop = 0L;
		FuelRodCannon.ReloadSoundLoop = "";
		FuelRodCannon.ReloadSoundExit = "";
		FuelRodCannon.AmmoFeedsFromInventory = false;
		FuelRodCannon.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		FuelRodCannon.MagazineSize = 5;
		FuelRodCannon.ItemStackDecreaseOnUse = false;
		FuelRodCannon.ItemStackMaxStackSize = 1;
		FuelRodCannon.RequiredUsesPerShot = 1;
		FuelRodCannon.ShootBurstCount = 1;
		//FuelRodCannon.BurstAccuracyDecrease = 0.6F;
		FuelRodCannon.SingleShotProjectileCount = 1;

		FuelRodCannon.ProjectileRenderProperties = "3#"+Halocraft.MODID+":textures/entities/FuelRodRender.png";
		FuelRodCannon.ProjectileGlows = true;

		FuelRodCannon.ProjectileSpeed = 1.2F;
		FuelRodCannon.Accuracy = 2F;
		FuelRodCannon.Gravity = 0.004F;
		FuelRodCannon.MaxEffectiveTicksAlive = 1000;
		FuelRodCannon.ProjectileLivingProperties = "StartFuse2(300, null), net.killerchief.halocraft.config.NewWeaponTags.ParticleFX()";
		FuelRodCannon.ProjectileImpactProperties = "ImpactEntity(30, 0, PlaySound(1,"+Halocraft.MODID+":weapons.FuelRodExplode"+", Explode(4, Die))), Fuse2(PlaySound(1,"+Halocraft.MODID+":weapons.FuelRodExplode"+", Explode(4, Die))), Bounce(0.97, 1.0, PlaySound(1,"+Halocraft.MODID+":weapons.FuelRodBounce"+", Continue )), PlaySound(1,"+Halocraft.MODID+":weapons.FuelRodExplode"+", Explode(4, Die))";
		FuelRodCannon.ProjectileDragInAir = 0.999F;
		FuelRodCannon.ProjectileDragInWater = 0.5F;

		weapons.add(new ItemWeapon(FuelRodCannon));
		
		
		
		if (KCWeaponMod.registerModItems(Halocraft.MODID, "1.4", weapons.toArray(new ItemWeapon[weapons.size()])))
		{
			System.out.println("KCWeaponMod: Successfully Registered Halocraft Weapons");
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Halocraft Weapons Were NOT Registered!");
		}
	}
	
	//GruntPlasmaPistol.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
	public static Object[] ImpactBlockObject = new Object[]{"ImpactBlock", new Object[]{new Block[]{Blocks.tallgrass, Blocks.vine}, new Block[]{Blocks.glass, Blocks.leaves, Blocks.glass_pane, Blocks.yellow_flower, Blocks.red_flower, Blocks.brown_mushroom, Blocks.red_mushroom, Blocks.reeds, Blocks.deadbush, Blocks.waterlily, Blocks.flower_pot, Blocks.cocoa, Blocks.double_plant, Blocks.stained_glass, Blocks.stained_glass_pane}, "Die"}};
	
}
