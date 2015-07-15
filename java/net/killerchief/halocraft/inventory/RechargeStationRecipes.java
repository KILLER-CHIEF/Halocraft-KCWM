package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RechargeStationRecipes
{
    public RechargeStationRecipes()
    {
    }

    public static ItemStack getSmeltingResult(Item i, Item j)
    {
        return getOutput(i, j);
    }

    private static ItemStack getOutput(Item i, Item j)
    {
        if (i == HalocraftItemsWeapons.PlasmaPistol && j == HalocraftItems.PurpleMetalPlate || i == HalocraftItems.PurpleMetalPlate && j == HalocraftItemsWeapons.PlasmaPistol)
        {
            return new ItemStack(HalocraftItemsWeapons.PlasmaPistol, 1);
        }
        if (i == HalocraftItemsWeapons.PlasmaRifle && j == HalocraftItems.PurpleMetalPlate || i == HalocraftItems.PurpleMetalPlate && j == HalocraftItemsWeapons.PlasmaRifle)
        {
            return new ItemStack(HalocraftItemsWeapons.PlasmaRifle, 1);
        }
        if (i == HalocraftItemsWeapons.Carbine && j == HalocraftItems.PurpleMetalPlate || i == HalocraftItems.PurpleMetalPlate && j == HalocraftItemsWeapons.Carbine)
        {
            return new ItemStack(HalocraftItemsWeapons.Carbine, 1);
        }
        if (i == HalocraftItemsWeapons.Needler && j == HalocraftItems.PurpleMetalPlate || i == HalocraftItems.PurpleMetalPlate && j == HalocraftItemsWeapons.Needler)
        {
            return new ItemStack(HalocraftItemsWeapons.Needler, 1);
        }
        if (i == HalocraftItems.SwordHilt && j == HalocraftItems.PurpleMetalPlate || i == HalocraftItems.PurpleMetalPlate && j == HalocraftItems.SwordHilt)
        {
            return new ItemStack(HalocraftItems.SwordHilt, 1);
        }
		return null;
    }
}