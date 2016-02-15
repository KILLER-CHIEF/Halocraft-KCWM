package net.killerchief.halocraft.commands;

import java.util.ArrayList;
import java.util.List;

import net.killerchief.halocraft.entities.mobs.EntityEliteCarbine;
import net.killerchief.halocraft.entities.mobs.EntityElitePlasmaRifle;
import net.killerchief.halocraft.entities.mobs.EntityEliteSword;
import net.killerchief.halocraft.entities.mobs.EntityGruntFlee;
import net.killerchief.halocraft.entities.mobs.EntityGruntPlasmaPistol;
import net.killerchief.halocraft.entities.vehicles.EntityBanshee;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseBlue;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseDefault;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseGreen;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseRed;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogChainGun;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogGauss;
import net.killerchief.halocraft.entities.vehicles.EntityWarthogRocket;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommandSpawnEntity implements ICommand {

	private List aliases;
	public CommandSpawnEntity()
	{
		this.aliases = new ArrayList();
		this.aliases.add("HCSpawnEntity");
		this.aliases.add("hcspawnentity");
		this.aliases.add("HCSE");
		this.aliases.add("hcse");
	}

	@Override
	public String getCommandName()
	{
		return "HCSpawnEntity";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
		return "/HCSpawnEntity <Entity> {[x] [y] [z]} [yaw] [pitch]";
	}

	@Override
	public List getCommandAliases()
	{
		return this.aliases;
	}

	private String getModEntities()
	{
		return "Entities: Warthog, WarthogChainGun, WarthogGauss, WarthogRocket, Ghost, Banshee, MongooseBlack, MongooseGreen, MongooseBlue, MongooseRed, Elite, EliteSword, ElitePlasmaRifle, EliteCarbine, Grunt, GruntPlasmaPistol";
	}

	private void processSpawning(ICommandSender icommandsender, String stringentity, double x, double y, double z, float yaw, float pitch)
	{
		Entity entity = null;
		if (stringentity.equalsIgnoreCase("warthog"))
		{
			entity = new EntityWarthog(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("warthogchaingun"))
		{
			entity = new EntityWarthogChainGun(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("warthoggauss"))
		{
			entity = new EntityWarthogGauss(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("warthogrocket"))
		{
			entity = new EntityWarthogRocket(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("ghost"))
		{
			entity = new EntityGhost(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("banshee"))
		{
			entity = new EntityBanshee(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("mongooseblack"))
		{
			entity = new EntityMongooseDefault(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("mongoosegreen"))
		{
			entity = new EntityMongooseGreen(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("mongooseblue"))
		{
			entity = new EntityMongooseBlue(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("mongoosered"))
		{
			entity = new EntityMongooseRed(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("elite"))
		{
			entity = new EntityEliteSword(icommandsender.getEntityWorld(), null);
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("elitesword"))
		{
			entity = new EntityEliteSword(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("eliteplasmarifle"))
		{
			entity = new EntityElitePlasmaRifle(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("elitecarbine"))
		{
			entity = new EntityEliteCarbine(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("grunt"))
		{
			entity = new EntityGruntFlee(icommandsender.getEntityWorld(), null);
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		else if (stringentity.equalsIgnoreCase("gruntplasmapistol"))
		{
			entity = new EntityGruntPlasmaPistol(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
		}
		/*if(stringentity.equalsIgnoreCase("fraggrenade"))
        {
			entity = new HCEntityFragGrenade(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
        }
		if(stringentity.equalsIgnoreCase("plasmagrenade"))
        {
			entity = new HCEntityPlasmaGrenade(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
			//entity.motionY = -1.0D;
			((HCEntityPlasmaGrenade)entity).setThrowableHeading(0.0D, 1.0D, 0.0D, 2F, 0F);
        }
		if(stringentity.equalsIgnoreCase("firebombgrenade"))
        {
			entity = new HCEntityFirebombGrenade(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
			entity.motionY = -0.1D;
        }
		if(stringentity.equalsIgnoreCase("gravitylift"))
        {
			entity = new HCEntityDeployableGravityLift(icommandsender.getEntityWorld());
			entity.setLocationAndAngles(x, y, z, yaw, pitch);
        }*/
		if (entity != null)
		{
			icommandsender.getEntityWorld().spawnEntityInWorld(entity);
		}
		else
		{
			this.ErrorChatMsg(icommandsender, "command.halocraft.spawnentity.unknownentity", getModEntities());
		}
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

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		if (astring.length == 0)
		{
			this.ErrorChatMsg(icommandsender, "command.halocraft.spawnentity.undefinedentity", getModEntities());
		}
		if (astring.length == 1)
		{
			if(icommandsender instanceof Entity)
			{
				Entity entity = (Entity)icommandsender;
				processSpawning(icommandsender, astring[0], entity.posX + 0.5D, entity.posY, entity.posZ + 0.5D, entity.rotationYaw, entity.rotationPitch);
				return;
			}
			this.ErrorChatMsg(icommandsender, "command.halocraft.spawnentity.nolocation");
		}
		if (astring.length == 4)
		{
			processSpawning(icommandsender, astring[0], Double.parseDouble(astring[1]), Double.parseDouble(astring[2]), Double.parseDouble(astring[3]), MathHelper.wrapAngleTo180_float(icommandsender.getEntityWorld().rand.nextFloat() * 360.0F), 0);
			return;
		}
		if (astring.length == 5)
		{
			processSpawning(icommandsender, astring[0], Double.parseDouble(astring[1]), Double.parseDouble(astring[2]), Double.parseDouble(astring[3]), Float.parseFloat(astring[4]), 0);
			return;
		}
		if (astring.length == 6)
		{
			processSpawning(icommandsender, astring[0], Double.parseDouble(astring[1]), Double.parseDouble(astring[2]), Double.parseDouble(astring[3]), Float.parseFloat(astring[4]), Float.parseFloat(astring[5]));
			return;
		}
		this.ErrorChatMsg(icommandsender, "command.halocraft.spawnentity.badarguments");
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	{
		return true;
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
