package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.ItemWeaponProperties;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.item.ItemStack;

public class InitHcWeapons {
	
	public static void DefineAndSendWeapons()
	{
		ItemWeapon[] weapons = new ItemWeapon[20];
		
		
		//BattleRifle
		ItemWeaponProperties BattleRifle = new ItemWeaponProperties();
		BattleRifle.Name = Halocraft.MODID+".BattleRifle";
		BattleRifle.Texture = Halocraft.MODID + ":BattleRifle";
		BattleRifle.IsAutomaticOrHasSecondaryShoot = false;
		BattleRifle.IsZoomable = true;
		BattleRifle.ZoomMultiplier = new int[]{3};
		BattleRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/BattleRifleOverlay.png";
		BattleRifle.GunShootDelay = 20;
		BattleRifle.Recoil = 0.7F;
		BattleRifle.PerformOnly1ShootSound = true;
		BattleRifle.ShootSound = Halocraft.MODID+":weapons.shoot.BattleRifleShoot";
		//BattleRifle.
		BattleRifle.ReloadTime = 40;
		BattleRifle.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		BattleRifle.ReloadMaxAmmoFlow = 0;
		BattleRifle.ReloadTimeLoop = 0;
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
		BattleRifle.ProjectileLivingProperties = "";
		BattleRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		BattleRifle.ProjectileDragInAir = 0.99F;
		BattleRifle.ProjectileDragInWater = 0.5F;
		
		//BattleRifle.TrackSensitivity = 0;
		
		weapons[0] = new ItemWeapon(BattleRifle);
		
		
		//DMR
		ItemWeaponProperties DMR = new ItemWeaponProperties();
		DMR.Name = Halocraft.MODID+".DMR";
		DMR.Texture = Halocraft.MODID + ":DMR";
		DMR.IsAutomaticOrHasSecondaryShoot = false;
		DMR.IsZoomable = true;
		DMR.ZoomMultiplier = new int[]{4};
		DMR.ZoomTexture = Halocraft.MODID+":textures/overlays/DMROverlay.png";
		DMR.GunShootDelay = 10;
		DMR.Recoil = 2F;
		DMR.PerformOnly1ShootSound = true;
		DMR.ShootSound = Halocraft.MODID+":weapons.shoot.DMRShoot";
		//DMR.
		DMR.ReloadTime = 44;
		DMR.ReloadSound = Halocraft.MODID+":weapons.reload.DMRReload";
		DMR.ReloadMaxAmmoFlow = 0;
		DMR.ReloadTimeLoop = 0;
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
		DMR.ProjectileLivingProperties = "";
		DMR.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		DMR.ProjectileDragInAir = 0.99F;
		DMR.ProjectileDragInWater = 0.5F;
		
		//DMR.TrackSensitivity = 0;
		
		weapons[1] = new ItemWeapon(DMR);
		
		
		//AssaultRifle
		ItemWeaponProperties AssaultRifle = new ItemWeaponProperties();
		AssaultRifle.Name = Halocraft.MODID+".AssaultRifle";
		AssaultRifle.Texture = Halocraft.MODID + ":AssaultRifle";
		AssaultRifle.IsAutomaticOrHasSecondaryShoot = true;
		AssaultRifle.IsZoomable = false;
		//AssaultRifle.ZoomMultiplier = new int[]{2};
		//AssaultRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/AssaultRifleOverlay.png";
		AssaultRifle.GunShootDelay = 2;
		AssaultRifle.Recoil = 2F;
		AssaultRifle.PerformOnly1ShootSound = true;
		AssaultRifle.ShootSound = Halocraft.MODID+":weapons.shoot.AssaultRifleShoot";
		//AssaultRifle.
		AssaultRifle.ReloadTime = 48;
		AssaultRifle.ReloadSound = Halocraft.MODID+":weapons.reload.AssaultRifleReload";
		AssaultRifle.ReloadMaxAmmoFlow = 0;
		AssaultRifle.ReloadTimeLoop = 0;
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
		AssaultRifle.ProjectileLivingProperties = "";
		AssaultRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		AssaultRifle.ProjectileDragInAir = 0.99F;
		AssaultRifle.ProjectileDragInWater = 0.5F;
		
		//AssaultRifle.TrackSensitivity = 0;
		
		weapons[2] = new ItemWeapon(AssaultRifle);
		
		
		//Shotgun
		ItemWeaponProperties Shotgun = new ItemWeaponProperties();
		Shotgun.Name = Halocraft.MODID+".Shotgun";
		Shotgun.Texture = Halocraft.MODID + ":Shotgun";
		Shotgun.IsAutomaticOrHasSecondaryShoot = false;
		Shotgun.IsZoomable = false;
		//Shotgun.ZoomMultiplier = new int[]{4};
		//Shotgun.ZoomTexture = Halocraft.MODID+":textures/overlays/ShotgunOverlay.png";
		Shotgun.GunShootDelay = 30;
		Shotgun.Recoil = 6F;
		Shotgun.PerformOnly1ShootSound = true;
		Shotgun.ShootSound = Halocraft.MODID+":weapons.shoot.ShotgunShoot";
		//Shotgun.
		Shotgun.ReloadTime = 25;
		Shotgun.ReloadSound = Halocraft.MODID+":weapons.reload.ShotgunReloadEnter";
		Shotgun.ReloadMaxAmmoFlow = 1;
		Shotgun.ReloadTimeLoop = 16;
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
		Shotgun.ProjectileLivingProperties = "";
		Shotgun.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		Shotgun.ProjectileDragInAir = 0.96F;
		Shotgun.ProjectileDragInWater = 0.1F;
		
		//Shotgun.TrackSensitivity = 0;
		
		weapons[3] = new ItemWeapon(Shotgun);
		
		
		//SniperRifle
		ItemWeaponProperties SniperRifle = new ItemWeaponProperties();
		SniperRifle.Name = Halocraft.MODID+".SniperRifle";
		SniperRifle.Texture = Halocraft.MODID + ":SniperRifle";
		SniperRifle.IsAutomaticOrHasSecondaryShoot = false;
		SniperRifle.IsZoomable = true;
		SniperRifle.ZoomMultiplier = new int[]{4, 8};
		SniperRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/SniperRifleOverlay.png";
		SniperRifle.GunShootDelay = 40;
		SniperRifle.Recoil = 4F;
		SniperRifle.PerformOnly1ShootSound = true;
		SniperRifle.ShootSound = Halocraft.MODID+":weapons.shoot.SniperRifleShoot";
		//SniperRifle.
		SniperRifle.ReloadTime = 60;
		SniperRifle.ReloadSound = Halocraft.MODID+":weapons.reload.SniperRifleReload";
		SniperRifle.ReloadMaxAmmoFlow = 0;
		SniperRifle.ReloadTimeLoop = 0;
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
		SniperRifle.ProjectileLivingProperties = "";
		SniperRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(30, 0, Die)";
		SniperRifle.ProjectileDragInAir = 0.99F;
		SniperRifle.ProjectileDragInWater = 0.5F;
		
		//SniperRifle.TrackSensitivity = 0;
		
		weapons[4] = new ItemWeapon(SniperRifle);
		
		
		//Magnum
		ItemWeaponProperties Magnum = new ItemWeaponProperties();
		Magnum.Name = Halocraft.MODID+".Magnum";
		Magnum.Texture = Halocraft.MODID + ":Magnum";
		Magnum.IsAutomaticOrHasSecondaryShoot = false;
		Magnum.IsZoomable = true;
		Magnum.ZoomMultiplier = new int[]{2};
		Magnum.ZoomTexture = Halocraft.MODID+":textures/overlays/MagnumOverlay.png";
		Magnum.GunShootDelay = 8;
		Magnum.Recoil = 3F;
		Magnum.PerformOnly1ShootSound = true;
		Magnum.ShootSound = Halocraft.MODID+":weapons.shoot.MagnumShoot";
		//Magnum.
		Magnum.ReloadTime = 38;
		Magnum.ReloadSound = Halocraft.MODID+":weapons.reload.MagnumReload";
		Magnum.ReloadMaxAmmoFlow = 0;
		Magnum.ReloadTimeLoop = 0;
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
		Magnum.ProjectileLivingProperties = "";
		Magnum.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		Magnum.ProjectileDragInAir = 0.99F;
		Magnum.ProjectileDragInWater = 0.5F;
		
		//Magnum.TrackSensitivity = 0;
		
		weapons[5] = new ItemWeapon(Magnum);
		
		
		//SMG
		ItemWeaponProperties SMG = new ItemWeaponProperties();
		SMG.Name = Halocraft.MODID+".SMG";
		SMG.Texture = Halocraft.MODID + ":SMG";
		SMG.IsAutomaticOrHasSecondaryShoot = true;
		SMG.IsZoomable = false;
		//SMG.ZoomMultiplier = new int[]{2};
		//SMG.ZoomTexture = Halocraft.MODID+":textures/overlays/SMGOverlay.png";
		SMG.GunShootDelay = 1;
		SMG.Recoil = 2F;
		SMG.PerformOnly1ShootSound = true;
		SMG.ShootSound = Halocraft.MODID+":weapons.shoot.SMGShoot";
		//SMG.
		SMG.ReloadTime = 35;
		SMG.ReloadSound = Halocraft.MODID+":weapons.reload.SMGReload";
		SMG.ReloadMaxAmmoFlow = 0;
		SMG.ReloadTimeLoop = 0;
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
		SMG.ProjectileLivingProperties = "";
		SMG.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		SMG.ProjectileDragInAir = 0.99F;
		SMG.ProjectileDragInWater = 0.5F;
		
		//SMG.TrackSensitivity = 0;
		
		weapons[6] = new ItemWeapon(SMG);
		
		
		//RocketLauncher
		ItemWeaponProperties RocketLauncher = new ItemWeaponProperties();
		RocketLauncher.Name = Halocraft.MODID+".RocketLauncher";
		RocketLauncher.Texture = Halocraft.MODID + ":RocketLauncher";
		RocketLauncher.IsAutomaticOrHasSecondaryShoot = false;
		RocketLauncher.IsZoomable = true;
		RocketLauncher.ZoomMultiplier = new int[]{2};
		RocketLauncher.ZoomTexture = Halocraft.MODID+":textures/overlays/RocketLauncherOverlay.png";
		RocketLauncher.GunShootDelay = 40;
		RocketLauncher.Recoil = 12F;
		RocketLauncher.PerformOnly1ShootSound = true;
		RocketLauncher.ShootSound = Halocraft.MODID+":weapons.shoot.RocketLauncherShoot";
		//RocketLauncher.
		RocketLauncher.ReloadTime = 62;
		RocketLauncher.ReloadSound = Halocraft.MODID+":weapons.reload.RocketLauncherReload";
		RocketLauncher.ReloadMaxAmmoFlow = 0;
		RocketLauncher.ReloadTimeLoop = 0;
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
		
		weapons[7] = new ItemWeapon(RocketLauncher);
		
		
		//Carbine
		ItemWeaponProperties Carbine = new ItemWeaponProperties();
		Carbine.Name = Halocraft.MODID+".Carbine";
		Carbine.Texture = Halocraft.MODID + ":Carbine";
		Carbine.IsAutomaticOrHasSecondaryShoot = false;
		Carbine.IsZoomable = true;
		Carbine.ZoomMultiplier = new int[]{4};
		Carbine.ZoomTexture = Halocraft.MODID+":textures/overlays/CarbineOverlay.png";
		Carbine.GunShootDelay = 10;
		Carbine.Recoil = 1.6F;
		Carbine.PerformOnly1ShootSound = true;
		Carbine.ShootSound = Halocraft.MODID+":weapons.shoot.CarbineShoot";
		//Carbine.
		Carbine.ReloadTime = 44;
		Carbine.ReloadSound = Halocraft.MODID+":weapons.reload.CarbineReload";
		Carbine.ReloadMaxAmmoFlow = 0;
		Carbine.ReloadTimeLoop = 0;
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
		Carbine.ProjectileLivingProperties = "";
		Carbine.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		Carbine.ProjectileDragInAir = 0.99F;
		Carbine.ProjectileDragInWater = 0.5F;
		
		//Carbine.TrackSensitivity = 0;
		
		weapons[8] = new ItemWeapon(Carbine);
		
		
		//PlasmaRifle
		ItemWeaponProperties PlasmaRifle = new ItemWeaponProperties();
		PlasmaRifle.Name = Halocraft.MODID+".PlasmaRifle";
		PlasmaRifle.Texture = Halocraft.MODID + ":PlasmaRifle";
		PlasmaRifle.IsAutomaticOrHasSecondaryShoot = true;
		PlasmaRifle.IsZoomable = false;
		//PlasmaRifle.ZoomMultiplier = new int[]{2};
		//PlasmaRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/PlasmaRifleOverlay.png";
		PlasmaRifle.GunShootDelay = 3;
		PlasmaRifle.Recoil = 1.6F;
		PlasmaRifle.PerformOnly1ShootSound = true;
		PlasmaRifle.ShootSound = Halocraft.MODID+":weapons.shoot.PlasmaRifleShoot";
		//PlasmaRifle.
		PlasmaRifle.ReloadTime = 44;
		PlasmaRifle.ReloadSound = Halocraft.MODID+":weapons.reload.PlasmaRifleReload";
		PlasmaRifle.ReloadMaxAmmoFlow = 0;
		PlasmaRifle.ReloadTimeLoop = 0;
		PlasmaRifle.ReloadSoundLoop = "";
		PlasmaRifle.ReloadSoundExit = "";
		PlasmaRifle.AmmoFeedsFromInventory = false;
		PlasmaRifle.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		PlasmaRifle.MagazineSize = 70;
		PlasmaRifle.ItemStackDecreaseOnUse = false;
		PlasmaRifle.ItemStackMaxStackSize = 1;
		PlasmaRifle.RequiredUsesPerShot = 1;
		PlasmaRifle.ShootBurstCount = 1;
		//PlasmaRifle.BurstAccuracyDecrease = 0.6F;
		PlasmaRifle.SingleShotProjectileCount = 1;
		
		PlasmaRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		PlasmaRifle.ProjectileGlows = true;
		
		PlasmaRifle.ProjectileSpeed = 4F;
		PlasmaRifle.Accuracy = 3F;
		PlasmaRifle.Gravity = 0.004F;
		PlasmaRifle.MaxEffectiveTicksAlive = 80;
		PlasmaRifle.ProjectileLivingProperties = "";
		PlasmaRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		PlasmaRifle.ProjectileDragInAir = 0.99F;
		PlasmaRifle.ProjectileDragInWater = 0.5F;
		
		//PlasmaRifle.TrackSensitivity = 0;
		
		weapons[9] = new ItemWeapon(PlasmaRifle);
		
		
		//PlasmaPistol
		ItemWeaponProperties PlasmaPistol = new ItemWeaponProperties();
		PlasmaPistol.Name = Halocraft.MODID+".PlasmaPistol";
		PlasmaPistol.Texture = Halocraft.MODID + ":PlasmaPistol";
		PlasmaPistol.IsAutomaticOrHasSecondaryShoot = false;
		PlasmaPistol.IsZoomable = false;
		//PlasmaPistol.ZoomMultiplier = new int[]{2};
		//PlasmaPistol.ZoomTexture = Halocraft.MODID+":textures/overlays/PlasmaPistolOverlay.png";
		PlasmaPistol.GunShootDelay = 4;
		PlasmaPistol.Recoil = 1.4F;
		PlasmaPistol.PerformOnly1ShootSound = true;
		PlasmaPistol.ShootSound = Halocraft.MODID+":weapons.shoot.PlasmaPistolShoot";
		//PlasmaPistol.
		PlasmaPistol.ReloadTime = 44;
		PlasmaPistol.ReloadSound = Halocraft.MODID+":weapons.reload.PlasmaPistolReload";
		PlasmaPistol.ReloadMaxAmmoFlow = 0;
		PlasmaPistol.ReloadTimeLoop = 0;
		PlasmaPistol.ReloadSoundLoop = "";
		PlasmaPistol.ReloadSoundExit = "";
		PlasmaPistol.AmmoFeedsFromInventory = false;
		PlasmaPistol.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.MediumRounds);
		PlasmaPistol.MagazineSize = 60;
		PlasmaPistol.ItemStackDecreaseOnUse = false;
		PlasmaPistol.ItemStackMaxStackSize = 1;
		PlasmaPistol.RequiredUsesPerShot = 1;
		PlasmaPistol.ShootBurstCount = 1;
		//PlasmaPistol.BurstAccuracyDecrease = 0.6F;
		PlasmaPistol.SingleShotProjectileCount = 1;
		
