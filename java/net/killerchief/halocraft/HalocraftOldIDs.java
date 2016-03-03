package net.killerchief.halocraft;

import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.config.HalocraftItemsVehicles;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=HalocraftOldIDs.MODID, name=HalocraftOldIDs.NAME, version=HalocraftOldIDs.VERSION, dependencies="required-after:halocraft;")
public class HalocraftOldIDs {

	public static final String MODID = "killerchief_halocraft";
	public static final String NAME = "HalocraftOldIDUpdater";
	public static final String VERSION = "0.7.0";

	/** The instance of this mod that Forge uses.*/
	@Instance(HalocraftOldIDs.MODID)
	public static HalocraftOldIDs instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	//  --------Blocks--------
	public static Block TitaniumOre;
	public static Block TitaniumBlock;
	public static Block PermanentGravityLiftBaseActive;
	public static Block PermanentGravityLiftBaseIdle;
	public static Block PermanentGravityLiftExt;
	public static Block BrokenComputer;
	public static Block Computer;
	public static Block SpreadlessGrass;
	public static Block MetalLadder;
	public static Block ForerunnerMetal;
	public static Block ForerunnerLight;
	public static Block ForerunnerSymbol;
	public static Block ForerunnerFence;
	public static Block ForerunnerStair;
	public static Block ForerunnerSlabBlock;
	public static Block ForerunnerSlabLightBlock;
	public static Block ForerunnerBlueMetal;
	public static Block ForerunnerBlueMetalLight;
	public static Block ForerunnerBlueMetalSymbol;
	public static Block ForerunnerBlueMetalStair;
	public static Block ForerunnerBlueMetalSlabBlock;
	public static Block ForerunnerBlueMetalSlabLightBlock;
	public static Block ForerunnerFloorPattern1;
	public static Block ForerunnerFloorPattern2;
	public static Block ForerunnerFloorPattern3;
	public static Block ForerunnerFloorPattern4;
	public static Block ForerunnerMetalPanel1;
	public static Block ForerunnerMetalPanel2;
	public static Block ForerunnerMetalPanel3;
	public static Block ForerunnerMetalPanel4;
	public static Block ForerunnerMetalPanel5;
	public static Block InvisibleBarrierHard;
	public static Block ForerunnerDoorBlock;
	public static Block ForerunnerDoorLockedBlock;
	public static Block HumanDoorBlock;
	public static Block HumanDoorLockedBlock;
	public static Block BlockHealthPack;
	public static Block UNSCPlating;
	public static Block RechargeStation;
	public static Block Landmine;

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

	public static Item HelmetUnderArmor;
	public static Item BodyUnderArmor;
	public static Item LegsUnderArmor;
	public static Item BootsUnderArmor;
	public static Item MarkVHelmetBlack;
	public static Item MarkVHelmetGreen;
	public static Item MarkVHelmetBlue;
	public static Item MarkVHelmetRed;
	public static Item MarkVBodyBlack;
	public static Item MarkVBodyGreen;
	public static Item MarkVBodyBlue;
	public static Item MarkVBodyRed;
	public static Item MarkVLegsBlack;
	public static Item MarkVLegsGreen;
	public static Item MarkVLegsBlue;
	public static Item MarkVLegsRed;
	public static Item MarkVBootsBlack;
	public static Item MarkVBootsGreen;
	public static Item MarkVBootsBlue;
	public static Item MarkVBootsRed;
	public static Item ODSTHelmet;
	public static Item ODSTBody;
	public static Item ODSTLegs;
	public static Item ODSTBoots;
	public static Item MarineHelmet;
	public static Item MarineBody;
	public static Item MarineLegs;
	public static Item MarineBoots;
	public static Item MarkVIHelmetGreen;
	public static Item MarkVIBodyGreen;
	public static Item MarkVILegsGreen;
	public static Item MarkVIBootsGreen;
	public static Item ReconHelmet;
	public static Item ReconBody;
	public static Item ReconLegs;
	public static Item ReconBoots;

