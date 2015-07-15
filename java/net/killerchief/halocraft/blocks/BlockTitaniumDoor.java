package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockTitaniumDoor extends BlockDoor
{
	private String Texture;
	private int Type;
	private boolean Locked;

	public BlockTitaniumDoor(String name, Material material, int harvestLevel, int type, boolean locked)
	{
		super(material);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.Texture = name;
		this.Type = type;
		this.Locked = locked;
		this.setHarvestLevel("pickaxe", harvestLevel);
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (this.Locked)
		{
			return false; //Allow items to interact with the door
		}
		else
		{
			int i1 = this.func_150012_g(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
			int j1 = i1 & 7;
			j1 ^= 4;

			if ((i1 & 8) == 0)
			{
				p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_, p_149727_4_, j1, 2);
				p_149727_1_.markBlockRangeForRenderUpdate(p_149727_2_, p_149727_3_, p_149727_4_, p_149727_2_, p_149727_3_, p_149727_4_);
			}
			else
			{
				p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_ - 1, p_149727_4_, j1, 2);
				p_149727_1_.markBlockRangeForRenderUpdate(p_149727_2_, p_149727_3_ - 1, p_149727_4_, p_149727_2_, p_149727_3_, p_149727_4_);
			}

			p_149727_1_.playAuxSFXAtEntity(p_149727_5_, 1003, p_149727_2_, p_149727_3_, p_149727_4_, 0);
			return true;
		}
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return (p_149650_1_ & 8) != 0 ? null : (this.Locked ? (this.Type == 0 ? HalocraftItems.ForerunnerDoorLockedItem : HalocraftItems.HumanDoorLockedItem) : (this.Type == 0 ? HalocraftItems.ForerunnerDoorItem : HalocraftItems.HumanDoorItem));
	}

	/**
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return this.Locked ? (this.Type == 0 ? HalocraftItems.ForerunnerDoorLockedItem : HalocraftItems.HumanDoorLockedItem) : (this.Type == 0 ? HalocraftItems.ForerunnerDoorItem : HalocraftItems.HumanDoorItem);
	}

	@SideOnly(Side.CLIENT)
	@Override
	protected String getTextureName()
	{
		return Halocraft.MODID + ":" + this.Texture;
	}
}
