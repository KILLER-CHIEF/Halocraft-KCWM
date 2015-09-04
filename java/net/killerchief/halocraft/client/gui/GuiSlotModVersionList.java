package net.killerchief.halocraft.client.gui;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.gui.GuiUpdater.HcUpdateInfo;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.common.ForgeVersion;
import cpw.mods.fml.client.GuiScrollingList;
import cpw.mods.fml.common.Loader;

public class GuiSlotModVersionList extends GuiScrollingList
{
	private GuiUpdater parent;
	private HcUpdateInfo[] HcVersions;

	public GuiSlotModVersionList(GuiUpdater parent, HcUpdateInfo[] versions, int listWidth)
	{
		super(parent.mc, 180, parent.height, 40, parent.height - 20, (parent.width/2) - 190, 45);
		this.parent=parent;
		this.HcVersions=versions;
	}

	@Override
	protected int getSize()
	{
		return this.HcVersions != null ? this.HcVersions.length : 0;
	}

	@Override
	protected void elementClicked(int var1, boolean var2)
	{
		this.parent.selectModIndex(var1);
	}

	@Override
	protected boolean isSelected(int var1)
	{
		return this.parent.modIndexSelected(var1);
	}

	@Override
	protected void drawBackground()
	{
		this.parent.drawDefaultBackground();
	}

	@Override
	protected int getContentHeight()
	{
		return (this.getSize()) * 35 + 1;
	}

	@Override
	protected void drawSlot(int listIndex, int var2, int var3, int var4, Tessellator var5)
	{
		HcUpdateInfo info = this.HcVersions[listIndex];
		
		this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth("Halocraft v"+info.Version+(Halocraft.VERSION.equalsIgnoreCase(info.Version) ? " (Current)" : ""), listWidth - 10), this.left + 3 , var3 + 2, Halocraft.VERSION.equalsIgnoreCase(info.Version) ? 0xFF2222 : 0xFFFFFF);
		this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth("Forge: "+info.ForgeVersion, listWidth - 10), this.left + 3 , var3 + 12, info.ForgeVersion.equalsIgnoreCase(ForgeVersion.getVersion()) ? 0x22FF22 : (info.ForgeVersion.equalsIgnoreCase(GuiUpdater.VersionCompat) ? 0xFF6A00 : 0xFF2222));
		//this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth("Requires KCWM v"+info.KCWMVersion+(info.KCWMVersion.contains(KCWeaponMod.VERSION) ? " (Compatible)" : ""), listWidth - 10), this.left + 3 , var3 + 22, info.KCWMVersion.contains(KCWeaponMod.VERSION) ? 0x22FF22 : 0xFF6A00);
		this.parent.mc.fontRenderer.drawSplitString("Requires KCWM v"+info.KCWMVersion+(info.KCWMVersion.contains(KCWeaponMod.VERSION) ? " (Compatible)" : ""), this.left + 3 , var3 + 22, 170, info.KCWMVersion.contains(KCWeaponMod.VERSION) ? 0x22FF22 : 0xFF6A00);
		
		/*if (info.KCWMVersion == null)
		{
			this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth(info.Version, listWidth - 10), this.left + 3 , var3 + 2, 0xFF2222);
			this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth(info.ForgeVersion, listWidth - 10), this.left + 3 , var3 + 12, 0xFF2222);
			this.parent.mc.fontRenderer.drawString(this.parent.mc.fontRenderer.trimStringToWidth("DISABLED", listWidth - 10), this.left + 3 , var3 + 22, 0xFF2222);
		}*/
	}

}