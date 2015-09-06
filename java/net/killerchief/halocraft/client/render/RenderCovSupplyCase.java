package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCase;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCaseFullyOpen;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCaseHalfOpen;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCovSupplyCase extends TileEntitySpecialRenderer {

	private final ModelCovSupplyCase modelBlock1 = new ModelCovSupplyCase();
	private final ModelCovSupplyCaseHalfOpen modelBlock2 = new ModelCovSupplyCaseHalfOpen();
	private final ModelCovSupplyCaseFullyOpen modelBlock3 = new ModelCovSupplyCaseFullyOpen();

	private static final ResourceLocation resourcelocation1 = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/SupplyCase.png");
	private static final ResourceLocation resourcelocation2 = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/SupplyCaseInfected.png");

	public RenderCovSupplyCase() {}

	public void renderBlock(TileEntityCovSupplyCase tileentitycbe, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		this.bindTexture(resourcelocation2);
		//this.bindTextureByName("/mods/KCHalocraft/textures/cmblocks/CustomBlockModel.png");
		//GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		//GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		//float var12 = 0.75F;
		//GL11.glScalef(var12, var12, var12);
		//GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
		//GL11.glScalef(-1.0F, -1.0F, 1.0F);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		GL11.glTranslated(-1d, -1d, 0d);
		GL11.glTranslated(0.5D, 0D, 0.5D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		this.modelBlock2.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityCovSupplyCase)par1TileEntity, par2, par4, par6, par8);
	}
}