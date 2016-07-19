package net.killerchief.halocraft.config;

import cpw.mods.fml.common.registry.GameRegistry;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.items.HalocraftItem;
import net.killerchief.halocraft.items.ItemDataStorageChip;
import net.killerchief.halocraft.items.ItemFood;
import net.killerchief.halocraft.items.ItemStimpack;
import net.killerchief.halocraft.items.ItemSwordHilt;
import net.killerchief.halocraft.items.ItemTitaniumDoor;
import net.killerchief.halocraft.items.ItemHealthPack;
import net.killerchief.halocraft.items.ItemBlockHealthPack;
import net.killerchief.halocraft.items.ItemDeployableGravityLift;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;

public class HalocraftItems {
	
	public static Item TitaniumIngot;
	public static Item RubberGel;
	public static Item MultiLayeredAlloy;
	public static Item SwordHilt;
	public static Item ToughRubber;
	public static Item PurpleMetalPlate;
	public static Item EliteMeat;
	public static Item Wrench;
	public static Item MetalRod;
	public static Item Microchip;
	public static Item Memorychip;
	public static Item i1i3RAMchip;
	public static Item RAMchip;
	public static Item Processorchip;
	public static Item MetalRack;
	public static Item Speaker;
	public static Item DataStorageChipBlank;
	public static Item MongooseEngine;
	public static Item MongooseBody;
	public static Item MongooseWheel;
	public static Item Hypodermic;
	public static Item Stimpack;
	public static Item ItemHealthPack;
	public static Item EnhancedFibre;
	public static Item UNSCPowerGenerator;
	public static Item PlasmaPowerCore;
	public static Item ShieldProjector;
	//public static Item EliteEggSword;
	//public static Item EliteEggCarbine;
	//public static Item EliteEggPlasmaRifle;
	public static Item DataStorageChip1;
	public static Item DataStorageChip2;
	public static Item ForerunnerDoorItem;
	public static Item ForerunnerDoorLockedItem;
	public static Item HumanDoorItem;
	public static Item HumanDoorLockedItem;
	public static Item ItemBlockHealthPack;
	public static Item ItemDeployableGravityLift;
	//public static Item GruntEggPlasmaPistol;
	public static Item CeramicComposite;
	public static Item CovArmorPlate;
	
