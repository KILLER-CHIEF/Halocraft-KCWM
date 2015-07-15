package net.killerchief.turbomodelthingy;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

public class TextureGroup
{
	public TextureGroup()
	{
		poly = new ArrayList<TexturedQuad>();
		texture = "";
	}
	
	public void addPoly(TexturedQuad quad)
	{
		poly.add(quad);
	}

	public void loadTexture()
	{
		loadTexture(-1);
	}
	
	public void loadTexture(int defaultTexture)
	{
		if(!texture.equals(""))
		{
			TextureManager renderengine = RenderManager.instance.renderEngine;
			field_110782_f = new ResourceLocation(texture);
	        renderengine.bindTexture(field_110782_f);//renderengine.bindTexture(renderengine.getTexture(texture));
		}
		else if(defaultTexture > -1)//RenderManager.instance.renderEngine.bindTexture(defaultTexture);
		{
			try {
				//ModLoader.setPrivateValue(net.minecraft.client.renderer.RenderEngine.class, Minecraft.getMinecraft().renderEngine, "bindTexture", String.valueOf(defaultTexture));
				//ModLoader.setPrivateValue(net.minecraft.client.renderer.texture.TextureManager.class, Minecraft.getMinecraft().renderEngine, "b", String.valueOf(defaultTexture));
				ObfuscationReflectionHelper.setPrivateValue(net.minecraft.client.renderer.texture.TextureManager.class, Minecraft.getMinecraft().renderEngine, "b", String.valueOf(defaultTexture));
			} catch (Exception e) {
				try {
					//ModLoader.setPrivateValue(net.minecraft.client.renderer.texture.TextureManager.class, Minecraft.getMinecraft().renderEngine, "bindTexture", String.valueOf(defaultTexture));
					ObfuscationReflectionHelper.setPrivateValue(net.minecraft.client.renderer.texture.TextureManager.class, Minecraft.getMinecraft().renderEngine, "bindTexture", String.valueOf(defaultTexture));
				} catch (Exception e1) {
					System.err.println("Fail to bind texture (TMT), I forgot to update the obfuscated reflection D:");
					e1.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<TexturedQuad> poly;
	public String texture;
	private static ResourceLocation field_110782_f;
}
