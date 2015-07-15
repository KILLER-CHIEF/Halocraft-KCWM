package net.killerchief.halocraft.config;

import cpw.mods.fml.common.registry.GameRegistry;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.items.HalocraftItem;
import net.killerchief.halocraft.items.ItemArmor;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

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
		
		HelmetUnderArmor = (new HalocraftItem("HelmetUnderArmor", "HelmetUnderArmor")).setMaxStackSize(1);
		BodyUnderArmor = (new HalocraftItem("BodyUnderArmor", "BodyUnderArmor")).setMaxStackSize(1);
		LegsUnderArmor = (new HalocraftItem("LegsUnderArmor", "LegsUnderArmor")).setMaxStackSize(1);
		BootsUnderArmor = (new HalocraftItem("BootsUnderArmor", "BootsUnderArmor")).setMaxStackSize(1);
		MarkVHelmetBlack = (new ItemArmor("MarkVHelmetBlack", "MarkVHelmetBlack", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 0, true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png"));
		MarkVBodyBlack = (new ItemArmor("MarkVBodyBlack", "MarkVBodyBlack", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 1));
		MarkVLegsBlack = (new ItemArmor("MarkVLegsBlack", "MarkVLegsBlack", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 2));
		MarkVBootsBlack = (new ItemArmor("MarkVBootsBlack", "MarkVBootsBlack", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 3));
		MarkVHelmetGreen = (new ItemArmor("MarkVHelmetGreen", "MarkVHelmetGreen", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 0, true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png"));
		MarkVBodyGreen = (new ItemArmor("MarkVBodyGreen", "MarkVBodyGreen", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 1));
		MarkVLegsGreen = (new ItemArmor("MarkVLegsGreen", "MarkVLegsGreen", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 2));
		MarkVBootsGreen = (new ItemArmor("MarkVBootsGreen", "MarkVBootsGreen", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 3));
		MarkVHelmetBlue = (new ItemArmor("MarkVHelmetBlue", "MarkVHelmetBlue", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 0, true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png"));
		MarkVBodyBlue = (new ItemArmor("MarkVBodyBlue", "MarkVBodyBlue", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 1));
		MarkVLegsBlue = (new ItemArmor("MarkVLegsBlue", "MarkVLegsBlue", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 2));
		MarkVBootsBlue = (new ItemArmor("MarkVBootsBlue", "MarkVBootsBlue", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 3));
		MarkVHelmetRed = (new ItemArmor("MarkVHelmetRed", "MarkVHelmetRed", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 0, true, Halocraft.MODID+":textures/overlays/MarkVHelmetZoomOverlay.png"));
		MarkVBodyRed = (new ItemArmor("MarkVBodyRed", "MarkVBodyRed", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 1));
		MarkVLegsRed = (new ItemArmor("MarkVLegsRed", "MarkVLegsRed", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 2));
		MarkVBootsRed = (new ItemArmor("MarkVBootsRed", "MarkVBootsRed", true, ArmorMaterial.GOLD, Halocraft.proxy.addArmor("MarkV"), 3));
		ODSTHelmet = (new ItemArmor("ODSTHelmet", "ODSTHelmet", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), 0, true, Halocraft.MODID+":textures/overlays/ODSTHelmetZoomOverlay.png"));
		ODSTBody = (new ItemArmor("ODSTBody", "ODSTBody", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), 1));
		ODSTLegs = (new ItemArmor("ODSTLegs", "ODSTLegs", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), 2));
		ODSTBoots = (new ItemArmor("ODSTBoots", "ODSTBoots", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("ODST"), 3));
		MarineHelmet = (new ItemArmor("MarineHelmet", "MarineHelmet", true, MARINE, Halocraft.proxy.addArmor("Marine"), 0));
		MarineBody = (new ItemArmor("MarineBody", "MarineBody", true, MARINE, Halocraft.proxy.addArmor("Marine"), 1));
		MarineLegs = (new ItemArmor("MarineLegs", "MarineLegs", true, MARINE, Halocraft.proxy.addArmor("Marine"), 2));
		MarineBoots = (new ItemArmor("MarineBoots", "MarineBoots", true, MARINE, Halocraft.proxy.addArmor("Marine"), 3));
		MarkVIHelmetGreen = (new ItemArmor("MarkVIHelmetGreen", "MarkVIHelmetGreen", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"), 0, true, Halocraft.MODID+":textures/overlays/MarkVIHelmetZoomOverlay.png"));
		MarkVIBodyGreen = (new ItemArmor("MarkVIBodyGreen", "MarkVIBodyGreen", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"), 1));
		MarkVILegsGreen = (new ItemArmor("MarkVILegsGreen", "MarkVILegsGreen", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"), 2));
		MarkVIBootsGreen = (new ItemArmor("MarkVIBootsGreen", "MarkVIBootsGreen", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("MarkVI"), 3));
		ReconHelmet = (new ItemArmor("ReconHelmet", "ReconHelmet", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"), 0, true, Halocraft.MODID+":textures/overlays/ReconHelmetZoomOverlay.png"));
		ReconBody = (new ItemArmor("ReconBody", "ReconBody", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"), 1));
		ReconLegs = (new ItemArmor("ReconLegs", "ReconLegs", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"), 2));
		ReconBoots = (new ItemArmor("ReconBoots", "ReconBoots", true, ArmorMaterial.DIAMOND, Halocraft.proxy.addArmor("Recon"), 3));
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

		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlack, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetGreen, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlack, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlue, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlack, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetRed, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBodyGreen, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlue, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBodyRed, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVLegsGreen, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlue, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVLegsRed, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBootsGreen, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlue, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlack, 1), new Object[] {HalocraftItemsArmor.MarkVBootsRed, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 0)});

		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetGreen, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlack, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetGreen, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlue, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetGreen, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetRed, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlack, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlue, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBodyRed, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlack, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlue, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVLegsRed, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlack, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlue, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsGreen, 1), new Object[] {HalocraftItemsArmor.MarkVBootsRed, new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 2)});

		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlue, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlack, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlue, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetGreen, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetBlue, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetRed, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlack, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBodyGreen, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBodyRed, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlack, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVLegsGreen, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVLegsRed, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlack, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBootsGreen, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsBlue, 1), new Object[] {HalocraftItemsArmor.MarkVBootsRed, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 4)});

		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetRed, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlack, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetRed, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetGreen, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVHelmetRed, 1), new Object[] {HalocraftItemsArmor.MarkVHelmetBlue, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyRed, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlack, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyRed, 1), new Object[] {HalocraftItemsArmor.MarkVBodyGreen, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBodyRed, 1), new Object[] {HalocraftItemsArmor.MarkVBodyBlue, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsRed, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlack, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsRed, 1), new Object[] {HalocraftItemsArmor.MarkVLegsGreen, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVLegsRed, 1), new Object[] {HalocraftItemsArmor.MarkVLegsBlue, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsRed, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlack, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsRed, 1), new Object[] {HalocraftItemsArmor.MarkVBootsGreen, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(MarkVBootsRed, 1), new Object[] {HalocraftItemsArmor.MarkVBootsBlue, new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1)});

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
