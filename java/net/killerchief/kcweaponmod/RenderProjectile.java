package net.killerchief.kcweaponmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderProjectile extends Render {

	private int RenderType = 0;
	private String BulletTex = KCWeaponMod.MODID+":textures/entities/Default/DefaultProjectileRender.png";
	private String TwoDeeTex = "";
	private String ModelTex = "";
	private String ModelClass = "";

	//ResourceLocation RL2DRenders = TextureMap.locationItemsTexture;//new ResourceLocation("textures/atlas/items.png");
	ResourceLocation RLBullet = new ResourceLocation(KCWeaponMod.MODID+":textures/entities/BulletRender.png");

	public RenderProjectile(int rendertype, String bullettex, String twodeetex, String modeltex, String modelclass)
	{
		this.RenderType = rendertype;
		this.BulletTex = bullettex;
		this.TwoDeeTex = twodeetex;
		this.ModelTex = modeltex;
		this.ModelClass = modelclass;

		if(rendertype == 0 || rendertype == 1 || rendertype == 3)
		{
			this.shadowSize = 0.2F;
		}
		else if(rendertype == 2)
		{
			this.shadowSize = 0.4F;
		}
		else{}
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
		GL11.glPushMatrix();
		if (par1Entity instanceof EntityProjectile && ((EntityProjectile)par1Entity).Glows)
		{
			GL11.glDisable(GL11.GL_LIGHTING);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
		}
		if(this.RenderType == 0)
		{
			this.renderBullet(par1Entity, par2, par4, par6, par8, par9);
		}
		else if(this.RenderType == 3)
		{
			this.renderLargeProjectile(par1Entity, par2, par4, par6, par8, par9);
		}
		else if(this.RenderType == 1)
		{
			this.render2DImageOverEntity(par1Entity, par2, par4, par6, par8, par9);
		}
		else if(this.RenderType == 2)
		{
			try {
				this.renderEntityModel(((Class<? extends ModelBase>) Class.forName(this.ModelClass)).newInstance(), par1Entity, par2, par4, par6, par8, par9);
			} catch (InstantiationException e) {
				System.err.println("The 3D Model Class \""+this.ModelClass+"\" cannot be instantiated!");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				System.err.println("The 3D Model Class \""+this.ModelClass+"\" cannot be accessed!");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.err.println("The 3D Model Class \""+this.ModelClass+"\" does not exist!");
				e.printStackTrace();
			}
		}
		else
		{
			System.err.println("KCWeaponMod - WARNING: Projectile RenderType is not valid! "+this.RenderType);
		}
		if (par1Entity instanceof EntityProjectile && ((EntityProjectile)par1Entity).Glows)
		{
			GL11.glEnable(GL11.GL_LIGHTING);
		}
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		if(this.RenderType == 0 || this.RenderType == 3)
		{
			return new ResourceLocation(this.BulletTex);
		}
		else if(this.RenderType == 1)
		{
			return new ResourceLocation(this.TwoDeeTex);//RL2DRenders;
		}
		else if(this.RenderType == 2)
		{
			return new ResourceLocation(this.ModelTex);
		}

		return null;
	}

	public void renderBullet(Entity par1EntityBullet, double par2, double par4, double par6, float par8, float par9)
	{
		this.bindEntityTexture(par1EntityBullet);
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(par1EntityBullet.prevRotationYaw + (par1EntityBullet.rotationYaw - par1EntityBullet.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(par1EntityBullet.prevRotationPitch + (par1EntityBullet.rotationPitch - par1EntityBullet.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
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
	
	public void renderLargeProjectile(Entity par1EntityBullet, double par2, double par4, double par6, float par8, float par9)
	{
		this.bindEntityTexture(par1EntityBullet);
		
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(par1EntityBullet.prevRotationYaw + (par1EntityBullet.rotationYaw - par1EntityBullet.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(par1EntityBullet.prevRotationPitch + (par1EntityBullet.rotationPitch - par1EntityBullet.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		Tessellator tessellator = Tessellator.instance;
		float f1 = 0.0F;
		float f2 = 0F;
		float f3 = 1F;
		float f4 = 0.28125F;
		float f5 = par1EntityBullet.ticksExisted > 1 ? 1F : 0.2F;
		
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

	public void renderEntityModel(ModelBase model, Entity entity, double par2, double par4, double par6, float par8, float par9)
	{
		
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}

	private void render2DImageOverEntity(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		this.bindEntityTexture(par1Entity);
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