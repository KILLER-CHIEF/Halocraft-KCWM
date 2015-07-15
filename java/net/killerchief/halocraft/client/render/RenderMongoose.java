package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.vehicles.ModelMongoose;
import net.killerchief.halocraft.entities.vehicles.EntityMongoose;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMongoose extends Render
{
	private static ResourceLocation field_110782_f;

	/** instance of ModelBoat for rendering */
	protected ModelMongoose modelMongoose;

	public RenderMongoose()
	{
		this.shadowSize = 0.5F;
		this.modelMongoose = new ModelMongoose();
	}

	/**
	 * The render method used in RenderBoat that renders the boat model.
	 */
	public void renderMongoose(EntityMongoose par1HCEntityMongoose, double par2, double par4, double par6, float par8, float par9)
	{
		field_110782_f = new ResourceLocation(Halocraft.MODID+par1HCEntityMongoose.getEntityTexture());
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		//GL11.glRotatef(MathHelper.wrapAngleTo180_float(par1HCEntityMongoose.getRotateWheelSpeed()*100F), 1.0F, 0.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(0.6F / f4, 0.6F / f4, 0.6F / f4);
		this.bindEntityTexture(par1HCEntityMongoose);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		this.modelMongoose.render(par1HCEntityMongoose, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.field_110782_f;
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
		this.renderMongoose((EntityMongoose)par1Entity, par2, par4, par6, par8, par9);
	}
}