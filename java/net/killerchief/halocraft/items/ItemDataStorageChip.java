package net.killerchief.halocraft.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.blocks.BlockComputer;
import net.killerchief.halocraft.config.HalocraftBlocks;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemDataStorageChip extends ItemRecord
{
	public ItemDataStorageChip(String name, String par2Str) {
		super(par2Str);
		this.setUnlocalizedName(Halocraft.MODID + "." + name);
		this.setCreativeTab(Halocraft.InvTabHalocraft);
	}
	
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iiconregister)
	{
		this.itemIcon = iiconregister.registerIcon(Halocraft.MODID + ":DataStorageChip");
	}
	
	/**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
	@Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (world.getBlock(i, j, k) == HalocraftBlocks.Computer && world.getBlockMetadata(i, j, k) == 0)
        {
            if (world.isRemote)
            {
                return true;
            }
            else
            {
                ((BlockComputer)HalocraftBlocks.Computer).insertRecord(world, i, j, k, itemstack);
                world.playAuxSFXAtEntity((EntityPlayer)null, 1005, i, j, k, Item.getIdFromItem(this));
                --itemstack.stackSize;
                return true;
            }
        }
        else
        {
            return false;
        }
    }

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add(this.getRecordNameLocal());
	}

	/**
	 * Return the title for this record.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public String getRecordNameLocal()
	{
		if (this.recordName == "")
		{
			return "No readable media detected...";
		}
		else if (this.recordName == "MissionToForget")
		{
			return "Halo - Mission To Forget";
		}
		else if (this.recordName == "TheHalo3WarthogRun")
		{
			return "Halo - The Halo 3 Warthog Run";
		}
		return "Halo - " + this.recordName;// .substring(28, this.recordName.length())
	}
	
	/**
     * Retrieves the resource location of the sound to play for this record.
     * 
     * @param name The name of the record to play
     * @return The resource location for the audio, null to use default.
     */
	@Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(Halocraft.MODID+":"+name);
    }
}