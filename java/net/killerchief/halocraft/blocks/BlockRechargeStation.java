package net.killerchief.halocraft.blocks;


import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.tileEntities.TileEntityRechargeStation;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRechargeStation extends BlockContainer {
	
	public BlockRechargeStation() {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + ".RechargeStation");
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}
	
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":RechargeStation");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par2)
	{
		return new TileEntityRechargeStation();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, Halocraft.instance, 0, world, x, y, z);
		}
		return true;
	}
}
