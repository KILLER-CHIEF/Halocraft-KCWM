package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerGunHolder extends Container
{
	private TileEntityGunHolder tileentity;

	public ContainerGunHolder(InventoryPlayer inventoryplayer, TileEntityGunHolder tileentitygunholder)
	{
		this.tileentity = tileentitygunholder;
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

	@Override
	public void addCraftingToCrafters(ICrafting par1ICrafting)
	{
		super.addCraftingToCrafters(par1ICrafting);
		//par1ICrafting.sendProgressBarUpdate(this, 0, this.tileentity.dualCookTime);
		//par1ICrafting.sendProgressBarUpdate(this, 1, this.tileentity.dualBurnTime);
		//par1ICrafting.sendProgressBarUpdate(this, 2, this.tileentity.currentItemBurnTime);
	}

	/**
	 * Looks for changes made in the container, sends them to every listener.
	 */
	@Override
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();
		/*
        for (int var1 = 0; var1 < this.crafters.size(); ++var1)
        {
            ICrafting var2 = (ICrafting)this.crafters.get(var1);

            if (this.dualCookTime != this.tileentity.dualCookTime)
            {
                var2.sendProgressBarUpdate(this, 0, this.tileentity.dualCookTime);
            }

            if (this.dualBurnTime != this.tileentity.dualBurnTime)
            {
                var2.sendProgressBarUpdate(this, 1, this.tileentity.dualBurnTime);
            }

            if (this.lastItemBurnTime != this.tileentity.currentItemBurnTime)
            {
                var2.sendProgressBarUpdate(this, 2, this.tileentity.currentItemBurnTime);
            }
        }

        this.dualCookTime = this.tileentity.dualCookTime;
        this.dualBurnTime = this.tileentity.dualBurnTime;
        this.lastItemBurnTime = this.tileentity.currentItemBurnTime;*/
	}

	@Override
	public void updateProgressBar(int i, int j)
	{
		/*if (i == 0)
        {
            tileentity.dualCookTime = j;
        }

        if (i == 1)
        {
            tileentity.dualBurnTime = j;
        }

        if (i == 2)
        {
            tileentity.currentItemBurnTime = j;
        }*/
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