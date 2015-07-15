package net.killerchief.halocraft.comm.packetHandlers;

import net.killerchief.halocraft.TickHandler;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketCtrlRight implements IMessage {

	private boolean right;

	public PacketCtrlRight() { }

	public PacketCtrlRight(boolean keyon) {
		this.right = keyon;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(this.right);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.right = buf.readBoolean(); // this class is very useful in general for writing more complex objects
	}

	public static class Handler implements IMessageHandler<PacketCtrlRight, IMessage>
	{
		@Override
		public IMessage onMessage(PacketCtrlRight message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				TickHandler.RightMap.put(ctx.getServerHandler().playerEntity, new Boolean(message.right));
				if (!TickHandler.BackwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.BackwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
				if (!TickHandler.ForwardMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.ForwardMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
				if (!TickHandler.LeftMap.containsKey(ctx.getServerHandler().playerEntity))
				{
					TickHandler.LeftMap.put(ctx.getServerHandler().playerEntity, new Boolean(false));
				}
			}
			return null; // no response in this case
		}
	}
}
