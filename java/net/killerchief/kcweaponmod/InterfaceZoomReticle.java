package net.killerchief.kcweaponmod;

import net.minecraft.util.ResourceLocation;

public interface InterfaceZoomReticle {
	
	public boolean IsZoomable();
	
	public int[] ZoomMultiplier();
	
	public ResourceLocation ZoomTexture();
	
	public boolean ZoomLikeHelmet();
	
	public boolean HasReticle();
	
	public ResourceLocation ReticleTexture();
	
	public float ReticleTransparency();
	
	public int[] ReticleProperties();

}
