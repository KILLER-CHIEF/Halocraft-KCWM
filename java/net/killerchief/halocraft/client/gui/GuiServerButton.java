package net.killerchief.halocraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;

public class GuiServerButton extends GuiButton {

	//RenderItem renderItem = new RenderItem();
	//ItemStack icon = new ItemStack(Halocraft.Shotgun);
	//List<String> text = null;
	private GuiScreen parent;
	public GuiServerButton(int id, int x, int y, GuiScreen parent, String s) {
		super(id, x-100, y, 200, 20, "Halocraft Offical Server: "+s);
		this.parent = parent;
	}

	@Override
	public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
		super.drawButton(par1Minecraft, par2, par3);

		/*if(text == null){
            text = par1Minecraft.fontRenderer.listFormattedStringToWidth(StatCollector.translateToLocal(""), 80);
        }*/

		//renderItem.renderItemIntoGUI(par1Minecraft.fontRenderer, par1Minecraft.getTextureManager(), icon, xPosition+2, yPosition+2);

		/*int l = 14737632;

        if (!this.enabled)
            l = -6250336;
        else if (this.field_82253_i)
            l = 16777120;*/

		//float scale = 1.25F;
		// GL11.glScalef(1F/scale, 1F/scale, 1F/scale);

		/*for(int i = 0; i < text.size() && i < 2; i++){
            drawCenteredString(par1Minecraft.fontRenderer, text.get(i), (int)(scale*(xPosition+20+40)), (int)(scale*((yPosition+3)+par1Minecraft.fontRenderer.FONT_HEIGHT*i)), l);
        }*/
		//GL11.glScalef(scale, scale, scale);
	}

	@Override
	public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
		boolean press = super.mousePressed(par1Minecraft, par2, par3);
		if(press){
			//Minecraft.getMinecraft().displayGuiScreen(new GuiChangelogDownload(parent));
			//.displayGuiScreen(new GuiConnecting(this, this.mc, par1ServerData));new GuiConnecting(this, this.mc, par1ServerData)
			//Minecraft.getMinecraft().displayGuiScreen(new GuiConnecting(parent, par1Minecraft, "69.195.134.114", 25565)); //this number is port
			Minecraft.getMinecraft().displayGuiScreen(new GuiConnecting(parent, par1Minecraft, "hcserver.killerchief.net", 25565));
			//Minecraft.getMinecraft().displayGuiScreen(new GuiConnecting(parent, par1Minecraft, new ServerData("MOTD?", "69.195.134.114:25565")));
			parent = Minecraft.getMinecraft().currentScreen;
		}
		return press;
	}
}
