package net.killerchief.kcweaponmod;

public interface InterfaceZoomReticle {
	
	public boolean IsZoomable();
	
	public int[] ZoomMultiplier();
	
	public String ZoomTexture();
	
	public boolean ZoomLikeHelmet();
	
	public boolean HasReticle();
	
	public String ReticleTexture();
	
	public int[] ReticleProperties();

}
