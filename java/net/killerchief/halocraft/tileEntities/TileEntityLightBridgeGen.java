package net.killerchief.halocraft.tileEntities;

import net.killerchief.halocraft.blocks.BlockLightBridgeGen;
import net.killerchief.halocraft.client.gui.GuiLightBridge;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.block.Block;
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

public class TileEntityLightBridgeGen extends TileEntity implements IInventory{

	public int delay = 0;
	public boolean hasSomethingChanged = true;

	private boolean OverrideRedstone = false;
	private boolean OverrideOn = false;
	private String LockUsername = "";
	private boolean AllowAllToEdit = false;
	private int BridgeDistance = 4;
	public static final int maxDistance = 20;

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		if (--this.delay <= 0)
		{
			this.delay = 10;
			if (!this.worldObj.isRemote)
			{
				if (!this.OverrideRedstone && (this.worldObj.isBlockIndirectlyGettingPowered(this.xCoord, this.yCoord, this.zCoord)) || (this.OverrideRedstone && this.OverrideOn))
				{
					if (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord) == HalocraftBlocks.LightBridgeGenActive)
					{
						int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
						int i1 = 0;
						int z1 = 0;
						if (meta == 2) {
							i1 = 0;
							z1 = -1;
						} else if (meta == 3) {
							i1 = 0;
							z1 = 1;
						} else if (meta == 4) {
							i1 = -1;
							z1 = 0;
						} else if (meta == 5) {
							i1 = 1;
							z1 = 0;
						}
						if (!(i1 == 0 && z1 == 0))
						{
							for (int d = 1; d <= maxDistance; d++) {
								int x = this.xCoord+(d*i1);
								int y = this.yCoord;
								int z = this.zCoord+(d*z1);
								Block blockScan = this.worldObj.getBlock(x, y, z);

								if (this.getBridgeDistance() >= d)
								{//correct height
									if (blockScan == HalocraftBlocks.LightBridgeExt)
									{
										TileEntity te = this.worldObj.getTileEntity(x, y, z);
										if (te instanceof TileEntityLightBridgeExt) {
											TileEntityLightBridgeExt lbext = (TileEntityLightBridgeExt)te;
											if (!lbext.active) {
												lbext.active = true;//set then send changes to client
												lbext.genX = this.xCoord;
												lbext.genY = this.yCoord;
												lbext.genZ = this.zCoord;
												lbext.renderType = (z1==0 ? 1 : (i1==0 ? 2 : 0));
												this.worldObj.markBlockForUpdate(x, y, z);
												lbext.markDirty();
												this.hasSomethingChanged = true;
											}
										}
									}
									else if (blockScan == Blocks.air) {
										this.delay = 0;
										this.worldObj.setBlock(x, y, z, HalocraftBlocks.LightBridgeExt);
										TileEntity te = this.worldObj.getTileEntity(x, y, z);
										if (te instanceof TileEntityLightBridgeExt) {
											TileEntityLightBridgeExt lbext = (TileEntityLightBridgeExt)te;
											lbext.active = true;//set then send changes to client
											lbext.genX = this.xCoord;
											lbext.genY = this.yCoord;
											lbext.genZ = this.zCoord;
											lbext.renderType = (z1==0 ? 1 : (i1==0 ? 2 : 0));
											this.worldObj.markBlockForUpdate(x, y, z);
											lbext.markDirty();
										}
										this.hasSomethingChanged = true;
									} else
										break;
								}
								else if (blockScan == HalocraftBlocks.LightBridgeExt)
								{//overflow set to air
									TileEntity te = this.worldObj.getTileEntity(x, y, z);
									if (te instanceof TileEntityLightBridgeExt) {
										TileEntityLightBridgeExt lbext = (TileEntityLightBridgeExt)te;
										if (lbext.active && lbext.genX == this.xCoord && lbext.genY == this.yCoord && lbext.genZ == this.zCoord) {
											lbext.active = false;//set then send changes to client
											this.worldObj.markBlockForUpdate(x, y, z);
											lbext.markDirty();
										}
									}
									this.hasSomethingChanged = true;
								}
								else
								{//if normal block then break
									break;
								}
							}
						}
					}
					else
					{
						((BlockLightBridgeGen)this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord)).swapBlockType(true, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
					}
				}
				else
				{
					if (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord) == HalocraftBlocks.LightBridgeGenActive)
					{
						((BlockLightBridgeGen)this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord)).swapBlockType(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
					}
					else
					{
						BlockLightBridgeGen.genOff(this.worldObj, this.xCoord, this.yCoord, this.zCoord, this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord));
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
		this.BridgeDistance = par1NBTTagCompound.getInteger("BridgeDistance");
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
		par1NBTTagCompound.setInteger("BridgeDistance", this.BridgeDistance);
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
		if (gui != null && gui instanceof GuiLightBridge) {
			((GuiLightBridge) gui).updateScreen();
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

	public void offsetBridgeDistance(int offset)
	{
		for (int i = 0; i < Math.abs(offset); i++)
		{
			if (this.BridgeDistance + (int)Math.signum(offset) <= maxDistance && this.BridgeDistance + (int)Math.signum(offset) >= 0)
			{
				this.BridgeDistance += (int)Math.signum(offset);
			}
			else
			{
				break;
			}
		}
		this.hasSomethingChanged = true;
	}
	public int getBridgeDistance()
	{
		return this.BridgeDistance;
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
		return "InventoryLightBridge";
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