		PlasmaPistol.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		PlasmaPistol.ProjectileGlows = true;
		
		PlasmaPistol.ProjectileSpeed = 2F;
		PlasmaPistol.Accuracy = 2F;
		PlasmaPistol.Gravity = 0.004F;
		PlasmaPistol.MaxEffectiveTicksAlive = 80;
		PlasmaPistol.ProjectileLivingProperties = "";
		PlasmaPistol.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		PlasmaPistol.ProjectileDragInAir = 0.99F;
		PlasmaPistol.ProjectileDragInWater = 0.5F;
		
		//PlasmaPistol.TrackSensitivity = 0;
		
		weapons[10] = new ItemWeapon(PlasmaPistol);
		
		
		//Needler
		ItemWeaponProperties Needler = new ItemWeaponProperties();
		Needler.Name = Halocraft.MODID+".Needler";
		Needler.Texture = Halocraft.MODID + ":Needler";
		Needler.IsAutomaticOrHasSecondaryShoot = true;
		Needler.IsZoomable = false;
		//Needler.ZoomMultiplier = new int[]{2};
		//Needler.ZoomTexture = Halocraft.MODID+":textures/overlays/NeedlerOverlay.png";
		Needler.GunShootDelay = 4;
		Needler.Recoil = 1.4F;
		Needler.PerformOnly1ShootSound = true;
		Needler.ShootSound = Halocraft.MODID+":weapons.shoot.NeedlerShoot";
		//Needler.
		Needler.ReloadTime = 44;
		Needler.ReloadSound = Halocraft.MODID+":weapons.reload.NeedlerReload";
		Needler.ReloadMaxAmmoFlow = 0;
		Needler.ReloadTimeLoop = 0;
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
		
