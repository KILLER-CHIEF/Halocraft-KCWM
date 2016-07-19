package net.killerchief.halocraft.tileEntities;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.blocks.BlockPermanentGravityLiftBase;
import net.killerchief.halocraft.client.gui.GuiGravityLift;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.FMLClientHandler;

public class TileEntityGravityLift extends TileEntity implements IInventory
{
	public TileEntityGravityLift(){}

	public static final int maxHeight = 250;
	private int tick2fast = 0;
	public boolean hasSomethingChanged = true;
	private boolean OverrideRedstone = false;
	private boolean OverrideOn = false;
	private String LockUsername = "";
	private boolean AllowAllToEdit = false;
	private int GravitationalHeight = 5;

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		if (--this.tick2fast <= 0)
		{
			this.tick2fast = 20;
			if (!this.worldObj.isRemote)
			{
				if (!this.OverrideRedstone && (this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord)) || (this.OverrideRedstone && this.OverrideOn))
				{
					if (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord) == HalocraftBlocks.PermanentGravityLiftBaseActive)
					{
						for (int h = 1; h <= this.maxHeight; h++) {
							if (((TileEntityGravityLift)this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord)).getGravitationalHeight() >= h)
							{
								if (this.worldObj.getBlock(this.xCoord, this.yCoord + h, this.zCoord) == HalocraftBlocks.PermanentGravityLiftExt)
								{}
								else if (this.worldObj.getBlock(this.xCoord, this.yCoord + h, this.zCoord) == Blocks.air) {
									this.worldObj.setBlock(this.xCoord, this.yCoord + h, this.zCoord, HalocraftBlocks.PermanentGravityLiftExt);
									this.hasSomethingChanged = true;
								} else
									break;
							}
							else if (this.worldObj.getBlock(this.xCoord, this.yCoord + h, this.zCoord) == HalocraftBlocks.PermanentGravityLiftExt)
							{
								this.worldObj.setBlock(this.xCoord, this.yCoord + h, this.zCoord, Blocks.air);
								this.hasSomethingChanged = true;
							}
							else
							{
								break;
							}
						}
					}
					else
					{
						((BlockPermanentGravityLiftBase)this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord)).swapBlockType(true, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
					}
				}
				else
				{
					if (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord) == HalocraftBlocks.PermanentGravityLiftBaseActive)
					{
						((BlockPermanentGravityLiftBase)this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord)).swapBlockType(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
					}
					else
					{
						for (int h = 1; h <= this.maxHeight; h++) {
							if (this.worldObj.getBlock(this.xCoord, this.yCoord + h, this.zCoord) == HalocraftBlocks.PermanentGravityLiftExt) {
								this.worldObj.setBlock(this.xCoord, this.yCoord + h, this.zCoord, Blocks.air);
								this.hasSomethingChanged = true;
							} else
								break;
						}
					}
				}
				if (this.hasSomethingChanged)
				{
					this.hasSomethingChanged = false;
					this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
					this.markDirty();
				}
			}
		}

		if (!this.OverrideRedstone && (this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord)) || (this.OverrideRedstone && this.OverrideOn))
		{
			if (this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord) == HalocraftBlocks.PermanentGravityLiftExt)
			{
				if (this.worldObj.isRemote)
				{
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.1F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.2F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.3F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.4F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.5F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.6F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.7F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.8F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.9F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 1.0F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.1F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.2F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.3F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.4F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.5F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.6F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.7F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.8F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.9F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
					Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 1.0F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
				}
			}
		}
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		this.OverrideRedstone = par1NBTTagCompound.getBoolean("OverrideRedstone");
		this.OverrideOn = par1NBTTagCompound.getBoolean("OverrideOn");
		this.LockUsername = par1NBTTagCompound.getString("LockUsername");
		this.AllowAllToEdit = par1NBTTagCompound.getBoolean("AllowAllToEdit");
		this.GravitationalHeight = par1NBTTagCompound.getInteger("GravitationalHeight");
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setBoolean("OverrideRedstone", this.OverrideRedstone);
		par1NBTTagCompound.setBoolean("OverrideOn", this.OverrideOn);
		par1NBTTagCompound.setString("LockUsername", this.LockUsername);
		par1NBTTagCompound.setBoolean("AllowAllToEdit", this.AllowAllToEdit);
		par1NBTTagCompound.setInteger("GravitationalHeight", this.GravitationalHeight);
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

		GuiScreen gui = FMLClientHandler.instance().getClient().currentScreen;
		if (gui != null && gui instanceof GuiGravityLift) {
			((GuiGravityLift) gui).updateScreen();
		}
	}

	public void setOverrideRedstone(boolean set)
	{
		this.OverrideRedstone = set;
		this.hasSomethingChanged = true;
	}
	public boolean getOverrideRedstone()
	{
		return this.OverrideRedstone;
	}

	public void setOverrideOn(boolean set)
	{
		this.OverrideOn = set;
		this.hasSomethingChanged = true;
	}
	public boolean getOverrideOn()
	{
		return this.OverrideOn;
	}

	public void setUsername(String username)
	{
		this.LockUsername = username;
		this.hasSomethingChanged = true;
	}
	public String getUsername()
	{
		return this.LockUsername;
	}

	public void setAllowAllToEdit(boolean set)
	{
		this.AllowAllToEdit = set;
		this.hasSomethingChanged = true;
	}
	public boolean getAllowAllToEdit()
	{
		return this.AllowAllToEdit;
	}

	public void offsetGravitationalHeight(int offset)
	{
		for (int i = 0; i < Math.abs(offset); i++)
		{
			if (this.GravitationalHeight + (int)Math.signum(offset) <= this.maxHeight && this.GravitationalHeight + (int)Math.signum(offset) >= 0)
			{
				this.GravitationalHeight += (int)Math.signum(offset);
			}
			else
			{
				break;
			}
		}
		this.hasSomethingChanged = true;
	}
	public int getGravitationalHeight()
	{
		return this.GravitationalHeight;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {
	}

	@Override
	public void closeInventory() {
	}

	@Override
	public int getSizeInventory() {
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return null;
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
	}

	@Override
	public String getInventoryName() {
		return "container.halocraft.gravitylift";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 0;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return false;
	}
}
