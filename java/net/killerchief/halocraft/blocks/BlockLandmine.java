package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLandmine extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;

	private boolean isActive = false;
	private static boolean isBlockSwapping;
	public final static float explosiveness = 4.0F;

	public BlockLandmine(String name, boolean isactive) {
		super(Material.circuits);
		this.setBlockName(Halocraft.MODID + "." + name);

		this.isActive = isactive;

		if (isactive) {
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
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":LandmineTop");
		this.iconTop = iiconregister.registerIcon(this.isActive ? Halocraft.MODID+":LandmineTop" : Halocraft.MODID+":LandmineTopOff");
		this.iconSide = iiconregister.registerIcon(Halocraft.MODID+":LandmineSide");
		this.iconBottom = iiconregister.registerIcon(Halocraft.MODID+":LandmineBottom");
	}

	public static void swapBlockType(boolean setToActive, World world, int i, int j, int k)
	{
		int l = world.getBlockMetadata(i, j, k);
		TileEntity tileentity = world.getTileEntity(i, j, k);
		isBlockSwapping = true;

		if (setToActive)
		{
			world.setBlock(i, j, k, HalocraftBlocks.LandmineActive);
		}
		else
		{
			world.setBlock(i, j, k, HalocraftBlocks.LandmineIdle);
		}

		isBlockSwapping = false;
		world.setBlockMetadataWithNotify(i, j, k, l, 2);

		if (tileentity != null)
		{
			tileentity.validate();
			world.setTileEntity(i, j, k, tileentity);
		}
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.LandmineIdle);
	}

	/**
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return Item.getItemFromBlock(HalocraftBlocks.LandmineIdle);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random)
	{
		return this.isActive ? 0 : 1;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par2)
	{
		return new TileEntityLandmine();
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (!par1World.isRemote && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == HalocraftItems.Wrench)
		{
			FMLNetworkHandler.openGui(par5EntityPlayer, Halocraft.instance, 1, par1World, par2, par3, par4);
			return true;
		}
		return false;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	{
		if (!world.isRemote && this.isActive)
		{
			TileEntityLandmine te = (TileEntityLandmine)world.getTileEntity(i, j, k);
			world.createExplosion(entity, i, j, k, explosiveness, HalocraftConfig.ExplosionBlockDamage);
			entity.attackEntityFrom((!te.getArmedByPlayer().equalsIgnoreCase("") && world.getPlayerEntityByName(te.getArmedByPlayer()) != null) ? DamageSource.causePlayerDamage(world.getPlayerEntityByName(te.getArmedByPlayer())) : DamageSource.generic, 34);
			world.setBlockToAir(i, j, k);
		}
	}

	/**
	 * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
	 */
	@Override
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	{
		if (!par1World.isRemote && this.isActive)
		{
			par1World.createExplosion(null, par2, par3, par4, explosiveness, HalocraftConfig.ExplosionBlockDamage);
		}
	}

	/**
	 * Called upon the block being destroyed by an explosion
	 */
	@Override
	public void onBlockDestroyedByExplosion(World par1World, int par2, int par3, int par4, Explosion par5Explosion)
	{
		if (!par1World.isRemote && this.isActive)
		{
			par1World.createExplosion(null, par2, par3, par4, explosiveness, HalocraftConfig.ExplosionBlockDamage);
		}
	}

	/**
	 * Returns if this block is collidable (only used by Fire). Args: x, y, z
	 */
	@Override
	public boolean isCollidable()
	{
		return true;
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
		return this.isActive ? null : super.getCollisionBoundingBoxFromPool(par1World, i, j, k);
		//AxisAlignedBB.getBoundingBox((double)i, (double)j, (double)k, (double)i + 1, (double)j + 0.2D, (double)k + 1);
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	@Override
	public void setBlockBoundsForItemRender()
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.2F, 1.0F);
		//setBlockBounds(0.3F, 0.2F, 0.3F, 0.7F, 0.3F, 0.7F);
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType()
	{
		return 0;
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
	 * Return true if a player with SlikTouch can harvest this block directly, and not it's normal drops.
	 */
	@Override
	protected boolean canSilkHarvest()
	{
		return false;
	}
}
