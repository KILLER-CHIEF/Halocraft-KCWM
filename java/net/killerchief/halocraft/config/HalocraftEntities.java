package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.entities.EntityDeployableGravityLift;
import net.killerchief.halocraft.entities.mobs.EntityEliteCarbine;
import net.killerchief.halocraft.entities.mobs.EntityElitePlasmaRifle;
import net.killerchief.halocraft.entities.mobs.EntityEliteSword;
import net.killerchief.halocraft.entities.mobs.EntityGruntPlasmaPistol;
import net.killerchief.halocraft.entities.vehicles.EntityGhost;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseBlue;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseDefault;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseGreen;
import net.killerchief.halocraft.entities.vehicles.EntityMongooseRed;
import net.killerchief.halocraft.entities.vehicles.EntityPassengerSeat;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class HalocraftEntities {

	public static int startEntityId = 300;

	public static void registerEntities() {
		EntityRegistry.registerModEntity(EntityEliteSword.class, "EliteSword", 1, Halocraft.instance, 80, 2, true);
		EntityRegistry.registerModEntity(EntityEliteCarbine.class, "EliteCarbine", 2, Halocraft.instance, 80, 2, true);
		EntityRegistry.registerModEntity(EntityElitePlasmaRifle.class, "ElitePlasmaRifle", 3, Halocraft.instance, 80, 2, true);
		EntityRegistry.registerModEntity(EntityGruntPlasmaPistol.class, "GruntPlasmaPistol", 4, Halocraft.instance, 80, 2, true);
		EntityRegistry.registerModEntity(EntityPassengerSeat.class, "PassengerSeat", 140, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityMongooseDefault.class, "MongooseDefault", 141, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityMongooseGreen.class, "MongooseGreen", 142, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityMongooseBlue.class, "MongooseBlue", 143, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityMongooseRed.class, "MongooseRed", 144, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityGhost.class, "Ghost", 145, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityWarthog.class, "Warthog", 146, Halocraft.instance, 100, 1, true);
		EntityRegistry.registerModEntity(EntityDeployableGravityLift.class, "DeployableGravityLift", 160, Halocraft.instance, 100, 1, true);

		registerEggEntities();
	}

	private static void registerEggEntities() {
		registerEntityEgg(EntityEliteSword.class, 0xE8D1FF, 0x75DDFF);
		registerEntityEgg(EntityEliteCarbine.class, 0xE8D1FF, 0x75DDFF);
		registerEntityEgg(EntityElitePlasmaRifle.class, 0xE8D1FF, 0x75DDFF);
		registerEntityEgg(EntityGruntPlasmaPistol.class, 0xE8D1FF, 0x75DDFF);
	}

	private static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor)
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityList.EntityEggInfo(id, primaryColor, secondaryColor));
	}

	//returns empty id
	private static int getUniqueEntityId()
	{
		int entityID = startEntityId;
		do
		{
			entityID++;
		}
		while(EntityList.getStringFromID(entityID) != null);

		return entityID;
	}
}
