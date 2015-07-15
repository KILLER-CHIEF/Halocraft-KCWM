package net.killerchief.halocraft.client;

import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class InventoryTab extends CreativeTabs
{
	public InventoryTab(String label)
	{
		super(label);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		return HalocraftItemsArmor.MarkVHelmetGreen;
	}
}
