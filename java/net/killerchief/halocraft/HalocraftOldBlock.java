package net.killerchief.halocraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HalocraftOldBlock extends Block {

	private Block block;

	public HalocraftOldBlock(String name, Block b) {
		super(Material.iron);
		this.block = b;
		this.setBlockName(HalocraftOldIDs.MODID + "." + name);
		this.setTickRandomly(true);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":NullX");
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
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand)
	{
		world.setBlock(x, y, z, block, world.getBlockMetadata(x, y, z), 3);
	}
	
	/**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
	@Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborblock)
    {
		world.setBlock(x, y, z, block, world.getBlockMetadata(x, y, z), 3);
    }
	
	/**
     * How many world ticks before ticking
     */
    public int tickRate(World p_149738_1_)
    {
        return 1;
    }
    
    public Item getNewItem() {
		return Item.getItemFromBlock(block);
	}
}