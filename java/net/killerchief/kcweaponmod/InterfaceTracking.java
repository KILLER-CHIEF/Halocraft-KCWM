package net.killerchief.kcweaponmod;

import net.minecraft.util.ResourceLocation;

public interface InterfaceTracking {

	public boolean CanTrack();

	public float TrackSensitivity();

	public int TrackDelay();

	public int TrackType();

	public int TrackDistance();
}
