package net.killerchief.halocraft.client.render;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.guns.ModelSniperRifle;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class RenderGun implements IItemRenderer {
	
	private ModelBase Model = new ModelSniperRifle();
	private ResourceLocation par1ResourceLocation = new ResourceLocation(Halocraft.MODID+":textures/guns/SkinSniperRifle.png");
	private boolean NoChngOnSprint = false;
	
	public RenderGun(ModelBase model, String texture, boolean nochngonsprint)
	{
		this.Model = model;
		this.par1ResourceLocation = new ResourceLocation(texture);
		this.NoChngOnSprint = nochngonsprint;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return false;
	}
	int xo = 0;
	int yo = 0;
	int zo = 0;
	
	private static RenderItem renderItem = new RenderItem();

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		if (data != null && data[1] != null && data[1] instanceof EntityLivingBase)
		{
			EntityLivingBase entity = (EntityLivingBase)data[1];
			if (entity.getHeldItem() != null)
			{
				if (type == type.EQUIPPED)
				{
					GL11.glPushMatrix();
					GL11.glScalef(0.55F, 0.55F, -0.55F);
					
					if (entity instanceof EntityPlayer && item.getItem().getItemUseAction(item) == EnumAction.block)
					{
						//		              Down   Foreward  Left
						GL11.glTranslatef(1.25F, 0.445F, 0.34F);
						GL11.glRotatef(166F, 1F, 0F, 0F);//Turn Front Left
						GL11.glRotatef(-34F, 0F, 1F, 0F);//Tilt Front Down
						GL11.glRotatef(90F, 0F, 0F, 1F);//Tilt Sideways top right
					}
					else
					{
						if ((!this.NoChngOnSprint && entity.isSprinting()) || (entity instanceof EntityPlayer && entity.getHeldItem().getItem() instanceof ItemWeapon && ((ItemWeapon)entity.getHeldItem().getItem()).doloweredweapon()))
						{
							//               Down   Foreward  Left
							GL11.glTranslatef(0.8F, 0.45F, -0.24F);
							GL11.glRotatef(22F, 1F, 0F, 0F);//Turn Front Left
							GL11.glRotatef(0F, 0F, 1F, 0F);//Tilt Front Down
							GL11.glRotatef(83F, 0F, 0F, 1F);//Tilt Sideways top right
						}
						else
						{
							//              Down   Foreward  Left
							GL11.glTranslatef(1.33F, 0.745F, -0.24F);
							GL11.glRotatef(82F, 1F, 0F, 0F);//Turn Front Left
							GL11.glRotatef(-54F, 0F, 1F, 0F);//Tilt Front Down
							GL11.glRotatef(83F, 0F, 0F, 1F);//Tilt Sideways top right
						}
					}
					
					Minecraft.getMinecraft().renderEngine.bindTexture(par1ResourceLocation);
					this.Model.render((Entity)data[1], 0F, 0F, 0F, 0F, 0F, 0.0625F);
					
					//renderText(item);
					
					GL11.glPopMatrix();
				}
				else if (type == type.EQUIPPED_FIRST_PERSON)
				{
					GL11.glPushMatrix();
					GL11.glScalef(-1.0F, -1.0F, 1.0F);
					
					if (entity instanceof EntityPlayer && item.getItem().getItemUseAction(item) == EnumAction.block)
					{
						//		          up  right  forward
						GL11.glTranslatef(-0.6F, 0.4F, 0.8F);
						GL11.glRotatef(200, 1F, 0F, 0F);//rotate front right
						GL11.glRotatef(-60, 0F, 1F, 0F);//front down
						GL11.glRotatef(-90, 0F, 0F, 1F);//roll left
					}
					else
					{
						if ((!this.NoChngOnSprint && entity.isSprinting())  || (entity instanceof EntityPlayer && entity.getHeldItem().getItem() instanceof ItemWeapon && ((ItemWeapon)entity.getHeldItem().getItem()).doloweredweapon()))
						{
							//              up  backLeft  right
							GL11.glTranslatef(-1.2F, -0.4F, -0.6F);
							GL11.glRotatef(-10, 1F, 0F, 0F);//rotate front right
							GL11.glRotatef(40, 0F, 1F, 0F);
							GL11.glRotatef(-130, 0F, 0F, 1F);//roll right
						}
						else
						{
							//	          up  backLeft  right
							GL11.glTranslatef(-1.4F, -0.6F, 0.3F);
							GL11.glRotatef(-70, 1F, 0F, 0F);//rotate front right
							GL11.glRotatef(40, 0F, 1F, 0F);
							GL11.glRotatef(-100, 0F, 0F, 1F);//roll right
						}
					}
					
					Minecraft.getMinecraft().renderEngine.bindTexture(par1ResourceLocation);
					this.Model.render((Entity)data[1], 0F, 0F, 0F, 0F, 0F, 0.0625F);
					
					//renderText(item);
					
					GL11.glPopMatrix();
				}
			}
		}
	}
	
	private void renderText(ItemStack item)
	{
		GL11.glScalef(0.08F, 0.08F, -0.08F);
		
		FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
		// ====================== Render text ======================
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        String text = Integer.toString(item.getItemDamage());
        fontRenderer.drawStringWithShadow(text, 0, 0, 0xFFFFFF);
	}

}
