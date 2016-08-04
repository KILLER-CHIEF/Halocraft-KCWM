package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCase;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCaseFullyOpen;
import net.killerchief.halocraft.client.models.items.ModelCovSupplyCaseHalfOpen;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.killerchief.kcweaponmod.InterfaceWeaponProperties;
import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
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
		GL11.glScalef(-1.0F, -0.96F, 1.0F);
		GL11.glTranslated(-0.5D, -0.96D, 0.5D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
		if (tileentitycbe.getBlockMetadata() == 0) {
			GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
		}
		
		this.bindTexture(resourcelocation1);
		boolean front = !tileentitycbe.isSideClosed(true);
		boolean back = !tileentitycbe.isSideClosed(false);
		if (front && back)
			this.modelBlock3.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		else if (front && !back)
			this.modelBlock2.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		else if (!front && back) {
			GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			this.modelBlock2.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glRotatef(-180.0F, 0.0F, 1.0F, 0.0F);
		} else
			this.modelBlock1.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		GL11.glScalef(0.4F, 0.4F, 0.4F);
		for (int i : new int[]{4,5,12,13}) {
			if (i==4) {
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glRotatef(-90F, 0F, 1F, 0F);
				GL11.glTranslatef(-0.6F, 1F, 0.3F);
				GL11.glRotatef(4F, 1F, 0F, 0F);
			} else if (i==5) {
				GL11.glTranslatef(0.9F, 0F, 0F);
			} else if (i==12) {
				GL11.glRotatef(-8F, 1F, 0F, 0F);
				GL11.glRotatef(180F, 0F, 0F, 1F);
				GL11.glTranslatef(-0.3F, 2F, 0F);
			} else if (i==13) {
				GL11.glTranslatef(0.9F, 0F, 0F);
			}
			if ( ( ((i == 4 || i == 5) && front) || ((i == 12 || i == 13) && back) ) && tileentitycbe.getStackInSlot(i) != null && tileentitycbe.getStackInSlot(i).getItem() != null)
			{
				
				Model3DWeaponBase gunModel = null;
				InterfaceWeaponProperties gun = null;
				boolean glows = false;
				
				Item item = tileentitycbe.getStackInSlot(i).getItem();
				if (item instanceof InterfaceWeaponProperties && ((InterfaceWeaponProperties)item).Properties().WeaponModel != null && ((InterfaceWeaponProperties)item).Properties().WeaponModel.Model instanceof Model3DWeaponBase)
				{
					gun = (InterfaceWeaponProperties)item;
					this.bindTexture(gun.Properties().WeaponModel.Texture);
					gunModel = (Model3DWeaponBase) gun.Properties().WeaponModel.Model;
					glows = gun.Properties().WeaponModel.Glows;
				}
				
				if (gunModel != null)
				{
					if (glows)
					{
						GL11.glDisable(GL11.GL_LIGHTING);
						OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
					}
					if (gun.Properties().WeaponModel.TPScaleX < 0.8F)
						GL11.glScalef(gun.Properties().WeaponModel.TPScaleX, gun.Properties().WeaponModel.TPScaleY, gun.Properties().WeaponModel.TPScaleZ);
					gunModel.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					if (gun.Properties().WeaponModel.TPScaleX < 0.8F)
						GL11.glScalef(1/gun.Properties().WeaponModel.TPScaleX, 1/gun.Properties().WeaponModel.TPScaleY, 1/gun.Properties().WeaponModel.TPScaleZ);
					if (glows)
					{
						GL11.glEnable(GL11.GL_LIGHTING);
					}
				}
			}
		}
		
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityCovSupplyCase)par1TileEntity, par2, par4, par6, par8);
	}
}