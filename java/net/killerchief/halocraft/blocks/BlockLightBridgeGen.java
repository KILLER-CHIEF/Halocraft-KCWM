package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeExt;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeGen;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLightBridgeGen extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;

	private boolean isActive = false;
	private static boolean isBlockSwapping;

	public BlockLightBridgeGen(String name, boolean isactive) {
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
     * Called when the block is placed in the world.
     */
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {
        int l = BlockPistonBase.determineOrientation(world, x, y, z, entity);
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (side <= 1)
			return this.iconTop;
		if ((metadata & 7) <= 1)
			return this.blockIcon;
		if(side == (metadata & 7))
			return this.blockIcon;
		return this.iconSide;
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID + ":LightBridgeFront");
		this.iconTop = iiconregister.registerIcon(Halocraft.MODID+":ForerunnerFloorPattern1");
		this.iconSide = iiconregister.registerIcon(Halocraft.MODID + ":ForerunnerFloorPattern3");
	}

	public void swapBlockType(boolean setToActive, World world, int i, int j, int k)
	{
		int l = world.getBlockMetadata(i, j, k);
		TileEntity tileentity = world.getTileEntity(i, j, k);
		isBlockSwapping = true;

		if (setToActive)
		{
			world.setBlock(i, j, k, HalocraftBlocks.LightBridgeGenActive);
		}
		else
		{
			world.setBlock(i, j, k, HalocraftBlocks.LightBridgeGenIdle);
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
	public void breakBlock(World world, int i, int j, int k, Block block, int oldMeta)
	{
		super.breakBlock(world, i, j, k, block, oldMeta);
		if (this.isActive)
			this.genOff(world, i, j, k, oldMeta);
	}
	
	public static void genOff(World world, int i, int j, int k, int meta)
	{
		int i1 = 0;
		int z1 = 0;
		if (meta <= 1 || meta == 2) {
			i1 = 0;
			z1 = -1;
			genOffHelper(world, i, j, k, i1, z1);
		}
		if (meta <= 1 || meta == 3) {
			i1 = 0;
			z1 = 1;
			genOffHelper(world, i, j, k, i1, z1);
		}
		if (meta <= 1 || meta == 4) {
			i1 = -1;
			z1 = 0;
			genOffHelper(world, i, j, k, i1, z1);
		}
		if (meta <= 1 || meta == 5) {
			i1 = 1;
			z1 = 0;
			genOffHelper(world, i, j, k, i1, z1);
		}
	}
	
	private static void genOffHelper(World world, int i, int j, int k, int i1, int z1)
	{
		if (!(i1 == 0 && z1 == 0))
		{
			for (int d = 1; d <= TileEntityLightBridgeGen.maxDistance; d++) {
				Block blockScan = world.getBlock(i+(d*i1), j, k+(d*z1));
				if (blockScan == HalocraftBlocks.LightBridgeExt) {
					TileEntity te = world.getTileEntity(i+(d*i1), j, k+(d*z1));
					if (te instanceof TileEntityLightBridgeExt) {
						TileEntityLightBridgeExt lbext = (TileEntityLightBridgeExt)te;
						if (lbext.active && lbext.genX == i && lbext.genY == j && lbext.genZ == k) {
							lbext.active = false;//set then send changes to client
							world.markBlockForUpdate(i+(d*i1), j, k+(d*z1));
							lbext.markDirty();
						}
					}
				}
				else if (blockScan == Blocks.air) {}
				else
					break;
			}
		}
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.LightBridgeGenIdle);
	}

	/**
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.LightBridgeGenIdle);
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
		return new TileEntityLightBridgeGen();
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (!par1World.isRemote && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
		{
			FMLNetworkHandler.openGui(par5EntityPlayer, Halocraft.instance, 4, par1World, par2, par3, par4);
			return true;
		}
		return false;
	}
}
