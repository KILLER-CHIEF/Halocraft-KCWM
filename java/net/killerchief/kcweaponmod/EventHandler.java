package net.killerchief.kcweaponmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
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
	
	private int stopAimingCoolDown = 0;

	@SubscribeEvent
	public void livingEventClient(LivingEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer entityplayer = (EntityPlayer) event.entityLiving;

			if (KCWeaponMod.proxy.isSideClient())
			{
				if (entityplayer.getHeldItem() != null && (entityplayer.getHeldItem().getItem() instanceof ItemWeapon && ((ItemWeapon)entityplayer.getHeldItem().getItem()).Properties.AimItem))
				{
					if (!entityplayer.isSprinting() && !(entityplayer.getHeldItem().getItem() instanceof ItemWeapon && ((ItemWeapon)entityplayer.getHeldItem().getItem()).doloweredweapon()))
					{
						KCUtils.setItemInUseCount(entityplayer, 71005);
					}
					else
					{
						KCUtils.setItemInUseCount(entityplayer, 0);
					}
					if (stopAimingCoolDown != 4)
					{
						stopAimingCoolDown = 4;
					}
				}
				else
				{
					if (stopAimingCoolDown > 0)
					{
						KCUtils.setItemInUseCount(entityplayer, 0);
						--stopAimingCoolDown;
					}
				}
			}
		}
	}
}
