package net.killerchief.kcweaponmod.models;

import net.killerchief.kcweaponmod.Model3DWeaponBase;
import net.minecraft.client.model.ModelRenderer;

public class TechneModel extends Model3DWeaponBase
{
	public TechneModel()
	{
		textureWidth = 256;
		textureHeight = 256;

		//------------------------------v-- Size of array
		techneModel = new ModelRenderer[3];

		//Rename each variable e.g Shape1 to techneModel[0]
		//                     and Shape2 -> techneModel[1]
		//Don't forget to change the size of the array above
		
		//techneModel[0].mirror == false by default, if setting to true, do immediately after variable init. so before addBox!
		// mirror just makes the two blue faces L & R swap sides. and all other surfaces flip horizontally from left to right (view from front 3rd person).

		techneModel[0] = new ModelRenderer(this, 0, 0);
		//techneModel[0].mirror = true;
		techneModel[0].addBox(0F, 0F, 0F, 2, 2, 18);
		techneModel[0].setRotationPoint(0F, 0F, 0F);
		techneModel[0].setTextureSize(256, 256);
		setRotation(techneModel[0], 0F, 0F, 0F);
		
		techneModel[1] = new ModelRenderer(this, 0, 0);
		techneModel[1].addBox(0F, 0F, 0F, 1, 1, 15);
		techneModel[1].setRotationPoint(-5F, 0F, 7F);
		techneModel[1].setTextureSize(256, 256);
		setRotation(techneModel[1], 0F, 0.7853982F, 0F);
		
		techneModel[2] = new ModelRenderer(this, 0, 0);
		techneModel[2].addBox(0F, 0F, 0F, 1, 1, 8);
		techneModel[2].setRotationPoint(4F, 4F, 8F);
		techneModel[2].setTextureSize(256, 256);
		setRotation(techneModel[2], 0.7853982F, 0F, -0.7853982F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}