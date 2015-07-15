//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.guns;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelAssaultRifleSquare extends Model3DBase
{
	public ModelAssaultRifleSquare()
	{
		textureWidth = 256;
		textureHeight = 256;
		
		techneModel = new ModelRenderer[23];
		
		techneModel[0] = new ModelRenderer(this, 56, 40);
		techneModel[0].addBox(0F, 0F, 0F, 6, 4, 50, 0F);
		techneModel[0].setRotationPoint(1F, -4F, -19F);
		techneModel[0].setTextureSize(256, 256);
		techneModel[0].mirror = true;
		
		techneModel[1] = new ModelRenderer(this, 14, 39);
		techneModel[1].addBox(0F, 0F, 0F, 6, 5, 11, 0F);
		techneModel[1].setRotationPoint(1F, -9F, 20F);
		techneModel[1].setTextureSize(256, 256);
		techneModel[1].mirror = true;
		
		techneModel[2] = new ModelRenderer(this, 56, 42);
		techneModel[2].addBox(0F, 0F, 0F, 6, 5, 12, 0F);
		techneModel[2].setRotationPoint(1F, -9F, 8F);
		techneModel[2].setTextureSize(256, 256);
		techneModel[2].mirror = true;
		
		techneModel[4] = new ModelRenderer(this, 41, 103);
		techneModel[4].addBox(0F, 0F, 0F, 6, 5, 26, 0F);
		techneModel[4].setRotationPoint(1F, 0F, 4F);
		techneModel[4].setTextureSize(256, 256);
		techneModel[4].mirror = true;
		
		techneModel[6] = new ModelRenderer(this, 21, 64);
		techneModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F);
		techneModel[6].setRotationPoint(2.5F, -4F, 31F);
		techneModel[6].setTextureSize(256, 256);
		techneModel[6].mirror = true;
		
		techneModel[11] = new ModelRenderer(this, 166, 80);
		techneModel[11].addBox(0F, 0F, 0F, 6, 4, 23, 0F);
		techneModel[11].setRotationPoint(1F, 0F, -19F);
		techneModel[11].setTextureSize(256, 256);
		techneModel[11].mirror = true;
		
		techneModel[12] = new ModelRenderer(this, 171, 53);
		techneModel[12].addBox(0F, 0F, 0F, 6, 1, 11, 0F);
		techneModel[12].setRotationPoint(1F, -5F, -18F);
		techneModel[12].setTextureSize(256, 256);
		techneModel[12].mirror = true;
		
		techneModel[13] = new ModelRenderer(this, 177, 117);
		techneModel[13].addBox(0F, 0F, 0F, 6, 4, 14, 0F);
		techneModel[13].setRotationPoint(1F, 4F, -19F);
		techneModel[13].setTextureSize(256, 256);
		techneModel[13].mirror = true;
		
		techneModel[14] = new ModelRenderer(this, 134, 116);
		techneModel[14].addBox(0F, 0F, 0F, 4, 6, 2, 0F);
		techneModel[14].setRotationPoint(2F, 4F, 0F);
		techneModel[14].setTextureSize(256, 256);
		techneModel[14].mirror = true;
		
		techneModel[15] = new ModelRenderer(this, 151, 135);
		techneModel[15].addBox(0F, 0F, 0F, 4, 2, 4, 0F);
		techneModel[15].setRotationPoint(2F, 8F, -5F);
		techneModel[15].setTextureSize(256, 256);
		techneModel[15].mirror = true;
		
		techneModel[16] = new ModelRenderer(this, 21, 64);
		techneModel[16].addBox(0F, 0F, 0F, 3, 1, 6, 0F);
		techneModel[16].setRotationPoint(2.5F, -3F, 31F);
		techneModel[16].setTextureSize(256, 256);
		techneModel[16].mirror = true;
		
		techneModel[18] = new ModelRenderer(this, 21, 64);
		techneModel[18].addBox(0F, 0F, 0F, 3, 1, 6, 0F);
		techneModel[18].setRotationPoint(2.5F, -2F, 31F);
		techneModel[18].setTextureSize(256, 256);
		techneModel[18].mirror = true;
		
		techneModel[19] = new ModelRenderer(this, 16, 78);
		techneModel[19].addBox(0F, 0F, 0F, 3, 1, 8, 0F);
		techneModel[19].setRotationPoint(2.5F, 1F, 26F);
		techneModel[19].setTextureSize(256, 256);
		techneModel[19].mirror = true;
		
		techneModel[20] = new ModelRenderer(this, 16, 78);
		techneModel[20].addBox(0F, 0F, 0F, 3, 1, 8, 0F);
		techneModel[20].setRotationPoint(2.5F, 2F, 26F);
		techneModel[20].setTextureSize(256, 256);
		techneModel[20].mirror = true;
		
		techneModel[21] = new ModelRenderer(this, 16, 78);
		techneModel[21].addBox(0F, 0F, 0F, 3, 1, 8, 0F);
		techneModel[21].setRotationPoint(2.5F, 3F, 26F);
		techneModel[21].setTextureSize(256, 256);
		techneModel[21].mirror = true;
		
		techneModel[22] = new ModelRenderer(this, 108, 71);
		techneModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F);
		techneModel[22].setRotationPoint(-0.5F, -3F, -1F);
		techneModel[22].setTextureSize(256, 256);
		techneModel[22].mirror = true;
	}
}
