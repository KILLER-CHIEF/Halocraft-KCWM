package net.killerchief.kcweaponmod;

import java.lang.reflect.Constructor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registers()
	{
		KeyBindings.init();
	}

	@Override
	public void registerRenderers()
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeFrag.class, new RenderProjectile(EnumType.FragGrenadeModel42));
		
		//          ---------Which one variable-------
		//new class, bullet texture, 2d texture, model class
		
		int i = 0;
		while (i < KCWeaponMod.ProjIDRender.length)
		{
			if (KCWeaponMod.ProjIDRender[i] != null)
			{
				String[] name = KCWeaponMod.ProjIDRender[i].split("#");
				int renderType = 0;
				String bulletTex = "";
				String twoDeeTex = "";
				String modelTex = "";
				String modelClass = "";
				if (name.length <= 1)
				{
					bulletTex = name[0];
				}
				else
				{
					renderType = Integer.parseInt(name[0]);
					if (renderType == 0 || renderType == 3)
					{
						bulletTex = name[1];
					}
					else if (renderType == 1)
					{
						twoDeeTex = name[1];
					}
					else if (renderType == 2 && name.length >= 3)
					{
						modelTex = name[1];
						modelClass = name[2];
					}
					else
					{
						System.err.println("KCWeaponMod - Error: Projectile Render Properties are invalid!");
						renderType = 0;
						bulletTex = KCWeaponMod.MODID+":textures/entities/Default/DefaultProjectileRender.png";
					}
				}
				try {//FIXME: Dynamic bullet class location java reflection
					RenderingRegistry.registerEntityRenderingHandler((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[i], new RenderProjectile(renderType, bulletTex, twoDeeTex, modelTex, modelClass));
				} catch (ClassNotFoundException e) {
					System.err.println("Class not found exception: net.killerchief.kcweaponmod.EntityRenderExtender.Entity"+i);
					e.printStackTrace();
				}
			}
			i++;
		}
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityRenderExtender.class, new RenderProjectile(1, "", "", "", ""));
		
		
		/*
		//public static EntityRenderExtender ProjectileEntityArray[] = new EntityRenderExtender[3];
		
	    for (EntityRenderExtender entity : KCWeaponMod.ProjectileEntityArray)
	    {
	    	//player.worldObj.spawnEntityInWorld(new EntityArrow(player.worldObj, player, 4.0F));
	    	RenderingRegistry.registerEntityRenderingHandler(entity.getClass(), new RenderProjectile(null));//Need to fill in, call in the properties class!
	    	
	    	//Interesting issue: Registered entity may not be usable ingame so a new instance will be created and will have no render.
	    	//If overwrite the entry in array, instance is lost presumably.
	    	//Why do we have to overwrite? To enter a world reference and properties.
	    	//We're screwed man, we're screwed!
	    	//Therefore, absolutely stuck.
	    }*/
		
	}

	@Override
	public boolean isSideClient()
	{
		return true;
	}
}