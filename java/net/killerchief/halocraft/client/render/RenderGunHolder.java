package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.guns.ModelEnergySword;
import net.killerchief.halocraft.client.models.items.ModelGunHolderMount;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGunHolder extends TileEntitySpecialRenderer {

	private ModelGunHolderMount gunMount = new ModelGunHolderMount();
	private static final ResourceLocation resourcelocationGunMount = new ResourceLocation(Halocraft.MODID+":textures/entities/GunHolderRender.png");

	private Model3DWeaponBase modelEnergySword = new ModelEnergySword();
	private static final ResourceLocation resourcelocationEnergySwordOn = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySword.png");
	private static final ResourceLocation resourcelocationEnergySwordOff = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySwordOff.png");

	
	public RenderGunHolder() {}

	public void renderBlock(TileEntityGunHolder tileentity, double par2, double par4, double par6, float par8)
	{
		if (tileentity.getMountRotate() < 4)
		{
			GL11.glPushMatrix();
			GL11.glTranslatef((float)par2, (float)par4, (float)par6);
			this.bindTexture(this.resourcelocationGunMount);
			if (tileentity.getMountSide() == 1)
			{
				GL11.glTranslated(0D, 1D, 1D);
				GL11.glRotatef(180F, 1F, 0F, 0F);
			}
			else if (tileentity.getMountSide() == 2)
			{
				GL11.glTranslated(1D, 0D, 1D);
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glRotatef(-90F, 1F, 0F, 0F);
			}
			else if (tileentity.getMountSide() == 3)
			{
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glRotatef(90F, 1F, 0F, 0F);
			}
			else if (tileentity.getMountSide() == 4)
			{
				GL11.glTranslated(1D, 0D, 0D);
				GL11.glRotatef(90F, 0F, 0F, 1F);
			}
			else if (tileentity.getMountSide() == 5)
			{
				GL11.glTranslated(0D, 1D, 0D);
				GL11.glRotatef(-90F, 0F, 0F, 1F);
			}
			GL11.glRotatef(tileentity.getMountRotate() * 90F, 0F, 1F, 0F);
			if (tileentity.getMountRotate() == 1)
			{
				GL11.glTranslated(-1D, 0D, 0D);
			}
			else if (tileentity.getMountRotate() == 2)
			{
				GL11.glTranslated(-1D, 0D, -1D);
			}
			else if (tileentity.getMountRotate() == 3)
			{
				GL11.glTranslated(0D, 0D, -1D);
			}
			this.gunMount.render(tileentity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		if (tileentity.getStackInSlot(0) != null && tileentity.getStackInSlot(0).getItem() != null)
		{
			GL11.glScalef(-0.55F, -0.55F, 0.55F);
			GL11.glTranslated(-1D, -1D, 1D);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			boolean glows = false;
			tileentity.gunModel = null;

			//length to middle (Varies on Weapon) Make function that looks for weapon length dimensions and divide by 2 and subtract offset
			float l = 0F;

			Item item = tileentity.getStackInSlot(0).getItem();
			if (item == HalocraftItemsWeapons.SniperRifle)
			{
				l = 0.8F;//Sniper
			}
			else if (item == HalocraftItemsWeapons.DMR)
			{
				l = 0.4F;//DMR
			}
			else if (item == HalocraftItemsWeapons.PlasmaPistol)
			{
				l = 0.3F;//PlasmaPistol
			}
			else if (item == HalocraftItemsWeapons.PlasmaRifle)
			{
				l = 0.0F;//PlasmaRifle
			}
			else if (item == HalocraftItemsWeapons.Magnum)
			{
				l = 0.1F;//Magnum
			}
			else if (item == HalocraftItemsWeapons.AssaultRifle)
			{
				l = 0.5F;//AssaultRifle
			}
			else if (item == HalocraftItemsWeapons.Needler)
			{
				l = 0.0F;//Needler
			}
			else if (item == HalocraftItemsWeapons.Carbine)
			{
				l = 0.3F;//Carbine
			}
			else if (item == HalocraftItems.SwordHilt)
			{
				this.bindTexture(this.resourcelocationEnergySwordOff);
				tileentity.gunModel = this.modelEnergySword;
				l = 0.0F;//SwordHilt
			}
			else if (item == HalocraftItemsWeapons.EnergySword)
			{
				this.bindTexture(this.resourcelocationEnergySwordOn);
				tileentity.gunModel = this.modelEnergySword;
				glows = true;
				l = 0.6F;//EnergySword
			}
			else if (item == HalocraftItemsWeapons.RocketLauncher)
			{
				l = -0.2F;//RocketLauncher
			}
			else if (item == HalocraftItemsWeapons.Flamethrower)
			{
				l = 0.4F;//Flamethrower
				GL11.glTranslated(0D, 0.5D, 0D);
			}
			else if (item == HalocraftItemsWeapons.BattleRifle)
			{
				l = 0.4F;//BattleRifle
			}
			else if (item == HalocraftItemsWeapons.Spiker)
			{
				l = 0.6F;//Spiker
			}
			else if (item == HalocraftItemsWeapons.SMG)
			{
				l = 0.0F;//SMG
			}
			else if (item == HalocraftItemsWeapons.Shotgun)
			{
				l = 0.4F;//Shotgun
			}
			else if (item == HalocraftItemsWeapons.BeamRifle)
			{
				l = 0.8F;//BeamRifle
			}
			else if (item == HalocraftItemsWeapons.Mauler)
			{
				l = 0.0F;//Mauler
			}
			if (tileentity.gunModel == null)
			{
				if (item instanceof ItemWeapon && ((ItemWeapon)item).Properties.WeaponModel != null && ((ItemWeapon)item).Properties.WeaponModel.Model instanceof Model3DWeaponBase)
				{
					this.bindTexture(((ItemWeapon)item).Properties.WeaponModel.Texture);
					tileentity.gunModel = (Model3DWeaponBase) ((ItemWeapon)item).Properties.WeaponModel.Model;
					glows = ((ItemWeapon)item).Properties.WeaponModel.Glows;
				}
			}

			double angle = (tileentity.getRotationYGun()*5F)*Math.PI / 180; //Centers the model <v
			GL11.glTranslatef((float)(l*Math.sin(angle)-0.2F*Math.cos(angle)), 0F, (float)(l*Math.cos(angle)+0.2F*Math.sin(angle)));

			//System.out.println(tileentity.getRotationXGun()+":"+tileentity.getRotationYGun()+":"+tileentity.getRotationZGun());
			GL11.glScalef(1F+(float)tileentity.getScaleXGun()*0.04F, 1F+(float)tileentity.getScaleYGun()*0.04F, 1F+(float)tileentity.getScaleZGun()*0.04F);
			
			GL11.glRotatef((float)(tileentity.getRotationZGun()*5F), 0F, 0F, 1F);
			GL11.glRotatef((float)(tileentity.getRotationXGun()*5F), 1F, 0F, 0F);
			GL11.glRotatef((float)(tileentity.getRotationYGun()*5F), 0F, 1F, 0F);

			GL11.glTranslatef((float)tileentity.getTranslationXGun()*0.05F, (float)tileentity.getTranslationYGun()*0.05F, (float)tileentity.getTranslationZGun()*0.05F);

			if (tileentity.gunModel != null)
			{
				if (glows)
				{
					GL11.glDisable(GL11.GL_LIGHTING);
					OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
				}
				tileentity.gunModel.render(tileentity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				if (glows)
				{
					GL11.glEnable(GL11.GL_LIGHTING);
				}
			}
			else
			{
				EntityItem entityitem = new EntityItem(tileentity.getWorldObj(), 0.0D, 0.0D, 0.0D, new ItemStack(item));
				entityitem.getEntityItem().stackSize = 1;
				entityitem.hoverStart = 0.0F;
				GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(3.4F, 3.4F, 3.4F);
				GL11.glTranslatef(0F, -0.23F, -0.09F);
				if (Block.getBlockFromItem(item) != Blocks.air)
				{
					GL11.glTranslatef(0.09F, 0.07F, 0.1F);
				}
				RenderItem.renderInFrame = true;
				RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
				if (!Minecraft.getMinecraft().gameSettings.fancyGraphics && Block.getBlockFromItem(item) == Blocks.air)
				{
					IIcon icon = item.getIconFromDamage(item.getDamage(tileentity.getStackInSlot(0)));
					if (icon != null)
					{
						GL11.glDisable(GL11.GL_LIGHTING);
						GL11.glTranslated(0D, 0.333D, 0D);
						GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
						GL11.glScalef(0.5F, 0.5F, 0.5F);
						this.bindTexture(TextureMap.locationItemsTexture);
						Tessellator tessellator = Tessellator.instance;
						float f4 = 1.0F;
						float f5 = 0.5F;
						float f6 = 0.25F;
						tessellator.startDrawingQuads();
						tessellator.setNormal(0.0F, 1.0F, 0.0F);
						tessellator.addVertexWithUV((double)(0.0F - f5), (double)(0.0F - f6), 0.0D, (double)icon.getMinU(), (double)icon.getMinV());
						tessellator.addVertexWithUV((double)(f4 - f5), (double)(0.0F - f6), 0.0D, (double)icon.getMaxU(), (double)icon.getMinV());
						tessellator.addVertexWithUV((double)(f4 - f5), (double)(f4 - f6), 0.0D, (double)icon.getMaxU(), (double)icon.getMaxV());
						tessellator.addVertexWithUV((double)(0.0F - f5), (double)(f4 - f6), 0.0D, (double)icon.getMinU(), (double)icon.getMaxV());
						tessellator.draw();
						GL11.glEnable(GL11.GL_LIGHTING);
					}
				}
				RenderItem.renderInFrame = false;
			}
		}
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
	{
		renderBlock((TileEntityGunHolder)par1TileEntity, par2, par4, par6, par8);
	}
}