package net.killerchief.kcweaponmod;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilderFactory;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=KCWeaponMod.MODID, name=KCWeaponMod.NAME, version=KCWeaponMod.VERSION, guiFactory="net.killerchief.kcweaponmod.GuiConfigurationHandler")
public class KCWeaponMod {

	public static final String MODID = "kcweaponmod";
	public static final String NAME = "KC's Weapon Mod";
	public static final String VERSION = "0.1.2";

	public static String getVersion() { return VERSION; }

	public static final String WeaponFileVersion = "1.0";

	/** The instance of this mod that Forge uses.*/
	@Instance(KCWeaponMod.MODID)
	public static KCWeaponMod instance;

	@SidedProxy(clientSide="net.killerchief.kcweaponmod.ClientProxy", serverSide="net.killerchief.kcweaponmod.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs InventoryTab = new InventoryTab(MODID);

	public static SimpleNetworkWrapper network;

	public static Configuration config;
	public static String configPath;

	public static String weaponModDirectory;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("KC's Weapon Mod: This mod version supports weapons of v"+WeaponFileVersion+" only.");
		configPath = event.getModConfigurationDirectory()+"/"+KCWeaponMod.MODID+"_"+KCWeaponMod.VERSION+".cfg";
		config = new Configuration(new File(configPath));
		config.load();
		DoSettingsConfiguration(config);

		weaponModDirectory = event.getModConfigurationDirectory().toString() + "/KCWeaponMod-Weapons/";
		//System.out.println(this.modDirectory);//C:\Users\KILLER CHIEF\Desktop\MCForge-1.7.10-10.13.2.1230\eclipse\config
		network = NetworkRegistry.INSTANCE.newSimpleChannel(KCWeaponMod.MODID);
		PacketRegistry.registerPackets();
	}

	public static boolean ExplosionBlockDamage;

	public static void DoSettingsConfiguration(Configuration config)
	{
		ExplosionBlockDamage = config.get("general", "Enable Explosion Block Damage", true).getBoolean(true);

		config.save();
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs)
	{
		if(eventArgs.modID.equals(KCWeaponMod.MODID))
		{
			if(KCWeaponMod.config.hasChanged())
			{
				DoSettingsConfiguration(config);
			}
		}
	}

	public static ItemWeapon[] weapons = new ItemWeapon[0];
	public static Map<String, Integer> modMap = new HashMap<String, Integer>();
	private static boolean allowModRegistration = true;

	public String getTagElementString(Element e, String tag)
	{
		NodeList n = e.getElementsByTagName(tag);
		if (n != null && n.getLength() > 0)
		{
			return n.item(0).getTextContent();
		}
		return "";
	}

	public static boolean registerModItems(String modid, String weaponVerison, ItemWeapon[] modWeapons)
	{
		if (!allowModRegistration)
		{
			System.err.println("The invoking mod of ID \""+modid+"\" is too late to register its weapons! (Weapons should be registered during FMLPreInitializationEvent)");
			return false;
		}
		if (!weaponVerison.trim().equals(WeaponFileVersion))
		{
			System.err.println("The invoking mod of ID \""+modid+"\" weapon version is different to the version intended for this mod's version!");
			return false;
		}
		else
		{
			modMap.put(modid, weapons.length);

			ItemWeapon[] tempweapons = weapons;
			weapons = new ItemWeapon[tempweapons.length+modWeapons.length];
			System.arraycopy(tempweapons, 0, weapons, 0, tempweapons.length);
			System.arraycopy(modWeapons, 0, weapons, tempweapons.length, modWeapons.length);

			return true;
		}
	}

