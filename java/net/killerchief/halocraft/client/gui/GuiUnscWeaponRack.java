package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.inventory.ContainerUnscWeaponRack;
import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiUnscWeaponRack extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/UnscWeaponRack.png");
	private TileEntityUnscWeaponRack tileEntity;

	public GuiUnscWeaponRack(InventoryPlayer inventoryplayer, TileEntityUnscWeaponRack tileentity, boolean frontSide)
	{
		super(new ContainerUnscWeaponRack(inventoryplayer, tileentity, frontSide));
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
		String st = StatCollector.translateToLocal("UNSC Weapon Rack");
		this.fontRendererObj.drawString(st, xSize/2 - this.fontRendererObj.getStringWidth(st)/2, 6, 0x404040);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Inventory"), 8, ySize - 94, 0x404040);
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
	}
}