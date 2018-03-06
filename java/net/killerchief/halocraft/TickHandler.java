package net.killerchief.halocraft;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import net.killerchief.halocraft.comm.packetHandlers.PacketOvershield;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class TickHandler {
	
	@SubscribeEvent
	public void ServerTickEvent(TickEvent.ServerTickEvent event)
	{
		if (event.phase == event.phase.START)
		{
			
		}
		if (event.phase == event.phase.END)
		{
			this.CommonTickEnd();
		}
	}
	
	@SubscribeEvent
	public void WorldTickEvent(TickEvent.WorldTickEvent event)
	{
		if (event.phase == event.phase.START)
		{
			
		}
		if (event.phase == event.phase.END)
		{
			
		}
	}
	
	@SubscribeEvent
	public void PlayerTickEvent(TickEvent.PlayerTickEvent event)
	{
		if (event.phase == event.phase.START)
		{
			
		}
		if (event.phase == event.phase.END)
		{
			
		}
	}
	
	public static ConcurrentHashMap<EntityPlayer, Boolean> ForwardMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Boolean> BackwardMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Boolean> LeftMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Boolean> RightMap = new ConcurrentHashMap();

	public static ConcurrentHashMap<EntityPlayer, Integer> ShieldHealthMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Boolean> ShieldRechargingMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Long> ShieldRechargeDelayMap = new ConcurrentHashMap();
	public static final int SHIELD_MAX_HEALTH = 20;
	public static final Long SHIELD_RECHARGE_DELAY_HURT = 4000L;
	public static final Long SHIELD_RECHARGE_DELAY_INC = 150L;

	public static void CommonTickEnd()
	{
		Iterator it = ShieldRechargeDelayMap.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<EntityPlayer, Long> entry = (Entry<EntityPlayer, Long>)it.next();
			if (!TickHandler.ShieldHealthMap.containsKey(entry.getKey())) {
				it.remove();
				TickHandler.ShieldRechargingMap.remove(entry.getKey());
				continue;
			}
			int health = TickHandler.ShieldHealthMap.get(entry.getKey());
			if (entry.getValue() <= System.currentTimeMillis()) {
				if (health < TickHandler.SHIELD_MAX_HEALTH && HalocraftUtils.isPlayerWearingArmor(entry.getKey(), 0, true, true, true, true))
				{
					TickHandler.ShieldHealthMap.put(entry.getKey(), new Integer(++health));
					entry.setValue(System.currentTimeMillis() + TickHandler.SHIELD_RECHARGE_DELAY_INC - 20L);
					if (!TickHandler.ShieldRechargingMap.containsKey(entry.getKey()) || TickHandler.ShieldRechargingMap.get(entry.getKey()) == false || health % (TickHandler.SHIELD_MAX_HEALTH*0.2) == 0)
						Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entry.getKey()), health == TickHandler.SHIELD_MAX_HEALTH ? false : true), (EntityPlayerMP)entry.getKey());
					TickHandler.ShieldRechargingMap.put(entry.getKey(), new Boolean(true));
				}
				else {
					TickHandler.ShieldRechargingMap.put(entry.getKey(), new Boolean(false));
				}
			}
		}
		
	}
}

