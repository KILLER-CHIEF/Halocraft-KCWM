package net.killerchief.halocraft;

import java.util.HashMap;
import java.util.Map.Entry;

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
	
	public static HashMap<EntityPlayer, Boolean> ForwardMap = new HashMap();
	public static HashMap<EntityPlayer, Boolean> BackwardMap = new HashMap();
	public static HashMap<EntityPlayer, Boolean> LeftMap = new HashMap();
	public static HashMap<EntityPlayer, Boolean> RightMap = new HashMap();

	public static HashMap<EntityPlayer, Integer> ShieldHealthMap = new HashMap();
	public static HashMap<EntityPlayer, Boolean> ShieldRechargingMap = new HashMap();
	public static HashMap<EntityPlayer, Integer> ShieldRechargeDelayMap = new HashMap();
	public static final int ShieldMaxHealth = 50;
	
	private static int slowRecharge = 0;

	public static void CommonTickEnd()
	{
		for (Entry<EntityPlayer, Integer> entry : TickHandler.ShieldRechargeDelayMap.entrySet())
		{
			if (HalocraftUtils.isPlayerWearingArmor(entry.getKey(), 0, true, true, true, true))
			{
				if (entry.getValue() > 0)
				{
					entry.setValue(entry.getValue() - 1);
				}
				if (entry.getValue() <= 0 && TickHandler.ShieldHealthMap.containsKey(entry.getKey()))
				{
					if (TickHandler.ShieldHealthMap.get(entry.getKey()) < TickHandler.ShieldMaxHealth)
					{
						if (slowRecharge++ > 2)
						{
							TickHandler.ShieldHealthMap.put(entry.getKey(), new Integer(TickHandler.ShieldHealthMap.get(entry.getKey()) + 1));
							slowRecharge = 0;
						}
						if (!TickHandler.ShieldRechargingMap.containsKey(entry.getKey()))
						{
							TickHandler.ShieldRechargingMap.put(entry.getKey(), new Boolean(false));
						}
						if (TickHandler.ShieldRechargingMap.get(entry.getKey()) == false)
						{
							TickHandler.ShieldRechargingMap.put(entry.getKey(), new Boolean(true));
							Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entry.getKey()), true), (EntityPlayerMP)entry.getKey());
						}
						else
						{
							int health = TickHandler.ShieldHealthMap.get(entry.getKey());
							if (health == (TickHandler.ShieldMaxHealth*0.1) || health == (TickHandler.ShieldMaxHealth*0.2) || health == (TickHandler.ShieldMaxHealth*0.3) || health == (TickHandler.ShieldMaxHealth*0.4) || health == (TickHandler.ShieldMaxHealth*0.5) || health == (TickHandler.ShieldMaxHealth*0.6) || health == (TickHandler.ShieldMaxHealth*0.7) || health == (TickHandler.ShieldMaxHealth*0.8) || health == (TickHandler.ShieldMaxHealth*0.9))
							{
								Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entry.getKey()), true), (EntityPlayerMP)entry.getKey());
							}
						}
						//System.out.println("IncrementingHealthServer");
					}
				}
				if (TickHandler.ShieldRechargingMap.containsKey(entry.getKey()) && TickHandler.ShieldRechargingMap.get(entry.getKey()) == true && TickHandler.ShieldHealthMap.containsKey(entry.getKey()) && TickHandler.ShieldHealthMap.get(entry.getKey()) >= TickHandler.ShieldMaxHealth)
				{
					Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entry.getKey()), true), (EntityPlayerMP)entry.getKey());
					TickHandler.ShieldRechargingMap.put(entry.getKey(), new Boolean(false));
				}
			}
		}
	}
}

