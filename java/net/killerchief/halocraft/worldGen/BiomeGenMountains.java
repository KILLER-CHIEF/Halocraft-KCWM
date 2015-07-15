package net.killerchief.halocraft.worldGen;

import java.util.Random;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenForest;

public class BiomeGenMountains extends BiomeGenBase
{
	public BiomeGenMountains(int par1, float rootheight, float heightvariation)
	{
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.rootHeight = rootheight;
		this.heightVariation = heightvariation;
	}

	protected static final WorldGenForest field_150630_aD = new WorldGenForest(false, false);

	@Override
	public WorldGenAbstractTree func_150567_a(Random random)
	{
		//return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : this.worldGeneratorTrees));
		return (WorldGenAbstractTree)(random.nextInt(5) != 0 ? this.worldGeneratorTrees : field_150630_aD);
	}
}