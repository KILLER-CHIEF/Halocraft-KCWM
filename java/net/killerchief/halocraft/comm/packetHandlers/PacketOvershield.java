package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.TickHandlerClient;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketOvershield implements IMessage {

	private int shield;
	private boolean recharging;

	public PacketOvershield() { }

	public PacketOvershield(int shieldhealth, boolean isrecharging) {
		this.shield = shieldhealth;
		this.recharging = isrecharging;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.shield);
		buf.writeBoolean(this.recharging);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.shield = buf.readInt();
		this.recharging = buf.readBoolean();
	}

	public static class Handler implements IMessageHandler<PacketOvershield, IMessage>
	{
		@Override
		public IMessage onMessage(PacketOvershield message, MessageContext ctx)
		{
			if(ctx.side.isClient())
			{
				TickHandlerClient.ShieldHealth = message.shield;
				if (!TickHandlerClient.IsRecharging && message.recharging)
					Minecraft.getMinecraft().thePlayer.playSound(Halocraft.MODID+":armour.ShieldRecharge", 1.0F, 1.0F);
				TickHandlerClient.IsRecharging = message.recharging;
			}
			return null; // no response in this case
		}
	}
}
