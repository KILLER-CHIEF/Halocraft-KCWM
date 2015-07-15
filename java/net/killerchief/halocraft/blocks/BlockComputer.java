package net.killerchief.halocraft.blocks;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockComputer extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;

	public BlockComputer() {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + ".Computer");
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	@Override
	public IIcon getIcon(int Side, int Metadata)
	{
		if(Side == 0)
			return this.iconBottom;
		if(Side == 1)
			return this.iconTop;
		if(Side == 2)
			return this.iconSide;
		if(Side == 3)
			return this.iconSide;
		if(Side == 4)
			return this.iconSide;
		if(Side == 5)
			return this.iconSide;

		return this.blockIcon;
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":ComputerSide");
		this.iconTop = iiconregister.registerIcon(Halocraft.MODID+":ComputerTop");
		this.iconSide = iiconregister.registerIcon(Halocraft.MODID+":ComputerSide");
		this.iconBottom = iiconregister.registerIcon(Halocraft.MODID+":ComputerTop");
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (world.getBlockMetadata(i, j, k) == 0)
		{
			return false;
		}
		else
		{
			this.ejectRecord(world, i, j, k);
			return true;
		}
	}

	public void insertRecord(World p_149926_1_, int p_149926_2_, int p_149926_3_, int p_149926_4_, ItemStack p_149926_5_)
	{
		if (!p_149926_1_.isRemote)
		{
			BlockComputer.TileEntityComputer tileentitycomputer = (BlockComputer.TileEntityComputer)p_149926_1_.getTileEntity(p_149926_2_, p_149926_3_, p_149926_4_);

			if (tileentitycomputer != null)
			{
				tileentitycomputer.func_145857_a(p_149926_5_.copy());
				p_149926_1_.setBlockMetadataWithNotify(p_149926_2_, p_149926_3_, p_149926_4_, 1, 2);
			}
		}
	}

	public void ejectRecord(World p_149925_1_, int p_149925_2_, int p_149925_3_, int p_149925_4_)
	{
		if (!p_149925_1_.isRemote)
		{
			BlockComputer.TileEntityComputer tileentitycomputer = (BlockComputer.TileEntityComputer)p_149925_1_.getTileEntity(p_149925_2_, p_149925_3_, p_149925_4_);

			if (tileentitycomputer != null)
			{
				ItemStack itemstack = tileentitycomputer.getRecord();

				if (itemstack != null)
				{
					p_149925_1_.playAuxSFX(1005, p_149925_2_, p_149925_3_, p_149925_4_, 0);
					p_149925_1_.playRecord((String)null, p_149925_2_, p_149925_3_, p_149925_4_);
					tileentitycomputer.func_145857_a((ItemStack)null);
					p_149925_1_.setBlockMetadataWithNotify(p_149925_2_, p_149925_3_, p_149925_4_, 0, 2);
					float f = 0.7F;
					double d0 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
					double d1 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.2D + 0.6D;
					double d2 = (double)(p_149925_1_.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
					ItemStack itemstack1 = itemstack.copy();
					EntityItem entityitem = new EntityItem(p_149925_1_, (double)p_149925_2_ + d0, (double)p_149925_3_ + d1, (double)p_149925_4_ + d2, itemstack1);
					entityitem.delayBeforeCanPickup = 10;
					p_149925_1_.spawnEntityInWorld(entityitem);
				}
			}
		}
	}

	@Override
	public void breakBlock(World world, int i, int j, int k, Block block, int p_149749_6_)
	{
		this.ejectRecord(world, i, j, k);
		super.breakBlock(world, i, j, k, block, p_149749_6_);
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	@Override
	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	{
		if (!p_149690_1_.isRemote)
		{
			super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
		}
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new BlockComputer.TileEntityComputer();
	}

	/**
	 * If this returns true, then comparators facing away from this block will use the value from
	 * getComparatorInputOverride instead of the actual redstone signal strength.
	 */
	@Override
	public boolean hasComparatorInputOverride()
	{
		return true;
	}

	/**
	 * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
	 * strength when this block inputs to a comparator.
	 */
	@Override
	public int getComparatorInputOverride(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_)
	{
		ItemStack itemstack = ((BlockComputer.TileEntityComputer)p_149736_1_.getTileEntity(p_149736_2_, p_149736_3_, p_149736_4_)).getRecord();
		return itemstack == null ? 0 : Item.getIdFromItem(itemstack.getItem()) + 1 - Item.getIdFromItem(Items.record_13);
	}

	public static class TileEntityComputer extends TileEntity
	{
		private ItemStack record;

		@Override
		public void readFromNBT(NBTTagCompound p_145839_1_)
		{
			super.readFromNBT(p_145839_1_);

			if (p_145839_1_.hasKey("RecordItem", 10))
			{
				this.func_145857_a(ItemStack.loadItemStackFromNBT(p_145839_1_.getCompoundTag("RecordItem")));
			}
			else if (p_145839_1_.getInteger("Record") > 0)
			{
				this.func_145857_a(new ItemStack(Item.getItemById(p_145839_1_.getInteger("Record")), 1, 0));
			}
		}

		@Override
		public void writeToNBT(NBTTagCompound p_145841_1_)
		{
			super.writeToNBT(p_145841_1_);

			if (this.getRecord() != null)
			{
				p_145841_1_.setTag("RecordItem", this.getRecord().writeToNBT(new NBTTagCompound()));
				p_145841_1_.setInteger("Record", Item.getIdFromItem(this.getRecord().getItem()));
			}
		}

		public ItemStack getRecord()
		{
			return this.record;
		}

		public void func_145857_a(ItemStack itemstack)
		{
			this.record = itemstack;
			this.markDirty();
		}
	}
}