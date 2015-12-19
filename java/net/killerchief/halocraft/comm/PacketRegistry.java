package net.killerchief.halocraft.comm;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.comm.packetHandlers.PacketChat;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlBackward;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlForward;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlLeft;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlRight;
import net.killerchief.halocraft.comm.packetHandlers.PacketGravityLift;
import net.killerchief.halocraft.comm.packetHandlers.PacketGunHolder;
import net.killerchief.halocraft.comm.packetHandlers.PacketLandmine;
import net.killerchief.halocraft.comm.packetHandlers.PacketLightBridge;
import net.killerchief.halocraft.comm.packetHandlers.PacketOvershield;
import net.killerchief.halocraft.comm.packetHandlers.PacketVehicleShoot;
import cpw.mods.fml.relauncher.Side;

public class PacketRegistry {
	static int id = 0;
	public static void registerPackets() {
		Halocraft.network.registerMessage(PacketChat.Handler.class, PacketChat.class, id++, Side.CLIENT);
		Halocraft.network.registerMessage(PacketCtrlBackward.Handler.class, PacketCtrlBackward.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketCtrlForward.Handler.class, PacketCtrlForward.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketCtrlLeft.Handler.class, PacketCtrlLeft.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketCtrlRight.Handler.class, PacketCtrlRight.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketOvershield.Handler.class, PacketOvershield.class, id++, Side.CLIENT);
		Halocraft.network.registerMessage(PacketGravityLift.Handler.class, PacketGravityLift.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketLandmine.Handler.class, PacketLandmine.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketVehicleShoot.Handler.class, PacketVehicleShoot.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketVehicleShoot.Handler.class, PacketVehicleShoot.class, id++, Side.CLIENT);
		Halocraft.network.registerMessage(PacketGunHolder.Handler.class, PacketGunHolder.class, id++, Side.SERVER);
		Halocraft.network.registerMessage(PacketLightBridge.Handler.class, PacketLightBridge.class, id++, Side.SERVER);
	}
}
