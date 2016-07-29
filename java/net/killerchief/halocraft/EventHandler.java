package net.killerchief.halocraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.killerchief.halocraft.comm.packetHandlers.PacketOvershield;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.EntityClientEntityArrowIndicator;
import net.killerchief.halocraft.entities.vehicles.EntityBanshee;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityTurretSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.halocraft.items.ItemEnergySword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
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
	public void attackEntityEvent(AttackEntityEvent event)
	{
		if (event.entityPlayer != null)
		{
			if (event.entityPlayer.ridingEntity instanceof EntityGhost || event.entityPlayer.ridingEntity instanceof EntityTurretSeat || event.entityPlayer.ridingEntity instanceof EntityWarthog || event.entityPlayer.ridingEntity instanceof EntityBanshee)
			{
				event.setCanceled(true);
			}
		}
	}
	
	@SubscribeEvent
	public void playerInteractEvent(PlayerInteractEvent event)
	{
		if (event.entityPlayer != null)
		{
			if (event.entityPlayer.ridingEntity instanceof EntityGhost || event.entityPlayer.ridingEntity instanceof EntityTurretSeat || event.entityPlayer.ridingEntity instanceof EntityWarthog || event.entityPlayer.ridingEntity instanceof EntityBanshee)
			{	// && event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK)//(event.action == PlayerInteractEvent.Action.RIGHT_CLICK_AIR || event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK))
				event.setCanceled(true);
			}
		}
	}
	
	private int headCooldown = 0;
	
	public static List<EntityClientEntityArrowIndicator> TeamArrowList = new ArrayList<EntityClientEntityArrowIndicator>();
	
	@SubscribeEvent
	public void playerEvent(PlayerEvent event)
	{
		EntityPlayer entityplayer = event.entityPlayer;
		
		if (Halocraft.proxy.isSideClient() && entityplayer != null) {
			
			if (Halocraft.proxy.getClientWorld() != null && entityplayer instanceof EntityOtherPlayerMP && entityplayer.isEntityAlive() && entityplayer.getCommandSenderName() != null) {
				Scoreboard s2 = Halocraft.proxy.getClientWorld().getScoreboard();
				ScorePlayerTeam local = s2.getPlayersTeam(Minecraft.getMinecraft().getSession().getUsername());
				ScorePlayerTeam remote = s2.getPlayersTeam(entityplayer.getCommandSenderName());
				if (local != null) {
					boolean tracked = false;
					int i = 0;
					while (i < TeamArrowList.size()) {
						EntityClientEntityArrowIndicator entity = TeamArrowList.get(i);
						
						if (entity == null || entity.isDead) {
							TeamArrowList.remove(i);
							continue;
						}
						if (entity.Target == entityplayer) {
							if (!local.isSameTeam(remote))
							{
								entity.setDead();
								TeamArrowList.remove(i);
								continue;
							}
							tracked = true;
							break;
						}
						i++;
					}
					if (!tracked && local.isSameTeam(remote)) {
						EntityClientEntityArrowIndicator tracker = new EntityClientEntityArrowIndicator(Halocraft.proxy.getClientWorld(), entityplayer, entityplayer.posX, entityplayer.posY, entityplayer.posZ);
						Halocraft.proxy.getClientWorld().spawnEntityInWorld(tracker);
						TeamArrowList.add(tracker);
					}
				} else {
					while (TeamArrowList.size() > 0) {
						EntityClientEntityArrowIndicator entity = TeamArrowList.get(0);
						entity.setDead();
						TeamArrowList.remove(0);
					}
				}
			}
			
			if (HalocraftConfig.ShowDevPerks && !entityplayer.isDead && !entityplayer.isInvisible())
			{
				Minecraft mc = Minecraft.getMinecraft();
				if (!mc.isGamePaused() && this.headCooldown-- <= 0)
				{
					this.headCooldown = 4;
					if (HalocraftUtils.isHcDevTeamMember(entityplayer.getDisplayName()))
					{
						if (!mc.getSession().getUsername().equals(entityplayer.getDisplayName()) || (mc.getSession().getUsername().equals(entityplayer.getDisplayName()) && mc.gameSettings.thirdPersonView != 0))// && entityplayer.posY % 1 != 0)
						{
							double yaw = Math.toRadians(entityplayer.rotationYawHead);
							double pitch = Math.toRadians(entityplayer.rotationPitch);
							double a = Math.sin(pitch)*0.6D*-Math.sin(yaw);
							double c = Math.sin(pitch)*0.6D*Math.cos(yaw);
							double b = Math.cos(pitch)/4D;
							double x = entityplayer.posX+a+entityplayer.worldObj.rand.nextDouble()/2D-0.25D;
							double z = entityplayer.posZ+c+entityplayer.worldObj.rand.nextDouble()/2D-0.25D;
							double y = entityplayer.boundingBox.maxY+b-0.15D+entityplayer.worldObj.rand.nextDouble()/10D;
							Halocraft.proxy.ParticleFX(3, entityplayer.worldObj, x, y, z, entityplayer.motionX/10D, entityplayer.motionY/10D, entityplayer.motionZ/10D);
						}
					}
				}
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
						entityplayermp.worldObj.playSoundAtEntity(entityplayermp, Halocraft.MODID+":weapons.EnergySwordDeactivate", 0.8F, 1.0F);
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
