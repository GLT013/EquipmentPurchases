import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;


public class MainMenuGUI {

	public static JFrame frmEquipmentPurchases;
	public static String version = "v 1.0.6";
	public static boolean firstrun = true; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainMenuGUI window = new MainMenuGUI();
					window.frmEquipmentPurchases.setVisible(true);
					firstrun = false;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Run the Main Menu GUI
	 */
	
	public static void run() {
		try {
			if ((firstrun == false) && (ReportGUI.ReportGUI == true))	
			{
				frmEquipmentPurchases.setVisible(true);
				frmEquipmentPurchases.setLocationRelativeTo(ReportGUI.frmReportGenerator);
				
			}
			else if ((firstrun == false) && (QuickLookUpGUI.QuickLookUp == true))
			{
				frmEquipmentPurchases.setVisible(true);				
				frmEquipmentPurchases.setLocationRelativeTo(QuickLookUpGUI.frmQuickLookupGUI);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public MainMenuGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Main Frame
		frmEquipmentPurchases = new JFrame();
		frmEquipmentPurchases.setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuGUI.class.getResource("/075794-3d-glossy-blue-orb-icon-business-gears1-sc44_43x43.png")));
		frmEquipmentPurchases.setTitle("Main Menu");
		frmEquipmentPurchases.setBounds(0,0,410, 304);
		frmEquipmentPurchases.setResizable(false);
		frmEquipmentPurchases.setLocationRelativeTo(null);
		frmEquipmentPurchases.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEquipmentPurchases.getContentPane().setLayout(null);
		
		//Quick Lookup Button
		JButton btnQuickLookup = new JButton("Quick Lookup");
		btnQuickLookup.setBounds(108, 20, 187, 71);
		frmEquipmentPurchases.getContentPane().add(btnQuickLookup);
		btnQuickLookup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmEquipmentPurchases.dispose();
				QuickLookUpGUI.run();				
			}
		});
		
		
		//Report Generator Button
		JButton btnReportGenerator = new JButton("Report Generator");
		btnReportGenerator.setBounds(108, 120, 187, 71);
		frmEquipmentPurchases.getContentPane().add(btnReportGenerator);		
		btnReportGenerator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmEquipmentPurchases.dispose();
				ReportGUI.run();
			}
		});

		//EN Engineering Logo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("EN Engineering");
		lblNewLabel.setIcon(new ImageIcon(MainMenuGUI.class.getResource("/enengineering_transparent_222x33.png")));
		lblNewLabel.setBounds(10, 215, 248, 31);
		frmEquipmentPurchases.getContentPane().add(lblNewLabel);
		
		//Version Number
		JLabel lblV = new JLabel("");
		lblV.setText(MainMenuGUI.version);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setBounds(338, 232, 54, 14);
		frmEquipmentPurchases.getContentPane().add(lblV);
		
		//Menubar for Main Menu
		JMenuBar menuBar = new JMenuBar();
		frmEquipmentPurchases.setJMenuBar(menuBar);		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);		
		JMenuItem mntmDatabase = new JMenuItem("Database");
		mntmDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				DatabaseSettings.run();
			}
		});
		mnSettings.add(mntmDatabase);
	}
}
