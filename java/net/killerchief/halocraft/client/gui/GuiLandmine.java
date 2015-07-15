package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.comm.packetHandlers.PacketLandmine;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.killerchief.halocraft.inventory.ContainerLandmine;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiLandmine extends GuiContainer {

	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/Landmine.png");
	private TileEntityLandmine tileentity;
	private EntityPlayer player;
	private GuiButton btnActivate;
	private GuiButton btnLock;
	private GuiButton btnLockHack;
	private boolean hacking = false;

	public GuiLandmine(InventoryPlayer par1InventoryPlayer, TileEntityLandmine par2TileEntityLandmine)
	{
		super(new ContainerLandmine(par1InventoryPlayer, par2TileEntityLandmine));
		this.player = par1InventoryPlayer.player;
		this.tileentity = par2TileEntityLandmine;
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
		this.btnActivate = new GuiButton(1, (width / 2) - 40, (height / 2) - 40, 80, 20, "Arm Mine");
		this.btnLock = new GuiButton(2, (width / 2) - 45, (height / 2) + 20, 90, 20, "Lock Controls");
		this.btnLockHack = new GuiButton(3, (width / 2) - 45, (height / 2) + 0, 90, 20, "Hack Controls");
		this.btnLockHack.enabled = false;
		this.btnLockHack.visible = false;
		this.buttonList.add(this.btnActivate);
		this.buttonList.add(this.btnLock);
		this.buttonList.add(this.btnLockHack);

		//GuiButton(int id, int xPosition, int yPosition, int width, int height, String displayString)
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen()
	{
		if (this.btnLock != null && !this.hacking)
		{
			this.btnLockHack.enabled = false;
			this.btnLockHack.visible = false;
			if (this.tileentity.getWorldObj().getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LandmineActive)
			{
				this.btnActivate.displayString = "Disarm Mine";
			}
			else
			{
				this.btnActivate.displayString = "Arm Mine";
			}
			if (this.tileentity.getUsername().equalsIgnoreCase(""))
			{
				this.btnLock.enabled = true;
				this.btnLock.displayString = "Lock Controls";
				this.btnActivate.enabled = true;
			}
			else
			{
				this.btnLock.displayString = "Unlock Controls";

				if (this.player.getDisplayName().equalsIgnoreCase(this.tileentity.getUsername()))
				{
					this.btnLock.enabled = true;
					this.btnActivate.enabled = true;
				}
				else
				{
					this.btnLock.enabled = false;
					this.btnActivate.enabled = false;
					this.btnLockHack.enabled = true;
					this.btnLockHack.visible = true;
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
			if (this.btnActivate.displayString.equalsIgnoreCase("Arm Mine")) {
				Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)1));
			} else {
				Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)2));
			}
			this.mc.displayGuiScreen(null);
		}
		else if (guibutton.id == 2)
		{
			if (this.btnLock.displayString.equalsIgnoreCase("Lock Controls")) {
				Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-1));
			} else {
				Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-2));
			}
		}
		else if (guibutton.id == 3)
		{
			Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)3));
			this.hacking = true;
			this.btnLockHack.enabled = false;
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
		if (this.hacking || this.tileentity.isHackInProgress())
		{
			Halocraft.network.sendToServer(new PacketLandmine(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)4));
		}
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
		this.mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		if (this.hacking)
		{
			int w = (this.width/2) - 80;
			int h = (this.height/2) - 18;
			drawTexturedModalRect(w, h, 0, 156, 158, 16);
			drawTexturedModalRect(w+1, h+1, 0, 173, this.tileentity.getHackingProgress(), 14);
		}
		drawCenteredString(this.fontRendererObj, "Landmine", (width / 2), (height / 2) - 60, 0xffffff);
		if (this.player.getDistanceSq(this.tileentity.xCoord + 0.5D, this.tileentity.yCoord + 0.5D, this.tileentity.zCoord + 0.5D) < 3D && this.tileentity.getWorldObj().getBlock(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord) == HalocraftBlocks.LandmineIdle && (this.tileentity.getUsername().equalsIgnoreCase("") || this.player.getDisplayName().equalsIgnoreCase(this.tileentity.getUsername())))
		{
			drawCenteredString(this.fontRendererObj, "Proximity Warning!", (width / 2), (height / 2) - 15, 0xff0000);
		}
		if (this.btnLockHack.enabled)
		{
			drawCenteredString(this.fontRendererObj, "Mine hacking is risky!", (width / 2), (height / 2) - 15, 0xff0000);
		}
		drawCenteredString(this.fontRendererObj, this.tileentity.getUsername().equalsIgnoreCase("") || tileentity.getUsername() == null ? "Unlocked and Forgeable" : "Locked by: "+tileentity.getUsername(), (width / 2), (height / 2) + 50, 0xffffff);
	}
}