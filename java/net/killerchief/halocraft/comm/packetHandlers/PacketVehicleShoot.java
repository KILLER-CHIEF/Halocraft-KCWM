package net.killerchief.halocraft.comm.packetHandlers;

import io.netty.buffer.ByteBuf;

import java.lang.reflect.InvocationTargetException;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityPassengerSeat;
import net.killerchief.halocraft.entities.vehicles.EntityTurretSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketVehicleShoot implements IMessage {

	public PacketVehicleShoot() { }

	@Override
	public void toBytes(ByteBuf buf)
	{

	}

	@Override
	public void fromBytes(ByteBuf buf)
	{

	}

	public static class Handler implements IMessageHandler<PacketVehicleShoot, IMessage>
	{
		@Override
		public IMessage onMessage(PacketVehicleShoot message, MessageContext ctx)
		{
			if(ctx.side.isServer())
			{
				EntityPlayerMP player = ctx.getServerHandler().playerEntity;
				if (player != null && player.ridingEntity != null)
				{
					if (player.ridingEntity instanceof EntityGhost)
					{
						player.worldObj.playSoundAtEntity(player, Halocraft.MODID+":entities.ghost.GhostShoot", 1.0F, 1.0F);
						
						EntityGhost vehicle = (EntityGhost)player.ridingEntity;
						double xOffset = -Math.sin(Math.toRadians(vehicle.rotationYaw)) * 2.2D * (vehicle.speed * 0.1 > 1D ? 1.1D : 1D);
						double zOffset = Math.cos(Math.toRadians(vehicle.rotationYaw)) * 2.2D * (vehicle.speed * 0.1 > 1D ? 1.1D : 1D);
						
						try {
							player.worldObj.spawnEntityInWorld(((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[EntityCustomProjectileHelper.ProjPropGhostPlasmaBolts.ProjectileID]).getConstructor(World.class, double.class, double.class, double.class, EntityLivingBase.class, int.class, String.class).newInstance(player.worldObj, vehicle.posX + xOffset, vehicle.posY + 0.5D, vehicle.posZ + zOffset, player, -1, "net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper.ProjPropGhostPlasmaBolts"));
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						} catch (NoSuchMethodException e) {
							e.printStackTrace();
						} catch (SecurityException e) {
							e.printStackTrace();
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
					}
					else if (player.ridingEntity instanceof EntityTurretSeat)
					{
						EntityTurretSeat turret = (EntityTurretSeat)player.ridingEntity;
						if (turret.parentBody != null && turret.parentBody instanceof EntityWarthog)
						{
							player.worldObj.playSoundAtEntity(player, Halocraft.MODID+":entities.warthog.ChainGunFire", 1.0F, 1.0F);
							
							Entity vehicle = player.ridingEntity;
							double xOffset = -Math.sin(Math.toRadians(player.rotationYaw)) * 0.5D;
							double zOffset = Math.cos(Math.toRadians(player.rotationYaw)) * 0.5D;
							//System.out.println(xOffset + " : "+ zOffset);
							try {
								player.worldObj.spawnEntityInWorld(((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[EntityCustomProjectileHelper.ProjPropWarthogTurret.ProjectileID]).getConstructor(World.class, double.class, double.class, double.class, EntityLivingBase.class, int.class, String.class).newInstance(player.worldObj, vehicle.posX + xOffset, vehicle.posY + 1.0D, vehicle.posZ + zOffset, player, -1, "net.killerchief.halocraft.entities.projectiles.EntityCustomProjectileHelper.ProjPropWarthogTurret"));
							} catch (InstantiationException e) {
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							} catch (NoSuchMethodException e) {
								e.printStackTrace();
							} catch (SecurityException e) {
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								e.printStackTrace();
							}
							//System.out.println("Shoot Turret");
						}
					}
				}
			}
			return null; // no response in this case
		}
	}
}
