package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockInvisibleBarrierHard extends Block {

	public BlockInvisibleBarrierHard(String name) {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + "."+name);
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
		if (HalocraftConfig.CanSeeInvisibleBarrierBlock == true)
		{
			this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":NullX");
		}
		else
		{
			this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":TransparentTexture");
		}
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	@Override
	public void setBlockBoundsForItemRender()
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random)
	{
		return 0;
	}

	/**
	 * Return true if a player with SlikTouch can harvest this block directly, and not it's normal drops.
	 */
	@Override
	protected boolean canSilkHarvest()
	{
		return false;
	}
}