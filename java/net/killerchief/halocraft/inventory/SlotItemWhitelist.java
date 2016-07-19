package net.killerchief.halocraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotItemWhitelist extends Slot
{
	private Item[] itemWhitelist;
	private int slotStackLimit = 1;

	public SlotItemWhitelist(IInventory iinventory, int slotIndex, int xDisplayPosition, int yDisplayPosition, Item[] items)
	{
		super(iinventory, slotIndex, xDisplayPosition, yDisplayPosition);
		this.itemWhitelist = items;
		this.slotStackLimit = this.inventory.getInventoryStackLimit();
	}

	public SlotItemWhitelist(IInventory iinventory, int slotIndex, int xDisplayPosition, int yDisplayPosition, Item[] items, int stackLimit)
	{
		this(iinventory, slotIndex, xDisplayPosition, yDisplayPosition, items);
		this.slotStackLimit = stackLimit;
	}

	/**
	 * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
	 * of armor slots)
	 */
	@Override
	public int getSlotStackLimit()
	{
		return this.slotStackLimit;
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
	 */
	@Override
	public boolean isItemValid(ItemStack itemstack)
	{
		for (Item item : this.itemWhitelist) {
			if (itemstack.getItem() == item)
				return true;
		}
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