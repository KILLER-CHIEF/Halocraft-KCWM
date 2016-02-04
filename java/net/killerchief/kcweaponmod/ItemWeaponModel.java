package net.killerchief.kcweaponmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public class ItemWeaponModel {
	
	public ModelBase Model;
	public ResourceLocation Texture;
	public boolean NoChngOnSprint = false;
	public boolean Glows = false;
	
	public ItemWeaponModel(ModelBase model, ResourceLocation texture)
	{
		this.Model = model;
		this.Texture = texture;
	}
	
	public ItemWeaponModel(ModelBase model, ResourceLocation texture, boolean noChngOnSprint)
	{
		this(model, texture);
		this.NoChngOnSprint = noChngOnSprint;
	}
	
	public ItemWeaponModel(ModelBase model, ResourceLocation texture, boolean noChngOnSprint, boolean glows)
	{
		this(model, texture, noChngOnSprint);
		this.Glows = glows;
	}
	
	public float TPScaleX = 1F;
	public float TPScaleY = 1F;
	public float TPScaleZ = 1F;
	public float TPTransX = 0F;
	public float TPTransY = 0F;
	public float TPTransZ = 0F;
	public float TPRotateX = 0F;
	public float TPRotateY = 0F;
	public float TPRotateZ = 0F;
	public float TPSprintTransX = 0F;
	public float TPSprintTransY = 0F;
	public float TPSprintTransZ = 0F;
	public float TPSprintRotateX = 0F;
	public float TPSprintRotateY = 0F;
	public float TPSprintRotateZ = 0F;
	
	public void TPScale(float x, float y, float z) {
		this.TPScaleX = x;
		this.TPScaleY = y;
		this.TPScaleZ = z;
	}
	public void TPTrans(float x, float y, float z) {
		this.TPTransX = x;
		this.TPTransY = y;
		this.TPTransZ = z;
	}
	public void TPRotate(float x, float y, float z) {
		this.TPRotateX = x;
		this.TPRotateY = y;
		this.TPRotateZ = z;
	}
	public void TPSprintTrans(float x, float y, float z) {
		this.TPSprintTransX = x;
		this.TPSprintTransY = y;
		this.TPSprintTransZ = z;
	}
	public void TPSprintRotate(float x, float y, float z) {
		this.TPSprintRotateX = x;
		this.TPSprintRotateY = y;
		this.TPSprintRotateZ = z;
	}
	
	public float FPScaleX = 1F;
	public float FPScaleY = 1F;
	public float FPScaleZ = 1F;
	public float FPTransX = 0F;
	public float FPTransY = 0F;
	public float FPTransZ = 0F;
	public float FPRotateX = 0F;
	public float FPRotateY = 0F;
	public float FPRotateZ = 0F;
	public float FPSprintTransX = 0F;
	public float FPSprintTransY = 0F;
	public float FPSprintTransZ = 0F;
	public float FPSprintRotateX = 0F;
	public float FPSprintRotateY = 0F;
	public float FPSprintRotateZ = 0F;
	
	public void FPScale(float x, float y, float z) {
		this.FPScaleX = x;
		this.FPScaleY = y;
		this.FPScaleZ = z;
	}
	public void FPTrans(float x, float y, float z) {
		this.FPTransX = x;
		this.FPTransY = y;
		this.FPTransZ = z;
	}
	public void FPRotate(float x, float y, float z) {
		this.FPRotateX = x;
		this.FPRotateY = y;
		this.FPRotateZ = z;
	}
	public void FPSprintTrans(float x, float y, float z) {
		this.FPSprintTransX = x;
		this.FPSprintTransY = y;
		this.FPSprintTransZ = z;
	}
	public void FPSprintRotate(float x, float y, float z) {
		this.FPSprintRotateX = x;
		this.FPSprintRotateY = y;
		this.FPSprintRotateZ = z;
	}
	
}
