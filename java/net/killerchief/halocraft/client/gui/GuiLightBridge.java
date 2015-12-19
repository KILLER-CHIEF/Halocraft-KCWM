package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.comm.packetHandlers.PacketLightBridge;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.inventory.ContainerLightBridge;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeGen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiLightBridge extends GuiContainer {

	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/LightBridge.png");
	private TileEntityLightBridgeGen tileentity;
	private EntityPlayer player;
	private GuiButton btnOverOn;
	private GuiButton btnOverOff;
	private GuiButton btnOverRed;
	private GuiButton btnLock;
	private GuiButton btnLockEditing;
	private GuiButton btnModp1;
	private GuiButton btnModp5;
	private GuiButton btnModm1;
	private GuiButton btnModm5;

	public GuiLightBridge(InventoryPlayer par1InventoryPlayer, TileEntityLightBridgeGen par2TileEntityLightBridge)
	{
		super(new ContainerLightBridge(par1InventoryPlayer, par2TileEntityLightBridge));
		this.player = par1InventoryPlayer.player;
		this.tileentity = par2TileEntityLightBridge;
		xSize = 176;
		ySize = 154;
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		this.btnOverOn = new GuiButton(1, (width / 2) - 65, (height / 2) - 35, 40, 20, "On");
		this.btnOverOff = new GuiButton(2, (width / 2) - 25, (height / 2) - 35, 40, 20, "Off");
		this.btnOverRed = new GuiButton(3, (width / 2) - 65, (height / 2) - 15, 80, 20, "Via Redstone");
		this.btnLock = new GuiButton(4, (width / 2) - 70, (height / 2) + 14, 90, 20, "Lock Controls");
		this.btnLockEditing = new GuiButton(5, (width / 2) - 70, (height / 2) + 34, 90, 20, "Allow Editing");
		this.btnModp1 = new GuiButton(6, (width / 2) + 40, (height / 2) - 40, 30, 20, "+5");
		this.btnModp5 = new GuiButton(7, (width / 2) + 40, (height / 2) - 20, 30, 20, "+1");
		this.btnModm1 = new GuiButton(8, (width / 2) + 40, (height / 2) + 14, 30, 20, "-1");
		this.btnModm5 = new GuiButton(9, (width / 2) + 40, (height / 2) + 34, 30, 20, "-5");
		this.buttonList.add(this.btnOverOn);
		this.buttonList.add(this.btnOverOff);
		this.buttonList.add(this.btnOverRed);
		this.buttonList.add(this.btnLock);
		this.buttonList.add(this.btnLockEditing);
		this.buttonList.add(this.btnModp1);
		this.buttonList.add(this.btnModp5);
		this.buttonList.add(this.btnModm1);
		this.buttonList.add(this.btnModm5);

		//GuiButton(int id, int xPosition, int yPosition, int width, int height, String displayString)
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen()
	{
		if (this.btnLock != null)
		{
			if (this.tileentity.getOverrideRedstone()) {
				this.btnOverRed.enabled = true;
				if (this.tileentity.getOverrideOn()) {
					this.btnOverOn.enabled = false;
					this.btnOverOff.enabled = true;
				} else {
					this.btnOverOn.enabled = true;
					this.btnOverOff.enabled = false;
				}
			} else {
				this.btnOverRed.enabled = false;
				this.btnOverOn.enabled = true;
				this.btnOverOff.enabled = true;
			}
			if (this.tileentity.getAllowAllToEdit()) {
				this.btnLockEditing.displayString = "Disallow Editing";
			} else {
				this.btnLockEditing.displayString = "Allow Editing";
			}
			if (this.tileentity.getUsername().equalsIgnoreCase(""))
			{
				this.btnLockEditing.enabled = false;
				this.btnLock.displayString = "Lock Controls";
			}
			else
			{
				this.btnLock.displayString = "Unlock Controls";

				if (!this.player.getDisplayName().equalsIgnoreCase(this.tileentity.getUsername()) && !this.tileentity.getAllowAllToEdit())
				{
					this.btnOverOn.enabled = false;
					this.btnOverOff.enabled = false;
					this.btnOverRed.enabled = false;
					this.btnModp1.enabled = false;
					this.btnModp5.enabled = false;
					this.btnModm1.enabled = false;
					this.btnModm5.enabled = false;
				}
				if (this.player.getDisplayName().equalsIgnoreCase(this.tileentity.getUsername()))
				{
					this.btnLock.enabled = true;
					this.btnLockEditing.enabled = true;
				}
				else
				{
					this.btnLock.enabled = false;
					this.btnLockEditing.enabled = false;
				}
			}
		}
		super.updateScreen();
	}

	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (guibutton.id == 1)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)1, (byte)0));
			if (this.mc.theWorld.getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LightBridgeGenIdle)
			{
				this.mc.displayGuiScreen(null);
			}
		}
		else if (guibutton.id == 2)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)2, (byte)0));
			if (this.mc.theWorld.getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LightBridgeGenActive)
			{
				this.mc.displayGuiScreen(null);
			}
		}
		else if (guibutton.id == 3)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)3, (byte)0));
			if ((this.mc.theWorld.getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LightBridgeGenActive && !this.mc.theWorld.isBlockIndirectlyGettingPowered(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord)) || (this.mc.theWorld.getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LightBridgeGenIdle && this.mc.theWorld.isBlockIndirectlyGettingPowered(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord)))
			{
				this.mc.displayGuiScreen(null);
			}
		}
		else if (guibutton.id == 4)
		{
			if (this.btnLock.displayString.equalsIgnoreCase("Lock Controls")) {
				Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-1, (byte)0));
			} else {
				Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-2, (byte)0));
			}
		}
		else if (guibutton.id == 5)
		{
			if (this.btnLockEditing.displayString.equalsIgnoreCase("Allow Editing")) {
				Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-3, (byte)0));
			} else {
				Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-4, (byte)0));
			}
		}
		else if (guibutton.id == 6)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)0, (byte)5));
		}
		else if (guibutton.id == 7)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)0, (byte)1));
		}
		else if (guibutton.id == 8)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)0, (byte)-1));
		}
		else if (guibutton.id == 9)
		{
			Halocraft.network.sendToServer(new PacketLightBridge(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)0, (byte)-5));
		}
	}

	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		super.mouseClicked(i, j, k);
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int i, int j, float f)
	{
		super.drawScreen(i, j, f);
	}

	/**
	 * Called when the screen is unloaded. Used to disable keyboard repeat events
	 */
	@Override
	public void onGuiClosed()
	{
		super.onGuiClosed();
	}

	/**
	 * Returns true if this GUI should pause the game when it is displayed in single-player
	 */
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		drawCenteredString(this.fontRendererObj, "Light Bridge Options", (width / 2), (height / 2) - 65, 0xffffff);
		drawCenteredString(this.fontRendererObj, "Method of Activation", (width / 2) - 25, (height / 2) - 50, 0xffffff);
		drawCenteredString(this.fontRendererObj, ""+this.tileentity.getBridgeDistance(), (width / 2) + 55, (height / 2) + 3, 0xffffff);
		drawCenteredString(this.fontRendererObj, this.tileentity.getUsername().equalsIgnoreCase("") || tileentity.getUsername() == null ? "Unlocked and Forgeable" : "Locked by: "+tileentity.getUsername(), (width / 2), (height / 2) + 60, 0xffffff);
	}
}