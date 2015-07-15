package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerRechargeStation extends Container
{
    private TileEntityRechargeStation blast;
    private int dualCookTime;
    private int dualBurnTime;
    private int lastItemBurnTime;

    public ContainerRechargeStation(InventoryPlayer inventoryplayer, TileEntityRechargeStation RechargeStationFurnace)
    {
        dualCookTime = 0;
        dualBurnTime = 0;
        lastItemBurnTime = 0;
        blast = RechargeStationFurnace;
        this.addSlotToContainer(new Slot(RechargeStationFurnace, 0, 38, 17));
        this.addSlotToContainer(new Slot(RechargeStationFurnace, 1, 74, 17));
        this.addSlotToContainer(new Slot(RechargeStationFurnace, 2, 56, 53));
        this.addSlotToContainer(new SlotRechargeStation(inventoryplayer.player, RechargeStationFurnace, 3, 116, 35));

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

    public void addCraftingToCrafters(ICrafting par1ICrafting)
    {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.blast.dualCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.blast.dualBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.blast.currentItemBurnTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int var1 = 0; var1 < this.crafters.size(); ++var1)
        {
            ICrafting var2 = (ICrafting)this.crafters.get(var1);

            if (this.dualCookTime != this.blast.dualCookTime)
            {
                var2.sendProgressBarUpdate(this, 0, this.blast.dualCookTime);
            }

            if (this.dualBurnTime != this.blast.dualBurnTime)
            {
                var2.sendProgressBarUpdate(this, 1, this.blast.dualBurnTime);
            }

            if (this.lastItemBurnTime != this.blast.currentItemBurnTime)
            {
                var2.sendProgressBarUpdate(this, 2, this.blast.currentItemBurnTime);
            }
        }

        this.dualCookTime = this.blast.dualCookTime;
        this.dualBurnTime = this.blast.dualBurnTime;
        this.lastItemBurnTime = this.blast.currentItemBurnTime;
    }
    

    public void updateProgressBar(int i, int j)
    {
        if (i == 0)
        {
            blast.dualCookTime = j;
        }

        if (i == 1)
        {
            blast.dualBurnTime = j;
        }

        if (i == 2)
        {
            blast.currentItemBurnTime = j;
        }
    }

    /**
     * Called to transfer a stack from one inventory to the other eg. when shift clicking.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }
            }
            else if (par2 >= 3 && par2 < 30)
            {
                if (!mergeItemStack(itemstack1, 30, 39, false))
                {
                    return null;
                }
            }
            else if (par2 >= 30 && par2 < 39)
            {
                if (!mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize != itemstack.stackSize)
            {
                slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
            }
            else
            {
                return null;
            }
        }

        return itemstack;
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return blast.isUseableByPlayer(entityplayer);
    }
}