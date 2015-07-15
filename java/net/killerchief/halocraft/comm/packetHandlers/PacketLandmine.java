package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.blocks.BlockLandmine;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;

public class PacketLandmine implements IMessage {

	private int X;
	private int Y;
	private int Z;
	private byte btnVal;

	public PacketLandmine() { }

	public PacketLandmine(int x, int y, int z, byte btnval) {
		this.X = x;
		this.Y = y;
		this.Z = z;
		this.btnVal = btnval;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.X);
		buf.writeInt(this.Y);
		buf.writeInt(this.Z);
		buf.writeByte(this.btnVal);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.X = buf.readInt();
		this.Y = buf.readInt();
		this.Z = buf.readInt();
		this.btnVal = buf.readByte();
	}

	public static class Handler implements IMessageHandler<PacketLandmine, IMessage>
	{
		@Override
		public IMessage onMessage(PacketLandmine message, MessageContext ctx)
		{
			if (ctx.side == Side.SERVER) {
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player.worldObj.getTileEntity(message.X, message.Y, message.Z) instanceof TileEntityLandmine)
				{
					TileEntityLandmine tileentity = ((TileEntityLandmine)player.worldObj.getTileEntity(message.X, message.Y, message.Z));

					if (message.btnVal != 0)
					{
						if (tileentity.getUsername().equalsIgnoreCase("") || tileentity.getUsername().equalsIgnoreCase(player.getDisplayName()))
						{
							if (message.btnVal == 1)
							{
								BlockLandmine.swapBlockType(true, player.worldObj, message.X, message.Y, message.Z);
								tileentity.setArmedByPlayer(player.getDisplayName());
							}
							else if (message.btnVal == 2)
							{
								BlockLandmine.swapBlockType(false, player.worldObj, message.X, message.Y, message.Z);
								tileentity.setArmedByPlayer("");
							}
							else if (message.btnVal == -1)
							{
								tileentity.setUsername(player.getDisplayName());
							}
							else if (message.btnVal == -2)
							{
								tileentity.setUsername("");
							}
						}
						else
						{
							if (message.btnVal == 3)
							{
								if (!tileentity.isHackInProgress())
								{
									tileentity.startHack(player.getDisplayName());
								}
								else
								{
									player.worldObj.setBlockToAir(message.X, message.Y, message.Z);
									player.worldObj.createExplosion(null, message.X, message.Y, message.Z, BlockLandmine.explosiveness, HalocraftConfig.ExplosionBlockDamage);
								}
							}
							if (message.btnVal == 4 && tileentity.isHackInProgress())
							{
								player.worldObj.setBlockToAir(message.X, message.Y, message.Z);
								player.worldObj.createExplosion(null, message.X, message.Y, message.Z, BlockLandmine.explosiveness, HalocraftConfig.ExplosionBlockDamage);
							}
						}
					}
					tileentity.hasSomethingChanged = true;
				}
			}
			return null; // no response in this case
		}
	}
}
