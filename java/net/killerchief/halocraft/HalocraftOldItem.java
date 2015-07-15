package net.killerchief.halocraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HalocraftOldItem extends Item {

	private Item item;

	public HalocraftOldItem(String name, Item i) {
		super();
		this.item = i;
		this.setUnlocalizedName(HalocraftOldIDs.MODID + "." + name);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(Halocraft.MODID+":NullX");
	}

	/**
	 * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
	 * update it's contents.
	 */
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int k, boolean b)
	{
		if (entity instanceof EntityPlayer)
		{
			ItemStack[] inventory = ((EntityPlayer)entity).inventory.mainInventory;
			int i = 0;
			while (i < inventory.length)
			{
				if (inventory[i] != null)
				{
					if (inventory[i].getItem() instanceof HalocraftOldItem)
					{
						inventory[i] = new ItemStack(((HalocraftOldItem)inventory[i].getItem()).getNewItem(), inventory[i].stackSize, inventory[i].getItemDamage());
					}
					if (Block.getBlockFromItem(inventory[i].getItem()) instanceof HalocraftOldBlock)
					{
						inventory[i] = new ItemStack(((HalocraftOldBlock)Block.getBlockFromItem(inventory[i].getItem())).getNewItem(), inventory[i].stackSize, inventory[i].getItemDamage());
					}
				}
				i++;
			}
			ItemStack[] armorinventory = ((EntityPlayer)entity).inventory.armorInventory;
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
		/*if (entity instanceof EntityPlayer)
		{
			ItemStack[] inventory = ((EntityPlayer)entity).inventory.mainInventory;
			int i = 0;
			while (i < inventory.length)
			{
				if (inventory[i] != null && inventory[i] == itemstack)
				{
					inventory[i] = new ItemStack(item, itemstack.stackSize, itemstack.getItemDamage());
					break;
				}
				i++;
			}
		}*/
	}

	public Item getNewItem() {
		return item;
	}
}
