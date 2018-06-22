package net.killerchief.halocraft;

import java.io.File;

import net.killerchief.halocraft.client.InventoryTab;
import net.killerchief.halocraft.client.TickHandlerClient;
import net.killerchief.halocraft.comm.PacketRegistry;
import net.killerchief.halocraft.commands.CommandFillGunHolder;
import net.killerchief.halocraft.commands.CommandSpawnEntity;
import net.killerchief.halocraft.config.HalocraftConfig;
import net.killerchief.halocraft.config.HalocraftItemsArmor;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.halocraft.config.InitHcWeapons;
import net.killerchief.halocraft.worldGen.WorldGenerator;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Session;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Halocraft.MODID, name=Halocraft.NAME, version=Halocraft.VERSION, dependencies="required-after:kcweaponmod@[0.1.6,);", guiFactory="net.killerchief.halocraft.client.gui.ConfigGuiHandler")
public class Halocraft {

	public static final String MODID = "halocraft";
	public static final String NAME = "Halocraft";
	public static final String VERSION = "0.7.7";
	
	public static String getVersion() { return VERSION; }

	/** The instance of this mod that Forge uses.*/
	@Instance(Halocraft.MODID)
	public static Halocraft instance;

	@SidedProxy(clientSide="net.killerchief.halocraft.client.ClientProxy", serverSide="net.killerchief.halocraft.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs InvTabHalocraft = new InventoryTab(MODID);
	public static CreativeTabs InvTabHalocraftEntities = new InventoryTab(MODID+"entities", 1);
	public static CreativeTabs InvTabHalocraftArmor = new InventoryTab(MODID+"armor", 2);

	public static SimpleNetworkWrapper network;

	public static Configuration config;
	public static String configPath;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		network = NetworkRegistry.INSTANCE.newSimpleChannel(Halocraft.MODID);
		PacketRegistry.registerPackets();
		configPath = event.getModConfigurationDirectory()+"/"+Halocraft.MODID+"_"+Halocraft.VERSION+".cfg";
		config = new Configuration(new File(configPath));
		config.load();
		//File modDirectory2 = new File(event.getModConfigurationDirectory().getAbsolutePath());
		//C:\....\forge-1.7.10-10.13.4.1558-1.7.10-src\eclipse\config

		HalocraftConfig.loadConfig(config); //handles registry

		InitHcWeapons.DefineAndSendWeapons();
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{
		if(eventArgs.modID.equals(Halocraft.MODID))
		{
			if(Halocraft.config.hasChanged())
			{
				HalocraftConfig.DoSettingsConfiguration(config);
				//Halocraft.config.save();
			}
		}
	}

	//public static Block HaloPortal;

	//public static EnumToolMaterial toolGravityHammer = EnumHelper.addToolMaterial("GravityHammer", 3, 500, 8.0F, 3, 10);

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registers();

		HalocraftConfig.initSpawns();
		GameRegistry.registerWorldGenerator(new WorldGenerator(), 4);

		MinecraftForge.EVENT_BUS.register(new net.killerchief.halocraft.EventHandler());
		FMLCommonHandler.instance().bus().register(instance);
		FMLCommonHandler.instance().bus().register(new TickHandler());
		if (Halocraft.proxy.isSideClient())
		{
			FMLCommonHandler.instance().bus().register(new TickHandlerClient());
		}

		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		/*if(UseDimension == true)
		{
			DimensionManager.registerProviderType(DimensionID, HCHaloWorldProvider.class, false);
			DimensionManager.registerDimension(DimensionID, DimensionID);
		}*/
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandSpawnEntity());
		event.registerServerCommand(new CommandFillGunHolder());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		HalocraftItemsWeapons.initWeapons();
		proxy.registerRenderers();
	}

}
