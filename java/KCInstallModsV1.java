import java.io.File;

public class KCInstallModsV1 {

	public static void main(String[] args) {
		if (args.length > 1)
		{
			try {
				Thread.sleep(4000L);

				File currMod = new File(args[0]);
				File newMod = new File(args[1]);

				System.out.println(currMod.getAbsolutePath());
				System.out.println(newMod.getAbsolutePath());

				int attempts = 0;
				while (attempts >= 0)
				{
					if (currMod.isFile()) {
						if (currMod.delete())
						{
							System.out.println("Successfully Deleted Old Mod! Update Success!");
							break;
						}
					} else {
						attempts = 11;
					}
					if (attempts > 10)
					{
						System.err.println("Update Failed! Unable to Delete Old/Current Mod!");
						System.err.println("Reverting changes and removing proposed replacement mod from install directory.");
						if (newMod.isFile() && !newMod.delete()) {
							Thread.sleep(4000L);
							if (!newMod.delete())
								System.err.println("WARNING! Failed to revert changes! Manual deletion/check may be required.");
						}
						return;
					}
					attempts++;
					Thread.sleep(4000L);
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}
