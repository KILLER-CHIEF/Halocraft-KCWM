package net.killerchief.kcweaponmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	
	@SubscribeEvent
	public void LivingDeathEvent(LivingDeathEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			TickHandler.ShootDelayMap.remove(player);
			TickHandler.ReloadDelayMap.remove(player);
		}
	}
}
