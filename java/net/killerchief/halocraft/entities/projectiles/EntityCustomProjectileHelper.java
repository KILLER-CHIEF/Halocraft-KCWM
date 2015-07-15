package net.killerchief.halocraft.entities.projectiles;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.kcweaponmod.ItemWeaponProperties;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class EntityCustomProjectileHelper {

	public EntityCustomProjectileHelper() {}

	public static Object[] ImpactBlockObject = new Object[]{"ImpactBlock", new Object[]{new Block[]{Blocks.tallgrass, Blocks.vine}, new Block[]{Blocks.glass, Blocks.leaves, Blocks.glass_pane, Blocks.yellow_flower, Blocks.red_flower, Blocks.brown_mushroom, Blocks.red_mushroom, Blocks.reeds, Blocks.deadbush, Blocks.waterlily, Blocks.flower_pot, Blocks.cocoa, Blocks.double_plant, Blocks.stained_glass, Blocks.stained_glass_pane}, "Die"}};
	public static ItemWeaponProperties ProjPropEliteCarbine;
	public static ItemWeaponProperties ProjPropElitePlasmaRifle;
	public static ItemWeaponProperties ProjPropGruntPlasmaPistol;
	public static ItemWeaponProperties ProjPropGhostPlasmaBolts;

	public static void initProjectiles()
	{
		//Elite Carbine
		ProjPropEliteCarbine = new ItemWeaponProperties();
		ProjPropEliteCarbine.ProjectileID = HalocraftItemsWeapons.Carbine.Properties.ProjectileID;
		ProjPropEliteCarbine.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		ProjPropEliteCarbine.ProjectileGlows = true;
		ProjPropEliteCarbine.ProjectileSpeed = 8F;
		ProjPropEliteCarbine.Accuracy = 2F;
		ProjPropEliteCarbine.Gravity = 0.004F;
		ProjPropEliteCarbine.MaxEffectiveTicksAlive = 100;
		//EliteCarbineProjProp.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(8, 0, Die)";
		ProjPropEliteCarbine.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"4", "0", "Die"}}};
		ProjPropEliteCarbine.ProjectileDragInAir = 0.99F;
		ProjPropEliteCarbine.ProjectileDragInWater = 0.5F;


		//Elite Plasma Rifle
		ProjPropElitePlasmaRifle = new ItemWeaponProperties();
		ProjPropElitePlasmaRifle.ProjectileID = HalocraftItemsWeapons.PlasmaRifle.Properties.ProjectileID;
		ProjPropElitePlasmaRifle.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		ProjPropElitePlasmaRifle.ProjectileGlows = true;
		ProjPropElitePlasmaRifle.ProjectileSpeed = 4F;
		ProjPropElitePlasmaRifle.Accuracy = 5F;
		ProjPropElitePlasmaRifle.Gravity = 0.004F;
		ProjPropElitePlasmaRifle.MaxEffectiveTicksAlive = 80;
		//ElitePlasmaRifleProjProp.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		ProjPropElitePlasmaRifle.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"2", "0", "Die"}}};
		ProjPropElitePlasmaRifle.ProjectileDragInAir = 0.99F;
		ProjPropElitePlasmaRifle.ProjectileDragInWater = 0.5F;

		
		//Grunt Plasma Pistol
		ProjPropGruntPlasmaPistol = new ItemWeaponProperties();
		ProjPropGruntPlasmaPistol.ProjectileID = HalocraftItemsWeapons.PlasmaPistol.Properties.ProjectileID;
		ProjPropGruntPlasmaPistol.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/GreenPlasmaRender.png";
		ProjPropGruntPlasmaPistol.ProjectileGlows = true;
		ProjPropGruntPlasmaPistol.ProjectileSpeed = 2F;
		ProjPropGruntPlasmaPistol.Accuracy = 4F;
		ProjPropGruntPlasmaPistol.Gravity = 0.004F;
		ProjPropGruntPlasmaPistol.MaxEffectiveTicksAlive = 80;
		//ProjPropGruntPlasmaPistol.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		ProjPropGruntPlasmaPistol.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"2", "0", "Die"}}};
		ProjPropGruntPlasmaPistol.ProjectileDragInAir = 0.99F;
		ProjPropGruntPlasmaPistol.ProjectileDragInWater = 0.5F;
		
		
		//Ghost Plasma Bolts
		ProjPropGhostPlasmaBolts = new ItemWeaponProperties();
		ProjPropGhostPlasmaBolts.ProjectileID = HalocraftItemsWeapons.PlasmaRifle.Properties.ProjectileID;
		ProjPropGhostPlasmaBolts.ProjectileRenderProperties = Halocraft.MODID+":textures/entities/BluePlasmaRender.png";
		ProjPropGhostPlasmaBolts.ProjectileGlows = true;
		ProjPropGhostPlasmaBolts.ProjectileSpeed = 4F;
		ProjPropGhostPlasmaBolts.Accuracy = 3F;
		ProjPropGhostPlasmaBolts.Gravity = 0.004F;
		ProjPropGhostPlasmaBolts.MaxEffectiveTicksAlive = 80;
		//ProjPropGhostPlasmaBolts.ProjectileImpactProperties = "*ImpactBlock(tallgrass+vine, glass+leaves+glass_pane+yellow_flower+red_flower+brown_mushroom+red_mushroom+reeds+deadbush+waterlily+flower_pot+cocoa+double_plant+stained_glass+stained_glass_pane, Die), ImpactEntity(4, 0, Die)";
		ProjPropGhostPlasmaBolts.ProjImpactActArgs = new Object[]{ImpactBlockObject, new Object[]{"ImpactEntity", new String[]{"6", "0", "Die"}}};
		ProjPropGhostPlasmaBolts.ProjectileDragInAir = 0.99F;
		ProjPropGhostPlasmaBolts.ProjectileDragInWater = 0.5F;
	}
}
