package net.killerchief.halocraft.tileEntities;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.inventory.RechargeStationRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;


public class TileEntityRechargeStation extends TileEntity implements IInventory
{
	private ItemStack blastItemStacks[];
	public int dualBurnTime;
	public int currentItemBurnTime;
	public int dualCookTime;
	private String customName;

	public TileEntityRechargeStation()
	{
		blastItemStacks = new ItemStack[4];
		dualBurnTime = 0;
		currentItemBurnTime = 0;
		dualCookTime = 0;
	}

	/**
	 * Returns the number of slots in the inventory.
	 */
	public int getSizeInventory()
	{
		return blastItemStacks.length;
	}

	/**
	 * Returns the stack in slot i
	 */
	public ItemStack getStackInSlot(int i)
	{
		return blastItemStacks[i];
	}

	public void setInventorySlotConatainers(int i, ItemStack itemstack)
	{
		blastItemStacks[i] = itemstack;

		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", 10);
		blastItemStacks = new ItemStack[getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");

			if (byte0 >= 0 && byte0 < blastItemStacks.length)
			{
				blastItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		dualBurnTime = nbttagcompound.getShort("BurnTime");
		dualCookTime = nbttagcompound.getShort("CookTime");
		currentItemBurnTime = getItemBurnTime(blastItemStacks[1]);
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	public void writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setShort("BurnTime", (short)dualBurnTime);
		nbttagcompound.setShort("CookTime", (short)dualCookTime);
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < blastItemStacks.length; i++)
		{
			if (blastItemStacks[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				blastItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		nbttagcompound.setTag("Items", nbttaglist);
	}

	/**
	 * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
	 * this more of a set than a get?*
	 */
	public int getInventoryStackLimit()
	{
		return 64;
	}

	public int getCookProgressScaled(int i)
	{
		return (dualCookTime * i) / 200;
	}

	public int getBurnTimeRemainingScaled(int i)
	{
		if (currentItemBurnTime == 0)
		{
			currentItemBurnTime = 200;
		}

		return (dualBurnTime * i) / currentItemBurnTime;
	}

	public boolean isBurning()
	{
		return dualBurnTime > 0;
	}

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	public void updateEntity()
	{
		boolean flag = dualBurnTime > 0;
		boolean flag1 = false;

		if (dualBurnTime > 0)
		{
			dualBurnTime--;
		}

		if (!worldObj.isRemote)
		{
			if (dualBurnTime == 0 && canSmelt())
			{
				currentItemBurnTime = dualBurnTime = getItemBurnTime(blastItemStacks[2]);

				if (dualBurnTime > 0)
				{
					flag1 = true;

					if (blastItemStacks[2] != null)
					{
						if (blastItemStacks[2].stackSize == 0)
						{
							blastItemStacks[2] = new ItemStack(blastItemStacks[2].getItem().setFull3D());
						}
						else
						{
							blastItemStacks[2].stackSize--;
						}

						if (blastItemStacks[2].stackSize == 0)
						{
							blastItemStacks[2] = null;
						}
					}
				}
			}

			if (isBurning() && canSmelt())
			{
				dualCookTime++;

				if (dualCookTime == 200)
				{
					dualCookTime = 0;
					smeltItem();
					flag1 = true;
				}
			}
			else
			{
				dualCookTime = 0;
			}

			if (flag != (dualBurnTime > 0))
			{
				flag1 = true;
			}
		}

		if (flag1)
		{
			this.markDirty();
		}
	}

	private boolean canSmelt()
	{
		if (blastItemStacks[0] == null || blastItemStacks[1] == null)
		{
			return false;
		}

		ItemStack itemstack = RechargeStationRecipes.getSmeltingResult(blastItemStacks[0].getItem(), blastItemStacks[1].getItem());

		if (itemstack == null)
		{
			return false;
		}

		if (blastItemStacks[3] == null)
		{
			return true;
		}

		if (!blastItemStacks[3].isItemEqual(itemstack))
		{
			return false;
		}

		if (blastItemStacks[3].stackSize < getInventoryStackLimit() && blastItemStacks[3].stackSize < blastItemStacks[3].getMaxStackSize())
		{
			return true;
		}
		else
		{
			return blastItemStacks[3].stackSize < itemstack.getMaxStackSize();
		}
	}

	public void smeltItem()
	{
		if (!canSmelt())
		{
			return;
		}

		ItemStack itemstack = RechargeStationRecipes.getSmeltingResult(blastItemStacks[0].getItem(), blastItemStacks[1].getItem());

		if (blastItemStacks[3] == null)
		{
			blastItemStacks[3] = itemstack.copy();
		}
		else if (blastItemStacks[3] == itemstack)
		{
			blastItemStacks[3].stackSize++;
		}

		for (int i = 0; i < 2; i++)
		{
			if (blastItemStacks[i].stackSize <= 0)
			{
				blastItemStacks[i] = new ItemStack(blastItemStacks[i].getItem().setFull3D());
			}
			else
			{
				blastItemStacks[i].stackSize--;
			}

			if (blastItemStacks[i].stackSize <= 0)
			{
				blastItemStacks[i] = null;
			}
		}
	}

	private int getItemBurnTime(ItemStack itemstack)
	{
		if (itemstack == null)
		{
			return 0;
		}
		if (itemstack.getItem() == HalocraftItems.PlasmaPowerCore)
		{
			return 3500;
		}
		else
		{
			return 0;
		}
	}

	/**
	 * Do not make give this method the name canInteractWith because it clashes with Container
	 */
	 public boolean isUseableByPlayer(EntityPlayer entityplayer)
	{
		if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this)
		{
			return false;
		}
		else
		{
			return entityplayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
		}
	}

	/**
	 * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
	 * stack.
	 */
	 public ItemStack decrStackSize(int i, int j)
	 {
		 if (blastItemStacks[i] != null)
		 {
			 if (blastItemStacks[i].stackSize <= j)
			 {
				 ItemStack itemstack = blastItemStacks[i];
				 blastItemStacks[i] = null;
				 return itemstack;
			 }

			 ItemStack itemstack1 = blastItemStacks[i].splitStack(j);

			 if (blastItemStacks[i].stackSize == 0)
			 {
				 blastItemStacks[i] = null;
			 }

			 return itemstack1;
		 }
		 else
		 {
			 return null;
		 }
	 }

	 /**
	  * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
	  */
	 public void setInventorySlotContents(int i, ItemStack itemstack)
	 {
		 blastItemStacks[i] = itemstack;

		 if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		 {
			 itemstack.stackSize = getInventoryStackLimit();
		 }
	 }

	 /**
	  * Returns the name of the inventory.
	  */
	 @Override
	 public String getInventoryName()
	 {
		 return "container.goldfurnace";
	 }

	 @Override
	 public void openInventory()
	 {
	 }

	 @Override
	 public void closeInventory()
	 {
	 }

	 /**
	  * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
	  * like when you close a workbench GUI.
	  */
	 public ItemStack getStackInSlotOnClosing(int i)
	 {
		 if (blastItemStacks[i] != null)
		 {
			 ItemStack itemstack = blastItemStacks[i];
			 blastItemStacks[i] = null;
			 return itemstack;
		 }
		 else
		 {
			 return null;
		 }
	 }

	 @Override
	 public boolean hasCustomInventoryName()
	 {
		 return (this.customName != null) && (this.customName.length() > 0);
	 }

	 public void setCustomName(String name) 
	 {
		 this.customName = name;
	 }

	 @Override
	 public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		 return false;
	 }
}