		Needler.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/NeedleRender.png";
		Needler.ProjectileGlows = true;
		
		Needler.ProjectileSpeed = 2F;
		Needler.Accuracy = 3F;
		Needler.Gravity = 0.004F;
		Needler.MaxEffectiveTicksAlive = 100;
		Needler.ProjectileLivingProperties = "";
		Needler.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(5, 0, Die)";
		Needler.ProjectileDragInAir = 0.99F;
		Needler.ProjectileDragInWater = 0.5F;
		
		//Needler.TrackSensitivity = 0;
		
		weapons[11] = new ItemWeapon(Needler);
		
		
		//BeamRifle
		ItemWeaponProperties BeamRifle = new ItemWeaponProperties();
		BeamRifle.Name = Halocraft.MODID+".BeamRifle";
		BeamRifle.Texture = Halocraft.MODID + ":BeamRifle";
		BeamRifle.IsAutomaticOrHasSecondaryShoot = false;
		BeamRifle.IsZoomable = true;
		BeamRifle.ZoomMultiplier = new int[]{4, 8};
		BeamRifle.ZoomTexture = Halocraft.MODID+":textures/overlays/BeamRifleOverlay.png";
		BeamRifle.GunShootDelay = 40;
		BeamRifle.Recoil = 3F;
		BeamRifle.PerformOnly1ShootSound = true;
		BeamRifle.ShootSound = Halocraft.MODID+":weapons.shoot.BeamRifleShoot";
		//BeamRifle.
		BeamRifle.ReloadTime = 60;
		BeamRifle.ReloadSound = Halocraft.MODID+":weapons.reload.BeamRifleReload";
		BeamRifle.ReloadMaxAmmoFlow = 0;
		BeamRifle.ReloadTimeLoop = 0;
		BeamRifle.ReloadSoundLoop = "";
		BeamRifle.ReloadSoundExit = "";
		BeamRifle.AmmoFeedsFromInventory = false;
		BeamRifle.AmmoType = null;//new ItemStack(HalocraftItemsWeapons.LargeRounds);
		BeamRifle.MagazineSize = 10;
		BeamRifle.ItemStackDecreaseOnUse = false;
		BeamRifle.ItemStackMaxStackSize = 1;
		BeamRifle.RequiredUsesPerShot = 1;
		BeamRifle.ShootBurstCount = 1;
		//BeamRifle.BurstAccuracyDecrease = 0.6F;
		BeamRifle.SingleShotProjectileCount = 1;
		
		BeamRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/PurplePlasmaRender.png";
		BeamRifle.ProjectileGlows = true;
		
		BeamRifle.ProjectileSpeed = 8F;
		BeamRifle.Accuracy = 0.6F;
		BeamRifle.Gravity = 0.004F;
		BeamRifle.MaxEffectiveTicksAlive = 200;
		BeamRifle.ProjectileLivingProperties = "";
		BeamRifle.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(30, 0, Die)";
		BeamRifle.ProjectileDragInAir = 0.99F;
		BeamRifle.ProjectileDragInWater = 0.5F;
		
		//BeamRifle.TrackSensitivity = 0;
		
		weapons[12] = new ItemWeapon(BeamRifle);
		
		
		//Flamethrower
		ItemWeaponProperties Flamethrower = new ItemWeaponProperties();
		Flamethrower.Name = Halocraft.MODID+".Flamethrower";
		Flamethrower.Texture = Halocraft.MODID + ":Flamethrower";
		Flamethrower.IsAutomaticOrHasSecondaryShoot = true;
		Flamethrower.IsZoomable = false;
		//Flamethrower.ZoomMultiplier = new int[]{2};
		//Flamethrower.ZoomTexture = Halocraft.MODID+":textures/overlays/FlamethrowerOverlay.png";
		Flamethrower.GunShootDelay = 3;
		Flamethrower.Recoil = 1F;
		Flamethrower.PerformOnly1ShootSound = true;
		Flamethrower.ShootSound = Halocraft.MODID+":weapons.shoot.FlamethrowerShoot";
		//Flamethrower.
		Flamethrower.ReloadTime = 60;
		Flamethrower.ReloadSound = Halocraft.MODID+":weapons.reload.FlamethrowerReload";
		Flamethrower.ReloadMaxAmmoFlow = 0;
		Flamethrower.ReloadTimeLoop = 0;
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
		
