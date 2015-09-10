package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGhost extends Render
{
	public RenderGhost()
	{
		this.shadowSize = 0.5F;
	}

	/**
	 * The render method used in RenderBoat that renders the boat model.
	 */
	public void renderMongoose(EntityGhost entity, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		GL11.glTranslatef(0.63F, 0.22F - entity.getRaiseModel(), 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1F / f4, 1F / f4, 1F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		entity.getModel().render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		if (par1Entity instanceof EntityGhost)
		{
			EntityGhost entity = (EntityGhost)par1Entity;
			return entity.getTexture();
		}
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
		this.renderMongoose((EntityGhost)par1Entity, par2, par4, par6, par8, par9);
	}
}