package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerGunHolder extends Container
{
	private TileEntityGunHolder tileentity;

	public ContainerGunHolder(InventoryPlayer inventoryplayer, TileEntityGunHolder tileentitygunholder, boolean showItemStacks)
	{
		this.tileentity = tileentitygunholder;
		if (showItemStacks) {
			this.addSlotToContainer(new Slot(tileentitygunholder, 0, 26, 22));
			this.addSlotToContainer(new Slot(tileentitygunholder, 1, 8, 50));
			this.addSlotToContainer(new Slot(tileentitygunholder, 2, 26, 50));
			this.addSlotToContainer(new Slot(tileentitygunholder, 3, 44, 50));
			this.addSlotToContainer(new Slot(tileentitygunholder, 4, 62, 50));

			for (int i = 0; i < 3; i++)
			{
				for (int k = 0; k < 9; k++)
				{
					this.addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
				}
			}

			for (int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 142));
			}
		}
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift clicking.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (par2 < 5)
			{
				if (!this.mergeItemStack(itemstack1, 5, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, 5, false))
			{
				return null;
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack)null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return tileentity.isUseableByPlayer(entityplayer);
	}
}