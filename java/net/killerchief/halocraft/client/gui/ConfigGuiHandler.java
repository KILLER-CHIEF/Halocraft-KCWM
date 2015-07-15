package net.killerchief.halocraft.client.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;

public class ConfigGuiHandler implements IModGuiFactory //Examples: cpw.mods.fml.client.FMLConfigGuiFactory, net.minecraftforge.client.gui.ForgeGuiFactory
{
	@Override
	public void initialize(Minecraft minecraftInstance) {}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() { return GuiConfigScreen.class; }

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() { return null; }

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
	{
		return new RuntimeOptionGuiHandler() {
			@Override
			public void paint(int x, int y, int w, int h) { }

			@Override
			public void close() { }

			@Override
			public void addWidgets(List<Gui> widgets, int x, int y, int w, int h) { }

			@Override
			public void actionCallback(int actionId) { }
		};
	}

	/*public static class GuiConfigScreen2 extends GuiConfig 
	{
		public GuiConfigScreen2(GuiScreen parent)
		{
			super(parent, new ConfigElement(Halocraft.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Halocraft.MODID, false, false, GuiConfig.getAbridgedConfigPath(Halocraft.config.toString()));
		}
	}*/

	public static class GuiConfigScreen extends GuiConfig 
	{
		public GuiConfigScreen(GuiScreen parent)
		{
			super(parent, getConfigElements(), Halocraft.MODID, false, false, I18n.format("gui."+Halocraft.MODID+".configscreen.title"));
		}

		private static List<IConfigElement> getConfigElements()
		{
			List<IConfigElement> list = new ArrayList<IConfigElement>();

			//list.add(new DummyConfigElement<Boolean>("imABoolean", true, ConfigGuiType.BOOLEAN, "fml.config.sample.imABooleans").setRequiresMcRestart(true));
			//list.add(new DummyConfigElement<Integer>("imAnInteger", 42, ConfigGuiType.INTEGER, "fml.config.sample.imAnInteger", -1, 256).setRequiresMcRestart(true));

			list.add(new DummyCategoryElement("Halocraft Auto-Updater", "gui."+Halocraft.MODID+".autoupdater.title", AutoUpdater.class));

			list.add(new DummyCategoryElement("Halocraft General Config", "gui."+Halocraft.MODID+".generalconfigscreen.cfgfile", GeneralEntry.class));
			list.add(new DummyCategoryElement("Halocraft Mobs Config", "gui."+Halocraft.MODID+".mobsconfigscreen.cfgfile", MobsEntry.class));
			list.add(new DummyCategoryElement("Halocraft Render Config", "gui."+Halocraft.MODID+".renderconfigscreen.cfgfile", RenderEntry.class));

			return list;
		}

		/**
		 * This custom list entry provides the General Settings entry on the Minecraft Forge Configuration screen. 
		 * It extends the base Category entry class and defines the IConfigElement objects that will be used to build the child screen.
		 */
		public static class GeneralEntry extends CategoryEntry
		{
			public GeneralEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}

			@Override
			protected GuiScreen buildChildScreen()
			{
				// This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
				// GuiConfig object's entryList will also be refreshed to reflect the changes.
				return new GuiConfig(this.owningScreen, 
						(new ConfigElement(Halocraft.config.getCategory(Configuration.CATEGORY_GENERAL))).getChildElements(), 
						this.owningScreen.modID, Configuration.CATEGORY_GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, 
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
						GuiConfig.getAbridgedConfigPath(Halocraft.configPath));
			}
		}

		public static class MobsEntry extends CategoryEntry
		{
			public MobsEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}

			@Override
			protected GuiScreen buildChildScreen()
			{
				// This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
				// GuiConfig object's entryList will also be refreshed to reflect the changes.
				return new GuiConfig(this.owningScreen, 
						(new ConfigElement(Halocraft.config.getCategory("mobs"))).getChildElements(), 
						this.owningScreen.modID, Configuration.CATEGORY_GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, 
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
						GuiConfig.getAbridgedConfigPath(Halocraft.configPath));
			}
		}

		public static class RenderEntry extends CategoryEntry
		{
			public RenderEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}

			@Override
			protected GuiScreen buildChildScreen()
			{
				// This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
				// GuiConfig object's entryList will also be refreshed to reflect the changes.
				return new GuiConfig(this.owningScreen, 
						(new ConfigElement(Halocraft.config.getCategory("render"))).getChildElements(), 
						this.owningScreen.modID, Configuration.CATEGORY_GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, 
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
						GuiConfig.getAbridgedConfigPath(Halocraft.configPath));
			}
		}

		public static class AutoUpdater extends CategoryEntry
		{
			public AutoUpdater(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}

			@Override
			protected GuiScreen buildChildScreen()
			{
				return new GuiUpdater(this.owningScreen);
			}
		}
	}
}
