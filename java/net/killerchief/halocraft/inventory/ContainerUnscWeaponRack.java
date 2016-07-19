package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerUnscWeaponRack extends Container
{
	private TileEntityUnscWeaponRack tileEntity;

	public ContainerUnscWeaponRack(InventoryPlayer inventoryplayer, TileEntityUnscWeaponRack tileentity, boolean frontSide)
	{
		this.tileEntity = tileentity;

		int iSlot = 0;
		if (!frontSide)
			iSlot = 8;
		this.addSlotToContainer(new Slot(tileentity, 0+iSlot, 64, 31));
		this.addSlotToContainer(new Slot(tileentity, 1+iSlot, 96, 31));

		this.addSlotToContainer(new Slot(tileentity, 2+iSlot, 36, 17));
		this.addSlotToContainer(new Slot(tileentity, 3+iSlot, 36, 35));
		this.addSlotToContainer(new Slot(tileentity, 4+iSlot, 36, 53));

		this.addSlotToContainer(new Slot(tileentity, 5+iSlot, 62, 58));
		this.addSlotToContainer(new Slot(tileentity, 6+iSlot, 80, 58));
		this.addSlotToContainer(new Slot(tileentity, 7+iSlot, 98, 58));


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

			if (par2 < 16)
			{
				if (!this.mergeItemStack(itemstack1, 16, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, 16, false))
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
		return tileEntity.isUseableByPlayer(entityplayer);
	}

}