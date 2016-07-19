package net.killerchief.halocraft.blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.UP;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.tileEntities.TileEntityForeSymbol;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDecal extends BlockContainer
{
	private String Texture;

	public BlockDecal(String name, String texture, Material material, int harvestLevel)
	{
		super(material);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.Texture = texture;
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
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID + ":" + this.Texture);
	}

	@Override
	public TileEntity createNewTileEntity(World par1World, int par2)
	{
		return new TileEntityForeSymbol();
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
		float depth = 0.05F;//from block
		float width = 0.0F;//taken from edges
		float height = 0.0F;//taken from edges

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
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	@Override
	public int onBlockPlaced(World par1World, int posX, int posY, int posZ, int side, float hitX, float hitY, float hitZ, int meta)
	{
		int tempMeta = meta;

		if (tempMeta == 0 || side == 1)
		{
			tempMeta = 0;
		}

		if (tempMeta == 1 || side == 0)
		{
			tempMeta = 12;
		}

		if (side == 2)
		{
			if (hitX <= 0.24F || hitX >= 0.76F) {
				tempMeta = 5;
			} else {
				tempMeta = 4;
			}
		}

		if (side == 3)
		{
			if (hitX <= 0.24F || hitX >= 0.76F) {
				tempMeta = 6;
			} else {
				tempMeta = 7;
			}
		}

		if (side == 4)
		{
			if (hitZ <= 0.24F || hitZ >= 0.76F) {
				tempMeta = 8;
			} else {
				tempMeta = 9;
			}
		}

		if (side == 5)
		{
			if (hitZ <= 0.24F || hitZ >= 0.76F) {
				tempMeta = 11;
			} else {
				tempMeta = 10;
			}
		}

		return tempMeta;
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
