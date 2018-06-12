package net.killerchief.kcweaponmod;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

	private int fieldIndex = 0;
	private long heldTime = 0;

	private boolean keyPressed(Object keyBinding) {
		if (KCWeaponMod.proxy.isSideClient()) {
			KeyBinding key = (KeyBinding) keyBinding;
			if (System.currentTimeMillis() - heldTime > 800L && key.getIsKeyPressed()) {
				heldTime = System.currentTimeMillis() - 780L;
				return true;
			}
			return key.isPressed();
		}
		return false;
	}

	@SubscribeEvent
	public void onRenderGui(RenderGameOverlayEvent.Post event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		if ((mc.inGameHasFocus || (mc.currentScreen != null && mc.currentScreen instanceof GuiChat)) && 
				mc.thePlayer.inventory.getCurrentItem() != null && mc.thePlayer.inventory.getCurrentItem().getItem() instanceof InterfaceWeaponProperties && ((InterfaceWeaponProperties)mc.thePlayer.inventory.getCurrentItem().getItem()).Properties().WeaponModel != null)
		{
			ItemWeaponModel weaponModel = ((InterfaceWeaponProperties)mc.thePlayer.inventory.getCurrentItem().getItem()).Properties().WeaponModel;
			if (KCWeaponMod.EnableInGameWeaponModelTweeks) {
				ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
				int width = scaled.getScaledWidth();
				int height = scaled.getScaledHeight();

				String fieldName = ItemWeaponModel.fieldNames[fieldIndex];

				Field field = null;
				try {
					field = ItemWeaponModel.class.getDeclaredField(ItemWeaponModel.fieldNames[fieldIndex]);
				} catch (Exception e) { }

				if (KeyBindings.weapModelFieldUp.getIsKeyPressed() || KeyBindings.weapModelFieldDown.getIsKeyPressed()) {

				} else {
					heldTime = System.currentTimeMillis();
				}

				if (KeyBindings.weapModelFieldNext.isPressed()) {
					fieldIndex++;
				}
				else if (KeyBindings.weapModelFieldPrev.isPressed()) {
					fieldIndex--;
				}
				else if (field != null) {
					mc.fontRenderer.drawString("Editing:", 100, 10, 0xff0000);
					mc.fontRenderer.drawString(fieldName, 140, 10, 0xff0000);
					if (field.getType().isAssignableFrom(Float.TYPE)) {
						try {
							float amount = 0.01F;
							if (fieldName.toLowerCase().contains("rotate")) {
								amount = 0.5F;
							}
							if (keyPressed(KeyBindings.weapModelFieldUp)) {
								field.set(weaponModel, field.getFloat(weaponModel)+amount);
							} else if (keyPressed(KeyBindings.weapModelFieldDown)) {
								field.set(weaponModel, field.getFloat(weaponModel)-amount);
							}
						} catch (Exception e) { }
					} else if (field.getType().isAssignableFrom(Boolean.TYPE)) {
						if (KeyBindings.weapModelFieldUp.isPressed() || KeyBindings.weapModelFieldDown.isPressed()) {
							try {
								field.set(weaponModel, !field.getBoolean(weaponModel));
							} catch (Exception e) { }
						}
					}
				}

				if (fieldIndex >= ItemWeaponModel.fieldNames.length) {
					fieldIndex = 0;
				} else if (fieldIndex < 0) {
					fieldIndex = ItemWeaponModel.fieldNames.length - 1;
				}

				mc.fontRenderer.drawString("Model Glows", 10, height-60, 0xff0000);
				mc.fontRenderer.drawString(""+weaponModel.Glows, 10, height-50, 0xff0000);

				mc.fontRenderer.drawString("No Change on Sprint", 10, height-30, 0xff0000);
				mc.fontRenderer.drawString(""+weaponModel.NoChngOnSprint, 10, height-20, 0xff0000);


				mc.fontRenderer.drawString("FP Scale", 10, 10, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.FPScaleX+" : "+weaponModel.FPScaleY+" : "+weaponModel.FPScaleZ, 10, 20, 0xff0000);

				mc.fontRenderer.drawString("FP Translate", 10, 40, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.FPTransX+" : "+weaponModel.FPTransY+" : "+weaponModel.FPTransZ, 10, 50, 0xff0000);
				
				mc.fontRenderer.drawString("FP Rotate", 10, 70, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.FPRotateX+" : "+weaponModel.FPRotateY+" : "+weaponModel.FPRotateZ, 10, 80, 0xff0000);
				
				mc.fontRenderer.drawString("FP Sprint Translate", 10, 100, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.FPSprintTransX+" : "+weaponModel.FPSprintTransY+" : "+weaponModel.FPSprintTransZ, 10, 110, 0xff0000);

				mc.fontRenderer.drawString("FP Sprint Rotate", 10, 130, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.FPSprintRotateX+" : "+weaponModel.FPSprintRotateY+" : "+weaponModel.FPSprintRotateZ, 10, 140, 0xff0000);


				mc.fontRenderer.drawString("TP Scale", width-210, 10, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.TPScaleX+" : "+weaponModel.TPScaleY+" : "+weaponModel.TPScaleZ, width-210, 20, 0xff0000);
				
				mc.fontRenderer.drawString("TP Translate", width-210, 40, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.TPTransX+" : "+weaponModel.TPTransY+" : "+weaponModel.TPTransZ, width-210, 50, 0xff0000);

				mc.fontRenderer.drawString("TP Rotate", width-210, 70, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.TPRotateX+" : "+weaponModel.TPRotateY+" : "+weaponModel.TPRotateZ, width-210, 80, 0xff0000);
				
				mc.fontRenderer.drawString("TP Sprint Translate", width-210, 100, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.TPSprintTransX+" : "+weaponModel.TPSprintTransY+" : "+weaponModel.TPSprintTransZ, width-210, 110, 0xff0000);

				mc.fontRenderer.drawString("TP Sprint Rotate", width-210, 130, 0xff0000);
				mc.fontRenderer.drawString(weaponModel.TPSprintRotateX+" : "+weaponModel.TPSprintRotateY+" : "+weaponModel.TPSprintRotateZ, width-210, 140, 0xff0000);
			}
		} else {
			while (KeyBindings.weapModelFieldPrev.isPressed()) {}
			while (KeyBindings.weapModelFieldNext.isPressed()) {}
			while (KeyBindings.weapModelFieldUp.isPressed()) {}
			while (KeyBindings.weapModelFieldDown.isPressed()) {}
		}
	}

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

	private int stopAimingCoolDown = 0;//FIXMe: player dependent?
	private static Map<String, Integer> playerStopAimingCoolDown = new HashMap<String, Integer>();

	@SubscribeEvent
	public void livingEventClient(LivingEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer entityplayer = (EntityPlayer) event.entityLiving;

			if (KCWeaponMod.proxy.isSideClient())
			{
				if (entityplayer.getHeldItem() != null && (entityplayer.getHeldItem().getItem() instanceof InterfaceWeaponProperties && ((InterfaceWeaponProperties)entityplayer.getHeldItem().getItem()).Properties().AimItem))
				{
					if ((!entityplayer.isSprinting() || (entityplayer.getHeldItem().getItem() instanceof InterfaceWeaponProperties && ((InterfaceWeaponProperties)entityplayer.getHeldItem().getItem()).Properties().WeaponModel != null && ((InterfaceWeaponProperties)entityplayer.getHeldItem().getItem()).Properties().WeaponModel.NoChngOnSprint)) && !(entityplayer.getHeldItem().getItem() instanceof InterfaceWeaponProperties && ((InterfaceWeaponProperties)entityplayer.getHeldItem().getItem()).doLoweredWeapon()))
					{
						//System.out.println("T1");
						KCUtils.setItemInUseCount(entityplayer, 71005);
					}
					else
					{
						//System.out.println("T2");
						KCUtils.setItemInUseCount(entityplayer, 0);
					}
					playerStopAimingCoolDown.put(entityplayer.getCommandSenderName(), 4);
					
//					if (stopAimingCoolDown != 4)
//					{
//						stopAimingCoolDown = 4;
//					}
				}
				else
				{
					if (!playerStopAimingCoolDown.containsKey(entityplayer.getCommandSenderName())) {
						playerStopAimingCoolDown.put(entityplayer.getCommandSenderName(), 0);
					}
					if (playerStopAimingCoolDown.get(entityplayer.getCommandSenderName()) > 0) {
						KCUtils.setItemInUseCount(entityplayer, 0);
						//System.out.println("T3");
						playerStopAimingCoolDown.put(entityplayer.getCommandSenderName(), playerStopAimingCoolDown.get(entityplayer.getCommandSenderName())-1);
					}
//					if (stopAimingCoolDown > 0)
//					{
//						System.out.println("T3");
//						KCUtils.setItemInUseCount(entityplayer, 0);
//						--stopAimingCoolDown;
//					}
				}
			}
		}
	}
}
