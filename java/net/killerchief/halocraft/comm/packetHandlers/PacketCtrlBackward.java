package net.killerchief.halocraft.comm.packetHandlers;

import net.killerchief.halocraft.TickHandler;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketCtrlBackward implements IMessage {

	private boolean backward;

	public PacketCtrlBackward() { }

	public PacketCtrlBackward(boolean keyon) {
		this.backward = keyon;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(this.backward);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.backward = buf.readBoolean(); // this class is very useful in general for writing more complex objects
	}

	public static class Handler implements IMessageHandler<PacketCtrlBackward, IMessage>
	{
		@Override
		public IMessage onMessage(PacketCtrlBackward message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				TickHandler.BackwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(message.backward));
				if (!TickHandler.ForwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ForwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
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