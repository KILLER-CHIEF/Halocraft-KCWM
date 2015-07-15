package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPermanentGravityLiftBase extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;

	private boolean isActive = false;
	private static boolean isBlockSwapping;

	public BlockPermanentGravityLiftBase(String name, boolean isactive) {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + "." + name);

		this.isActive = isactive;

		if (isactive) {
			this.setLightLevel(0.6F);
			this.setCreativeTab(null);
		} else {
			this.setCreativeTab(Halocraft.InvTabHalocraft);
		}
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
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID + ":PermanentGravityLiftDarkTop");
		this.iconTop = iiconregister.registerIcon(this.isActive ? Halocraft.MODID+":PermanentGravityLiftBrightTop" : Halocraft.MODID+":PermanentGravityLiftDarkTop");
		this.iconSide = iiconregister.registerIcon(this.isActive ? Halocraft.MODID+":PermanentGravityLiftBrightSide" : Halocraft.MODID+":PermanentGravityLiftDarkSide");
		this.iconBottom = iiconregister.registerIcon(this.isActive ? Halocraft.MODID+":PermanentGravityLiftBrightBottom" : Halocraft.MODID+":PermanentGravityLiftDarkBottom");
	}

	public void swapBlockType(boolean setToActive, World world, int i, int j, int k)
	{
		int l = world.getBlockMetadata(i, j, k);
		TileEntity tileentity = world.getTileEntity(i, j, k);
		isBlockSwapping = true;

		if (setToActive)
		{
			world.setBlock(i, j, k, HalocraftBlocks.PermanentGravityLiftBaseActive);
		}
		else
		{
			world.setBlock(i, j, k, HalocraftBlocks.PermanentGravityLiftBaseIdle);
		}

		isBlockSwapping = false;
		world.setBlockMetadataWithNotify(i, j, k, l, 2);

		if (tileentity != null)
		{
			tileentity.validate();
			world.setTileEntity(i, j, k, tileentity);
		}
	}

	/**
	 * Called on server worlds only when the block has been replaced by a different block ID, or the same block with a
	 * different metadata value, but before the new metadata value is set. Args: World, x, y, z, old block ID, old
	 * metadata
	 */
	@Override
	public void breakBlock(World world, int i, int j, int k, Block block, int par6)
	{
		if (!world.isRemote && this.isActive)
		{
			for (int h = 1; h <= TileEntityGravityLift.maxHeight; h++) {
				if(world.getBlock(i, j + h, k) == HalocraftBlocks.PermanentGravityLiftExt)
					world.setBlock(i, j + h, k, Blocks.air);
				else
					break;
			}
		}

		super.breakBlock(world, i, j, k, block, par6);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.PermanentGravityLiftBaseIdle);
	}

	/**
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.PermanentGravityLiftBaseIdle);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random)
	{
		return 1;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileEntityGravityLift();
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (!par1World.isRemote && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
		{
			FMLNetworkHandler.openGui(par5EntityPlayer, Halocraft.instance, 2, par1World, par2, par3, par4);
			return true;
		}
		return false;
	}
}
