package net.killerchief.kcweaponmod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class GuiConfigurationHandler implements IModGuiFactory //Examples: cpw.mods.fml.client.FMLConfigGuiFactory, net.minecraftforge.client.gui.ForgeGuiFactory
{
	@Override
	public void initialize(Minecraft minecraftInstance) { }

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() { return GuiConfigScreen.class; }

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() { return null; }

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
	{
		return new RuntimeOptionGuiHandler() {
			@Override
			public void paint(int x, int y, int w, int h)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void close()
			{

			}

			@Override
			public void addWidgets(List<Gui> widgets, int x, int y, int w, int h)
			{
				//widgets.add(new GuiButton(100, x+10, y+10, "HELLO"));
			}

			@Override
			public void actionCallback(int actionId)
			{
				// TODO Auto-generated method stub

			}
		};
	}

	public static class GuiConfigScreen extends GuiConfig 
	{
		public GuiConfigScreen(GuiScreen parent)
		{
			super(parent, getConfigElements(), KCWeaponMod.MODID, false, false, GuiConfig.getAbridgedConfigPath(KCWeaponMod.config.toString()));
		}

		private static List<IConfigElement> getConfigElements()
		{
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			for (String names : KCWeaponMod.config.getCategoryNames())
				for (Object elements : (new ConfigElement(KCWeaponMod.config.getCategory(names))).getChildElements().toArray())
					list.add((IConfigElement)elements);
			return list;
		}
	}
}
