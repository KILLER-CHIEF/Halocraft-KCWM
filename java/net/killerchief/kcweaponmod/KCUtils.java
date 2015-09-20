package net.killerchief.kcweaponmod;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;

public class KCUtils {

	public static void CallPropertyParts(EntityProjectile projectile, MovingObjectPosition collidedObject, Object arg)
	{
		//System.out.println("Process Call Request");
		if (projectile.tagLoopExitBreakout || arg == null || (arg instanceof Object[] && ((Object[])arg).length == 0) || arg.toString().equals("null"))
		{
			//System.out.println("Method Return Arg null");
			return;
		}
		if (arg instanceof Object[] && ((Object[])arg).length == 1 && (((Object[])arg)[0] == null || (((Object[])arg)[0] != null && ((Object[])arg)[0].toString().equals("null"))))
		{
			return;
		}
		if (arg instanceof Object[])
		{
			if (((Object[])arg).length == 1 && ((Object[])arg)[0] instanceof Object[])
			{
				CallPropertyParts(projectile, collidedObject, ((Object[])arg)[0]);
				return;
			}
			if (((Object[])arg).length > 1 && ((Object[])arg)[0] instanceof Object[] && ((Object[])arg)[1] == null)
			{
				CallPropertyParts(projectile, collidedObject, ((Object[])arg)[0]);
				return;
			}
			if (((Object[])arg).length > 1 && ((Object[])arg)[0] instanceof String)
			{
				Object[] input = Arrays.copyOfRange((Object[])arg, 1, ((Object[])arg).length);
				//Object input = alt.length > 0 ? alt : null;
				while (input.length == 1 && input[0] instanceof Object[])
				{
					input = (Object[])input[0];
				}

				String[] name = ((Object[])arg)[0].toString().split("\\.");
				String className;
				String methodName;
				if (name.length > 1)
				{
					className = name[0];
					int i = 1;
					while (i < name.length-1)
					{
						className = className+"."+name[i];
						i++;
					}
					methodName = name[i];
				}
				else
				{
					className = ProjectileProperties.class.getName();
					methodName = ((Object[])arg)[0].toString();
				}

				try {
					//System.out.println("Calling method of name that has args: "+((Object[])arg)[0].toString());
					Class c = Class.forName(className);
					c.getDeclaredMethod(methodName, EntityProjectile.class, MovingObjectPosition.class, Object[].class).invoke(c.newInstance(), projectile, collidedObject, input);
				} catch (IllegalAccessException e) {
					System.err.println("The method \""+((Object[])arg)[0].toString()+"\" cannot be accessed!");
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					System.err.println("Invalid arguments for method: \""+((Object[])arg)[0].toString()+"\" with attempted arguments: \""+projectile+"\" & \""+collidedObject+"\" & \""+input+"\"");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					System.err.println("Invoke method error for: \""+((Object[])arg)[0].toString()+"\" with arguments: \""+projectile+"\" & \""+collidedObject+"\" & \""+input+"\"");
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					System.err.println("Method \""+((Object[])arg)[0].toString()+"\" does not exist!");
					e.printStackTrace();
				} catch (SecurityException e) {
					System.err.println("This code doesn't have permission to access the method \""+((Object[])arg)[0].toString()+"\"... How does that even happen? Is it private?");
					e.printStackTrace();
				} catch (InstantiationException e) {
					System.err.println("Cannot create a new instance to call the method: \""+((Object[])arg)[0].toString()+"\" with arguments: \""+projectile+"\" & \""+collidedObject+"\" & \""+input+"\"");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					System.err.println("Class \""+((Object[])arg)[0].toString()+"\" does not exist!");
					e.printStackTrace();
				}
				return;
			}
		}
		if (arg instanceof String || (arg instanceof Object[] && ((Object[])arg).length == 1 && (((Object[])arg)[0] instanceof String || (((Object[])arg)[0] instanceof String[]) && ((String[])((Object[])arg)[0]).length == 1)))
		{
			String name;
			if (arg instanceof String)
				name = (String)arg;
			else if (arg instanceof Object[] && ((Object[])arg)[0] instanceof String[])
				name = ((String[])((Object[])arg)[0])[0];
			else
				name = (String)((Object[])arg)[0];

			try {
				//System.out.println("Calling method only: "+name);
				ProjectileProperties.class.getDeclaredMethod(name, EntityProjectile.class, MovingObjectPosition.class).invoke(ProjectileProperties.class.newInstance(), projectile, collidedObject);
			} catch (IllegalAccessException e) {
				System.err.println("The method \""+name+"\" cannot be accessed!");
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				System.err.println("Invalid arguments for method: \""+name+"\" with attempted arguments: \""+projectile+"\" & \""+collidedObject+"\"");
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				System.err.println("Invoke method error for: \""+name+"\" with arguments: \""+projectile+"\" & \""+collidedObject+"\"");
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				System.err.println("Method \""+name+"\" does not exist!");
				e.printStackTrace();
			} catch (SecurityException e) {
				System.err.println("This code doesn't have permission to find the method... How does that even happen?");
				e.printStackTrace();
			} catch (InstantiationException e) {
				System.err.println("Cannot create a new instance to call the method: \""+name+"\" with arguments: \""+projectile+"\" & \""+collidedObject+"\"");
				e.printStackTrace();
			}
			return;
		}
		System.err.println("The command that was passed is not a valid action! There is an error in the impact properties string for this projectile!");
	}

