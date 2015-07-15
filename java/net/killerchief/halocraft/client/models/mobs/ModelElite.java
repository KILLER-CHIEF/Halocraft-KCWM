package net.killerchief.halocraft.client.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelElite extends ModelBase
{
	public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightArm;
    public ModelRenderer leftArm;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;

    /**
     * Records whether the model should be rendered holding an item in the left hand, and if that item is a block.
     */
    public int heldItemLeft;

    /**
     * Records whether the model should be rendered holding an item in the right hand, and if that item is a block.
     */
    public int heldItemRight;
    public boolean isSneak;

    /** Records whether the model should be rendered aiming a bow. */
    public boolean aimedBow;

    public ModelElite()
    {
        this(0.0F);
    }

    public ModelElite(float par1)
    {
        this(par1, 0.0F, 64, 32);
    }

    public ModelElite(float par1, float par2, int par3, int par4)
    {
        this.heldItemLeft = 0;
        this.heldItemRight = 0;
        this.isSneak = false;
        this.aimedBow = false;
        this.textureWidth = par3;
        this.textureHeight = par4;
        head = new ModelRenderer(this, 0, 0);
        head.mirror = false;
        head.setTextureOffset(0, 0).addBox(-4F, -6F, -6F, 8, 7, 7, par1);
        head.setTextureOffset(40, 0).addBox(-4F, -6F, -10F, 8, 5, 4, par1);
        head.setTextureOffset(40, 10).addBox(1.0F, -1F, -10F, 2, 1, 4, par1);
        head.setTextureOffset(52, 10).addBox(1.0F, 0.0F, -10F, 2, 1, 4, par1);
        head.mirror = true;
        head.setTextureOffset(40, 10).addBox(-3F, -1F, -10F, 2, 1, 4, par1);
        head.setTextureOffset(52, 10).addBox(-3F, 0.0F, -10F, 2, 1, 4, par1);
        head.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0.0F, -2F, 8, 12, 4, par1);
        body.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
        rightArm = new ModelRenderer(this, 40, 16);
        rightArm.addBox(-3F, -2F, -2F, 4, 12, 4, par1);
        rightArm.setRotationPoint(-5F, 2.0F + par2, 0.0F);
        leftArm = new ModelRenderer(this, 40, 16);
        leftArm.mirror = true;
        leftArm.addBox(-1F, -2F, -2F, 4, 12, 4, par1);
        leftArm.setRotationPoint(5F, 2.0F + par2, 0.0F);
        rightLeg = new ModelRenderer(this, 0, 16);
        rightLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
        rightLeg.setRotationPoint(-2F, 12F + par2, 0.0F);
        leftLeg = new ModelRenderer(this, 0, 16);
        leftLeg.mirror = true;
        leftLeg.addBox(-2F, 0.0F, -2F, 4, 12, 4, par1);
        leftLeg.setRotationPoint(2.0F, 12F + par2, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

        if (this.isChild)
        {
            float var8 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
            GL11.glTranslatef(0.0F, 16.0F * par7, 0.0F);
            this.head.render(par7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
            GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
            this.body.render(par7);
            this.rightArm.render(par7);
            this.leftArm.render(par7);
            this.rightLeg.render(par7);
            this.leftLeg.render(par7);
            GL11.glPopMatrix();
        }
        else
        {
            this.head.render(par7);
            this.body.render(par7);
            this.rightArm.render(par7);
            this.leftArm.render(par7);
            this.rightLeg.render(par7);
            this.leftLeg.render(par7);
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
        //this.rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
        this.rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2 * 1.0F - 1.6F; // <<< Here
        this.leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
        this.rightArm.rotateAngleZ = 0.0F;
        this.leftArm.rotateAngleZ = 0.0F;
        this.rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.rightLeg.rotateAngleY = 0.0F;
        this.leftLeg.rotateAngleY = 0.0F;

        if (this.isRiding)
        {
            this.rightArm.rotateAngleX += -((float)Math.PI / 5F);
            this.leftArm.rotateAngleX += -((float)Math.PI / 5F);
            this.rightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.leftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.rightLeg.rotateAngleY = ((float)Math.PI / 10F);
            this.leftLeg.rotateAngleY = -((float)Math.PI / 10F);
        }

        if (this.heldItemLeft != 0)
        {
            this.leftArm.rotateAngleX = this.leftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
        }

        if (this.heldItemRight != 0)
        {
            this.rightArm.rotateAngleX = this.rightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
        }

        this.rightArm.rotateAngleY = 0.0F;
        this.leftArm.rotateAngleY = 0.0F;
        float var8;
        float var9;

        if (this.onGround > -9990.0F)
        {
            var8 = this.onGround;
            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(var8) * (float)Math.PI * 2.0F) * 0.2F;
            this.rightArm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.rightArm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.leftArm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
            this.leftArm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
            this.rightArm.rotateAngleY += this.body.rotateAngleY;
            this.leftArm.rotateAngleY += this.body.rotateAngleY;
            this.leftArm.rotateAngleX += this.body.rotateAngleY;
            var8 = 1.0F - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0F - var8;
            var9 = MathHelper.sin(var8 * (float)Math.PI);
            float var10 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            this.rightArm.rotateAngleX = (float)((double)this.rightArm.rotateAngleX - ((double)var9 * 1.2D + (double)var10));
            this.rightArm.rotateAngleY += this.body.rotateAngleY * 2.0F;
            this.rightArm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
        }

        if (this.isSneak)
        {
            this.body.rotateAngleX = 0.5F;
            this.rightArm.rotateAngleX += 0.4F;
            this.leftArm.rotateAngleX += 0.4F;
            this.rightLeg.rotationPointZ = 4.0F;
            this.leftLeg.rotationPointZ = 4.0F;
            this.rightLeg.rotationPointY = 9.0F;
            this.leftLeg.rotationPointY = 9.0F;
            this.head.rotationPointY = 1.0F;
        }
        else
        {
            this.body.rotateAngleX = 0.0F;
            this.rightLeg.rotationPointZ = 0.1F;
            this.leftLeg.rotationPointZ = 0.1F;
            this.rightLeg.rotationPointY = 12.0F;
            this.leftLeg.rotationPointY = 12.0F;
            this.head.rotationPointY = 0.0F;
        }

        this.rightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.leftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.rightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.leftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;

        if (this.aimedBow)
        {
            var8 = 0.0F;
            var9 = 0.0F;
            this.rightArm.rotateAngleZ = 0.0F;
            this.leftArm.rotateAngleZ = 0.0F;
            this.rightArm.rotateAngleY = -(0.1F - var8 * 0.6F) + this.head.rotateAngleY;
            this.leftArm.rotateAngleY = 0.1F - var8 * 0.6F + this.head.rotateAngleY + 0.4F;
            this.rightArm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
            this.leftArm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
            this.rightArm.rotateAngleX -= var8 * 1.2F - var9 * 0.4F;
            this.leftArm.rotateAngleX -= var8 * 1.2F - var9 * 0.4F;
            this.rightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
            this.leftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
            this.rightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
            this.leftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        }
    }
}