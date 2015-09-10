package net.killerchief.halocraft.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.HalocraftUtils;
import net.killerchief.halocraft.TickHandler;
import net.killerchief.halocraft.client.gui.GuiServerButton;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlBackward;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlForward;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlLeft;
import net.killerchief.halocraft.comm.packetHandlers.PacketCtrlRight;
import net.killerchief.halocraft.comm.packetHandlers.PacketVehicleShoot;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityMongoose;
import net.killerchief.halocraft.entities.vehicles.EntityPassengerSeat;
import net.killerchief.halocraft.entities.vehicles.EntityTurretSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.kcweaponmod.InterfaceZoomReticle;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.killerchief.kcweaponmod.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class TickHandlerClient {
	
	static Minecraft mc = Minecraft.getMinecraft();
	//Minecraft minecraft = FMLClientHandler.instance().getClient();
	
	private static int slowRecharge = 0;
	
	@SubscribeEvent
	public void ClientTickEvent(TickEvent.ClientTickEvent event)
	{
		if (event.phase == event.phase.START)
		{
			
		}
		if (event.phase == event.phase.END)
		{
			GuiScreen guiscreen = mc.currentScreen;

			//clientTicks();
			if (guiscreen != null)
			{
				this.onTickInGUI(mc, guiscreen);
			} else {
				this.onTickInGame(mc);
				
				TickHandler.CommonTickEnd();
				
				if (this.IsRecharging && this.ShieldHealth < TickHandler.ShieldMaxHealth)
				{
					if (this.slowRecharge++ > 2)
					{
						this.ShieldHealth++;
						this.slowRecharge = 0;
					}
				}
				if (this.IsRecharging && this.ShieldHealth >= TickHandler.ShieldMaxHealth)
				{
					this.IsRecharging = false;
				}
			}
		}
	}
	
	@SubscribeEvent
	public void RenderTickEvent(TickEvent.RenderTickEvent event)
	{
		if (event.phase == event.phase.START)
		{
			
		}
		if (event.phase == event.phase.END)
		{
			if (mc.currentScreen != null)
			{
				this.MainMenuTickHandler(mc);
			}
			if (mc.thePlayer != null)//This is Client Only
			{
				this.onRenderTick(mc);

				this.HandleButtonInterface(mc);
				this.HandleArmourAbilities(mc);
				this.HandleZoomingReticle(mc);
				this.HandleHUD(mc);
			}
		}
	}
	
	private static GuiScreen lastScreen;
	private static boolean succeded = false;
	private static int nexttryin = 100;
	private static int retriesleft = 3;
	private static ServerData sd = new ServerData("MOTD?", "hcserver.killerchief.net:25565");
	
	private void MainMenuTickHandler(Minecraft minecraft)
	{
		//Minecraft.getMinecraft().currentScreen != lastScreen
		//Minecraft.getMinecraft().currentScreen instanceof GuiModList
		if (Minecraft.getMinecraft().currentScreen instanceof net.minecraft.client.gui.GuiMultiplayer)
		{
			if (!HalocraftUtils.ErrorButtonList)
			{
				lastScreen = Minecraft.getMinecraft().currentScreen;
				int x = lastScreen.width / 2;
				int y = lastScreen.height - 72;
				List buttonList = HalocraftUtils.getButtonList(lastScreen);
				boolean hasMumButton = false;
				if (buttonList != null)
				{
					for(Object o : buttonList){
						if(o instanceof GuiServerButton){
							hasMumButton = true;
							break;
						}
					}
					if(!hasMumButton){
						if (!succeded)
						{
							if (retriesleft > 0)
							{
								//System.out.println("1");
								if (nexttryin <= 0)
								{
									//System.out.println("2");
									//sd = new ServerData("MOTD?", "hcserver.killerchief.net:25565");
									//try {
										this.func_147225_b(sd);
										//func_74017_b(sd);
										//OldServerPinger.func_147224_a(sd);
									//} catch (IOException e) {
										//e.printStackTrace();
									//}
										//System.out.println("Ping Halocraft Server");
									nexttryin = 200;
									retriesleft-=1;
								}
								else
								{
									nexttryin-=1;
								}
							}
						}
						else
						{
							resetVals();
						}
						if (sd.populationInfo != null)
						{
							//System.out.println(sd.populationInfo);
							succeded = true;
							buttonList.add(new GuiServerButton(99, x, y, lastScreen, sd.populationInfo));
							sd.populationInfo = null;
						}
					}
				}
			}
		}
		else
		{
			resetVals();
		}
	}

	private void resetVals()
	{
		if (succeded == true)
		{
			succeded = false;
		}
		if (nexttryin != 100)
		{
			nexttryin = 100;
		}
		if (retriesleft != 3)
		{
			retriesleft = 3;
		}
	}
	
	private static final Splitter field_147230_a = Splitter.on('\u0000').limit(6);
	
	private void func_147225_b(final ServerData p_147225_1_) //net.minecraft.client.network.OldServerPinger
    {
        final ServerAddress serveraddress = ServerAddress.func_78860_a(p_147225_1_.serverIP);
        ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group(NetworkManager.eventLoops)).handler(new ChannelInitializer()
        {
            protected void initChannel(Channel p_initChannel_1_)
            {
                try
                {
                    p_initChannel_1_.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
                }
                catch (ChannelException channelexception1)
                {
                    ;
                }

                try
                {
                    p_initChannel_1_.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
                }
                catch (ChannelException channelexception)
                {
                    ;
                }

                p_initChannel_1_.pipeline().addLast(new ChannelHandler[] {new SimpleChannelInboundHandler()
                {
                    private static final String __OBFID = "CL_00000895";
                    public void channelActive(ChannelHandlerContext p_channelActive_1_) throws Exception
                    {
                        super.channelActive(p_channelActive_1_);
                        ByteBuf bytebuf = Unpooled.buffer();

                        try
                        {
                            bytebuf.writeByte(254);
                            bytebuf.writeByte(1);
                            bytebuf.writeByte(250);
                            char[] achar = "MC|PingHost".toCharArray();
                            bytebuf.writeShort(achar.length);
                            char[] achar1 = achar;
                            int i = achar.length;
                            int j;
                            char c0;

                            for (j = 0; j < i; ++j)
                            {
                                c0 = achar1[j];
                                bytebuf.writeChar(c0);
                            }

                            bytebuf.writeShort(7 + 2 * serveraddress.getIP().length());
                            bytebuf.writeByte(127);
                            achar = serveraddress.getIP().toCharArray();
                            bytebuf.writeShort(achar.length);
                            achar1 = achar;
                            i = achar.length;

                            for (j = 0; j < i; ++j)
                            {
                                c0 = achar1[j];
                                bytebuf.writeChar(c0);
                            }

                            bytebuf.writeInt(serveraddress.getPort());
                            p_channelActive_1_.channel().writeAndFlush(bytebuf).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
                        }
                        finally
                        {
                            bytebuf.release();
                        }
                    }
                    protected void channelRead0(ChannelHandlerContext p_channelRead0_1_, ByteBuf p_channelRead0_2_)
                    {
                        short short1 = p_channelRead0_2_.readUnsignedByte();

                        if (short1 == 255)
                        {
                            String s = new String(p_channelRead0_2_.readBytes(p_channelRead0_2_.readShort() * 2).array(), Charsets.UTF_16BE);
                            String[] astring = (String[])Iterables.toArray(field_147230_a.split(s), String.class);

                            if ("\u00a71".equals(astring[0]))
                            {
                                int i = MathHelper.parseIntWithDefault(astring[1], 0);
                                String s1 = astring[2];
                                String s2 = astring[3];
                                int j = MathHelper.parseIntWithDefault(astring[4], -1);
                                int k = MathHelper.parseIntWithDefault(astring[5], -1);
                                p_147225_1_.field_82821_f = -1;
                                p_147225_1_.gameVersion = s1;
                                p_147225_1_.serverMOTD = s2;
                                p_147225_1_.populationInfo = EnumChatFormatting.GRAY + "" + j + "" + EnumChatFormatting.DARK_GRAY + "/" + EnumChatFormatting.GRAY + k;
                            }
                        }

                        p_channelRead0_1_.close();
                    }
                    public void exceptionCaught(ChannelHandlerContext p_exceptionCaught_1_, Throwable p_exceptionCaught_2_)
                    {
                        p_exceptionCaught_1_.close();
                    }
                    protected void channelRead0(ChannelHandlerContext p_channelRead0_1_, Object p_channelRead0_2_)
                    {
                        this.channelRead0(p_channelRead0_1_, (ByteBuf)p_channelRead0_2_);
                    }
                }
                                                                         });
            }
        })).channel(NioSocketChannel.class)).connect(serveraddress.getIP(), serveraddress.getPort());
    }
	
	
	//Not the original (HalocraftUtils)
	public static boolean isPlayerWearingArmor(EntityPlayer player, int armorType, boolean helmet, boolean body, boolean legs, boolean boots)
	{
		return false;
	}
	
	//onTickInGame
	public static float Recoil = 0.0F;
	public static float AntiRecoil = 0.0F;

	private int RefreshDelayAmount = 40;
	private int DelayForward = 0;
	private boolean ForwardKeyPressed = false;
	private int DelayBackward = 0;
	private boolean BackwardKeyPressed = false;
	private int DelayLeft = 0;
	private boolean LeftKeyPressed = false;
	private int DelayRight = 0;
	private boolean RightKeyPressed = false;
	
	public void onTickInGUI(Minecraft minecraft, GuiScreen guiscreen)
	{
		//System.out.println("onTickInGUI");
	}

	private void onTickInGame(Minecraft minecraft)
	{
		//System.out.println("onTickInGame");

		if(this.Recoil > 0.0F)
		{
			this.Recoil *= 0.8F;
		}
		minecraft.thePlayer.rotationPitch -= this.Recoil;
		this.AntiRecoil += this.Recoil;
		minecraft.thePlayer.rotationPitch += AntiRecoil * 0.2F;
		this.AntiRecoil *= 0.78F;

		if (minecraft.thePlayer.ridingEntity instanceof EntityMongoose || minecraft.thePlayer.ridingEntity instanceof EntityGhost || minecraft.thePlayer.ridingEntity instanceof EntityWarthog)
		{
			//Forward
			
			if (Keyboard.isKeyDown(minecraft.gameSettings.keyBindForward.getKeyCode()))
			{
				if (ForwardKeyPressed)
				{
					if (DelayForward <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlForward(true));
						ForwardKeyPressed = true;
						DelayForward = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlForward(true));
					ForwardKeyPressed = true;
				}
			}
			else
			{
				if (!ForwardKeyPressed)
				{
					if (DelayForward <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlForward(false));
						ForwardKeyPressed = false;
						DelayForward = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlForward(false));
					ForwardKeyPressed = false;
				}

			}

			if (!(DelayForward <= 0))
			{
				DelayForward--;
			}

			//Backward
			
			if (Keyboard.isKeyDown(minecraft.gameSettings.keyBindBack.getKeyCode()))
			{
				if (BackwardKeyPressed)
				{
					if (DelayBackward <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlBackward(true));
						BackwardKeyPressed = true;
						DelayBackward = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlBackward(true));
					BackwardKeyPressed = true;
				}
			}
			else
			{
				if (!BackwardKeyPressed)
				{
					if (DelayBackward <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlBackward(false));
						BackwardKeyPressed = false;
						DelayBackward = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlBackward(false));
					BackwardKeyPressed = false;
				}

			}

			if (!(DelayBackward <= 0))
			{
				DelayBackward--;
			}
			
			//Left
			
			if (Keyboard.isKeyDown(minecraft.gameSettings.keyBindLeft.getKeyCode()))
			{
				if (LeftKeyPressed)
				{
					if (DelayLeft <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlLeft(true));
						LeftKeyPressed = true;
						DelayLeft = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlLeft(true));
					LeftKeyPressed = true;
				}
			}
			else
			{
				if (!LeftKeyPressed)
				{
					if (DelayLeft <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlLeft(false));
						LeftKeyPressed = false;
						DelayLeft = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlLeft(false));
					LeftKeyPressed = false;
				}

			}

			if (!(DelayLeft <= 0))
			{
				DelayLeft--;
			}
			
			//Right
			
			if (Keyboard.isKeyDown(minecraft.gameSettings.keyBindRight.getKeyCode()))
			{
				if (RightKeyPressed)
				{
					if (DelayRight <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlRight(true));
						RightKeyPressed = true;
						DelayRight = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlRight(true));
					RightKeyPressed = true;
				}
			}
			else
			{
				if (!RightKeyPressed)
				{
					if (DelayRight <= 0)
					{
						Halocraft.network.sendToServer(new PacketCtrlRight(false));
						RightKeyPressed = false;
						DelayRight = RefreshDelayAmount;
					}
				}
				else
				{
					Halocraft.network.sendToServer(new PacketCtrlRight(false));
					RightKeyPressed = false;
				}

			}

			if (!(DelayRight <= 0))
			{
				DelayRight--;
			}
		}
		else
		{
			if (ForwardKeyPressed)
			{
				Halocraft.network.sendToServer(new PacketCtrlForward(false));
				ForwardKeyPressed = false;
			}
			
			if (BackwardKeyPressed)
			{
				Halocraft.network.sendToServer(new PacketCtrlBackward(false));
				BackwardKeyPressed = false;
			}
			
			if (LeftKeyPressed)
			{
				Halocraft.network.sendToServer(new PacketCtrlLeft(false));
				LeftKeyPressed = false;
			}
			
			if (RightKeyPressed)
			{
				Halocraft.network.sendToServer(new PacketCtrlRight(false));
				RightKeyPressed = false;
			}
		}
	}
	
	//HandleShootingReloading
	public static boolean IsReloading = false;
	//private int shootReloadCodeDelay = 0;
	public Item ReloadingWeaponID = HalocraftItemsWeapons.AssaultRifle;

	//HandleShields
	public static int ShieldHealth = 0;
	public static int DoubledShieldHealth = 0;
	public static boolean IsRecharging = false;
	private static int shieldBlink = 0;

	//HandleButtonInterface
	public boolean LeftClickPressed = false;
	public boolean PrevLeftClickPressed = false;
	public int VehicleShootDelay = 0;
	public boolean RightClickPressed = false;
	public boolean PrevRightClickPressed = false;
	//private int GunShootDelay = 0;
	//private int ChargePlasmaPistol = 0;

	//HandleArmourAbilities
	private boolean previousTickWasOnGround;

	//HandleZoomingReticle
	public static boolean HelmetOn;
	private float OriginalSensitivity = mc.gameSettings.mouseSensitivity;

	//HandleHUD

	//RenderShield/Mag/Ammo


	private static final ResourceLocation RLArmourMVVisor = new ResourceLocation(Halocraft.MODID+":textures/overlays/MarkVHelmetOverlay.png");
	private static final ResourceLocation RLArmourMVIVisor = new ResourceLocation(Halocraft.MODID+":textures/overlays/MarkVIHelmetOverlay.png");
	private static final ResourceLocation RLArmourODSTVisor = new ResourceLocation(Halocraft.MODID+":textures/overlays/ODSTHelmetOverlay.png");
	private static final ResourceLocation RLArmourReconVisor = new ResourceLocation(Halocraft.MODID+":textures/overlays/ReconHelmetOverlay.png");
	//private static final ResourceLocation RLArmourMVVisorZoom = new ResourceLocation(Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png");
	private static final ResourceLocation RLReticle = new ResourceLocation(Halocraft.MODID+":textures/overlays/Reticle.png");

	private static final ResourceLocation RLHud1 = new ResourceLocation(Halocraft.MODID+":textures/overlays/Hud1.png");
	private static final ResourceLocation RLHud2 = new ResourceLocation(Halocraft.MODID+":textures/overlays/Hud2.png");
	
	private void onRenderTick(Minecraft minecraft)
	{
		//System.out.println("onRenderTick");

		//System.out.println("F:" + entityplayer.moveForward);
		//System.out.println("S:" + entityplayer.moveStrafing);

		/*if (itemstack != null && minecraft.inGameHasFocus)
		{
			if (itemstack == Halocraft.EnergySword)
			{
				if (this.AttackClickPressed == false && this.PrevAttackClickPress == true)
				{
					entityplayer.swingItem();//(not hit, just swing it)
					//entityplayer.
					System.out.println("Swing");
				}
			}
		}*/
	}

	private void HandleButtonInterface(Minecraft minecraft)
	{
		if (this.LeftClickPressed == true && this.PrevLeftClickPressed == false)
		{
			this.PrevLeftClickPressed = true;
		}
		if (this.LeftClickPressed == false && this.PrevLeftClickPressed == true)
		{
			this.PrevLeftClickPressed = false;
		}
		if (minecraft.gameSettings.keyBindAttack.getIsKeyPressed() && minecraft.inGameHasFocus)
		{
			this.LeftClickPressed = true;
		}
		else
		{
			this.LeftClickPressed = false;
		}
		
		if (minecraft.inGameHasFocus && this.LeftClickPressed)//this.RightClickPressed
		{
			if (this.VehicleShootDelay > 0)
			{
				--this.VehicleShootDelay;
			}
			else
			{
				if (this.mc.thePlayer.ridingEntity != null)
				{
					if (this.mc.thePlayer.ridingEntity instanceof EntityGhost)
					{
						Halocraft.network.sendToServer(new PacketVehicleShoot());
						this.VehicleShootDelay = 5;
					}
					else if (this.mc.thePlayer.ridingEntity instanceof EntityTurretSeat)
					{
						EntityPassengerSeat turret = (EntityPassengerSeat)this.mc.thePlayer.ridingEntity;
						if (turret.parentBody != null && turret.parentBody instanceof EntityWarthog)
						{
							//System.out.println("TurretShootSend");
							Halocraft.network.sendToServer(new PacketVehicleShoot());
							this.VehicleShootDelay = 2;
							this.Recoil += 4F;
						}
					}
				}
			}
		}
		
		if (this.RightClickPressed == true && this.PrevRightClickPressed == false)
		{
			this.PrevRightClickPressed = true;
		}
		if (this.RightClickPressed == false && this.PrevRightClickPressed == true)
		{
			this.PrevRightClickPressed = false;
		}
		if (minecraft.gameSettings.keyBindUseItem.getIsKeyPressed() && minecraft.inGameHasFocus)
		{
			this.RightClickPressed = true;
		}
		else
		{
			this.RightClickPressed = false;
		}
	}

	private void HandleArmourAbilities(Minecraft minecraft)
	{
		EntityPlayerSP entityplayersp = minecraft.thePlayer;
		//Client Only, this would cause issues...
		if (HalocraftUtils.isPlayerWearingArmor(minecraft, 0, false, true, true, true))
		{
			//mc.theWorld.provider.dimensionId
			double jumpVelocity = 0.65D;
			if(previousTickWasOnGround && !entityplayersp.onGround && entityplayersp.movementInput.jump)
			{
				entityplayersp.motionY = jumpVelocity;
			}
			previousTickWasOnGround = entityplayersp.onGround;

			HalocraftUtils.MoveSpeed(0.12F);
			minecraft.thePlayer.jumpMovementFactor = 0.03F;
			entityplayersp.stepHeight = 1F;
		}else{
			HalocraftUtils.MoveSpeed(0.1F);//FIXME: Would cause problems with other mods.
			entityplayersp.stepHeight = 0.5F;
		}
	}

	private void HandleZoomingReticle(Minecraft minecraft)
	{
		EntityPlayer entityplayer = minecraft.thePlayer;

		if (HalocraftUtils.isPlayerWearingArmor(minecraft, 0, true, false, false, false) || HalocraftUtils.isPlayerWearingArmor(minecraft, 1, true, false, false, false) || HalocraftUtils.isPlayerWearingArmor(minecraft, 2, true, false, false, false))
		{
			HelmetOn = true;
		}
		else
		{
			HelmetOn = false;
		}

		GuiIngameForge.renderCrosshairs = true;
		
		
		if(minecraft.inGameHasFocus && minecraft.gameSettings.thirdPersonView == 0)
		{
			if (minecraft.thePlayer.ridingEntity instanceof EntityTurretSeat)
			{
				GuiIngameForge.renderCrosshairs = false;
				GunReticle(1.0F, RLReticle, 132, 117, 45, 45, 22, 22);
			}
			else if (minecraft.thePlayer.ridingEntity instanceof EntityGhost)
			{
				GuiIngameForge.renderCrosshairs = false;
				GunReticle(1.0F, RLReticle, 39, 163, 49, 29, 24, 19);
			}
			else if (minecraft.thePlayer.inventory.getCurrentItem() != null && minecraft.thePlayer.inventory.getCurrentItem().getItem() instanceof InterfaceZoomReticle)
			{
				InterfaceZoomReticle currentItem = (InterfaceZoomReticle)minecraft.thePlayer.inventory.getCurrentItem().getItem();
				if (!net.killerchief.kcweaponmod.TickHandlerClient.IsZooming() || (!currentItem.IsZoomable() && !net.killerchief.kcweaponmod.TickHandlerClient.IsZooming()))
				{
					if (HalocraftUtils.isPlayerHoldingGun(minecraft, true, false))
					{
						GuiIngameForge.renderCrosshairs = false;
						if(currentItem == HalocraftItemsWeapons.BattleRifle)
						{
							GunReticle(1.0F, RLReticle, 25, 1, 23, 23, 11, 11);
						}
						else if(currentItem == HalocraftItemsWeapons.DMR)
						{
							GunReticle(1.0F, RLReticle, 49, 1, 23, 23, 11, 11);
						}
						else if(currentItem == HalocraftItemsWeapons.SniperRifle)
						{
							GunReticle(1.0F, RLReticle, 2, 26, 9, 9, 4, 4);
						}
						else if(currentItem == HalocraftItemsWeapons.Magnum)
						{
							GunReticle(1.0F, RLReticle, 1, 1, 23, 23, 11, 11);
						}
						else if(currentItem == HalocraftItemsWeapons.RocketLauncher)
						{
							GunReticle(1.0F, RLReticle, 208, 1, 47, 47, 23, 23);
						}
						else if(currentItem == HalocraftItemsWeapons.Carbine)
						{
							GunReticle(1.0F, RLReticle, 115, 47, 27, 23, 13, 11);
						}
						else if(currentItem == HalocraftItemsWeapons.BeamRifle)
						{
							GunReticle(1.0F, RLReticle, 12, 26, 11, 9, 5, 4);
						}
						else if(currentItem == HalocraftItemsWeapons.AssaultRifle)
						{
							GunReticle(1.0F, RLReticle, 86, 1, 31, 31, 15, 15);
						}
						else if(currentItem == HalocraftItemsWeapons.Shotgun)
						{
							GunReticle(1.0F, RLReticle, 162, 1, 45, 45, 22, 22);
						}
						else if(currentItem == HalocraftItemsWeapons.SMG)
						{
							GunReticle(1.0F, RLReticle, 118, 1, 43, 43, 21, 21);
						}
						else if(currentItem == HalocraftItemsWeapons.PlasmaRifle)
						{
							GunReticle(1.0F, RLReticle, 1, 37, 37, 37, 18, 18);
						}
						else if(currentItem == HalocraftItemsWeapons.PlasmaPistol)
						{
							GunReticle(1.0F, RLReticle, 39, 33, 37, 41, 18, 22);
						}
						else if(currentItem == HalocraftItemsWeapons.Needler)
						{
							GunReticle(1.0F, RLReticle, 143, 47, 31, 21, 15, 10);
						}
						else if(currentItem == HalocraftItemsWeapons.Spiker)
						{
							GunReticle(1.0F, RLReticle, 77, 33, 37, 35, 18, 17);
						}
						else if(currentItem == HalocraftItemsWeapons.Mauler)
						{
							GunReticle(1.0F, RLReticle, 1, 75, 41, 41, 20, 20);
						}
						else if(currentItem == HalocraftItemsWeapons.Flamethrower)
						{
							GunReticle(1.0F, RLReticle, 208, 97, 47, 47, 23, 23);
						}
						else if(currentItem == HalocraftItemsWeapons.EnergySword)
						{
							GunReticle(1.0F, RLReticle, 43, 75, 41, 41, 20, 20);
						}
						else if (currentItem == KCWeaponMod.weapons[HalocraftItemsWeapons.ModMapOffset+19])
						{
							GunReticle(1.0F, RLReticle, 125, 75, 23, 13, 11, 6);
						}
						else
							GuiIngameForge.renderCrosshairs = true;
					}
				}
				if (HalocraftUtils.isPlayerHoldingGun(minecraft, false, true) && net.killerchief.kcweaponmod.TickHandlerClient.IsZooming())
				{
					GuiIngameForge.renderCrosshairs = false;
				}
			}
			
			if (!net.killerchief.kcweaponmod.TickHandlerClient.IsZooming() && minecraft.thePlayer.inventory.armorInventory != null && minecraft.thePlayer.inventory.armorInventory[3] != null)
			{
				Item item = minecraft.thePlayer.inventory.armorInventory[3].getItem();
				if (item == HalocraftItemsArmor.MarkVHelmetBlack || item == HalocraftItemsArmor.MarkVHelmetGreen || item == HalocraftItemsArmor.MarkVHelmetBlue || item == HalocraftItemsArmor.MarkVHelmetRed)
				{
					RenderHelmetVisor(1.0F, RLArmourMVVisor);
				}
				else if (item == HalocraftItemsArmor.MarkVIHelmetGreen)
				{
					RenderHelmetVisor(1.0F, RLArmourMVIVisor);
				}
				else if (item == HalocraftItemsArmor.ReconHelmet)
				{
					RenderHelmetVisor(1.0F, RLArmourReconVisor);
				}
				else if (item == HalocraftItemsArmor.ODSTHelmet)
				{
					RenderHelmetVisor(1.0F, RLArmourODSTVisor);
				}
			}
		}
	}

	private void HandleHUD(Minecraft minecraft)
	{
		if (minecraft.thePlayer.inventory == null)
			return;

		if (HalocraftUtils.isPlayerWearingArmor(minecraft, 0, true, false, false, false))
		{
			this.RenderShield(minecraft);
		}

		if (minecraft.inGameHasFocus && minecraft.thePlayer.inventory.getCurrentItem() != null && (HalocraftUtils.isPlayerWearingArmor(minecraft, 0, true, false, false, false) || HalocraftUtils.isPlayerWearingArmor(minecraft, 1, true, false, false, false) || HalocraftUtils.isPlayerWearingArmor(minecraft, 2, true, false, false, false)))
		{
			Item currentItem = minecraft.thePlayer.inventory.getCurrentItem().getItem();
			if (currentItem == HalocraftItemsWeapons.AssaultRifle || currentItem == HalocraftItemsWeapons.SMG || currentItem == HalocraftItemsWeapons.BattleRifle || currentItem == HalocraftItemsWeapons.DMR || currentItem == HalocraftItemsWeapons.Magnum || currentItem == HalocraftItemsWeapons.SniperRifle || currentItem == HalocraftItemsWeapons.Shotgun || currentItem == HalocraftItemsWeapons.RocketLauncher || currentItem == HalocraftItemsWeapons.Mauler)
			{
				int Number = currentItem.getMaxDamage() - minecraft.thePlayer.inventory.getCurrentItem().getItemDamage();
				this.RenderMag(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.AssaultRifle || currentItem == HalocraftItemsWeapons.SMG)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == HalocraftItemsWeapons.SmallRounds) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.BattleRifle || currentItem == HalocraftItemsWeapons.DMR || currentItem == HalocraftItemsWeapons.Magnum)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == HalocraftItemsWeapons.MediumRounds) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.SniperRifle)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == HalocraftItemsWeapons.LargeRounds) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.Shotgun || currentItem == HalocraftItemsWeapons.Mauler)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == HalocraftItemsWeapons.ShotgunRounds) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.RocketLauncher)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == HalocraftItemsWeapons.Rocket) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == HalocraftItemsWeapons.Carbine || currentItem == HalocraftItemsWeapons.PlasmaRifle || currentItem == HalocraftItemsWeapons.PlasmaPistol || currentItem == HalocraftItemsWeapons.Needler || currentItem == HalocraftItemsWeapons.BeamRifle || currentItem == HalocraftItemsWeapons.EnergySword || currentItem == HalocraftItems.SwordHilt || currentItem == HalocraftItemsWeapons.Flamethrower || currentItem == HalocraftItemsWeapons.Spiker)
			{
				int Number = currentItem.getMaxDamage() - minecraft.thePlayer.inventory.getCurrentItem().getItemDamage();
				this.RenderAmmo(minecraft, Number);
			}
			if (currentItem == Items.bow)
			{
				int Number = 0;
				for(int i = 0; i <= minecraft.thePlayer.inventory.mainInventory.length; i += 1) {
					if(minecraft.thePlayer.inventory.getStackInSlot(i) != null) {
						if(minecraft.thePlayer.inventory.getStackInSlot(i).getItem() == Items.arrow) {
							Number += minecraft.thePlayer.inventory.getStackInSlot(i).stackSize;
						}
					}
				}
				this.RenderAmmo(minecraft, Number);
			}
		}
	}
	
	private int HUDRenderPos(boolean isXAxis)
	{
		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		if (isXAxis)
		{
			if (HalocraftConfig.AnchorHUDRenderCentreX)
			{
				return (scaledresolution.getScaledWidth() / 2) + HalocraftConfig.HUDXOffset;
			}
			else
			{
				if (HalocraftConfig.AnchorHUDRenderRight)
				{
					return scaledresolution.getScaledWidth() - HalocraftConfig.HUDXOffset - 150;
				}
				else
				{
					return HalocraftConfig.HUDXOffset;
				}
			}
		}
		else
		{
			if (HalocraftConfig.AnchorHUDRenderCentreY)
			{
				return (scaledresolution.getScaledHeight() / 2) + HalocraftConfig.HUDYOffset;
			}
			else
			{
				if (HalocraftConfig.AnchorHUDRenderTop)
				{
					return HalocraftConfig.HUDYOffset;
				}
				else
				{
					return scaledresolution.getScaledHeight() - HalocraftConfig.HUDYOffset - 38;
				}
			}
		}
	}
	
	private void RenderShield(Minecraft minecraft)
	{
		//ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		int width = HUDRenderPos(true);//scaledresolution.getScaledWidth() - 160;
		int height = HUDRenderPos(false);//10;
		this.DoubledShieldHealth = this.ShieldHealth*2;

		if (!HalocraftUtils.isPlayerWearingArmor(minecraft, 0, false, true, true, true))
		{
			HelmetHud(0.8F, RLHud2, 1, 196, 150, 38, width, height);
		}
		else
		{
			if (this.DoubledShieldHealth > 0 && this.DoubledShieldHealth <= 5)
			{
				HelmetHud(0.8F, RLHud1, 1, 1, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 5 && this.DoubledShieldHealth <= 15)
			{
				HelmetHud(0.8F, RLHud1, 1, 40, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 15 && this.DoubledShieldHealth <= 25)
			{
				HelmetHud(0.8F, RLHud1, 1, 79, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 25 && this.DoubledShieldHealth <= 35)
			{
				HelmetHud(0.8F, RLHud1, 1, 118, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 35 && this.DoubledShieldHealth <= 45)
			{
				HelmetHud(0.8F, RLHud1, 1, 157, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 45 && this.DoubledShieldHealth <= 55)
			{
				HelmetHud(0.8F, RLHud1, 1, 196, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 55 && this.DoubledShieldHealth <= 65)
			{
				HelmetHud(0.8F, RLHud2, 1, 1, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 65 && this.DoubledShieldHealth <= 75)
			{
				HelmetHud(0.8F, RLHud2, 1, 40, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 75 && this.DoubledShieldHealth <= 85)
			{
				HelmetHud(0.8F, RLHud2, 1, 79, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 85 && this.DoubledShieldHealth <= 95)
			{
				HelmetHud(0.8F, RLHud2, 1, 118, 150, 38, width, height);
			}
			else if (this.DoubledShieldHealth > 95)
			{
				HelmetHud(0.8F, RLHud2, 1, 157, 150, 38, width, height);
			}
			else
			{
				if (this.shieldBlink >= 0 && this.shieldBlink <= 10)
				{
					HelmetHud(0.8F, RLHud2, 1, 196, 150, 38, width, height);
					if (this.shieldBlink == 0 && !mc.isGamePaused())
						mc.thePlayer.playSound(Halocraft.MODID+":armour.ShieldLowBeep", 1.0F, 1.0F);
					++this.shieldBlink;
				}
				else if (this.shieldBlink > 10 && this.shieldBlink <= 21)
				{
					HelmetHud(0.8F, RLHud1, 1, 1, 150, 38, width, height);
					if (this.shieldBlink == 11 && !mc.isGamePaused())
						mc.thePlayer.playSound(Halocraft.MODID+":armour.ShieldLowBeep", 1.0F, 1.0F);
					++this.shieldBlink;
				}
				else
				{
					HelmetHud(0.8F, RLHud2, 1, 196, 150, 38, width, height);
					this.shieldBlink = 0;
				}
			}
		}
	}

	private void RenderMag(Minecraft minecraft, int number)
	{
		if (!mc.gameSettings.hideGUI)
		{
			//ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			// setup render
			FontRenderer fontRender = minecraft.fontRenderer;
			//int width = scaledresolution.getScaledWidth();
			//int height = scaledresolution.getScaledHeight();
			minecraft.entityRenderer.setupOverlayRendering();

			GL11.glDisable(GL11.GL_LIGHTING);

			// draw
			int y = HUDRenderPos(false) + 25;//35;
			int x1 = HUDRenderPos(true) + 22;//width - 138;
			int x2 = HUDRenderPos(true) + 43;//width - 117;
			if (!HalocraftUtils.isPlayerWearingArmor(minecraft, 0, true, false, false, false))
			{
				y = HUDRenderPos(false) + 10;
				x1 = HUDRenderPos(true) + 52;
				x2 = HUDRenderPos(true) + 73;
			}
			int color = 0xFFFFFF;
			String text = "Mag:";
			fontRender.drawStringWithShadow(text, x1, y, color);
			String count = Integer.toString(number);
			fontRender.drawStringWithShadow(count, x2, y, color);
		}
	}

	private void RenderAmmo(Minecraft minecraft, int number)
	{
		if (!mc.gameSettings.hideGUI)
		{
			//ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			// setup render
			FontRenderer fontRender = minecraft.fontRenderer;
			//int width = scaledresolution.getScaledWidth();
			//int height = scaledresolution.getScaledHeight();
			minecraft.entityRenderer.setupOverlayRendering();

			GL11.glDisable(GL11.GL_LIGHTING);

			// draw
			int y = HUDRenderPos(false) + 25;//35;
			int x1 = HUDRenderPos(true) + 63;//width - 97;
			int x2 = HUDRenderPos(true) + 90;//width - 70;
			if (!HalocraftUtils.isPlayerWearingArmor(minecraft, 0, true, false, false, false))
			{
				y = HUDRenderPos(false) + 10;
				x1 = HUDRenderPos(true) + 93;
				x2 = HUDRenderPos(true) + 120;
			}
			int color = 0xFFFFFF;
			String text = "Ammo:";
			fontRender.drawStringWithShadow(text, x1, y, color);
			String count = Integer.toString(number);
			fontRender.drawStringWithShadow(count, x2, y, color);
		}
	}

	public static void GunReticle(float transparency, ResourceLocation overlay, int iBCoordX, int iBCoordY, int iBWidth /* xOffset */, int iBHeight /* yOffset */, int posX, int posY)
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
			GL11.glColor4f(1.0F, 1.0F, 1.0F, transparency);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			GL11.glDisable(GL11.GL_LIGHTING);
			mc.getTextureManager().bindTexture(overlay);//FMLClientHandler.instance().getClient().renderEngine.bindTexture(OverlayOxygenTanks.guiTexture);
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

	public static void HelmetHud(float transparency, ResourceLocation overlay, int iBCoordX, int iBCoordY, int iBWidth, int iBHeight, int posX, int posY)
	{
		if (mc.inGameHasFocus && !mc.gameSettings.hideGUI)
		{
			ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			//int i = scaledresolution.getScaledWidth();
			//int k = scaledresolution.getScaledHeight();
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
			tessellator.addVertexWithUV((double)(posX + 0), (double)(posY + iBHeight), (double)0.0F, (double)(iBCoordX + 0) * 0.00390625F, (double)(iBCoordY + iBHeight) * 0.00390625F);
			tessellator.addVertexWithUV((double)(posX + iBWidth), (double)(posY + iBHeight), (double)0.0F, (double)(iBCoordX + iBWidth) * 0.00390625F, (double)(iBCoordY + iBHeight) * 0.00390625F);
			tessellator.addVertexWithUV((double)(posX + iBWidth), (double)(posY + 0), (double)0.0F, (double)(iBCoordX + iBWidth) * 0.00390625F, (double)(iBCoordY + 0) * 0.00390625F);
			tessellator.addVertexWithUV((double)(posX + 0), (double)(posY + 0), (double)0.0F, (double)(iBCoordX + 0) * 0.00390625F, (double)(iBCoordY + 0) * 0.00390625F);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			//GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
