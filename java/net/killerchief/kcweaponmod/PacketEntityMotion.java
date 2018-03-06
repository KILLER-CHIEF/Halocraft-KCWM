package net.killerchief.kcweaponmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketEntityMotion implements IMessage {

	private int entityID;
	
	private double motionX;
	private double motionY;
	private double motionZ;
	

	public PacketEntityMotion() { }

	public PacketEntityMotion(int entityid, double motionX, double motionY, double motionZ) {
		this.entityID = entityid;
		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.entityID);
		buf.writeDouble(this.motionX);
		buf.writeDouble(this.motionY);
		buf.writeDouble(this.motionZ);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.entityID = buf.readInt();
		this.motionX = buf.readDouble();
		this.motionY = buf.readDouble();
		this.motionZ = buf.readDouble();
	}

	public static class Handler implements IMessageHandler<PacketEntityMotion, IMessage>
	{
		@Override
		public IMessage onMessage(PacketEntityMotion message, MessageContext ctx)
		{
			if(ctx.side.isClient())
			{
				Entity entity = Minecraft.getMinecraft().thePlayer.worldObj.getEntityByID(message.entityID);
				if (entity != null) {
					entity.setVelocity(message.motionX, message.motionY, message.motionZ);
					
					float f = MathHelper.sqrt_double(message.motionX * message.motionX + message.motionZ * message.motionZ);
					entity.prevRotationYaw = entity.rotationYaw = (float)(Math.atan2(message.motionX, message.motionZ) * 180.0D / Math.PI);
					entity.prevRotationPitch = entity.rotationPitch = (float)(Math.atan2(message.motionY, (double)f) * 180.0D / Math.PI);
					
				}
			}
			return null; // no response in this case
		}
	}
}
