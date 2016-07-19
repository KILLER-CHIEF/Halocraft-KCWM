package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.inventory.ContainerRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiRechargeStation extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/gui/RechargeStation.png");

	public GuiRechargeStation(InventoryPlayer inventoryplayer, TileEntityRechargeStation tileEntityRechargeStation)
	{
		super(new ContainerRechargeStation(inventoryplayer, tileEntityRechargeStation));
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		fontRendererObj.drawString(StatCollector.translateToLocal("Recharge Station"), 40, 6, 0x404040);
		fontRendererObj.drawString(StatCollector.translateToLocal("Inventory"), 8, (ySize - 96) + 2, 0x404040);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(this.texture);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, this.xSize, this.ySize);

		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F,1.0F,1.0F, 0.3F);
		this.mc.getTextureManager().bindTexture(TextureMap.locationItemsTexture);
		IIcon iicon = new ItemStack(HalocraftItems.PlasmaPowerCore).getIconIndex();
		this.drawTexturedModelRectFromIcon((width / 2) - 8, (height / 2) - 27, iicon, 16, 16);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_LIGHTING);
	}
}