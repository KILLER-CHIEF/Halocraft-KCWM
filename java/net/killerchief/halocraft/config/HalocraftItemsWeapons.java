package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.items.HalocraftItem;
import net.killerchief.halocraft.items.ItemEnergySword;
import net.killerchief.halocraft.items.ItemMachete;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public class HalocraftItemsWeapons {

	public static ItemWeapon BattleRifle;
	public static ItemWeapon DMR;
	public static ItemWeapon AssaultRifle;
	public static ItemWeapon Shotgun;
	public static ItemWeapon SniperRifle;
	public static ItemWeapon Magnum;
	public static ItemWeapon SMG;
	public static ItemWeapon RocketLauncher;
	public static ItemWeapon Carbine;
	public static ItemWeapon PlasmaRifle;
	public static ItemWeapon PlasmaPistol;
	public static ItemWeapon Needler;
	public static ItemWeapon BeamRifle;
	public static ItemWeapon Flamethrower;
	public static ItemWeapon Spiker;
	public static ItemWeapon Mauler;
	public static ItemWeapon FragGrenade;
	public static ItemWeapon PlasmaGrenade;
	public static ItemWeapon FirebombGrenade;

	public static Item SpikeGrenade = null;
	
	public static int ModMapOffset = 0;

	public static void initWeapons()
	{
		ModMapOffset = KCWeaponMod.modMap.get(Halocraft.MODID);
		BattleRifle = KCWeaponMod.weapons[ModMapOffset];
		DMR = KCWeaponMod.weapons[ModMapOffset+1];
		AssaultRifle = KCWeaponMod.weapons[ModMapOffset+2];
		Shotgun = KCWeaponMod.weapons[ModMapOffset+3];
		SniperRifle = KCWeaponMod.weapons[ModMapOffset+4];
		Magnum = KCWeaponMod.weapons[ModMapOffset+5];
		SMG = KCWeaponMod.weapons[ModMapOffset+6];
		RocketLauncher = KCWeaponMod.weapons[ModMapOffset+7];
		Carbine = KCWeaponMod.weapons[ModMapOffset+8];
		PlasmaRifle = KCWeaponMod.weapons[ModMapOffset+9];
		PlasmaPistol = KCWeaponMod.weapons[ModMapOffset+10];
		Needler = KCWeaponMod.weapons[ModMapOffset+11];
		BeamRifle = KCWeaponMod.weapons[ModMapOffset+12];
		Flamethrower = KCWeaponMod.weapons[ModMapOffset+13];
		Spiker = KCWeaponMod.weapons[ModMapOffset+14];
		Mauler = KCWeaponMod.weapons[ModMapOffset+15];
		FragGrenade = KCWeaponMod.weapons[ModMapOffset+16];
		PlasmaGrenade = KCWeaponMod.weapons[ModMapOffset+17];
		FirebombGrenade = KCWeaponMod.weapons[ModMapOffset+18];
	}

	//public static Item SilencedSMG = (new HCItemWeapons(22007)).setIconCoord(7, 0).setUnlocalizedName("SilencedSMG");
	//public static Item SilverRocketLauncher = (new HCItemWeapons(22009)).setIconCoord(9, 0).setUnlocalizedName("SilverRocketLauncher");
	//public static Item SpartanLaser = (new HCItemWeapons(22010)).setIconCoord(10, 0).setUnlocalizedName("SpartanLaser");
	//public static Item GreenSpartanLaser = (new HCItemWeapons(22011)).setIconCoord(11, 0).setUnlocalizedName("GreenSpartanLaser");
	//public static Item FuelRodCannon = (new HCItemWeapons(22017)).setIconCoord(6, 4).setUnlocalizedName("FuelRodCannon");
	//public static Item GravityHammer;

	public static Item EnergySword;
	public static Item Machete;

	public static Item SmallRounds;
	public static Item MediumRounds;
	public static Item LargeRounds;
	public static Item ShotgunRounds;
	public static Item Rocket;

	public static void load(Configuration configuration) {
		EnergySword = (new ItemEnergySword("EnergySword", "EnergySword"));
		Machete = (new ItemMachete("Machete", "Machete"));

		SmallRounds = (new HalocraftItem("SmallRounds", "SmallRounds", KCWeaponMod.InventoryTab)).setMaxStackSize(64);
		MediumRounds = (new HalocraftItem("MediumRounds", "MediumRounds", KCWeaponMod.InventoryTab)).setMaxStackSize(64);
		LargeRounds = (new HalocraftItem("LargeRounds", "LargeRounds", KCWeaponMod.InventoryTab)).setMaxStackSize(64);
		ShotgunRounds = (new HalocraftItem("ShotgunRounds", "ShotgunRounds", KCWeaponMod.InventoryTab)).setMaxStackSize(64);
		Rocket = (new HalocraftItem("Rocket", "Rocket", KCWeaponMod.InventoryTab)).setMaxStackSize(64);
	}

	public static void registerItems() {
		GameRegistry.registerItem(EnergySword, EnergySword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Machete, Machete.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(SmallRounds, SmallRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MediumRounds, MediumRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LargeRounds, LargeRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShotgunRounds, ShotgunRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Rocket, Rocket.getUnlocalizedName().substring(5));
	}

	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(FragGrenade, 2), new Object[] {
			" I ", "ITI", "III", Character.valueOf('T'), Blocks.tnt, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(FirebombGrenade, 1), new Object[] {
			"IFI", "FFF", "IFI", Character.valueOf('F'), Items.fire_charge, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(Machete, 1), new Object[] {
			"T", "T", "I", Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(SmallRounds, 4), new Object[] {
			"I", "G", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('G'), Items.gunpowder
		});
		GameRegistry.addRecipe(new ItemStack(MediumRounds, 6), new Object[] {
			" I ", " G ", "IGI", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('G'), Items.gunpowder
		});
		GameRegistry.addRecipe(new ItemStack(LargeRounds, 4), new Object[] {
			" I ", "IGI", "IGI", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('G'), Items.gunpowder
		});
		GameRegistry.addRecipe(new ItemStack(ShotgunRounds, 4), new Object[] {
			" I ", "GPG", " I ", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('G'), Items.gunpowder, Character.valueOf('P'), Items.paper
		});
		GameRegistry.addRecipe(new ItemStack(Rocket, 1), new Object[] {
			" I ", "ITI", "GGG", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('T'), Blocks.tnt, Character.valueOf('G'), Items.gunpowder
		});
	}
}
