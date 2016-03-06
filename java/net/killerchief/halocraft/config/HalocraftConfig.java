package net.killerchief.halocraft.config;

import static net.minecraftforge.oredict.RecipeSorter.Category.SHAPELESS;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.HalocraftUtils;
import net.killerchief.halocraft.entities.mobs.EntityEliteCarbine;
import net.killerchief.halocraft.entities.mobs.EntityElitePlasmaRifle;
import net.killerchief.halocraft.entities.mobs.EntityEliteSword;
import net.killerchief.halocraft.entities.mobs.EntityGruntPlasmaPistol;
import net.killerchief.halocraft.inventory.RecipeShapelessDamagedConvert;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.RecipeSorter;
import cpw.mods.fml.common.registry.EntityRegistry;

public class HalocraftConfig {

	public static boolean UseBiomes;
	public static int MountainsBiomeID;
	public static int OceanCliffsBiomeID;
	//public static boolean UseDimension;
	//public static int DimensionID;
	public static boolean ExplosionBlockDamage;
	public static int CrashedPelicanSpawnRate;
	public static boolean CrashedPelicansInSuperFlat;
	public static boolean SpawnElitePlasmaRifle;
	public static boolean SpawnEliteCarbine;
	public static boolean SpawnEliteSword;
	public static boolean SpawnGruntPlasmaPistol;
	public static boolean CanSeeInvisibleBarrierBlock;
	public static boolean AnchorHUDRenderCentreX;
	public static boolean AnchorHUDRenderCentreY;
	public static boolean AnchorHUDRenderRight;
	public static boolean AnchorHUDRenderTop;
	public static int HUDXOffset;
	public static int HUDYOffset;
	public static boolean UseGrenade3DModels;
	public static boolean ShowDevPerks = true;
	
	public static void DoSettingsConfiguration(Configuration config)
	{
		UseBiomes = config.get("general", "Enable Halocraft Custom Biomes", true).setRequiresMcRestart(true).getBoolean(true);
		MountainsBiomeID = config.get("general", "Biome ID For Mountains", 26).setRequiresMcRestart(true).getInt();
		OceanCliffsBiomeID = config.get("general", "Biome ID For Ocean Cliffs", 27).setRequiresMcRestart(true).getInt();
		//UseDimension = config.get("general", "Enable Halocraft Custom Dimension (Not Recommended)", false).getBoolean(true);
		//DimensionID = config.get("general", "Dimension ID", 22).getInt();
		ExplosionBlockDamage = config.get("general", "Enable Halocraft Explosion Block Damage", true).getBoolean(true);
		CrashedPelicanSpawnRate = config.get("general", "Crashed Pelican Spawn Rate", 100).getInt();
		CrashedPelicansInSuperFlat = config.get("general", "Crashed Pelicans in Super Flat Worlds", false).getBoolean(true);
		SpawnEliteCarbine = config.get("mobs", "Naturally Spawn Elite Carbine", true).setRequiresMcRestart(true).getBoolean(true);
		SpawnElitePlasmaRifle = config.get("mobs", "Naturally Spawn Elite Plasma Rifle", true).setRequiresMcRestart(true).getBoolean(true);
		SpawnEliteSword = config.get("mobs", "Naturally Spawn Elite Sword", true).setRequiresMcRestart(true).getBoolean(true);
		SpawnGruntPlasmaPistol = config.get("mobs", "Naturally Spawn Grunt Plasma Pistol", true).setRequiresMcRestart(true).getBoolean(true);
		CanSeeInvisibleBarrierBlock = config.get("render", "Can See Invisible Barrier Block", false).setRequiresMcRestart(true).getBoolean(true);
		AnchorHUDRenderCentreX = config.get("render", "Anchor HUD X Pos in Centre (Overrides Right Pos)", false).getBoolean(true);
		AnchorHUDRenderCentreY = config.get("render", "Anchor HUD Y Pos in Centre (Overrides Top Pos)", false).getBoolean(true);
		AnchorHUDRenderRight = config.get("render", "Anchor HUD Position to the Right (False: Left)", true).getBoolean(true);
		AnchorHUDRenderTop = config.get("render", "Anchor HUD Position to the Top (False: Bottom)", true).getBoolean(true);
		HUDXOffset = config.get("render", "HUD X Axis Offset from Anchored Point", 10).getInt();
		HUDYOffset = config.get("render", "HUD Y Axis Offset from Anchored Point", 10).getInt();
		UseGrenade3DModels = config.get("render", "Use Grenade 3D Models", true).setRequiresMcRestart(true).getBoolean(true);
		if (Halocraft.proxy.isSideClient() && HalocraftUtils.isHcDevTeamMember(Minecraft.getMinecraft().getSession().getUsername()))
		{
			ShowDevPerks = config.get("general", "Show Dev Perks", true).getBoolean(true);
		}
		
		config.save();
	}

