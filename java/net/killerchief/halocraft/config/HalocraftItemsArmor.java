package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.client.models.armor.ModelMarkVArmor;
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
	public static Item MarkVHelmetBlack;
	public static Item MarkVHelmetGreen;
	public static Item MarkVHelmetBlue;
	public static Item MarkVHelmetRed;
	public static Item MarkVBodyBlack;
	public static Item MarkVBodyGreen;
	public static Item MarkVBodyBlue;
	public static Item MarkVBodyRed;
	public static Item MarkVLegsBlack;
	public static Item MarkVLegsGreen;
	public static Item MarkVLegsBlue;
	public static Item MarkVLegsRed;
	public static Item MarkVBootsBlack;
	public static Item MarkVBootsGreen;
	public static Item MarkVBootsBlue;
	public static Item MarkVBootsRed;
	public static Item ODSTHelmet;
	public static Item ODSTBody;
	public static Item ODSTLegs;
	public static Item ODSTBoots;
	public static Item MarineHelmet;
	public static Item MarineBody;
	public static Item MarineLegs;
	public static Item MarineBoots;
	public static Item MarkVIHelmetGreen;
	public static Item MarkVIBodyGreen;
	public static Item MarkVILegsGreen;
	public static Item MarkVIBootsGreen;
	public static Item ReconHelmet;
	public static Item ReconBody;
	public static Item ReconLegs;
	public static Item ReconBoots;
	
	public static void load(Configuration config) {
		ArmorMaterial MARINE = new EnumHelper().addArmorMaterial("Marine", 20,  new int[]{3, 7, 5, 3}, 9);
		
		HelmetUnderArmor = new HalocraftItem("HelmetUnderArmor", "HelmetUnderArmor").setMaxStackSize(1);
		BodyUnderArmor = new HalocraftItem("BodyUnderArmor", "BodyUnderArmor").setMaxStackSize(1);
		LegsUnderArmor = new HalocraftItem("LegsUnderArmor", "LegsUnderArmor").setMaxStackSize(1);
		BootsUnderArmor = new HalocraftItem("BootsUnderArmor", "BootsUnderArmor").setMaxStackSize(1);
		MarkVHelmetBlack = new ItemCustomArmor("MarkVHelmetBlack", "MarkVHelmetBlack", null, Halocraft.MODID+":textures/armor/MarkVBlack.png", 0, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png");
		MarkVBodyBlack = new ItemCustomArmor("MarkVBodyBlack", "MarkVBodyBlack", null, Halocraft.MODID+":textures/armor/MarkVBlack.png", 1, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVLegsBlack = new ItemCustomArmor("MarkVLegsBlack", "MarkVLegsBlack", null, Halocraft.MODID+":textures/armor/MarkVBlack.png", 2, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVBootsBlack = new ItemCustomArmor("MarkVBootsBlack", "MarkVBootsBlack", null, Halocraft.MODID+":textures/armor/MarkVBlack.png", 3, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVHelmetGreen = new ItemCustomArmor("MarkVHelmetGreen", "MarkVHelmetGreen", null, Halocraft.MODID+":textures/armor/MarkVGreen.png", 0, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png");
		MarkVBodyGreen = new ItemCustomArmor("MarkVBodyGreen", "MarkVBodyGreen", null, Halocraft.MODID+":textures/armor/MarkVGreen.png", 1, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVLegsGreen = new ItemCustomArmor("MarkVLegsGreen", "MarkVLegsGreen", null, Halocraft.MODID+":textures/armor/MarkVGreen.png", 2, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVBootsGreen = new ItemCustomArmor("MarkVBootsGreen", "MarkVBootsGreen", null, Halocraft.MODID+":textures/armor/MarkVGreen.png", 3, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVHelmetBlue = new ItemCustomArmor("MarkVHelmetBlue", "MarkVHelmetBlue", null, Halocraft.MODID+":textures/armor/MarkVBlue.png", 0, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png");
		MarkVBodyBlue = new ItemCustomArmor("MarkVBodyBlue", "MarkVBodyBlue", null, Halocraft.MODID+":textures/armor/MarkVBlue.png", 1, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVLegsBlue = new ItemCustomArmor("MarkVLegsBlue", "MarkVLegsBlue", null, Halocraft.MODID+":textures/armor/MarkVBlue.png", 2, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVBootsBlue = new ItemCustomArmor("MarkVBootsBlue", "MarkVBootsBlue", null, Halocraft.MODID+":textures/armor/MarkVBlue.png", 3, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVHelmetRed = new ItemCustomArmor("MarkVHelmetRed", "MarkVHelmetRed", null, Halocraft.MODID+":textures/armor/MarkVRed.png", 0, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png");
		MarkVBodyRed = new ItemCustomArmor("MarkVBodyRed", "MarkVBodyRed", null, Halocraft.MODID+":textures/armor/MarkVRed.png", 1, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVLegsRed = new ItemCustomArmor("MarkVLegsRed", "MarkVLegsRed", null, Halocraft.MODID+":textures/armor/MarkVRed.png", 2, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		MarkVBootsRed = new ItemCustomArmor("MarkVBootsRed", "MarkVBootsRed", null, Halocraft.MODID+":textures/armor/MarkVRed.png", 3, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"));
		ODSTHelmet = new ItemCustomArmor("ODSTHelmet", "ODSTHelmet", null, Halocraft.MODID+":textures/armor/ODST.png", 0, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), true, Halocraft.MODID+":textures/overlays/ODSTHelmetZoomOverlay.png");
		ODSTBody = new ItemCustomArmor("ODSTBody", "ODSTBody", null, Halocraft.MODID+":textures/armor/ODST.png", 1, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		ODSTLegs = new ItemCustomArmor("ODSTLegs", "ODSTLegs", null, Halocraft.MODID+":textures/armor/ODST.png", 2, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		ODSTBoots = new ItemCustomArmor("ODSTBoots", "ODSTBoots", null, Halocraft.MODID+":textures/armor/ODST.png", 3, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"));
		MarineHelmet = new ItemCustomArmor("MarineHelmet", "MarineHelmet", null, Halocraft.MODID+":textures/armor/Marine.png", 0, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineBody = new ItemCustomArmor("MarineBody", "MarineBody", null, Halocraft.MODID+":textures/armor/Marine.png", 1, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineLegs = new ItemCustomArmor("MarineLegs", "MarineLegs", null, Halocraft.MODID+":textures/armor/Marine.png", 2, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarineBoots = new ItemCustomArmor("MarineBoots", "MarineBoots", null, Halocraft.MODID+":textures/armor/Marine.png", 3, MARINE, Halocraft.proxy.addArmor("Marine"));
		MarkVIHelmetGreen = new ItemCustomArmor("MarkVIHelmetGreen", "MarkVIHelmetGreen", null, Halocraft.MODID+":textures/armor/MarkVIGreen.png", 0, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"), true, Halocraft.MODID+":textures/overlays/MarkVIHelmetZoomOverlay.png");
		MarkVIBodyGreen = new ItemCustomArmor("MarkVIBodyGreen", "MarkVIBodyGreen", null, Halocraft.MODID+":textures/armor/MarkVIGreen.png", 1, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"));
		MarkVILegsGreen = new ItemCustomArmor("MarkVILegsGreen", "MarkVILegsGreen", null, Halocraft.MODID+":textures/armor/MarkVIGreen.png", 2, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"));
		MarkVIBootsGreen = new ItemCustomArmor("MarkVIBootsGreen", "MarkVIBootsGreen", null, Halocraft.MODID+":textures/armor/MarkVIGreen.png", 3, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"));
		ReconHelmet = new ItemCustomArmor("ReconHelmet", "ReconHelmet", new ModelMarkVArmor(), Halocraft.MODID+":textures/armor/MarkV.png", 0, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"), true, Halocraft.MODID+":textures/overlays/ReconHelmetZoomOverlay.png");
		ReconBody = new ItemCustomArmor("ReconBody", "ReconBody", new ModelMarkVArmor(), Halocraft.MODID+":textures/armor/MarkV.png", 1, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"));
		ReconLegs = new ItemCustomArmor("ReconLegs", "ReconLegs", new ModelMarkVArmor(), Halocraft.MODID+":textures/armor/MarkV.png", 2, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"));
		ReconBoots = new ItemCustomArmor("ReconBoots", "ReconBoots", new ModelMarkVArmor(), Halocraft.MODID+":textures/armor/MarkV.png", 3, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"));
		//FIXME: Recon
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(HelmetUnderArmor, HelmetUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BodyUnderArmor, BodyUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LegsUnderArmor, LegsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BootsUnderArmor, BootsUnderArmor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetBlack, MarkVHelmetBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyBlack, MarkVBodyBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsBlack, MarkVLegsBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsBlack, MarkVBootsBlack.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetGreen, MarkVHelmetGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyGreen, MarkVBodyGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsGreen, MarkVLegsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsGreen, MarkVBootsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetBlue, MarkVHelmetBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyBlue, MarkVBodyBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsBlue, MarkVLegsBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsBlue, MarkVBootsBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVHelmetRed, MarkVHelmetRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBodyRed, MarkVBodyRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVLegsRed, MarkVLegsRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVBootsRed, MarkVBootsRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTHelmet, ODSTHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBody, ODSTBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTLegs, ODSTLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ODSTBoots, ODSTBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineHelmet, MarineHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBody, MarineBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineLegs, MarineLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarineBoots, MarineBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIHelmetGreen, MarkVIHelmetGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIBodyGreen, MarkVIBodyGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVILegsGreen, MarkVILegsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MarkVIBootsGreen, MarkVIBootsGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconHelmet, ReconHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconBody, ReconBody.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconLegs, ReconLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ReconBoots, ReconBoots.getUnlocalizedName().substring(5));
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
		GameRegistry.addRecipe(new ItemStack(MarkVHelmetBlack, 1), new Object[] {
			"XUX", "XVX", " X ", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.HelmetUnderArmor, 
			Character.valueOf('V'), Blocks.glass_pane
		});
		GameRegistry.addRecipe(new ItemStack(MarkVBodyBlack, 1), new Object[] {
			"XUX", "XSX", "XPX", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.BodyUnderArmor, 
			Character.valueOf('S'), HalocraftItems.ShieldProjector, Character.valueOf('P'), HalocraftItems.UNSCPowerGenerator
		});
		GameRegistry.addRecipe(new ItemStack(MarkVLegsBlack, 1), new Object[] {
			"XXX", "XUX", "X X", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.LegsUnderArmor
		});
		GameRegistry.addRecipe(new ItemStack(MarkVBootsBlack, 1), new Object[] {
			"X X", "XUX", Character.valueOf('X'), HalocraftItems.MultiLayeredAlloy, Character.valueOf('U'), HalocraftItemsArmor.BootsUnderArmor
		});
		
		Item[] ArmourMarkV = {MarkVHelmetBlack, MarkVBodyBlack, MarkVLegsBlack, MarkVBootsBlack, 
				MarkVHelmetGreen, MarkVBodyGreen, MarkVLegsGreen, MarkVBootsGreen, 
				MarkVHelmetBlue, MarkVBodyBlue, MarkVLegsBlue, MarkVBootsBlue, 
				MarkVHelmetRed, MarkVBodyRed, MarkVLegsRed, MarkVBootsRed};
		
		for (int i = 0; i < ArmourMarkV.length/4; i++) {
			for (int j = 0; j < ArmourMarkV.length; j++) {
				if (j == i*4) {
					j += 4;
					if (j >= ArmourMarkV.length)
						break;
				}
				int[] dye = {0,2,4,1};
				GameRegistry.addRecipe(new RecipeShapelessDamagedConvert(new ItemStack(ArmourMarkV[(i*4)+(j%4)], 1), new ItemStack(ArmourMarkV[j], 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.dye, 1, dye[i]), new ItemStack(Items.dye, 1, dye[i]), new ItemStack(Items.dye, 1, dye[i]), new ItemStack(Items.dye, 1, dye[i])));
			}
		}

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
	}
}
