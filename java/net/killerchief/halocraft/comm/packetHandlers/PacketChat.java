package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.client.TickHandlerClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketChat implements IMessage {

	private String chatText;

	public PacketChat() { }

	public PacketChat(String inputText) {
		this.chatText = inputText;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, this.chatText);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.chatText = ByteBufUtils.readUTF8String(buf); // this class is very useful in general for writing more complex objects
	}

	public static class Handler implements IMessageHandler<PacketChat, IMessage>
	{
		@Override
		public IMessage onMessage(PacketChat message, MessageContext ctx)
		{
			if(ctx.side.isClient())
			{
				try
				{
					if (TickHandlerClient.HelmetOn == true)
					{
						Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(message.chatText));
					}
				}
				catch (Exception e)
				{
					System.err.println("Pelican Spawn, Helmet On, Chat Message Failed...");
					System.err.println("This Should Only Rarely Happen On New Worlds Being Generated!");
					e.printStackTrace();
				}
			}
			//System.out.println(String.format("Received %s from %s", message.chatText, ctx.getServerHandler().playerEntity.getDisplayName()));
			return null; // no response in this case
		}
	}
}
