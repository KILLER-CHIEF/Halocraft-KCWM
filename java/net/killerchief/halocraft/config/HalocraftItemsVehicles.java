package net.killerchief.halocraft.config;

import net.killerchief.halocraft.EventHandler;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.HalocraftUtils;
import net.killerchief.halocraft.items.ItemVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public class HalocraftItemsVehicles {
	
	public static Item ItemMongooseDefault;
	public static Item ItemMongooseGreen;
	public static Item ItemMongooseBlue;
	public static Item ItemMongooseRed;
	public static Item ItemGhost;
	public static Item ItemWarthog;
	public static Item ItemWarthogChainGun;
	public static Item ItemWarthogGauss;
	public static Item ItemWarthogRocket;
	public static Item ItemBanshee;
	public static Item ItemBansheeHeretic;
	public static Item ItemWarthogGold;
	
	public static void load(Configuration config) {
		ItemMongooseDefault = (new ItemVehicle("MongooseDefault", "MongooseDefaultItem", 0));
		ItemMongooseGreen = (new ItemVehicle("MongooseGreen", "MongooseGreenItem", 1));
		ItemMongooseBlue = (new ItemVehicle("MongooseBlue", "MongooseBlueItem", 2));
		ItemMongooseRed = (new ItemVehicle("MongooseRed", "MongooseRedItem", 3));
		ItemGhost = (new ItemVehicle("Ghost", "GhostItem", 4));
		ItemWarthog = (new ItemVehicle("Warthog", "Warthog", 5));
		ItemWarthogChainGun = (new ItemVehicle("WarthogChainGun", "WarthogChainGun", 6));
		ItemWarthogGauss = (new ItemVehicle("WarthogGauss", "WarthogGauss", 7));
		ItemWarthogRocket = (new ItemVehicle("WarthogRocket", "WarthogRocket", 8));
		ItemBanshee = (new ItemVehicle("Banshee", "Banshee", 9));
		ItemBansheeHeretic = (new ItemVehicle("BansheeHeretic", "BansheeHeretic", 11));
		CreativeTabs tab = null;
		if (Halocraft.proxy.isSideClient() && HalocraftUtils.isHcDevTeamMember(Minecraft.getMinecraft().getSession().getUsername())) {
			tab = Halocraft.InvTabHalocraftEntities;
		}
		ItemWarthogGold = (new ItemVehicle("WarthogCivil", "WarthogCivil", 10, tab));
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(ItemMongooseDefault, ItemMongooseDefault.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseGreen, ItemMongooseGreen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseBlue, ItemMongooseBlue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMongooseRed, ItemMongooseRed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGhost, ItemGhost.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWarthog, ItemWarthog.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWarthogChainGun, ItemWarthogChainGun.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWarthogGauss, ItemWarthogGauss.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWarthogRocket, ItemWarthogRocket.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBanshee, ItemBanshee.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBansheeHeretic, ItemBansheeHeretic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWarthogGold, ItemWarthogGold.getUnlocalizedName().substring(5));
	}
	
	public static void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemMongooseDefault, 1), new Object[] {HalocraftItems.MongooseEngine, HalocraftItems.MongooseBody,
			HalocraftItems.MongooseWheel, HalocraftItems.MongooseWheel, HalocraftItems.MongooseWheel, HalocraftItems.MongooseWheel});
		GameRegistry.addRecipe(new ItemStack(ItemMongooseGreen), new Object[] {
			"DDD", "DMD", Character.valueOf('M'), HalocraftItemsVehicles.ItemMongooseDefault, Character.valueOf('D'), new ItemStack(Items.dye, 1, 2)
		});
		GameRegistry.addRecipe(new ItemStack(ItemMongooseBlue), new Object[] {
			"DDD", "DMD", Character.valueOf('M'), HalocraftItemsVehicles.ItemMongooseDefault, Character.valueOf('D'), new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(ItemMongooseRed), new Object[] {
			"DDD", "DMD", Character.valueOf('M'), HalocraftItemsVehicles.ItemMongooseDefault, Character.valueOf('D'), new ItemStack(Items.dye, 1, 1)
		});

	}
}
