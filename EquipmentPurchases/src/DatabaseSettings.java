import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;


public class DatabaseSettings {

	private JFrame frmDatabaseSettings;
	private static JTextField textField;
	public static String filepath = "\\\\jackal\\public\\Megan\\Purchase Orders\\Temp3.accdb";
	/**
	 * Launch the application.
	 */
	
			public static void run() {
				try {
					DatabaseSettings window = new DatabaseSettings();
					window.frmDatabaseSettings.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the application.
	 */
	public DatabaseSettings() {
		initialize();
	}
	
	public static void BrowseDB()
	{
		//textField.setText("\\\\jackal\\public\\Megan\\Purchase Orders\\Temp.accdb");
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("Select Database");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "ACCDB", "ACCDB");
		jfc.setFileFilter(filter);
		
		int result = jfc.showOpenDialog(jfc);
		if (result == JFileChooser.CANCEL_OPTION)
		{
		    return;
		}	
		
		File file = jfc.getSelectedFile();				
		filepath = file.getAbsolutePath();
		textField.setText(filepath);
		
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDatabaseSettings = new JFrame();
		frmDatabaseSettings.setTitle("Database Settings");
		frmDatabaseSettings.setBounds(0, 0, 388, 138);
		frmDatabaseSettings.setResizable(false);
		frmDatabaseSettings.setLocationRelativeTo(null);
		frmDatabaseSettings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDatabaseSettings.getContentPane().setLayout(null);
		frmDatabaseSettings.setAlwaysOnTop(true);
		JButton btnBrowse = new JButton("Browse...");
		btnBrowse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmDatabaseSettings.setAlwaysOnTop(false);
				BrowseDB();
			}
		});
		btnBrowse.setBounds(262, 27, 103, 31);
		frmDatabaseSettings.getContentPane().add(btnBrowse);
		
		textField = new JTextField();
		textField.setBounds(12, 34, 232, 20);
		frmDatabaseSettings.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAccessDatabaseLocation = new JLabel("Access Database Location");
		lblAccessDatabaseLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccessDatabaseLocation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAccessDatabaseLocation.setBounds(12, 9, 232, 14);
		frmDatabaseSettings.getContentPane().add(lblAccessDatabaseLocation);
		
		JButton btnSaveSettings = new JButton("Save Settings");
		btnSaveSettings.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmDatabaseSettings.dispose();				
				ConnectToAccess.Connect(filepath);
				//MainMenuGUI.run();
			}
		});
		btnSaveSettings.setBounds(125, 73, 119, 31);
		frmDatabaseSettings.getContentPane().add(btnSaveSettings);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmDatabaseSettings.dispose();
				//MainMenuGUI.run();
			}
		});
		btnCancel.setBounds(12, 73, 103, 31);
		frmDatabaseSettings.getContentPane().add(btnCancel);
	}
}
