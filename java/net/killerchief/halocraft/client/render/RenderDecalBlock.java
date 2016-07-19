package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.tileEntities.TileEntityForeSymbol;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDecalBlock extends TileEntitySpecialRenderer {

	public RenderDecalBlock() {}
	
	private static final float raise = 0.01F;

	public void renderBlock(TileEntityForeSymbol tileentity, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		
		if (tileentity.getBlockMetadata() == 0) {
			GL11.glRotatef(-90F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, 0F, raise);
		} else if (tileentity.getBlockMetadata() == 1) {
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glRotatef(-90F, 1F, 0F, 0F);
			GL11.glTranslatef(-1F, 1F, raise);
		} else if (tileentity.getBlockMetadata() == 2) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glRotatef(-90F, 1F, 0F, 0F);
			GL11.glTranslatef(-1F, 0F, raise);
		} else if (tileentity.getBlockMetadata() == 3) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glRotatef(-90F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, 1F, raise);
		} else if (tileentity.getBlockMetadata() == 4) {
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 1F, -1F+raise);
		} else if (tileentity.getBlockMetadata() == 5) {
			GL11.glTranslatef(0F, 1F, 1F-raise);
		} else if (tileentity.getBlockMetadata() == 6) {
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 1F, -raise);
		} else if (tileentity.getBlockMetadata() == 7) {
			GL11.glTranslatef(0F, 1F, raise);
		} else if (tileentity.getBlockMetadata() == 8) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 1F, 1F-raise);
		} else if (tileentity.getBlockMetadata() == 9) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 1F, -1F+raise);
		} else if (tileentity.getBlockMetadata() == 10) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 1F, raise);
		} else if (tileentity.getBlockMetadata() == 11) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 1F, -raise);
		} else if (tileentity.getBlockMetadata() == 12) {
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, 1F, -1F+raise);
		} else if (tileentity.getBlockMetadata() == 13) {
			GL11.glRotatef(-90F, 1F, 0F, 0F);
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 0F, -1F+raise);
		} else if (tileentity.getBlockMetadata() == 14) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glTranslatef(-1F, 1F, -1F+raise);
		} else if (tileentity.getBlockMetadata() == 15) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, 0F, -1F+raise);
		}
		
		this.bindTexture(TextureMap.locationBlocksTexture);
		IIcon icon = tileentity.getBlockType().getIcon(0, 0);
		
		GL11.glDisable(GL11.GL_LIGHTING);
		//OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 200f, 200f);
		
		GL11.glTranslatef(1F, 0F, 0F);
		
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glEnable(GL11.GL_BLEND);
		
		Tessellator tessellator = Tessellator.instance;
		float f = icon.getMinU();
		float f1 = icon.getMaxU();
		float f2 = icon.getMinV();
		float f3 = icon.getMaxV();
		float f4 = 1.0F;
		float f5 = 1.0F;
		float f6 = 1.0F;
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		tessellator.addVertexWithUV((double)(0.0F - f5), (double)(0.0F - f6), 0.0D, (double)f, (double)f3);
		tessellator.addVertexWithUV((double)(f4 - f5), (double)(0.0F - f6), 0.0D, (double)f1, (double)f3);
		tessellator.addVertexWithUV((double)(f4 - f5), (double)(f4 - f6), 0.0D, (double)f1, (double)f2);
		tessellator.addVertexWithUV((double)(0.0F - f5), (double)(f4 - f6), 0.0D, (double)f, (double)f2);
		tessellator.draw();
		
		GL11.glRotatef(180F, 0F, 1F, 0F);
		GL11.glTranslatef(1F, 0F, 0F);
		
		Tessellator tessellator2 = Tessellator.instance;
		float ff = icon.getMaxU();
		float ff1 = icon.getMinU();
		tessellator2.startDrawingQuads();
		tessellator2.setNormal(0.0F, 1.0F, 0.0F);
		tessellator2.addVertexWithUV((double)(0.0F - f5), (double)(0.0F - f6), 0.0D, (double)ff, (double)f3);
		tessellator2.addVertexWithUV((double)(f4 - f5), (double)(0.0F - f6), 0.0D, (double)ff1, (double)f3);
		tessellator2.addVertexWithUV((double)(f4 - f5), (double)(f4 - f6), 0.0D, (double)ff1, (double)f2);
		tessellator2.addVertexWithUV((double)(0.0F - f5), (double)(f4 - f6), 0.0D, (double)ff, (double)f2);
		tessellator2.draw();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityForeSymbol)par1TileEntity, par2, par4, par6, par8);
	}
}