	public static Item BattleRifle;
	public static Item DMR;
	public static Item AssaultRifle;
	public static Item Shotgun;
	public static Item SniperRifle;
	public static Item Magnum;
	public static Item SMG;
	//public static Item SilencedSMG = (new HCItemWeapons(22007)).setIconCoord(7, 0).setUnlocalizedName("SilencedSMG");
	public static Item RocketLauncher;
	//public static Item SilverRocketLauncher = (new HCItemWeapons(22009)).setIconCoord(9, 0).setUnlocalizedName("SilverRocketLauncher");
	//public static Item SpartanLaser = (new HCItemWeapons(22010)).setIconCoord(10, 0).setUnlocalizedName("SpartanLaser");
	//public static Item GreenSpartanLaser = (new HCItemWeapons(22011)).setIconCoord(11, 0).setUnlocalizedName("GreenSpartanLaser");
	public static Item Carbine;
	public static Item PlasmaRifle;
	public static Item PlasmaPistol;
	public static Item Needler;
	public static Item BeamRifle;
	public static Item Flamethrower;
	public static Item Spiker;
	public static Item Mauler;
	//public static Item FuelRodCannon = (new HCItemWeapons(22017)).setIconCoord(6, 4).setUnlocalizedName("FuelRodCannon");
	public static Item EnergySword;
	public static Item Machete;
	public static Item FragGrenade;
	public static Item PlasmaGrenade;
	public static Item FirebombGrenade;
	public static Item SpikeGrenade;

	//public static Item GravityHammer;

	public static Item SmallRounds;
	public static Item MediumRounds;
	public static Item LargeRounds;
	public static Item ShotgunRounds;
	public static Item Rocket;

