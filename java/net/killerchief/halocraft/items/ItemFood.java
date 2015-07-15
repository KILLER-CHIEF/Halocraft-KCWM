package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFood extends net.minecraft.item.ItemFood {

	private String Texture;

	public ItemFood(String name, String texture, int par2) {
		super(par2, true);
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.Texture = texture;
		this.setCreativeTab(Halocraft.InvTabHalocraft);
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