		//Flamethrower.TrackSensitivity = 0;
		
		weapons[13] = new ItemWeapon(Flamethrower);
		
		
		//Spiker
		ItemWeaponProperties Spiker = new ItemWeaponProperties();
		Spiker.Name = Halocraft.MODID+".Spiker";
		Spiker.Texture = Halocraft.MODID + ":Spiker";
		Spiker.IsAutomaticOrHasSecondaryShoot = true;
		Spiker.IsZoomable = false;
		//Spiker.ZoomMultiplier = new int[]{2};
		//Spiker.ZoomTexture = Halocraft.MODID+":textures/overlays/SpikerOverlay.png";
		Spiker.GunShootDelay = 4;
		Spiker.Recoil = 1.5F;
		Spiker.PerformOnly1ShootSound = true;
		Spiker.ShootSound = Halocraft.MODID+":weapons.shoot.SpikeRifleShoot";
		//Spiker.
		Spiker.ReloadTime = 44;
		Spiker.ReloadSound = Halocraft.MODID+":weapons.reload.SpikerReload";
		Spiker.ReloadMaxAmmoFlow = 0;
		Spiker.ReloadTimeLoop = 0;
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
		Spiker.ProjectileLivingProperties = "";
		Spiker.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), Bounce(0.97, 1, ExceededMaxEncounteredEntities(2, Die)), ImpactEntity(5, 0, Die)";
		Spiker.ProjectileDragInAir = 0.99F;
		Spiker.ProjectileDragInWater = 0.5F;
		
		//Spiker.TrackSensitivity = 0;
		
		//BounceFactor = 0.97D;
		//RicochetFactor = 1D;
		//MaxAllowedEncounteredEntities = 2;
		
		weapons[14] = new ItemWeapon(Spiker);
		
		
		//Mauler
		ItemWeaponProperties Mauler = new ItemWeaponProperties();
		Mauler.Name = Halocraft.MODID+".Mauler";
		Mauler.Texture = Halocraft.MODID + ":Mauler";
		Mauler.IsAutomaticOrHasSecondaryShoot = false;
		Mauler.IsZoomable = false;
		//Mauler.ZoomMultiplier = new int[]{2};
		//Mauler.ZoomTexture = Halocraft.MODID+":textures/overlays/MaulerOverlay.png";
		Mauler.GunShootDelay = 20;
		Mauler.Recoil = 6F;
		Mauler.PerformOnly1ShootSound = true;
		Mauler.ShootSound = Halocraft.MODID+":weapons.shoot.MaulerShoot";
		//Mauler.
		Mauler.ReloadTime = 38;
		Mauler.ReloadSound = Halocraft.MODID+":weapons.reload.MaulerReload";
		Mauler.ReloadMaxAmmoFlow = 0;
		Mauler.ReloadTimeLoop = 0;
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
		Mauler.ProjectileLivingProperties = "";
		Mauler.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(3, 0, Die)";
		Mauler.ProjectileDragInAir = 0.96F;
		Mauler.ProjectileDragInWater = 0.1F;
		
		//Mauler.TrackSensitivity = 0;
		
		weapons[15] = new ItemWeapon(Mauler);
		
		
		//FragGrenade
		ItemWeaponProperties FragGrenade = new ItemWeaponProperties();
		FragGrenade.Name = Halocraft.MODID+".FragGrenade";
		FragGrenade.Texture = Halocraft.MODID + ":FragGrenade";
		FragGrenade.IsAutomaticOrHasSecondaryShoot = false;
		FragGrenade.IsZoomable = false;
		//FragGrenade.ZoomMultiplier = new int[]{};
		//FragGrenade.ZoomTexture = Halocraft.MODID+":textures/overlays/Overlay.png";
		FragGrenade.GunShootDelay = 20;
		FragGrenade.Recoil = 2F;
		FragGrenade.PerformOnly1ShootSound = true;
		FragGrenade.ShootSound = Halocraft.MODID+":weapons.FragThrow";
		//FragGrenade.
		//FragGrenade.ReloadTime = 0;
		//FragGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		//FragGrenade.ReloadMaxAmmoFlow = 0;
		//FragGrenade.ReloadTimeLoop = 0;
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
		
		FragGrenade.TrackSensitivity = 0;
		
		weapons[16] = new ItemWeapon(FragGrenade);
		
		
		//PlasmaGrenade
		ItemWeaponProperties PlasmaGrenade = new ItemWeaponProperties();
		PlasmaGrenade.Name = Halocraft.MODID+".PlasmaGrenade";
		PlasmaGrenade.Texture = Halocraft.MODID + ":PlasmaGrenade";
		PlasmaGrenade.IsAutomaticOrHasSecondaryShoot = false;
		PlasmaGrenade.IsZoomable = false;
		//PlasmaGrenade.ZoomMultiplier = new int[]{};
		//PlasmaGrenade.ZoomTexture = Halocraft.MODID+":textures/overlays/Overlay.png";
		PlasmaGrenade.GunShootDelay = 20;
		PlasmaGrenade.Recoil = 2F;
		PlasmaGrenade.PerformOnly1ShootSound = true;
		PlasmaGrenade.ShootSound = Halocraft.MODID+":weapons.PlasmaGrenadeThrow";
		//PlasmaGrenade.
		//PlasmaGrenade.ReloadTime = 0;
		//PlasmaGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.BattleRifleReload";
		//PlasmaGrenade.ReloadMaxAmmoFlow = 0;
		//PlasmaGrenade.ReloadTimeLoop = 0;
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
		
		PlasmaGrenade.TrackSensitivity = 0;
		
		weapons[17] = new ItemWeapon(PlasmaGrenade);
		
		
		//FirebombGrenade
		ItemWeaponProperties FirebombGrenade = new ItemWeaponProperties();
		FirebombGrenade.Name = Halocraft.MODID+".FirebombGrenade";
		FirebombGrenade.Texture = Halocraft.MODID + ":FirebombGrenade";
		FirebombGrenade.IsAutomaticOrHasSecondaryShoot = false;
		FirebombGrenade.IsZoomable = false;
		//FirebombGrenade.ZoomMultiplier = new int[]{};
		//FirebombGrenade.ZoomTexture = Halocraft.MODID+":textures/overlays/Overlay.png";
		FirebombGrenade.GunShootDelay = 20;
		FirebombGrenade.Recoil = 2F;
		FirebombGrenade.PerformOnly1ShootSound = true;
		FirebombGrenade.ShootSound = Halocraft.MODID+":weapons.FirebombThrow";
		//FirebombGrenade.
		//FirebombGrenade.ReloadTime = 0;
		//FirebombGrenade.ReloadSound = Halocraft.MODID+":weapons.reload.FirebombGrenadeReload";
		//FirebombGrenade.ReloadMaxAmmoFlow = 0;
		//FirebombGrenade.ReloadTimeLoop = 0;
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
		
		FirebombGrenade.TrackSensitivity = 0;
		
		weapons[18] = new ItemWeapon(FirebombGrenade);
		
		
		//SpikeGrenade TODO
		/*ItemWeaponProperties SpikeGrenade = new ItemWeaponProperties();
		SpikeGrenade.Name = Halocraft.MODID+".SpikeGrenade";
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
		
		ItemWeaponProperties SentinelBeam = new ItemWeaponProperties();
		SentinelBeam.Name = Halocraft.MODID+".SentinelBeam";
		SentinelBeam.Texture = Halocraft.MODID + ":NullX";
		SentinelBeam.InventoryTab = null;
		SentinelBeam.IsAutomaticOrHasSecondaryShoot = true;
		SentinelBeam.IsZoomable = false;
		//SentinelBeam.ZoomMultiplier = new int[]{2};
		//SentinelBeam.ZoomTexture = Halocraft.MODID+":textures/overlays/SentinelBeamOverlay.png";
		SentinelBeam.GunShootDelay = 1;
		SentinelBeam.Recoil = 0.8F;
		SentinelBeam.PerformOnly1ShootSound = true;
		SentinelBeam.ShootSound = Halocraft.MODID+":weapons.shoot.SMGShoot";//SentinelBeamShoot
		//SentinelBeam.
		SentinelBeam.ReloadTime = 35;
		SentinelBeam.ReloadSound = Halocraft.MODID+":weapons.reload.SentinelBeamReload";
		SentinelBeam.ReloadMaxAmmoFlow = 0;
		SentinelBeam.ReloadTimeLoop = 0;
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
		SentinelBeam.ProjectileLivingProperties = "";
		SentinelBeam.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(2, 0, Die)";
		SentinelBeam.ProjectileDragInAir = 1F;
		SentinelBeam.ProjectileDragInWater = 1F;
		
		weapons[19] = new ItemWeapon(SentinelBeam);
		
		if (KCWeaponMod.registerModItems(Halocraft.MODID, "1.0", weapons))
		{
			System.out.println("KCWeaponMod: Successfully Registered Halocraft Weapons");
		}
		else
		{
			System.err.println("KCWeaponMod - ERROR: Halocraft Weapons Were NOT Registered!");
		}
	}
}
