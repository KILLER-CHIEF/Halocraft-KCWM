package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelLightBridgeExt;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeExt;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLightBridgeExt extends TileEntitySpecialRenderer {

	/** The ModelHealthPack instance used by the TileEntitySignRenderer */
	private final ModelLightBridgeExt modelBlock = new ModelLightBridgeExt();

	private static final ResourceLocation resourcelocation = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/LightBridgeExt.png");

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
		
		//this.modelBlock.renderModel(1, 0.0625F);
		this.modelBlock.renderModel(2, 0.0625F);
		this.modelBlock.renderModel(3, 0.0625F);
		this.modelBlock.renderModel(4, 0.0625F);
		
		if (tileentity.renderType == 2) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 0F, 1F);
		}
		if (tileentity.renderType != 0)
			this.modelBlock.renderModel(0, 0.0625F);
		
		
		//this.modelBlock.render(tileentity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityLightBridgeExt)par1TileEntity, par2, par4, par6, par8);
	}
}