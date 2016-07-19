package net.killerchief.halocraft;

import net.killerchief.halocraft.client.gui.GuiCovSupplyCase;
import net.killerchief.halocraft.client.gui.GuiCovSupplyCaseOuter;
import net.killerchief.halocraft.client.gui.GuiGravityLift;
import net.killerchief.halocraft.client.gui.GuiGunHolder;
import net.killerchief.halocraft.client.gui.GuiGunHolderConfig;
import net.killerchief.halocraft.client.gui.GuiLandmine;
import net.killerchief.halocraft.client.gui.GuiLightBridge;
import net.killerchief.halocraft.client.gui.GuiRechargeStation;
import net.killerchief.halocraft.client.gui.GuiUnscWeaponRack;
import net.killerchief.halocraft.inventory.ContainerCovSupplyCase;
import net.killerchief.halocraft.inventory.ContainerGravityLift;
import net.killerchief.halocraft.inventory.ContainerGunHolder;
import net.killerchief.halocraft.inventory.ContainerLandmine;
import net.killerchief.halocraft.inventory.ContainerLightBridge;
import net.killerchief.halocraft.inventory.ContainerRechargeStation;
import net.killerchief.halocraft.inventory.ContainerUnscWeaponRack;
import net.killerchief.halocraft.tileEntities.TileEntityCovSupplyCase;
import net.killerchief.halocraft.tileEntities.TileEntityGravityLift;
import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.killerchief.halocraft.tileEntities.TileEntityLandmine;
import net.killerchief.halocraft.tileEntities.TileEntityLightBridgeGen;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.killerchief.halocraft.tileEntities.TileEntityUnscWeaponRack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity == null)
			return null;

		if (ID == 0)
		{
			if (tileEntity instanceof TileEntityRechargeStation) {
				return new ContainerRechargeStation(player.inventory, (TileEntityRechargeStation)tileEntity);
			}
		}
		else if (ID == 1)
		{
			if (tileEntity instanceof TileEntityLandmine) {
				return new ContainerLandmine(player.inventory, (TileEntityLandmine)tileEntity);
			}
		}
		else if (ID == 2)
		{
			if (tileEntity instanceof TileEntityGravityLift) {
				return new ContainerGravityLift(player.inventory, (TileEntityGravityLift)tileEntity);
			}
		}
		else if (ID == 9 || ID == 10)
		{
			if (tileEntity instanceof TileEntityGunHolder) {
				return new ContainerGunHolder(player.inventory, (TileEntityGunHolder)tileEntity, ID == 9);
			}
		}
		else if (ID == 4)
		{
			if (tileEntity instanceof TileEntityLightBridgeGen) {
				return new ContainerLightBridge(player.inventory, (TileEntityLightBridgeGen)tileEntity);
			}
		}
		else if (ID >= 5 && ID <= 8)
		{
			if (tileEntity instanceof TileEntityCovSupplyCase) {
				if ((ID == 7 || ID == 8) && ((TileEntityCovSupplyCase)tileEntity).isSideClosed(ID == 7))
					return null;
				return new ContainerCovSupplyCase(player.inventory, (TileEntityCovSupplyCase)tileEntity, ID == 5 || ID == 6, ID == 5 || ID == 7);
			}
		}
		else if (ID == 11 || ID <= 12)
		{
			if (tileEntity instanceof TileEntityUnscWeaponRack) {
				if (((TileEntityUnscWeaponRack)tileEntity).isSideClosed(ID == 11))
					return null;
				return new ContainerUnscWeaponRack(player.inventory, (TileEntityUnscWeaponRack)tileEntity, ID == 11);
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity == null)
			return null;

		if (ID == 0)
		{
			if (tileEntity instanceof TileEntityRechargeStation) {
				return new GuiRechargeStation(player.inventory, (TileEntityRechargeStation)tileEntity);
			}
		}
		else if (ID == 1)
		{
			if (tileEntity instanceof TileEntityLandmine) {
				return new GuiLandmine(player.inventory, (TileEntityLandmine)tileEntity);
			}
		}
		else if (ID == 2)
		{
			if (tileEntity instanceof TileEntityGravityLift) {
				return new GuiGravityLift(player.inventory, (TileEntityGravityLift)tileEntity);
			}
		}
		else if (ID == 9)
		{
			if (tileEntity instanceof TileEntityGunHolder) {
				return new GuiGunHolder(player.inventory, (TileEntityGunHolder)tileEntity, true);
			}
		}
		else if (ID == 10)
		{
			if (tileEntity instanceof TileEntityGunHolder) {
				return new GuiGunHolderConfig(player.inventory, (TileEntityGunHolder)tileEntity, false);
			}
		}
		else if (ID == 4)
		{
			if (tileEntity instanceof TileEntityLightBridgeGen) {
				return new GuiLightBridge(player.inventory, (TileEntityLightBridgeGen)tileEntity);
			}
		}
		else if (ID == 5 || ID == 6)
		{
			if (tileEntity instanceof TileEntityCovSupplyCase) {
				return new GuiCovSupplyCaseOuter(player.inventory, (TileEntityCovSupplyCase)tileEntity, true, ID == 5);
			}
		}
		else if (ID == 7 || ID == 8)
		{
			if (tileEntity instanceof TileEntityCovSupplyCase) {
				if (((TileEntityCovSupplyCase)tileEntity).isSideClosed(ID == 7))
					return null;
				return new GuiCovSupplyCase(player.inventory, (TileEntityCovSupplyCase)tileEntity, false, ID == 7);
			}
		}
		else if (ID == 11 || ID == 12)
		{
			if (tileEntity instanceof TileEntityUnscWeaponRack) {
				if (((TileEntityUnscWeaponRack)tileEntity).isSideClosed(ID == 11))
					return null;
				return new GuiUnscWeaponRack(player.inventory, (TileEntityUnscWeaponRack)tileEntity, ID == 11);
			}
		}
		return null;
	}
}
