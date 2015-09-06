package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCovSupplyCase extends BlockContainer
{
	private boolean isBase = false;

	public BlockCovSupplyCase(String name, boolean isbase) {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + "." + name);

		this.isBase = isbase;

		//if (isbase)
			this.setCreativeTab(Halocraft.InvTabHalocraft);
		//else
		//	this.setCreativeTab(null);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Halocraft.MODID+":NullX");
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return -1;//TODO: Need ignoreFrustumCheck
	}

	@Override
	public TileEntity createNewTileEntity(World par1World, int par2)
	{
		return this.isBase ? new TileEntityCovSupplyCase() : null;
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random)
	{
		return this.isBase ? 1 : 0;
	}
	
	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World world, int posX, int posY, int posZ)
	{
		return this.isBase ? (world.getBlock(posX, posY + 1, posZ) == Blocks.air ? true : false) : false;
	}
	
	/**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
	@Override
    public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block p_149695_5_)
    {
		if (!this.isBase)
		{
			Block block = world.getBlock(posX, posY - 1, posZ);
			if (block != null && block != HalocraftBlocks.CovSupplyCaseBase)
			{
				world.setBlockToAir(posX, posY, posZ);
			}
		}
    }
	
	/**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World world, int posX, int posY, int posZ)
    {
    	if (this.isBase)
		{
    		world.setBlock(posX, posY + 1, posZ, HalocraftBlocks.CovSupplyCaseTop);
		}
    }
	
	/**
	 * Called on server worlds only when the block has been replaced by a different block ID, or the same block with a
	 * different metadata value, but before the new metadata value is set. Args: World, x, y, z, old block ID, old
	 * metadata
	 */
	@Override
	public void breakBlock(World world, int posX, int posY, int posZ, Block block, int par6)
	{
		if (this.isBase)
		{
			world.setBlockToAir(posX, posY + 1, posZ);
		}
		else
		{
			world.setBlockToAir(posX, posY - 1, posZ);
		}
	}
	
	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World world, int posX, int posY, int posZ, EntityPlayer entityPlayer, int side, float clickX, float clickY, float clickZ)
	{
		if (this.isBase)
		{
			if (!world.isRemote && entityPlayer.getCurrentEquippedItem() != null && entityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
			{
				//FMLNetworkHandler.openGui(entityPlayer, Halocraft.instance, 1, world, posX, posY, posZ);
				return true;
			}
		}
		else
		{
			
		}
		
		return false;
	}
}