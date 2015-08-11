package net.killerchief.halocraft.client.gui;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.ForgeVersion;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.common.io.Files;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GuiUpdater extends GuiScreen {

	/**
	 * A reference to the screen object that created this. Used for navigating between screens.
	 */
	public final GuiScreen parentScreen;

	private GuiButton btnViewHcWeb;
	private GuiButton btnViewUpdateLog;
	private GuiButton btnChk4Update;
	private GuiButton btnKCWMVers;
	private GuiButton btnDownload;
	private GuiButton btnExit;
	
	String[] kcwmbtnversions = {""};

	public static boolean isUpdateCheckThreadRunning = false;
	public static boolean isDownloadThreadRunning = false;

	public static HcUpdateInfo[] HalocraftVersions = null;
	public class HcUpdateInfo {
		String Version = "";
		String ForgeVersion = "";
		String KCWMVersion = "";
		String Ping = "";
		String DL = "";
		public HcUpdateInfo() { }
	}

	public static KCWMUpdateInfo[] KCWMVersions = null;
	public class KCWMUpdateInfo {
		String Version = "";
		String ForgeVersion = "";
		String Ping = "";
		String DL = "";
		public KCWMUpdateInfo() { }
	}
	
	private static boolean NotZIP = false;

	private int selected = -1;
	private HcUpdateInfo selectedMod = null;
	private GuiSlotModVersionList versionList;
	public static String VersionCompat = null;
	public int kcwmversindex = 0;

	public void selectModIndex(int var1)
	{
		this.selected=var1;
		this.kcwmversindex = 0;
		if (var1>=0 && var1<=HalocraftVersions.length) {
			this.selectedMod=HalocraftVersions[selected];
			this.kcwmbtnversions = this.selectedMod.KCWMVersion.replace(" ", "").trim().split(",");
			this.btnKCWMVers.displayString = this.kcwmbtnversions.length != 0 ? this.kcwmbtnversions[0] : "Bugged";
			if (this.btnKCWMVers.displayString.equalsIgnoreCase(KCWeaponMod.VERSION))
				this.btnKCWMVers.displayString = "Current";
		} else {
			this.selectedMod=null;
		}
	}

	public boolean modIndexSelected(int var1)
	{
		return var1==selected;
	}

	public GuiUpdater(GuiScreen parentscreen)
	{
		parentScreen = parentscreen;
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui()
	{
		super.initGui();
		this.buttonList.clear();
		this.btnViewHcWeb = new GuiButton(1, (width/2) + 5, 40, 160, 20, "View Halocraft Website");
		this.btnViewUpdateLog = new GuiButton(2, (width/2) + 5, 60, 160, 20, "View Update Log");
		this.btnChk4Update = new GuiButton(3, (width/2) + 10, 90, 150, 20, "Check for Updates");
		this.btnKCWMVers = new GuiButton(4, (width/2) + 95, 154, 60, 20, "Current");
		this.btnKCWMVers.displayString = this.kcwmbtnversions.length != 0 && this.kcwmversindex < this.kcwmbtnversions.length ? this.kcwmbtnversions[this.kcwmversindex] : "Bugged";
		if (this.btnKCWMVers.displayString.equalsIgnoreCase(KCWeaponMod.VERSION))
			this.btnKCWMVers.displayString = "Current";
		this.btnKCWMVers.enabled = false;
		this.btnDownload = new GuiButton(5, (width/2) + 20, 180, 130, 20, "Download");
		this.btnDownload.enabled = false;
		this.btnExit = new GuiButton(6, width - 110, height - 30, 80, 20, "Back");
		this.buttonList.add(this.btnViewHcWeb);
		this.buttonList.add(this.btnViewUpdateLog);
		this.buttonList.add(this.btnChk4Update);
		this.buttonList.add(this.btnKCWMVers);
		this.buttonList.add(this.btnDownload);
		this.buttonList.add(this.btnExit);

		if (HalocraftVersions == null || KCWMVersions == null)
		{
			this.versionList = new GuiSlotModVersionList(this, null, 120);
		}
		else
		{
			this.versionList = new GuiSlotModVersionList(this, HalocraftVersions, 120);
		}

		this.versionList.registerScrollButtons(this.buttonList, 7, 8);

		File currHc = null;
		
		for (ModContainer mod : Loader.instance().getActiveModList())
		{
			if (mod.getModId().equalsIgnoreCase(Halocraft.MODID))
			{
				currHc = mod.getSource();
				break;
			}
		}
		
		if (currHc == null || !currHc.toString().endsWith(".zip"))
		{
			NotZIP = true;
			this.btnChk4Update.enabled = false;
			this.btnKCWMVers.enabled = false;
			this.btnDownload.enabled = false;
		}

		if (!NotZIP && (HalocraftVersions == null || KCWMVersions == null))
		{
			this.StartCheckForUpdate();
		}
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		this.drawDefaultBackground();

		this.versionList.drawScreen(mouseX, mouseY, partialTicks);

		String title = LanguageRegistry.instance().getStringLocalization("gui.halocraft.autoupdater.title");
		if (title.equalsIgnoreCase(""))
			title = "Halocraft Auto-Updater";
		if (NotZIP)
			title = "Halocraft is NOT in a ZIP! Auto-Updater Disabled!";
		this.drawCenteredString(this.fontRendererObj, title, this.width / 2, 10, 16777215);
		
		this.drawCenteredString(this.fontRendererObj, "Halocraft v"+Halocraft.VERSION, (this.width/2) + 85, 115, 16777215);
		this.drawCenteredString(this.fontRendererObj, "Forge: "+ForgeVersion.getVersion(), (this.width/2) + 85, 127, 16777215);
		this.drawCenteredString(this.fontRendererObj, "KC's Weapon Mod v"+KCWeaponMod.VERSION, (this.width/2) + 85, 139, 16777215);
		
		this.drawCenteredString(this.fontRendererObj, "Update KCWM to: ", (this.width/2) + 55, 160, 16777215);

		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		if (this.selectedMod != null && (!Halocraft.VERSION.equalsIgnoreCase(this.selectedMod.Version) || !this.btnKCWMVers.displayString.equalsIgnoreCase("Current")))
			this.btnDownload.enabled = true;
		else
			this.btnDownload.enabled = false;
		
		if (this.selectedMod != null)
		{
			this.kcwmbtnversions = this.selectedMod.KCWMVersion.replace(" ", "").trim().split(",");
			
			if (kcwmbtnversions.length <= 1 && this.selectedMod.KCWMVersion.contains(KCWeaponMod.VERSION))
			{
				this.btnKCWMVers.enabled = false;
				this.btnKCWMVers.displayString = "Current";
			}
			else if (kcwmbtnversions.length <= 1 && !this.selectedMod.KCWMVersion.contains(KCWeaponMod.VERSION))
			{
				this.btnKCWMVers.enabled = false;
				this.btnKCWMVers.displayString = this.selectedMod.KCWMVersion;
			}
			else if (kcwmbtnversions.length > 1)
			{
				this.btnKCWMVers.enabled = true;
				if (!this.selectedMod.KCWMVersion.contains(this.btnKCWMVers.displayString) && !this.btnKCWMVers.displayString.equalsIgnoreCase("Current"))
				{
					this.btnKCWMVers.displayString = kcwmbtnversions[0];
				}
			}
			else
			{
				this.btnKCWMVers.enabled = false;
				this.btnKCWMVers.displayString = (kcwmbtnversions != null && kcwmbtnversions.length != 0) ? kcwmbtnversions[0] : this.selectedMod.KCWMVersion;
			}
		}
	}

	/**
	 * Called when the screen is unloaded. Used to disable keyboard repeat events
	 */
	@Override
	public void onGuiClosed()
	{
		//System.out.println("GUI Closed");
	}

	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (guibutton.id == this.btnExit.id)
		{
			this.keyTyped((char)KeyEvent.VK_ESCAPE, 1);
			//this.mc.shutdown();//XXX: Closes Game Completely.
		}
		else if (guibutton.id == this.btnKCWMVers.id)
		{
			if (this.kcwmbtnversions.length > 1)
			{
				if (++this.kcwmversindex >= this.kcwmbtnversions.length)
					this.kcwmversindex = 0;
				this.btnKCWMVers.displayString = this.kcwmbtnversions[this.kcwmversindex];
				if (this.btnKCWMVers.displayString.equalsIgnoreCase(KCWeaponMod.VERSION))
					this.btnKCWMVers.displayString = "Current";
			}
		}
		else if (guibutton.id == this.btnDownload.id)
		{
			for (KCWMUpdateInfo kcwm : KCWMVersions)
			{
				if (!this.btnKCWMVers.displayString.equalsIgnoreCase("Current") && kcwm.Version.equalsIgnoreCase(this.btnKCWMVers.displayString) && !this.btnKCWMVers.displayString.equalsIgnoreCase(KCWeaponMod.VERSION))
				{
					DownloadUpdate(this.selectedMod.Version.equalsIgnoreCase(Halocraft.VERSION) ? null : this.selectedMod, kcwm);
					return;
				}
			}
			if (!this.selectedMod.Version.equalsIgnoreCase(Halocraft.VERSION))
			{
				DownloadUpdate(this.selectedMod, null);
				return;
			}
			this.btnDownload.displayString = "KCWM Version Not Found!";
		}
		else if (guibutton.id == this.btnChk4Update.id)
		{
			StartCheckForUpdate();
		}
		else if (guibutton.id == this.btnViewHcWeb.id)
		{//TODO: Turn into method & Add tool tip
			Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
			if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
				try {
					desktop.browse(new URL("http://halocraft.killerchief.net/").toURI());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		else if (guibutton.id == this.btnViewUpdateLog.id)
		{
			Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
			if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
				try {
					desktop.browse(new URL("http://halocraft.killerchief.net/versionlog").toURI());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
	 */
	@Override
	protected void keyTyped(char character, int keyid)
	{
		if (keyid == 1)//Escape key
		{
			if (this.parentScreen != null && this.parentScreen instanceof GuiScreen)
			{
				this.mc.displayGuiScreen((GuiScreen)this.parentScreen);
				//this.mc.setIngameFocus();
			}
			else
			{
				this.mc.displayGuiScreen((GuiScreen)null);
				this.mc.setIngameFocus();
			}
		}
	}

	private void StartCheckForUpdate()
	{
		if (!isUpdateCheckThreadRunning)
		{
			this.btnChk4Update.enabled = false;
			this.btnChk4Update.displayString = "Checking for Updates...";
			(new UpdateCheckThread(this)).start();
		}
	}

	public final class UpdateCheckThread extends Thread {

		final GuiUpdater mainThread;

		public UpdateCheckThread(GuiUpdater main)
		{
			super("HalocraftUpdateCheck");
			mainThread = main;
		}

		@Override
		public void run()
		{
			isUpdateCheckThreadRunning = true;

			System.out.println("Running Halocraft Update Check...");

			Document doc = null;

			try {
				doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new URL("http://halocraft.killerchief.net/update.xml").openStream());
				System.out.println("Successfully found, parsed and opened update XML doc");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println(e.getMessage());//likely connection timed out
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			}

			if (doc != null)
			{
				this.mainThread.versionList = new GuiSlotModVersionList(this.mainThread, null, 120);
				this.mainThread.versionList.registerScrollButtons(this.mainThread.buttonList, 7, 8);
				HalocraftVersions = null;
				KCWMVersions = null;

				doc.getDocumentElement().normalize();

				NodeList mods = doc.getElementsByTagName("mod");

				for (int i = 0; i < mods.getLength(); i++)
				{
					Node mod = mods.item(i);
					if (mod.hasAttributes() && mod.getAttributes().getNamedItem("modid") != null)
					{
						if (mod.getAttributes().getNamedItem("modid").getNodeValue().equalsIgnoreCase(Halocraft.MODID))
						{
							System.out.println("Found Halocraft Tag");
							if (mod.getNodeType() == Node.ELEMENT_NODE)
							{
								NodeList mcversions = ((Element)mod).getElementsByTagName("mc");
								for (int j = 0; j < mcversions.getLength(); j++)
								{
									Node mcversion = mcversions.item(j);
									if (mcversion.hasAttributes() && mcversion.getAttributes().getNamedItem("version") != null)
									{
										if (mcversion.getAttributes().getNamedItem("version").getNodeValue().equalsIgnoreCase(Loader.MC_VERSION))
										{
											System.out.println("Found "+Loader.MC_VERSION+" Mod Version");
											if (mod.getNodeType() == Node.ELEMENT_NODE)
											{
												NodeList modversions = ((Element)mcversion).getElementsByTagName("release");
												HalocraftVersions = new HcUpdateInfo[modversions.getLength()];
												for (int k = 0; k < modversions.getLength(); k++)
												{
													Element modversion = (Element) modversions.item(k);

													HcUpdateInfo info = new HcUpdateInfo();
													
													if (Halocraft.VERSION.equalsIgnoreCase(info.Version))
													{
														VersionCompat = info.ForgeVersion;
													}

													info.Version = modversion.getAttribute("version");
													info.ForgeVersion = modversion.getAttribute("forge");
													info.KCWMVersion = modversion.getAttribute("kcwm");
													info.Ping = modversion.getAttribute("ping");
													info.DL = modversion.getAttribute("dl");

													HalocraftVersions[k] = info;
													System.out.println("Added Halocraft v"+info.Version+" to list");
												}
											}
										}
									}
								}
							}
						}
						else if (mod.getAttributes().getNamedItem("modid").getNodeValue().equals(KCWeaponMod.MODID))
						{
							System.out.println("Found KC's Weapon Mod Tag");
							if (mod.getNodeType() == Node.ELEMENT_NODE)
							{
								NodeList mcversions = ((Element)mod).getElementsByTagName("mc");
								for (int j = 0; j < mcversions.getLength(); j++)
								{
									Node mcversion = mcversions.item(j);
									if (mcversion.hasAttributes() && mcversion.getAttributes().getNamedItem("version") != null)
									{
										if (mcversion.getAttributes().getNamedItem("version").getNodeValue().equalsIgnoreCase(Loader.MC_VERSION))
										{
											System.out.println("Found "+Loader.MC_VERSION+" Mod Version");
											if (mod.getNodeType() == Node.ELEMENT_NODE)
											{
												NodeList modversions = ((Element)mcversion).getElementsByTagName("release");
												KCWMVersions = new KCWMUpdateInfo[modversions.getLength()];
												for (int k = 0; k < modversions.getLength(); k++)
												{
													Element modversion = (Element) modversions.item(k);

													KCWMUpdateInfo info = new KCWMUpdateInfo();

													info.Version = modversion.getAttribute("version");
													info.ForgeVersion = modversion.getAttribute("forge");
													info.Ping = modversion.getAttribute("ping");
													info.DL = modversion.getAttribute("dl");

													KCWMVersions[k] = info;
													System.out.println("Added KCWM v"+info.Version+" to list");
												}
											}
										}
									}
								}
							}
						}
					}
				}

				if (HalocraftVersions == null)
				{
					System.out.println("No available versions of Halocraft were detected even though this version should be listed. Update check likely failed! Check Log!");
				}
				if (KCWMVersions == null)
				{
					System.out.println("No available versions of KC's Weapon Mod were detected even though this version should be listed. Update check likely failed! Check Log!");
				}

				System.out.println("End of Update Check and Processing");

				this.mainThread.versionList = new GuiSlotModVersionList(this.mainThread, HalocraftVersions, 120);
				this.mainThread.versionList.registerScrollButtons(this.mainThread.buttonList, 7, 8);
			}

			//try {
			/*} catch (IOException e) {
				if (e.getMessage() != null && e.getMessage().contains("Server returned HTTP response code: "))
				{
					System.err.println(e.getMessage());
					int error = Integer.parseInt(e.getMessage().substring(36, 39));
					if (error >= 400 && error <= 407)
					{
						System.err.println("Requested URL does NOT exist, has been disallowed, or is invalid.");
					}
					else if (error == 408)
					{
						System.err.println("Request Timeout: The server is likely overloaded at the moment, please try again later!");
					}
				}
				else
					e.printStackTrace();
			}*/

			isUpdateCheckThreadRunning = false;

			mainThread.btnChk4Update.enabled = true;
			mainThread.btnChk4Update.displayString = "Check for Updates";
		}
	}

	private void DownloadUpdate(HcUpdateInfo hc, KCWMUpdateInfo kc)
	{
		if (!isDownloadThreadRunning)
		{
			this.btnDownload.enabled = false;
			this.btnDownload.displayString = "Downloading...";
			(new DownloadThread(this, hc, kc)).start();
		}
	}

	public final class DownloadThread extends Thread {

		final GuiUpdater mainThread;
		HcUpdateInfo HcUpdate;
		KCWMUpdateInfo KCWMUpdate;

		public DownloadThread(GuiUpdater main, HcUpdateInfo hc, KCWMUpdateInfo kc)
		{
			super("HalocraftDownloadThread");
			mainThread = main;
			HcUpdate = hc;
			KCWMUpdate = kc;
		}

		@Override
		public void run()
		{
			isDownloadThreadRunning = true;

			try {
				String TempLoc = System.getProperty("java.io.tmpdir")+"HalocraftUpdater\\";
				new File(TempLoc).mkdirs();
				System.out.println(TempLoc+HcUpdate.DL.substring(HcUpdate.DL.lastIndexOf("/")+1));
				File newHc = null;
				File newKc = null;
				if (HcUpdate != null)
				{
					String HcName = HcUpdate.DL.substring(HcUpdate.DL.lastIndexOf("/")+1).replace("%20", " ").replace("%27", "\\'");
					if (!new File(TempLoc+HcName).exists())
					{
						this.pingDL(HcUpdate.Ping);
						this.download(HcUpdate.DL, TempLoc, HcName);
					}
					newHc = new File(TempLoc+HcName);
				}
				if (KCWMUpdate != null && !new File(TempLoc+KCWMUpdate.DL.substring(KCWMUpdate.DL.lastIndexOf("/")+1)).exists())
				{
					String KcName = KCWMUpdate.DL.substring(KCWMUpdate.DL.lastIndexOf("/")+1).replace("%20", " ").replace("%27", "\\'");
					if (!new File(TempLoc+KcName).exists())
					{
						this.pingDL(KCWMUpdate.Ping);
						this.download(KCWMUpdate.DL, TempLoc, KcName);
					}
					newKc = new File(TempLoc+KcName);
				}
				File currHc = null;
				File currKc = null;
				for (ModContainer mod : Loader.instance().getActiveModList())
				{
					if (mod.getModId().equalsIgnoreCase(Halocraft.MODID))
					{
						currHc = mod.getSource();
						System.out.println(currHc.getCanonicalPath());
					}
					else if (mod.getModId().equalsIgnoreCase(KCWeaponMod.MODID))
					{
						currKc = mod.getSource();
						System.out.println(currKc.getCanonicalPath());
					}
				}
				if (HcUpdate != null)
				{
					if (!newHc.exists())
					{
						mainThread.btnDownload.enabled = true;
						mainThread.btnDownload.displayString = "Hc DL Failed!";
						return;
					}
					else
					{
						System.out.println("Hc Success!");
					}
				}
				if (KCWMUpdate != null)
				{
					if (!newKc.exists())
					{
						mainThread.btnDownload.enabled = true;
						mainThread.btnDownload.displayString = "KCWM DL Failed!";
						return;
					}
					else
					{
						System.out.println("KCWM Success!");
					}
				}
				
				ZipFile zip = new ZipFile(currHc.getAbsolutePath());
				File installclass = new File(TempLoc+"/KCInstallMods.class");
				InputStream streaminstallclass = zip.getInputStream(zip.getEntry("KCInstallMods.class"));

				FileOutputStream fos = new FileOutputStream(installclass.getAbsolutePath());

				// Read bytes from URL to the local file
				byte[] buffer = new byte[4096];
				int bytesRead = 0;

				System.out.print("Extracting installer...");
				while ((bytesRead = streaminstallclass.read(buffer)) != -1) {
					System.out.print(".");	// Progress bar :)
					fos.write(buffer,0,bytesRead);
				}
				System.out.println("done!");

				// Close destination stream
				fos.close();
				streaminstallclass.close();
				zip.close();
				
				if (!installclass.exists())
				{
					System.err.println("Failed to extract installer.");
					return;
				}
				if (HcUpdate != null)
				{
					Files.copy(newHc, new File(currHc.getParentFile()+"/"+newHc.getName()));
					String cmdHc = (new StringBuilder()).append("java -classpath \""+installclass.getParentFile()+"\" KCInstallMods \""+currHc.getAbsolutePath()+"\" \""+newHc.getAbsolutePath()+"\"").toString();
					System.out.println(cmdHc);
	                Runtime.getRuntime().exec(cmdHc);
				}
				if (KCWMUpdate != null)
				{
					Files.copy(newKc, new File(currKc.getParentFile()+"/"+newKc.getName()));
					String cmdKc = (new StringBuilder()).append("java -classpath \""+installclass.getParentFile()+"\" KCInstallMods \""+currKc.getAbsolutePath()+"\" \""+newKc.getAbsolutePath()+"\"").toString();
	                System.out.println(cmdKc);
	                Runtime.getRuntime().exec(cmdKc);
				}
				
				mainThread.mc.shutdown();
				
			} catch (IOException e) {
				if (e.getMessage() != null && e.getMessage().contains("Server returned HTTP response code: "))
				{
					System.err.println(e.getMessage());
					int error = Integer.parseInt(e.getMessage().substring(36, 39));
					if (error >= 400 && error <= 407)
					{
						System.err.println("Requested URL does NOT exist, has been disallowed, or is invalid.");
					}
					else if (error == 408)
					{
						System.err.println("Request Timeout: The server is likely overloaded at the moment, please try again later!");
					}
				}
				else
					e.printStackTrace();
			}

			isDownloadThreadRunning = false;

			mainThread.btnDownload.enabled = false;
			mainThread.btnDownload.displayString = "Downloaded!";
		}

		private void pingDL(String pageURL) throws IOException
		{
			// Open a connection to the page.
			URL url = new URL(pageURL);
			InputStream is = url.openStream();
			// Close the connection.
			is.close();
		}

		/**
		 * Method downloads file from URL to a given directory.
		 * @param fileURL	- 	file URL to download
		 * @param destinationDirectory	- directory to download file to
		 * @throws IOException
		 */
		private void download(String fileURL, String destinationDirectory, String newName) throws IOException {
			// File name that is being downloaded
			//String downloadedFileName = fileURL.substring(fileURL.lastIndexOf("/")+1).replace("%20", " ").replace("%27", "\\'");
			//downloadedFileName = downloadedFileName.replace("%20", " ").replace("%27", "\\'");

			// Open connection to the file
			URL url = new URL(fileURL);
			InputStream is = url.openStream();
			// Stream to the destionation file
			FileOutputStream fos = new FileOutputStream(destinationDirectory + "/" + newName);

			// Read bytes from URL to the local file
			byte[] buffer = new byte[4096];
			int bytesRead = 0;

			System.out.print("Downloading " + newName);
			while ((bytesRead = is.read(buffer)) != -1) {
				System.out.print(".");	// Progress bar :)
				fos.write(buffer,0,bytesRead);
			}
			System.out.println("done!");

			// Close destination stream
			fos.close();
			// Close URL stream
			is.close();
		}
	}
}
