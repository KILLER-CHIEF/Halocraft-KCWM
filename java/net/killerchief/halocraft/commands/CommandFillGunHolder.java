package net.killerchief.halocraft.commands;

import java.util.ArrayList;
import java.util.List;

import net.killerchief.halocraft.tileEntities.TileEntityGunHolder;
import net.minecraft.block.Block;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommandFillGunHolder implements ICommand {

	private List aliases;
	public CommandFillGunHolder()
	{
		this.aliases = new ArrayList();
		this.aliases.add("HCFillGunHolder");
		this.aliases.add("hcfillgunholder");
		this.aliases.add("HCFGH");
		this.aliases.add("hcfgh");
	}

	@Override
	public String getCommandName()
	{
		return "HCFillGunHolder";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return "/HCFillGunHolder {<x> <y> <z>} <MainStackItem[#size#damage]> [Stack1Item[#size#damage]] [Stack2Item[#size#damage]] [Stack3Item[#size#damage]] [Stack4Item[#size#damage]]";
	}

	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}

	private void ErrorChatMsg(ICommandSender icommandsender, String s, String... s8)
	{
		icommandsender.addChatMessage(new ChatComponentText("\u00a74"+LanguageRegistry.instance().getStringLocalization("command.halocraft.commanderror")+"\u00a7f"+LanguageRegistry.instance().getStringLocalization(s)));
		for (String stringText : s8)
		{
			icommandsender.addChatMessage(new ChatComponentText(stringText));
		}
		throw new WrongUsageException(getCommandUsage(icommandsender));
	}

	private Item GetItemFromString(String input)
	{
		String[] split = input.split("#");
		String[] item = split[0].split(":");
		if (item.length == 1)
		{
			Item i = GameRegistry.findItem("minecraft", item[0]);
			if (i != null)
				return i;
		}
		else if (item.length > 1)
		{
			Item i = GameRegistry.findItem(item[0], item[1]);
			if (i != null)
				return i;
		}
		return null;
	}

	private Block GetBlockFromString(String input)
	{
		String[] split = input.split("#");
		String[] item = split[0].split(":");
		if (item.length == 1)
		{
			Block i = GameRegistry.findBlock("minecraft", item[0]);
			if (i != null)
				return i;
		}
		else if (item.length > 1)
		{
			Block i = GameRegistry.findBlock(item[0], item[1]);
			if (i != null)
				return i;
		}
		return null;
	}

	private int[] getItemStackProperties(String input)
	{
		String[] split = input.split("#");
		int size = 1;
		int damage = 0;
		if (split.length >= 3)
		{
			damage = Integer.parseInt(split[2]);
		}
		if (split.length >= 2)
		{
			size = Integer.parseInt(split[1]);
		}
		return new int[]{size, damage};
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		System.out.println("Step 1");
		if (astring.length < 4)
		{
			System.out.println("Step 2");
			this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.notenoughargs");
			return;
		}
		ItemStack stackmain = null;
		ItemStack stack1 = null;
		ItemStack stack2 = null;
		ItemStack stack3 = null;
		ItemStack stack4 = null;
		if (astring.length >= 8)
		{
			Item item = GetItemFromString(astring[7]);
			Block block = GetBlockFromString(astring[7]);
			int[] stackprop = getItemStackProperties(astring[7]);
			if (item != null)
				stack4 = new ItemStack(item, stackprop[0], stackprop[1]);
			else if (block != null)
				stack4 = new ItemStack(block, stackprop[0], stackprop[1]);
			else
				this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.unknownitemstack", astring[7].split("#")[0]);
		}
		if (astring.length >= 7)
		{
			Item item = GetItemFromString(astring[6]);
			Block block = GetBlockFromString(astring[6]);
			int[] stackprop = getItemStackProperties(astring[6]);
			if (item != null)
				stack3 = new ItemStack(item, stackprop[0], stackprop[1]);
			else if (block != null)
				stack3 = new ItemStack(block, stackprop[0], stackprop[1]);
			else
				this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.unknownitemstack", astring[6].split("#")[0]);
		}
		if (astring.length >= 6)
		{
			Item item = GetItemFromString(astring[5]);
			Block block = GetBlockFromString(astring[5]);
			int[] stackprop = getItemStackProperties(astring[5]);
			if (item != null)
				stack2 = new ItemStack(item, stackprop[0], stackprop[1]);
			else if (block != null)
				stack2 = new ItemStack(block, stackprop[0], stackprop[1]);
			else
				this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.unknownitemstack", astring[5].split("#")[0]);
		}
		if (astring.length >= 5)
		{
			Item item = GetItemFromString(astring[4]);
			Block block = GetBlockFromString(astring[4]);
			int[] stackprop = getItemStackProperties(astring[4]);
			if (item != null)
				stack1 = new ItemStack(item, stackprop[0], stackprop[1]);
			else if (block != null)
				stack1 = new ItemStack(block, stackprop[0], stackprop[1]);
			else
				this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.unknownitemstack", astring[4].split("#")[0]);
		}
		Item item = GetItemFromString(astring[3]);
		Block block = GetBlockFromString(astring[3]);
		int[] stackprop = getItemStackProperties(astring[3]);
		if (item != null)
			stackmain = new ItemStack(item, stackprop[0], stackprop[1]);
		else if (block != null)
			stackmain = new ItemStack(block, stackprop[0], stackprop[1]);
		else
			this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.unknownitemstack", astring[3].split("#")[0]);

		TileEntity te = icommandsender.getEntityWorld().getTileEntity(Integer.parseInt(astring[0]), Integer.parseInt(astring[1]), Integer.parseInt(astring[2]));

		if (te instanceof TileEntityGunHolder)
		{
			((TileEntityGunHolder)te).ContainerItemStacks = new ItemStack[]{stackmain, stack1, stack2, stack3, stack4};
			((TileEntityGunHolder)te).hasSomethingChanged = true;
		}
		else
		{
			this.ErrorChatMsg(icommandsender, "command.halocraft.fillgunholder.badlocation");
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	{//RequiredPermissionLevel = 2
		return icommandsender.canCommandSenderUseCommand(2, this.getCommandName());
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring)
	{
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] astring, int i)
	{
		return false;
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
}
