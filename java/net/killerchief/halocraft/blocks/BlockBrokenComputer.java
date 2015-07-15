package net.killerchief.halocraft.blocks;

import java.util.Random;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.config.HalocraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockBrokenComputer extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;

	public BlockBrokenComputer() {
		super(Material.iron);
		this.setBlockName(Halocraft.MODID + ".BrokenComputer");
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	@Override
	public IIcon getIcon(int Side, int Metadata)
	{
		if(Side == 0)
			return this.iconBottom;
		if(Side == 1)
			return this.iconTop;
		if(Side == 2)
			return this.iconSide;
		if(Side == 3)
			return this.iconSide;
		if(Side == 4)
			return this.iconSide;
		if(Side == 5)
			return this.iconSide;

		return this.blockIcon;
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iiconregister)
	{
		this.blockIcon = iiconregister.registerIcon(Halocraft.MODID+":BrokenComputerSide");
		this.iconTop = iiconregister.registerIcon(Halocraft.MODID+":BrokenComputerTop");
		this.iconSide = iiconregister.registerIcon(Halocraft.MODID+":BrokenComputerSide");
		this.iconBottom = iiconregister.registerIcon(Halocraft.MODID+":BrokenComputerTop");
	}

	@Override
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	{
		if (!par1World.isRemote)
		{
			this.Drops(par1World, par2, par3, par4);
		}
	}

	private void Drops(World par1World, int par2, int par3, int par4) {
		Random rand = new Random();
		int chance = rand.nextInt(3);
		if(chance == 0){
			EntityItem var5 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.DataStorageChip2, 1, 0));
			var5.delayBeforeCanPickup = 10;
			par1World.spawnEntityInWorld(var5);
		}else if(chance == 1){
			EntityItem var5 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.DataStorageChip2, 1, 0));
			var5.delayBeforeCanPickup = 10;
			par1World.spawnEntityInWorld(var5);
		}else if(chance == 2){
			EntityItem var5 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.DataStorageChip1, 1, 0));
			var5.delayBeforeCanPickup = 10;
			par1World.spawnEntityInWorld(var5);
		}else if(chance == 3){
			EntityItem var5 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.DataStorageChip1, 1, 0));
			var5.delayBeforeCanPickup = 10;
			par1World.spawnEntityInWorld(var5);
		}else{
			EntityItem var5 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.DataStorageChip1, 1, 0));
			var5.delayBeforeCanPickup = 10;
			par1World.spawnEntityInWorld(var5);
		}
		EntityItem var1 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.Microchip, 1 + rand.nextInt(1) , 0));
		EntityItem var2 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.Processorchip, 1, 0));
		EntityItem var3 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.RAMchip, 1 + rand.nextInt(1), 0));
		EntityItem var4 = new EntityItem(par1World, par2 + 0.5, par3 + 0.5, par4 + 0.5, new ItemStack(HalocraftItems.MetalRod, 2 + rand.nextInt(4), 0));
		var1.delayBeforeCanPickup = 10;
		var2.delayBeforeCanPickup = 10;
		var3.delayBeforeCanPickup = 10;
		var4.delayBeforeCanPickup = 10;
		par1World.spawnEntityInWorld(var1);
		par1World.spawnEntityInWorld(var2);
		par1World.spawnEntityInWorld(var3);
		par1World.spawnEntityInWorld(var4);
	}

	@Override
	public int quantityDropped(Random par1Random)
	{
		return 0;
	}
}
