package net.killerchief.halocraft;

import java.util.List;

import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class HalocraftUtils {
	
	public static boolean ErrorMoveSpeedMP = false;
	public static boolean ErrorButtonList = false;
	public static boolean ErrorItemInUse = false;
	public static boolean ErrorItemInUseCount = false;
	
	public static void MoveSpeedMP(EntityPlayer player, float moveSpeed)
	{
		if (!ErrorMoveSpeedMP)
		{
			try {
				ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, Float.valueOf(moveSpeed), "g", "walkSpeed");
			} catch (Exception e) {
				System.err.println("I forgot to update the obfuscated reflection for MoveSpeed D:");
				e.printStackTrace();
				ErrorMoveSpeedMP = true;
			}
		}
	}
	
	public static List getButtonList(GuiScreen currentScreen)
	{
		if (!ErrorButtonList)
		{
			try {
				return ObfuscationReflectionHelper.getPrivateValue(GuiScreen.class, currentScreen, "n", "buttonList");
			} catch (Exception e) {
				System.err.println("I forgot to update the obfuscated reflection for ButtonList D:");
				e.printStackTrace();
				ErrorButtonList = true;
			}
		}
		return null;
	}
	
	public static void setItemInUse(EntityPlayer entityplayer, ItemStack value)
	{
		if (!ErrorItemInUse)
		{
			try {
				ObfuscationReflectionHelper.setPrivateValue(EntityPlayer.class, entityplayer, value, "f", "itemInUse");
			} catch (Exception e) {
				System.err.println("I forgot to update the obfuscated reflection for itemInUseCount D:");
				e.printStackTrace();
				ErrorItemInUse = true;
			}
		}
	}
	
	public static void setItemInUseCount(EntityPlayer entityplayer, int value)
	{
		if (!ErrorItemInUseCount)
		{
			try {
				ObfuscationReflectionHelper.setPrivateValue(EntityPlayer.class, entityplayer, Integer.valueOf(value), "g", "itemInUseCount");
			} catch (Exception e) {
				System.err.println("I forgot to update the obfuscated reflection for itemInUseCount D:");
				e.printStackTrace();
				ErrorItemInUseCount = true;
			}
		}
	}
	
	/*public static boolean isPlayerHoldingGun(Minecraft minecraft, boolean all, boolean zoom)//OBSOLETE
	{
		if (minecraft.thePlayer.inventory != null)
		{
			if (minecraft.thePlayer.inventory.getCurrentItem() == null)
				return false;
			Item currentItem = minecraft.thePlayer.inventory.getCurrentItem().getItem();
			if (all)
			{//TOD: Remove kc weapon reference for sentinelbeam
				if (currentItem == KCWeaponMod.weapons[HalocraftItemsWeapons.ModMapOffset+19] || currentItem == HalocraftItemsWeapons.BattleRifle || currentItem == HalocraftItemsWeapons.DMR || currentItem == HalocraftItemsWeapons.SniperRifle || currentItem == HalocraftItemsWeapons.Magnum || currentItem == HalocraftItemsWeapons.RocketLauncher || currentItem == HalocraftItemsWeapons.Carbine || currentItem == HalocraftItemsWeapons.BeamRifle || currentItem == HalocraftItemsWeapons.AssaultRifle || currentItem == HalocraftItemsWeapons.Shotgun || currentItem == HalocraftItemsWeapons.SMG || currentItem == HalocraftItemsWeapons.PlasmaRifle || currentItem == HalocraftItemsWeapons.PlasmaPistol || currentItem == HalocraftItemsWeapons.Needler || currentItem == HalocraftItemsWeapons.Flamethrower || currentItem == HalocraftItemsWeapons.EnergySword || currentItem == HalocraftItemsWeapons.Spiker || currentItem == HalocraftItemsWeapons.Mauler)
				{
					return true;
				}
			}
			if (zoom)
			{
				if(currentItem instanceof ItemWeapon && ((ItemWeapon)currentItem).Properties.IsZoomable)
				{
					return true;
				}
			}
		}
		return false;
	}*/
	
	/**
	 * This is designed for the client part of the game, i would make it ClientOnly but, i'd prefer not to as of yet.
	 * This is used.
	 * @param minecraft instance
	 * @param armourType (0 is Spartan, 1 is ODST, 2 is Marine)
	 * @param helmet (check for)
	 * @param body (check for)
	 * @param legs (check for)
	 * @param boots (check for)
	 * @return Whether the player is wearing the specified armor combination.
	 */
	public static boolean isPlayerWearingArmor(Minecraft minecraft, int armorType, boolean helmet, boolean body, boolean legs, boolean boots)
	{
		EntityPlayer player = minecraft.thePlayer.inventory.player;
		return isPlayerWearingArmor(player, armorType, helmet, body, legs, boots);
	}
	
	/**
	 * This is the main one.
	 * @param player instance
	 * @param armourType (0 is Spartan, 1 is ODST, 2 is Marine)
	 * @param helmet (check for)
	 * @param body (check for)
	 * @param legs (check for)
	 * @param boots (check for)
	 * @return Whether the player is wearing the specified armor combination.
	 */
	public static boolean isPlayerWearingArmor(EntityPlayer player, int armorType, boolean helmet, boolean body, boolean legs, boolean boots)
	{
		boolean notfail = true;
		if (player.inventory != null && player.inventory.armorInventory != null)
		{
			if (helmet && notfail)
			{
				if (player.inventory.armorInventory[3] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.ReconHelmet || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVIHelmetGreen || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetBlack || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetGreen || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetBlue || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.ODSTHelmet))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarineHelmet))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (body && notfail)
			{
				if (player.inventory.armorInventory[2] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.ReconBody || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVIBodyGreen || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyBlack || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyGreen || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyBlue || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.ODSTBody))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarineBody))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (legs && notfail)
			{
				if (player.inventory.armorInventory[1] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.ReconLegs || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVILegsGreen || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsBlack || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsGreen || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsBlue || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.ODSTLegs))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarineLegs))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (boots && notfail)
			{
				if (player.inventory.armorInventory[0] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.ReconBoots || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVIBootsGreen || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsBlack || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsGreen || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsBlue || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.ODSTBoots))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarineBoots))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
		}
		return notfail;
	}
}
