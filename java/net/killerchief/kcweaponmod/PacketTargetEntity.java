package net.killerchief.kcweaponmod;

import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketTargetEntity implements IMessage {

	private int entityID;

	public PacketTargetEntity() { }

	public PacketTargetEntity(int entityid) {
		this.entityID = entityid;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.entityID);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.entityID = buf.readInt();
	}

	public static class Handler implements IMessageHandler<PacketTargetEntity, IMessage>
	{
		@Override
		public IMessage onMessage(PacketTargetEntity message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				TickHandler.EntityTargetingMap.put(ctx.getServerHandler().playerEntity, new Object[]{System.currentTimeMillis() + 1000L, message.entityID, ctx.getServerHandler().playerEntity.getCurrentEquippedItem().getItem()});
			}
			return null; // no response in this case
		}
	}
}
