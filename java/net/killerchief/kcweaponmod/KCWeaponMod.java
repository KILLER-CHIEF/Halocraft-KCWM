package net.killerchief.kcweaponmod;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilderFactory;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
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
	public static final String VERSION = "0.1.3.05";

	public static String getVersion() { return VERSION; }

	public static final String WeaponFileVersion = "1.2";

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
	public static boolean RecoilInLocalSP;

	public static void DoSettingsConfiguration(Configuration config)
	{
		ExplosionBlockDamage = config.get("general", "Enable Explosion Block Damage", true).getBoolean(true);
		RecoilInLocalSP = config.get("general", "Weapon Recoil In Local SP", true).getBoolean(true);

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
	
	public static boolean RenderingReticle()
	{
		return TickHandlerClient.rndrngReticle;
	}
	
	private static ArrayList<String> DisableReticleRequests = new ArrayList<String>();
	
	public static boolean DisabledReticle()
	{
		return DisableReticleRequests.size() > 0;
	}
	
	public static void requestDisableReticle(String modid)
	{
		if (!DisableReticleRequests.contains(modid))
			DisableReticleRequests.add(modid);
	}
	
	public static void revokeRequestDisableReticle(String modid)
	{
		DisableReticleRequests.remove(modid);
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
			ItemWeapon[] tempmodweapons = new ItemWeapon[modWeapons.length];
			int tempIndex = 0;
			for (int i = 0; i < modWeapons.length; i++) {
				if (modWeapons[i] != null) {
					tempmodweapons[tempIndex++] = modWeapons[i];
				} else {
					System.err.println("KCWeaponMod: The invoking mod of ID \""+modid+"\" has empty weapon index at "+i+"!");
				}
			}
			
			modMap.put(modid, weapons.length);

			ItemWeapon[] tempweapons = weapons;
			weapons = new ItemWeapon[tempweapons.length+tempIndex];
			System.arraycopy(tempweapons, 0, weapons, 0, tempweapons.length);
			System.arraycopy(tempmodweapons, 0, weapons, tempweapons.length, tempIndex);

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
						System.out.println("KCWeaponMod: Loading XML File: "+file.getAbsolutePath());
						
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
											System.out.println("Loading Weapon: "+eElement.getAttribute("name"));
											properties.Name = eElement.getAttribute("name");
											String a = getTagElementString(eElement, "texture");
											properties.Texture = !a.equals("") ? a : properties.Texture;
											String ma = getTagElementString(eElement, "modelclass");
											String mb = getTagElementString(eElement, "modeltexture");
											if (KCWeaponMod.proxy.isSideClient() && !ma.equals("") && !mb.equals(""))
											{
												ModelBase modelClass = null;
												try {
													modelClass = (ModelBase)Class.forName(ma).newInstance();
												} catch (ClassNotFoundException e) {
													System.err.println("Class not found exception: "+ma);
													e.printStackTrace();
												} catch (InstantiationException e) {
													System.err.println("Cannot create a new instance to call the class: \""+ma);
													e.printStackTrace();
												} catch (IllegalAccessException e) {
													System.err.println("The method \""+ma+"\" cannot be accessed!");
													e.printStackTrace();
												}
												if (modelClass != null)
												{
													ItemWeaponModel model = new ItemWeaponModel(modelClass, new ResourceLocation(mb));
													String mc = getTagElementString(eElement, "modelnochangeonsprint");
													model.NoChngOnSprint = !mc.equals("") ? Boolean.parseBoolean(mc) : model.NoChngOnSprint;
													String md = getTagElementString(eElement, "modelglows");
													model.Glows = !md.equals("") ? Boolean.parseBoolean(md) : model.Glows;
													
													String[] m1 = getTagElementString(eElement, "tpscale").split(",");
													if (m1.length == 3) { model.TPScale(Float.parseFloat(m1[0]), Float.parseFloat(m1[1]), Float.parseFloat(m1[2])); }
													String[] m2 = getTagElementString(eElement, "tptrans").split(",");
													if (m2.length == 3) { model.TPTrans(Float.parseFloat(m2[0]), Float.parseFloat(m2[1]), Float.parseFloat(m2[2])); }
													String[] m3 = getTagElementString(eElement, "tprotate").split(",");
													if (m3.length == 3) { model.TPRotate(Float.parseFloat(m3[0]), Float.parseFloat(m3[1]), Float.parseFloat(m3[2])); }
													String[] m4 = getTagElementString(eElement, "tpsprinttrans").split(",");
													if (m4.length == 3) { model.TPSprintTrans(Float.parseFloat(m4[0]), Float.parseFloat(m4[1]), Float.parseFloat(m4[2])); }
													String[] m5 = getTagElementString(eElement, "tpsprintrotate").split(",");
													if (m5.length == 3) { model.TPSprintRotate(Float.parseFloat(m5[0]), Float.parseFloat(m5[1]), Float.parseFloat(m5[2])); }
													String[] m6 = getTagElementString(eElement, "fpscale").split(",");
													if (m6.length == 3) { model.FPScale(Float.parseFloat(m6[0]), Float.parseFloat(m6[1]), Float.parseFloat(m6[2])); }
													String[] m7 = getTagElementString(eElement, "fptrans").split(",");
													if (m7.length == 3) { model.FPTrans(Float.parseFloat(m7[0]), Float.parseFloat(m7[1]), Float.parseFloat(m7[2])); }
													String[] m8 = getTagElementString(eElement, "fprotate").split(",");
													if (m8.length == 3) { model.FPRotate(Float.parseFloat(m8[0]), Float.parseFloat(m8[1]), Float.parseFloat(m8[2])); }
													String[] m9 = getTagElementString(eElement, "fpsprinttrans").split(",");
													if (m9.length == 3) { model.FPSprintTrans(Float.parseFloat(m9[0]), Float.parseFloat(m9[1]), Float.parseFloat(m9[2])); }
													String[] m10 = getTagElementString(eElement, "fpsprintrotate").split(",");
													if (m10.length == 3) { model.FPSprintRotate(Float.parseFloat(m10[0]), Float.parseFloat(m10[1]), Float.parseFloat(m10[2])); }
													
													properties.WeaponModel = model;
												}
												
											}
											String cb = getTagElementString(eElement, "aimitem");
											properties.AimItem = !cb.equals("") ? Boolean.parseBoolean(cb) : properties.AimItem;
											if (KCWeaponMod.proxy.isSideClient()) {
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
											} else {
												properties.InventoryTab = properties.InventoryTab;
											}
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
											String za = getTagElementString(eElement, "hasreticle");
											properties.HasReticle = !za.equals("") ? Boolean.parseBoolean(za) : properties.HasReticle;
											String zb = getTagElementString(eElement, "reticletexture");
											properties.ReticleTexture = !zb.equals("") ? zb : properties.ReticleTexture;
											String zc = getTagElementString(eElement, "reticletransparency");
											properties.ReticleTransparency = !zc.equals("") ? Float.parseFloat(zc) : properties.ReticleTransparency;
											String[] zd = getTagElementString(eElement, "reticleproperties").split(",");
											if (zd.length == 6) {
												properties.ReticleProperties = new int[]{Integer.parseInt(zd[0]), Integer.parseInt(zd[1]), Integer.parseInt(zd[2]), Integer.parseInt(zd[3]), Integer.parseInt(zd[4]), Integer.parseInt(zd[5])};
											}
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
						e.printStackTrace();
						System.err.println("Failed to Load Weapon Properties File: "+file.getAbsolutePath());
					}
				}
			}
		}

		System.out.println("Finished Receiving Weapon Configuration Data.");
		for (ItemWeapon weapon : weapons)
		{
			System.out.println("KCWeaponMod: Registered Weapons: "+weapon.Properties.Name);
		}

		for (Entry<String, Integer> entry : modMap.entrySet())
		{
			System.out.println("KCWeaponMod: Mod Map: \""+entry.getKey()+"\" begins at index "+entry.getValue());
		}
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		this.allowModRegistration = false;

		FMLCommonHandler.instance().bus().register(instance);//For Config File

		this.getXMLItems();
		
		for (ItemWeapon weapon : this.weapons)
		{
			if (weapon.Properties.RegisterItem)
				GameRegistry.registerItem(weapon, weapon.getUnlocalizedName().substring(5));
		}
		
		//FIXME: Dynamic Projectile Classes
		EntityRegistry.registerModEntity(EntityProjectile.class, "KCWMProjectile", 1, KCWeaponMod.instance, 100, 10, true);
		
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
			if (!weapon.Properties.ProjectileLivingProperties.equalsIgnoreCase(""))
				weapon.Properties.ProjLivingActArgs = KCUtils.ProcessObjectTags(weapon.Properties.ProjectileLivingProperties);
			if (ProcessingObjectTagsErrored)
			{
				System.err.println("KCWeaponMod - ERROR: Projectile Living Properties contains an error: "+weapon.Properties.ProjectileLivingProperties);
				ProcessingObjectTagsErrored = false;
			}
			if (!weapon.Properties.ProjectileImpactProperties.equalsIgnoreCase(""))
				weapon.Properties.ProjImpactActArgs = KCUtils.ProcessObjectTags(weapon.Properties.ProjectileImpactProperties);
			if (ProcessingObjectTagsErrored)
			{
				System.err.println("KCWeaponMod - ERROR: Projectile Impact Properties contains an error: "+weapon.Properties.ProjectileImpactProperties);
				ProcessingObjectTagsErrored = false;
			}
			if (!weapon.Properties.ProjectilePrematureEndOfLifeProperties.equalsIgnoreCase(""))
				weapon.Properties.ProjPrematureEndLifeActArgs = KCUtils.ProcessObjectTags(weapon.Properties.ProjectilePrematureEndOfLifeProperties);
			if (ProcessingObjectTagsErrored)
			{
				System.err.println("KCWeaponMod - ERROR: Projectile Premature End Of Life Properties contains an error: "+weapon.Properties.ProjectilePrematureEndOfLifeProperties);
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
