package net.killerchief.halocraft.config;

import net.killerchief.halocraft.worldGen.BiomeGenMountains;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.config.Configuration;

public class HalocraftBiomes {
	
	public static BiomeGenBase mountains;
	public static BiomeGenBase oceanCliffs;
	
	public static void load(Configuration config) {
		
	}

	public static void registerBiomes() {
		mountains = new BiomeGenMountains(HalocraftConfig.MountainsBiomeID, 1F, 1.8F).setColor(353825).setBiomeName("Mountains").func_76733_a(5159473).setTemperatureRainfall(0.7F, 0.8F);
		oceanCliffs = new BiomeGenMountains(HalocraftConfig.OceanCliffsBiomeID, -0.6F, 1.0F).setColor(353825).setBiomeName("OceanCliffs").func_76733_a(5159473).setTemperatureRainfall(0.7F, 0.8F);
	}
	
	public static void addBiomes() {
		BiomeManager.addSpawnBiome(mountains);
		BiomeManager.addSpawnBiome(oceanCliffs);
	}
}
