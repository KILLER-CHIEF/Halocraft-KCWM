package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthog;
import net.killerchief.halocraft.client.models.vehicles.ModelWarthogMachineGunTurret;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWarthogBack extends Render
{
	public static final Model3DBase WarthogModel = new ModelWarthog();
	public static final ResourceLocation WarthogTexture = new ResourceLocation(Halocraft.MODID+":textures/entities/WarthogModel.png");
	public static final ModelWarthogMachineGunTurret MachineGunModel = new ModelWarthogMachineGunTurret();
	public static final ResourceLocation MachineGunTexture = new ResourceLocation(Halocraft.MODID+":textures/entities/SkinMachineGunTurret.png");

	public RenderWarthogBack()
	{
		this.shadowSize = 1.5F;
	}

	/**
	 * The render method used in RenderBoat that renders the boat model.
	 */
	public void renderMongoose(EntityWarthog entity, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(0.8F / f4, 0.8F / f4, 0.8F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		GL11.glRotatef(180F, 1F, 0F, 0F);
		GL11.glRotatef(-90F, 0F, 1F, 0F);
		GL11.glTranslatef(0F, -0.8F, 0F);
		this.bindTexture(WarthogTexture);
		WarthogModel.render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		GL11.glRotatef(90F, 0F, 1F, 0F);
		GL11.glTranslatef(0F, 2F, -1.8F);
		try {
			if (entity.passengerSeats.length >= 2 && entity.passengerSeats[1] != null && entity.passengerSeats[1].riddenByEntity != null)
				GL11.glRotatef(entity.rotationYaw - entity.passengerSeats[1].riddenByEntity.rotationYaw, 0F, 1F, 0F);//entity.getWheelTurnAngle()*400
		} catch (NullPointerException npe) {
			System.err.println(npe.getStackTrace());
			entity.passengerSeats = entity.getPassengerSeats();
		}
		this.bindTexture(MachineGunTexture);
		//MachineGunModel.render(entity, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		GL11.glTranslatef(0F, 0F, -0.2F);
		MachineGunModel.renderSomeParts(false, 0.0625F);
		GL11.glTranslatef(0F, 0.5F, 0.85F);
		try {
			if (entity.passengerSeats.length >= 2 && entity.passengerSeats[1] != null && entity.passengerSeats[1].riddenByEntity != null)
				GL11.glRotatef(entity.passengerSeats[1].riddenByEntity.rotationPitch, 1F, 0F, 0F);//entity.getWheelTurnAngle()*150
		} catch (NullPointerException npe) {
			System.err.println(npe.getStackTrace());
			entity.passengerSeats = entity.getPassengerSeats();
		}
		GL11.glTranslatef(0F, -0.45F, -0.85F);
		MachineGunModel.renderSomeParts(true, 0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return WarthogTexture;
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
		//this.renderMongoose((EntityWarthog)par1Entity, par2, par4, par6, par8, par9);
	}
}