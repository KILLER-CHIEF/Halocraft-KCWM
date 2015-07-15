package net.killerchief.halocraft.comm.packetHandlers;

import net.killerchief.halocraft.TickHandler;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketCtrlForward implements IMessage {

	private boolean forward;

	public PacketCtrlForward() { }

	public PacketCtrlForward(boolean keyon) {
		this.forward = keyon;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(this.forward);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.forward = buf.readBoolean(); // this class is very useful in general for writing more complex objects
	}

	public static class Handler implements IMessageHandler<PacketCtrlForward, IMessage>
	{
		@Override
		public IMessage onMessage(PacketCtrlForward message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				TickHandler.ForwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(message.forward));
				if (!TickHandler.BackwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.BackwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
				if (!TickHandler.LeftMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.LeftMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
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
