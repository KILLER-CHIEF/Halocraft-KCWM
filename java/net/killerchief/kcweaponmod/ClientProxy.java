package net.killerchief.kcweaponmod;

import net.killerchief.halocraft.client.models.guns.ModelSniperRifle;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
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
		for (ItemWeapon weapon : KCWeaponMod.weapons)
		{
			if (weapon.Properties.WeaponModel != null)
			{
				MinecraftForgeClient.registerItemRenderer(weapon, (IItemRenderer)new RenderWeapon(weapon.Properties.WeaponModel));
			}
		}
		
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