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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCovSupplyCase extends BlockContainer
{
	private boolean isBase = false;
	private boolean isClosed = false;

	public BlockCovSupplyCase(String name, boolean isbase) {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + "." + name);

		this.isBase = isbase;

		if (isbase)
			this.setCreativeTab(Halocraft.InvTabHalocraft);
		else
			this.setCreativeTab(null);
	}
	
	public BlockCovSupplyCase(String name, boolean isbase, boolean setClosed) {
		this(name, isbase);
		this.isClosed = setClosed;
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":CovSupplyCase"+(!this.isClosed ? "Open" : ""));
	}
	
	@Override
	public TileEntity createNewTileEntity(World par1World, int par2)
	{
		return this.isBase ? new TileEntityCovSupplyCase() : null;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		this.setBlockBoundsForItemRender();
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int i, int j, int k)
	{
		return this.isBase ? AxisAlignedBB.getBoundingBox((double)i, (double)j, (double)k, (double)i + 1, (double)j + 2D, (double)k + 1) : super.getCollisionBoundingBoxFromPool(par1World, i, j, k);
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	@Override
	public void setBlockBoundsForItemRender()
	{
		if (this.isBase)
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
		else
			this.setBlockBounds(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.CovSupplyCaseBase);
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
	 * Called when the block is placed in the world.
	 */
	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		// When facing away from the base block:
		// 0 = South
		// 1 = West
		// 2 = North
		// 3 = East

		if (l == 0 || l == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
		}
		else if (l == 1 || l == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
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
			if (block != null && block != HalocraftBlocks.CovSupplyCaseBase && block != HalocraftBlocks.CovSupplyCaseBaseClosed)
			{
				world.setBlockToAir(posX, posY, posZ);
			}
		}
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	@Override
	public void onBlockAdded(World world, int posX, int posY, int posZ)
	{
		if (this.isBase)
		{
			world.setBlock(posX, posY + 1, posZ, HalocraftBlocks.CovSupplyCaseTop);
			if (this.isClosed)
			{
				((TileEntityCovSupplyCase)world.getTileEntity(posX, posY, posZ)).setInventorySlotContents(0, new ItemStack(HalocraftItems.CovArmorPlate));
				((TileEntityCovSupplyCase)world.getTileEntity(posX, posY, posZ)).setInventorySlotContents(2, new ItemStack(HalocraftItems.CovArmorPlate));
			}
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
		TileEntity entity = world.getTileEntity(posX, posY+(this.isBase ? 0 : -1), posZ);
		if (entity != null && entity instanceof TileEntityCovSupplyCase)
			((TileEntityCovSupplyCase)entity).dropContents();
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
		//System.out.println(side);
		int meta = world.getBlockMetadata(posX, posY+(this.isBase ? 0 : -1), posZ);
		//System.out.println(meta);

		int id = 0;
		if (entityPlayer.getCurrentEquippedItem() != null && entityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
		{
			//System.out.println("wrench");
			if ((meta == 0 && side == 3) || (meta == 1 && side == 5))
				id = 5;
			else if ((meta == 0 && side == 2) || (meta == 1 && side == 4))
				id = 6;
		}
		else
		{
			//System.out.println("not wrench");
			if ((meta == 0 && side == 3) || (meta == 1 && side == 5))
				id = 7;
			else if ((meta == 0 && side == 2) || (meta == 1 && side == 4))
				id = 8;
		}
		if (id != 0)
		{
			if (!world.isRemote)
				FMLNetworkHandler.openGui(entityPlayer, Halocraft.instance, id, world, posX, posY+(this.isBase ? 0 : -1), posZ);
			return true;
		}

		return false;
	}
}