package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelLightBridgeExt;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeExt;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLightBridgeExt extends TileEntitySpecialRenderer {

	private static ModelLightBridgeExt modelBlock = new ModelLightBridgeExt();
	private static ResourceLocation resourcelocation = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/SkinLightBridgeExt.png");

	public RenderLightBridgeExt() {}

	public void renderBlock(TileEntityLightBridgeExt tileentity, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		this.bindTexture(resourcelocation);
		GL11.glTranslatef(0F, 1F, 1F);

		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F,1.0F,1.0F,(0.15F*tileentity.deathTimer)+0.2F);
		GL11.glDisable(GL11.GL_LIGHTING);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);

		this.bindTexture(resourcelocation);
		if (tileentity.renderType == 1) {
			this.modelBlock.renderModel(true, 4, 0.0625F);
		}
		else if (tileentity.renderType == 2) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 0F, 1F);
			this.modelBlock.renderModel(true, 4, 0.0625F);
			GL11.glTranslatef(0F, 0F, -1F);
			GL11.glRotatef(-90F, 0F, 1F, 0F);
		}
		else {
			this.modelBlock.renderModel(true, 5, 0.0625F);
		}
		GL11.glRotatef(-90F, 0F, 1F, 0F);
		GL11.glTranslatef(-1F, 0F, 0F);
		if (tileentity.renderEdges[0] != 0)
		{
			this.modelBlock.renderModel(false, tileentity.renderEdges[1], 0.0625F);
			this.modelBlock.renderModel(true, tileentity.renderEdges[2], 0.0625F);
		}
		GL11.glRotatef(180F, 0F, 1F, 0F);
		GL11.glTranslatef(-1F, 0F, 1F);
		if (tileentity.renderEdges[3] != 0)
		{
			this.modelBlock.renderModel(true, tileentity.renderEdges[4], 0.0625F);
			this.modelBlock.renderModel(false, tileentity.renderEdges[5], 0.0625F);
		}
		GL11.glRotatef(-90F, 0F, 1F, 0F);
		GL11.glTranslatef(-1F, 0F, 0F);
		if (tileentity.renderEdges[6] != 0)
		{
			this.modelBlock.renderModel(true, tileentity.renderEdges[7], 0.0625F);
			this.modelBlock.renderModel(false, tileentity.renderEdges[8], 0.0625F);
		}
		GL11.glRotatef(180F, 0F, 1F, 0F);
		GL11.glTranslatef(-1F, 0F, 1F);
		if (tileentity.renderEdges[9] != 0)
		{
			this.modelBlock.renderModel(false, tileentity.renderEdges[10], 0.0625F);
			this.modelBlock.renderModel(true, tileentity.renderEdges[11], 0.0625F);
		}
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityLightBridgeExt)par1TileEntity, par2, par4, par6, par8);
	}
}