package net.killerchief.halocraft.client.models;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.armor.ModelArmorLights;
import net.killerchief.halocraft.client.models.armor.ModelArmorVisor;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class Model3DArmor extends ModelBiped
{
	//int textureX = 128;
	//int textureY = 128;

	public ModelRendererTurbo[] headModel;
	public ModelRendererTurbo[] bodyModel;
	public ModelRendererTurbo[] leftArmModel;
	public ModelRendererTurbo[] rightArmModel;
	public ModelRendererTurbo[] leftLegModel;
	public ModelRendererTurbo[] rightLegModel;
	public ModelRendererTurbo[] leftBootModel;
	public ModelRendererTurbo[] rightBootModel;
	
	public ModelRendererTurbo[] bodyModelLights;
	public ModelRendererTurbo[] leftArmModelLights;
	public ModelRendererTurbo[] rightArmModelLights;
	public ModelRendererTurbo[] visorModel;
	public ModelRendererTurbo[] helmetModelLights;//TODO
	
	private int width;
	private int height;
	private static ResourceLocation SacrificialGraphicBackground;
	
	public void flipAll()
	{
		flip(this.headModel);
		flip(this.bodyModel);
		flip(this.leftArmModel);
		flip(this.rightArmModel);
		flip(this.leftLegModel);
		flip(this.rightLegModel);
		flip(this.leftBootModel);
		flip(this.rightBootModel);
		
		flip(this.bodyModelLights);
		flip(this.leftArmModelLights);
		flip(this.rightArmModelLights);
		flip(this.visorModel);
	}

	private static ResourceLocation[] titlePanoramaPaths = new ResourceLocation[] {new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_0.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_1.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_2.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_3.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_4.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/visorbg/panorama_5.png"), new ResourceLocation(Halocraft.MODID+":textures/armor/HelmetShader.png")};

	/**
	 * Draws the main menu panorama
	 */
	private void drawPanorama(float yaw, float pitch)
	{
		Tessellator tessellator = Tessellator.instance;
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(1F, -1F, 1F);
		//GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glDepthMask(false);
		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		
		GL11.glDisable(GL11.GL_LIGHTING);

		byte b0 = 8;

		for (int k = 0; k < b0 * b0; ++k)
		{
			GL11.glPushMatrix();
			
			GL11.glRotatef(yaw, 0.0F, 1.0F, 0.0F);
			float s1 = yaw/360;
			float s2 = s1-(int)s1;
			float s3 = s2*2F*(float)Math.PI;
            GL11.glRotatef(-MathHelper.cos(s3)*pitch, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-MathHelper.sin(s3)*pitch, 0.0F, 0.0F, 1.0F);
            
			float f4 = 0.0F;
			for (int l = 0; l < 6; ++l)
			{
				GL11.glPushMatrix();
				
				/*if (l == 6)
				{
					Minecraft.getMinecraft().renderEngine.bindTexture(titlePanoramaPaths[l]);
					GL11.glPopMatrix();
					break;
				}*/

				if (l == 1)
				{
					GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (l == 2)
				{
					GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				}

				if (l == 3)
				{
					GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
				}

				if (l == 4)
				{
					GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
				}

				if (l == 5)
				{
					GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
				}

				Minecraft.getMinecraft().renderEngine.bindTexture(titlePanoramaPaths[l]);
				tessellator.startDrawingQuads();
				tessellator.setColorRGBA_I(16777215, 255 / (k + 1));
				//float f4 = 0.0F;
				tessellator.addVertexWithUV(-1.0D, -1.0D, 1.0D, (double)(0.0F + f4), (double)(0.0F + f4));
				tessellator.addVertexWithUV(1.0D, -1.0D, 1.0D, (double)(1.0F - f4), (double)(0.0F + f4));
				tessellator.addVertexWithUV(1.0D, 1.0D, 1.0D, (double)(1.0F - f4), (double)(1.0F - f4));
				tessellator.addVertexWithUV(-1.0D, 1.0D, 1.0D, (double)(0.0F + f4), (double)(1.0F - f4));
				tessellator.draw();
				GL11.glPopMatrix();
			}
			GL11.glPopMatrix();
			
			Minecraft.getMinecraft().renderEngine.bindTexture(titlePanoramaPaths[6]);
			//GL11.glEnable(GL11.GL_BLEND);
			//GL11.glDepthMask(false);
			//GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			//GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
			GL11.glTranslated(0.0F, 0.28F, 0F);//Fix offset
			Tessellator tessellator2 = Tessellator.instance;
			tessellator2.startDrawingQuads();
			float f42 = 0.0F;
			double z = 0.58F;
			tessellator2.addVertexWithUV(-1.0D, -1.0D, z, (double)(0.0F + f42), (double)(0.0F + f42));
			tessellator2.addVertexWithUV(1.0D, -1.0D, z, (double)(1.0F - f42), (double)(0.0F + f42));
			tessellator2.addVertexWithUV(1.0D, 1.0D, z, (double)(1.0F - f42), (double)(1.0F - f42));
			tessellator2.addVertexWithUV(-1.0D, 1.0D, z, (double)(0.0F + f42), (double)(1.0F - f42));
			tessellator2.draw();
			GL11.glTranslated(0.0F, -0.28F, 0F);//Fix offset back
			
			GL11.glColorMask(true, true, true, false);
		}

		tessellator.setTranslation(0.0D, 0.0D, 0.0D);
		GL11.glColorMask(true, true, true, true);
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glPopMatrix();
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glPopMatrix();
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	/**
	 * Rotate and blurs the skybox view in the main menu
	 */
	private void rotateAndBlurSkybox()
	{
		if (SacrificialGraphicBackground == null)
			SacrificialGraphicBackground = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("background", new DynamicTexture(256, 256));
		Minecraft.getMinecraft().renderEngine.bindTexture(SacrificialGraphicBackground);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
		GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, 256, 256);
		
		/*Minecraft.getMinecraft().renderEngine.bindTexture(titlePanoramaPaths[6]);
		GL11.glEnable(GL11.GL_BLEND);
		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		GL11.glColorMask(true, true, true, false);
		Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        byte b0 = 3;

        float f4 = 0.0F;
		tessellator.addVertexWithUV(-1.0D, -1.0D, 1.0D, (double)(0.0F + f4), (double)(0.0F + f4));
		tessellator.addVertexWithUV(1.0D, -1.0D, 1.0D, (double)(1.0F - f4), (double)(0.0F + f4));
		tessellator.addVertexWithUV(1.0D, 1.0D, 1.0D, (double)(1.0F - f4), (double)(1.0F - f4));
		tessellator.addVertexWithUV(-1.0D, 1.0D, 1.0D, (double)(0.0F + f4), (double)(1.0F - f4));
        /*for (int i = 0; i < b0; ++i)
        {
            tessellator.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F / (float)(i + 1));
            int j = this.width;
            int k = this.height;
            float f1 = (float)(i - b0 / 2) / 256.0F;
            tessellator.addVertexWithUV((double)j, (double)k, (double)this.zLevel, (double)(0.0F + f1), 1.0D);
            tessellator.addVertexWithUV((double)j, 0.0D, (double)this.zLevel, (double)(1.0F + f1), 1.0D);
            tessellator.addVertexWithUV(0.0D, 0.0D, (double)this.zLevel, (double)(1.0F + f1), 0.0D);
            tessellator.addVertexWithUV(0.0D, (double)k, (double)this.zLevel, (double)(0.0F + f1), 0.0D);
        }

        tessellator.draw();
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glColorMask(true, true, true, true);*/
	}

	/**
	 * Renders the skybox in the main menu
	 */
	private void renderSkybox(float yaw, float pitch)
	{
		Minecraft.getMinecraft().getFramebuffer().unbindFramebuffer();
		GL11.glViewport(0, 0, 128, 128);
		this.drawPanorama(yaw, pitch);
		this.rotateAndBlurSkybox();
//		this.rotateAndBlurSkybox(p_73971_3_);
//		this.rotateAndBlurSkybox(p_73971_3_);
//		this.rotateAndBlurSkybox(p_73971_3_);
//		this.rotateAndBlurSkybox(p_73971_3_);
//		this.rotateAndBlurSkybox(p_73971_3_);
//		this.rotateAndBlurSkybox(p_73971_3_);
		Minecraft.getMinecraft().getFramebuffer().bindFramebuffer(true);
		
		
		
		//Minecraft.getMinecraft().renderEngine.bindTexture(titlePanoramaPaths[6]);
		/*GL11.glViewport(0, 0, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        float f1 = this.width > this.height ? 120.0F / (float)this.width : 120.0F / (float)this.height;
        float f2 = (float)this.height * f1 / 256.0F;
        float f3 = (float)this.width * f1 / 256.0F;
        tessellator.setColorRGBA_F(1.0F, 1.0F, 1.0F, 1.0F);
        int k = this.width;
        int l = this.height;
        double zLevel = 0D;
		tessellator.addVertexWithUV(0.0D, (double)l, (double)zLevel  , (double)(0.5F - f2), (double)(0.5F + f3));
        tessellator.addVertexWithUV((double)k, (double)l, (double)zLevel, (double)(0.5F - f2), (double)(0.5F - f3));
        tessellator.addVertexWithUV((double)k, 0.0D, (double)zLevel, (double)(0.5F + f2), (double)(0.5F - f3));
        tessellator.addVertexWithUV(0.0D, 0.0D, (double)zLevel, (double)(0.5F + f2), (double)(0.5F + f3));
        tessellator.draw();*/
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity tileentity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, tileentity);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 1, 0, 0);
		GL11.glTranslated(0.0F, -0.1F, 0F);
		GL11.glEnable(GL11.GL_LIGHTING);
		if (this.headModel != null)
		{
			for (ModelRendererTurbo part : this.headModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftArmModel != null)
		{
			for (ModelRendererTurbo part : this.leftArmModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightArmModel != null)
		{
			for (ModelRendererTurbo part : this.rightArmModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftLegModel != null)
		{
			for (ModelRendererTurbo part : this.leftLegModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightLegModel != null)
		{
			for (ModelRendererTurbo part : this.rightLegModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftBootModel != null)
		{
			for (ModelRendererTurbo part : this.leftBootModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightBootModel != null)
		{
			for (ModelRendererTurbo part : this.rightBootModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		GL11.glDisable(GL11.GL_LIGHTING);
		float x = OpenGlHelper.lastBrightnessX;
		float y = OpenGlHelper.lastBrightnessY;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
		if (this.bodyModelLights != null)
		{
			for (ModelRendererTurbo part : this.bodyModelLights)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftArmModelLights != null)
		{
			for (ModelRendererTurbo part : this.leftArmModelLights)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.rightArmModelLights != null)
		{
			for (ModelRendererTurbo part : this.rightArmModelLights)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, x, y);
		GL11.glEnable(GL11.GL_LIGHTING);
		if (this.visorModel != null)
		{
			if (true)//this instanceof ModelArmorVisor)
			{
				this.width = Minecraft.getMinecraft().displayWidth;
				this.height = Minecraft.getMinecraft().displayHeight;
				GL11.glDisable(GL11.GL_ALPHA_TEST);
				this.renderSkybox(tileentity.getRotationYawHead(), -tileentity.rotationPitch);
				GL11.glEnable(GL11.GL_ALPHA_TEST);
				
				
				//GL11.glEnable(GL11.GL_LIGHTING);
				//GL11.glDisable(GL11.GL_LIGHTING);
				//OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
				
				/*headModel = new ModelRendererTurbo[1];
				//(int)tileentity.getRotationYawHead()
				headModel[0] = new ModelRendererTurbo(this, 0, 0, 40, 40); // Box 31

				//headModel[0].addBox(-5F, -5F, -5F, 10, 10, 10);
				headModel[0].addBox(-10F, -10F, -10F, 20, 20, 20);
				headModel[0].setRotationPoint(0F, -10F, 0F);
				headModel[0].doMirror(false, true, true);*/
				
				//headModel[0].addShapeBox(-4.5F, -6.5F, -4.5F, 112, 40, 32, 0F, -0.1F, 0F, -0.1F, -103.1F, 0F, -0.1F, -103.1F, 0F, -28.1F, -0.1F, 0F, -28.1F, -0.1F, -35F, -0.1F, -103.1F, -35F, -0.1F, -103.1F, -35F, -28.1F, -0.1F, -35F, -28.1F); // Box 31
				//headModel[0].setRotationPoint(0F, -2F, 0F);
				//headModel[0].setTextureOffset(30, 119);
				//ResourceLocation MachineGunTexture = new ResourceLocation(Halocraft.MODID+":textures/armor/Visor360.png");
				//Minecraft.getMinecraft().renderEngine.bindTexture(MachineGunTexture);
				
				
				/*visorModel = new ModelRendererTurbo[1];
				visorModel[0] = new ModelRendererTurbo(this, 0, 180, 357, 204); // Head6

				visorModel[0].addShapeBox(-4.5F, -6.5F, -4.5F, 112, 40, 32, 0F, -0.1F, 0F, -0.1F, -103.1F, 0F, -0.1F, -103.1F, 0F, -28.1F, -0.1F, 0F, -28.1F, -0.1F, -35F, -0.1F, -103.1F, -35F, -0.1F, -103.1F, -35F, -28.1F, -0.1F, -35F, -28.1F); // Head6
				visorModel[0].setRotationPoint(0F, -1F, 0F);
				flip(this.visorModel);*/
				
			}
			for (ModelRendererTurbo part : this.visorModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		
		/*if (!(this instanceof ModelArmorLights || this instanceof ModelArmorVisor))
		{
			new ModelArmorLights().render(tileentity, par2, par3, par4, par5, par6, par7);
			new ModelArmorVisor().render(tileentity, par2, par3, par4, par5, par6, par7);
		}*/
		GL11.glPopMatrix();
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
		if (this.headModel != null)
		{
			for (ModelRendererTurbo part : this.headModel)
			{
				part.rotateAngleX = this.bipedHead.rotateAngleX;
				part.rotateAngleY = -this.bipedHead.rotateAngleY;
				part.rotateAngleZ = -this.bipedHead.rotateAngleZ;
				part.rotationPointX = this.bipedHead.rotationPointX;
				part.rotationPointY = -this.bipedHead.rotationPointY+1.5F;//+1
				//System.out.println(part.rotationPointY);
				part.rotationPointZ = -this.bipedHead.rotationPointZ;
			}
		}
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				part.rotateAngleX = this.bipedBody.rotateAngleX;
				part.rotateAngleY = -this.bipedBody.rotateAngleY;
				part.rotateAngleZ = -this.bipedBody.rotateAngleZ;
				part.rotationPointX = this.bipedBody.rotationPointX;
				part.rotationPointY = -this.bipedBody.rotationPointY+2F;
				part.rotationPointZ = -this.bipedBody.rotationPointZ+0.05F;//-0.05
			}
		}
		if (this.leftArmModel != null)
		{
			for (ModelRendererTurbo part : this.leftArmModel)
			{
				part.rotateAngleX = this.bipedLeftArm.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftArm.rotateAngleZ;
				//part.rotationPointX = this.bipedLeftArm.rotationPointX-1F;
				//part.rotationPointY = -this.bipedLeftArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedLeftArm.rotationPointZ;
			}
		}
		if (this.rightArmModel != null)
		{
			for (ModelRendererTurbo part : this.rightArmModel)
			{
				part.rotateAngleX = this.bipedRightArm.rotateAngleX;
				part.rotateAngleY = -this.bipedRightArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightArm.rotateAngleZ;
				//part.rotationPointX = this.bipedRightArm.rotationPointX+1F;
				//part.rotationPointY = -this.bipedRightArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedRightArm.rotationPointZ;
			}
		}
		if (this.leftLegModel != null)
		{
			for (ModelRendererTurbo part : this.leftLegModel)
			{
				part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
				part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.9F;
				part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
			}
		}
		if (this.rightLegModel != null)
		{
			for (ModelRendererTurbo part : this.rightLegModel)
			{
				part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
				part.rotationPointX = this.bipedRightLeg.rotationPointX+1.9F;
				part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
			}
		}
		if (this.leftBootModel != null)
		{
			for (ModelRendererTurbo part : this.leftBootModel)
			{
				part.rotateAngleX = this.bipedLeftLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftLeg.rotateAngleZ;
				part.rotationPointX = this.bipedLeftLeg.rotationPointX-1.9F;
				part.rotationPointY = -this.bipedLeftLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedLeftLeg.rotationPointZ+0.1F;
			}
		}
		if (this.rightBootModel != null)
		{
			for (ModelRendererTurbo part : this.rightBootModel)
			{
				part.rotateAngleX = this.bipedRightLeg.rotateAngleX;
				part.rotateAngleY = -this.bipedRightLeg.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightLeg.rotateAngleZ;
				part.rotationPointX = this.bipedRightLeg.rotationPointX+1.9F;
				part.rotationPointY = -this.bipedRightLeg.rotationPointY+1.5F;
				part.rotationPointZ = -this.bipedRightLeg.rotationPointZ+0.1F;
			}
		}
		
		if (this.bodyModelLights != null)
		{
			for (ModelRendererTurbo part : this.bodyModelLights)
			{
				part.rotateAngleX = this.bipedBody.rotateAngleX;
				part.rotateAngleY = -this.bipedBody.rotateAngleY;
				part.rotateAngleZ = -this.bipedBody.rotateAngleZ;
				part.rotationPointX = this.bipedBody.rotationPointX;
				part.rotationPointY = -this.bipedBody.rotationPointY+2F;
				part.rotationPointZ = -this.bipedBody.rotationPointZ+0.05F;//-0.05
			}
		}
		if (this.leftArmModelLights != null)
		{
			for (ModelRendererTurbo part : this.leftArmModelLights)
			{
				part.rotateAngleX = this.bipedLeftArm.rotateAngleX;
				part.rotateAngleY = -this.bipedLeftArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedLeftArm.rotateAngleZ;
				//part.rotationPointX = this.bipedLeftArm.rotationPointX-1F;
				//part.rotationPointY = -this.bipedLeftArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedLeftArm.rotationPointZ;
			}
		}
		if (this.rightArmModelLights != null)
		{
			for (ModelRendererTurbo part : this.rightArmModelLights)
			{
				part.rotateAngleX = this.bipedRightArm.rotateAngleX;
				part.rotateAngleY = -this.bipedRightArm.rotateAngleY;
				part.rotateAngleZ = -this.bipedRightArm.rotateAngleZ;
				//part.rotationPointX = this.bipedRightArm.rotationPointX+1F;
				//part.rotationPointY = -this.bipedRightArm.rotationPointY+2F;
				//part.rotationPointZ = -this.bipedRightArm.rotationPointZ;
			}
		}
		if (this.visorModel != null)
		{
			for (ModelRendererTurbo part : this.visorModel)
			{
				part.rotateAngleX = this.bipedHead.rotateAngleX;
				part.rotateAngleY = -this.bipedHead.rotateAngleY;
				part.rotateAngleZ = -this.bipedHead.rotateAngleZ;
				part.rotationPointX = this.bipedHead.rotationPointX;
				part.rotationPointY = -this.bipedHead.rotationPointY+1.5F;//+1
				part.rotationPointZ = -this.bipedHead.rotationPointZ;
			}
		}
	}

	protected void flip(ModelRendererTurbo[] model)
	{
		if (model != null)
		{
			for (ModelRendererTurbo part : model)
			{
				if (part != null)
				{
					part.doMirror(false, true, true);
					part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
				}
			}
		}
	}
}