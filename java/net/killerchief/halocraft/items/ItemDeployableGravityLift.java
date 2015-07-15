package net.killerchief.halocraft.items;

import net.killerchief.halocraft.entities.EntityDeployableGravityLift;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDeployableGravityLift extends HalocraftItem {

	public ItemDeployableGravityLift(String name, String texture) {
		super(name, texture);
		this.maxStackSize = 4;
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

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par3EntityPlayer.capabilities.isCreativeMode)
		{
			--par1ItemStack.stackSize;
		}

		if (!par2World.isRemote)
		{
			par2World.spawnEntityInWorld(new EntityDeployableGravityLift(par2World, par3EntityPlayer));
			//par2World.playSoundAtEntity(par3EntityPlayer, this.ShootSound, 1.0F, 1.0F);
		}

		return par1ItemStack;
	}
}
