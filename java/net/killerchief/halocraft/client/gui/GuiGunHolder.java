package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.comm.packetHandlers.PacketGunHolder;
import net.killerchief.halocraft.inventory.ContainerGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiGunHolder extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/GunHolder.png");
	private TileEntityGunHolder tileentity;
	private GuiButton btnModifyPlacement;
	private GuiButton btnSetContents;
	private GuiButton btnRespawnPS;
	private GuiButton btnRespawnPL;
	private GuiButton btnRespawnMS;
	private GuiButton btnRespawnML;
	private EntityPlayer player;

	public GuiGunHolder(InventoryPlayer inventoryplayer, TileEntityGunHolder tileentitygunholder, boolean showItemStacks)
	{
		super(new ContainerGunHolder(inventoryplayer, tileentitygunholder, showItemStacks));
		this.tileentity = tileentitygunholder;
		player = inventoryplayer.player;
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		this.btnModifyPlacement = new GuiButton(1, (width / 2) - 16, (height / 2) - 76, 94, 16, "Modify Placement");
		this.btnSetContents = new GuiButton(2, (width / 2) + 2, (height / 2) - 55, 76, 12, "Set Contents");
		this.btnRespawnPS = new GuiButton(3, (width / 2) + 44, (height / 2) - 40, 16, 12, "+1");
		this.btnRespawnPL = new GuiButton(4, (width / 2) + 61, (height / 2) - 40, 20, 12, "+20");
		this.btnRespawnMS = new GuiButton(5, (width / 2) + 44, (height / 2) - 18, 16, 12, "-1");
		this.btnRespawnML = new GuiButton(6, (width / 2) + 61, (height / 2) - 18, 20, 12, "-20");
		this.buttonList.add(this.btnModifyPlacement);
		this.buttonList.add(this.btnSetContents);
		this.buttonList.add(this.btnRespawnPS);
		this.buttonList.add(this.btnRespawnPL);
		this.buttonList.add(this.btnRespawnMS);
		this.buttonList.add(this.btnRespawnML);
		//		this.btnSetContents.enabled = false;
		//		this.btnRespawnPS.enabled = false;
		//		this.btnRespawnPL.enabled = false;
		//		this.btnRespawnMS.enabled = false;
		//		this.btnRespawnML.enabled = false;
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen()
	{
		//		if (player.canCommandSenderUseCommand(2, "HCGunHolder")) {
		//			this.btnSetContents.enabled = true;
		//			this.btnRespawnPS.enabled = true;
		//			this.btnRespawnPL.enabled = true;
		//			this.btnRespawnMS.enabled = true;
		//			this.btnRespawnML.enabled = true;
		//		} else {
		//			this.btnSetContents.enabled = false;
		//			this.btnRespawnPS.enabled = false;
		//			this.btnRespawnPL.enabled = false;
		//			this.btnRespawnMS.enabled = false;
		//			this.btnRespawnML.enabled = false;
		//		}
		super.updateScreen();
	}

	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (guibutton.id == 1) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)22));
		}
		else if (guibutton.id == 2) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)23));
		}
		else if (guibutton.id == 3) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)24));
		}
		else if (guibutton.id == 4) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)25));
		}
		else if (guibutton.id == 5) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)26));
		}
		else if (guibutton.id == 6) {
			Halocraft.network.sendToServer(new PacketGunHolder(this.tileentity.xCoord, this.tileentity.yCoord, this.tileentity.zCoord, (byte)27));
		}
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Gun Holder"), 10, 6, 0x404040);
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
		this.drawCenteredString(this.fontRendererObj, "Respawn", (width / 2) + 17, (height / 2) - 33, 0xffffff);
		this.drawCenteredString(this.fontRendererObj, "Time (sec)", (width / 2) + 17, (height / 2) - 23, 0xffffff);
		this.drawCenteredString(this.fontRendererObj, ""+this.tileentity.getRespawnTime(), (width / 2) + 61, (height / 2) - 27, 0xffffff);

		if (this.tileentity.getRespawnTime() > 0) {
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glColor4f(1.0F,1.0F,1.0F, 0.3F);
			this.mc.getTextureManager().bindTexture(TextureMap.locationItemsTexture);
			for (int k = 0; k < 2; k++) {
				ItemStack is0 = tileentity.ContainerRespawnItemStacks[0];
				if (is0 != null) {
					IIcon iicon = is0.getIconIndex();
					if (iicon != null) {
						this.drawTexturedModelRectFromIcon((width / 2) - 62, (height / 2) - 61, iicon, 16, 16);
					}
				}
				ItemStack is1 = tileentity.ContainerRespawnItemStacks[1];
				if (is1 != null) {
					IIcon iicon = is1.getIconIndex();
					if (iicon != null) {
						this.drawTexturedModelRectFromIcon((width / 2) - 80, (height / 2) - 33, iicon, 16, 16);
					}
				}
				ItemStack is2 = tileentity.ContainerRespawnItemStacks[2];
				if (is2 != null) {
					IIcon iicon = is2.getIconIndex();
					if (iicon != null) {
						this.drawTexturedModelRectFromIcon((width / 2) - 62, (height / 2) - 33, iicon, 16, 16);
					}
				}
				ItemStack is3 = tileentity.ContainerRespawnItemStacks[3];
				if (is3 != null) {
					IIcon iicon = is3.getIconIndex();
					if (iicon != null) {
						this.drawTexturedModelRectFromIcon((width / 2) - 44, (height / 2) - 33, iicon, 16, 16);
					}
				}
				ItemStack is4 = tileentity.ContainerRespawnItemStacks[4];
				if (is4 != null) {
					IIcon iicon = is4.getIconIndex();
					if (iicon != null) {
						this.drawTexturedModelRectFromIcon((width / 2) - 26, (height / 2) - 33, iicon, 16, 16);
					}
				}
				if (k == 0)
					this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
			}
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_LIGHTING);
		}
	}
}