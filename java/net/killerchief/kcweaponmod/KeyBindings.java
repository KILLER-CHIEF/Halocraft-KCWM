package net.killerchief.kcweaponmod;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;

public class KeyBindings {

	public static KeyBinding ReloadKey;
	public static KeyBinding ZoomKey;

	public static void init() {
		ReloadKey = new KeyBinding("key.kcwmreloadkey", Keyboard.KEY_R, "key.categories."+KCWeaponMod.MODID);
		ZoomKey = new KeyBinding("key.kcwmzoomkey", Keyboard.KEY_Z, "key.categories."+KCWeaponMod.MODID);

		ClientRegistry.registerKeyBinding(ReloadKey);
		ClientRegistry.registerKeyBinding(ZoomKey);
	}
}
