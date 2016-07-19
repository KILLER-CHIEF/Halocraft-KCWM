package net.killerchief.kcweaponmod;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.killerchief.halocraft.Halocraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class KCWMConvert {

	private static String UniqueUnguessableField = "TemplateWillNeverGuessThis@KCWM";

	public static boolean convertToCode(String modid, String weaponVersion, ItemWeapon[] modWeapons)
	{
		return convertToCode(modid, weaponVersion, modWeapons, false);
	}

	public static boolean convertToCode(String modid, String weaponVersion, ItemWeapon[] modWeapons, boolean OutputAllVariables)
	{
		if (!weaponVersion.trim().equals(KCWeaponMod.WeaponFileVersion))
		{
			System.err.println("The invoking mod of ID \""+modid+"\" weapon version is different to the version intended for this mod's version!");
			System.err.println("Converting the XML to Code form may give unexpected results!");
		}

		File path = new File(KCWeaponMod.weaponModDirectory+"Converted To Code From XML/");
		if (!path.exists())
			path.mkdir();

		String formattedModid = modid.replaceAll("[^a-zA-Z0-9]", "");

		ItemWeaponProperties defaultProp = new ItemWeaponProperties();
		List<String> output = new ArrayList<String>();
		output.add("package "+formattedModid+";");
		output.add("");
		output.add("import java.util.ArrayList;");
		output.add("import net.killerchief.kcweaponmod.ItemWeapon;");
		output.add("import net.killerchief.kcweaponmod.ItemWeaponModel;");
		output.add("import net.killerchief.kcweaponmod.ItemWeaponProperties;");
		output.add("import net.killerchief.kcweaponmod.KCWeaponMod;");
		output.add("import net.minecraft.item.ItemStack;");
		output.add("import net.minecraft.util.ResourceLocation;");
		output.add("");
		output.add("public class "+formattedModid+" {");
		output.add("");
		output.add("\t//Call this method in your mod's FMLPreInitializationEvent handler.");
		output.add("\tpublic static void DefineAndSendWeapons() {");
		output.add("\t\tArrayList<ItemWeapon> weapons = new ArrayList<ItemWeapon>();");
		output.add("");
		output.add("");
		List<String> outputErrors = new ArrayList<String>();
		outputErrors.add("");
		outputErrors.add("");
		outputErrors.add("//FIXME ---- Conversion Errors ----");
		outputErrors.add("");

		for (ItemWeapon itemWeapon : modWeapons) {
			String formattedName = itemWeapon.Properties.Name.replaceAll("[^a-zA-Z0-9]", "");
			output.add("\t\tItemWeaponProperties "+formattedName+" = new ItemWeaponProperties(\""+itemWeapon.Properties.Name+"\");");

			for (String fieldName : ItemWeaponProperties.Variables) {
				String value = null;

				try {
					Field field = defaultProp.getClass().getField(fieldName);

					try {
						Object fDef = field.get(defaultProp);
						Object fCmp = field.get(itemWeapon.Properties);

						if (!OutputAllVariables) {
							if (fCmp == null) {
								if (fDef != null) {
									value = "null";
									output.add("\t\t"+formattedName+"."+fieldName+" = "+value+";");
								}
								continue;
							}
						}
						else
						{
							fDef = UniqueUnguessableField;
						}

						if ((fDef != null && fCmp != null && fDef.equals(fCmp)))
							continue;

						String sDef = "";
						String sCmp = "";
						Object[] targets = new Object[]{fDef, fCmp};
						for (int i = 0; i < targets.length; i++) {
							String out = "null";
							Object target = targets[i];

							if (target != null) {
								if (target instanceof int[]) {
									out = "new int[]"+Arrays.toString((int[])target).toString().replace("[", "{").replace("]", "}");
								}
								else if (target instanceof String) {
									out = "\""+target+"\"";
								}
								else if (target instanceof ResourceLocation) {
									out = "new ResourceLocation(\""+((ResourceLocation)target).getResourceDomain()+":"+((ResourceLocation)target).getResourcePath()+"\")";
								}
								else if (target instanceof CreativeTabs) {
									CreativeTabs tab = (CreativeTabs)target;
									String tabInfo = null;
									Field[] tabfields = CreativeTabs.class.getDeclaredFields();
									for (Field tabField : tabfields) {
										try {
											if (tab.equals(tabField)) {
												tabInfo = "net.minecraft.creativetab.CreativeTabs."+tabField.getName();
												break;
											}
										} catch (Exception e) {}
									}
									if (tabInfo == null && tab == KCWeaponMod.InventoryTab) {
										tabInfo = "net.killerchief.kcweaponmod.KCWeaponMod.InventoryTab";
									}
									if (tabInfo == null) {
										if (i == 1) {
											output.add("\t\t//FIXME ---- INCOMPLETE CONVERSION ----");
											outputErrors.add("//--> Incomplete CreativeTabs definition on line "+output.size());
											System.err.println("The converted .java file of the invoking mod of ID \""+modid+"\" contains an incomplete CreativeTabs definition on line "+output.size());
										}
										tabInfo = " * "+tab.toString()+" * ";
									}
									out = tabInfo;
								}
								else if (target instanceof ItemStack) {
									Item item = ((ItemStack)target).getItem();
									String itemInfo = null;
									if (item.getClass().toString().startsWith("class net.minecraft")) {
										Field[] blockfields = Blocks.class.getDeclaredFields();
										for (Field itemField : blockfields) {
											try {
												if (item.equals(Item.getItemFromBlock(((Block)itemField.get(null))))) {
													itemInfo = "net.minecraft.init.Blocks."+itemField.getName();
													break;
												}
											} catch (Exception e) {}
										}
										if (itemInfo == null) {
											Field[] itemfields = Items.class.getDeclaredFields();
											for (Field itemField : itemfields) {
												try {
													if (item.equals(itemField.get(null))) {
														itemInfo = "net.minecraft.init.Items."+itemField.getName();
														break;
													}
												} catch (Exception e) {}
											}
										}
									}
									if (itemInfo == null) {
										output.add("\t\t//FIXME ---- INCOMPLETE CONVERSION ----");
										outputErrors.add("//--> Incomplete ItemStack definition on line "+output.size());
										System.err.println("The converted .java file of the invoking mod of ID \""+modid+"\" contains an incomplete ItemStack definition on line "+output.size());
										itemInfo = " * "+KCUtils.GetBlockItemRegistryName(item)+" from "+item.getClass().toString()+" * ";
									}
									out = "new net.minecraft.item.ItemStack("+itemInfo+")";
								}
								else if (target instanceof ItemWeaponModel) {
									ItemWeaponModel model = (ItemWeaponModel)fCmp;
									ItemWeaponModel defaMod = new ItemWeaponModel(null, null);

									String modelClass = "ModelClassError";
									String modelTexture = "ModelTextureError";

									if (OutputAllVariables)
									{
										defaMod.NoChngOnSprint = !model.NoChngOnSprint;
										defaMod.Glows = !model.Glows;
										defaMod.TPScale(-117000F, -117000F, -117000F);
										defaMod.TPTrans(-117000F, -117000F, -117000F);
										defaMod.TPRotate(-117000F, -117000F, -117000F);
										defaMod.TPSprintTrans(-117000F, -117000F, -117000F);
										defaMod.TPSprintRotate(-117000F, -117000F, -117000F);
										defaMod.FPScale(-117000F, -117000F, -117000F);
										defaMod.FPTrans(-117000F, -117000F, -117000F);
										defaMod.FPRotate(-117000F, -117000F, -117000F);
										defaMod.FPSprintTrans(-117000F, -117000F, -117000F);
										defaMod.FPSprintRotate(-117000F, -117000F, -117000F);

										modelClass = "net.killerchief.kcweaponmod.models.ModelTemplate";
										modelTexture = "Template:textures/path.png";
									}
									else
									{
										if (model.Model == null || model.Texture == null) {
											output.add("\t\t//FIXME ---- INCOMPLETE CONVERSION ----");
										}
										if (model.Model != null) {
											modelClass = model.Model.getClass().getName();
										} else {
											outputErrors.add("//--> null Model Class definition on line "+output.size());
											System.err.println("The converted .java file of the invoking mod of ID \""+modid+"\" contains a null Model Class definition on line "+output.size());
										}
										if (model.Texture != null) {
											modelTexture = model.Texture.getResourceDomain()+":"+model.Texture.getResourcePath();
										} else {
											outputErrors.add("//--> null Model Texture definition on line "+output.size());
											System.err.println("The converted .java file of the invoking mod of ID \""+modid+"\" contains a null Model Texture definition on line "+output.size());
										}
									}

									output.add("\t\t"+formattedName+".WeaponModel = new ItemWeaponModel(new "+modelClass+"(), new ResourceLocation(\""+modelTexture+"\"), "+model.NoChngOnSprint+", "+model.Glows+");");
									
									if (defaMod.TPScaleX != model.TPScaleX || defaMod.TPScaleY != model.TPScaleY || defaMod.TPScaleZ != model.TPScaleZ)
										output.add("\t\t"+formattedName+".WeaponModel.TPScale("+model.TPScaleX+"F, "+model.TPScaleY+"F, "+model.TPScaleZ+"F);");
									if (defaMod.TPTransX != model.TPTransX || defaMod.TPTransY != model.TPTransY || defaMod.TPTransZ != model.TPTransZ)
										output.add("\t\t"+formattedName+".WeaponModel.TPTrans("+model.TPTransX+"F, "+model.TPTransY+"F, "+model.TPTransZ+"F);");
									if (defaMod.TPRotateX != model.TPRotateX || defaMod.TPRotateY != model.TPRotateY || defaMod.TPRotateZ != model.TPRotateZ)
										output.add("\t\t"+formattedName+".WeaponModel.TPRotate("+model.TPRotateX+"F, "+model.TPRotateY+"F, "+model.TPRotateZ+"F);");
									if (defaMod.TPSprintTransX != model.TPSprintTransX || defaMod.TPSprintTransY != model.TPSprintTransY || defaMod.TPSprintTransZ != model.TPSprintTransZ)
										output.add("\t\t"+formattedName+".WeaponModel.TPSprintTrans("+model.TPSprintTransX+"F, "+model.TPSprintTransY+"F, "+model.TPSprintTransZ+"F);");
									if (defaMod.TPSprintRotateX != model.TPSprintRotateX || defaMod.TPSprintRotateY != model.TPSprintRotateY || defaMod.TPSprintRotateZ != model.TPSprintRotateZ)
										output.add("\t\t"+formattedName+".WeaponModel.TPSprintRotate("+model.TPSprintRotateX+"F, "+model.TPSprintRotateY+"F, "+model.TPSprintRotateZ+"F);");
									if (defaMod.FPScaleX != model.FPScaleX || defaMod.FPScaleY != model.FPScaleY || defaMod.FPScaleZ != model.FPScaleZ)
										output.add("\t\t"+formattedName+".WeaponModel.FPScale("+model.FPScaleX+"F, "+model.FPScaleY+"F, "+model.FPScaleZ+"F);");
									if (defaMod.FPTransX != model.FPTransX || defaMod.FPTransY != model.FPTransY || defaMod.FPTransZ != model.FPTransZ)
										output.add("\t\t"+formattedName+".WeaponModel.FPTrans("+model.FPTransX+"F, "+model.FPTransY+"F, "+model.FPTransZ+"F);");
									if (defaMod.FPRotateX != model.FPRotateX || defaMod.FPRotateY != model.FPRotateY || defaMod.FPRotateZ != model.FPRotateZ)
										output.add("\t\t"+formattedName+".WeaponModel.FPRotate("+model.FPRotateX+"F, "+model.FPRotateY+"F, "+model.FPRotateZ+"F);");
									if (defaMod.FPSprintTransX != model.FPSprintTransX || defaMod.FPSprintTransY != model.FPSprintTransY || defaMod.FPSprintTransZ != model.FPSprintTransZ)
										output.add("\t\t"+formattedName+".WeaponModel.FPSprintTrans("+model.FPSprintTransX+"F, "+model.FPSprintTransY+"F, "+model.FPSprintTransZ+"F);");
									if (defaMod.FPSprintRotateX != model.FPSprintRotateX || defaMod.FPSprintRotateY != model.FPSprintRotateY || defaMod.FPSprintRotateZ != model.FPSprintRotateZ)
										output.add("\t\t"+formattedName+".WeaponModel.FPSprintRotate("+model.FPSprintRotateX+"F, "+model.FPSprintRotateY+"F, "+model.FPSprintRotateZ+"F);");
									
									break;
								}
								else {
									out = target.toString();
									if (target instanceof Float) {
										out += "F";
									}
									else if (target instanceof Double) {
										out += "D";
									}
								}
							}

							if (i == 0) {
								sDef = out;
							} else {
								sCmp = out;
							}
						}
						
						if (fCmp instanceof ItemWeaponModel) {
							continue;
						}

						if (sDef.equals(sCmp) && !output.get(output.size()-1).equals("\t\t//FIXME ---- INCOMPLETE CONVERSION ----")) {
							continue;
						}

						value = sCmp;

					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

					if (value == null)
						value = "null";
					output.add("\t\t"+formattedName+"."+fieldName+" = "+value+";");
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}	

			output.add("\t\tweapons.add(new ItemWeapon("+formattedName+"));");
			output.add("");

		}
		
		output.add("");
		output.add("\t\tif (KCWeaponMod.registerModItems(\""+formattedModid+"\", \""+KCWeaponMod.WeaponFileVersion+"\", weapons.toArray(new ItemWeapon[weapons.size()]))) {");
		output.add("\t\t\tSystem.out.println(\"KCWeaponMod <"+formattedModid+">: Successfully Registered Weapons\");");
		output.add("\t\t} else {");
		output.add("\t\t\tSystem.err.println(\"KCWeaponMod <"+formattedModid+">: ERROR - Weapons Were NOT Registered!\");");
		output.add("\t\t}");
		output.add("\t}");
		output.add("}");

		String filename = path.getAbsolutePath()+"\\"+formattedModid+".java";

		try {
			outputErrors.add("");
			if (outputErrors.size() > 5)
				output.addAll(outputErrors);
			writeSmallTextFile(output, filename);
			return true;
		} catch (IOException e) {
			System.out.println("Failed to write file: "+filename);
			e.printStackTrace();
		}

		return false;
	}


	public static boolean convertToXML(String modid, String weaponVersion, ItemWeapon[] modWeapons)
	{
		return convertToXML(modid, weaponVersion, modWeapons, false);
	}

	public static boolean convertToXML(String modid, String weaponVersion, ItemWeapon[] modWeapons, boolean OutputAllVariables)
	{
		if (!weaponVersion.trim().equals(KCWeaponMod.WeaponFileVersion))
		{
			System.err.println("The invoking mod of ID \""+modid+"\" weapon version is different to the version intended for this mod's version!");
			System.err.println("Converting the code to XML form may give unexpected results!");
		}

		File path = new File(KCWeaponMod.weaponModDirectory+"Converted To XML From Code/");
		if (!path.exists())
			path.mkdir();

		List<String> output = new ArrayList<String>();
		List<String> outputErrors = new ArrayList<String>();
		outputErrors.add("");
		outputErrors.add("");
		outputErrors.add("<!-- Conversion Errors: -->");
		outputErrors.add("");

		output.add("<?xml version=\"1.0\"?>");
		output.add("<kcweaponmod version=\""+weaponVersion+"\">");

		ItemWeaponProperties defaultProp = new ItemWeaponProperties();

		for (ItemWeapon itemWeapon : modWeapons) {
			output.add("\t<weapon name=\""+itemWeapon.Properties.Name+"\">");

			//Begin Variables

			for (String fieldName : ItemWeaponProperties.Variables) {
				String value = null;

				try {
					Field field = defaultProp.getClass().getField(fieldName);

					try {
						Object f1 = field.get(defaultProp);
						Object f2 = field.get(itemWeapon.Properties);
						if (!OutputAllVariables) {
							if (f2 == null) {
								if (f1 != null) {
									value = "";
									output.add("\t\t<"+fieldName.toLowerCase()+">"+value+"</"+fieldName.toLowerCase()+">");
								}
								continue;
							}
						}
						else
						{
							f1 = UniqueUnguessableField;
						}

						//proj prop object handling
						if (fieldName.equalsIgnoreCase("ProjectileLivingProperties"))
						{
							if (itemWeapon.Properties.ProjectileLivingProperties.equalsIgnoreCase(""))
							{
								//if (!itemWeapon.Properties.ProjLivingActArgs.equals(defaultProp.ProjLivingActArgs))
								if (!(itemWeapon.Properties.ProjLivingActArgs != null && itemWeapon.Properties.ProjLivingActArgs.length == 0))
								{
									output.add("\t\t<!-- INCOMPLETE CONVERSION -->");
									value = projPropObjectToString(itemWeapon.Properties.ProjLivingActArgs);
									output.add("\t\t<"+fieldName.toLowerCase()+">"+value+"</"+fieldName.toLowerCase()+">");
									outputErrors.add("<!-- Incomplete Projectile Property definition on line "+output.size()+" -->");
									System.err.println("The converted .XML file of the invoking mod of ID \""+modid+"\" contains an incomplete Projectile Property definition on line "+output.size());
									continue;
								}
							}
						}
						else if (fieldName.equalsIgnoreCase("ProjectileImpactProperties"))
						{
							if (itemWeapon.Properties.ProjectileImpactProperties.equalsIgnoreCase(""))
							{
								//if (!itemWeapon.Properties.ProjImpactActArgs.equals(defaultProp.ProjImpactActArgs))
								if (!(itemWeapon.Properties.ProjPrematureEndLifeActArgs != null && itemWeapon.Properties.ProjPrematureEndLifeActArgs.length == 1 && itemWeapon.Properties.ProjPrematureEndLifeActArgs[0] != null && "Die".equals(itemWeapon.Properties.ProjPrematureEndLifeActArgs[0])))
								{
									output.add("\t\t<!-- INCOMPLETE CONVERSION -->");
									value = projPropObjectToString(itemWeapon.Properties.ProjImpactActArgs);
									output.add("\t\t<"+fieldName.toLowerCase()+">"+value+"</"+fieldName.toLowerCase()+">");
									outputErrors.add("<!-- Incomplete Projectile Property definition on line "+output.size()+" -->");
									System.err.println("The converted .XML file of the invoking mod of ID \""+modid+"\" contains an incomplete Projectile Property definition on line "+output.size());
									continue;
								}
							}
						}
						else if (fieldName.equalsIgnoreCase("ProjectilePrematureEndOfLifeProperties"))
						{
							if (itemWeapon.Properties.ProjectilePrematureEndOfLifeProperties.equalsIgnoreCase(""))
							{
								//if (!itemWeapon.Properties.ProjPrematureEndLifeActArgs.equals(defaultProp.ProjPrematureEndLifeActArgs))
								if (!(itemWeapon.Properties.ProjPrematureEndLifeActArgs != null && itemWeapon.Properties.ProjPrematureEndLifeActArgs.length == 0))
								{
									output.add("\t\t<!-- INCOMPLETE CONVERSION -->");
									value = projPropObjectToString(itemWeapon.Properties.ProjPrematureEndLifeActArgs);
									output.add("\t\t<"+fieldName.toLowerCase()+">"+value+"</"+fieldName.toLowerCase()+">");
									outputErrors.add("<!-- Incomplete Projectile Property definition on line "+output.size()+" -->");
									System.err.println("The converted .XML file of the invoking mod of ID \""+modid+"\" contains an incomplete Projectile Property definition on line "+output.size());
									continue;
								}
							}
						}
						//END proj prop object handling


						String s1 = "";
						if (f1 != null) {
							if (f1 instanceof int[]) {
								s1 = Arrays.toString((int[])f1).toString().replace("[", "").replace("]", "").replace(" ", "");
							}
							else if (f1 instanceof ResourceLocation) {
								s1 = ((ResourceLocation)f1).getResourceDomain()+":"+((ResourceLocation)f1).getResourcePath();
							}
							else {
								s1 = f1.toString();
							}
						}
						String s2 = "";
						if (f2 instanceof int[]) {
							s2 = Arrays.toString((int[])f2).toString().replace("[", "").replace("]", "").replace(" ", "");
						}
						else if (f2 instanceof ResourceLocation) {
							s2 = ((ResourceLocation)f2).getResourceDomain()+":"+((ResourceLocation)f2).getResourcePath();
						}
						else {
							if (f2 != null)
								s2 = f2.toString();
						}

						if (s1.equals(s2))
							continue;

						//value = ObjectFilter(f1, f2, output);


						if (f2 instanceof CreativeTabs) {
							value = ((CreativeTabs)f2).getTabLabel();
						}
						else if (f2 instanceof ItemWeaponModel) {
							value = null;
							ItemWeaponModel model = (ItemWeaponModel)f2;
							ItemWeaponModel defaMod = new ItemWeaponModel(null, null);

							String modelClass = "ModelClassError";
							String modelTexture = "ModelTextureError";

							if (OutputAllVariables)
							{
								defaMod.NoChngOnSprint = !model.NoChngOnSprint;
								defaMod.Glows = !model.Glows;
								defaMod.TPScale(-117000F, -117000F, -117000F);
								defaMod.TPTrans(-117000F, -117000F, -117000F);
								defaMod.TPRotate(-117000F, -117000F, -117000F);
								defaMod.TPSprintTrans(-117000F, -117000F, -117000F);
								defaMod.TPSprintRotate(-117000F, -117000F, -117000F);
								defaMod.FPScale(-117000F, -117000F, -117000F);
								defaMod.FPTrans(-117000F, -117000F, -117000F);
								defaMod.FPRotate(-117000F, -117000F, -117000F);
								defaMod.FPSprintTrans(-117000F, -117000F, -117000F);
								defaMod.FPSprintRotate(-117000F, -117000F, -117000F);

								modelClass = "template.Model";
								modelTexture = "Template:textures/path.png";
							}
							else
							{
								if (model.Model != null) {
									modelClass = model.Model.getClass().getName();
								} else {
									outputErrors.add("<!-- null Model Class definition on line "+output.size()+" -->");
									System.err.println("The converted .XML file of the invoking mod of ID \""+modid+"\" contains a null Model Class definition on line "+output.size());
								}
								if (model.Texture != null) {
									modelTexture = model.Texture.getResourceDomain()+":"+model.Texture.getResourcePath();
								} else {
									outputErrors.add("<!-- null Model Texture definition on line "+output.size()+" -->");
									System.err.println("The converted .XML file of the invoking mod of ID \""+modid+"\" contains a null Model Texture definition on line "+output.size());
								}
							}

							output.add("\t\t<"+"modelclass"+">"+modelClass+"</"+"modelclass"+">");
							output.add("\t\t<"+"modeltexture"+">"+modelTexture+"</"+"modeltexture"+">");
							output.add("\t\t<"+"modelnochangeonsprint"+">"+model.NoChngOnSprint+"</"+"modelnochangeonsprint"+">");
							output.add("\t\t<"+"modelglows"+">"+model.Glows+"</"+"modelglows"+">");
							if (defaMod.TPScaleX != model.TPScaleX || defaMod.TPScaleY != model.TPScaleY || defaMod.TPScaleZ != model.TPScaleZ)
								output.add("\t\t<"+"modeltpscale"+">"+model.TPScaleX+","+model.TPScaleY+","+model.TPScaleZ+"</"+"modeltpscale"+">");
							if (defaMod.TPTransX != model.TPTransX || defaMod.TPTransY != model.TPTransY || defaMod.TPTransZ != model.TPTransZ)
								output.add("\t\t<"+"modeltptrans"+">"+model.TPTransX+","+model.TPTransY+","+model.TPTransZ+"</"+"modeltptrans"+">");
							if (defaMod.TPRotateX != model.TPRotateX || defaMod.TPRotateY != model.TPRotateY || defaMod.TPRotateZ != model.TPRotateZ)
								output.add("\t\t<"+"modeltprotate"+">"+model.TPRotateX+","+model.TPRotateY+","+model.TPRotateZ+"</"+"modeltprotate"+">");
							if (defaMod.TPSprintTransX != model.TPSprintTransX || defaMod.TPSprintTransY != model.TPSprintTransY || defaMod.TPSprintTransZ != model.TPSprintTransZ)
								output.add("\t\t<"+"modeltpsprinttrans"+">"+model.TPSprintTransX+","+model.TPSprintTransY+","+model.TPSprintTransZ+"</"+"modeltpsprinttrans"+">");
							if (defaMod.TPSprintRotateX != model.TPSprintRotateX || defaMod.TPSprintRotateY != model.TPSprintRotateY || defaMod.TPSprintRotateZ != model.TPSprintRotateZ)
								output.add("\t\t<"+"modeltpsprintrotate"+">"+model.TPSprintRotateX+","+model.TPSprintRotateY+","+model.TPSprintRotateZ+"</"+"modeltpsprintrotate"+">");
							if (defaMod.FPScaleX != model.FPScaleX || defaMod.FPScaleY != model.FPScaleY || defaMod.FPScaleZ != model.FPScaleZ)
								output.add("\t\t<"+"modelfpscale"+">"+model.FPScaleX+","+model.FPScaleY+","+model.FPScaleZ+"</"+"modelfpscale"+">");
							if (defaMod.FPTransX != model.FPTransX || defaMod.FPTransY != model.FPTransY || defaMod.FPTransZ != model.FPTransZ)
								output.add("\t\t<"+"modelfptrans"+">"+model.FPTransX+","+model.FPTransY+","+model.FPTransZ+"</"+"modelfptrans"+">");
							if (defaMod.FPRotateX != model.FPRotateX || defaMod.FPRotateY != model.FPRotateY || defaMod.FPRotateZ != model.FPRotateZ)
								output.add("\t\t<"+"modelfprotate"+">"+model.FPRotateX+","+model.FPRotateY+","+model.FPRotateZ+"</"+"modelfprotate"+">");
							if (defaMod.FPSprintTransX != model.FPSprintTransX || defaMod.FPSprintTransY != model.FPSprintTransY || defaMod.FPSprintTransZ != model.FPSprintTransZ)
								output.add("\t\t<"+"modelfpsprinttrans"+">"+model.FPSprintTransX+","+model.FPSprintTransY+","+model.FPSprintTransZ+"</"+"modelfpsprinttrans"+">");
							if (defaMod.FPSprintRotateX != model.FPSprintRotateX || defaMod.FPSprintRotateY != model.FPSprintRotateY || defaMod.FPSprintRotateZ != model.FPSprintRotateZ)
								output.add("\t\t<"+"modelfpsprintrotate"+">"+model.FPSprintRotateX+","+model.FPSprintRotateY+","+model.FPSprintRotateZ+"</"+"modelfpsprintrotate"+">");
						}
						else if (f2 instanceof int[]) {
							value = s2;
						}
						else if (f2 instanceof ResourceLocation) {
							value = s2;
						}
						else if (f2 instanceof ItemStack) {
							value = KCUtils.GetBlockItemRegistryName(((ItemStack)f2).getItem());
						}
						else
						{
							if (f2 != null)
								value = f2.toString();
							else
								value = "";
						}


					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

					if (value != null)
						output.add("\t\t<"+fieldName.toLowerCase()+">"+value+"</"+fieldName.toLowerCase()+">");
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}

			//End variables

			output.add("\t</weapon>");
		}

		output.add("</kcweaponmod>");

		String filename = path.getAbsolutePath()+"\\"+modid+".xml";

		try {
			outputErrors.add("");
			if (outputErrors.size() > 5)
				output.addAll(outputErrors);
			writeSmallTextFile(output, filename);
			return true;
		} catch (IOException e) {
			System.out.println("Failed to write file: "+filename);
			e.printStackTrace();
		}

		return false;
	}



	private final static Charset ENCODING = StandardCharsets.UTF_8;

	private static void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		Files.write(path, aLines, ENCODING);
	}




	public static String projPropObjectToString(Object[] object)
	{
		String built = subPPOTS(object);
		if (built.length() > 1) {
			built = built.substring(1, built.length()-1);
		}

		built = subfunc(built);

		return built;
	}

	public static List<String> getBracketGroups(String string)
	{
		List<String> matchList = new ArrayList<String>();

		int howDeep = 0;
		int begin = -1;

		for (int i = 0; i < string.length(); i++) {
			if (begin == -1 && string.charAt(i) == '(') {
				begin = i+1;
			}
			else if (begin >= 0)
			{
				if (string.charAt(i) == '(')
					howDeep++;
				else if (string.charAt(i) == ')')
					howDeep--;
				if (howDeep < 0) {
					matchList.add(string.substring(begin, i));
					begin = -1;
					howDeep = 0;
				}
			}
		}

		return matchList;
	}

	public static List<Integer> getBracketGroupsBeginEnd(String string)
	{
		List<Integer> matchList = new ArrayList<Integer>();

		int howDeep = 0;
		int begin = -1;

		for (int i = 0; i < string.length(); i++) {
			if (begin == -1 && string.charAt(i) == '(') {
				begin = i;
			}
			else if (begin >= 0)
			{
				if (string.charAt(i) == '(')
					howDeep++;
				else if (string.charAt(i) == ')')
					howDeep--;
				if (howDeep < 0) {
					matchList.add(begin);
					matchList.add(i+1);
					begin = -1;
					howDeep = 0;
				}
			}
		}

		return matchList;
	}

	public static String subfunc(String built)
	{
		List<String> matchList = getBracketGroups(built);

		String newbuild = "";

		for (String string : matchList) {
			String newpart = string.replaceFirst(",", "");
			List<String> newprop = getBracketGroups(newpart);
			if (newprop.size() > 0)
			{
				String subnewpart = newprop.get(0);

				List<Integer> indexGroups = getBracketGroupsBeginEnd(subnewpart);

				String subfunction = "";
				String buildInnerProp = "";
				String buildInnerEndProp = "";

				if (indexGroups.size() > 0) {
					String altsubnewpart = subnewpart;
					for (int i = 0; i < indexGroups.size(); i++) {
						altsubnewpart = altsubnewpart.substring(0, indexGroups.get(i)) + new String(new char[indexGroups.get(i+1) - indexGroups.get(i)]).replace("\0", "-") + altsubnewpart.substring(indexGroups.get(i+1), altsubnewpart.length());
						i++;
					}

					int icomma = altsubnewpart.lastIndexOf(",");
					int lengthlastarg = -1;
					buildInnerProp = subnewpart.substring(0, icomma+1);

					for (int i = 0; i < indexGroups.size(); i++) {
						if (icomma+1 == indexGroups.get(i)) {
							lengthlastarg = indexGroups.get(i+1) - indexGroups.get(i);
						}
						i++;
					}
					if (lengthlastarg < 0) {
						lengthlastarg = altsubnewpart.length()-1-icomma;
					}
					int endInd = icomma+1+lengthlastarg;
					int len = subnewpart.length();
					subfunction = subnewpart.substring(icomma+1, endInd);
					buildInnerProp = subnewpart.substring(0, icomma+1);
					buildInnerEndProp = subnewpart.substring(endInd, subnewpart.length());
				}
				else {
					int icomma = subnewpart.lastIndexOf(",");
					subfunction = subnewpart.substring(icomma+1, subnewpart.length());
					buildInnerProp = subnewpart.substring(0, icomma+1);
				}

				buildInnerProp += subfunc(subfunction) + buildInnerEndProp;

				String functionName = newpart.substring(0, newpart.indexOf("("));

				String classOfMethod = "net.killerchief.kcweaponmod.ProjectileProperties";
				String methodName = functionName;

				if (functionName.contains("."))
				{
					int lastdot = functionName.lastIndexOf(".");
					classOfMethod = functionName.substring(0, lastdot);
					methodName = functionName.substring(lastdot+1);
				}

				try {
					Method output = Class.forName(classOfMethod).getDeclaredMethod("init"+methodName, Object[].class);
					functionName = "*"+("net.killerchief.kcweaponmod.ProjectileProperties".equals(classOfMethod) ? "" : classOfMethod+".")+methodName;
				} catch (NoSuchMethodException e) {
				} catch (SecurityException e) {
				} catch (ClassNotFoundException e) {
				}

				newpart = functionName + "(" + buildInnerProp + ")";
			}

			newbuild += newpart + ",";
		}
		return newbuild.equalsIgnoreCase("") ? built : newbuild.substring(0, newbuild.length()-1);
	}

	public static String subPPOTS(Object[] object)
	{
		String buildProjProp = "";
		for (Object obj : object) {
			if (obj instanceof Object[]) {
				buildProjProp += subPPOTS((Object[])obj);
			}
			else if (obj instanceof Block)
			{
				buildProjProp += KCUtils.GetBlockItemRegistryName(obj);
			}
			else {
				buildProjProp += obj.toString();
			}
			buildProjProp += ",";
		}
		if (buildProjProp.length() > 0)
			buildProjProp = buildProjProp.substring(0, buildProjProp.length()-1);
		return "("+buildProjProp+")";
	}

}
