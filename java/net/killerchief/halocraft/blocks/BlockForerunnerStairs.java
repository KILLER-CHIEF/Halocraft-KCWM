package net.killerchief.halocraft.blocks;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockForerunnerStairs extends BlockStairs {

	public BlockForerunnerStairs(String name, Block par2Block, int par3)
	{
		super(par2Block, par3);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.setCreativeTab(Halocraft.InvTabHalocraft);
		this.setLightOpacity(0);
	}
}

