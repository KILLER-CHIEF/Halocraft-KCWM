package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class ContainerGravityLift extends Container {

	private TileEntityGravityLift tileentity;

	public ContainerGravityLift(InventoryPlayer invPlayer, TileEntityGravityLift te) {
		this.tileentity = te;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.tileentity.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}
}
