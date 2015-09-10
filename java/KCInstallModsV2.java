import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class KCInstallModsV2 {

	private static String textToPrint = "";

	private static void print(String text)
	{
		textToPrint += text+"\n";
		//System.out.println();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Halocraft Mod Installer");

		final SpringLayout layout = new SpringLayout();

		final JPanel panel = new JPanel(layout);
		panel.setPreferredSize(new Dimension(500, 300));

		JTextArea txtAddress = new JTextArea();
		txtAddress.setBorder(BorderFactory.createLineBorder(Color.black));
		txtAddress.setLineWrap(false);
		//txtAddress.setWrapStyleWord(true);

		doInstall(args);
		txtAddress.setText(textToPrint);

		JScrollPane scrollPane = new JScrollPane(txtAddress, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(500, 300));
		panel.add(scrollPane);

		layout.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, panel);

		JOptionPane.showConfirmDialog(frame, panel, "Halocraft Mod Installer", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE);

		//End
	}

	private static void doInstall(String[] args)
	{
		if (args.length > 1)
		{
			try {
				Thread.sleep(4000L);

				File currMod = new File(args[0]);
				File newMod = new File(args[1]);

				print("Current Install: "+currMod.getAbsolutePath());
				print("New Install: "+newMod.getAbsolutePath());

				int attempts = 0;
				while (attempts >= 0)
				{
					if (currMod.isFile()) {
						if (currMod.delete())
						{
							print("- Successfully Deleted Old Mod!\n- Update Success!");
							break;
						}
					} else {
						attempts = 11;
					}
					if (attempts > 10)
					{
						print("ERROR: Update Failed! Unable to Delete Old/Current Mod!");
						print("ERROR: Reverting changes and removing proposed replacement mod from install directory.");
						if (newMod.isFile() && !newMod.delete()) {
							Thread.sleep(4000L);
							if (!newMod.delete())
								print("WARNING! Failed to revert changes! Manual deletion/check may be required.");
						}
						return;
					}
					attempts++;
					Thread.sleep(4000L);
				}
			} catch (InterruptedException e1) {
				print(e1.getMessage());
				//e1.printStackTrace();
			}
		}
		else
		{
			print("ERROR: Not Enough Input Arguments!");
		}
	}
}
