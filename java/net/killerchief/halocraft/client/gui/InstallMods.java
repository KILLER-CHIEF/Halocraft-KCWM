package net.killerchief.halocraft.client.gui;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

public class InstallMods {

	public static void main(String[] args) {
		if (args.length > 1)
		{
			try {
				Thread.sleep(4000L);

				File currMod = new File(args[0]);
				File newMod = new File(args[1]);
				
				System.out.println(currMod.getAbsolutePath());
				System.out.println(newMod.getAbsolutePath());

				int success = 0;
				while (success >= 0)
				{
					if (currMod.delete())
					{
						try {
							Files.copy(newMod, new File(currMod.getAbsolutePath()+newMod.getName()));
						} catch (IOException e) {
							System.err.println("Failed to copy mod into install directory!");
							e.printStackTrace();
						}
						break;
					}
					if (success > 10)
					{
						System.err.println("Update Failed! Unable to delete Old Halocraft Mod!");
						return;
					}
					success++;
					Thread.sleep(4000L);
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

}
