package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class PacketGravityLift implements IMessage {

	private int X;
	private int Y;
	private int Z;
	private byte btnVal;
	private byte Offset;

	public PacketGravityLift() { }

	public PacketGravityLift(int x, int y, int z, byte btnval, byte offset) {
		this.X = x;
		this.Y = y;
		this.Z = z;
		this.btnVal = btnval;
		this.Offset = offset;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.X);
		buf.writeInt(this.Y);
		buf.writeInt(this.Z);
		buf.writeByte(this.btnVal);
		buf.writeByte(this.Offset);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.X = buf.readInt();
		this.Y = buf.readInt();
		this.Z = buf.readInt();
		this.btnVal = buf.readByte();
		this.Offset = buf.readByte();
	}

	public static class Handler implements IMessageHandler<PacketGravityLift, IMessage>
	{
		@Override
		public IMessage onMessage(PacketGravityLift message, MessageContext ctx)
		{
			if (ctx.side == Side.SERVER) {
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player.worldObj.getTileEntity(message.X, message.Y, message.Z) instanceof TileEntityGravityLift)
				{
					TileEntityGravityLift tileentity = ((TileEntityGravityLift)player.worldObj.getTileEntity(message.X, message.Y, message.Z));
					//Tried to get player to reopen the gui but it opens too fast for the block change to take effect so still results as a faulty gui
					//if (message.btnVal == 0 && message.Offset == 0)
					//{
					//	FMLNetworkHandler.openGui(player, Halocraft.instance, 2, player.worldObj, message.X, message.Y, message.Z);
					//}
					if (tileentity.getUsername().equalsIgnoreCase("") || tileentity.getUsername().equalsIgnoreCase(player.getDisplayName()))
					{
						if (message.btnVal != 0)
						{
							if (message.btnVal == 1)
							{
								tileentity.setOverrideRedstone(true);
								tileentity.setOverrideOn(true);
							}
							else if (message.btnVal == 2)
							{
								tileentity.setOverrideRedstone(true);
								tileentity.setOverrideOn(false);
							}
							else if (message.btnVal == 3)
							{
								tileentity.setOverrideRedstone(false);
								tileentity.setOverrideOn(false);
							}
							else if (message.btnVal == -1)
							{
								tileentity.setUsername(player.getDisplayName());
								tileentity.setAllowAllToEdit(false);
							}
							else if (message.btnVal == -2)
							{
								tileentity.setUsername("");
								tileentity.setAllowAllToEdit(false);
							}
							else if (message.btnVal == -3)
							{
								tileentity.setAllowAllToEdit(true);
							}
							else if (message.btnVal == -4)
							{
								tileentity.setAllowAllToEdit(false);
							}
						}
						if (message.Offset != 0)
						{
							tileentity.offsetGravitationalHeight(message.Offset);
						}
					}
					else if (tileentity.getAllowAllToEdit())
					{
						if (message.btnVal != 0)
						{
							if (message.btnVal == 1)
							{
								tileentity.setOverrideRedstone(true);
								tileentity.setOverrideOn(true);
							}
							else if (message.btnVal == 2)
							{
								tileentity.setOverrideRedstone(true);
								tileentity.setOverrideOn(false);
							}
							else if (message.btnVal == 3)
							{
								tileentity.setOverrideRedstone(false);
								tileentity.setOverrideOn(false);
							}
						}
						if (message.Offset != 0)
						{
							tileentity.offsetGravitationalHeight(message.Offset);
						}
					}
					tileentity.hasSomethingChanged = true;
				}
			}
			return null; // no response in this case
		}
	}
}