	public static Object[] ProcessObjectTags(String rawInput)
	{
		String input = rawInput.replaceAll(" ", "");
		//System.out.println(input);
		if (input.length() == 0)
		{
			//System.out.println("Super Exit Early: "+input+".");
			return new Object[]{null};
		}
		//int[] left = CharLoc(input, "(");
		//int[] right = CharLoc(input, ")");

		int firstBracket = input.indexOf("(");//left.length > 0 ? left[0] : -1;
		String[] front = firstBracket >= 0 ? input.substring(0, firstBracket).split(",") : null;
		if (front == null)
		{
			//System.out.println("Exit Early: "+input+".");
			return input.split(",");
		}

		int a = firstBracket + 1;
		int b = 0;
		int firstBracketEnd = -1;

		while (a < input.length())
		{
			if (input.charAt(a) == ')')
			{
				if (b == 0)
				{
					firstBracketEnd = a;
					break;
				}
				b--;
			}
			else if (input.charAt(a) == '(')
			{
				b++;
			}
			a++;
		}
		Object[] middle = null;
		if (firstBracketEnd > firstBracket)
		{
			middle = ProcessObjectTags(input.substring(firstBracket + 1, firstBracketEnd));
		}
		else
		{
			KCWeaponMod.ProcessingObjectTagsErrored = true;
			System.err.println("Detected bad bracketing when processing the string: "+input);
			return null;
		}
		Object[] end = null;
		if (firstBracketEnd + 1 < input.length())
		{
			if (input.charAt(firstBracketEnd + 1) == ',')
			{
				end = ProcessObjectTags(input.substring(firstBracketEnd + 2));
			}
			else
			{
				KCWeaponMod.ProcessingObjectTagsErrored = true;
				System.err.println("Detected no commas after bracket in the string: "+input);
				return null;
			}
		}
		if (middle == null)
		{
			middle = new Object[]{};
		}
		if (end == null)
		{
			end = new Object[]{};
		}

		Object[] output = new Object[front.length + middle.length + end.length];
		int i = 0;
		for (String p : front)
		{
			output[i] = p.trim().equals("") ? null : p.trim();
			i++;
		}

		if (output[i-1] != null && output[i-1] instanceof String && ((String)output[i-1]).startsWith("*"))
		{
			//System.out.println("Asterisk * : "+((String)output[i-1]));
			output[i-1] = SendToTagInit(((String)output[i-1]).substring(1), middle);
		}
		else
		{
			//System.out.println("Not *");
			output[i-1] = new Object[]{output[i-1], middle};
		}
		//i++;
		/*for (Object p : middle)
		{
			output[i] = p;
			i++;
		}*/
		for (Object p : end)
		{
			output[i] = p;
			i++;
		}
		return output;
	}

	public static Object[] SendToTagInit(String name, Object[] data)
	{
		//System.out.println("Send to init");
		try {
			Object[] output = (Object[]) ProjectileProperties.class.getDeclaredMethod("init"+name, Object[].class).invoke(ProjectileProperties.class.newInstance(), new Object[]{data});
			return new Object[]{name, output};
		} catch (IllegalAccessException e) {
			System.err.println("The method \""+"init"+name+"\" cannot be accessed!");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println("The method \""+"init"+name+"\" does not accept a single Object Array argument. It's parameters are incorrect!");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.err.println("Invoke error for method: \""+"init"+name+"\".");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("The method \""+"init"+name+"\" does not exist!");
			e.printStackTrace();
		} catch (SecurityException e) {
			System.err.println("This code doesn't have permission to access the method \""+"init"+name+"\"... How does that even happen? Is it private?");
			e.printStackTrace();
		} catch (InstantiationException e) {
			System.err.println("Cannot create a new instance to call the method: \""+"init"+name+"\" with Object Array Argument.");
			e.printStackTrace();
		}
		KCWeaponMod.ProcessingObjectTagsErrored = true;
		System.err.println("Sending Tag Data to Method \""+"init"+name+"\" Failed! Returning Unedited Data.");
		return new Object[]{name, data};
	}

	public static int[] CharLoc(String word, String letter)
	{
		int[] s = new int[word.length()];
		int i = 0;
		for (int index = word.indexOf(letter); index >= 0; index = word.indexOf(letter, index + 1))
		{
			s[i] = index;
			i++;
		}
		return Arrays.copyOf(s, i);
	}

	public static void TextObjectPrinter(Object o)
	{
		if (o instanceof Object[])
		{
			for (Object p : (Object[])o)
			{
				if (p instanceof Object[])
				{
					TextObjectPrinter(p);
				}
				else
				{
					if (p == null)
					{
						System.out.println("null");
					}
					else
					{
						System.out.println(p.toString());
					}
				}
			}
		}
		else
		{
			if (o == null)
			{
				System.out.println("null");
			}
			else
			{
				System.out.println(o.toString());
			}
		}
	}

	public static int PlayerHasItemOrBlockAmount(EntityPlayer player, Object ammoType)//TODO: didn't use. delete
	{
		//KCUtils.PlayerHasItemOrBlockAmount(minecraft.thePlayer, weapon.Properties.AmmoType2) > 0

		//		for (int i = 0; i < this.mainInventory.length; ++i)
		//        {
		//            if (this.mainInventory[i] != null && this.mainInventory[i].getItem() == p_146029_1_)
		//            {
		//                return i;
		//            }
		//        }

		int ammoAvailable = 0;
		for (int i = 0; i < player.inventory.mainInventory.length; ++i) {
			if (player.inventory.mainInventory[i] != null) {
				if (player.inventory.mainInventory[i].getItem() == ammoType) {
					ammoAvailable += player.inventory.mainInventory[i].stackSize;
				}
			}
		}
		return ammoAvailable;
	}

}
