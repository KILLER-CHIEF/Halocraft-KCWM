package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityTurretSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.kcweaponmod.KCUtils;
import net.killerchief.kcweaponmod.TickHandlerClient;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketVehicleShoot implements IMessage {

	public PacketVehicleShoot() { }

	@Override
	public void toBytes(ByteBuf buf){}

	@Override
	public void fromBytes(ByteBuf buf){}

	public static class Handler implements IMessageHandler<PacketVehicleShoot, IMessage>
	{
		@Override
		public IMessage onMessage(PacketVehicleShoot message, MessageContext ctx)
		{
			if (ctx.side.isClient())
			{
				if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityGhost)
				{
					TickHandlerClient.Recoil += 2F;
				}
				else if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityTurretSeat)
				{
					TickHandlerClient.Recoil += 4F;
				}
			}
			else if (ctx.side.isServer())
			{
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player != null && player.ridingEntity != null)
				{
					if (player.ridingEntity instanceof EntityGhost)
					{
						EntityGhost vehicle = (EntityGhost)player.ridingEntity;
						if (vehicle.shootDelay <= 0)
						{
							player.worldObj.playSoundAtEntity(player, Halocraft.MODID+":entities.ghost.GhostShoot", 1.0F, 1.0F);
							vehicle.shootDelay = 3;
							Halocraft.network.sendTo(new PacketVehicleShoot(), (EntityPlayerMP)player);

							double xOffset = -Math.sin(Math.toRadians(vehicle.rotationYaw)) * 2.2D * (vehicle.speed * 0.1 > 1D ? 1.1D : 1D);
							double zOffset = Math.cos(Math.toRadians(vehicle.rotationYaw)) * 2.2D * (vehicle.speed * 0.1 > 1D ? 1.1D : 1D);
							KCUtils.fireProjectile(player.worldObj, vehicle.posX + xOffset, vehicle.posY + 0.5D, vehicle.posZ + zOffset, player, HalocraftItemsWeapons.GhostPlasmaBolt.Properties.ID);
						}
					}
					else if (player.ridingEntity instanceof EntityTurretSeat)
					{
						EntityTurretSeat turret = (EntityTurretSeat)player.ridingEntity;
						if (turret.parentBody != null && turret.parentBody instanceof EntityWarthog)
						{
							if (turret.shootDelay <= 0)
							{
								player.worldObj.playSoundAtEntity(player, Halocraft.MODID+":entities.warthog.ChainGunFire", 1.0F, 1.0F);
								turret.shootDelay = 2;
								Halocraft.network.sendTo(new PacketVehicleShoot(), (EntityPlayerMP)player);

								double xOffset = -Math.sin(Math.toRadians(player.rotationYaw)) * 0.5D;
								double zOffset = Math.cos(Math.toRadians(player.rotationYaw)) * 0.5D;
								KCUtils.fireProjectile(player.worldObj, turret.posX + xOffset, turret.posY + 1.0D, turret.posZ + zOffset, player, HalocraftItemsWeapons.ChainGunBullet.Properties.ID);
							}
						}
					}
				}
			}
			return null; // no response in this case
		}
	}
}
