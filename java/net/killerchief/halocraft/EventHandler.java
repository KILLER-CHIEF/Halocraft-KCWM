package net.killerchief.halocraft;

import java.util.HashMap;

import net.killerchief.halocraft.comm.packetHandlers.PacketOvershield;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityTurretSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.halocraft.items.ItemEnergySword;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

	@SubscribeEvent
	public void LivingDeathEvent(LivingDeathEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entity;

			TickHandler.ShieldHealthMap.remove(player);
			TickHandler.ShieldRechargeDelayMap.remove(player);
		}
	}

	@SubscribeEvent
	public void playerInteractEvent(PlayerInteractEvent event)
	{
		if (event.entityPlayer != null)
		{
			if (event.entityPlayer.ridingEntity instanceof EntityGhost || event.entityPlayer.ridingEntity instanceof EntityTurretSeat || event.entityPlayer.ridingEntity instanceof EntityWarthog)
			{	// && event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK)//(event.action == PlayerInteractEvent.Action.RIGHT_CLICK_AIR || event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK))
				event.setCanceled(true);
			}
		}
	}

	private int stopAimingCoolDown = 0;

	@SubscribeEvent
	public void livingEventClient(LivingEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer entityplayer = (EntityPlayer) event.entityLiving;

			if (Halocraft.proxy.isSideClient())
			{
				if (entityplayer.getHeldItem() != null && entityplayer.getHeldItem().getItem() instanceof ItemEnergySword)
				{
					HalocraftUtils.setItemInUseCount(entityplayer, 71005);
					
					if (stopAimingCoolDown != 4)
					{
						stopAimingCoolDown = 4;
					}
				}
				else
				{
					if (stopAimingCoolDown > 0)
					{
						HalocraftUtils.setItemInUseCount(entityplayer, 0);
						--stopAimingCoolDown;
					}
				}
			}
		}
	}

	//These cause an InstantiationException on mod load fyi
	/*@SubscribeEvent
	public void livingEventClient(RenderHandEvent event)
	{
		//event.setCanceled(true);
	}

	@SubscribeEvent
	public void livingEventClient(RenderPlayerEvent.Specials.Pre event)
	{
		//event.renderer.modelBipedMain.aimedBow = false;
		//event.renderer.modelBipedMain.isSneak = true;
		//event.renderer.modelBipedMain.isSneak = true;
		//event.renderer.modelBipedMain.bipedLeftArm.rotateAngleX = 20F;
		//event.setCanceled(true);
	}

	@SubscribeEvent
	public void livingEventClient(RenderPlayerEvent.Specials event)
	{
		//event.setCanceled(true);
		//event.renderer.modelBipedMain.isSneak = true;
	}

	@SubscribeEvent
	public void livingEventClient(RenderPlayerEvent.Specials.Post event)
	{
		//event.setCanceled(true);
		//event.renderer.modelBipedMain.aimedBow = false;
		//event.renderer.modelBipedMain.bipedRightArm.isHidden = true;
		//event.renderer.modelBipedMain.bipedLeftArm.rotateAngleZ = 1.5F;
		//event.renderer.modelBipedMain.isSneak = true;
	}*/
	
	public static HashMap<EntityPlayer, Float> PlayerMPMoveSpeed = new HashMap();
	public static HashMap<EntityPlayer, Float> PlayerMPStepHeight = new HashMap();
	
	private void HandleArmourAbilities(EntityPlayer entityplayer)
	{
		if (HalocraftUtils.isPlayerWearingArmor(entityplayer, 0, false, true, true, true))
		{
			if (entityplayer.capabilities.getWalkSpeed() < 0.12F)
			{
				PlayerMPMoveSpeed.put(entityplayer, entityplayer.capabilities.getWalkSpeed());
				HalocraftUtils.MoveSpeedMP(entityplayer, 0.12F);
			}
			if (entityplayer.stepHeight < 1F)
			{
				PlayerMPStepHeight.put(entityplayer, entityplayer.stepHeight);
				entityplayer.stepHeight = 1F;
			}
			entityplayer.jumpMovementFactor = 0.03F;
		}else{
			if (PlayerMPMoveSpeed.containsKey(entityplayer))
			{
				HalocraftUtils.MoveSpeedMP(entityplayer, PlayerMPMoveSpeed.get(entityplayer)); //0.1F
				PlayerMPMoveSpeed.remove(entityplayer);
			}
			if (PlayerMPStepHeight.containsKey(entityplayer))
			{
				entityplayer.stepHeight = PlayerMPStepHeight.get(entityplayer); //0.5F;
				PlayerMPStepHeight.remove(entityplayer);
			}
		}
	}
	
	@SubscribeEvent
	public void livingJumpEvent(LivingJumpEvent event)
	{
		if (!(event.entityLiving instanceof EntityPlayer)) {
			return;
		}
		EntityPlayer entityplayer = (EntityPlayer) event.entityLiving;
		
		if (HalocraftUtils.isPlayerWearingArmor(entityplayer, 0, false, true, true, true))
		{
			//TODO: Armour Jump: mc.theWorld.provider.dimensionId
			entityplayer.motionY += 0.3D;
		}
		else if (HalocraftUtils.isPlayerWearingArmor(entityplayer, 1, false, true, true, true))
		{
			entityplayer.motionY += 0.17D;
		}
	}

	@SubscribeEvent
	public void livingEvent(LivingEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer) {
			HandleArmourAbilities((EntityPlayer)event.entityLiving);
		}
		if (!(event.entityLiving instanceof EntityPlayerMP)) {
			return;
		}
		EntityPlayerMP entityplayermp = (EntityPlayerMP) event.entityLiving;
		
		if(entityplayermp.inventory != null && entityplayermp.inventory.mainInventory != null && entityplayermp.inventory.hasItem(HalocraftItemsWeapons.EnergySword))
		{
			int i = 0;
			while (i < entityplayermp.inventory.mainInventory.length)
			{
				if (entityplayermp.inventory.currentItem != i)
				{
					//System.out.println("Checking " + i + " Stack");
					if (entityplayermp.inventory.mainInventory[i] != null && entityplayermp.inventory.mainInventory[i].getItem() == HalocraftItemsWeapons.EnergySword)
					{
						//System.out.println("Swapping");
						entityplayermp.inventory.setInventorySlotContents(i, new ItemStack(HalocraftItems.SwordHilt, 1, entityplayermp.inventory.getStackInSlot(i).getItemDamage()));
					}
				}
				i++;
			}
		}

		if (HalocraftUtils.isPlayerWearingArmor(entityplayermp, 0, true, true, false, false) || HalocraftUtils.isPlayerWearingArmor(entityplayermp, 1, true, true, false, false))
		{
			if (event.entityLiving.getAir() < 300)
				event.entityLiving.setAir(300);
		}

		if (HalocraftUtils.isPlayerWearingArmor(entityplayermp, 0, true, true, true, true) || HalocraftUtils.isPlayerWearingArmor(entityplayermp, 1, true, true, true, true))
		{
			if (event.entityLiving.isBurning())
				event.entityLiving.extinguish();
		}
	}

	@SubscribeEvent
	public void livingFall(LivingFallEvent event) {
		if (!(event.entityLiving instanceof EntityPlayerMP)) {
			return;
		}

		EntityPlayerMP entityplayermp = (EntityPlayerMP) event.entityLiving;

		if (HalocraftUtils.isPlayerWearingArmor(entityplayermp, 0, false, true, true, true) || HalocraftUtils.isPlayerWearingArmor(entityplayermp, 1, false, true, true, true))
			event.distance = 0F;
	}

	@SubscribeEvent
	public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayerMP)
		{
			EntityPlayerMP entityplayermp = (EntityPlayerMP)event.entity;
			//System.out.println("Adding Player!");

			TickHandler.ShieldHealthMap.put(entityplayermp, new Integer(0));
			TickHandler.ShieldRechargeDelayMap.put(entityplayermp, new Integer(0));
		}
	}

	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event)//GuiIngame has stuff to do with dragon health rendering and pumpkin blur
	{
		if (!(event.entityLiving instanceof EntityPlayerMP)) {
			return;
		}

		EntityPlayerMP entityplayermp = (EntityPlayerMP) event.entityLiving;

		if (HalocraftUtils.isPlayerWearingArmor(entityplayermp, 0, true, true, true, true))
		{
			if (!TickHandler.ShieldHealthMap.containsKey(entityplayermp))
			{
				TickHandler.ShieldHealthMap.put(entityplayermp, new Integer(0));
			}
			if (!TickHandler.ShieldRechargeDelayMap.containsKey(entityplayermp))
			{
				TickHandler.ShieldRechargeDelayMap.put(entityplayermp, new Integer(0));
			}
			//System.out.println("Processing");
			if (TickHandler.ShieldHealthMap.get(entityplayermp) <= 0)
			{
				TickHandler.ShieldRechargeDelayMap.put(entityplayermp, new Integer(140));
				//System.out.println("Hurt");
				Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entityplayermp), false), entityplayermp);
			}
			else
			{
				if (TickHandler.ShieldHealthMap.get(entityplayermp) < event.ammount)
				{
					TickHandler.ShieldRechargeDelayMap.put(entityplayermp, new Integer(140));
					event.ammount -= TickHandler.ShieldHealthMap.get(entityplayermp);
					TickHandler.ShieldHealthMap.put(entityplayermp, new Integer(0));
					//System.out.println("Lost Shields");
					Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entityplayermp), false), entityplayermp);
					event.entityLiving.worldObj.playSoundAtEntity(event.entityLiving, Halocraft.MODID+":armour.ShieldPop", 1.0F, 1.0F);
				}
				else
				{
					TickHandler.ShieldRechargeDelayMap.put(entityplayermp, new Integer(140));
					TickHandler.ShieldHealthMap.put(entityplayermp, new Integer((int)(TickHandler.ShieldHealthMap.get(entityplayermp) - event.ammount)));
					//if (event.isCancelable())
					//{
					//	event.setCanceled(true);
					//}
					event.ammount = 0;
					//System.out.println("Shielded");
					Halocraft.network.sendTo(new PacketOvershield(TickHandler.ShieldHealthMap.get(entityplayermp), false), entityplayermp);
					if (TickHandler.ShieldHealthMap.get(entityplayermp) <= 0)
						event.entityLiving.worldObj.playSoundAtEntity(event.entityLiving, Halocraft.MODID+":armour.ShieldPop", 1.0F, 1.0F);
					else
						event.entityLiving.worldObj.playSoundAtEntity(event.entityLiving, Halocraft.MODID+":armour.ShieldHit", 1.0F, 1.0F);
				}
			}
		}
	}

	//FIXME: remove?
	//Not the original (HalocraftHelper)
	/*public static boolean isPlayerWearingArmor23(EntityPlayer player, int armorType, boolean helmet, boolean body, boolean legs, boolean boots)
	{
		boolean notfail = true;
		if (player.inventory != null && player.inventory.armorInventory != null)
		{
			if (helmet && notfail)
			{
				if (player.inventory.armorInventory[3] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.ReconHelmet || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVIHelmetGreen || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetBlack || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetGreen || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetBlue || player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarkVHelmetRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.ODSTHelmet))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[3].getItem() == HalocraftItemsArmor.MarineHelmet))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (body && notfail)
			{
				if (player.inventory.armorInventory[2] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.ReconBody || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVIBodyGreen || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyBlack || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyGreen || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyBlue || player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarkVBodyRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.ODSTBody))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[2].getItem() == HalocraftItemsArmor.MarineBody))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (legs && notfail)
			{
				if (player.inventory.armorInventory[1] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.ReconLegs || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVILegsGreen || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsBlack || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsGreen || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsBlue || player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarkVLegsRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.ODSTLegs))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[1].getItem() == HalocraftItemsArmor.MarineLegs))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
			if (boots && notfail)
			{
				if (player.inventory.armorInventory[0] == null)
					notfail = false;
				else
					if (armorType == 0) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.ReconBoots || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVIBootsGreen || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsBlack || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsGreen || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsBlue || player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarkVBootsRed))
							notfail = false;
					}
					else if (armorType == 1) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.ODSTBoots))
							notfail = false;
					}
					else if (armorType == 2) {
						if (!(player.inventory.armorInventory[0].getItem() == HalocraftItemsArmor.MarineBoots))
							notfail = false;
					}
					else {
						notfail = false;
					}
			}
		}
		return notfail;
	}*/

	/*@SubscribeEvent
    public void onConfigChanged(OnConfigChangedEvent event)
    {
        if (getMetadata().modId.equals(event.modID) && !event.isWorldRunning)
        {
            if (Configuration.CATEGORY_GENERAL.equals(event.configID))
            {
                syncConfig(false);
            }
        }
    }*/

}
