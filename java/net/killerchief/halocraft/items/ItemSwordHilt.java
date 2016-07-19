package net.killerchief.halocraft.items;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItemsWeapons;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSwordHilt extends HalocraftItem {

	//private int delay = 40;
	private int weaponDamage;

	public ItemSwordHilt(String name, String texture) {
		super(name, texture, KCWeaponMod.InventoryTab);
		this.setMaxDamage(25);
		this.maxStackSize = 1;
		this.weaponDamage = 1;
	}

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isFull3D()
	{
		return true;
	}

	/**
	 * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
	 * the damage on the stack.
	 */
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_)
    {
        if ((double)p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            p_150894_1_.damageItem(2, p_150894_7_);
        }

        return true;
    }

	/**
	 * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
	 */
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
		return multimap;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par1ItemStack.getItemDamage() < 24)
		{
			par1ItemStack = new ItemStack(HalocraftItemsWeapons.EnergySword, 1, par1ItemStack.getItemDamage());
			par2World.playSoundAtEntity(par3EntityPlayer, Halocraft.MODID+":weapons.EnergySwordEquip", 0.4F, 1.0F);
		}/*else{
			par3EntityPlayer.inventory.mainInventory[par3EntityPlayer.inventory.currentItem] = null;
		}
		System.out.println(par1ItemStack.getItemDamage());*/
		return par1ItemStack;
	}



	//public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	//{
	/*EntityPlayer entityplayer = ModLoader.getMinecraftInstance().thePlayer;
		if(par1ItemStack.getItemDamage() == 24)
		{
			par1ItemStack.damageItem(-1, entityplayer);
		}*/

	//System.out.println(par1ItemStack.getItemDamage());


	/*if (this.delay <= 0)
	    {
			if(par1ItemStack.getItemDamage() > 0)
			{
				par1ItemStack.damageItem(-1, entityplayer);
			}

			this.delay = 40;
	    }
	    if (this.delay > 0)
	    {
	        --this.delay;
	        return;
	    }*/
	//}
}