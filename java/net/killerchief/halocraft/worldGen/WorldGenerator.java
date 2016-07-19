package net.killerchief.halocraft.worldGen;

import java.util.Random;

import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		if (world.getWorldInfo().getTerrainType() != WorldType.FLAT || (world.getWorldInfo().getTerrainType() == WorldType.FLAT && world.getWorldInfo().getGeneratorOptions().toLowerCase().contains("decoration")))
			for (int k = 0; k < 8; k++)
			{
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(60);
				int RandPosZ = blockZ + random.nextInt(16);
				(new WorldGenMinable(HalocraftBlocks.TitaniumOre, 8)).generate(world, random, RandPosX, RandPosY, RandPosZ);
			}

		for (int k = 0; k < (world.getWorldInfo().getTerrainType() == WorldType.FLAT ? HalocraftConfig.CrashedPelicanSpawnRate/20 : HalocraftConfig.CrashedPelicanSpawnRate); k++)//200
		{
			//System.out.println(world.getPrecipitationHeight(blockX, blockZ));
			int RandPosX = blockX + random.nextInt(16);
			int RandPosY = world.getPrecipitationHeight(blockX, blockZ) - 16 + random.nextInt(32);
			RandPosY = RandPosY > 1 ? RandPosY : 1 + Math.abs(RandPosY);
			int RandPosZ = blockZ + random.nextInt(16);
			if ((new WorldGenCrashedPelican()).generate(world, random, RandPosX, RandPosY, RandPosZ))
				break;
		}
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}
}