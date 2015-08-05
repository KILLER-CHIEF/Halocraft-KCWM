package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.mobs.ModelGrunt;
import net.killerchief.halocraft.entities.mobs.EntityGruntBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGruntPlasmaPistol extends RenderLiving
{
	private static final ResourceLocation texture = new ResourceLocation(Halocraft.MODID+":textures/entities/GruntRender.png");
	protected ModelGrunt modelBipedMain;
	float scale = 1.4f;

	public RenderGruntPlasmaPistol(ModelGrunt par1ModelBiped, float par2)
	{
		super(par1ModelBiped, par2);
		this.modelBipedMain = par1ModelBiped;
	}

	protected ResourceLocation thisEntityTexture(EntityLiving par1EntityLiving)
	{
		return texture;
	}

	/**
	 * sets the scale for the slime based on getSlimeSize in EntitySlime
	 */
	protected void scaleEntity(EntityGruntBase par1EntitySlime, float par2)
	{
		GL11.glScalef(scale, scale, scale);
	}

	protected void renderHeldItem(EntityLiving p_77029_1_, float p_77029_2_)
	{
		GL11.glColor3f(1.0F, 1.0F, 1.0F);
		super.renderEquippedItems(p_77029_1_, p_77029_2_);
		ItemStack itemstack = p_77029_1_.getHeldItem();
		ItemStack itemstack1 = p_77029_1_.func_130225_q(3);
		Item item;
		float f1;

		if (itemstack != null && itemstack.getItem() != null)
		{
			item = itemstack.getItem();
			GL11.glPushMatrix();

			if (this.mainModel.isChild)
			{
				f1 = 0.5F;
				GL11.glTranslatef(0.0F, 0.625F, 0.0F);
				GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
				GL11.glScalef(f1, f1, f1);
			}

			this.modelBipedMain.rightArm1.postRender(0.0625F);
			//GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
			GL11.glTranslatef(-0.18F, 0.0F, -0.18F); // <<< Here vvv
			GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-40.0F, 0.0F, 1.0F, 0.0F);
			float f9 = 1 / scale;
			GL11.glScalef(f9, f9, f9);

			net.minecraftforge.client.IItemRenderer customRenderer = net.minecraftforge.client.MinecraftForgeClient.getItemRenderer(itemstack, net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED);
			boolean is3D = (customRenderer != null && customRenderer.shouldUseRenderHelper(net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED, itemstack, net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D));

			if (item instanceof ItemBlock && (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item).getRenderType())))
			{
				f1 = 0.5F;
				GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
				f1 *= 0.75F;
				GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(-f1, -f1, f1);
			}
			else if (item == Items.bow)
			{
				f1 = 0.625F;
				GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
				GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(f1, -f1, f1);
				GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
			}
			else if (item.isFull3D())
			{
				f1 = 0.625F;

				if (item.shouldRotateAroundWhenRendering())
				{
					GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(0.0F, -0.125F, 0.0F);
				}

				this.func_82422_c();
				GL11.glScalef(f1, -f1, f1);
				GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
			}
			else
			{
				f1 = 0.375F;
				GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
				GL11.glScalef(f1, f1, f1);
				GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
			}

			float f2;
			int i;
			float f5;

			if (itemstack.getItem().requiresMultipleRenderPasses())
			{
				for (i = 0; i < itemstack.getItem().getRenderPasses(itemstack.getItemDamage()); ++i)
				{
					int j = itemstack.getItem().getColorFromItemStack(itemstack, i);
					f5 = (float)(j >> 16 & 255) / 255.0F;
					f2 = (float)(j >> 8 & 255) / 255.0F;
					float f3 = (float)(j & 255) / 255.0F;
					GL11.glColor4f(f5, f2, f3, 1.0F);
					this.renderManager.itemRenderer.renderItem(p_77029_1_, itemstack, i);
				}
			}
			else
			{
				i = itemstack.getItem().getColorFromItemStack(itemstack, 0);
				float f4 = (float)(i >> 16 & 255) / 255.0F;
				f5 = (float)(i >> 8 & 255) / 255.0F;
				f2 = (float)(i & 255) / 255.0F;
				GL11.glColor4f(f4, f5, f2, 1.0F);
				this.renderManager.itemRenderer.renderItem(p_77029_1_, itemstack, 0);
			}

			GL11.glPopMatrix();
		}
	}

	protected void func_82422_c()
	{
		GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		float f2 = 1.0F;
		GL11.glColor3f(f2, f2, f2);
		ItemStack itemstack = par1EntityLiving.getHeldItem();
		this.func_82420_a(par1EntityLiving, itemstack);
		double d3 = par4 - (double)par1EntityLiving.yOffset;

		if (par1EntityLiving.isSneaking())
		{
			d3 -= 0.125D;
		}

		super.doRender(par1EntityLiving, par2, d3, par6, par8, par9);

		this.modelBipedMain.aimedBow = false;
		this.modelBipedMain.isSneak = false;
		this.modelBipedMain.heldItemRight = 0;
	}

	protected void func_82420_a(EntityLiving par1EntityLiving, ItemStack par2ItemStack)
	{
		this.modelBipedMain.heldItemRight = par2ItemStack != null ? 1 : 0;
		this.modelBipedMain.isSneak = par1EntityLiving.isSneaking();
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.thisEntityTexture((EntityLiving)par1Entity);
	}

	/**
	 * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	 * entityLiving, partialTickTime
	 */
	@Override
	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	{
		this.scaleEntity((EntityGruntBase)par1EntityLivingBase, par2);
	}

	@Override
	protected void renderEquippedItems(EntityLivingBase par1EntityLivingBase, float par2)
	{
		this.renderHeldItem((EntityLiving)par1EntityLivingBase, par2);
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
		this.doRenderLiving((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
	}
}
