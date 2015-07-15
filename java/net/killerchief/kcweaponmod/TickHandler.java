package net.killerchief.kcweaponmod;

import java.util.HashMap;
import java.util.Map.Entry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
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
			this.performShootAndReload();
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

	public static HashMap<EntityPlayer, Integer> ShootDelayMap = new HashMap();
	public static HashMap<EntityPlayer, Integer> ReloadDelayMap = new HashMap();

	static void performShootAndReload()
	{
		for (Entry<EntityPlayer, Integer> entry : TickHandler.ShootDelayMap.entrySet())
		{
			if (entry.getValue() > 0)
			{
				entry.setValue(entry.getValue() - 1);
			}
		}
		for (Entry<EntityPlayer, Integer> entry : TickHandler.ReloadDelayMap.entrySet())
		{
			if (entry.getValue() > 0)
			{
				entry.setValue(entry.getValue() - 1);
				if (entry.getKey().inventory.player.inventory.getCurrentItem() == null)//XXX: Local Player's inventory is null after death in sp. (EntityPlayerMP issue?)
				{
					TickHandler.ReloadDelayMap.put(entry.getKey(), new Integer(0));
					KCWeaponMod.network.sendTo(new PacketReload(0, 0), (EntityPlayerMP)entry.getKey());
				}
				if (entry.getValue() == 1 && entry.getKey().inventory.getCurrentItem() != null)
				{
					//System.out.println("Reached Last Tick");
					int Used = 0;
					int Needed = entry.getKey().inventory.getCurrentItem().getItemDamage();
					Item item = entry.getKey().inventory.getCurrentItem().getItem();
					if (item instanceof ItemWeapon)
					{
						ItemWeapon weapon = (ItemWeapon)item;
						if (!entry.getKey().capabilities.isCreativeMode)
						{
							int Amount = 0;
							/*for(int i = 0; i <= entry.getKey().inventory.mainInventory.length; i++) { //TODO: Delete old
								if(entry.getKey().inventory.getStackInSlot(i) != null) {
									if(entry.getKey().inventory.getStackInSlot(i).getItem() == weapon.Properties.AmmoType.getItem()) {
										Amount += entry.getKey().inventory.getStackInSlot(i).stackSize;
									}
								}
							}*/
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

						if (weapon.Properties.ReloadMaxAmmoFlow <= 0)
						{
							KCWeaponMod.network.sendTo(new PacketReload(1, Used), (EntityPlayerMP)entry.getKey());
							//System.out.println("Reloaded");
						} else {
							if (entry.getKey().inventory.getCurrentItem().isItemDamaged())
							{
								TickHandler.ReloadDelayMap.put(entry.getKey(), new Integer(weapon.Properties.ReloadTimeLoop > 0 ? weapon.Properties.ReloadTimeLoop : 1));
								KCWeaponMod.network.sendTo(new PacketReload(2, Used), (EntityPlayerMP)entry.getKey());
								if (entry.getKey().inventory.getCurrentItem().getItemDamage() == 1) {
									entry.getKey().worldObj.playSoundAtEntity(entry.getKey(), weapon.Properties.ReloadSoundExit, 1.0F, 1.0F);
								} else {
									entry.getKey().worldObj.playSoundAtEntity(entry.getKey(), weapon.Properties.ReloadSoundLoop, 1.0F, 1.0F);
								}
								//System.out.println("Inserting Rounds");
							} else {
								KCWeaponMod.network.sendTo(new PacketReload(1, Used), (EntityPlayerMP)entry.getKey());
								//System.out.println("Reloaded Shotgun");
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
			else
			{
				TickHandler.ReloadDelayMap.remove(entry.getKey());
				//System.out.println("Remove");
			}
		}
	}
}
