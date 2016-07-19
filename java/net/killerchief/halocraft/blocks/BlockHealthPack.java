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
import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHealthPack extends BlockContainer
{
	public BlockHealthPack()
	{
		super(Material.circuits);
		this.setBlockName(Halocraft.MODID + ".BlockHealthPack");
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":HealthPack");
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (!par5EntityPlayer.capabilities.isCreativeMode)
		{
			par1World.playSoundAtEntity(par5EntityPlayer, Halocraft.MODID+":items.PickupHealth", 1.0F, 1.0F);
			par5EntityPlayer.clearActivePotions();
			par5EntityPlayer.heal(18);
			par5EntityPlayer.extinguish();
			par5EntityPlayer.getFoodStats().addStats(10, 8);
			par1World.setBlockToAir(par2, par3, par4);
		}
		return true;
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		return null;
	}

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		this.updateLadderBounds(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
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
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType()
	{
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World par1World, int par2)
	{
		return new TileEntityHealthPack();
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return par1World.isSideSolid(par2 - 1, par3, par4, EAST ) ||
				par1World.isSideSolid(par2 + 1, par3, par4, WEST ) ||
				par1World.isSideSolid(par2, par3, par4 - 1, SOUTH) ||
				par1World.isSideSolid(par2, par3, par4 + 1, NORTH) ||
				par1World.isSideSolid(par2, par3 - 1, par4, UP   ) ||
				par1World.isSideSolid(par2, par3 + 1, par4, DOWN );
	}

	/**
	 * Update the ladder block bounds based on the given metadata value.
	 */
	public void updateLadderBounds(int par1)
	{
		// Up = facing up, Down = facing down
		// par1:
		// 1 = Up, North
		// 2 = Up, West
		// 3 = North
		// 4 = South
		// 5 = West
		// 6 = East
		// 7 = Down, North
		// 8 = Down, West

		// looking at it on wall
		float depth = 0.18F;//from block
		float width = 0.19F;//taken from edges
		float height = 0.13F;//taken from edges

		if (par1 == 0)//Up, North
		{
			this.setBlockBounds(0.0F + width, 0.0F        , 0.0F + height, 1.0F - width, 0.0F + depth, 1.0F - height);
		}
		if (par1 == 1)//Up, South
		{
			this.setBlockBounds(0.0F + width, 0.0F        , 0.0F + height, 1.0F - width, 0.0F + depth, 1.0F - height);
		}
		if (par1 == 2)//Up, West
		{
			this.setBlockBounds(0.0F + height, 0.0F        , 0.0F + width, 1.0F - height, 0.0F + depth, 1.0F - width);
		}
		if (par1 == 3)//Up, East
		{
			this.setBlockBounds(0.0F + height, 0.0F        , 0.0F + width, 1.0F - height, 0.0F + depth, 1.0F - width);
		}
		if (par1 == 4)//North, Left
		{
			this.setBlockBounds(0.0F + width, 0.0F + height, 1.0F - depth, 1.0F - width, 1.0F - height, 1.0F        );
		}
		if (par1 == 5)//North, Right
		{
			this.setBlockBounds(0.0F + width, 0.0F + height, 1.0F - depth, 1.0F - width, 1.0F - height, 1.0F        );
		}
		if (par1 == 6)//South, Left
		{
			this.setBlockBounds(0.0F + width, 0.0F + height, 0.0F        , 1.0F - width, 1.0F - height, 0.0F + depth);
		}
		if (par1 == 7)//South, Right
		{
			this.setBlockBounds(0.0F + width, 0.0F + height, 0.0F        , 1.0F - width, 1.0F - height, 0.0F + depth);
		}
		if (par1 == 8)//West, Left
		{
			this.setBlockBounds(1.0F - depth, 0.0F + height, 0.0F + width, 1.0F        , 1.0F - height, 1.0F - width);
		}
		if (par1 == 9)//West, Right
		{
			this.setBlockBounds(1.0F - depth, 0.0F + height, 0.0F + width, 1.0F        , 1.0F - height, 1.0F - width);
		}
		if (par1 == 10)//East, Left
		{
			this.setBlockBounds(0.0F        , 0.0F + height, 0.0F + width, 0.0F + depth, 1.0F - height, 1.0F - width);
		}
		if (par1 == 11)//East, Right
		{
			this.setBlockBounds(0.0F        , 0.0F + height, 0.0F + width, 0.0F + depth, 1.0F - height, 1.0F - width);
		}
		if (par1 == 12)//Down, North
		{
			this.setBlockBounds(0.0F + width, 1.0F - depth, 0.0F + height, 1.0F - width, 1.0F        , 1.0F - height);
		}
		if (par1 == 13)//Down, South
		{
			this.setBlockBounds(0.0F + width, 1.0F - depth, 0.0F + height, 1.0F - width, 1.0F        , 1.0F - height);
		}
		if (par1 == 14)//Down, West
		{
			this.setBlockBounds(0.0F + height, 1.0F - depth, 0.0F + width, 1.0F - height, 1.0F        , 1.0F - width);
		}
		if (par1 == 15)//Down, East
		{
			this.setBlockBounds(0.0F + height, 1.0F - depth, 0.0F + width, 1.0F - height, 1.0F        , 1.0F - width);
		}
	}

	/**
	 * Called when the block is placed in the world.
	 */
	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int i1 = par1World.getBlockMetadata(par2, par3, par4);

		// When facing away from the base block:
		// 0 = South
		// 1 = West
		// 2 = North
		// 3 = East

		if (i1 == 0)
		{
			if (l == 0)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
			}
			if (l == 2)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
			}
			if (l == 1)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
			}
			if (l == 3)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
			}
		}

		if (i1 == 12)
		{
			if (l == 0)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 13, 2);
			}
			if (l == 2)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 12, 2);
			}
			if (l == 1)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 14, 2);
			}
			if (l == 3)
			{
				par1World.setBlockMetadataWithNotify(par2, par3, par4, 15, 2);
			}
		}

		checkIfSidesAreValid(par1World, par2, par3, par4);
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	@Override
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		int j1 = par9;

		if ((j1 == 0 || par5 == 1) && par1World.isSideSolid(par2, par3 - 1, par4, UP))
		{
			j1 = 0;
		}

		if ((j1 == 0 || par5 == 0) && par1World.isSideSolid(par2, par3 + 1, par4, DOWN))
		{
			j1 = 12;
		}

		if (par5 == 2 && par1World.isSideSolid(par2, par3, par4 + 1, NORTH))
		{
			if ((double)par6 <= 0.5D) {
				j1 = 5;
			} else {
				j1 = 4;
			}
		}

		if (par5 == 3 && par1World.isSideSolid(par2, par3, par4 - 1, SOUTH))
		{
			if ((double)par6 <= 0.5D) {
				j1 = 6;
			} else {
				j1 = 7;
			}
		}

		if (par5 == 4 && par1World.isSideSolid(par2 + 1, par3, par4, WEST))
		{
			if ((double)par8 <= 0.5D) {
				j1 = 8;
			} else {
				j1 = 9;
			}
		}

		if (par5 == 5 && par1World.isSideSolid(par2 - 1, par3, par4, EAST))
		{
			if ((double)par8 <= 0.5D) {
				j1 = 11;
			} else {
				j1 = 10;
			}
		}

		return j1;
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
	{
		checkIfSidesAreValid(par1World, par2, par3, par4);

		super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
	}

	private void checkIfSidesAreValid(World par1World, int par2, int par3, int par4)
	{
		int i1 = par1World.getBlockMetadata(par2, par3, par4);
		boolean flag = false;

		if (i1 == 0 && par1World.isSideSolid(par2, par3 - 1, par4, UP))
		{
			flag = true;
		}
		if (i1 == 1 && par1World.isSideSolid(par2, par3 - 1, par4, UP))
		{
			flag = true;
		}
		if (i1 == 2 && par1World.isSideSolid(par2, par3 - 1, par4, UP))
		{
			flag = true;
		}
		if (i1 == 3 && par1World.isSideSolid(par2, par3 - 1, par4, UP))
		{
			flag = true;
		}
		if (i1 == 4 && par1World.isSideSolid(par2, par3, par4 + 1, NORTH))
		{
			flag = true;
		}
		if (i1 == 5 && par1World.isSideSolid(par2, par3, par4 + 1, NORTH))
		{
			flag = true;
		}
		if (i1 == 6 && par1World.isSideSolid(par2, par3, par4 - 1, SOUTH))
		{
			flag = true;
		}
		if (i1 == 7 && par1World.isSideSolid(par2, par3, par4 - 1, SOUTH))
		{
			flag = true;
		}
		if (i1 == 8 && par1World.isSideSolid(par2 + 1, par3, par4, WEST))
		{
			flag = true;
		}
		if (i1 == 9 && par1World.isSideSolid(par2 + 1, par3, par4, WEST))
		{
			flag = true;
		}
		if (i1 == 10 && par1World.isSideSolid(par2 - 1, par3, par4, EAST))
		{
			flag = true;
		}
		if (i1 == 11 && par1World.isSideSolid(par2 - 1, par3, par4, EAST))
		{
			flag = true;
		}
		if (i1 == 12 && par1World.isSideSolid(par2, par3 + 1, par4, DOWN))
		{
			flag = true;
		}
		if (i1 == 13 && par1World.isSideSolid(par2, par3 + 1, par4, DOWN))
		{
			flag = true;
		}
		if (i1 == 14 && par1World.isSideSolid(par2, par3 + 1, par4, DOWN))
		{
			flag = true;
		}
		if (i1 == 15 && par1World.isSideSolid(par2, par3 + 1, par4, DOWN))
		{
			flag = true;
		}

		if (!flag)
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, i1, 0);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	/**
	 * Called when a user uses the creative pick block button on this block
	 *
	 * @param target The full target the player is looking at
	 * @return A ItemStack to add to the player's inventory, Null if nothing should be added.
	 */
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		return new ItemStack(HalocraftItems.ItemBlockHealthPack);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return HalocraftItems.ItemBlockHealthPack;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}
