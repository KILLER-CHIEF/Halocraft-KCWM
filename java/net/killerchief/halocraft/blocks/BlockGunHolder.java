package net.killerchief.halocraft.blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.UP;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGunHolder extends BlockContainer
{
	public BlockGunHolder(Material par2Material)
	{
		super(par2Material);
		this.setCreativeTab(Halocraft.InvTabHalocraft);
		this.setBlockName(Halocraft.MODID + ".GunHolder");
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":GunHolder");
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
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World par1World, int par2)
	{
		return new TileEntityGunHolder();
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		TileEntityGunHolder entity = (TileEntityGunHolder)par1World.getTileEntity(par2, par3, par4);
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
		{
			if (!par1World.isRemote)
			{
				FMLNetworkHandler.openGui(par5EntityPlayer, Halocraft.instance, 3, par1World, par2, par3, par4);
			}
		}
		else
		{
			entity.dropContents();
		}
		par1World.markBlockForUpdate(par2, par3, par4);
		return true;
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5Block, int par6)
	{
		TileEntityGunHolder entity = (TileEntityGunHolder)par1World.getTileEntity(par2, par3, par4);
		entity.dropContents();
		super.breakBlock(par1World, par2, par3, par4, par5Block, par6);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
	
	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	@Override
	public int onBlockPlaced(World world, int posX, int posY, int posZ, int side, float hitX, float hitY, float hitZ, int metadata)
	{
		int j1 = metadata;

		if ((metadata == 0 || side == 1) && world.isSideSolid(posX, posY+1, posZ, UP))
		{
			j1 = 1;
		}
		
		if ((metadata == 0 || side == 2) && world.isSideSolid(posX, posY, posZ + 1, NORTH))
		{
			j1 = 2;
		}

		if ((j1 == 0 || side == 3) && world.isSideSolid(posX, posY, posZ - 1, SOUTH))
		{
			j1 = 3;
		}

		if ((j1 == 0 || side == 4) && world.isSideSolid(posX + 1, posY, posZ, WEST))
		{
			j1 = 4;
		}

		if ((j1 == 0 || side == 5) && world.isSideSolid(posX - 1, posY, posZ, EAST))
		{
			j1 = 5;
		}

		return j1;
	}
	
	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor Block
	 */
	@Override
	public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock)
	{
		int l = world.getBlockMetadata(posX, posY, posZ);
		boolean flag = false;
		
		if (l == 0 && world.isSideSolid(posX, posY - 1, posZ, DOWN))
		{
			flag = true;
		}
		
		if (l == 1 && world.isSideSolid(posX, posY + 1, posZ, UP))
		{
			flag = true;
		}

		if (l == 2 && world.isSideSolid(posX, posY, posZ + 1, NORTH))
		{
			flag = true;
		}

		if (l == 3 && world.isSideSolid(posX, posY, posZ - 1, SOUTH))
		{
			flag = true;
		}

		if (l == 4 && world.isSideSolid(posX + 1, posY, posZ, WEST))
		{
			flag = true;
		}

		if (l == 5 && world.isSideSolid(posX - 1, posY, posZ, EAST))
		{
			flag = true;
		}

		if (!flag)
		{
			this.dropBlockAsItem(world, posX, posY, posZ, l, 0);
			world.setBlockToAir(posX, posY, posZ);
		}

		super.onNeighborBlockChange(world, posX, posY, posZ, neighbourBlock);
	}
	
	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
	{
		//this.setBlockBoundsBasedOnState(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);
		return null;//super.getCollisionBoundingBoxFromPool(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	{
		this.updateMountBounds(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
	}

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)
	{
		this.setBlockBoundsBasedOnState(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);
		return super.getSelectedBoundingBoxFromPool(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);
	}

	public void updateMountBounds(int metadata)
	{
		float k = 0.5F;

		if (metadata == 0)
		{
			this.setBlockBounds(0F, 0F, 0F, 1F, 1.0F - k, 1F);
			//this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}
		
		if (metadata == 1)
		{
			this.setBlockBounds(0F, 1.0F - k, 0F, 1F, 1F, 1F);
			//this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}
		
		if (metadata == 2)
		{
			this.setBlockBounds(0F, 0F, 1.0F - k, 1F, 1F, 1.0F);
			//this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}

		if (metadata == 3)
		{
			this.setBlockBounds(0F, 0F, 0F, 1F, 1F, k);
			//this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
		}

		if (metadata == 4)
		{
			this.setBlockBounds(1.0F - k, 0F, 0F, 1.0F, 1F, 1F);
			//this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}

		if (metadata == 5)
		{
			this.setBlockBounds(0F, 0F, 0F, k, 1F, 1F);
			//this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
		}
	}
}