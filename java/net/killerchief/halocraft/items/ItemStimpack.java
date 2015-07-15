package net.killerchief.halocraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStimpack extends HalocraftItem {

	public ItemStimpack(String name, String texture) {
		super(name, texture);
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par3EntityPlayer.capabilities.isCreativeMode)
		{
			--par1ItemStack.stackSize;
		}

		par3EntityPlayer.clearActivePotions();
		par3EntityPlayer.heal(8);
		par3EntityPlayer.getFoodStats().addStats(4, 4);

		return par1ItemStack;
	}
}