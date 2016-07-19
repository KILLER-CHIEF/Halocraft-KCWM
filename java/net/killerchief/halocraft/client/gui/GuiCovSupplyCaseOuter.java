package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.inventory.ContainerCovSupplyCase;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiCovSupplyCaseOuter extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/CovSupplyCaseOuter.png");
	private TileEntityCovSupplyCase tileEntity;

	public GuiCovSupplyCaseOuter(InventoryPlayer inventoryplayer, TileEntityCovSupplyCase tileentity, boolean outer, boolean frontSide)
	{
		super(new ContainerCovSupplyCase(inventoryplayer, tileentity, outer, frontSide));
		this.tileEntity = tileentity;
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
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
	protected void actionPerformed(GuiButton guibutton) {}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String st = StatCollector.translateToLocal("Covenant Supply Crate");
		this.fontRendererObj.drawString(st, xSize/2 - this.fontRendererObj.getStringWidth(st)/2, 6, 0x404040);
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
		this.drawString(this.fontRendererObj, "Outer Armor Plate", (width / 2) - 70, (height / 2) - 57, 0xffffff);
		this.drawString(this.fontRendererObj, "Power Supply", (width / 2) - 70, (height / 2) - 29, 0xffffff);
	}
}