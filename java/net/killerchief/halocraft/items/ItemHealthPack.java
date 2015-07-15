package net.killerchief.halocraft.items;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHealthPack extends HalocraftItem {

	public ItemHealthPack(String name, String texture) {
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
			par2World.playSoundAtEntity(par3EntityPlayer, Halocraft.MODID+":items.PickupHealth", 1.0F, 1.0F);
		}

		par3EntityPlayer.clearActivePotions();
		par3EntityPlayer.heal(18);
		par3EntityPlayer.extinguish();
		par3EntityPlayer.getFoodStats().addStats(10, 8);

		return par1ItemStack;
	}
}