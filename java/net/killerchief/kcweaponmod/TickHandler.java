package net.killerchief.kcweaponmod;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class TickHandler {

	@SubscribeEvent
	public void ServerTickEvent(TickEvent.ServerTickEvent event)
	{
		if (event.phase == event.phase.START){}
		else if (event.phase == event.phase.END)
		{
			this.performShootAndReload();
		}
	}

	@SubscribeEvent
	public void WorldTickEvent(TickEvent.WorldTickEvent event)
	{
		if (event.phase == event.phase.START){}
		else if (event.phase == event.phase.END){}
	}

	@SubscribeEvent
	public void PlayerTickEvent(TickEvent.PlayerTickEvent event)
	{
		if (event.phase == event.phase.START){}
		else if (event.phase == event.phase.END){}
	}

	public static ConcurrentHashMap<EntityPlayer, Long> ShootDelayMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Long> ReloadDelayMap = new ConcurrentHashMap();
	public static ConcurrentHashMap<EntityPlayer, Object[]> EntityTargetingMap = new ConcurrentHashMap();

	static void performShootAndReload()
	{
		Iterator it = EntityTargetingMap.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<EntityPlayer, Object[]> entry = (Entry<EntityPlayer, Object[]>)it.next();
			if ((Long)entry.getValue()[0] < System.currentTimeMillis())
			{
				it.remove();
				//System.out.println("Removed");
			}
		}
		
		it = ShootDelayMap.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<EntityPlayer, Long> entry = (Entry<EntityPlayer, Long>)it.next();
			if (entry.getValue() < System.currentTimeMillis()) {
				it.remove();
				//System.out.println("Removed");
			}
		}
		
		it = ReloadDelayMap.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<EntityPlayer, Long> entry = (Entry<EntityPlayer, Long>)it.next();
			if (entry.getValue() > System.currentTimeMillis())
			{
				if (entry.getKey().inventory.player.inventory.getCurrentItem() == null)//XXX: Local Player's inventory is null after death in sp. (EntityPlayerMP issue?)
				{
					it.remove();
					KCWeaponMod.network.sendTo(new PacketReload(0, 0), (EntityPlayerMP)entry.getKey());
				}
			}
			else
			{
				if (entry.getKey().inventory.getCurrentItem() != null)
				{
					//System.out.println("Reached Last Tick");
					int Amount = 0;
					int Used = 0;
					int Needed = entry.getKey().inventory.getCurrentItem().getItemDamage();
					Item item = entry.getKey().inventory.getCurrentItem().getItem();
					if (item instanceof ItemWeapon)
					{
						ItemWeapon weapon = (ItemWeapon)item;
						if (!entry.getKey().capabilities.isCreativeMode)
						{
							
							if (weapon.Properties.AmmoType != null) {
								for (int i = 0; i < entry.getKey().inventory.mainInventory.length; ++i) {
									if (entry.getKey().inventory.mainInventory[i] != null) {
										if (entry.getKey().inventory.mainInventory[i].getItem() == weapon.Properties.AmmoType.getItem()) {
											Amount += entry.getKey().inventory.mainInventory[i].stackSize;
										}
									}
								}
							}
							if (weapon.Properties.ReloadMaxAmmoFlow <= 0)
							{
								if (Amount >= Needed)
								{
									Used = Needed;
								} else {
									Used = Amount;
								}
							}
							else
							{
								if (Amount >= weapon.Properties.ReloadMaxAmmoFlow)
								{
									Used = weapon.Properties.ReloadMaxAmmoFlow;
								} else {
									Used = Amount;
								}
							}
						}
						else
						{
							Amount = Needed;
							if (weapon.Properties.ReloadMaxAmmoFlow <= 0)
							{
								Used = Needed;
							}
							else
							{
								Used = weapon.Properties.ReloadMaxAmmoFlow;
							}
						}

						entry.getKey().inventory.getCurrentItem().setItemDamage(Needed - Used);

						if (weapon.Properties.ReloadMaxAmmoFlow <= 0) {
							KCWeaponMod.network.sendTo(new PacketReload(1, Used), (EntityPlayerMP)entry.getKey());
							System.out.println("Reloaded in Full.");
							it.remove();
							//System.out.println("Remove");
						}
						else {
							if (Needed <= weapon.Properties.ReloadMaxAmmoFlow || (Needed > 0 && (Used >= Amount || Used <= 0))) {
								KCWeaponMod.network.sendTo(new PacketReload(1, Used), (EntityPlayerMP)entry.getKey());
								System.out.println("Inserted & Reloaded Shotgun");
								it.remove();
								//System.out.println("Remove");
								entry.getKey().worldObj.playSoundAtEntity(entry.getKey(), weapon.Properties.ReloadSoundExit, 1.0F, 1.0F);
							}
							else {
								entry.setValue(System.currentTimeMillis() + (weapon.Properties.ReloadTimeLoop > 0L ? weapon.Properties.ReloadTimeLoop : 100L));
								KCWeaponMod.network.sendTo(new PacketReload(2, Used), (EntityPlayerMP)entry.getKey());
								entry.getKey().worldObj.playSoundAtEntity(entry.getKey(), weapon.Properties.ReloadSoundLoop, 1.0F, 1.0F);
								System.out.println("Inserting Round");
							}
						}

						if (weapon.Properties.AmmoType != null)
						{
							int t = 0;
							while (t < Used)
							{
								entry.getKey().inventory.consumeInventoryItem(weapon.Properties.AmmoType.getItem());
								t++;
							}
						}
					}
				}
				
			}
		}
		
	}
}
