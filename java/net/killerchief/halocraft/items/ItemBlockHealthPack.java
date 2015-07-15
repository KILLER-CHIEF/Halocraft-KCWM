package net.killerchief.halocraft.items;

import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockHealthPack extends HalocraftItem
{
	public ItemBlockHealthPack(String name, String texture)
	{
		super(name, texture);
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if (!par3World.getBlock(par4, par5, par6).getMaterial().isSolid())
		{
			return false;
		}
		else
		{
			if (par7 == 1)
			{
				++par5;
			}

			if (par7 == 2)
			{
				--par6;
			}

			if (par7 == 3)
			{
				++par6;
			}

			if (par7 == 4)
			{
				--par4;
			}

			if (par7 == 5)
			{
				++par4;
			}

			if (par7 == 0)
			{
				--par5;
			}

			if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
			{
				return false;
			}
			else if (par1ItemStack.stackSize == 0)
			{
				return false;
			}
			else
			{
				Block block = HalocraftBlocks.BlockHealthPack;
				if (par3World.canPlaceEntityOnSide(block, par4, par5, par6, false, par7, (Entity)null, par1ItemStack))
				{
					int j1 = block.onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, 0);

					if (par3World.setBlock(par4, par5, par6, block, j1, 3))
					{
						if (par3World.getBlock(par4, par5, par6) == block)
						{
							block.onBlockPlacedBy(par3World, par4, par5, par6, par2EntityPlayer, par1ItemStack);
							block.onPostBlockPlaced(par3World, par4, par5, par6, j1);
						}

						par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getStepResourcePath(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
						--par1ItemStack.stackSize;
					}
				}
				return true;
			}
		}
	}
}