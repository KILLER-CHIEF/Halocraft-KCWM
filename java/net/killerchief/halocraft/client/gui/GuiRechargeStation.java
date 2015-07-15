package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.inventory.ContainerRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiRechargeStation extends GuiContainer
{
	//private ResourceLocation tif = new ResourceLocation("minecraft", "textures/gui/container/furnace.png");
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/RechargeStation.png");
	private TileEntityRechargeStation RechargeStationInventory;

	public GuiRechargeStation(InventoryPlayer inventoryplayer, TileEntityRechargeStation tileEntityRechargeStation)
	{
		super(new ContainerRechargeStation(inventoryplayer, tileEntityRechargeStation));
		RechargeStationInventory = tileEntityRechargeStation;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		fontRendererObj.drawString(StatCollector.translateToLocal("Recharge Station"), 40, 6, 0x404040);
		fontRendererObj.drawString(StatCollector.translateToLocal("Inventory"), 8, (ySize - 96) + 2, 0x404040);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(texture);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);

		if (RechargeStationInventory.isBurning())
		{
			int j1 = RechargeStationInventory.getBurnTimeRemainingScaled(12);
			drawTexturedModalRect(l + 56, (i1 + 36 + 12) - j1, 176, 12 - j1, 14, j1 + 2);
		}

		int k1 = RechargeStationInventory.getCookProgressScaled(24);
		drawTexturedModalRect(l + 79, i1 + 34, 176, 14, k1 + 1, 16);
	}
}