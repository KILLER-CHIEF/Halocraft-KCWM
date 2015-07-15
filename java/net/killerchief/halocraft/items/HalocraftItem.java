package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HalocraftItem extends Item {

	private String Texture;

	public HalocraftItem(String name, String texture) {
		super();
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}
	
	public HalocraftItem(String name, String texture, CreativeTabs tab) {
		super();
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.setCreativeTab(tab);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(Halocraft.MODID + ":" + this.Texture);
	}
}
