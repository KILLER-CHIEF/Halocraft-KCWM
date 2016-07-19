package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ContainerCovSupplyCase extends Container
{
	private TileEntityCovSupplyCase tileEntity;

	/**
	 * the slot is assumed empty
	 */
	@Override
	protected Slot addSlotToContainer(Slot p_75146_1_)
	{
		p_75146_1_.slotNumber = this.inventorySlots.size();
		this.inventorySlots.add(p_75146_1_);
		this.inventoryItemStacks.add((Object)null);
		return p_75146_1_;
	}

	public ContainerCovSupplyCase(InventoryPlayer inventoryplayer, TileEntityCovSupplyCase tileentity, boolean outer, boolean frontSide)
	{
		this.tileEntity = tileentity;
		if (outer)
		{
			Slot s0 = this.addSlotToContainer(new SlotItemWhitelist(tileentity, frontSide ? 0 : 2, 124, 22, new Item[]{HalocraftItems.CovArmorPlate}, 1));
			//s0.slotNumber = frontSide ? 0 : 2;
			Slot s1 = this.addSlotToContainer(new SlotItemWhitelist(tileentity, frontSide ? 1 : 3, 124, 50, new Item[]{HalocraftItems.PlasmaPowerCore}, 1));
			//s1.slotNumber = frontSide ? 1 : 3;
			//System.out.println("slot0 is "+s0.slotNumber);
			//System.out.println("slot1 is "+s1.slotNumber);
		}
		else
		{
			int i = 0;
			if (!frontSide)
				i = 8;
			this.addSlotToContainer(new Slot(tileentity, 4+i, 44, 22));
			this.addSlotToContainer(new Slot(tileentity, 5+i, 116, 22));

			this.addSlotToContainer(new Slot(tileentity, 6+i, 26, 50));
			this.addSlotToContainer(new Slot(tileentity, 7+i, 44, 50));
			this.addSlotToContainer(new Slot(tileentity, 8+i, 62, 50));

			this.addSlotToContainer(new Slot(tileentity, 9+i, 98, 50));
			this.addSlotToContainer(new Slot(tileentity, 10+i, 116, 50));
			this.addSlotToContainer(new Slot(tileentity, 11+i, 134, 50));
		}

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

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return tileEntity.isUseableByPlayer(entityplayer);
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift clicking.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2SlotID)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(par2SlotID);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			int targetSlotCount = this.inventorySlots.size()-36;

			if (par2SlotID < targetSlotCount)
			{
				if (!this.mergeItemStack(itemstack1, targetSlotCount, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, targetSlotCount, false))
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

	/**
	 * merges provided ItemStack with the first avaliable one in the container/player inventory
	 */
	@Override
	protected boolean mergeItemStack(ItemStack itemstack, int beginIndex, int endIndex, boolean searchFromEnd)
	{
		boolean flag1 = false;
		int k = beginIndex;

		if (searchFromEnd)
		{
			k = endIndex - 1;
		}

		Slot slot;
		ItemStack itemstack1;

		if (itemstack.isStackable())
		{
			while (itemstack.stackSize > 0 && (!searchFromEnd && k < endIndex || searchFromEnd && k >= beginIndex))
			{
				slot = (Slot)this.inventorySlots.get(k);
				itemstack1 = slot.getStack();
				//--...Added this slot check...
				if (slot.isItemValid(itemstack) && itemstack1 != null && itemstack1.getItem() == itemstack.getItem() && (!itemstack.getHasSubtypes() || itemstack.getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(itemstack, itemstack1))
				{
					int l = itemstack1.stackSize + itemstack.stackSize;

					//added slot size check
					if (l <= itemstack.getMaxStackSize() && l <= slot.getSlotStackLimit())
					{
						itemstack.stackSize = 0;
						itemstack1.stackSize = l;
						slot.onSlotChanged();
						flag1 = true;
					}
					//added slot size check
					else if (itemstack1.stackSize < itemstack.getMaxStackSize() && itemstack1.stackSize < slot.getSlotStackLimit())
					{
						int maxSize = slot.getSlotStackLimit() < itemstack.getMaxStackSize() ? slot.getSlotStackLimit() : itemstack.getMaxStackSize();
						itemstack.stackSize -= maxSize - itemstack1.stackSize;
						itemstack1.stackSize = maxSize;
						slot.onSlotChanged();
						flag1 = true;
					}
				}

				if (searchFromEnd)
				{
					--k;
				}
				else
				{
					++k;
				}
			}
		}

		if (itemstack.stackSize > 0)
		{
			if (searchFromEnd)
			{
				k = endIndex - 1;
			}
			else
			{
				k = beginIndex;
			}

			while (!searchFromEnd && k < endIndex || searchFromEnd && k >= beginIndex)
			{
				slot = (Slot)this.inventorySlots.get(k);
				itemstack1 = slot.getStack();
				//--...Added this slot check...
				if (slot.isItemValid(itemstack) && itemstack1 == null)
				{
					// Added slot size check
					ItemStack mod = itemstack.copy();
					if (mod.stackSize > slot.getSlotStackLimit())
						mod.stackSize = slot.getSlotStackLimit();
					slot.putStack(mod);
					slot.onSlotChanged();
					itemstack.stackSize -= mod.stackSize;
					flag1 = true;
					break;
				}

				if (searchFromEnd)
				{
					--k;
				}
				else
				{
					++k;
				}
			}
		}

		return flag1;
	}

}