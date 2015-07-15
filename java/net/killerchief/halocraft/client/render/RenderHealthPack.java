package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelHealthPack;
import net.killerchief.halocraft.tileEntities.TileEntityHealthPack;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHealthPack extends TileEntitySpecialRenderer {

	/** The ModelHealthPack instance used by the TileEntitySignRenderer */
	private final ModelHealthPack modelBlock = new ModelHealthPack();

	private static final ResourceLocation resourcelocation = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/HealthPack.png");

	public RenderHealthPack() {}

	public void renderBlock(TileEntityHealthPack tileentity, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		this.bindTexture(resourcelocation);
		//this.tileEntityRenderer.entityLivingPlayer.ignoreFrustumCheck = true;

		//GL11.glScalef(-1.0F, -1.0F, 1.0F);
		//GL11.glTranslated(-1d, -1d, 0d);

		if (tileentity.getBlockMetadata() == 0) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 0F, 0F);
		} else if (tileentity.getBlockMetadata() == 1) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 0F, -1F);
		} else if (tileentity.getBlockMetadata() == 2) {
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, 0F, -1F);
		} else if (tileentity.getBlockMetadata() == 3) {

		} else if (tileentity.getBlockMetadata() == 4) {
			GL11.glRotatef(-90F, 0F, 1F, 0F);
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glTranslatef(0F, -1F, -1F);
		} else if (tileentity.getBlockMetadata() == 5) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glTranslatef(-1F, -1F, 0F);
		} else if (tileentity.getBlockMetadata() == 6) {
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glRotatef(90F, 1F, 0F, 0F);
		} else if (tileentity.getBlockMetadata() == 7) {
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glTranslatef(-1F, 0F, -1F);
		} else if (tileentity.getBlockMetadata() == 8) {
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glTranslatef(0F, -1F, 0F);
		} else if (tileentity.getBlockMetadata() == 9) {
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(-1F, -1F, -1F);
		} else if (tileentity.getBlockMetadata() == 10) {
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glRotatef(180F, 0F, 1F, 0F);
			GL11.glTranslatef(0F, 0F, -1F);
		} else if (tileentity.getBlockMetadata() == 11) {
			GL11.glRotatef(-90F, 0F, 0F, 1F);
			GL11.glTranslatef(-1F, 0F, 0F);
		} else if (tileentity.getBlockMetadata() == 12) {
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glRotatef(90F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, -1F, 0F);
		} else if (tileentity.getBlockMetadata() == 13) {
			GL11.glRotatef(90F, 0F, 1F, 0F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			GL11.glTranslatef(-1F, -1F, -1F);
		} else if (tileentity.getBlockMetadata() == 14) {
			GL11.glRotatef(180F, 1F, 0F, 0F);
			GL11.glTranslatef(0F, -1F, -1F);
		} else if (tileentity.getBlockMetadata() == 15) {
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glRotatef(90F, 0F, 0F, 1F);
			GL11.glTranslatef(-1F, -1F, 0F);
		}
		this.modelBlock.render(tileentity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityHealthPack)par1TileEntity, par2, par4, par6, par8);
	}
}