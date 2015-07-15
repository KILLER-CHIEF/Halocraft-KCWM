package net.killerchief.halocraft;

import net.killerchief.halocraft.client.gui.GuiGravityLift;
import net.killerchief.halocraft.client.gui.GuiGunHolder;
import net.killerchief.halocraft.client.gui.GuiLandmine;
import net.killerchief.halocraft.client.gui.GuiRechargeStation;
import net.killerchief.halocraft.inventory.ContainerGravityLift;
import net.killerchief.halocraft.inventory.ContainerGunHolder;
import net.killerchief.halocraft.inventory.ContainerLandmine;
import net.killerchief.halocraft.inventory.ContainerRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0)
		{
			TileEntityRechargeStation tileEntityRechargeStation = (TileEntityRechargeStation) world.getTileEntity(x, y, z);
			return new ContainerRechargeStation(player.inventory, tileEntityRechargeStation);
		}
		else if (ID == 1)
		{
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityLandmine) {
				return new ContainerLandmine(player.inventory, (TileEntityLandmine)te);
			}
		}
		else if (ID == 2)
		{
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityGravityLift) {
				return new ContainerGravityLift(player.inventory, (TileEntityGravityLift)te);
			}
		}
		else if (ID == 3)
		{
			TileEntityGunHolder tileentitygunholder = (TileEntityGunHolder) world.getTileEntity(x, y, z);
			return new ContainerGunHolder(player.inventory, tileentitygunholder);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0)
		{
			TileEntityRechargeStation tileEntityRechargeStation = (TileEntityRechargeStation) world.getTileEntity(x, y, z);
			return new GuiRechargeStation(player.inventory, tileEntityRechargeStation);
		}
		else if (ID == 1)
		{
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityLandmine) {
				return new GuiLandmine(player.inventory, (TileEntityLandmine)te);
			}
		}
		else if (ID == 2)
		{
			TileEntity te = world.getTileEntity(x, y, z);
			if (te != null && te instanceof TileEntityGravityLift) {
				return new GuiGravityLift(player.inventory, (TileEntityGravityLift)te);
			}
		}
		else if (ID == 3)
		{
			TileEntityGunHolder tileentitygunholder = (TileEntityGunHolder) world.getTileEntity(x, y, z);
			return new GuiGunHolder(player.inventory, tileentitygunholder);
		}
		return null;
	}
}
