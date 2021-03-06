package net.killerchief.halocraft.tileEntities;

import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRechargeStation extends TileEntity implements IInventory {

	public ItemStack ContainerItemStacks[];

	public TileEntityRechargeStation()
	{
		this.ContainerItemStacks = new ItemStack[5];
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);

		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", 10);
		this.ContainerItemStacks = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");

			if (byte0 >= 0 && byte0 < this.ContainerItemStacks.length)
			{
				this.ContainerItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);

		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.ContainerItemStacks.length; i++)
		{
			if (this.ContainerItemStacks[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				this.ContainerItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		par1NBTTagCompound.setTag("Items", nbttaglist);
	}

	private long tickNext = System.currentTimeMillis();

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		if (!this.worldObj.isRemote)
		{
			if (this.tickNext < System.currentTimeMillis())
			{
				this.tickNext = System.currentTimeMillis() + 2000L;
				for (int i = 1; i < ContainerItemStacks.length; i++) {
					if (this.ContainerItemStacks[0] != null && this.ContainerItemStacks[0].getItem() == HalocraftItems.PlasmaPowerCore) {
						if (this.ContainerItemStacks[i] != null)
						{
							if (this.ContainerItemStacks[i].getItem() == HalocraftItems.SwordHilt) {
								if (this.ContainerItemStacks[i].isItemDamaged())
								{
									this.ContainerItemStacks[i].setItemDamage(this.ContainerItemStacks[i].getItemDamage()-1);
									this.ContainerItemStacks[0].setItemDamage(this.ContainerItemStacks[0].getItemDamage()+1);
									//break;
								}
							}
							else if (this.ContainerItemStacks[i].getItem() instanceof ItemWeapon) {

								ItemWeapon weapon = (ItemWeapon)this.ContainerItemStacks[i].getItem();
								if (weapon.Properties.AmmoType == null)
								{
									//TODO: Recharge update do this
									if (weapon == HalocraftItemsWeapons.Carbine || weapon == HalocraftItemsWeapons.BeamRifle || weapon == HalocraftItemsWeapons.PlasmaRifle || weapon == HalocraftItemsWeapons.PlasmaPistol || weapon == HalocraftItemsWeapons.Needler)
										if (this.ContainerItemStacks[i].isItemDamaged())
										{
											this.ContainerItemStacks[i].setItemDamage(this.ContainerItemStacks[i].getItemDamage()-1);
											this.ContainerItemStacks[0].setItemDamage(this.ContainerItemStacks[0].getItemDamage()+1);
											//break;
										}
								}
							}
						}
					}
				}
			}
		}
	}

	public void dropContents()
	{
		if (!this.worldObj.isRemote)
		{
			for (ItemStack itemstack : this.ContainerItemStacks)
			{
				if (itemstack != null)
				{
					EntityItem item = new EntityItem(this.worldObj, this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5, itemstack);
					item.delayBeforeCanPickup = 0;
					this.worldObj.spawnEntityInWorld(item);
				}
			}
		}
		this.ContainerItemStacks = new ItemStack[this.ContainerItemStacks.length];
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tagCompound = new NBTTagCompound();
		this.writeToNBT(tagCompound);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, tagCompound);
	}

	@Override
	public void onDataPacket(NetworkManager networkManager, S35PacketUpdateTileEntity packet) {
		this.readFromNBT(packet.func_148857_g());
		// example: update open GUI
		//GuiScreen gui = FMLClientHandler.instance().getClient().currentScreen;
		//if (gui != null && gui instanceof YourTileEntityGuiScreen) {
		//   ((YourTileEntityGuiScreen) gui).updateFromTileEntityData();
		//}
	}

	@Override
	public int getSizeInventory()
	{
		return this.ContainerItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i)
	{
		return this.ContainerItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j)
	{
		if (this.ContainerItemStacks[i] != null)
		{
			if (this.ContainerItemStacks[i].stackSize <= j)
			{
				ItemStack itemstack = this.ContainerItemStacks[i];
				this.ContainerItemStacks[i] = null;
				return itemstack;
			}

			ItemStack itemstack1 = this.ContainerItemStacks[i].splitStack(j);

			if (this.ContainerItemStacks[i].stackSize == 0)
			{
				this.ContainerItemStacks[i] = null;
			}

			return itemstack1;
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i)
	{
		if (this.ContainerItemStacks[i] != null)
		{
			ItemStack itemstack = this.ContainerItemStacks[i];
			this.ContainerItemStacks[i] = null;
			return itemstack;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack)
	{
		this.ContainerItemStacks[i] = itemstack;

		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName()
	{
		return "container.halocraft.rechargestation";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
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

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		return true;
	}
}
