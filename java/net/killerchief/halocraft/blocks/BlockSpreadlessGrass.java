package net.killerchief.halocraft.blocks;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpreadlessGrass extends Block {

	public BlockSpreadlessGrass() {
		super(Material.grass);
		this.setBlockName(Halocraft.MODID + ".SpreadlessGrass");
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID + ":SpreadlessGrass");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getBlockColor()
	{
		double d0 = 0.5D;
		double d1 = 1.0D;
		return ColorizerGrass.getGrassColor(d0, d1);
	}

	/**
	 * Returns the color this block should be rendered. Used by leaves.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderColor(int p_149741_1_)
	{
		return this.getBlockColor();
	}

	/**
	 * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
	 * when first determining what to render.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
	{
		int l = 0;
		int i1 = 0;
		int j1 = 0;

		for (int k1 = -1; k1 <= 1; ++k1)
		{
			for (int l1 = -1; l1 <= 1; ++l1)
			{
				int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeGrassColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
				l += (i2 & 16711680) >> 16;
			i1 += (i2 & 65280) >> 8;
			j1 += i2 & 255;
			}
		}

		return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
	}
}