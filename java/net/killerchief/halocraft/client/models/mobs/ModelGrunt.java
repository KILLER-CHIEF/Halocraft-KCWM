package net.killerchief.halocraft.client.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGrunt extends ModelBase
{
	public ModelRenderer head1;
	public ModelRenderer head2;
	public ModelRenderer head3;
	public ModelRenderer head4;
	public ModelRenderer body1;
	public ModelRenderer body2;
	public ModelRenderer body3;
	public ModelRenderer body4;
	public ModelRenderer body5;
	public ModelRenderer body6;
	public ModelRenderer body7;
	public ModelRenderer body8;
	public ModelRenderer body9;
	public ModelRenderer leftArm1;
	public ModelRenderer leftArm2;
	public ModelRenderer rightArm1;
	public ModelRenderer rightArm2;
	public ModelRenderer leftLeg1;
	public ModelRenderer leftLeg2;
	public ModelRenderer rightLeg1;
	public ModelRenderer rightLeg2;

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

	public ModelGrunt()
	{
		this(0.0F);
		
	}

	public ModelGrunt(float par1)
	{
		this(par1, 0.0F, 64, 32);
	}

	public ModelGrunt(float par1, float par2, int par3, int par4)
	{
		this.heldItemLeft = 0;
		this.heldItemRight = 0;
		this.isSneak = false;
		this.aimedBow = false;
		this.textureWidth = par3;
		this.textureHeight = par4;
		
		head1 = new ModelRenderer(this, 0, 0);
		head1.addBox(-2F, -4F, -3F, 4, 4, 4);
		head1.setRotationPoint(0F, 11F, -0.5F);
		head1.setTextureSize(64, 32);
		//setRotation(head1, 0F, 0F, 0F);
		head2 = new ModelRenderer(this, 18, 0);
		head2.addBox(-1F, -2F, -3.5F, 2, 2, 1);
		head2.setRotationPoint(0F, 11F, -0.5F);
		head2.setTextureSize(64, 32);
		//setRotation(head2, 0F, 0F, 0F);
		head3 = new ModelRenderer(this, 26, 0);
		head3.addBox(2F, -2F, -1.2F, 2, 2, 2);
		head3.setRotationPoint(0F, 11F, -0.5F);
		head3.setTextureSize(64, 32);
		//setRotation(head3, 0F, 0.9599310887F, 0F);
		head4 = new ModelRenderer(this, 26, 0);
		head4.mirror = true;
		head4.addBox(-4F, -2F, -1.2F, 2, 2, 2);
		head4.setRotationPoint(0F, 11F, -0.5F);
		head4.setTextureSize(64, 32);
		//setRotation(head4, 0F, -0.9599311F, 0F);
		body1 = new ModelRenderer(this, 0, 13);
		body1.addBox(-4F, 0F, -2.5F, 8, 5, 5);
		body1.setRotationPoint(0F, 11F, 0F);
		body1.setTextureSize(64, 32);
		setRotation(body1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 0, 25);
		body2.addBox(-2F, 5F, -2F, 4, 3, 4);
		body2.setRotationPoint(0F, 11F, 0F);
		body2.setTextureSize(64, 32);
		setRotation(body2, 0F, 0F, 0F);
		body3 = new ModelRenderer(this, 52, 12);
		body3.addBox(1.5F, 5.5F, -1.5F, 3, 2, 3);
		body3.setRotationPoint(0F, 11F, 0F);
		body3.setTextureSize(64, 32);
		setRotation(body3, 0F, 0F, 0F);
		body4 = new ModelRenderer(this, 52, 12);
		body4.mirror = true;
		body4.addBox(-4.5F, 5.5F, -1.5F, 3, 2, 3);
		body4.setRotationPoint(0F, 11F, 0F);
		body4.setTextureSize(64, 32);
		setRotation(body4, 0F, 0F, 0F);
		body5 = new ModelRenderer(this, 18, 6);
		body5.addBox(-4F, -3F, 0.5F, 8, 3, 2);
		body5.setRotationPoint(0F, 11F, 0F);
		body5.setTextureSize(64, 32);
		setRotation(body5, 0F, 0F, 0F);
		body6 = new ModelRenderer(this, 20, 24);
		body6.addBox(1F, -0.2F, 1.5F, 2, 2, 6);
		body6.setRotationPoint(0F, 11F, 0F);
		body6.setTextureSize(64, 32);
		setRotation(body6, 1.047198F, 0F, 0F);
		body7 = new ModelRenderer(this, 20, 24);
		body7.mirror = true;
		body7.addBox(-3F, -0.2F, 1.5F, 2, 2, 6);
		body7.setRotationPoint(0F, 11F, 0F);
		body7.setTextureSize(64, 32);
		setRotation(body7, 1.047198F, 0F, 0F);
		body8 = new ModelRenderer(this, 54, 0);
		body8.addBox(3F, 0.5F, -1F, 3, 2, 2);
		body8.setRotationPoint(0F, 11F, 0F);
		body8.setTextureSize(64, 32);
		setRotation(body8, 0F, 0F, 0F);
		body9 = new ModelRenderer(this, 54, 0);
		body9.mirror = true;
		body9.addBox(-6F, 0.5F, -1F, 3, 2, 2);
		body9.setRotationPoint(0F, 11F, 0F);
		body9.setTextureSize(64, 32);
		setRotation(body9, 0F, 0F, 0F);
		leftArm1 = new ModelRenderer(this, 40, 0);
		leftArm1.addBox(0F, -1F, -1F, 4, 2, 2);
		leftArm1.setRotationPoint(5F, 12.5F, 0F);
		leftArm1.setTextureSize(64, 32);
		//setRotation(leftArm1, 0F, 0F, 0.8726646F);
		leftArm2 = new ModelRenderer(this, 40, 6);
		leftArm2.addBox(1F, 1.8F, -1F, 4, 2, 2);
		leftArm2.setRotationPoint(5F, 12.5F, 0F);
		leftArm2.setTextureSize(64, 32);
		//setRotation(leftArm2, 0.7330383F, 1.396263F, 0.2792527F);
		rightArm1 = new ModelRenderer(this, 40, 0);
		rightArm1.mirror = true;
		rightArm1.addBox(-4F, -1F, -1F, 4, 2, 2);
		rightArm1.setRotationPoint(-5F, 12.5F, 0F);
		rightArm1.setTextureSize(64, 32);
		//setRotation(rightArm1, 0F, 0F, -0.8726646F);
		rightArm2 = new ModelRenderer(this, 40, 6);
		rightArm2.mirror = true;
		rightArm2.addBox(-5F, 1.9F, -0.95F, 4, 2, 2);
		rightArm2.setRotationPoint(-5F, 12.5F, 0F);
		rightArm2.setTextureSize(64, 32);
		//setRotation(rightArm2, 0.7330383F, -1.396263F, -0.2792527F);
		leftLeg1 = new ModelRenderer(this, 42, 12);
		leftLeg1.addBox(-1F, 0F, -1F, 2, 4, 2);
		leftLeg1.setRotationPoint(3.5F, 17.5F, 0F);
		leftLeg1.setTextureSize(64, 32);
		setRotation(leftLeg1, 0F, 0F, 0F);
		leftLeg2 = new ModelRenderer(this, 52, 19);
		leftLeg2.addBox(-1.5F, 3.5F, -1.5F, 3, 3, 3);
		leftLeg2.setRotationPoint(3.5F, 17.5F, 0F);
		leftLeg2.setTextureSize(64, 32);
		setRotation(leftLeg2, 0F, 0F, 0F);
		rightLeg1 = new ModelRenderer(this, 42, 12);
		rightLeg1.mirror = true;
		rightLeg1.addBox(-1F, 0F, -1F, 2, 4, 2);
		rightLeg1.setRotationPoint(-3.5F, 17.5F, 0F);
		rightLeg1.setTextureSize(64, 32);
		setRotation(rightLeg1, 0F, 0F, 0F);
		rightLeg2 = new ModelRenderer(this, 52, 19);
		rightLeg2.mirror = true;
		rightLeg2.addBox(-1.5F, 3.5F, -1.5F, 3, 3, 3);
		rightLeg2.setRotationPoint(-3.5F, 17.5F, 0F);
		rightLeg2.setTextureSize(64, 32);
		setRotation(rightLeg2, 0F, 0F, 0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head1.render(par7);
		this.head2.render(par7);
		this.head3.render(par7);
		this.head4.render(par7);
		this.body1.render(par7);
		this.body2.render(par7);
		this.body3.render(par7);
		this.body4.render(par7);
		this.body5.render(par7);
		this.body6.render(par7);
		this.body7.render(par7);
		this.body8.render(par7);
		this.body9.render(par7);
		this.leftArm1.render(par7);
		this.leftArm2.render(par7);
		this.rightArm1.render(par7);
		this.rightArm2.render(par7);
		this.leftLeg1.render(par7);
		this.leftLeg2.render(par7);
		this.rightLeg1.render(par7);
		this.rightLeg2.render(par7);
	}

	/*int j = 0;
	int k = 0;
	int l = 0;*/
	
	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		this.head1.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head1.rotateAngleX = par5 / (180F / (float)Math.PI);
		this.head2.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head2.rotateAngleX = par5 / (180F / (float)Math.PI);
		
		this.head4.rotateAngleY = (par4 - 55F) / (180F / (float)Math.PI);// - 0.9599310887F;
		this.head4.rotateAngleX = par5 / (180F / (float)Math.PI);
		this.head4.rotateAngleZ = 0F;
		
		this.head3.rotateAngleY = (par4 + 55F) / (180F / (float)Math.PI);// - 0.9599310887F;
		this.head3.rotateAngleX = par5 / (180F / (float)Math.PI);
		this.head3.rotateAngleZ = 0F;
		
		//this.head3.rotateAngleY = par4 + 55F / (180F / (float)Math.PI);//0.9599310887F;
		//this.head3.rotateAngleX = par5 / (180F / (float)Math.PI);
		
		//this.head3.rotateAngleZ = par5 / (180F / (float)Math.PI);//-0.3490658504F;
		
		//this.head3.rotateAngleY = par4 / (180F / (float)Math.PI);
		//this.head3.rotateAngleX = par5 / (180F / (float)Math.PI);
		

		//this.rightArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
		//this.rightArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2 * 1.0F - 1.6F; // <<< Here
		//this.rightArm1.rotateAngleX = 0.0F;
		//if (this.heldItemRight != 0)
		//{
		//	this.rightArm1.rotateAngleX = this.rightArm1.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
		//}
		//this.rightArm1.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
		
		this.rightArm1.rotateAngleX = 0.0F;
		this.rightArm1.rotateAngleY = 0.0F;
		this.rightArm1.rotateAngleZ = -0.872664626F;
		this.rightArm1.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		
		this.leftArm1.rotateAngleX = 0.0F;
		this.leftArm1.rotateAngleY = 0.0F;
		this.leftArm1.rotateAngleZ = 0.872664626F;
		this.leftArm1.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		
		this.rightArm2.rotateAngleX = 40 / (180F / (float)Math.PI);//0.7330383F;
		this.rightArm2.rotateAngleY = -90 / (180F / (float)Math.PI);//-1.396263F;
		this.rightArm2.rotateAngleZ = 0F;// / (180F / (float)Math.PI);//-0.2792527F;
		this.rightArm2.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		
		/*if (org.lwjgl.input.Keyboard.isKeyDown(42)) {
			if (org.lwjgl.input.Keyboard.isKeyDown(36))
				j -= 1;
			if (org.lwjgl.input.Keyboard.isKeyDown(37))
				k -= 1;
			if (org.lwjgl.input.Keyboard.isKeyDown(38))
				l -= 1;
		} else {
			if (org.lwjgl.input.Keyboard.isKeyDown(36))
				j += 1;
			if (org.lwjgl.input.Keyboard.isKeyDown(37))
				k += 1;
			if (org.lwjgl.input.Keyboard.isKeyDown(38))
				l += 1;
		}*/
		//System.out.println("j"+j);
		//System.out.println("k"+k);
		//System.out.println("l"+l);
		
		this.leftArm2.rotateAngleX = 97F / (180F / (float)Math.PI);//0.7330383F;42
		this.leftArm2.rotateAngleY = 70F / (180F / (float)Math.PI);//-1.396263F;80
		this.leftArm2.rotateAngleZ = 57F / (180F / (float)Math.PI);//-0.2792527F;16
		this.leftArm2.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		
		//this.leftArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
		//this.leftArm1.rotateAngleZ = 0.0F;
		
		this.rightLeg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		this.rightLeg1.rotateAngleY = 0.0F;
		this.leftLeg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		this.leftLeg1.rotateAngleY = 0.0F;
		this.rightLeg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		this.rightLeg2.rotateAngleY = 0.0F;
		this.leftLeg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		this.leftLeg2.rotateAngleY = 0.0F;

		/*if (this.heldItemLeft != 0)
		{
			this.leftArm1.rotateAngleX = this.leftArm1.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
		}

		

		
		this.leftArm1.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		
		this.leftArm1.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;


		//this.rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
		this.rightArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.6F * par2 * 1.0F - 1.6F; // <<< Here
		this.leftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
		this.rightArm2.rotateAngleZ = 0.0F;
		this.leftArm2.rotateAngleZ = 0.0F;
		

		

		if (this.heldItemLeft != 0)
		{
			this.leftArm2.rotateAngleX = this.leftArm2.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
		}

		if (this.heldItemRight != 0)
		{
			this.rightArm2.rotateAngleX = this.rightArm2.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
		}

		//this.rightArm2.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		//this.leftArm2.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		//this.rightArm2.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
		//this.leftArm2.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;*/
		
		/*if (this.isRiding)
		{
			this.rightArm1.rotateAngleX += -((float)Math.PI / 5F);
			this.leftArm1.rotateAngleX += -((float)Math.PI / 5F);
			this.rightLeg1.rotateAngleX = -((float)Math.PI * 2F / 5F);
			this.leftLeg1.rotateAngleX = -((float)Math.PI * 2F / 5F);
			this.rightLeg1.rotateAngleY = ((float)Math.PI / 10F);
			this.leftLeg1.rotateAngleY = -((float)Math.PI / 10F);
			
			this.rightArm2.rotateAngleX += -((float)Math.PI / 5F);
			this.leftArm2.rotateAngleX += -((float)Math.PI / 5F);
			this.rightLeg2.rotateAngleX = -((float)Math.PI * 2F / 5F);
			this.leftLeg2.rotateAngleX = -((float)Math.PI * 2F / 5F);
			this.rightLeg2.rotateAngleY = ((float)Math.PI / 10F);
			this.leftLeg2.rotateAngleY = -((float)Math.PI / 10F);
		}*/
	}
}