package net.killerchief.halocraft.tileEntities;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
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

public class TileEntityGunHolder extends TileEntity implements IInventory {

	public ItemStack ContainerItemStacks[];
	public ItemStack ContainerRespawnItemStacks[];

	public TileEntityGunHolder()
	{
		this.ContainerItemStacks = new ItemStack[5];
		this.ContainerRespawnItemStacks = new ItemStack[5];
	}

	public boolean hasSomethingChanged = true;

	private int MountSwapSide = 0;
	private int MountRotate = 0;
	private int RotationXGun = 0;
	private int RotationYGun = 0;
	private int RotationZGun = 0;
	private int TranslationXGun = 0;
	private int TranslationYGun = 0;
	private int TranslationZGun = 0;
	private int ScaleXGun = 0;
	private int ScaleYGun = 0;
	private int ScaleZGun = 0;
	private int RespawnTime = 0;
	private long RespawnAtTime = 0L;

	public Model3DWeaponBase gunModel = null;

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);

		this.MountSwapSide = par1NBTTagCompound.getInteger("MountSwapSide");
		this.MountRotate = par1NBTTagCompound.getInteger("MountRotate");
		this.RotationXGun = par1NBTTagCompound.getInteger("RotationXGun");
		this.RotationYGun = par1NBTTagCompound.getInteger("RotationYGun");
		this.RotationZGun = par1NBTTagCompound.getInteger("RotationZGun");
		this.TranslationXGun = par1NBTTagCompound.getInteger("TranslationXGun");
		this.TranslationYGun = par1NBTTagCompound.getInteger("TranslationYGun");
		this.TranslationZGun = par1NBTTagCompound.getInteger("TranslationZGun");
		this.ScaleXGun = par1NBTTagCompound.getInteger("ScaleXGun");
		this.ScaleYGun = par1NBTTagCompound.getInteger("ScaleYGun");
		this.ScaleZGun = par1NBTTagCompound.getInteger("ScaleZGun");
		this.RespawnTime = par1NBTTagCompound.getInteger("RespawnTime");

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

		NBTTagList nbttaglistrespawn = par1NBTTagCompound.getTagList("RespawnItems", 10);
		this.ContainerRespawnItemStacks = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglistrespawn.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglistrespawn.getCompoundTagAt(i);
			byte byte0 = nbttagcompound1.getByte("SlotRespawn");

			if (byte0 >= 0 && byte0 < this.ContainerRespawnItemStacks.length)
			{
				this.ContainerRespawnItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
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

		par1NBTTagCompound.setInteger("MountSwapSide", this.MountSwapSide);
		par1NBTTagCompound.setInteger("MountRotate", this.MountRotate);
		par1NBTTagCompound.setInteger("RotationXGun", this.RotationXGun);
		par1NBTTagCompound.setInteger("RotationYGun", this.RotationYGun);
		par1NBTTagCompound.setInteger("RotationZGun", this.RotationZGun);
		par1NBTTagCompound.setInteger("TranslationXGun", this.TranslationXGun);
		par1NBTTagCompound.setInteger("TranslationYGun", this.TranslationYGun);
		par1NBTTagCompound.setInteger("TranslationZGun", this.TranslationZGun);
		par1NBTTagCompound.setInteger("ScaleXGun", this.ScaleXGun);
		par1NBTTagCompound.setInteger("ScaleYGun", this.ScaleYGun);
		par1NBTTagCompound.setInteger("ScaleZGun", this.ScaleZGun);
		par1NBTTagCompound.setInteger("RespawnTime", this.RespawnTime);

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

		NBTTagList nbttaglistrespawn = new NBTTagList();
		for (int i = 0; i < this.ContainerRespawnItemStacks.length; i++)
		{
			if (this.ContainerRespawnItemStacks[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("SlotRespawn", (byte)i);
				this.ContainerRespawnItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglistrespawn.appendTag(nbttagcompound1);
			}
		}
		par1NBTTagCompound.setTag("RespawnItems", nbttaglistrespawn);
	}

	private boolean stacksAreDifferent() {
		for (int i = 0; i < ContainerItemStacks.length; i++) {
			ItemStack itemStack1 = ContainerItemStacks[i];
			ItemStack itemStack2 = ContainerRespawnItemStacks[i];
			if ((itemStack1 == null && itemStack2 != null) || (itemStack1 != null && itemStack2 == null) || 
					(itemStack1 != null && itemStack2 != null && (itemStack1.getItem() != itemStack2.getItem() || itemStack1.stackSize != itemStack2.stackSize || itemStack1.getItemDamage() != itemStack2.getItemDamage()))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		if (!this.worldObj.isRemote)
		{
			if (this.RespawnTime <= 0) {
				this.RespawnAtTime = 0L;
			}
			else if (this.RespawnAtTime <= 0L) {
				if (stacksAreDifferent()) {
					this.RespawnAtTime = System.currentTimeMillis() + (this.RespawnTime*1000L);
				}
			}
			else if (this.RespawnAtTime <= System.currentTimeMillis()) {
				this.RespawnAtTime = 0L;
				for (int i = 0; i < this.ContainerItemStacks.length; i++) {
					if ( (this.ContainerItemStacks[i] != null && this.ContainerRespawnItemStacks[i] == null) || ( this.ContainerItemStacks[i] != null && this.ContainerRespawnItemStacks[i] != null &&
							!this.ContainerItemStacks[i].getItem().equals(this.ContainerRespawnItemStacks[i].getItem()) ) ) {
						EntityItem item = new EntityItem(this.worldObj, this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5, this.ContainerItemStacks[i]);
						item.delayBeforeCanPickup = 0;
						this.worldObj.spawnEntityInWorld(item);
					}
				}
				this.ContainerItemStacks = new ItemStack[this.ContainerItemStacks.length];
				for (int i = 0; i < this.ContainerItemStacks.length; i++) {
					if (this.ContainerRespawnItemStacks[i] != null)
						this.ContainerItemStacks[i] = this.ContainerRespawnItemStacks[i].copy();
				}
				this.hasSomethingChanged = true;
			}

			if (this.hasSomethingChanged)
			{
				this.hasSomethingChanged = false;
				this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
				if (this.MountSwapSide == 0 && this.MountRotate == 0 && this.RotationXGun == 0 && this.TranslationXGun == 0 && this.RotationYGun == 0 && this.TranslationYGun == 0 && this.RotationZGun == 0 && this.TranslationZGun == 0)
				{
					this.MountSwapSide = this.blockMetadata;
					if (this.blockMetadata == 2)
					{
						this.RotationYGun = 18;
						this.TranslationXGun = 5;
					}
					else if (this.blockMetadata == 3)
					{
						this.RotationYGun = -18;
						this.TranslationXGun = 7;
					}
					else if (this.blockMetadata == 4)
					{
						this.RotationYGun = 36;
						this.TranslationXGun = 5;
					}
					else if (this.blockMetadata == 5)
					{
						this.RotationYGun = 0;
						this.TranslationXGun = 7;
					}
				}
				this.markDirty();
			}
		}
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

	public void MountSwapSide(int side)
	{
		this.MountSwapSide = side;
	}
	public void MountSwapSide()
	{
		if (++this.MountSwapSide > 5)
		{
			this.MountSwapSide = 0;
		}
		this.hasSomethingChanged = true;
	}
	public int getMountSide()
	{
		return this.MountSwapSide;
	}
	public void MountRotate()
	{
		if (++this.MountRotate > 4)
		{
			this.MountRotate = 0;
		}
		this.hasSomethingChanged = true;
	}
	public int getMountRotate()
	{
		return this.MountRotate;
	}

	public void incrementRotationXGun(int r)
	{
		this.RotationXGun += r;
		this.hasSomethingChanged = true;
	}
	public int getRotationXGun()
	{
		return this.RotationXGun;
	}
	public void incrementRotationYGun(int r)
	{
		this.RotationYGun += r;
		this.hasSomethingChanged = true;
	}
	public int getRotationYGun()
	{
		return this.RotationYGun;
	}
	public void incrementRotationZGun(int r)
	{
		this.RotationZGun += r;
		this.hasSomethingChanged = true;
	}
	public int getRotationZGun()
	{
		return this.RotationZGun;
	}

	public void incrementTranslationXGun(int r)
	{
		this.TranslationXGun += r;
		this.hasSomethingChanged = true;
	}
	public int getTranslationXGun()
	{
		return this.TranslationXGun;
	}
	public void incrementTranslationYGun(int r)
	{
		this.TranslationYGun += r;
		this.hasSomethingChanged = true;
	}
	public int getTranslationYGun()
	{
		return this.TranslationYGun;
	}
	public void incrementTranslationZGun(int r)
	{
		this.TranslationZGun += r;
		this.hasSomethingChanged = true;
	}
	public int getTranslationZGun()
	{
		return this.TranslationZGun;
	}
	
	public void incrementScaleXGun(int r)
	{
		this.ScaleXGun += r;
		this.hasSomethingChanged = true;
	}
	public int getScaleXGun()
	{
		return this.ScaleXGun;
	}
	public void incrementScaleYGun(int r)
	{
		this.ScaleYGun += r;
		this.hasSomethingChanged = true;
	}
	public int getScaleYGun()
	{
		return this.ScaleYGun;
	}
	public void incrementScaleZGun(int r)
	{
		this.ScaleZGun += r;
		this.hasSomethingChanged = true;
	}
	public int getScaleZGun()
	{
		return this.ScaleZGun;
	}

	public int getRespawnTime()
	{
		return this.RespawnTime;
	}
	public void incrementRespawnTime(int r)
	{
		this.RespawnTime += r;
		if (this.RespawnTime < 0) {
			this.RespawnTime = 0;
		} else {
			if (this.RespawnAtTime > 0L) {
				this.RespawnAtTime += r*1000L;
			}
		}
		this.hasSomethingChanged = true;
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
		return "container.halocraft.gunholder";
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
