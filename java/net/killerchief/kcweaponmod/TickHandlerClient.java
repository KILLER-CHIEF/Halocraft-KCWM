package net.killerchief.kcweaponmod;

import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.GuiIngameForge;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TickHandlerClient {

	static Minecraft mc = Minecraft.getMinecraft();

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void ClientTickEvent(TickEvent.ClientTickEvent event)
	{
		if (event.phase == event.phase.START){}
		else if (event.phase == event.phase.END)
		{
			GuiScreen guiscreen = mc.currentScreen;

			//clientTicks();
			if (guiscreen != null)
			{
				this.onTickInGUI(mc, guiscreen);
			} else if (!mc.isGamePaused()) {
				this.onTickInGame(mc);

				if (this.shootReloadCodeDelay <= 0)
				{
					TickHandler.performShootAndReload();

					this.shootReloadCodeDelay = 1;
				}
				else
				{
					this.shootReloadCodeDelay--;
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void RenderTickEvent(TickEvent.RenderTickEvent event)
	{
		if (event.phase == event.phase.START){}
		else if (event.phase == event.phase.END)
		{
			if (mc.thePlayer != null)//This is Client Only, ingame
			{
				this.HandleShootingReloading(mc);
				this.HandleBugs(mc);
				this.HandleButtonInterface(mc);
				this.HandleReticle(mc);
				this.HandleZooming(mc);
			}
		}
	}

	public void onTickInGUI(Minecraft minecraft, GuiScreen guiscreen)
	{
		//System.out.println("onTickInGUI");
	}


	//onTickInGame
	public static float Recoil = 0.0F;
	public static float AntiRecoil = 0.0F;

	private int delayTracking = 0;
	private Entity trackedLast = null;
	private int trackLastDelay = 0;

	//client side indicator
	public static Entity TrackingEntity = null;
	public static Long TrackingEntityTime = System.currentTimeMillis();

	private void onTickInGame(Minecraft minecraft)
	{
		if(this.Recoil > 0.0F)
		{
			this.Recoil *= 0.8F;
		}
		if (!(!KCWeaponMod.RecoilInLocalSP && minecraft.isSingleplayer()))
			minecraft.thePlayer.rotationPitch -= this.Recoil;
		this.AntiRecoil += this.Recoil;
		if (!(!KCWeaponMod.RecoilInLocalSP && minecraft.isSingleplayer()))
			minecraft.thePlayer.rotationPitch += AntiRecoil * 0.2F;
		this.AntiRecoil *= 0.78F;


		if (TrackingEntity != null && TrackingEntityTime < System.currentTimeMillis())
		{
			TrackingEntity = null;
		}

		if (minecraft.thePlayer.inventory.getCurrentItem() != null && minecraft.inGameHasFocus)
		{
			Item currentItem = minecraft.thePlayer.inventory.getCurrentItem().getItem();

			if (this.delayTracking-- <= 0)
			{
				this.delayTracking = 8;
				if (!this.mc.thePlayer.isDead && currentItem instanceof InterfaceTracking && ((InterfaceTracking)currentItem).CanTrack())
				{
					InterfaceTracking itemTrack = (InterfaceTracking) currentItem;
					Entity target = getObjectMouseOver(itemTrack.TrackDistance()).entityHit;
					if (target != null && target.isInvisible()) {
						target = null;
					}
					if (target != null)
					{
						if (target == this.trackedLast || itemTrack.TrackDelay() == 0)
						{
							if (itemTrack.TrackType() == 0 || (itemTrack.TrackType() == 1 && target instanceof EntityLiving) || (itemTrack.TrackType() == 2 && !(target instanceof EntityLiving)) || (itemTrack.TrackType() == 3 && !(target instanceof EntityLiving) && target.riddenByEntity != null) )
							{
								if (this.trackLastDelay >= itemTrack.TrackDelay())
								{
									//System.out.println("Tracking");
									TrackingEntity = target;
									TrackingEntityTime = System.currentTimeMillis() + 1000L;
									KCWeaponMod.network.sendToServer(new PacketTargetEntity(target.getEntityId()));
								}
								else
								{
									this.trackLastDelay++;
								}
							}
						}
						else
						{
							this.trackedLast = target;
							this.trackLastDelay = 0;
						}
					}
					else
					{
						if (this.trackLastDelay > 0)
						{
							this.trackLastDelay--;
						}
					}
				}
			}
		}
	}

	/**
	 * Finds what block or object the mouse is over.
	 * @return MovingObjectPosition
	 */
	public static MovingObjectPosition getObjectMouseOver(double distance) //EntityRenderer.getMouseOver(partialTickTime)
	{
		MovingObjectPosition objectMouseOver = null;
		float partialTickTime = 1F;
		if (mc.renderViewEntity != null)
		{
			if (mc.theWorld != null)
			{
				double d0 = distance;
				objectMouseOver = mc.renderViewEntity.rayTrace(d0, partialTickTime);
				double d1 = d0;
				Vec3 vec3 = mc.renderViewEntity.getPosition(partialTickTime);


				if (objectMouseOver != null)
				{
					d1 = objectMouseOver.hitVec.distanceTo(vec3);
				}

				Vec3 vec31 = mc.renderViewEntity.getLook(partialTickTime);
				Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
				Entity pointedEntity = null;
				Vec3 vec33 = null;
				float f1 = 1.0F;
				List list = mc.theWorld.getEntitiesWithinAABBExcludingEntity(mc.renderViewEntity, mc.renderViewEntity.boundingBox.addCoord(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0).expand((double)f1, (double)f1, (double)f1));
				double d2 = d1;

				for (int i = 0; i < list.size(); ++i)
				{
					Entity entity = (Entity)list.get(i);

					if (entity.canBeCollidedWith())
					{
						float f2 = entity.getCollisionBorderSize();
						AxisAlignedBB axisalignedbb = entity.boundingBox.expand((double)f2, (double)f2, (double)f2);
						MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

						if (axisalignedbb.isVecInside(vec3))
						{
							if (0.0D < d2 || d2 == 0.0D)
							{
								pointedEntity = entity;
								vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
								d2 = 0.0D;
							}
						}
						else if (movingobjectposition != null)
						{
							double d3 = vec3.distanceTo(movingobjectposition.hitVec);

							if (d3 < d2 || d2 == 0.0D)
							{
								if (entity == mc.renderViewEntity.ridingEntity && !entity.canRiderInteract())
								{
									if (d2 == 0.0D)
									{
										pointedEntity = entity;
										vec33 = movingobjectposition.hitVec;
									}
								}
								else
								{
									pointedEntity = entity;
									vec33 = movingobjectposition.hitVec;
									d2 = d3;
								}
							}
						}
					}
				}

				if (pointedEntity != null && (d2 < d1 || objectMouseOver == null))
				{
					objectMouseOver = new MovingObjectPosition(pointedEntity, vec33);
				}
			}
		}
		if (objectMouseOver.entityHit != null)
		{
			//System.out.println(objectMouseOver.entityHit.posX);
			//System.out.println(objectMouseOver.entityHit);
		}
		else
		{
			//System.out.println(objectMouseOver.hitVec.xCoord);
		}
		return objectMouseOver;
	}

	//HandleShootingReloading
	public static boolean IsReloading = false;
	private int shootReloadCodeDelay = 0;
	public static Item ReloadingWeapon = null;

	//HandleButtonInterface
	public boolean RightClickPressed = false;
	public boolean PrevRightClickPressed = false;
	public int RightClickHeld = 0;
	private int GunShootDelay = 0;
	private int ChargePlasmaPistol = 0;

	private void HandleButtonInterface(Minecraft minecraft)
	{
		if (this.RightClickPressed == true && this.PrevRightClickPressed == false)
		{
			this.PrevRightClickPressed = true;
		}
		if (this.RightClickPressed && this.PrevRightClickPressed)
		{
			RightClickHeld++;
		}
		else
		{
			RightClickHeld = 0;
		}
		if (this.RightClickPressed == false && this.PrevRightClickPressed == true)
		{
			this.PrevRightClickPressed = false;
		}
		if (minecraft.gameSettings.keyBindUseItem.getIsKeyPressed() && minecraft.inGameHasFocus)
		{
			this.RightClickPressed = true;
			//System.out.println("Pressed");
		}
		else
		{
			this.RightClickPressed = false;
			//System.out.println("Released");
		}



		if (minecraft.thePlayer.inventory.getCurrentItem() != null && minecraft.inGameHasFocus)
		{
			Item currentItem = minecraft.thePlayer.inventory.getCurrentItem().getItem();

			if (GunShootDelay > 0)
			{
				GunShootDelay--;
			}
			else
			{
				if (currentItem instanceof ItemWeapon)
				{
					ItemWeapon weapon = (ItemWeapon)currentItem;
					if (weapon.Properties.IsAutomaticOrHasSecondaryShoot)
					{
						if (weapon.Properties.SecondaryShootHeldDelay > 0)
						{
							if (this.RightClickHeld >= weapon.Properties.SecondaryShootHeldDelay && !this.RightClickPressed && this.PrevRightClickPressed)
							{
								System.out.println("Secondary Shoot");
								KCWeaponMod.network.sendToServer(new PacketShoot(0F, 0, false, false, null, 0));//TODO all Secondary shoot information
								GunShootDelay = weapon.Properties.SecondaryGunShootDelay;
							}
						}
						else
						{
							if (this.RightClickPressed && weapon.Properties.GunShootDelay > 0)
							{
								//System.out.println("Primary Shoot");
								KCWeaponMod.network.sendToServer(new PacketShoot(0F, 0, false, false, null, 0));
								GunShootDelay = weapon.Properties.GunShootDelay;
							}
						}
					}
				}
			}/*
			if (currentItem == HalocraftItemsWeapons.PlasmaPistol)
			{
				if (this.RightClickPressed)
				{
					++this.ChargePlasmaPistol;
				}

				//System.out.println(ChargePlasmaPistol);
				if (this.RightClickPressed == false && this.PrevRightClickPressed == true)
				{
					if (this.ChargePlasmaPistol > 80)
					{
						if (FMLCommonHandler.instance().getEffectiveSide().isClient())//Halocraft.proxy.isSideClient()
						{
							KCWeaponMod.network.sendToServer(new PacketShoot(0F, new ItemStack(HalocraftItems.PlasmaPowerCore), 0, 0));
						}
					} else {
						if (FMLCommonHandler.instance().getEffectiveSide().isClient())
						{
							KCWeaponMod.network.sendToServer(new PacketShoot(0F, null, 0, 0));
						}
					}
				}
				if ((this.RightClickPressed == false && this.PrevRightClickPressed == true) || this.RightClickPressed == false)
				{
					this.ChargePlasmaPistol = 0;
				}
			}*/
		}
	}

	public static int KillItWithFire = 0;
	public static int KillItWithFireSlot = 0;
	private void HandleBugs(Minecraft minecraft)
	{
		if (this.KillItWithFire-- > 0 && minecraft.thePlayer.inventory.mainInventory[KillItWithFireSlot] != null)//Kill the fucking empty itemstack
		{
			//System.out.println("Killing It With Fire!");
			minecraft.thePlayer.inventory.mainInventory[KillItWithFireSlot] = null;
		}
	}

	private void HandleShootingReloading(Minecraft minecraft)
	{
		if (KeyBindings.ReloadKey.getIsKeyPressed())
		{
			if (minecraft.thePlayer.inventory != null && minecraft.thePlayer.inventory.getCurrentItem() != null)
			{
				if (minecraft.thePlayer.inventory.getCurrentItem().isItemDamaged())
				{
					Item item = minecraft.thePlayer.inventory.getCurrentItem().getItem();
					if (item instanceof ItemWeapon)
					{
						ItemWeapon weapon = (ItemWeapon)item;
						if (!weapon.Properties.AmmoFeedsFromInventory)
						{
							if ((weapon.Properties.AmmoType != null && minecraft.thePlayer.inventory.hasItem(weapon.Properties.AmmoType.getItem())) || minecraft.thePlayer.capabilities.isCreativeMode)
							{
								if (FMLCommonHandler.instance().getEffectiveSide().isClient())//Should already be handled
								{
									KCWeaponMod.network.sendToServer(new PacketReload(1, 0));
									this.IsReloading = true;
									this.ReloadingWeapon = item;
									//System.out.println("Player wants to reload!");
								}
							}
						}
					}
				}
			}
		}

		if (this.IsReloading)
		{
			if (!(minecraft.thePlayer.inventory != null && minecraft.thePlayer.inventory.getCurrentItem() != null && this.ReloadingWeapon != null && this.ReloadingWeapon == minecraft.thePlayer.inventory.getCurrentItem().getItem()))
			{
				KCWeaponMod.network.sendToServer(new PacketReload(0, 0));
				this.IsReloading = false;
				this.ReloadingWeapon = null;
			}
		}
	}

	private static boolean rndrChChngd = false;
	protected static boolean rndrngReticle = false;

	private void HandleReticle(Minecraft minecraft)
	{
		if (this.rndrChChngd && !this.rndrngReticle)
		{
			this.rndrChChngd = false;
			GuiIngameForge.renderCrosshairs = true;
		}

		this.rndrngReticle = false;
		if(!KCWeaponMod.DisabledReticle() && minecraft.inGameHasFocus && minecraft.gameSettings.thirdPersonView == 0)
		{
			if (minecraft.thePlayer.inventory.getCurrentItem() != null && minecraft.thePlayer.inventory.getCurrentItem().getItem() instanceof InterfaceZoomReticle)
			{
				InterfaceZoomReticle currentItem = (InterfaceZoomReticle)minecraft.thePlayer.inventory.getCurrentItem().getItem();
				if (!net.killerchief.kcweaponmod.TickHandlerClient.IsZooming() || (!currentItem.IsZoomable() && !net.killerchief.kcweaponmod.TickHandlerClient.IsZooming()))
				{
					int[] rp = currentItem.ReticleProperties();
					if (currentItem.HasReticle() && rp != null && rp.length == 6)
					{
						if (GuiIngameForge.renderCrosshairs)
						{
							this.rndrChChngd = true;
							GuiIngameForge.renderCrosshairs = false;
						}
						this.rndrngReticle = true;
						double detectionRange = 50D;
						if (currentItem instanceof ItemWeapon) {
							detectionRange = ((ItemWeapon)currentItem).Properties.MaxEffectiveTicksAlive * ((ItemWeapon)currentItem).Properties.ProjectileSpeed;
							detectionRange /= 4D;
							if (detectionRange < 20D)
								detectionRange = 20D;
							if (detectionRange > 300D)
								detectionRange = 300D;
						}
						GunReticle(currentItem.ReticleTexture(), detectionRange, currentItem.ReticleTransparency(), rp[0], rp[1], rp[2], rp[3], rp[4], rp[5]);
					}
				}
				if (currentItem.IsZoomable() && this.IsZooming())
				{
					if (GuiIngameForge.renderCrosshairs)
					{
						this.rndrChChngd = true;
						GuiIngameForge.renderCrosshairs = false;
					}
				}
			}
		}
	}

	public static void GunReticle(ResourceLocation overlay, double detectionRange, float transparency, int iBCoordX, int iBCoordY, int iBWidth /* xOffset */, int iBHeight /* yOffset */, int posX, int posY)
	{
		if (!mc.gameSettings.hideGUI)
		{
			ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			mc.entityRenderer.setupOverlayRendering();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			Entity e = getObjectMouseOver(detectionRange).entityHit;
			boolean seeInvisible = false;
			Scoreboard s2 = Minecraft.getMinecraft().theWorld.getScoreboard();
			if (e != null && e instanceof EntityPlayer) {
				ScorePlayerTeam local = s2.getPlayersTeam(Minecraft.getMinecraft().getSession().getUsername());
				ScorePlayerTeam remote = s2.getPlayersTeam(((EntityPlayer)e).getDisplayName());
				if (local != null && local.isSameTeam(remote)) {
					//func_98297_h - canSeeFriendlyInvisibles - .func_98297_h()
					if (local.func_98297_h())
						seeInvisible = true;
					GL11.glColor4f(0.0F, 1.0F, 0.0F, transparency);
				} else if (remote == null){
					GL11.glColor4f(0.0F, 0.0F, 1.0F, transparency);
				} else {
					GL11.glColor4f(1.0F, 0.0F, 0.0F, transparency);
				}
			} else if (e != null && e instanceof EntityMob) {
				GL11.glColor4f(1.0F, 0.0F, 0.0F, transparency);
			} else if (e != null) {
				GL11.glColor4f(0.0F, 0.0F, 1.0F, transparency);
			} else {
				GL11.glColor4f(0.0F, 0.9F, 1F, transparency);
				//GL11.glColor4f(0.0F, 1F, 0.6F, transparency);
			}
			if (e != null && e.isInvisible() && !seeInvisible) {
				GL11.glColor4f(0.0F, 0.9F, 1F, transparency);
			}
			
			mc.getTextureManager().bindTexture(overlay);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glDisable(GL11.GL_LIGHTING);
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV((double)((i / 2 - posX) + 0), (double)((k / 2 - posY) + iBHeight), (double)0.0F, (double)(iBCoordX + 0) * 0.00390625F, (double)(iBCoordY + iBHeight) * 0.00390625F);
			tessellator.addVertexWithUV((double)((i / 2 - posX) + iBWidth), (double)((k / 2 - posY) + iBHeight), (double)0.0F, (double)(iBCoordX + iBWidth) * 0.00390625F, (double)(iBCoordY + iBHeight) * 0.00390625F);
			tessellator.addVertexWithUV((double)((i / 2 - posX) + iBWidth), (double)((k / 2 - posY) + 0), (double)0.0F, (double)(iBCoordX + iBWidth) * 0.00390625F, (double)(iBCoordY + 0) * 0.00390625F);
			tessellator.addVertexWithUV((double)((i / 2 - posX) + 0), (double)((k / 2 - posY) + 0), (double)0.0F, (double)(iBCoordX + 0) * 0.00390625F, (double)(iBCoordY + 0) * 0.00390625F);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			//GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public static boolean ErrorZooming = false;
	public static void CameraZoom(int zoomLevel)
	{
		if (!ErrorZooming)
		{
			try {
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, Double.valueOf(zoomLevel), "af", "cameraZoom");
			} catch (Exception e) {
				System.err.println("I forgot to update the obfuscated reflection for Zooming D:");
				e.printStackTrace();
				ErrorZooming = true;
			}
		}
	}

	//Render Code is Similar to Pumpkin Overlay in GuiIngame / GuiIngameForge
	public static void RenderHelmetVisor(float transparency, ResourceLocation overlay)
	{
		if (!mc.gameSettings.hideGUI)
		{
			ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, transparency);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glDisable(GL11.GL_LIGHTING);
			mc.getTextureManager().bindTexture(overlay);
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(0.0D, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(0.0D, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			//GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	public static void GunScope(float transparency, ResourceLocation overlay)
	{
		if (!mc.gameSettings.hideGUI)
		{
			Minecraft mc = Minecraft.getMinecraft();
			ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, transparency);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glDisable(GL11.GL_LIGHTING);
			mc.getTextureManager().bindTexture(overlay);//mc.renderEngine.bindTexture(overlay);
			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * k, k, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * k, k, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * k, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * k, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, transparency);
		}
	}

	private static boolean IsZooming = false;
	private static boolean ZoomStayOn = false;
	private static int ZoomHeldTimer = 0;
	private int ZoomLevel = -1;
	private float OriginalSensitivity = mc.gameSettings.mouseSensitivity;

	public static boolean IsZooming()
	{
		return IsZooming || ZoomStayOn || ZoomHeldTimer > 0;
	}

	private void HandleZooming(Minecraft minecraft)
	{
		if (minecraft.inGameHasFocus)
		{
			if (!KCWeaponMod.DisabledReticle() && minecraft.gameSettings.thirdPersonView == 0 && ((minecraft.thePlayer.getCurrentEquippedItem() != null && minecraft.thePlayer.getCurrentEquippedItem().getItem() instanceof InterfaceZoomReticle) || (minecraft.thePlayer.inventory.armorInventory != null && minecraft.thePlayer.inventory.armorInventory[3] != null && minecraft.thePlayer.inventory.armorInventory[3].getItem() instanceof InterfaceZoomReticle)))
			{
				InterfaceZoomReticle item = null;
				if (minecraft.thePlayer.getCurrentEquippedItem() != null && minecraft.thePlayer.getCurrentEquippedItem().getItem() instanceof InterfaceZoomReticle && ((InterfaceZoomReticle)minecraft.thePlayer.getCurrentEquippedItem().getItem()).IsZoomable())
					item = (InterfaceZoomReticle)minecraft.thePlayer.getCurrentEquippedItem().getItem();
				else
					if (minecraft.thePlayer.inventory.armorInventory != null && minecraft.thePlayer.inventory.armorInventory[3] != null && minecraft.thePlayer.inventory.armorInventory[3].getItem() instanceof InterfaceZoomReticle)
						item = (InterfaceZoomReticle)minecraft.thePlayer.inventory.armorInventory[3].getItem();

				if (item != null)
				{
					if (item.IsZoomable() && !KeyBindings.ZoomKey.getIsKeyPressed() && item.ZoomMultiplier().length == 1)
					{
						this.StopZooming(minecraft);
					}
					if (item.IsZoomable() && KeyBindings.ZoomKey.getIsKeyPressed() && item.ZoomMultiplier().length == 1)
					{
						//System.out.println("Single");
						this.ZoomLevel = -1;
						this.IsZooming = true;
						this.DoZoom(minecraft, item, false);
						this.ZoomStayOn = false;
						this.ZoomHeldTimer = 0;
					}
					else if (item.IsZoomable() && item.ZoomMultiplier().length > 1)
					{
						if (KeyBindings.ZoomKey.getIsKeyPressed())
						{
							if (KeyBindings.ZoomKey.isPressed() && this.ZoomHeldTimer <= 0)
							{
								++this.ZoomLevel;
								//System.out.println("Increment: "+this.ZoomLevel);
								this.ZoomStayOn = false;
							}
							this.ZoomHeldTimer++;
							this.DoZoom(minecraft, item, true);
							//System.out.println("iskeypressed"+this.ZoomHeldTimer);
						}
						else
						{
							if (this.ZoomHeldTimer > 40)
							{
								this.StopZooming(minecraft);
							}
							else if (this.ZoomHeldTimer > 0)
							{
								this.ZoomStayOn = true;
								//System.out.println("turn on call");
							}
							this.ZoomHeldTimer = 0;
						}

						if (this.ZoomStayOn)
						{
							this.DoZoom(minecraft, item, true);
							//System.out.println("this.ZoomStayOn"+this.ZoomLevel);
						}
						else
						{
							if (!KeyBindings.ZoomKey.getIsKeyPressed() && this.IsZooming)
							{
								this.StopZooming(minecraft);
								//System.out.println("wieriStop");
							}
						}
					}
					else
					{
						if (this.IsZooming)
						{
							//System.out.println("Other Stop");
							this.StopZooming(minecraft);
						}
					}
				}
				else
				{
					if (IsZooming())
					{
						this.StopZooming(minecraft);
					}
				}
			}
			else
			{
				if (IsZooming())
				{
					this.StopZooming(minecraft);
				}
			}
		}
		else
		{
			if (IsZooming())
			{
				this.StopZooming(minecraft);
			}
		}
	}

	private void DoZoom(Minecraft minecraft, InterfaceZoomReticle weapon, boolean multiple)
	{
		if (!multiple && !this.IsZooming)
		{
			//System.out.println("NewStop");
			this.StopZooming(minecraft);
		}
		else if ((multiple && this.ZoomLevel >= weapon.ZoomMultiplier().length) || (multiple && this.ZoomLevel < 0))
		{
			//System.out.println("DoStop:"+this.ZoomLevel);
			this.StopZooming(minecraft);
		}
		else
		{
			int zoom = weapon.ZoomMultiplier()[(this.ZoomLevel < 0 ? 0 : this.ZoomLevel)];
			//System.out.println(this.ZoomLevel+":"+zoom);
			minecraft.gameSettings.setOptionFloatValue(GameSettings.Options.SENSITIVITY, OriginalSensitivity/(zoom > 3 ? zoom * 0.40F : (zoom * 0.15F) + 1F));
			CameraZoom(zoom);
			if (!weapon.ZoomLikeHelmet())
				GunScope(1.0F, weapon.ZoomTexture());
			else
				RenderHelmetVisor(1.0F, weapon.ZoomTexture());
			//this.IsZooming = true;
		}
	}

	private void StopZooming(Minecraft minecraft)
	{
		this.IsZooming = false;
		this.ZoomStayOn = false;
		this.ZoomHeldTimer = 0;
		this.ZoomLevel = -1;
		minecraft.gameSettings.setOptionFloatValue(GameSettings.Options.SENSITIVITY, OriginalSensitivity);
		CameraZoom(1);
		//System.out.println("Stop");
	}
}
