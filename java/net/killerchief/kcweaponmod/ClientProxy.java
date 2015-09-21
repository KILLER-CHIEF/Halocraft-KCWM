package net.killerchief.kcweaponmod;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registers()
	{
		KeyBindings.init();
	}

	@Override
	public void registerRenderers()
	{
		//FIXME: Dynamic Projectile & Render Classes
		RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, new RenderProjectile());
		/*try {
			RenderingRegistry.registerEntityRenderingHandler((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender"), new RenderProjectile());
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found exception: net.killerchief.kcweaponmod.EntityRenderExtender.Entity"+i);
			e.printStackTrace();
		}*/
	}

	@Override
	public boolean isSideClient()
	{
		return true;
	}
}