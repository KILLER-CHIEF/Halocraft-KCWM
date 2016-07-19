package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class PacketUnscWeaponRack implements IMessage {

	private int X;
	private int Y;
	private int Z;
	private byte codeVal;

	public PacketUnscWeaponRack() { }

	public PacketUnscWeaponRack(int x, int y, int z, byte codeval) {
		this.X = x;
		this.Y = y;
		this.Z = z;
		this.codeVal = codeval;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.X);
		buf.writeInt(this.Y);
		buf.writeInt(this.Z);
		buf.writeByte(this.codeVal);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.X = buf.readInt();
		this.Y = buf.readInt();
		this.Z = buf.readInt();
		this.codeVal = buf.readByte();
	}

	public static class Handler implements IMessageHandler<PacketUnscWeaponRack, IMessage>
	{
		@Override
		public IMessage onMessage(PacketUnscWeaponRack message, MessageContext ctx)
		{
			if (ctx.side == Side.SERVER) {
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player.worldObj.getTileEntity(message.X, message.Y, message.Z) instanceof TileEntityUnscWeaponRack)
				{
					TileEntityUnscWeaponRack tileentity = ((TileEntityUnscWeaponRack)player.worldObj.getTileEntity(message.X, message.Y, message.Z));

					if (message.codeVal != 0)
					{
						if (message.codeVal == 1)
						{
							tileentity.getWorldObj().playSoundAtEntity(player, Halocraft.MODID+":items.WeaponRackClose", 1F, 1F);
							tileentity.setSideClosedState(true, true);
						}
						else if (message.codeVal == 2)
						{
							tileentity.getWorldObj().playSoundAtEntity(player, Halocraft.MODID+":items.WeaponRackClose", 1F, 1F);
							tileentity.setSideClosedState(false, true);
						}
						else if (message.codeVal == 3)
						{
							tileentity.getWorldObj().playSoundAtEntity(player, Halocraft.MODID+":items.WeaponRackOpen", 1F, 1F);
							tileentity.setSideClosedState(true, false);
						}
						else if (message.codeVal == 4)
						{
							tileentity.getWorldObj().playSoundAtEntity(player, Halocraft.MODID+":items.WeaponRackOpen", 1F, 1F);
							tileentity.setSideClosedState(false, false);
						}
					}
				}
			}
			return null; // no response in this case
		}
	}
}