	private void getXMLItems()
	{
		File path = new File(KCWeaponMod.weaponModDirectory);
		if (!path.exists())
			path.mkdir();
		File[] files = path.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".xml");
			}
		});

		if (files != null && files.length > 0)
		{
			for (File file : files)
			{
				if (!file.exists())
				{
					System.err.println("Weapon Properties File Does NOT Exist: "+file.getAbsolutePath());
				}
				else
				{
					try {
						Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

						doc.getDocumentElement().normalize();

						if (doc.getDocumentElement().getNodeName() != "kcweaponmod")
						{
							System.err.println("The Weapon Properties File is incorrectly written: "+file.getAbsolutePath());
						}
						else
						{
							if (!doc.getDocumentElement().getAttribute("version").trim().equals(WeaponFileVersion))
							{
								System.err.println("The Weapon Properties File version is different to the version intended for this mod's version: "+file.getAbsolutePath());
							}
							else
							{
								NodeList nList = doc.getElementsByTagName("weapon");

								ItemWeapon[] newItems = new ItemWeapon[nList.getLength()];
								int newNum = 0;

								for (int index = 0; index < nList.getLength(); index++) {

									Node nNode = nList.item(index);

									if (nNode.getNodeType() == Node.ELEMENT_NODE) {

										Element eElement = (Element) nNode;

										ItemWeaponProperties properties = new ItemWeaponProperties();

										if (!eElement.getAttribute("name").equals(""))
										{
											properties.Name = eElement.getAttribute("name");
											String a = getTagElementString(eElement, "texture");
											properties.Texture = !a.equals("") ? a : properties.Texture;
											//if (KCWeaponMod.proxy.isSideClient()) {
											properties.InventoryTab = properties.InventoryTab;
											String ca = getTagElementString(eElement, "inventorytab");
											for (CreativeTabs i : InventoryTab.creativeTabArray) {
												//System.out.println(i.getTabLabel());
												if (i.getTabLabel().equalsIgnoreCase(ca)) {
													//System.out.println("found it: "+i.getTabLabel());
													properties.InventoryTab = i;
													break;
												}
											}
											//} else {
											//	properties.InventoryTab = properties.InventoryTab;
											//}
											String b = getTagElementString(eElement, "isautomaticorhassecondaryshoot");
											properties.IsAutomaticOrHasSecondaryShoot = !b.equals("") ? Boolean.parseBoolean(b) : properties.IsAutomaticOrHasSecondaryShoot;
											String c = getTagElementString(eElement, "iszoomable");
											properties.IsZoomable = !c.equals("") ? Boolean.parseBoolean(c) : properties.IsZoomable;
											String[] d = getTagElementString(eElement, "zoommultiplier").split("\\+");
											int[] d1 = new int[d.length];
											for (int d2 = 0; d2 < d.length; d2++) {d1[d2] = Integer.parseInt(d[d2]);}
											properties.ZoomMultiplier = !d.equals("") ? d1 : properties.ZoomMultiplier;
											String e = getTagElementString(eElement, "zoomtexture");
											properties.ZoomTexture = !e.equals("") ? e : properties.ZoomTexture;
											String f = getTagElementString(eElement, "gunshootdelay");
											properties.GunShootDelay = !f.equals("") ? Integer.parseInt(f) : properties.GunShootDelay;
											String g = getTagElementString(eElement, "recoil");
											properties.Recoil = !g.equals("") ? Float.parseFloat(g) : properties.Recoil;
											String h = getTagElementString(eElement, "performonly1shootsound");
											properties.PerformOnly1ShootSound = !h.equals("") ? Boolean.parseBoolean(h) : properties.PerformOnly1ShootSound;
											String i = getTagElementString(eElement, "shootsound");
											properties.ShootSound = !i.equals("") ? i : properties.ShootSound;

											String j = getTagElementString(eElement, "reloadtime");
											properties.ReloadTime = !j.equals("") ? Integer.parseInt(j) : properties.ReloadTime;
											String k = getTagElementString(eElement, "reloadsound");
											properties.ReloadSound = !k.equals("") ? k : properties.ReloadSound;
											String l = getTagElementString(eElement, "reloadmaxammoflow");
											properties.ReloadMaxAmmoFlow = !l.equals("") ? Integer.parseInt(l) : properties.ReloadMaxAmmoFlow;
											String m = getTagElementString(eElement, "reloadtimeloop");
											properties.ReloadTimeLoop = !m.equals("") ? Integer.parseInt(m) : properties.ReloadTimeLoop;
											String n = getTagElementString(eElement, "reloadsoundloop");
											properties.ReloadSoundLoop = !n.equals("") ? n : properties.ReloadSoundLoop;
											String o = getTagElementString(eElement, "reloadsoundexit");
											properties.ReloadSoundExit = !o.equals("") ? o : properties.ReloadSoundExit;
											String p = getTagElementString(eElement, "ammofeedsfrominventory");
											properties.AmmoFeedsFromInventory = !p.equals("") ? Boolean.parseBoolean(p) : properties.AmmoFeedsFromInventory;
											String q = getTagElementString(eElement, "ammotype");
											if (!q.equals("")) {
												Item[] q1 = ProjectileProperties.GetItemsFromString(new String[]{q});
												Block[] q2 = ProjectileProperties.GetBlocksFromString(new String[]{q});
												if (q1.length > 0)
													properties.AmmoType = new ItemStack(q1[0]);
												else if (q2.length > 0)
													properties.AmmoType = new ItemStack(q2[0]);
											}//properties.AmmoType = !q.equals("") && q1.length > 0 ? new ItemStack(q1[0]) : properties.AmmoType;
											String r = getTagElementString(eElement, "magazinesize");
											properties.MagazineSize = !r.equals("") ? Integer.parseInt(r) : properties.MagazineSize;
											String s = getTagElementString(eElement, "itemstackdecreaseonuse");
											properties.ItemStackDecreaseOnUse = !s.equals("") ? Boolean.parseBoolean(s) : properties.ItemStackDecreaseOnUse;
											String t = getTagElementString(eElement, "itemstackmaxstacksize");
											properties.ItemStackMaxStackSize = !t.equals("") ? Integer.parseInt(t) : properties.ItemStackMaxStackSize;
											String u = getTagElementString(eElement, "requiredusespershot");
											properties.RequiredUsesPerShot = !u.equals("") ? Integer.parseInt(u) : properties.RequiredUsesPerShot;
											String v = getTagElementString(eElement, "shootburstcount");
											properties.ShootBurstCount = !v.equals("") ? Integer.parseInt(v) : properties.ShootBurstCount;
											String w = getTagElementString(eElement, "burstaccuracydecrease");
											properties.BurstAccuracyDecrease = !w.equals("") ? Float.parseFloat(w) : properties.BurstAccuracyDecrease;
											String x = getTagElementString(eElement, "singleshotprojectilecount");
											properties.SingleShotProjectileCount = !x.equals("") ? Integer.parseInt(x) : properties.SingleShotProjectileCount;

											String y = getTagElementString(eElement, "projectilerenderproperties");
											properties.ProjectileRenderProperties = !y.equals("") ? y : properties.ProjectileRenderProperties;
											String z = getTagElementString(eElement, "projectilespeed");
											properties.ProjectileSpeed = !z.equals("") ? Float.parseFloat(z) : properties.ProjectileSpeed;
											String aa = getTagElementString(eElement, "accuracy");
											properties.Accuracy = !aa.equals("") ? Float.parseFloat(aa) : properties.Accuracy;
											String ab = getTagElementString(eElement, "gravity");
											properties.Gravity = !ab.equals("") ? Float.parseFloat(ab) : properties.Gravity;
											String ac = getTagElementString(eElement, "maxeffectiveticksalive");
											properties.MaxEffectiveTicksAlive = !ac.equals("") ? Integer.parseInt(ac) : properties.MaxEffectiveTicksAlive;
											properties.ProjectileLivingProperties = getTagElementString(eElement, "projectilelivingproperties");
											properties.ProjectileImpactProperties = getTagElementString(eElement, "projectileimpactproperties");
											properties.ProjectilePrematureEndOfLifeProperties = getTagElementString(eElement, "projectileprematureendoflifeproperties");
											String ah = getTagElementString(eElement, "projectiledraginair");
											properties.ProjectileDragInAir = !ah.equals("") ? Float.parseFloat(ah) : properties.ProjectileDragInAir;
											String ai = getTagElementString(eElement, "projectiledraginwater");
											properties.ProjectileDragInWater = !ai.equals("") ? Float.parseFloat(ai) : properties.ProjectileDragInWater;
											String aj = getTagElementString(eElement, "projectileglows");
											properties.ProjectileGlows = !aj.equals("") ? Boolean.parseBoolean(aj) : properties.ProjectileGlows;
											String ak = getTagElementString(eElement, "tracksensitivity");
											properties.TrackSensitivity = !ak.equals("") ? Float.parseFloat(ak) : properties.TrackSensitivity;

											newItems[newNum] = new ItemWeapon(properties);
											newNum++;
										}
										else
										{
											System.out.println("The Weapon Properties File is incorrectly written at node "+index+": "+file.getAbsolutePath());
										}
									}
								}
								modMap.put(file.getName().substring(0, file.getName().length()-4), weapons.length);

								ItemWeapon[] tempweapons = weapons;
								weapons = new ItemWeapon[tempweapons.length+newNum];
								System.arraycopy(tempweapons, 0, weapons, 0, tempweapons.length);
								System.arraycopy(newItems, 0, weapons, tempweapons.length, newNum);
							}
						}
					}
					catch (Exception e) {
						System.err.println("Failed to Load Weapon Properties File: "+file.getAbsolutePath());
						e.printStackTrace();
					}
				}
			}
		}

		for (ItemWeapon weapon : weapons)
		{
			System.out.println("KCWeaponMod: Registered Weapons: "+weapon.Properties.Name);
		}

		for (Entry<String, Integer> entry : modMap.entrySet())
		{
			System.out.println("KCWeaponMod: Mod Map: \""+entry.getKey()+"\" begins at index "+entry.getValue());
		}
	}

	public static String[] ProjIDRender;

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		this.allowModRegistration = false;

		FMLCommonHandler.instance().bus().register(instance);//For Config File

		this.getXMLItems();
		this.ProjIDRender = new String[this.weapons.length];
		for (ItemWeapon weapon : this.weapons)
		{
			GameRegistry.registerItem(weapon, weapon.getUnlocalizedName().substring(5));
			boolean exists = false;
			int i = 0;
			while (i < this.ProjIDRender.length)
			{
				if (this.ProjIDRender[i] == null)
				{
					break;
				}
				if (this.ProjIDRender[i].equals(weapon.Properties.ProjectileRenderProperties))
				{
					weapon.Properties.ProjectileID = i;
					exists = true;
					break;
				}
				i++;
			}
			if (!exists)
			{
				if (i < this.ProjIDRender.length)
				{
					this.ProjIDRender[i] = weapon.Properties.ProjectileRenderProperties;
					weapon.Properties.ProjectileID = i;
				}
				else
				{
					System.err.println("Fatal Error in Weapon Projectile Registration. Run out of Array Length! "+i+":"+this.ProjIDRender.length);
				}
			}
		}
		int i = this.ProjIDRender.length;
		if (this.ProjIDRender.length > 0)
		{
			while (i > 0 && this.ProjIDRender[--i] == null);
			this.ProjIDRender = Arrays.copyOf(this.ProjIDRender, i+1);
		}
		System.out.println("KCWeaponMod: "+KCWeaponMod.ProjIDRender.length+" Render ID's have been used out of "+EntityRenderExtender.class.getDeclaredClasses().length+" in total.");
		i = 0;
		while (i < this.ProjIDRender.length)
		{
			if (this.ProjIDRender[i] != null)
			{
				String name = this.ProjIDRender[i].replace("/", ".");
				String entityname;
				if (name.indexOf("#") < 0)
					entityname = name;
				else
					entityname = name.substring(name.indexOf("#")+1, name.length());
				try {
					EntityRegistry.registerModEntity((Class<? extends Entity>) Class.forName("net.killerchief.kcweaponmod.EntityRenderExtender").getClasses()[i], entityname, i, KCWeaponMod.instance, 100, 10, true);
				} catch (ClassNotFoundException e) {
					System.err.println("Class not found exception: net.killerchief.kcweaponmod.EntityRenderExtender.Entity"+i);
					e.printStackTrace();
				}
			}
			i++;
		}

		proxy.registerRenderers();

		proxy.registers();
		MinecraftForge.EVENT_BUS.register(new net.killerchief.kcweaponmod.EventHandler());
		FMLCommonHandler.instance().bus().register(new TickHandler());
		if (KCWeaponMod.proxy.isSideClient())
		{
			FMLCommonHandler.instance().bus().register(new TickHandlerClient());
		}

	}

	public static boolean ProcessingObjectTagsErrored = false;

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		int id = 0;
		for (ItemWeapon weapon : this.weapons)
		{
			weapon.Properties.ID = id;
			weapon.Properties.ProjLivingActArgs = KCUtils.ProcessObjectTags(weapon.Properties.ProjectileLivingProperties);
			if (ProcessingObjectTagsErrored)
			{
				System.err.println("KCWeaponMod - ERROR: Projectile Living Properties contains an error: "+weapon.Properties.ProjectileLivingProperties);
				ProcessingObjectTagsErrored = false;
			}
			weapon.Properties.ProjImpactActArgs = KCUtils.ProcessObjectTags(weapon.Properties.ProjectileImpactProperties);
			if (ProcessingObjectTagsErrored)
			{
				System.err.println("KCWeaponMod - ERROR: Projectile Impact Properties contains an error: "+weapon.Properties.ProjectileImpactProperties);
				ProcessingObjectTagsErrored = false;
			}
			id++;
		}
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		//event.registerServerCommand(new CommandSpawnEntity());
	}
}
