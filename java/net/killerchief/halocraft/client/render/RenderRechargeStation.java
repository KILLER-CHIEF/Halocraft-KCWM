package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.items.ModelRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRechargeStation extends TileEntitySpecialRenderer {

	private final Model3DBase modelBlock = new ModelRechargeStation();

	private static final ResourceLocation rlBlock = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/RechargeStation.png");

	public RenderRechargeStation() {}

	public void renderBlock(TileEntityRechargeStation tileentitycbe, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glScalef(-1.0F, -1F, 1.0F);
		GL11.glTranslated(-0.5D, -1D, 0.5D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

		this.bindTexture(this.rlBlock);
		this.modelBlock.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityRechargeStation)par1TileEntity, par2, par4, par6, par8);
	}
}