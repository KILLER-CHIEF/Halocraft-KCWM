package net.killerchief.halocraft.comm.packetHandlers;

import net.killerchief.halocraft.TickHandler;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketCtrlLeft implements IMessage {

	private boolean left;

	public PacketCtrlLeft() { }

	public PacketCtrlLeft(boolean keyon) {
		this.left = keyon;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(this.left);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.left = buf.readBoolean(); // this class is very useful in general for writing more complex objects
	}

	public static class Handler implements IMessageHandler<PacketCtrlLeft, IMessage>
	{
		@Override
		public IMessage onMessage(PacketCtrlLeft message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				TickHandler.LeftMap.put(ctx.getServerHandler().playerEntity, new Boolean(message.left));
				if (!TickHandler.BackwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.BackwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
				if (!TickHandler.ForwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ForwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
				if (!TickHandler.RightMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.RightMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
			}
			return null; // no response in this case
		}
	}
}