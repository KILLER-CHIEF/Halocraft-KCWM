package net.killerchief.halocraft.tileEntities;

import net.killerchief.halocraft.blocks.BlockLandmine;
import net.killerchief.halocraft.client.gui.GuiLandmine;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.FMLClientHandler;

public class TileEntityLandmine extends TileEntity implements IInventory
{
	public TileEntityLandmine(){}

	private int tick2fast = 0;
	public boolean hasSomethingChanged = true;
	private String LockUsername = "";
	private String ArmedByPlayer = "";
	private int LockProgress = 0;
	private int LockTicks = 0;
	private String HackingPlayer = "";
	private double PrevHackPlayerDist = 0D;

	/**
	 * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
	 * ticks and creates a new spawn inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		if (this.tick2fast <= 0)
		{
			if (!this.worldObj.isRemote)
			{
				if (!this.LockUsername.equalsIgnoreCase(""))
				{
					if (this.LockTicks > 0)
					{
						if (this.worldObj.getPlayerEntityByName(this.HackingPlayer) != null)
						{
							if (this.worldObj.getPlayerEntityByName(this.HackingPlayer).getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) != this.PrevHackPlayerDist)
							{
								this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
								this.worldObj.createExplosion(null, this.xCoord, this.yCoord, this.zCoord, BlockLandmine.explosiveness, HalocraftConfig.ExplosionBlockDamage);
								return;
							}
							if (this.LockTicks <= 20)
							{
								++this.LockTicks;
								this.LockProgress += this.worldObj.rand.nextInt(3);
								this.hasSomethingChanged = true;
							}
							else
							{
								if (this.LockProgress > this.LockTicks)
								{
									this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
									this.worldObj.createExplosion(null, this.xCoord, this.yCoord, this.zCoord, BlockLandmine.explosiveness, HalocraftConfig.ExplosionBlockDamage);
									return;
								}
								else
								{
									this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
									this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, HalocraftBlocks.LandmineIdle);
									return;
								}
							}
						}
						else
						{
							this.PrevHackPlayerDist = 0D;
							this.LockProgress = 0;
							this.LockTicks = 0;
							this.hasSomethingChanged = true;
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
			this.tick2fast = 20;
		}
		else
		{
			--this.tick2fast;
		}
	}

	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		this.LockUsername = par1NBTTagCompound.getString("LockUsername");
		this.ArmedByPlayer = par1NBTTagCompound.getString("ArmedByPlayer");
		this.LockProgress = par1NBTTagCompound.getInteger("LockProgress");
		this.LockTicks = par1NBTTagCompound.getInteger("LockTicks");
		this.HackingPlayer = par1NBTTagCompound.getString("HackingPlayer");
		this.PrevHackPlayerDist = par1NBTTagCompound.getDouble("PrevHackPlayerDist");
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setString("LockUsername", this.LockUsername);
		par1NBTTagCompound.setString("ArmedByPlayer", this.ArmedByPlayer);
		par1NBTTagCompound.setInteger("LockProgress", this.LockProgress);
		par1NBTTagCompound.setInteger("LockTicks", this.LockTicks);
		par1NBTTagCompound.setString("HackingPlayer", this.HackingPlayer);
		par1NBTTagCompound.setDouble("PrevHackPlayerDist", this.PrevHackPlayerDist);
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
		if (gui != null && gui instanceof GuiLandmine) {
			((GuiLandmine) gui).updateScreen();
			((GuiLandmine) gui).drawScreen(0, 0, 0);
		}
	}

	public void setArmedByPlayer(String name)
	{
		this.ArmedByPlayer = name;
		this.hasSomethingChanged = true;
	}
	public String getArmedByPlayer()
	{
		return this.ArmedByPlayer;
	}

	public int getHackingProgress()
	{
		return (int)((((float)(this.LockTicks + this.worldObj.rand.nextInt(4)-2))/20) * 156);
	}
	public boolean isHackInProgress()
	{
		return this.LockTicks == 0 ? false : true;
	}

	public void startHack(String name)
	{
		this.HackingPlayer = name;
		this.LockTicks = 1;
		this.PrevHackPlayerDist = this.worldObj.getPlayerEntityByName(name).getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D);
		this.LockProgress = ((int)(this.PrevHackPlayerDist * 10) - 20)/5;
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

	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 6.0D;
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
		return "container.halocraft.landmine";
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