	public static Item ItemMongooseDefault;
	public static Item ItemMongooseGreen;
	public static Item ItemMongooseBlue;
	public static Item ItemMongooseRed;

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new OldIDEventHandler());
		
		TitaniumOre = (new HalocraftOldBlock("TitaniumOre", HalocraftBlocks.TitaniumOre));
		TitaniumBlock = (new HalocraftOldBlock("TitaniumBlock", HalocraftBlocks.TitaniumBlock));
		PermanentGravityLiftBaseActive = (new HalocraftOldBlock("PermanentGravityLiftBaseActive", HalocraftBlocks.PermanentGravityLiftBaseActive));
		PermanentGravityLiftBaseIdle = (new HalocraftOldBlock("PermanentGravityLiftBaseIdle", HalocraftBlocks.PermanentGravityLiftBaseIdle));
		PermanentGravityLiftExt = (new HalocraftOldBlock("BlockPermanentGravityLiftExt", HalocraftBlocks.PermanentGravityLiftExt));
		BrokenComputer = (new HalocraftOldBlock("BrokenComputer", HalocraftBlocks.BrokenComputer));
		Computer = (new HalocraftOldBlock("Computer", HalocraftBlocks.Computer));
		SpreadlessGrass = (new HalocraftOldBlock("SpreadlessGrass", HalocraftBlocks.SpreadlessGrass));
		MetalLadder = (new HalocraftOldBlock("MetalLadder", HalocraftBlocks.MetalLadder));
		ForerunnerMetal = (new HalocraftOldBlock("ForerunnerMetal", HalocraftBlocks.ForerunnerMetal));
		ForerunnerLight = (new HalocraftOldBlock("ForerunnerLight", HalocraftBlocks.ForerunnerLight));
		ForerunnerSymbol = (new HalocraftOldBlock("ForerunnerSymbol", HalocraftBlocks.ForerunnerSymbol));
		ForerunnerFence = (new HalocraftOldBlock("ForerunnerFence", HalocraftBlocks.ForerunnerFence));
		ForerunnerStair = (new HalocraftOldBlock("ForerunnerStair", HalocraftBlocks.ForerunnerStair));
		ForerunnerSlabBlock = (new HalocraftOldBlock("ForerunnerSlabBlock", HalocraftBlocks.ForerunnerSlabBlock));
		ForerunnerSlabLightBlock = (new HalocraftOldBlock("ForerunnerSlabLightBlock", HalocraftBlocks.ForerunnerSlabLightBlock));
		ForerunnerBlueMetal = (new HalocraftOldBlock("ForerunnerBlueMetal", HalocraftBlocks.ForerunnerBlueMetal));
		ForerunnerBlueMetalLight = (new HalocraftOldBlock("ForerunnerBlueMetalLight", HalocraftBlocks.ForerunnerBlueMetalLight));
		ForerunnerBlueMetalSymbol = (new HalocraftOldBlock("ForerunnerBlueMetalSymbol", HalocraftBlocks.ForerunnerBlueMetalSymbol));
		ForerunnerBlueMetalStair = (new HalocraftOldBlock("ForerunnerBlueMetalStair", HalocraftBlocks.ForerunnerBlueMetalStair));
		ForerunnerBlueMetalSlabBlock = (new HalocraftOldBlock("ForerunnerBlueMetalSlabBlock", HalocraftBlocks.ForerunnerBlueMetalSlabBlock));
		ForerunnerBlueMetalSlabLightBlock = (new HalocraftOldBlock("ForerunnerBlueMetalSlabLightBlock", HalocraftBlocks.ForerunnerBlueMetalSlabLightBlock));
		ForerunnerFloorPattern1 = (new HalocraftOldBlock("ForerunnerFloorPattern1", HalocraftBlocks.ForerunnerFloorPattern1));
		ForerunnerFloorPattern2 = (new HalocraftOldBlock("ForerunnerFloorPattern2", HalocraftBlocks.ForerunnerFloorPattern2));
		ForerunnerFloorPattern3 = (new HalocraftOldBlock("ForerunnerFloorPattern3", HalocraftBlocks.ForerunnerFloorPattern3));
		ForerunnerFloorPattern4 = (new HalocraftOldBlock("ForerunnerFloorPattern4", HalocraftBlocks.ForerunnerFloorPattern4));
		ForerunnerMetalPanel1 = (new HalocraftOldBlock("ForerunnerMetalPanel1", HalocraftBlocks.ForerunnerMetalPanel1));
		ForerunnerMetalPanel2 = (new HalocraftOldBlock("ForerunnerMetalPanel2", HalocraftBlocks.ForerunnerMetalPanel2));
		ForerunnerMetalPanel3 = (new HalocraftOldBlock("ForerunnerMetalPanel3", HalocraftBlocks.ForerunnerMetalPanel3));
		ForerunnerMetalPanel4 = (new HalocraftOldBlock("ForerunnerMetalPanel4", HalocraftBlocks.ForerunnerMetalPanel4));
		ForerunnerMetalPanel5 = (new HalocraftOldBlock("ForerunnerMetalPanel5", HalocraftBlocks.ForerunnerMetalPanel5));
		InvisibleBarrierHard = (new HalocraftOldBlock("InvisibleBarrierHard", HalocraftBlocks.InvisibleBarrierHard));
		ForerunnerDoorBlock = (new HalocraftOldBlock("ForerunnerDoorBlock", HalocraftBlocks.ForerunnerDoorBlock));
		ForerunnerDoorLockedBlock = (new HalocraftOldBlock("ForerunnerDoorLockedBlock", HalocraftBlocks.ForerunnerDoorLockedBlock));
		HumanDoorBlock = (new HalocraftOldBlock("HumanDoorBlock", HalocraftBlocks.HumanDoorBlock));
		HumanDoorLockedBlock = (new HalocraftOldBlock("HumanDoorLockedBlock", HalocraftBlocks.HumanDoorLockedBlock));
		BlockHealthPack = (new HalocraftOldBlock("BlockHealthPack", HalocraftBlocks.BlockHealthPack));
		UNSCPlating = (new HalocraftOldBlock("UNSCPlating", HalocraftBlocks.UNSCPlating));
		RechargeStation = (new HalocraftOldBlock("RechargeStation", HalocraftBlocks.RechargeStation));
		Landmine = (new HalocraftOldBlock("Landmine", HalocraftBlocks.LandmineIdle));

		GameRegistry.registerBlock(TitaniumOre, TitaniumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TitaniumBlock, TitaniumBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PermanentGravityLiftBaseActive, PermanentGravityLiftBaseActive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PermanentGravityLiftBaseIdle, PermanentGravityLiftBaseIdle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PermanentGravityLiftExt, PermanentGravityLiftExt.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BrokenComputer, BrokenComputer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Computer, Computer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SpreadlessGrass, SpreadlessGrass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(MetalLadder, MetalLadder.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetal, ForerunnerMetal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerLight, ForerunnerLight.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerSymbol, ForerunnerSymbol.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerFence, ForerunnerFence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerStair, ForerunnerStair.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerSlabBlock, ForerunnerSlabBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerSlabLightBlock, ForerunnerSlabLightBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetal, ForerunnerBlueMetal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetalLight, ForerunnerBlueMetalLight.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetalSymbol, ForerunnerBlueMetalSymbol.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetalStair, ForerunnerBlueMetalStair.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetalSlabBlock, ForerunnerBlueMetalSlabBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerBlueMetalSlabLightBlock, ForerunnerBlueMetalSlabLightBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerFloorPattern1, ForerunnerFloorPattern1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerFloorPattern2, ForerunnerFloorPattern2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerFloorPattern3, ForerunnerFloorPattern3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerFloorPattern4, ForerunnerFloorPattern4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetalPanel1, ForerunnerMetalPanel1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetalPanel2, ForerunnerMetalPanel2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetalPanel3, ForerunnerMetalPanel3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetalPanel4, ForerunnerMetalPanel4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerMetalPanel5, ForerunnerMetalPanel5.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(InvisibleBarrierHard, InvisibleBarrierHard.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerDoorBlock, ForerunnerDoorBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ForerunnerDoorLockedBlock, ForerunnerDoorLockedBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(HumanDoorBlock, HumanDoorBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(HumanDoorLockedBlock, HumanDoorLockedBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlockHealthPack, BlockHealthPack.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(UNSCPlating, UNSCPlating.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(RechargeStation, RechargeStation.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Landmine, Landmine.getUnlocalizedName().substring(5));

		TitaniumIngot = (new HalocraftOldItem("TitaniumIngot", HalocraftItems.TitaniumIngot));
		RubberGel = (new HalocraftOldItem("RubberGel", HalocraftItems.RubberGel));
		MultiLayeredAlloy = (new HalocraftOldItem("MultiLayeredAlloy", HalocraftItems.MultiLayeredAlloy));
		SwordHilt = (new HalocraftOldItem("SwordHilt", HalocraftItems.SwordHilt));
		ToughRubber = (new HalocraftOldItem("ToughRubber", HalocraftItems.ToughRubber));
		PurpleMetalPlate = (new HalocraftOldItem("PurpleMetalPlate", HalocraftItems.PurpleMetalPlate));
		EliteMeat = (new HalocraftOldItem("EliteMeat", HalocraftItems.EliteMeat));
		Wrench = (new HalocraftOldItem("Wrench", HalocraftItems.Wrench));
		MetalRod = (new HalocraftOldItem("MetalRod", HalocraftItems.MetalRod));
		Microchip = (new HalocraftOldItem("Microchip", HalocraftItems.Microchip));
		Memorychip = (new HalocraftOldItem("Memorychip", HalocraftItems.Memorychip));
		i1i3RAMchip = (new HalocraftOldItem("i1i3RAMchip", HalocraftItems.i1i3RAMchip));
		RAMchip = (new HalocraftOldItem("RAMchip", HalocraftItems.RAMchip));
		Processorchip = (new HalocraftOldItem("Processorchip", HalocraftItems.Processorchip));
		MetalRack = (new HalocraftOldItem("MetalRack", HalocraftItems.MetalRack));
		Speaker = (new HalocraftOldItem("Speaker", HalocraftItems.Speaker));
		DataStorageChipBlank = (new HalocraftOldItem("DataStorageChipBlank", HalocraftItems.DataStorageChipBlank));
		MongooseEngine = (new HalocraftOldItem("MongooseEngine", HalocraftItems.MongooseEngine));
		MongooseBody = (new HalocraftOldItem("MongooseBody", HalocraftItems.MongooseBody));
		MongooseWheel = (new HalocraftOldItem("MongooseWheel", HalocraftItems.MongooseWheel));
		Hypodermic = (new HalocraftOldItem("Hypodermic", HalocraftItems.Hypodermic));
		Stimpack = (new HalocraftOldItem("Stimpack", HalocraftItems.Stimpack));
		ItemHealthPack = (new HalocraftOldItem("ItemHealthPack", HalocraftItems.ItemHealthPack));
		EnhancedFibre = (new HalocraftOldItem("EnhancedFiber", HalocraftItems.EnhancedFibre));
		UNSCPowerGenerator = (new HalocraftOldItem("UNSCPowerGenerator", HalocraftItems.UNSCPowerGenerator));
		PlasmaPowerCore = (new HalocraftOldItem("PlasmaPowerCore", HalocraftItems.UNSCPowerGenerator));
		ShieldProjector = (new HalocraftOldItem("ShieldProjector", HalocraftItems.ShieldProjector));
		//EliteEggSword = (new HCItemEliteEgg(0)).setUnlocalizedName("EliteEggSword").setMaxStackSize(64);
		//EliteEggCarbine = (new HCItemEliteEgg(1)).setUnlocalizedName("EliteEggCarbine").setMaxStackSize(64);
		//EliteEggPlasmaRifle = (new HCItemEliteEgg(2)).setUnlocalizedName("EliteEggPlasmaRifle").setMaxStackSize(64);
		DataStorageChip1 = (new HalocraftOldItem("DataStorageChip1", HalocraftItems.DataStorageChip1));
		DataStorageChip2 = (new HalocraftOldItem("DataStorageChip2", HalocraftItems.DataStorageChip2));
		ForerunnerDoorItem = (new HalocraftOldItem("ForerunnerDoorItem", HalocraftItems.ForerunnerDoorItem));
		ForerunnerDoorLockedItem = (new HalocraftOldItem("ForerunnerDoorLockedItem", HalocraftItems.ForerunnerDoorLockedItem));
		HumanDoorItem = (new HalocraftOldItem("HumanDoorItem", HalocraftItems.HumanDoorItem));
		HumanDoorLockedItem = (new HalocraftOldItem("HumanDoorLockedItem", HalocraftItems.HumanDoorLockedItem));
		ItemBlockHealthPack = (new HalocraftOldItem("ItemBlockHealthPack", HalocraftItems.ItemBlockHealthPack));
		ItemDeployableGravityLift = (new HalocraftOldItem("ItemDeployableGravityLift", HalocraftItems.ItemDeployableGravityLift));
		CeramicComposite = (new HalocraftOldItem("CeramicComposite", HalocraftItems.CeramicComposite));
		//GruntEggPlasmaPistol = (new HCItemGruntEgg()).setUnlocalizedName("GruntEggPlasmaPistol").setMaxStackSize(64);

		GameRegistry.registerItem(TitaniumIngot, TitaniumIngot.getUnlocalizedName().substring(5));
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

		HelmetUnderArmor = (new HalocraftOldItem("HelmetUnderArmor", HalocraftItemsArmor.HelmetUnderArmor));
		BodyUnderArmor = (new HalocraftOldItem("BodyUnderArmor", HalocraftItemsArmor.BodyUnderArmor));
		LegsUnderArmor = (new HalocraftOldItem("LegsUnderArmor", HalocraftItemsArmor.LegsUnderArmor));
		BootsUnderArmor = (new HalocraftOldItem("BootsUnderArmor", HalocraftItemsArmor.BootsUnderArmor));
		MarkVHelmetBlack = (new HalocraftOldItem("MarkVHelmetBlack", HalocraftItemsArmor.MarkVSeries.get(0)));
		MarkVBodyBlack = (new HalocraftOldItem("MarkVBodyBlack", HalocraftItemsArmor.MarkVSeries.get(1)));
		MarkVLegsBlack = (new HalocraftOldItem("MarkVLegsBlack", HalocraftItemsArmor.MarkVSeries.get(2)));
		MarkVBootsBlack = (new HalocraftOldItem("MarkVBootsBlack", HalocraftItemsArmor.MarkVSeries.get(3)));
		MarkVHelmetGreen = (new HalocraftOldItem("MarkVHelmetGreen", HalocraftItemsArmor.MarkVSeries.get(0)));
		MarkVBodyGreen = (new HalocraftOldItem("MarkVBodyGreen", HalocraftItemsArmor.MarkVSeries.get(1)));
		MarkVLegsGreen = (new HalocraftOldItem("MarkVLegsGreen", HalocraftItemsArmor.MarkVSeries.get(2)));
		MarkVBootsGreen = (new HalocraftOldItem("MarkVBootsGreen", HalocraftItemsArmor.MarkVSeries.get(3)));
		MarkVHelmetBlue = (new HalocraftOldItem("MarkVHelmetBlue", HalocraftItemsArmor.MarkVSeries.get(0)));
		MarkVBodyBlue = (new HalocraftOldItem("MarkVBodyBlue", HalocraftItemsArmor.MarkVSeries.get(1)));
		MarkVLegsBlue = (new HalocraftOldItem("MarkVLegsBlue", HalocraftItemsArmor.MarkVSeries.get(2)));
		MarkVBootsBlue = (new HalocraftOldItem("MarkVBootsBlue", HalocraftItemsArmor.MarkVSeries.get(3)));
		MarkVHelmetRed = (new HalocraftOldItem("MarkVHelmetRed", HalocraftItemsArmor.MarkVSeries.get(0)));
		MarkVBodyRed = (new HalocraftOldItem("MarkVBodyRed", HalocraftItemsArmor.MarkVSeries.get(1)));
		MarkVLegsRed = (new HalocraftOldItem("MarkVLegsRed", HalocraftItemsArmor.MarkVSeries.get(2)));
		MarkVBootsRed = (new HalocraftOldItem("MarkVBootsRed", HalocraftItemsArmor.MarkVSeries.get(3)));
		ODSTHelmet = (new HalocraftOldItem("ODSTHelmet", HalocraftItemsArmor.ODSTHelmet));
		ODSTBody = (new HalocraftOldItem("ODSTBody", HalocraftItemsArmor.ODSTBody));
		ODSTLegs = (new HalocraftOldItem("ODSTLegs", HalocraftItemsArmor.ODSTLegs));
		ODSTBoots = (new HalocraftOldItem("ODSTBoots", HalocraftItemsArmor.ODSTBoots));
		MarineHelmet = (new HalocraftOldItem("MarineHelmet", HalocraftItemsArmor.MarineHelmet));
		MarineBody = (new HalocraftOldItem("MarineBody", HalocraftItemsArmor.MarineBody));
		MarineLegs = (new HalocraftOldItem("MarineLegs", HalocraftItemsArmor.MarineLegs));
		MarineBoots = (new HalocraftOldItem("MarineBoots", HalocraftItemsArmor.MarineBoots));
		MarkVIHelmetGreen = (new HalocraftOldItem("MarkVIHelmetGreen", HalocraftItemsArmor.MarkVISeries.get(0)));
		MarkVIBodyGreen = (new HalocraftOldItem("MarkVIBodyGreen", HalocraftItemsArmor.MarkVISeries.get(1)));
		MarkVILegsGreen = (new HalocraftOldItem("MarkVILegsGreen", HalocraftItemsArmor.MarkVISeries.get(2)));
		MarkVIBootsGreen = (new HalocraftOldItem("MarkVIBootsGreen", HalocraftItemsArmor.MarkVISeries.get(3)));
		ReconHelmet = (new HalocraftOldItem("ReconHelmet", HalocraftItemsArmor.ReconSeries.get(0)));
		ReconBody = (new HalocraftOldItem("ReconBody", HalocraftItemsArmor.ReconSeries.get(1)));
		ReconLegs = (new HalocraftOldItem("ReconLegs", HalocraftItemsArmor.ReconSeries.get(2)));
		ReconBoots = (new HalocraftOldItem("ReconBoots", HalocraftItemsArmor.ReconSeries.get(3)));

		GameRegistry.registerItem(HelmetUnderArmor, HelmetUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BodyUnderArmor, BodyUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LegsUnderArmor, LegsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BootsUnderArmor, BootsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetBlack, MarkVHelmetBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyBlack, MarkVBodyBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsBlack, MarkVLegsBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsBlack, MarkVBootsBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetGreen, MarkVHelmetGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyGreen, MarkVBodyGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsGreen, MarkVLegsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsGreen, MarkVBootsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetBlue, MarkVHelmetBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyBlue, MarkVBodyBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsBlue, MarkVLegsBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsBlue, MarkVBootsBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetRed, MarkVHelmetRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyRed, MarkVBodyRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsRed, MarkVLegsRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsRed, MarkVBootsRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTHelmet, ODSTHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBody, ODSTBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTLegs, ODSTLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBoots, ODSTBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineHelmet, MarineHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBody, MarineBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineLegs, MarineLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBoots, MarineBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIHelmetGreen, MarkVIHelmetGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIBodyGreen, MarkVIBodyGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVILegsGreen, MarkVILegsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIBootsGreen, MarkVIBootsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconHelmet, ReconHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconBody, ReconBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconLegs, ReconLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconBoots, ReconBoots.getUnlocalizedName().substring(5));

		BattleRifle = (new HalocraftOldItem("BattleRifle", HalocraftItemsWeapons.BattleRifle));
		DMR = (new HalocraftOldItem("DMR", HalocraftItemsWeapons.DMR));
		AssaultRifle = (new HalocraftOldItem("AssaultRifle", HalocraftItemsWeapons.AssaultRifle));
		Shotgun = (new HalocraftOldItem("Shotgun", HalocraftItemsWeapons.Shotgun));
		SniperRifle = (new HalocraftOldItem("SniperRifle", HalocraftItemsWeapons.SniperRifle));
		Magnum = (new HalocraftOldItem("Magnum", HalocraftItemsWeapons.Magnum));
		SMG = (new HalocraftOldItem("SMG", HalocraftItemsWeapons.SMG));
		RocketLauncher = (new HalocraftOldItem("RocketLauncher", HalocraftItemsWeapons.RocketLauncher));
		Carbine = (new HalocraftOldItem("Carbine", HalocraftItemsWeapons.Carbine));
		PlasmaRifle = (new HalocraftOldItem("PlasmaRifle", HalocraftItemsWeapons.PlasmaRifle));
		PlasmaPistol = (new HalocraftOldItem("PlasmaPistol", HalocraftItemsWeapons.PlasmaPistol));
		Needler = (new HalocraftOldItem("Needler", HalocraftItemsWeapons.Needler));
		BeamRifle = (new HalocraftOldItem("BeamRifle", HalocraftItemsWeapons.BeamRifle));
		Flamethrower = (new HalocraftOldItem("Flamethrower", HalocraftItemsWeapons.Flamethrower));
		Spiker = (new HalocraftOldItem("Spiker", HalocraftItemsWeapons.Spiker));
		Mauler = (new HalocraftOldItem("Mauler", HalocraftItemsWeapons.Mauler));

		EnergySword = (new HalocraftOldItem("EnergySword", HalocraftItemsWeapons.EnergySword));
		Machete = (new HalocraftOldItem("Machete", HalocraftItemsWeapons.Machete));
		FragGrenade = (new HalocraftOldItem("FragGrenade", HalocraftItemsWeapons.FragGrenade));
		PlasmaGrenade = (new HalocraftOldItem("PlasmaGrenade", HalocraftItemsWeapons.PlasmaGrenade));
		FirebombGrenade = (new HalocraftOldItem("FirebombGrenade", HalocraftItemsWeapons.FirebombGrenade));
		SpikeGrenade = (new HalocraftOldItem("SpikeGrenade", HalocraftItemsWeapons.SpikeGrenade));

		SmallRounds = (new HalocraftOldItem("SmallRounds", HalocraftItemsWeapons.SmallRounds));
		MediumRounds = (new HalocraftOldItem("MediumRounds", HalocraftItemsWeapons.MediumRounds));
		LargeRounds = (new HalocraftOldItem("LargeRounds", HalocraftItemsWeapons.LargeRounds));
		ShotgunRounds = (new HalocraftOldItem("ShotgunRounds", HalocraftItemsWeapons.ShotgunRounds));
		Rocket = (new HalocraftOldItem("Rocket", HalocraftItemsWeapons.Rocket));
		//GravityHammer = (new HCItemGravityHammer(toolGravityHammer)).setUnlocalizedName("GravityHammer");

		GameRegistry.registerItem(BattleRifle, BattleRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DMR, DMR.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(AssaultRifle, AssaultRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Shotgun, Shotgun.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SniperRifle, SniperRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Magnum, Magnum.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SMG, SMG.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(SilencedSMG, "en_US", "Silenced SMG");
		//GameRegistry.registerItem(SilencedSMG, SilencedSMG.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(RocketLauncher, RocketLauncher.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(SilverRocketLauncher, "en_US", "Silver Rocket Launcher");
		//GameRegistry.registerItem(SilverRocketLauncher, SilverRocketLauncher.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(SpartanLaser, "en_US", "Spartan Laser");
		//GameRegistry.registerItem(SpartanLaser, SpartanLaser.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(GreenSpartanLaser, "en_US", "Green Spartan Laser");
		//GameRegistry.registerItem(GreenSpartanLaser, GreenSpartanLaser.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Carbine, Carbine.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PlasmaRifle, PlasmaRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PlasmaPistol, PlasmaPistol.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Needler, Needler.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BeamRifle, BeamRifle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Flamethrower, Flamethrower.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Spiker, Spiker.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Mauler, Mauler.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(FuelRodCannon, "en_US", "Fuel Rod Cannon");
		//GameRegistry.registerItem(FuelRodCannon, FuelRodCannon.getUnlocalizedName().substring(5));
		//LanguageRegistry.instance().addNameForObject(GravityHammer, "en_US", "Gravity Hammer");
		//GameRegistry.registerItem(GravityHammer, GravityHammer.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(EnergySword, EnergySword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Machete, Machete.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(FragGrenade, FragGrenade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PlasmaGrenade, PlasmaGrenade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(FirebombGrenade, FirebombGrenade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SpikeGrenade, SpikeGrenade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(SmallRounds, SmallRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MediumRounds, MediumRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LargeRounds, LargeRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ShotgunRounds, ShotgunRounds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Rocket, Rocket.getUnlocalizedName().substring(5));

		ItemMongooseDefault = (new HalocraftOldItem("MongooseDefault", HalocraftItemsVehicles.ItemMongooseDefault));
		ItemMongooseGreen = (new HalocraftOldItem("MongooseGreen", HalocraftItemsVehicles.ItemMongooseGreen));
		ItemMongooseBlue = (new HalocraftOldItem("MongooseBlue", HalocraftItemsVehicles.ItemMongooseBlue));
		ItemMongooseRed = (new HalocraftOldItem("MongooseRed", HalocraftItemsVehicles.ItemMongooseRed));

		GameRegistry.registerItem(ItemMongooseDefault, ItemMongooseDefault.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseGreen, ItemMongooseGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseBlue, ItemMongooseBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseRed, ItemMongooseRed.getUnlocalizedName().substring(5));


	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
