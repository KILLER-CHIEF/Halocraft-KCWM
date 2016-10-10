package net.killerchief.halocraft.config;

import net.killerchief.halocraft.blocks.BlockBrokenComputer;
import net.killerchief.halocraft.blocks.BlockComputer;
import net.killerchief.halocraft.blocks.BlockCovSupplyCase;
import net.killerchief.halocraft.blocks.BlockDecal;
import net.killerchief.halocraft.blocks.BlockForeCtrlPanel;
import net.killerchief.halocraft.blocks.BlockForerunnerStairs;
import net.killerchief.halocraft.blocks.BlockGunHolder;
import net.killerchief.halocraft.blocks.BlockHalfSlab;
import net.killerchief.halocraft.blocks.BlockHealthPack;
import net.killerchief.halocraft.blocks.BlockInvisibleBarrierHard;
import net.killerchief.halocraft.blocks.BlockLandmine;
import net.killerchief.halocraft.blocks.BlockLightBridgeExt;
import net.killerchief.halocraft.blocks.BlockLightBridgeGen;
import net.killerchief.halocraft.blocks.BlockMetalFence;
import net.killerchief.halocraft.blocks.BlockMetalLadder;
import net.killerchief.halocraft.blocks.BlockPermanentGravityLiftBase;
import net.killerchief.halocraft.blocks.BlockPermanentGravityLiftExt;
import net.killerchief.halocraft.blocks.BlockRechargeStation;
import net.killerchief.halocraft.blocks.BlockSpreadlessGrass;
import net.killerchief.halocraft.blocks.BlockTitaniumDoor;
import net.killerchief.halocraft.blocks.BlockUnscWeaponRack;
import net.killerchief.halocraft.blocks.HalocraftBlock;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.killerchief.halocraft.tileEntities.TileEntityForeCtrlPanel;
import net.killerchief.halocraft.tileEntities.TileEntityForeSymbol;
import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeExt;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeGen;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class HalocraftBlocks {

	//               --------Blocks--------
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
	public static BlockSlab ForerunnerSlabBlock;
	public static BlockSlab ForerunnerSlabLightBlock;
	public static Block ForerunnerBlueMetal;
	public static Block ForerunnerBlueMetalLight;
	public static Block ForerunnerBlueMetalSymbol;
	public static Block ForerunnerBlueMetalStair;
	public static BlockSlab ForerunnerBlueMetalSlabBlock;
	public static BlockSlab ForerunnerBlueMetalSlabLightBlock;
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
	public static Block LandmineActive;
	public static Block LandmineIdle;
	public static Block GunHolder;
	public static Block LightBridgeExt;
	public static Block LightBridgeGenActive;
	public static Block LightBridgeGenIdle;
	
	public static Block CovSupplyCaseBase;
	public static Block CovSupplyCaseBaseClosed;
	public static Block CovSupplyCaseTop;
	
	public static Block UnscWeaponRackBase;
	public static Block UnscWeaponRackTop;
	
	public static Block ForeCtrlPanelActive;
	public static Block ForeCtrlPanelIdle;
	
	public static Block DecalArrowWhite;
	public static Block DecalArrowBlue;
	public static Block DecalArrowRed;
	public static Block DecalForeSymbol0;
	public static Block DecalForeSymbol1;
	public static Block DecalForeSymbol2;
	public static Block DecalForeSymbol3;
	public static Block DecalForeSymbol4;
	public static Block DecalForeSymbol5;
	public static Block DecalForeSymbol6;
	public static Block DecalForeSymbol7;
	public static Block DecalForeSymbol8;
	public static Block DecalForeSymbol9;
	public static Block DecalForeSymbol10;
	public static Block DecalForeSymbol11;
	public static Block DecalForeSymbol12;
	public static Block DecalForeSymbol13;

	public static void load(Configuration configuration) {
		TitaniumOre = (new HalocraftBlock("TitaniumOre", "TitaniumOre", Material.rock, 2)).setHardness(8F).setResistance(10F).setStepSound(Block.soundTypeStone);
		TitaniumBlock = (new HalocraftBlock("TitaniumBlock", "TitaniumBlock", Material.iron, 2)).setHardness(8F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		PermanentGravityLiftBaseActive = (new BlockPermanentGravityLiftBase("PermanentGravityLiftBaseActive", true)).setHardness(8F).setResistance(100F).setStepSound(Block.soundTypeMetal);
		PermanentGravityLiftBaseIdle = (new BlockPermanentGravityLiftBase("PermanentGravityLiftBaseIdle", false)).setHardness(8F).setResistance(100F).setStepSound(Block.soundTypeMetal);
		PermanentGravityLiftExt = (new BlockPermanentGravityLiftExt("BlockPermanentGravityLiftExt")).setHardness(100F).setResistance(100F).setStepSound(Block.soundTypeGlass).setLightLevel(0.2F);
		BrokenComputer = (new BlockBrokenComputer()).setHardness(1F).setResistance(1F).setStepSound(Block.soundTypeMetal);
		Computer = (new BlockComputer()).setHardness(1F).setResistance(1F).setStepSound(Block.soundTypeMetal);
		SpreadlessGrass = (new BlockSpreadlessGrass()).setHardness(0.8F).setStepSound(Block.soundTypeGrass);
		MetalLadder = (new BlockMetalLadder("MetalLadder", "MetalLadder", Material.circuits, 2)).setHardness(2F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetal = (new HalocraftBlock("ForerunnerMetal", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerLight = (new HalocraftBlock("ForerunnerLight", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(1.0F);
		ForerunnerSymbol = (new HalocraftBlock("ForerunnerSymbol", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(0.5F);
		ForerunnerFence = (new BlockMetalFence("ForerunnerFence", "ForerunnerMetal", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerStair = (new BlockForerunnerStairs("ForerunnerStair", ForerunnerMetal, 0)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerSlabBlock = (BlockSlab) new BlockHalfSlab("ForerunnerSlabBlock", "ForerunnerMetal", Material.iron, 3).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerSlabLightBlock = (BlockSlab)(new BlockHalfSlab("ForerunnerSlabLightBlock", "ForerunnerLight", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(1.0F);
		ForerunnerBlueMetal = (new HalocraftBlock("ForerunnerBlueMetal", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerBlueMetalLight = (new HalocraftBlock("ForerunnerBlueMetalLight", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(1.0F);
		ForerunnerBlueMetalSymbol = (new HalocraftBlock("ForerunnerBlueMetalSymbol", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(0.5F);
		ForerunnerBlueMetalStair = (new BlockForerunnerStairs("ForerunnerBlueMetalStair", ForerunnerBlueMetal, 0)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerBlueMetalSlabBlock = (BlockSlab)(new BlockHalfSlab("ForerunnerBlueMetalSlabBlock", "ForerunnerBlueMetal", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerBlueMetalSlabLightBlock = (BlockSlab)(new BlockHalfSlab("ForerunnerBlueMetalSlabLightBlock", "ForerunnerBlueMetalLight", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal).setLightLevel(1.0F);
		ForerunnerFloorPattern1 = (new HalocraftBlock("ForerunnerFloorPattern1", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerFloorPattern2 = (new HalocraftBlock("ForerunnerFloorPattern2", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerFloorPattern3 = (new HalocraftBlock("ForerunnerFloorPattern3", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerFloorPattern4 = (new HalocraftBlock("ForerunnerFloorPattern4", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetalPanel1 = (new HalocraftBlock("ForerunnerMetalPanel1", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetalPanel2 = (new HalocraftBlock("ForerunnerMetalPanel2", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetalPanel3 = (new HalocraftBlock("ForerunnerMetalPanel3", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetalPanel4 = (new HalocraftBlock("ForerunnerMetalPanel4", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerMetalPanel5 = (new HalocraftBlock("ForerunnerMetalPanel5", Material.iron, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		InvisibleBarrierHard = (new BlockInvisibleBarrierHard("InvisibleBarrierHard")).setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundTypeGlass);
		ForerunnerDoorBlock = (new BlockTitaniumDoor("ForerunnerDoorBlock", Material.iron, 3, 0, false)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		ForerunnerDoorLockedBlock = (new BlockTitaniumDoor("ForerunnerDoorLockedBlock", Material.iron, 3, 0, true)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		HumanDoorBlock = (new BlockTitaniumDoor("HumanDoorBlock", Material.iron, 2, 1, false)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		HumanDoorLockedBlock = (new BlockTitaniumDoor("HumanDoorLockedBlock", Material.iron, 2, 1, true)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		BlockHealthPack = (new BlockHealthPack()).setHardness(2F).setResistance(2F).setStepSound(Block.soundTypeMetal);
		UNSCPlating = (new HalocraftBlock("UNSCPlating", Material.iron, 2)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		RechargeStation = (new BlockRechargeStation()).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		LandmineActive = (new BlockLandmine("LandmineActive", true)).setHardness(0.0F).setResistance(0.0F).setStepSound(Block.soundTypeMetal);
		LandmineIdle = (new BlockLandmine("LandmineIdle", false)).setHardness(2F).setResistance(2F).setStepSound(Block.soundTypeMetal);
		GunHolder = (new BlockGunHolder(Material.circuits)).setHardness(2F).setResistance(2F).setStepSound(Block.soundTypeMetal);
		LightBridgeExt = new BlockLightBridgeExt("LightBridgeExt").setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		LightBridgeGenActive = (new BlockLightBridgeGen("LightBridgeGenActive", true)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		LightBridgeGenIdle = (new BlockLightBridgeGen("LightBridgeGenIdle", false)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		
		CovSupplyCaseBase = (new BlockCovSupplyCase("CovSupplyCaseBase", true)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		CovSupplyCaseBaseClosed = (new BlockCovSupplyCase("CovSupplyCaseBaseClosed", true, true)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		CovSupplyCaseTop = (new BlockCovSupplyCase("CovSupplyCaseTop", false)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		
		UnscWeaponRackBase = (new BlockUnscWeaponRack("UnscWeaponRackBase", true)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		UnscWeaponRackTop = (new BlockUnscWeaponRack("UnscWeaponRackTop", false)).setHardness(10F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		
		//ForeCtrlPanelActive = (new BlockForeCtrlPanel("ForeCtrlPanelActive", true)).setHardness(8F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		//ForeCtrlPanelIdle = (new BlockForeCtrlPanel("ForeCtrlPanelIdle", false)).setHardness(8F).setResistance(10F).setStepSound(Block.soundTypeMetal);
		
		DecalArrowWhite = (new BlockDecal("DecalArrowWhite", "glyphs/Glyph14", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalArrowBlue = (new BlockDecal("DecalArrowBlue", "glyphs/Glyph15", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalArrowRed = (new BlockDecal("DecalArrowRed", "glyphs/Glyph16", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol0 = (new BlockDecal("DecalForeSymbol0", "glyphs/Glyph", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol1 = (new BlockDecal("DecalForeSymbol1", "glyphs/Glyph1", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol2 = (new BlockDecal("DecalForeSymbol2", "glyphs/Glyph2", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol3 = (new BlockDecal("DecalForeSymbol3", "glyphs/Glyph3", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol4 = (new BlockDecal("DecalForeSymbol4", "glyphs/Glyph4", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol5 = (new BlockDecal("DecalForeSymbol5", "glyphs/Glyph5", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol6 = (new BlockDecal("DecalForeSymbol6", "glyphs/Glyph6", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol7 = (new BlockDecal("DecalForeSymbol7", "glyphs/Glyph7", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol8 = (new BlockDecal("DecalForeSymbol8", "glyphs/Glyph8", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol9 = (new BlockDecal("DecalForeSymbol9", "glyphs/Glyph9", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol10 = (new BlockDecal("DecalForeSymbol10", "glyphs/Glyph10", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol11 = (new BlockDecal("DecalForeSymbol11", "glyphs/Glyph11", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol12 = (new BlockDecal("DecalForeSymbol12", "glyphs/Glyph12", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
		DecalForeSymbol13 = (new BlockDecal("DecalForeSymbol13", "glyphs/Glyph13", Material.circuits, 3)).setHardness(100F).setResistance(2000F).setStepSound(Block.soundTypeMetal);
	}

	public static void registerBlocks() {
		GameRegistry.registerBlock(TitaniumOre, TitaniumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TitaniumBlock, TitaniumBlock.getUnlocalizedName().substring(5));
		OreDictionary.registerOre("oreTitanium", TitaniumOre);
		OreDictionary.registerOre("blockTitanium", TitaniumBlock);
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
		GameRegistry.registerBlock(LandmineActive, LandmineActive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LandmineIdle, LandmineIdle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(GunHolder, GunHolder.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightBridgeExt, LightBridgeExt.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightBridgeGenActive, LightBridgeGenActive.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightBridgeGenIdle, LightBridgeGenIdle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CovSupplyCaseBase, CovSupplyCaseBase.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CovSupplyCaseBaseClosed, CovSupplyCaseBaseClosed.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CovSupplyCaseTop, CovSupplyCaseTop.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(UnscWeaponRackBase, UnscWeaponRackBase.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(UnscWeaponRackTop, UnscWeaponRackTop.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(ForeCtrlPanelActive, ForeCtrlPanelActive.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(ForeCtrlPanelIdle, ForeCtrlPanelIdle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalArrowWhite, DecalArrowWhite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalArrowBlue, DecalArrowBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalArrowRed, DecalArrowRed.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol0, DecalForeSymbol0.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol1, DecalForeSymbol1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol2, DecalForeSymbol2.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol3, DecalForeSymbol3.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol4, DecalForeSymbol4.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol5, DecalForeSymbol5.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol6, DecalForeSymbol6.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol7, DecalForeSymbol7.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol8, DecalForeSymbol8.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol9, DecalForeSymbol9.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol10, DecalForeSymbol10.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol11, DecalForeSymbol11.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol12, DecalForeSymbol12.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DecalForeSymbol13, DecalForeSymbol13.getUnlocalizedName().substring(5));

		registerTileEntities();
	}

	private static void registerTileEntities() { //net.killerchief.halocraft.client.ClientProxy: bindTileEntitySpecialRenderer
		GameRegistry.registerTileEntity(BlockComputer.TileEntityComputer.class, "Halocraft.Computer");
		GameRegistry.registerTileEntity(TileEntityGravityLift.class, "Halocraft.GravityLift");
		GameRegistry.registerTileEntity(TileEntityHealthPack.class, "Halocraft.HealthPack");
		GameRegistry.registerTileEntity(TileEntityRechargeStation.class, "Halocraft.RechargeStation");
		GameRegistry.registerTileEntity(TileEntityGunHolder.class, "Halocraft.GunHolder");
		GameRegistry.registerTileEntity(TileEntityLandmine.class, "Halocraft.Landmine");
		GameRegistry.registerTileEntity(TileEntityCovSupplyCase.class, "Halocraft.CovSupplyCase");
		GameRegistry.registerTileEntity(TileEntityUnscWeaponRack.class, "Halocraft.UnscWeaponRack");
		GameRegistry.registerTileEntity(TileEntityLightBridgeExt.class, "Halocraft.LightBridgeExt");
		GameRegistry.registerTileEntity(TileEntityLightBridgeGen.class, "Halocraft.LightBridgeGen");
		GameRegistry.registerTileEntity(TileEntityForeSymbol.class, "Halocraft.ForeSymbol");
		//GameRegistry.registerTileEntity(TileEntityForeCtrlPanel.class, "Halocraft.ForeCtrlPanel");
	}

	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(TitaniumBlock, 1), new Object[] {
			"TTT", "TTT", "TTT", Character.valueOf('T'), HalocraftItems.TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Computer, 1), new Object[] {
			"CRS", "EMP", "CRS", Character.valueOf('M'), HalocraftItems.MetalRack, Character.valueOf('P'), HalocraftItems.Processorchip, 
			Character.valueOf('R'), HalocraftItems.RAMchip, Character.valueOf('C'), HalocraftItems.Microchip, 
			Character.valueOf('E'), Items.redstone, Character.valueOf('S'), HalocraftItems.Speaker
		});
		GameRegistry.addRecipe(new ItemStack(LandmineIdle, 1), new Object[] {
			"IRI", "ITI", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('R'), Items.redstone, Character.valueOf('T'), Blocks.tnt
		});

		GameRegistry.addShapelessRecipe(new ItemStack(SpreadlessGrass, 1), new Object[] {Blocks.dirt, Items.wheat_seeds});

		GameRegistry.addRecipe(new ItemStack(MetalLadder, 1), new Object[] {
			"I I", "III", "I I", Character.valueOf('I'), HalocraftItems.MetalRod
		});
		GameRegistry.addRecipe(new ItemStack(RechargeStation, 1), new Object[] {
			"III", "XOX", "III", Character.valueOf('I'), HalocraftItems.PurpleMetalPlate, Character.valueOf('X'), HalocraftItems.Microchip, Character.valueOf('O'), HalocraftItems.MetalRack
		});
		GameRegistry.addRecipe(new ItemStack(CovSupplyCaseBase, 1), new Object[] {
			"I I", "PRP", "I I", Character.valueOf('R'), RechargeStation, Character.valueOf('I'), HalocraftItems.TitaniumIngot, Character.valueOf('P'), HalocraftItems.CovArmorPlate
		});
		GameRegistry.addRecipe(new ItemStack(CovSupplyCaseBaseClosed, 1), new Object[] {
			"IPI", "PRP", "IPI", Character.valueOf('R'), RechargeStation, Character.valueOf('I'), HalocraftItems.TitaniumIngot, Character.valueOf('P'), HalocraftItems.CovArmorPlate
		});
		GameRegistry.addRecipe(new ItemStack(UnscWeaponRackBase, 1), new Object[] {
			"RBR", "IFI", "RBR", Character.valueOf('I'), HalocraftItems.TitaniumIngot, Character.valueOf('R'), HalocraftItems.MetalRod, Character.valueOf('F'), HalocraftItems.MetalRack, Character.valueOf('B'), UNSCPlating
		});
		GameRegistry.addRecipe(new ItemStack(GunHolder, 1), new Object[] {
			"III", "RRR", "III", Character.valueOf('I'), HalocraftItems.TitaniumIngot, Character.valueOf('R'), HalocraftItems.MetalRod
		});
	}
}
