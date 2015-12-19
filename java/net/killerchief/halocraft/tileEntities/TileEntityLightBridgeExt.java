package net.killerchief.halocraft.tileEntities;

import scala.reflect.internal.Trees.This;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.blocks.BlockLightBridgeGen;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLightBridgeExt extends TileEntity {

	public int delay = 10;
	
	public int genX = 0;
	public int genY = -1;
	public int genZ = 0;
	public boolean active = false;
	public int deathTimer = 0;
	
	public int renderType = 0;
	public int[] renderEdges = {0,0,0, 0,0,0, 0,0,0, 0,0,0};
	
	private boolean checkGenAndOrient(int x, int y, int z)
	{
		if (this.getWorldObj().getBlock(x, y, z) != HalocraftBlocks.LightBridgeGenActive || this.yCoord != y)
			return false;
		if (this.xCoord == x)
		{
			if (z - this.zCoord > 0)
				return this.getWorldObj().getBlockMetadata(x, y, z) == 2;
			else
				return this.getWorldObj().getBlockMetadata(x, y, z) == 3;
		}
		if (this.zCoord == z)
		{
			if (x - this.xCoord > 0)
				return this.getWorldObj().getBlockMetadata(x, y, z) == 4;
			else
				return this.getWorldObj().getBlockMetadata(x, y, z) == 5;
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
		if (--this.delay <= 0)
		{
			//System.out.println(this.deathTimer);
			this.delay = 50;
			if (this.active && this.genY >= 0 && this.genY == this.yCoord && this.checkGenAndOrient(this.genX, this.genY, this.genZ))
			{
				this.renderType = (this.genZ == this.zCoord ? 1 : (this.genX == this.xCoord ? 2 : 0));
				if (	(this.worldObj.getBlock(this.xCoord + 1, this.yCoord, this.zCoord) == HalocraftBlocks.LightBridgeExt ||
						this.worldObj.getBlock(this.xCoord - 1, this.yCoord, this.zCoord) == HalocraftBlocks.LightBridgeExt) &&
						(this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord + 1) == HalocraftBlocks.LightBridgeExt ||
						this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord - 1) == HalocraftBlocks.LightBridgeExt))
				{
					this.renderType = 0;
				}
				
				int[] tt = {0,0,0, 0,0,0, 0,0,0, 0,0,0};
				this.renderEdges = tt;
				for (int d = 0; d < 4; d++) {
					int multX = ((d==2 || d==3 ? 1 : 0)*(d==2 ? -1 : 1));
					int multZ = ((d==0 || d==1 ? 1 : 0)*(d==0 ? -1 : 1));
					int tempX = this.xCoord + multX;
					int tempZ = this.zCoord + multZ;
					if (this.worldObj.getBlock(tempX, this.yCoord, tempZ) == Blocks.air || (!this.worldObj.getBlock(tempX, this.yCoord, tempZ).isNormalCube() && this.worldObj.getBlock(tempX, this.yCoord, tempZ) != HalocraftBlocks.LightBridgeExt))
					{
						this.renderEdges[d*3] = 1;
						int l3 = -1;
						do {
							l3 *= -1;
							if (this.worldObj.getBlock(tempX + (multZ != 0 ? l3 : 0), this.yCoord, tempZ + (multX != 0 ? l3 : 0)) == HalocraftBlocks.LightBridgeExt)
							{
								this.renderEdges[d*3 + (l3 > 0 ? 1 : 2)] = -1;
							}
							else if (this.worldObj.getBlock(tempX + (multZ != 0 ? l3 : 0), this.yCoord, tempZ + (multX != 0 ? l3 : 0)) == Blocks.air || !this.worldObj.getBlock(tempX + (multZ != 0 ? l3 : 0), this.yCoord, tempZ + (multX != 0 ? l3 : 0)).isNormalCube())
							{
								if (this.worldObj.getBlock(this.xCoord + (multZ != 0 ? l3 : 0), this.yCoord, this.zCoord + (multX != 0 ? l3 : 0)) == HalocraftBlocks.LightBridgeExt)
								{
									this.renderEdges[d*3 + (l3 > 0 ? 1 : 2)] = 0;
								}
								else if (this.worldObj.getBlock(this.xCoord + (multZ != 0 ? l3 : 0), this.yCoord, this.zCoord + (multX != 0 ? l3 : 0)) == Blocks.air || !this.worldObj.getBlock(this.xCoord + (multZ != 0 ? l3 : 0), this.yCoord, this.zCoord + (multX != 0 ? l3 : 0)).isNormalCube())
								{
									this.renderEdges[d*3 + (l3 > 0 ? 1 : 2)] = 1;
								}
								else
								{
									this.renderEdges[d*3 + (l3 > 0 ? 1 : 2)] = 2;
								}
							}
							else
							{
								this.renderEdges[d*3 + (l3 > 0 ? 1 : 2)] = 0;
							}
						} while (l3 > 0);
					}
					else
					{
						this.renderEdges[d*3] = 0;
					}
				}
				System.out.println(this.renderEdges);
				
				
				if (this.deathTimer < 4)
				{
					this.deathTimer++;
				}
			}
			else
			{
				this.active = false;
				//System.out.println("Scan");
				/*if (!this.scanGen(TileEntityLightBridgeGen.maxDistance))
				{
					this.genX = this.xCoord;
					this.genY = this.yCoord;
					this.genZ = this.zCoord;
				}*/
				if (--this.deathTimer < 0)
				{
					this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, Blocks.air);
					this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
				}
				//System.out.println("Scan Complete");
			}
		}
		if (this.active)
		{
			//System.out.println("ActiveGen: X:"+genX+" Y:"+genY+" Z:"+genZ+" - "+this.getWorldObj().getBlock(genX, genY, genZ));
			if (this.worldObj.isRemote)
			{
				Halocraft.proxy.ParticleFX(1, worldObj, (float)xCoord + this.worldObj.rand.nextFloat(), (float)yCoord + 0.1F, (float)zCoord + this.worldObj.rand.nextFloat(), 0.0D, 1.0D, 0.0D);
			}
		}
	}
	
	private boolean scanGen(int dist)
	{
		this.genX = this.xCoord;
		this.genY = this.yCoord;
		this.genZ = this.zCoord;
		//System.out.println("Coord: X:"+xCoord+" Y:"+yCoord+" Z:"+zCoord);
		for (int d = 0; d < 4; d++) {
			for (int i = 1; i <= dist; i++) {
				int tempX = this.genX + ((d==0 || d==1 ? i : 0)*(d==1 ? -1 : 1));
				int tempZ = this.genZ + ((d==2 || d==3 ? i : 0)*(d==3 ? -1 : 1));
				//System.out.println("Check: X:"+x+" Y:"+y+" Z:"+z+" "+result);
				if (this.checkGenAndOrient(tempX, this.genY, tempZ))
				{
					this.genX = tempX;
					this.genZ = tempZ;
					this.active = true;
					this.renderType = (d==0 || d==1 ? 1 : (d==2 || d==3 ? 2 : 0));
					//System.out.println("Gen: X:"+genX+" Y:"+genY+" Z:"+genZ);
					return true;
				}
				else if (this.getWorldObj().getBlock(tempX, this.genY, tempZ) == HalocraftBlocks.LightBridgeExt)
				{}
				else {
					break;
				}
			}
		}
		return false;
	}
	
	/**
	 * Reads a tile entity from NBT.
	 */
	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		this.genX = par1NBTTagCompound.getInteger("genX");
		this.genY = par1NBTTagCompound.getInteger("genY");
		this.genZ = par1NBTTagCompound.getInteger("genZ");
		this.active = par1NBTTagCompound.getBoolean("active");
	}

	/**
	 * Writes a tile entity to NBT.
	 */
	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setInteger("genX", this.genX);
		par1NBTTagCompound.setInteger("genY", this.genY);
		par1NBTTagCompound.setInteger("genZ", this.genZ);
		par1NBTTagCompound.setBoolean("active", this.active);
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
	}
}
