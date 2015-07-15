package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.comm.packetHandlers.PacketGunHolder;
import net.killerchief.halocraft.inventory.ContainerGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiGunHolder extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/GunHolder.png");
	private TileEntityGunHolder tileentity;
	private GuiButton btnMountSwap;
	private GuiButton btnMountRotate;
	private GuiButton btnGunRotaTrans;
	private GuiButton btnGunXP;
	private GuiButton btnGunXM;
	private GuiButton btnGunYP;
	private GuiButton btnGunYM;
	private GuiButton btnGunZP;
	private GuiButton btnGunZM;

	public GuiGunHolder(InventoryPlayer inventoryplayer, TileEntityGunHolder tileentitygunholder)
	{
		super(new ContainerGunHolder(inventoryplayer, tileentitygunholder));
		this.tileentity = tileentitygunholder;
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		this.btnMountSwap = new GuiButton(1, (width / 2) - 25, (height / 2) - 56, 54, 15, "Swap Side");
		this.btnMountRotate = new GuiButton(2, (width / 2) + 30, (height / 2) - 56, 50, 15, "Rotate");
		this.btnGunRotaTrans = new GuiButton(3, (width / 2) - 4, (height / 2) - 37, 84, 12, "Translate Mode");
		this.btnGunXP = new GuiButton(4, (width / 2) + 20, (height / 2) - 24, 14, 11, "X+");
		this.btnGunXM = new GuiButton(5, (width / 2) + 20, (height / 2) - 13, 14, 11, "X-");
		this.btnGunYP = new GuiButton(6, (width / 2) + 43, (height / 2) - 24, 14, 11, "Y+");
		this.btnGunYM = new GuiButton(7, (width / 2) + 43, (height / 2) - 13, 14, 11, "Y-");
		this.btnGunZP = new GuiButton(8, (width / 2) + 66, (height / 2) - 24, 14, 11, "Z+");
		this.btnGunZM = new GuiButton(9, (width / 2) + 66, (height / 2) - 13, 14, 11, "Z-");
		this.buttonList.add(this.btnMountSwap);
		this.buttonList.add(this.btnMountRotate);
		this.buttonList.add(this.btnGunRotaTrans);
		this.buttonList.add(this.btnGunXP);
		this.buttonList.add(this.btnGunXM);
		this.buttonList.add(this.btnGunYP);
		this.buttonList.add(this.btnGunYM);
		this.buttonList.add(this.btnGunZP);
		this.buttonList.add(this.btnGunZM);
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen()
	{

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
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)20));
		}
		else if (guibutton.id == 2)
		{
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)21));
		}
		else if (guibutton.id == 3)
		{
			if (this.btnGunRotaTrans.displayString.equalsIgnoreCase("Translate Mode"))
			{
				this.btnGunRotaTrans.displayString = "Rotate Mode";
			}
			else
			{
				this.btnGunRotaTrans.displayString = "Translate Mode";
			}
		}
		else if (this.btnGunRotaTrans.displayString.equalsIgnoreCase("Translate Mode"))
		{
			if (guibutton.id == 4) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)1));
			}
			if (guibutton.id == 5) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)2));
			}
			if (guibutton.id == 6) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)3));
			}
			if (guibutton.id == 7) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)4));
			}
			if (guibutton.id == 8) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)5));
			}
			if (guibutton.id == 9) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)6));
			}
		}
		else
		{
			if (guibutton.id == 4) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-1));
			}
			if (guibutton.id == 5) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-2));
			}
			if (guibutton.id == 6) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-3));
			}
			if (guibutton.id == 7) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-4));
			}
			if (guibutton.id == 8) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-5));
			}
			if (guibutton.id == 9) {
				Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)-6));
			}
		}
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Gun Holder"), 64, 6, 0x404040);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Inventory"), 8, (ySize - 96) + 2, 0x404040);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(this.texture);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
		this.drawCenteredString(this.fontRendererObj, "Gun Mount", (width / 2) + 30, (height / 2) - 66, 0xffffff);
		this.drawCenteredString(this.fontRendererObj, "Gun", (width / 2) + 6, (height / 2) - 18, 0xffffff);
	}
}