package net.killerchief.kcweaponmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
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
		return KCWeaponMod.weapons.length > 0 && KCWeaponMod.weapons[0] != null ? KCWeaponMod.weapons[0] : Items.bow;
	}
}
