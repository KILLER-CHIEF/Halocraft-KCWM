package net.killerchief.halocraft;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class OldIDEventHandler {

	@SubscribeEvent
	public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			ItemStack[] inventory = ((EntityPlayer)event.entity).inventory.mainInventory;
			int i = 0;
			while (i < inventory.length)
			{
				if (inventory[i] != null)
				{
					if (inventory[i].getItem() instanceof HalocraftOldItem)
					{
						if (((HalocraftOldItem)inventory[i].getItem()).getNewItem() != null)
							inventory[i] = new ItemStack(((HalocraftOldItem)inventory[i].getItem()).getNewItem(), inventory[i].stackSize, inventory[i].getItemDamage());
						else
							inventory[i] = null;
						inventory[i] = new ItemStack(((HalocraftOldItem)inventory[i].getItem()).getNewItem(), inventory[i].stackSize, inventory[i].getItemDamage());
					}
					if (Block.getBlockFromItem(inventory[i].getItem()) instanceof HalocraftOldBlock)
					{
						if (((HalocraftOldBlock)Block.getBlockFromItem(inventory[i].getItem())).getNewItem() != null)
							inventory[i] = new ItemStack(((HalocraftOldBlock)Block.getBlockFromItem(inventory[i].getItem())).getNewItem(), inventory[i].stackSize, inventory[i].getItemDamage());
						else
							inventory[i] = null;
					}
				}
				i++;
			}
			ItemStack[] armorinventory = ((EntityPlayer)event.entity).inventory.armorInventory;
			int a = 0;
			while (a < armorinventory.length)
			{
				if (armorinventory[a] != null)
				{
					if (armorinventory[a].getItem() instanceof HalocraftOldItem)
					{
						if (((HalocraftOldItem)armorinventory[a].getItem()).getNewItem() != null)
							armorinventory[a] = new ItemStack(((HalocraftOldItem)armorinventory[a].getItem()).getNewItem(), armorinventory[a].stackSize, armorinventory[a].getItemDamage());
						else
							armorinventory[a] = null;
					}
					if (Block.getBlockFromItem(armorinventory[a].getItem()) instanceof HalocraftOldBlock)
					{
						if (((HalocraftOldBlock)Block.getBlockFromItem(armorinventory[a].getItem())).getNewItem() != null)
							armorinventory[a] = new ItemStack(((HalocraftOldBlock)Block.getBlockFromItem(armorinventory[a].getItem())).getNewItem(), armorinventory[a].stackSize, armorinventory[a].getItemDamage());
						else
							armorinventory[a] = null;
					}
				}
				a++;
			}
		}
	}

	@SubscribeEvent
	public void PlayerInteractEvent(PlayerInteractEvent event)
	{
		TileEntity tileentity = event.world.getTileEntity(event.x, event.y, event.z);

		if(tileentity instanceof TileEntityChest)
		{
			TileEntityChest tileentitychest = (TileEntityChest)tileentity;
			int i = 0;
			while (i < tileentitychest.getSizeInventory())
			{
				if (tileentitychest.getStackInSlot(i) != null)
				{
					if (tileentitychest.getStackInSlot(i).getItem() instanceof HalocraftOldItem)
					{
						if (((HalocraftOldItem)tileentitychest.getStackInSlot(i).getItem()).getNewItem() != null)
							tileentitychest.setInventorySlotContents(i, new ItemStack(((HalocraftOldItem)tileentitychest.getStackInSlot(i).getItem()).getNewItem(), tileentitychest.getStackInSlot(i).stackSize, tileentitychest.getStackInSlot(i).getItemDamage()));
						else
							tileentitychest.setInventorySlotContents(i, null);
					}
					if (Block.getBlockFromItem(tileentitychest.getStackInSlot(i).getItem()) instanceof HalocraftOldBlock)
					{
						if (((HalocraftOldBlock)Block.getBlockFromItem(tileentitychest.getStackInSlot(i).getItem())).getNewItem() != null)
							tileentitychest.setInventorySlotContents(i, new ItemStack(((HalocraftOldBlock)Block.getBlockFromItem(tileentitychest.getStackInSlot(i).getItem())).getNewItem(), tileentitychest.getStackInSlot(i).stackSize, tileentitychest.getStackInSlot(i).getItemDamage()));
						else
							tileentitychest.setInventorySlotContents(i, null);
					}
				}
				i++;
			}
		}
	}
}
