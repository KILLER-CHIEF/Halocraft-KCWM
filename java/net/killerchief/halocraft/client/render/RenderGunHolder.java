package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.client.models.guns.ModelAssaultRifle;
import net.killerchief.halocraft.client.models.guns.ModelBattleRifle;
import net.killerchief.halocraft.client.models.guns.ModelBeamRifle;
import net.killerchief.halocraft.client.models.guns.ModelCarbine;
import net.killerchief.halocraft.client.models.guns.ModelDMR;
import net.killerchief.halocraft.client.models.guns.ModelEnergySword;
import net.killerchief.halocraft.client.models.guns.ModelFlamethrower;
import net.killerchief.halocraft.client.models.guns.ModelMagnum;
import net.killerchief.halocraft.client.models.guns.ModelMauler;
import net.killerchief.halocraft.client.models.guns.ModelNeedler;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaPistol;
import net.killerchief.halocraft.client.models.guns.ModelPlasmaRifle;
import net.killerchief.halocraft.client.models.guns.ModelRocketLauncher;
import net.killerchief.halocraft.client.models.guns.ModelSMG;
import net.killerchief.halocraft.client.models.guns.ModelShotgun;
import net.killerchief.halocraft.client.models.guns.ModelSniperRifle;
import net.killerchief.halocraft.client.models.guns.ModelSpiker;
import net.killerchief.halocraft.client.models.items.ModelGunHolderMount;
import net.killerchief.halocraft.config.HalocraftItems;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGunHolder extends TileEntitySpecialRenderer {

	private Model3DBase gunModelSniperRifle = new ModelSniperRifle();
	private static final ResourceLocation resourcelocationSniperRifle = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSniperRifle.png");
	private Model3DBase gunModelDMR = new ModelDMR();
	private static final ResourceLocation resourcelocationDMR = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinDMR.png");
	private Model3DBase gunModelPlasmaPistol = new ModelPlasmaPistol();
	private static final ResourceLocation resourcelocationPlasmaPistol = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinPlasmaPistol.png");
	private Model3DBase gunModelPlasmaRifle = new ModelPlasmaRifle();
	private static final ResourceLocation resourcelocationPlasmaRifle = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinPlasmaRifle.png");
	private Model3DBase gunModelMagnum = new ModelMagnum();
	private static final ResourceLocation resourcelocationMagnum = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinMagnum.png");
	private Model3DBase gunModelAssaultRifle = new ModelAssaultRifle();
	private static final ResourceLocation resourcelocationAssaultRifle = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinAssaultRifle.png");
	private Model3DBase gunModelNeedler = new ModelNeedler();
	private static final ResourceLocation resourcelocationNeedler = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinNeedler.png");
	private Model3DBase gunModelCarbine = new ModelCarbine();
	private static final ResourceLocation resourcelocationCarbine = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinCarbine.png");
	private Model3DBase gunModelSwordHilt = new ModelEnergySword();
	private static final ResourceLocation resourcelocationSwordHilt = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySwordOff.png");
	private Model3DBase gunModelEnergySword = new ModelEnergySword();
	private static final ResourceLocation resourcelocationEnergySword = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinEnergySword.png");
	private Model3DBase gunModelRocketLauncher = new ModelRocketLauncher();
	private static final ResourceLocation resourcelocationRocketLauncher = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinRocketLauncher.png");
	private Model3DBase gunModelFlamethrower = new ModelFlamethrower();
	private static final ResourceLocation resourcelocationFlamethrower = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinFlamethrower.png");
	private Model3DBase gunModelBattleRifle = new ModelBattleRifle();
	private static final ResourceLocation resourcelocationBattleRifle = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinBattleRifle.png");
	private Model3DBase gunModelSpiker = new ModelSpiker();
	private static final ResourceLocation resourcelocationSpiker = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSpiker.png");
	private Model3DBase gunModelSMG = new ModelSMG();
	private static final ResourceLocation resourcelocationSMG = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSMG.png");
	private Model3DBase gunModelShotgun = new ModelShotgun();
	private static final ResourceLocation resourcelocationShotgun = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinShotgun.png");
	private Model3DBase gunModelBeamRifle = new ModelBeamRifle();
	private static final ResourceLocation resourcelocationBeamRifle = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinBeamRifle.png");
	private Model3DBase gunModelMauler = new ModelMauler();
	private static final ResourceLocation resourcelocationMauler = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinMauler.png");

	private ModelGunHolderMount gunMount = new ModelGunHolderMount();
	private static final ResourceLocation resourcelocationGunMount = new ResourceLocation(Halocraft.MODID+":textures/entities/GunHolderRender.png");
	
	public RenderGunHolder() {}

	public void renderBlock(TileEntityGunHolder tileentity, double par2, double par4, double par6, float par8)
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
		GL11.glPushMatrix();
		GL11.glTranslatef((float)par2, (float)par4, (float)par6);
		if (tileentity.getStackInSlot(0) != null && tileentity.getStackInSlot(0).getItem() != null)
		{
			GL11.glScalef(-0.55F, -0.55F, 0.55F);
			GL11.glTranslated(-1D, -1D, 1D);
			GL11.glRotatef(180F, 1F, 0F, 0F);

			//length to middle (Varies on Weapon) Make function that looks for weapon length dimensions and divide by 2 and subtract offset
			float l = 0F;

			Item item = tileentity.getStackInSlot(0).getItem();
			if (item == HalocraftItemsWeapons.SniperRifle)
			{
				this.bindTexture(this.resourcelocationSniperRifle);
				tileentity.gunModel = this.gunModelSniperRifle;
				l = 0.8F;//Sniper
			}
			else if (item == HalocraftItemsWeapons.DMR)
			{
				this.bindTexture(this.resourcelocationDMR);
				tileentity.gunModel = this.gunModelDMR;
				l = 0.4F;//DMR
			}
			else if (item == HalocraftItemsWeapons.PlasmaPistol)
			{
				this.bindTexture(this.resourcelocationPlasmaPistol);
				tileentity.gunModel = this.gunModelPlasmaPistol;
				l = 0.3F;//PlasmaPistol
			}
			else if (item == HalocraftItemsWeapons.PlasmaRifle)
			{
				this.bindTexture(this.resourcelocationPlasmaRifle);
				tileentity.gunModel = this.gunModelPlasmaRifle;
				l = 0.0F;//PlasmaRifle
			}
			else if (item == HalocraftItemsWeapons.Magnum)
			{
				this.bindTexture(this.resourcelocationMagnum);
				tileentity.gunModel = this.gunModelMagnum;
				l = 0.1F;//Magnum
			}
			else if (item == HalocraftItemsWeapons.AssaultRifle)
			{
				this.bindTexture(this.resourcelocationAssaultRifle);
				tileentity.gunModel = this.gunModelAssaultRifle;
				l = 0.5F;//AssaultRifle
			}
			else if (item == HalocraftItemsWeapons.Needler)
			{
				this.bindTexture(this.resourcelocationNeedler);
				tileentity.gunModel = this.gunModelNeedler;
				l = 0.0F;//Needler
			}
			else if (item == HalocraftItemsWeapons.Carbine)
			{
				this.bindTexture(this.resourcelocationCarbine);
				tileentity.gunModel = this.gunModelCarbine;
				l = 0.3F;//Carbine
			}
			else if (item == HalocraftItems.SwordHilt)
			{
				this.bindTexture(this.resourcelocationSwordHilt);
				tileentity.gunModel = this.gunModelSwordHilt;
				l = 0.0F;//SwordHilt
			}
			else if (item == HalocraftItemsWeapons.EnergySword)
			{
				this.bindTexture(this.resourcelocationEnergySword);
				tileentity.gunModel = this.gunModelEnergySword;
				l = 0.6F;//EnergySword
			}
			else if (item == HalocraftItemsWeapons.RocketLauncher)
			{
				this.bindTexture(this.resourcelocationRocketLauncher);
				tileentity.gunModel = this.gunModelRocketLauncher;
				l = -0.2F;//RocketLauncher
			}
			else if (item == HalocraftItemsWeapons.Flamethrower)
			{
				this.bindTexture(this.resourcelocationFlamethrower);
				tileentity.gunModel = this.gunModelFlamethrower;
				l = 0.4F;//Flamethrower
				GL11.glTranslated(0D, 0.5D, 0D);
			}
			else if (item == HalocraftItemsWeapons.BattleRifle)
			{
				this.bindTexture(this.resourcelocationBattleRifle);
				tileentity.gunModel = this.gunModelBattleRifle;
				l = 0.4F;//BattleRifle
			}
			else if (item == HalocraftItemsWeapons.Spiker)
			{
				this.bindTexture(this.resourcelocationSpiker);
				tileentity.gunModel = this.gunModelSpiker;
				l = 0.6F;//Spiker
			}
			else if (item == HalocraftItemsWeapons.SMG)
			{
				this.bindTexture(this.resourcelocationSMG);
				tileentity.gunModel = this.gunModelSMG;
				l = 0.0F;//SMG
			}
			else if (item == HalocraftItemsWeapons.Shotgun)
			{
				this.bindTexture(this.resourcelocationShotgun);
				tileentity.gunModel = this.gunModelShotgun;
				l = 0.4F;//Shotgun
			}
			else if (item == HalocraftItemsWeapons.BeamRifle)
			{
				this.bindTexture(this.resourcelocationBeamRifle);
				tileentity.gunModel = this.gunModelBeamRifle;
				l = 0.8F;//BeamRifle
			}
			else if (item == HalocraftItemsWeapons.Mauler)
			{
				this.bindTexture(this.resourcelocationMauler);
				tileentity.gunModel = this.gunModelMauler;
				l = 0.0F;//Mauler
			}
			else
			{
				tileentity.gunModel = null;
			}

			double angle = (tileentity.getRotationYGun()*5F)*Math.PI / 180; //Centers the model <v
			GL11.glTranslatef((float)(l*Math.sin(angle)-0.2F*Math.cos(angle)), 0F, (float)(l*Math.cos(angle)+0.2F*Math.sin(angle)));

			//System.out.println(tileentity.getRotationXGun()+":"+tileentity.getRotationYGun()+":"+tileentity.getRotationZGun());
			GL11.glRotatef((float)(tileentity.getRotationZGun()*5F), 0F, 0F, 1F);
			GL11.glRotatef((float)(tileentity.getRotationXGun()*5F), 1F, 0F, 0F);
			GL11.glRotatef((float)(tileentity.getRotationYGun()*5F), 0F, 1F, 0F);
			
			GL11.glTranslatef((float)tileentity.getTranslationXGun()*0.05F, (float)tileentity.getTranslationYGun()*0.05F, (float)tileentity.getTranslationZGun()*0.05F);

			if (tileentity.gunModel != null)
			{
				tileentity.gunModel.render(tileentity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
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