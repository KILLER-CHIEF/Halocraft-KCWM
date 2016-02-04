package net.killerchief.halocraft.entities;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityGravityLiftFX extends EntityFX
{
	protected static ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/particleFX/GravityLiftFX.png");

	public EntityGravityLiftFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
	{
		this(par1World, par2, par4, par6, par8, par10, par12, 1.0F);
	}

	public EntityGravityLiftFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12, float par14)
	{
		super(par1World, par2, par4, par6, 0.0D, 0.0D, 0.0D);
		motionX *= 0.10000000149011612D;
		motionY *= 0.10000000149011612D;
		motionZ *= 0.10000000149011612D;
		motionX += par8;
		motionY += par10;
		motionZ += par12;
		particleRed = 0.6f;
		particleGreen = 0f;
		particleBlue = 0.8f;
		//particleRed = particleGreen = particleBlue = (float)(Math.random() * 0.30000001192092896D);
		//setParticleTextureIndex(22);
		//setParticleTextureIndex(0);
		particleScale *= 0.75F;
		particleScale *= par14;
		particleMaxAge = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
		particleMaxAge *= par14;
		particleMaxAge /= 3;
		particleMaxAge /= 2;
		particleMaxAge += 3;
		noClip = true;
	}

	@Override
	public void renderParticle(Tessellator par1Tessellator, float partialTicks, float par3, float par4, float par5, float par6, float par7)
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glDepthMask(false);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		//GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);
		par1Tessellator.startDrawingQuads();
		par1Tessellator.setBrightness(this.getBrightnessForRender(partialTicks));


		/*float f6 = (float)this.particleTextureIndexX / 16.0F;
        float f7 = f6 + 0.0624375F;
        float f8 = (float)this.particleTextureIndexY / 16.0F;
        float f9 = f8 + 0.0624375F;

        if (this.particleIcon != null)
        {
            f6 = this.particleIcon.getMinU();
            f7 = this.particleIcon.getMaxU();
            f8 = this.particleIcon.getMinV();
            f9 = this.particleIcon.getMaxV();
        }*/

		float f6 = 0.0F;
		float f7 = 1.0F;
		float f8 = 0.0F;
		float f9 = 1.0F;

		float f10 = 0.1F * this.particleScale;
		float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
		float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
		float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);
		float f14 = 1.0F;
		par1Tessellator.setColorRGBA_F(this.particleRed * f14, this.particleGreen * f14, this.particleBlue * f14, this.particleAlpha);
		par1Tessellator.addVertexWithUV((double)(f11 - par3 * f10 - par6 * f10), (double)(f12 - par4 * f10), (double)(f13 - par5 * f10 - par7 * f10), (double)f7, (double)f9);
		par1Tessellator.addVertexWithUV((double)(f11 - par3 * f10 + par6 * f10), (double)(f12 + par4 * f10), (double)(f13 - par5 * f10 + par7 * f10), (double)f7, (double)f8);
		par1Tessellator.addVertexWithUV((double)(f11 + par3 * f10 + par6 * f10), (double)(f12 + par4 * f10), (double)(f13 + par5 * f10 + par7 * f10), (double)f6, (double)f8);
		par1Tessellator.addVertexWithUV((double)(f11 + par3 * f10 - par6 * f10), (double)(f12 - par4 * f10), (double)(f13 + par5 * f10 - par7 * f10), (double)f6, (double)f9);
		par1Tessellator.draw();
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDepthMask(true);
		//GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);

	}

	@Override
	public int getFXLayer()
	{
		return 3;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		if (particleAge++ >= particleMaxAge)
		{
			setDead();
		}

		//setParticleTextureIndex(7 - (particleAge * 8) / particleMaxAge);
		//motionY += 0.0040000000000000001D;
		moveEntity(motionX, motionY, motionZ);

		if (posY == prevPosY)
		{
			motionX *= 1.1000000000000001D;
			motionZ *= 1.1000000000000001D;
		}

		motionX *= 0.95999997854232788D;
		motionY *= 0.95999997854232788D;
		motionZ *= 0.95999997854232788D;

		if (onGround)
		{
			motionX *= 0.69999998807907104D;
			motionZ *= 0.69999998807907104D;
		}
	}
}
