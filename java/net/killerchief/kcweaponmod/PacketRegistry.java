package net.killerchief.kcweaponmod;

import cpw.mods.fml.relauncher.Side;

public class PacketRegistry {
	static int id = 0;
	public static void registerPackets() {
		KCWeaponMod.network.registerMessage(PacketShoot.Handler.class, PacketShoot.class, id++, Side.SERVER);
		KCWeaponMod.network.registerMessage(PacketShoot.Handler.class, PacketShoot.class, id++, Side.CLIENT);
		KCWeaponMod.network.registerMessage(PacketReload.Handler.class, PacketReload.class, id++, Side.SERVER);
		KCWeaponMod.network.registerMessage(PacketReload.Handler.class, PacketReload.class, id++, Side.CLIENT);
	}
}
