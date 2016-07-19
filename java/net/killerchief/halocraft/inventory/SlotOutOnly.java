package net.killerchief.halocraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotOutOnly extends Slot
{
	public SlotOutOnly(IInventory iinventory, int slotIndex, int xDisplayPosition, int yDisplayPosition)
	{
		super(iinventory, slotIndex, xDisplayPosition, yDisplayPosition);
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
	 */
	@Override
	public boolean isItemValid(ItemStack itemstack)
	{
		return false;
	}

	/**
	 * Called when the player picks up an item from an inventory slot
	 */
	@Override
	public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
	{
		this.onCrafting(par2ItemStack);
		super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
	}
}