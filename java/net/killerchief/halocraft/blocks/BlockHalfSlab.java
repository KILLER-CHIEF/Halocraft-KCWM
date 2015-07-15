package net.killerchief.halocraft.blocks;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHalfSlab extends BlockSlab {

	private String Texture;

	public BlockHalfSlab (String name, String texture, Material material, int harvestLevel) {
		super(false, material);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
		this.setLightOpacity(0);
		this.setHarvestLevel("pickaxe", harvestLevel);
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

	/**
	 * Returns the slab block name with step type.
	 */
	@Override
	public String func_150002_b(int par1)//getFullSlabName
	{
		return super.getUnlocalizedName();
	}
	
	/**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
    	if (this == HalocraftBlocks.ForerunnerSlabBlock)
    		return Item.getItemFromBlock(HalocraftBlocks.ForerunnerSlabBlock);
    	else if (this == HalocraftBlocks.ForerunnerSlabLightBlock)
    		return Item.getItemFromBlock(HalocraftBlocks.ForerunnerSlabLightBlock);
    	else if (this == HalocraftBlocks.ForerunnerBlueMetalSlabBlock)
    		return Item.getItemFromBlock(HalocraftBlocks.ForerunnerBlueMetalSlabBlock);
    	else if (this == HalocraftBlocks.ForerunnerBlueMetalSlabLightBlock)
    		return Item.getItemFromBlock(HalocraftBlocks.ForerunnerBlueMetalSlabLightBlock);
    	else
    		return Item.getItemFromBlock(HalocraftBlocks.ForerunnerSlabBlock);
    }
}