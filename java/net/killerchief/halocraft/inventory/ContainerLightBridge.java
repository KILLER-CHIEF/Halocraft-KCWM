package net.killerchief.halocraft.inventory;

import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeGen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class ContainerLightBridge extends Container {

	private TileEntityLightBridgeGen tileentity;

	public ContainerLightBridge(InventoryPlayer invPlayer, TileEntityLightBridgeGen te) {
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
