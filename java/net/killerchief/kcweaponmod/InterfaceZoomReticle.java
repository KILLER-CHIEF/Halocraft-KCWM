package net.killerchief.kcweaponmod;

import net.minecraft.util.ResourceLocation;

public interface InterfaceZoomReticle {
	
	public boolean IsZoomable();
	
	public int[] ZoomMultiplier();
	
	public boolean ZoomLikeHelmet();
	
	public ResourceLocation ScopeTexture();
	
	public float ScopeBGOpacity();
	
	public int[] ScopeProperties();
	
	public boolean HasReticle();
	
	public ResourceLocation ReticleTexture();
	
	public float ReticleOpacity();
	
	public int[] ReticleProperties();

}
