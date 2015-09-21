package net.killerchief.kcweaponmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderProjectile extends Render {

	//ResourceLocation RL2DRenders = TextureMap.locationItemsTexture;//new ResourceLocation("textures/atlas/items.png");

	public RenderProjectile()
	{
		this.shadowSize = 0.2F;
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		EntityProjectile proj = (EntityProjectile)par1Entity;
		ProjRenderProp projProp = KCWeaponMod.weapons[proj.getPropertiesID()].Properties.ProjRenderProp;

		if (projProp == null || projProp.RenderType < 0)
		{
			if (projProp == null) {
				projProp = new ProjRenderProp();
			}

			String[] name = KCWeaponMod.weapons[proj.getPropertiesID()].Properties.ProjectileRenderProperties.split("#");

			if (name.length <= 1)
			{
				projProp.RenderType = 0;
				projProp.ResLocBullet = new ResourceLocation(name[0]);
			}
			else
			{
				projProp.RenderType = Integer.parseInt(name[0]);
				if (projProp.RenderType == 0 || projProp.RenderType == 3)
				{
					projProp.ResLocBullet = new ResourceLocation(name[1]);
				}
				else if (projProp.RenderType == 1)
				{
					projProp.ResLocTwoDee = new ResourceLocation(name[1]);
				}
				else if (projProp.RenderType == 2 && name.length >= 3)
				{
					projProp.ResLocModel = new ResourceLocation(name[1]);
					projProp.ModelClass = name[2];
				}
				else
				{
					System.err.println("KCWeaponMod - Error: Projectile Render Properties are invalid!");
					projProp.RenderType = 0;
				}
			}
		}
		if (projProp != null && projProp.RenderType >= 0)
		{
			GL11.glPushMatrix();
			if (proj.Glows)
			{
				GL11.glDisable(GL11.GL_LIGHTING);
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
			}
			if (projProp.RenderType == 0)
			{
				this.renderBullet(proj, projProp, par2, par4, par6, par8, par9);
			}
			else if (projProp.RenderType == 3)
			{
				this.renderLargeProjectile(proj, projProp, par2, par4, par6, par8, par9);
			}
			else if (projProp.RenderType == 1)
			{
				this.render2DImageOverEntity(proj, projProp, par2, par4, par6, par8, par9);
			}
			else if (projProp.RenderType == 2)
			{
				try {
					this.renderEntityModel(((Class<? extends ModelBase>) Class.forName(projProp.ModelClass)).newInstance(), proj, projProp, par2, par4, par6, par8, par9);
				} catch (InstantiationException e) {
					System.err.println("The 3D Model Class \""+projProp.ModelClass+"\" cannot be instantiated!");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					System.err.println("The 3D Model Class \""+projProp.ModelClass+"\" cannot be accessed!");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					System.err.println("The 3D Model Class \""+projProp.ModelClass+"\" does not exist!");
					e.printStackTrace();
				}
			}
			else
			{
				System.err.println("KCWeaponMod - WARNING: Projectile RenderType is not valid! "+projProp.RenderType);
			}
			if (proj.Glows)
			{
				GL11.glEnable(GL11.GL_LIGHTING);
			}
			GL11.glPopMatrix();
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return null;
	}

	public void renderBullet(EntityProjectile proj, ProjRenderProp projProp, double par2, double par4, double par6, float par8, float par9)
	{
		if (projProp.ResLocBullet != null)
			this.bindTexture(projProp.ResLocBullet);
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(proj.prevRotationYaw + (proj.rotationYaw - proj.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(proj.prevRotationPitch + (proj.rotationPitch - proj.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		Tessellator tessellator = Tessellator.instance;
		byte b0 = 0;
		float f2 = 0.0F;
		float f3 = 0.5F;
		float f4 = (float)(0 + b0 * 10) / 32.0F;
		float f5 = (float)(5 + b0 * 10) / 32.0F;
		float f6 = 0.0F;
		float f7 = 0.15625F;
		float f8 = (float)(5 + b0 * 10) / 32.0F;
		float f9 = (float)(10 + b0 * 10) / 32.0F;
		float f10 = 0.05625F;
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);

		GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(f10, f10, f10);
		GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
		GL11.glNormal3f(f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f8);
		tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f8);
		tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f9);
		tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f9);
		tessellator.draw();
		GL11.glNormal3f(-f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double)f6, (double)f8);
		tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double)f7, (double)f8);
		tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double)f7, (double)f9);
		tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double)f6, (double)f9);
		tessellator.draw();

		for (int i = 0; i < 4; ++i)
		{
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glNormal3f(0.0F, 0.0F, f10);
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double)f2, (double)f4);
			tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, (double)f3, (double)f4);
			tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, (double)f3, (double)f5);
			tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double)f2, (double)f5);
			tessellator.draw();
		}

		GL11.glDisable(GL12.GL_RESCALE_NORMAL);

	}

	public void renderLargeProjectile(EntityProjectile proj, ProjRenderProp projProp, double par2, double par4, double par6, float par8, float par9)
	{
		if (projProp.ResLocBullet != null)
			this.bindTexture(projProp.ResLocBullet);
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(proj.prevRotationYaw + (proj.rotationYaw - proj.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(proj.prevRotationPitch + (proj.rotationPitch - proj.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		Tessellator tessellator = Tessellator.instance;
		float f1 = 0.0F;
		float f2 = 0F;
		float f3 = 1F;
		float f4 = 0.28125F;
		float f5 = proj.ticksExisted > 1 ? 1F : 0.2F;

		float f6 = 0.0F;
		float f7 = 0.28125F;
		float f8 = 0.28125F;
		float f9 = 0.5625F;

		float f10 = 0.05625F;
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);

		GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(f10, f10, f10);
		GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
		GL11.glNormal3f(f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, -8.0D, -8.0D, (double)f6, (double)f8);
		tessellator.addVertexWithUV(-7.0D, -8.0D, 8.0D, (double)f7, (double)f8);
		tessellator.addVertexWithUV(-7.0D, 8.0D, 8.0D, (double)f7, (double)f9);
		tessellator.addVertexWithUV(-7.0D, 8.0D, -8.0D, (double)f6, (double)f9);
		tessellator.draw();
		GL11.glNormal3f(-f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, 8.0D, -8.0D, (double)f6, (double)f8);
		tessellator.addVertexWithUV(-7.0D, 8.0D, 8.0D, (double)f7, (double)f8);
		tessellator.addVertexWithUV(-7.0D, -8.0D, 8.0D, (double)f7, (double)f9);
		tessellator.addVertexWithUV(-7.0D, -8.0D, -8.0D, (double)f6, (double)f9);
		tessellator.draw();

		for (int i = 0; i < 4; ++i)
		{
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glNormal3f(0.0F, 0.0F, f10);
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(-64.0D * f5, -8.0D, 0.0D, (double)f1, (double)f2);
			tessellator.addVertexWithUV(128.0D * f5, -8.0D, 0.0D, (double)f3, (double)f2);
			tessellator.addVertexWithUV(128.0D * f5, 8.0D, 0.0D, (double)f3, (double)f4);
			tessellator.addVertexWithUV(-64.0D * f5, 8.0D, 0.0D, (double)f1, (double)f4);
			tessellator.draw();
		}

		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
	}

	public void renderEntityModel(ModelBase model, EntityProjectile proj, ProjRenderProp projProp, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
		if (projProp.ResLocModel != null)
			this.bindTexture(projProp.ResLocModel);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		model.render(proj, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}

	private void render2DImageOverEntity(EntityProjectile proj, ProjRenderProp projProp, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		if (projProp.ResLocTwoDee != null)
			this.bindTexture(projProp.ResLocTwoDee);
		Tessellator tessellator = Tessellator.instance;
		float f = 0F;//par2Icon.getMinU();
		float f1 = 1F;//par2Icon.getMaxU();
		float f2 = 0F;//par2Icon.getMinV();
		float f3 = 1F;//par2Icon.getMaxV();
		float f4 = 1.0F;
		float f5 = 0.5F;
		float f6 = 0.25F;
		GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		tessellator.addVertexWithUV((double)(0.0F - f5), (double)(0.0F - f6), 0.0D, (double)f, (double)f3);
		tessellator.addVertexWithUV((double)(f4 - f5), (double)(0.0F - f6), 0.0D, (double)f1, (double)f3);
		tessellator.addVertexWithUV((double)(f4 - f5), (double)(f4 - f6), 0.0D, (double)f1, (double)f2);
		tessellator.addVertexWithUV((double)(0.0F - f5), (double)(f4 - f6), 0.0D, (double)f, (double)f2);
		tessellator.draw();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
	}
}