	public static void load(Configuration configuration) {
		TitaniumIngot = (new HalocraftItem("TitaniumIngot", "TitaniumIngot")).setMaxStackSize(64);
		RubberGel = (new HalocraftItem("RubberGel", "RubberGel")).setMaxStackSize(64);
		MultiLayeredAlloy = (new HalocraftItem("MultiLayeredAlloy", "MultiLayeredAlloy")).setMaxStackSize(32);
		SwordHilt = (new ItemSwordHilt("SwordHilt", "SwordHilt")).setMaxStackSize(1);
		ToughRubber = (new HalocraftItem("ToughRubber", "ToughRubber")).setMaxStackSize(32);
		PurpleMetalPlate = (new HalocraftItem("PurpleMetalPlate", "PurpleMetalPlate")).setMaxStackSize(16);
		EliteMeat = (new ItemFood("EliteMeat", "EliteMeat", 8)).setMaxStackSize(16);
		Wrench = (new HalocraftItem("Wrench", "Wrench")).setMaxDamage(41).setMaxStackSize(1);
		MetalRod = (new HalocraftItem("MetalRod", "MetalRod")).setMaxStackSize(16);
		Microchip = (new HalocraftItem("Microchip", "Microchip")).setMaxStackSize(16);
		Memorychip = (new HalocraftItem("Memorychip", "Memorychip")).setMaxStackSize(16);
		i1i3RAMchip = (new HalocraftItem("i1i3RAMchip", "i1i3RAMchip")).setMaxStackSize(8);
		RAMchip = (new HalocraftItem("RAMchip", "RAMchip")).setMaxStackSize(8);
		Processorchip = (new HalocraftItem("Processorchip", "Processorchip")).setMaxStackSize(8);
		MetalRack = (new HalocraftItem("MetalRack", "MetalRack")).setMaxStackSize(8);
		Speaker = (new HalocraftItem("Speaker", "Speaker")).setMaxStackSize(8);
		DataStorageChipBlank = (new ItemDataStorageChip("DataStorageChipBlank", "")).setMaxStackSize(1);
		MongooseEngine = (new HalocraftItem("MongooseEngine", "MongooseEngine")).setMaxStackSize(1);
		MongooseBody = (new HalocraftItem("MongooseBody", "MongooseBody")).setMaxStackSize(1);
		MongooseWheel = (new HalocraftItem("MongooseWheel", "MongooseWheel")).setMaxStackSize(2);
		Hypodermic = (new HalocraftItem("Hypodermic", "Hypodermic")).setMaxStackSize(16);
		Stimpack = (new ItemStimpack("Stimpack", "Stimpack")).setMaxStackSize(8);
		ItemHealthPack = (new ItemHealthPack("ItemHealthPack", "ItemHealthPack")).setMaxStackSize(4);
		EnhancedFibre = (new HalocraftItem("EnhancedFibre", "EnhancedFibre")).setMaxStackSize(16);
		UNSCPowerGenerator = (new HalocraftItem("UNSCPowerGenerator", "UNSCPowerGenerator")).setMaxStackSize(4);
		PlasmaPowerCore = (new HalocraftItem("PlasmaPowerCore", "PlasmaPowerCore")).setMaxDamage(400).setMaxStackSize(4);
		ShieldProjector = (new HalocraftItem("ShieldProjector", "ShieldProjector")).setMaxStackSize(4);
		//EliteEggSword = (new HCItemEliteEgg(0)).setUnlocalizedName("EliteEggSword").setMaxStackSize(64);
		//EliteEggCarbine = (new HCItemEliteEgg(1)).setUnlocalizedName("EliteEggCarbine").setMaxStackSize(64);
		//EliteEggPlasmaRifle = (new HCItemEliteEgg(2)).setUnlocalizedName("EliteEggPlasmaRifle").setMaxStackSize(64);
		DataStorageChip1 = (new ItemDataStorageChip("DataStorageChip1", "MissionToForget")).setMaxStackSize(1);
		DataStorageChip2 = (new ItemDataStorageChip("DataStorageChip2", "TheHalo3WarthogRun")).setMaxStackSize(1);
		ForerunnerDoorItem = (new ItemTitaniumDoor("ForerunnerDoorItem", "ForerunnerDoorItem", 0, false)).setMaxStackSize(64);
		ForerunnerDoorLockedItem = (new ItemTitaniumDoor("ForerunnerDoorLockedItem", "ForerunnerDoorLockedItem", 0, true)).setMaxStackSize(64);
		HumanDoorItem = (new ItemTitaniumDoor("HumanDoorItem", "HumanDoorItem", 1, false)).setMaxStackSize(64);
		HumanDoorLockedItem = (new ItemTitaniumDoor("HumanDoorLockedItem", "HumanDoorItem", 1, true)).setMaxStackSize(64);
		ItemBlockHealthPack = (new ItemBlockHealthPack("ItemBlockHealthPack", "ItemHealthPack")).setMaxStackSize(32);
		ItemDeployableGravityLift = (new ItemDeployableGravityLift("ItemDeployableGravityLift", "ItemGravityLift"));
		CeramicComposite = (new HalocraftItem("CeramicComposite", "CeramicComposite")).setMaxStackSize(64);
		//GruntEggPlasmaPistol = (new HCItemGruntEgg()).setUnlocalizedName("GruntEggPlasmaPistol").setMaxStackSize(64);
		CovArmorPlate = (new HalocraftItem("CovArmorPlate", "CovArmorPlate")).setMaxStackSize(32);
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(TitaniumIngot, TitaniumIngot.getUnlocalizedName().substring(5));
		OreDictionary.registerOre("ingotTitanium", TitaniumIngot);
		GameRegistry.registerItem(RubberGel, RubberGel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MultiLayeredAlloy, MultiLayeredAlloy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SwordHilt, SwordHilt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ToughRubber, ToughRubber.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PurpleMetalPlate, PurpleMetalPlate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EliteMeat, EliteMeat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Wrench, Wrench.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MetalRod, MetalRod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Microchip, Microchip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Memorychip, Memorychip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(i1i3RAMchip, i1i3RAMchip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(RAMchip, RAMchip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Processorchip, Processorchip.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MetalRack, MetalRack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Speaker, Speaker.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DataStorageChipBlank, DataStorageChipBlank.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MongooseEngine, MongooseEngine.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MongooseBody, MongooseBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MongooseWheel, MongooseWheel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hypodermic, Hypodermic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Stimpack, Stimpack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemHealthPack, ItemHealthPack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EnhancedFibre, EnhancedFibre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UNSCPowerGenerator, UNSCPowerGenerator.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PlasmaPowerCore, PlasmaPowerCore.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShieldProjector, ShieldProjector.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(EliteEggSword, "en_US", "Elite Sword Egg");
		//GameRegistry.registerItem(EliteEggSword, EliteEggSword.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(EliteEggCarbine, "en_US", "Elite Carbine Egg");
		//GameRegistry.registerItem(EliteEggCarbine, EliteEggCarbine.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(EliteEggPlasmaRifle, "en_US", "Elite Plasma Rifle Egg");
		//GameRegistry.registerItem(EliteEggPlasmaRifle, EliteEggPlasmaRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DataStorageChip1, DataStorageChip1.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DataStorageChip2, DataStorageChip2.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ForerunnerDoorItem, ForerunnerDoorItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ForerunnerDoorLockedItem, ForerunnerDoorLockedItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(HumanDoorItem, HumanDoorItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(HumanDoorLockedItem, HumanDoorLockedItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBlockHealthPack, ItemBlockHealthPack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDeployableGravityLift, ItemDeployableGravityLift.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CeramicComposite, CeramicComposite.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(GruntEggPlasmaPistol, "en_US", "Grunt Plasma Pistol Egg");
		//GameRegistry.registerItem(GruntEggPlasmaPistol, GruntEggPlasmaPistol.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CovArmorPlate, CovArmorPlate.getUnlocalizedName().substring(5));
	}
	
	public static void addRecipes() {
		GameRegistry.addSmelting(HalocraftBlocks.TitaniumOre, new ItemStack(TitaniumIngot), 0.7F);
		GameRegistry.addRecipe(new ItemStack(TitaniumIngot, 9), new Object[] {
			"T", Character.valueOf('T'), HalocraftBlocks.TitaniumBlock
		});

		GameRegistry.addShapelessRecipe(new ItemStack(RubberGel, 1), new Object[] {Items.clay_ball, Items.coal, Items.slime_ball});

		GameRegistry.addRecipe(new ItemStack(MultiLayeredAlloy, 1), new Object[] {
			"TTT", "GDG", "MGM", Character.valueOf('G'), RubberGel, Character.valueOf('T'), TitaniumIngot, Character.valueOf('M'), Microchip, 
			Character.valueOf('D'), Items.diamond
		});
		GameRegistry.addRecipe(new ItemStack(SwordHilt, 1, 25), new Object[] {
			"IOI", "BOI", "IOI", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('O'), Blocks.obsidian, Character.valueOf('B'), Blocks.stone_button
		});

		GameRegistry.addShapelessRecipe(new ItemStack(ToughRubber, 1), new Object[] {Items.leather, RubberGel, Items.leather});
		GameRegistry.addSmelting(PurpleMetalPlate, new ItemStack(TitaniumIngot), 0.8F);

		GameRegistry.addRecipe(new ItemStack(Wrench, 1), new Object[] {
			"T T", " T ", " T ", Character.valueOf('T'), TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(MetalRod, 1), new Object[] {
			"T  ", " T ", "  T", Character.valueOf('T'), TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(MetalRod, 1), new Object[] {
			"  T", " T ", "T  ", Character.valueOf('T'), TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Microchip, 2), new Object[] {
			"SIR", "BBR", "SIR", Character.valueOf('R'), Items.redstone, Character.valueOf('B'), Items.repeater, 
			Character.valueOf('S'), Blocks.sand, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(Memorychip, 2), new Object[] {
			"BSR", "BIR", "BSR", Character.valueOf('R'), Items.redstone, Character.valueOf('B'), Items.repeater, 
			Character.valueOf('S'), Blocks.sand, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(i1i3RAMchip, 1), new Object[] {
			"M", "S", "M", Character.valueOf('M'), Microchip, Character.valueOf('S'), Memorychip
		});
		GameRegistry.addRecipe(new ItemStack(RAMchip, 1), new Object[] {
			"R", "R", "R", Character.valueOf('R'), i1i3RAMchip
		});
		GameRegistry.addRecipe(new ItemStack(Processorchip, 1), new Object[] {
			"MSM", "RMR", "MSM", Character.valueOf('M'), Microchip, Character.valueOf('S'), Memorychip, 
			Character.valueOf('R'), i1i3RAMchip
		});
		GameRegistry.addRecipe(new ItemStack(MetalRack, 1), new Object[] {
			"III", "I I", "III", Character.valueOf('I'), MetalRod
		});
		GameRegistry.addRecipe(new ItemStack(Speaker, 1), new Object[] {
			" IP", "IRP", " IP", Character.valueOf('P'), Items.paper, Character.valueOf('R'), Items.redstone, 
			Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(DataStorageChipBlank, 1), new Object[] {
			"RRM", "RMR", "RRM", Character.valueOf('M'), Microchip, Character.valueOf('R'), i1i3RAMchip
		});
		GameRegistry.addRecipe(new ItemStack(MongooseEngine, 1), new Object[] {
			"IRI", "IRI", "IBI", Character.valueOf('R'), MetalRod, Character.valueOf('B'), MetalRack, 
			Character.valueOf('I'), TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(MongooseBody, 1), new Object[] {
			"RRR", "BRR", "R R", Character.valueOf('R'), MetalRod, Character.valueOf('B'), MetalRack
		});
		GameRegistry.addRecipe(new ItemStack(MongooseWheel, 1), new Object[] {
			" R ", "RIR", " R ", Character.valueOf('R'), ToughRubber, Character.valueOf('I'), TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Hypodermic, 2), new Object[] {
			"  C", " B ", "I  ", Character.valueOf('C'), Items.clay_ball, Character.valueOf('B'), Items.glass_bottle, Character.valueOf('I'), Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(Hypodermic, 2), new Object[] {
			"C  ", " B ", "  I", Character.valueOf('C'), Items.clay_ball, Character.valueOf('B'), Items.glass_bottle, Character.valueOf('I'), Items.iron_ingot
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Stimpack, 1), new Object[] {Hypodermic, Items.milk_bucket, Items.sugar, Items.sugar, Items.egg, new ItemStack(Items.dye, 1, 15)});

		GameRegistry.addRecipe(new ItemStack(ItemHealthPack, 1), new Object[] {
			"RRR", "SMS", "RRR", Character.valueOf('R'), MetalRod, Character.valueOf('S'), Stimpack, Character.valueOf('M'), Items.milk_bucket
		});

		GameRegistry.addShapelessRecipe(new ItemStack(EnhancedFibre, 1), new Object[] {ToughRubber, ToughRubber, TitaniumIngot, Microchip});

		GameRegistry.addRecipe(new ItemStack(UNSCPowerGenerator, 1), new Object[] {
			"TMT", "MWM", "TMT", Character.valueOf('T'), MetalRod, Character.valueOf('M'), Microchip, Character.valueOf('W'), Items.water_bucket
		});
		GameRegistry.addRecipe(new ItemStack(PlasmaPowerCore, 1), new Object[] {
			"PMP", "MEM", "PMP", Character.valueOf('P'), PurpleMetalPlate, Character.valueOf('M'), Microchip, Character.valueOf('E'), Items.ender_pearl
		});
		GameRegistry.addRecipe(new ItemStack(ShieldProjector, 1), new Object[] {
			"TDT", "MPM", "TMT", Character.valueOf('T'), MetalRod, Character.valueOf('M'), Microchip, Character.valueOf('P'), UNSCPowerGenerator, Character.valueOf('D'), Items.diamond
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemBlockHealthPack, 1), new Object[] {ItemHealthPack, MetalRod, MetalRod});
		GameRegistry.addRecipe(new ItemStack(CeramicComposite, 1), new Object[] {
			"BCB", "TST", "BCB", Character.valueOf('B'), Items.clay_ball, Character.valueOf('C'), Items.coal, Character.valueOf('T'), TitaniumIngot, Character.valueOf('S'), Blocks.sand
		});
		GameRegistry.addRecipe(new ItemStack(CovArmorPlate, 1), new Object[] {
			"PP", "PP", Character.valueOf('P'), PurpleMetalPlate
		});
	}
}
