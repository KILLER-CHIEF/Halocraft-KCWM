package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.entities.vehicles.EntityBanshee;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBanshee extends Render
{
	public RenderBanshee()
	{
		this.shadowSize = 1.5F;
	}

	/**
	 * The render method used in RenderBoat that renders the boat model.
	 */
	public void renderBanshee(EntityBanshee entity, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(270.0F - par8, 0.0F, 1.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(0.86F / f4, 0.86F / f4, 0.86F / f4);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		GL11.glRotatef(180F, 1F, 0F, 0F);
		GL11.glRotatef(-90F, 0F, 1F, 0F);
		GL11.glTranslatef(0F, 0.2F, 0F);
		GL11.glRotatef(entity.rotationPitch, 1F, 0F, 0F);
		this.bindTexture(entity.getTextureBase());
		entity.getModelBase().render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		//GL11.glRotatef(90F, 0F, 1F, 0F);
		GL11.glTranslatef(0.125F, -2.1F, -0.4F);
		//if (entity.riddenByEntity == null)
		//{
			GL11.glRotatef(30F*entity.topRotationProgress, 1F, 0F, 0F);
			GL11.glTranslatef(0F, 0.28F*entity.topRotationProgress, -1.4F*entity.topRotationProgress);
		//}
		this.bindTexture(entity.getTextureTop());
		entity.getModelTop().render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return null;
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
		this.renderBanshee((EntityBanshee)par1Entity, par2, par4, par6, par8, par9);
	}
}