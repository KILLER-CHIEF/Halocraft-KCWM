package net.killerchief.halocraft;

import java.util.List;

import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class HalocraftUtils {

	public static String[] HcDevTeam = new String[]{"KILLER_CHIEF", "GlitchyScripts", "Camo7", "FabulousMissLuna", "Hellcraftjz"};

	public static boolean isHcDevTeamMember(String name)
	{
		for (String member : HalocraftUtils.HcDevTeam) {
			if (name.equals(member))
			{
				return true;
			}
		}
		return false;
	}

	public static boolean ErrorMoveSpeedMP = false;
	public static boolean ErrorButtonList = false;

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
						if (!(HalocraftItemsArmor.IsSpartanArmorPiece(player.inventory.armorInventory[3].getItem(), 0)) && !(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.ODSTHelmet))
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
						if (!(HalocraftItemsArmor.IsSpartanArmorPiece(player.inventory.armorInventory[2].getItem(), 1)))
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
						if (!(HalocraftItemsArmor.IsSpartanArmorPiece(player.inventory.armorInventory[1].getItem(), 2)))
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
						if (!(HalocraftItemsArmor.IsSpartanArmorPiece(player.inventory.armorInventory[0].getItem(), 3)))
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
