import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;


public class MainMenuGUI {

	public static JFrame frmEquipmentPurchases;

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void run() {
		try {
			MainMenuGUI window = new MainMenuGUI();
			window.frmEquipmentPurchases.setVisible(true);			
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
				
		frmEquipmentPurchases = new JFrame();
		frmEquipmentPurchases.setResizable(false);
		frmEquipmentPurchases.setTitle("Main Menu");		
		//frmEquipmentPurchases.setBounds(0,0, 460, 242);
		frmEquipmentPurchases.setSize(460, 242);
		frmEquipmentPurchases.setLocationRelativeTo(null);
		frmEquipmentPurchases.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEquipmentPurchases.setJMenuBar(menuBar);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem mntmDatabase = new JMenuItem("Database");
		mntmDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "Database Settings unavailable in demo mode");
			}
		});
		mnSettings.add(mntmDatabase);
		frmEquipmentPurchases.getContentPane().setLayout(new MigLayout("", "[294.00,grow][110px,grow,right]", "[grow 90][60.00px,grow 10,center][60.00px,grow -100,top][42.00,grow,bottom]"));
		
		JButton btnQuickLookup = new JButton("Quick Lookup");
		frmEquipmentPurchases.getContentPane().add(btnQuickLookup, "cell 0 1,width 150!,alignx right,height 55!,aligny center");
		btnQuickLookup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmEquipmentPurchases.dispose();
				QuickLookUpGUI.run();
				
			}
		});
		
		JButton btnReportGenerator = new JButton("Report Generator");
		frmEquipmentPurchases.getContentPane().add(btnReportGenerator, "cell 0 2,width 150!,alignx right,height 55!,aligny center");
		btnReportGenerator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmEquipmentPurchases.setLocationRelativeTo(ReportGUI.frmReportGenerator);
				frmEquipmentPurchases.dispose();
				ReportGUI.run();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		frmEquipmentPurchases.getContentPane().add(lblNewLabel, "cell 0 3,alignx left,aligny bottom");
		lblNewLabel.setToolTipText("EN Engineering");
		lblNewLabel.setIcon(new ImageIcon(MainMenuGUI.class.getResource("/enengineering_transparent_222x33.png")));
		
		JLabel lblV = new JLabel("Demo v 1.0.5");
		frmEquipmentPurchases.getContentPane().add(lblV, "cell 1 3,alignx right,aligny bottom");
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
