package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.items.ModelDeployableGravityLift;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderProjectile extends Render {

	public enum EnumType {
		Unknown0(0), DeployableGravityLift61(61);

		private final byte value;

		EnumType(int value) {
			this.value = (byte) value;
		}

		public byte getValue() {
			return value;
		}

		public static EnumType getEnum(byte num)
		{
			EnumType[] enums = EnumType.class.getEnumConstants();
			for (int i = 0; i < enums.length; i++) {
				if (enums[i].getValue() == num)
					return enums[i];
			}
			return EnumType.Unknown0;
		}
	}

	private Enum Type;

	ResourceLocation RLDeployableGravityLift = new ResourceLocation(Halocraft.MODID+":textures/entities/DeployableGravityLiftRender.png");

	/** instance of ModelDeployableGravityLift for rendering */
	protected ModelBase modelDeployableGravityLift = new ModelDeployableGravityLift();

	public RenderProjectile(Enum type)
	{
		this.Type = type;

		if(type == EnumType.DeployableGravityLift61)
		{
			this.shadowSize = 0.5F;
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
		if(this.Type == EnumType.DeployableGravityLift61)
		{
			this.renderEntityModel(this.modelDeployableGravityLift, par1Entity, par2, par4, par6, par8, par9);
		}
		else{}
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		if(this.Type == EnumType.DeployableGravityLift61)
		{
			return RLDeployableGravityLift;
		}

		return null;
	}

	public void renderEntityModel(ModelBase model, Entity entity, double par2, double par4, double par6, float par8, float par9)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}