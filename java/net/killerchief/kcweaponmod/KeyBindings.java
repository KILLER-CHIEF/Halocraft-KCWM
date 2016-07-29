package net.killerchief.kcweaponmod;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;

public class KeyBindings {

	public static KeyBinding ReloadKey;
	public static KeyBinding ZoomKey;

	public static KeyBinding weapModelFieldPrev;
	public static KeyBinding weapModelFieldNext;
	public static KeyBinding weapModelFieldUp;
	public static KeyBinding weapModelFieldDown;

	public static void init() {
		ReloadKey = new KeyBinding("key.kcwmreloadkey", Keyboard.KEY_R, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(ReloadKey);

		ZoomKey = new KeyBinding("key.kcwmzoomkey", Keyboard.KEY_Z, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(ZoomKey);

		weapModelFieldPrev = new KeyBinding("key.kcwmwmfprev", Keyboard.KEY_LEFT, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(weapModelFieldPrev);

		weapModelFieldNext = new KeyBinding("key.kcwmwmfnext", Keyboard.KEY_RIGHT, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(weapModelFieldNext);

		weapModelFieldUp = new KeyBinding("key.kcwmwmfup", Keyboard.KEY_UP, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(weapModelFieldUp);

		weapModelFieldDown = new KeyBinding("key.kcwmwmfdown", Keyboard.KEY_DOWN, "key.categories."+KCWeaponMod.MODID);
		ClientRegistry.registerKeyBinding(weapModelFieldDown);
	}
}
