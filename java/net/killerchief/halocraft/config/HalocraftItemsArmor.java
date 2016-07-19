package net.killerchief.halocraft.config;

import java.util.ArrayList;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.inventory.RecipeShapelessDamagedConvert;
import net.killerchief.halocraft.items.HalocraftItem;
import net.killerchief.halocraft.items.ItemCustomArmor;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class HalocraftItemsArmor {
	
	public static Item HelmetUnderArmor;
	public static Item BodyUnderArmor;
	public static Item LegsUnderArmor;
	public static Item BootsUnderArmor;
	public static Item MarineHelmet;
	public static Item MarineBody;
	public static Item MarineLegs;
	public static Item MarineBoots;
	public static Item ODSTHelmet;
	public static Item ODSTBody;
	public static Item ODSTLegs;
	public static Item ODSTBoots;
	
	public static String[] ColorList = new String[]{"Black", "Red", "Green", "Brown", "LightBlue", "Blue", "Purple", "Cyan", "Silver", "Gray", "Pink", "Lime", "Yellow", "Magenta", "Orange", "White"};
	
	public static ArrayList<Item> MarkVSeries = new ArrayList<Item>();
	public static ArrayList<Item> MarkVISeries = new ArrayList<Item>();
	public static ArrayList<Item> CQBSeries = new ArrayList<Item>();
	public static ArrayList<Item> EODSeries = new ArrayList<Item>();
	public static ArrayList<Item> EVASeries = new ArrayList<Item>();
	public static ArrayList<Item> HayabusaSeries = new ArrayList<Item>();
	public static ArrayList<Item> ReconSeries = new ArrayList<Item>();
	public static ArrayList<Item> RogueSeries = new ArrayList<Item>();
	public static ArrayList<Item> ScoutSeries = new ArrayList<Item>();
	public static ArrayList<Item> SecuritySeries = new ArrayList<Item>();
	
	public static ArrayList<Item>[] ArmorSeries = new ArrayList[]{MarkVSeries, MarkVISeries, CQBSeries, EODSeries, EVASeries, HayabusaSeries, ReconSeries, RogueSeries, ScoutSeries, SecuritySeries};
		
	public static void load(Configuration config) {
		ArmorMaterial MARINE = new EnumHelper().addArmorMaterial("Marine", 20,  new int[]{3, 7, 5, 3}, 9);
		
		HelmetUnderArmor = new HalocraftItem("HelmetUnderArmor", "HelmetUnderArmor").setMaxStackSize(1);
		BodyUnderArmor = new HalocraftItem("BodyUnderArmor", "BodyUnderArmor").setMaxStackSize(1);
		LegsUnderArmor = new HalocraftItem("LegsUnderArmor", "LegsUnderArmor").setMaxStackSize(1);
		BootsUnderArmor = new HalocraftItem("BootsUnderArmor", "BootsUnderArmor").setMaxStackSize(1);
		MarineHelmet = new ItemCustomArmor("MarineHelmet", "MarineHelmet", "None", Halocraft.MODID+":textures/armor/Marine.png", 0, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineBody = new ItemCustomArmor("MarineBody", "MarineBody", "None", Halocraft.MODID+":textures/armor/Marine.png", 1, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineLegs = new ItemCustomArmor("MarineLegs", "MarineLegs", "None", Halocraft.MODID+":textures/armor/Marine.png", 2, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineBoots = new ItemCustomArmor("MarineBoots", "MarineBoots", "None", Halocraft.MODID+":textures/armor/Marine.png", 3, MARINE, Halocraft.proxy.addArmor("Marine"));
		ODSTHelmet = new ItemCustomArmor("ODSTHelmet", "ODSTHelmet", "None", Halocraft.MODID+":textures/armor/ODST.png", 0, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), "ODSTHelmetOverlay", "ODSTHelmetZoomOverlay");
		ODSTBody = new ItemCustomArmor("ODSTBody", "ODSTBody", "None", Halocraft.MODID+":textures/armor/ODST.png", 1, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		ODSTLegs = new ItemCustomArmor("ODSTLegs", "ODSTLegs", "None", Halocraft.MODID+":textures/armor/ODST.png", 2, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		ODSTBoots = new ItemCustomArmor("ODSTBoots", "ODSTBoots", "None", Halocraft.MODID+":textures/armor/ODST.png", 3, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		
		for (String color : ColorList) {
			MarkVSeries.add( new ItemCustomArmor("MarkVHelmet"+color, "MarkVHelmet"+color, "MarkV", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkV"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkV"), "MarkVHelmetOverlay", "MarkVHelmetZoomOverlay") );
			MarkVSeries.add( new ItemCustomArmor("MarkVBody"+color, "MarkVBody"+color, "MarkV", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkV"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkV")) );
			MarkVSeries.add( new ItemCustomArmor("MarkVLegs"+color, "MarkVLegs"+color, "MarkV", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkV"+color+".png", 2, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkV")) );
			MarkVSeries.add( new ItemCustomArmor("MarkVBoots"+color, "MarkVBoots"+color, "MarkV", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkV"+color+".png", 3, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkV")) );
		}
		for (String color : ColorList) {
			MarkVISeries.add( new ItemCustomArmor("MarkVIHelmet"+color, "MarkVIHelmet"+color, "MarkVI", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkVI"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkVI"), "MarkVIHelmetOverlay", "MarkVIHelmetZoomOverlay") );
			MarkVISeries.add( new ItemCustomArmor("MarkVIBody"+color, "SecurityBody"+color, "MarkVI", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkVI"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkVI")) );
			MarkVISeries.add( new ItemCustomArmor("MarkVILegs"+color, "MarkVILegs"+color, "MarkVI", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkVI"+color+".png", 2, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkVI")) );
			MarkVISeries.add( new ItemCustomArmor("MarkVIBoots"+color, "MarkVIBoots"+color, "MarkVI", Halocraft.MODID+":textures/armor/skins/SkinArmorMarkVI"+color+".png", 3, ArmorMaterial.IRON, Halocraft.proxy.addArmor("MarkVI")) );
		}
		for (String color : ColorList) {
			CQBSeries.add( new ItemCustomArmor("CQBHelmet"+color, "CQBHelmet"+color, "CQB", Halocraft.MODID+":textures/armor/skins/SkinArmorCQB"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("CQB"), "CQBHelmetOverlay", "CQBHelmetZoomOverlay") );
			CQBSeries.add( new ItemCustomArmor("CQBBody"+color, "CQBBody"+color, "CQB", Halocraft.MODID+":textures/armor/skins/SkinArmorCQB"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("CQB")) );
			CQBSeries.add(null);
			CQBSeries.add(null);
		}
		for (String color : ColorList) {
			EODSeries.add( new ItemCustomArmor("EODHelmet"+color, "EODHelmet"+color, "EOD", Halocraft.MODID+":textures/armor/skins/SkinArmorEOD"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("EOD"), "EODHelmetOverlay", "EODHelmetZoomOverlay") );
			EODSeries.add( new ItemCustomArmor("EODBody"+color, "EODBody"+color, "EOD", Halocraft.MODID+":textures/armor/skins/SkinArmorEOD"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("EOD")) );
			EODSeries.add(null);
			EODSeries.add(null);
		}
		for (String color : ColorList) {
			EVASeries.add( new ItemCustomArmor("EVAHelmet"+color, "EVAHelmet"+color, "EVA", Halocraft.MODID+":textures/armor/skins/SkinArmorEVA"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("EVA"), "EVAHelmetOverlay", "EVAHelmetZoomOverlay") );
			EVASeries.add( new ItemCustomArmor("EVABody"+color, "EVABody"+color, "EVA", Halocraft.MODID+":textures/armor/skins/SkinArmorEVA"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("EVA")) );
			EVASeries.add(null);
			EVASeries.add(null);
		}
		for (String color : ColorList) {
			HayabusaSeries.add( new ItemCustomArmor("HayabusaHelmet"+color, "HayabusaHelmet"+color, "Hayabusa", Halocraft.MODID+":textures/armor/skins/SkinArmorHayabusa"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Hayabusa"), "HayabusaHelmetOverlay", "HayabusaHelmetZoomOverlay") );
			HayabusaSeries.add( new ItemCustomArmor("HayabusaBody"+color, "HayabusaBody"+color, "Hayabusa", Halocraft.MODID+":textures/armor/skins/SkinArmorHayabusa"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Hayabusa")) );
			HayabusaSeries.add(null);
			HayabusaSeries.add(null);
		}
		for (String color : ColorList) {
			ReconSeries.add( new ItemCustomArmor("ReconHelmet"+color, "ReconHelmet"+color, "Recon", Halocraft.MODID+":textures/armor/skins/SkinArmorRecon"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Recon"), "ReconHelmetOverlay", "ReconHelmetZoomOverlay") );
			ReconSeries.add( new ItemCustomArmor("ReconBody"+color, "ReconBody"+color, "Recon", Halocraft.MODID+":textures/armor/skins/SkinArmorRecon"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Recon")) );
			ReconSeries.add(null);
			ReconSeries.add(null);
		}
		for (String color : ColorList) {
			RogueSeries.add( new ItemCustomArmor("RogueHelmet"+color, "RogueHelmet"+color, "Rogue", Halocraft.MODID+":textures/armor/skins/SkinArmorRogue"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Rogue"), "RogueHelmetOverlay", "RogueHelmetZoomOverlay") );
			RogueSeries.add(null);
			RogueSeries.add(null);
			RogueSeries.add(null);
		}
		for (String color : ColorList) {
			ScoutSeries.add( new ItemCustomArmor("ScoutHelmet"+color, "ScoutHelmet"+color, "Scout", Halocraft.MODID+":textures/armor/skins/SkinArmorScout"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Scout"), "ScoutHelmetOverlay", "ScoutHelmetZoomOverlay") );
			ScoutSeries.add( new ItemCustomArmor("ScoutBody"+color, "ScoutBody"+color, "Scout", Halocraft.MODID+":textures/armor/skins/SkinArmorScout"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Scout")) );
			ScoutSeries.add(null);
			ScoutSeries.add(null);
		}
		for (String color : ColorList) {
			SecuritySeries.add( new ItemCustomArmor("SecurityHelmet"+color, "SecurityHelmet"+color, "Security", Halocraft.MODID+":textures/armor/skins/SkinArmorSecurity"+color+".png", 0, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Security"), "SecurityHelmetOverlay", "SecurityHelmetZoomOverlay") );
			SecuritySeries.add( new ItemCustomArmor("SecurityBody"+color, "SecurityBody"+color, "Security", Halocraft.MODID+":textures/armor/skins/SkinArmorSecurity"+color+".png", 1, ArmorMaterial.IRON, Halocraft.proxy.addArmor("Security")) );
			SecuritySeries.add(null);
			SecuritySeries.add(null);
		}
	}
	
	public static boolean IsSpartanArmorPiece(Item item, int ArmorPieceType)
	{
		if (item instanceof ItemCustomArmor)
		{
			for (ArrayList series : ArmorSeries) {
				if (series.contains(item))
				{
					return series.indexOf(item) % 4 == ArmorPieceType;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<Item>[] ArmorSeriesV = new ArrayList[]{MarkVSeries};
	
	public static boolean IsSpartanArmorPieceMarkV(Item item, int ArmorPieceType)
	{
		if (item instanceof ItemCustomArmor)
		{
			for (ArrayList series : ArmorSeriesV) {
				if (series.contains(item))
				{
					return series.indexOf(item) % 4 == ArmorPieceType;
				}
			}
		}
		return false;
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(HelmetUnderArmor, HelmetUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BodyUnderArmor, BodyUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LegsUnderArmor, LegsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BootsUnderArmor, BootsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineHelmet, MarineHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBody, MarineBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineLegs, MarineLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBoots, MarineBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTHelmet, ODSTHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBody, ODSTBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTLegs, ODSTLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBoots, ODSTBoots.getUnlocalizedName().substring(5));
		
		for (ArrayList<Item> series : ArmorSeries) {
			for (Item item : series) {
				if (item != null)
					GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
			}
		}
		/*
		System.out.print("\nStart\n");
		for (ArrayList<Item> series : ArmorSeries) {
			for (Item item : series) {
				if (item != null)
				{
					GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
					String name = item.getUnlocalizedName().substring(15);
					for (String color : ColorList)
					{
						if (name.contains(color))
						{
							name = name.replace(color, " "+color);
							break;
						}
					}
					name = name.replace("Helmet", " Helmet").replace("Body", " Body").replace("Legs", " Legs").replace("Boots", " Boots").replace("V", " V").replace("E VA", "EVA").replace("LightBlue", "Light Blue");
					System.out.print(item.getUnlocalizedName()+".name="+name+"\n");
				}
			}
		}
		System.out.print("\nFin");
		System.out.println("Finish");*/
	}
	
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(HelmetUnderArmor, 1), new Object[] {
			"XXX", "X X", Character.valueOf('X'), HalocraftItems.EnhancedFibre
		});
		GameRegistry.addRecipe(new ItemStack(BodyUnderArmor, 1), new Object[] {
			"X X", "XXX", "XXX", Character.valueOf('X'), HalocraftItems.EnhancedFibre
		});
		GameRegistry.addRecipe(new ItemStack(LegsUnderArmor, 1), new Object[] {
			"XXX", "X X", "X X", Character.valueOf('X'), HalocraftItems.EnhancedFibre
		});
		GameRegistry.addRecipe(new ItemStack(BootsUnderArmor, 1), new Object[] {
			"X X", "X X", Character.valueOf('X'), HalocraftItems.EnhancedFibre
		});
		GameRegistry.addRecipe(new ItemStack(MarineHelmet, 1), new Object[] {
			"ITI", "TMT", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('M'), HalocraftItems.Microchip
		});
		GameRegistry.addRecipe(new ItemStack(MarineBody, 1), new Object[] {
			"T T", "ITI", "TWT", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('W'), Blocks.wool
		});
		GameRegistry.addRecipe(new ItemStack(MarineLegs, 1), new Object[] {
			"IWI", "T T", "T T", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('W'), Blocks.wool
		});
		GameRegistry.addRecipe(new ItemStack(MarineBoots, 1), new Object[] {
			"I I", "T T", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('T'), HalocraftItems.TitaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(ODSTHelmet, 1), new Object[] {
			"CTC", "TGT", "MSM", Character.valueOf('C'), HalocraftItems.CeramicComposite, Character.valueOf('T'), HalocraftItems.TitaniumIngot, 
			Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('M'), HalocraftItems.Microchip, Character.valueOf('S'), HalocraftItems.Memorychip
		});
		GameRegistry.addRecipe(new ItemStack(ODSTBody, 1), new Object[] {
			"STS", "TCT", "CTC", Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('C'), HalocraftItems.CeramicComposite, Character.valueOf('S'), Items.string
		});
		GameRegistry.addRecipe(new ItemStack(ODSTLegs, 1), new Object[] {
			"SCS", "T T", "C C", Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('C'), HalocraftItems.CeramicComposite, Character.valueOf('S'), Items.string
		});
		GameRegistry.addRecipe(new ItemStack(ODSTBoots, 1), new Object[] {
			"T T", "C C", Character.valueOf('T'), HalocraftItems.TitaniumIngot, Character.valueOf('C'), HalocraftItems.CeramicComposite
		});
		
		//MarkVHelmetBlack
		GameRegistry.addRecipe(new ItemStack(MarkVSeries.get(0), 1), new Object[] {
			"XUX", "XVX", " X ", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.HelmetUnderArmor, 
			Character.valueOf('V'), Blocks.glass_pane
		});
		//MarkVBodyBlack
		GameRegistry.addRecipe(new ItemStack(MarkVSeries.get(1), 1), new Object[] {
			"XUX", "XSX", "XPX", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.BodyUnderArmor, 
			Character.valueOf('S'), HalocraftItems.ShieldProjector, Character.valueOf('P'), HalocraftItems.UNSCPowerGenerator
		});
		//MarkVLegsBlack
		GameRegistry.addRecipe(new ItemStack(MarkVSeries.get(2), 1), new Object[] {
			"XXX", "XUX", "X X", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.LegsUnderArmor
		});
		//MarkVBootsBlack
		GameRegistry.addRecipe(new ItemStack(MarkVSeries.get(3), 1), new Object[] {
			"X X", "XUX", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.BootsUnderArmor
		});
		
		//ArmorSeriesColourCraftingRecipes(MarkVSeries, new int[]{0,2,4,1});
		
		for (ArrayList series : ArmorSeries) {
			ArmorSeriesColourCraftingRecipes(series);
		}
	}
	
	private static void ArmorSeriesColourCraftingRecipes(ArrayList<Item> list)
	{
		for (int i = 0; i < list.size()/4; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (j == i*4) {
					j += 4;
					if (j >= list.size())
						break;
				}
				Item itemA = list.get((i*4)+(j%4));
				Item itemB = list.get(j);
				if (itemA != null && itemB != null) {
					GameRegistry.addRecipe(new RecipeShapelessDamagedConvert(new ItemStack(itemA, 1), new ItemStack(itemB, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.dye, 1, i), new ItemStack(Items.dye, 1, i), new ItemStack(Items.dye, 1, i), new ItemStack(Items.dye, 1, i)));
				}
			}
		}
	}
	
	private static void ArmorSeriesColourCraftingRecipes(ArrayList<Item> list, int[] dyes)
	{
		//{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
		//int[] dye = {0,2,4,1};
		for (int i = 0; i < list.size()/4; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (j == i*4) {
					j += 4;
					if (j >= list.size())
						break;
				}
				Item itemA = list.get((i*4)+(j%4));
				Item itemB = list.get(j);
				if (itemA != null && itemB != null)
					GameRegistry.addRecipe(new RecipeShapelessDamagedConvert(new ItemStack(itemA, 1), new ItemStack(itemB, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.dye, 1, dyes[i]), new ItemStack(Items.dye, 1, dyes[i]), new ItemStack(Items.dye, 1, dyes[i]), new ItemStack(Items.dye, 1, dyes[i])));
			}
		}
	}
}
