package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelUnscWeaponRackClosed;
import net.killerchief.halocraft.client.models.items.ModelUnscWeaponRackOpen;
import net.killerchief.halocraft.client.models.items.ModelUnscWeaponRackOpenA;
import net.killerchief.halocraft.client.models.items.ModelUnscWeaponRackOpenB;
import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.killerchief.kcweaponmod.InterfaceWeaponProperties;
import net.killerchief.kcweaponmod.ItemWeapon;
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
public class RenderUnscWeaponRack extends TileEntitySpecialRenderer {

	private final ModelUnscWeaponRackOpen modelBlock0 = new ModelUnscWeaponRackOpen();
	private final ModelUnscWeaponRackOpenA modelBlock1 = new ModelUnscWeaponRackOpenA();
	private final ModelUnscWeaponRackOpenB modelBlock2 = new ModelUnscWeaponRackOpenB();
	private final ModelUnscWeaponRackClosed modelBlock3 = new ModelUnscWeaponRackClosed();

	private static final ResourceLocation resourcelocation = new ResourceLocation(Halocraft.MODID+":textures/cmblocks/UnscWeaponRack.png");

	public RenderUnscWeaponRack() {}

	public void renderBlock(TileEntityUnscWeaponRack tileentitycbe, double par2, double par4, double par6, float par8)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glScalef(-0.99F, -1.0F, 0.99F);
		GL11.glTranslated(-0.505D, -1D, 0.505D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
		if (tileentitycbe.getBlockMetadata() == 0) {
			GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
		}

		this.bindTexture(resourcelocation);
		boolean front = tileentitycbe.isSideClosed(true);
		boolean back = tileentitycbe.isSideClosed(false);
		if (front && back)
			this.modelBlock3.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		else if (front && !back)
			this.modelBlock2.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		else if (!front && back) 
			this.modelBlock1.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		else
			this.modelBlock0.render(tileentitycbe, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glScalef(0.3F, 0.3F, 0.3F);
		GL11.glRotatef(180F, 0F, 1F, 0F);
		for (int i : new int[]{0,1,8,9}) {
			if (i==0) {
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glRotatef(-90F, 0F, 1F, 0F);
				GL11.glTranslatef(-0.06F, 1.5F, 0.0F);
				GL11.glRotatef(4F, 1F, 0F, 0F);
			} else if (i==1) {
				GL11.glTranslatef(0.9F, 0F, 0F);
			} else if (i==8) {
				GL11.glRotatef(-8F, 1F, 0F, 0F);
				GL11.glRotatef(180F, 0F, 0F, 1F);
				GL11.glTranslatef(0.8F, 3F, 0F);
			} else if (i==9) {
				GL11.glTranslatef(0.9F, 0F, 0F);
			}
			if ( ( ((i == 0 || i == 1) && !front) || ((i == 8 || i == 9) && !back) ) && tileentitycbe.getStackInSlot(i) != null && tileentitycbe.getStackInSlot(i).getItem() != null)
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
		renderBlock((TileEntityUnscWeaponRack)par1TileEntity, par2, par4, par6, par8);
	}
}