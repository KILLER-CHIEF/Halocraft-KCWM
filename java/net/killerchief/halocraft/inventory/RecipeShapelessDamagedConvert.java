package net.killerchief.halocraft.inventory;

import java.util.Arrays;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.MathHelper;

/**
 * A shaped recipe class that copies the item damage of the first armour ingredient to the output. The damage is clamped to the output item's damage range.
 * <p>
 * Test for this thread:
 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/modification-development/2513998-help-needed-creating-crafting-recipe-with-damaged
 */
public class RecipeShapelessDamagedConvert extends ShapelessRecipes {

	public RecipeShapelessDamagedConvert(ItemStack output, ItemStack... input) {
		super(output, Arrays.asList(input));
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		ItemStack output = super.getCraftingResult(inv); // Get the default output

		for (int i = 0; i < inv.getSizeInventory(); i++) { // For each slot in the crafting inventory,
			ItemStack ingredient = inv.getStackInSlot(i); // Get the ingredient in the slot

			if (ingredient != null && ingredient.getItem() instanceof ItemArmor) { // If it's the armour piece
				// Clone its item damage, clamping it to the output's damage range
				int newDamage = MathHelper.clamp_int(ingredient.getItemDamage(), 0, output.getMaxDamage());
				output.setItemDamage(newDamage);
				break;
			}
		}

		return output; // Return the modified output
	}
}