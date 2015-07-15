package net.killerchief.halocraft.blocks;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HalocraftBlock extends Block {

	private String Texture;

	public HalocraftBlock(String name, String texture, Material material, int harvestLevel) {
		super(material);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
		this.setHarvestLevel("pickaxe", harvestLevel);
	}
	
	public HalocraftBlock(String name, Material material, int harvestLevel) {
		super(material);
		this.setBlockName(Halocraft.MODID + "." + name);
		this.Texture = name;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
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
}

