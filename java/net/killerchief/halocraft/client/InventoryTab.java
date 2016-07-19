package net.killerchief.halocraft.client;

import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsVehicles;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class InventoryTab extends CreativeTabs
{
	private int itemIcon = 0;

	public InventoryTab(String label)
	{
		super(label);
	}
	public InventoryTab(String label, int iconId)
	{
		super(label);
		this.itemIcon = iconId;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		if (itemIcon == 1) {
			return HalocraftItemsVehicles.ItemWarthogChainGun;
		}
		else if (itemIcon == 2) {
			return HalocraftItemsArmor.MarkVSeries.get(8);
		}
		return Item.getItemFromBlock(HalocraftBlocks.GunHolder);
	}
}