	public static void loadConfig(Configuration config) {
		HalocraftBlocks.load(config);
		HalocraftItems.load(config);
		HalocraftItemsArmor.load(config);
		HalocraftItemsWeapons.load(config);
		HalocraftItemsVehicles.load(config);
		HalocraftBiomes.load(config);

		DoSettingsConfiguration(config);

		HalocraftBlocks.registerBlocks();
		HalocraftItems.registerItems();
		HalocraftItemsArmor.registerItems();
		HalocraftItemsWeapons.registerItems();
		HalocraftItemsVehicles.registerItems();
		HalocraftEntities.registerEntities();
		HalocraftBiomes.registerBiomes();
		
		RecipeSorter.register("halocraft:recipeshapelessdamagedconvert", RecipeShapelessDamagedConvert.class, SHAPELESS, "after:minecraft:shapeless");
		HalocraftBlocks.addRecipes();
		HalocraftItems.addRecipes();
		HalocraftItemsArmor.addRecipes();
		HalocraftItemsWeapons.addRecipes();
		HalocraftItemsVehicles.addRecipes();

		if(HalocraftConfig.UseBiomes == true)
			HalocraftBiomes.addBiomes();

	}

	public static void initSpawns() {
		BiomeGenBase[] SpawnBiomesAll = new BiomeGenBase[] {
			BiomeGenBase.birchForest,
			BiomeGenBase.birchForestHills,
			BiomeGenBase.coldTaiga,
			BiomeGenBase.forest,
			BiomeGenBase.forestHills,
			BiomeGenBase.jungle,
			BiomeGenBase.jungleEdge,
			BiomeGenBase.roofedForest,
			BiomeGenBase.taiga,
			BiomeGenBase.taigaHills,
			HalocraftBiomes.mountains,
			HalocraftBiomes.oceanCliffs
		};
		BiomeGenBase[] SpawnBiomesVanilla = new BiomeGenBase[] {
			BiomeGenBase.birchForest,
			BiomeGenBase.birchForestHills,
			BiomeGenBase.coldTaiga,
			BiomeGenBase.forest,
			BiomeGenBase.forestHills,
			BiomeGenBase.jungle,
			BiomeGenBase.jungleEdge,
			BiomeGenBase.roofedForest,
			BiomeGenBase.taiga,
			BiomeGenBase.taigaHills
		};
		if (SpawnElitePlasmaRifle == true)
		{
			//EntityRegistry.addSpawn(kcHalocraft.HCEntityElitePlasmaRifle.class, 1, 1, 2, EnumCreatureType.creature, new BiomeGenBase[]
			if (UseBiomes)
				EntityRegistry.addSpawn(EntityElitePlasmaRifle.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesAll);
			else
				EntityRegistry.addSpawn(EntityElitePlasmaRifle.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesVanilla);
		}
		if (SpawnEliteCarbine == true)
		{
			if (UseBiomes)
				EntityRegistry.addSpawn(EntityEliteCarbine.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesAll);
			else
				EntityRegistry.addSpawn(EntityEliteCarbine.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesVanilla);
		}
		if (SpawnEliteSword == true)
		{
			if (UseBiomes)
				EntityRegistry.addSpawn(EntityEliteSword.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesAll);
			else
				EntityRegistry.addSpawn(EntityEliteSword.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesVanilla);
		}
		if (SpawnGruntPlasmaPistol == true)
		{
			if (UseBiomes)
				EntityRegistry.addSpawn(EntityGruntPlasmaPistol.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesAll);
			else
				EntityRegistry.addSpawn(EntityGruntPlasmaPistol.class, 1, 1, 1, EnumCreatureType.monster, SpawnBiomesVanilla);
		}
	}
	
}
