package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPermanentGravityLiftExt extends Block {

	public BlockPermanentGravityLiftExt(String name) {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + "." + name);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":TransparentTexture");
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	{
		//if (entity instanceof net.minecraft.client.entity.EntityClientPlayerMP)//EntityClientPlayerMP)
		//{}else
		//{
		if (entity.motionY > 0.9D) {

		} else {
			entity.motionY += 0.1D;
		}
		//System.out.println(entity.motionY);
		//System.out.println(entity);
		entity.fallDistance = 0.0F;
		//}


	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return false;
	}

	/**
	 * Returns if this block is collidable (only used by Fire). Args: x, y, z
	 */
	@Override
	public boolean isCollidable()
	{
		return false;
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
	 * Sets the block's bounds for rendering it as an item
	 */
	@Override
	public void setBlockBoundsForItemRender()
	{
		//setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
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

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	/*public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            par1World.setBlockWithNotify(par2, par3, par4, 0);
        }
    }*/

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	/*public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        if (par1World.getBlockId(par2, par3 - 1, par4) != mod_Halocraft.PermanentGravityLiftBase.blockID)
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3 - 2, par4) != mod_Halocraft.PermanentGravityLiftBase.blockID)
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3 - 3, par4) != mod_Halocraft.PermanentGravityLiftBase.blockID)
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3 - 4, par4) != mod_Halocraft.PermanentGravityLiftBase.blockID)
        {
            return true;
        }
        else if (par1World.getBlockId(par2, par3 - 5, par4) != mod_Halocraft.PermanentGravityLiftBase.blockID)
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	/*public void onNeighborBlockChange2(World world, int i, int j, int k, int l)
	{
    	if(world.getBlockId(i, j - 1, k) != mod_Halocraft.BlockPermanentGravityLiftBase.blockID)
		{}else
		{
			if(world.getBlockId(i, j - 2, k) != mod_Halocraft.BlockPermanentGravityLiftBase.blockID)
			{}else
			{
				if(world.getBlockId(i, j - 3, k) != mod_Halocraft.BlockPermanentGravityLiftBase.blockID)
				{}else
				{
					if(world.getBlockId(i, j - 4, k) != mod_Halocraft.BlockPermanentGravityLiftBase.blockID)
					{}else
					{
						if(world.getBlockId(i, j - 5, k) != mod_Halocraft.BlockPermanentGravityLiftBase.blockID)
						{}else
						{
							world.setBlockWithNotify(i, j, k, 0);
						}
					}
				}
			}
		}

		for(int a = 0; a < #; a++)
		{
			for(int b = 0; b < #; b++)
			{
				world.setBlockWithNotify(i + a, j + b, k, mod_Halocraft.BlockPermanentGravityLiftBase.blockID);
			}
		}
	}*/

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	/*@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		if(par1World.getBlockId(par2, par3 - 1, par4) != Halocraft.PermanentGravityLiftBase.blockID)
		{}else
		{
			if(par1World.getBlockId(par2, par3 - 2, par4) != Halocraft.PermanentGravityLiftBase.blockID)
			{}else
			{
				if(par1World.getBlockId(par2, par3 - 3, par4) != Halocraft.PermanentGravityLiftBase.blockID)
				{}else
				{
					if(par1World.getBlockId(par2, par3 - 4, par4) != Halocraft.PermanentGravityLiftBase.blockID)
					{}else
					{
						if(par1World.getBlockId(par2, par3 - 5, par4) != Halocraft.PermanentGravityLiftBase.blockID)
						{}else
						{
							par1World.setBlockToAir(par2, par3, par4);
						}
					}
				}
			}
		}
	}*/
}