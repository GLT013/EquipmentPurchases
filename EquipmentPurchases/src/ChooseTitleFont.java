import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;


public class ChooseTitleFont {

	public static JFrame frmSelectFont;
	private static JComboBox titleFontName;
	private static JTextField textField;
	private static ButtonGroup group;
	private static ButtonGroup group1;
	private static JRadioButton rdbtnPlain;
	private static JRadioButton rdbtnBold;
	private static JRadioButton rdbtnItalic;
	private static JComboBox titleSize;
	private static JButton button;
	private static Color color;
	public static String font = "#000000";
	private static JPanel panel;
	private JButton btnCancel;
	private JButton btnSave;
	public static int fontweight;
	public static String TitleFont;
	public static String TitleSize;
	public static String TitleColor;
	public static int TitleWeight;
	public static boolean firstrun = true;
	private JButton button_1;
	/**
	 * Launch the application.
	 */

	public static void run() {
		try {
			if (firstrun == true)
			{
			ChooseTitleFont window = new ChooseTitleFont();
			window.frmSelectFont.setVisible(true);		
			
			textField.setForeground(color.black);
			textField.setFont(new Font("Abadi MT Condensed Light", Font.PLAIN, 16));
			textField.setText("Abadi MT Condensed Light");
				firstrun = false;
			}
			else
			{
				frmSelectFont.setBounds(ReportGUI.frmReportGenerator.getX() + 150,ReportGUI.frmReportGenerator.getY() + 150, 386, 344);
				frmSelectFont.show(true);
			}
			} catch (Exception e) {
				e.printStackTrace();
		}

	}

	/**
	 * Create the application.
	 */
	public ChooseTitleFont() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectFont = new JFrame();
		frmSelectFont.setResizable(false);
		frmSelectFont.setState(Frame.NORMAL);
		frmSelectFont.toFront();
		frmSelectFont.getContentPane().setBackground(Color.WHITE);
		frmSelectFont.setTitle("Select Title Font");
		frmSelectFont.setBounds(ReportGUI.frmReportGenerator.getX() + 150,ReportGUI.frmReportGenerator.getY() + 150, 386, 344);
		frmSelectFont.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSelectFont.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		scrollPane.setBounds(6, 120, 366, 90);
		frmSelectFont.getContentPane().add(scrollPane);
		
		textField = new JTextField();
		scrollPane.setViewportView(textField);
		textField.setBackground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setOpaque(true);
		textField.setBorder(null);
		
		group = new ButtonGroup();
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 11, 366, 98);
		frmSelectFont.getContentPane().add(panel);
		panel.setLayout(null);
		
		titleFontName = new JComboBox<Object>();
		titleFontName.setEnabled(false);
		titleFontName.setBounds(13, 9, 207, 22);
		panel.add(titleFontName);
		titleFontName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FontBox();
			}
		});
		titleFontName.setModel(new DefaultComboBoxModel<Object>(new String[] {"Abadi MT Condensed Light", "Albertus Extra Bold", "Albertus Medium", "Antique Olive", "Arial", "Arial Black", "Arial MT", "Arial Narrow", "Bazooka", "Book Antiqua", "Bookman Old Style", "Boulder", "Calisto MT", "Calligrapher", "Century Gothic", "Century Schoolbook", "Cezanne", "CG Omega", "CG Times", "Charlesworth", "Chaucer", "Clarendon Condensed", "Comic Sans MS", "Copperplate Gothic Bold", "Copperplate Gothic Light", "Cornerstone", "Coronet", "Courier", "Courier New", "Cuckoo", "Dauphin", "Denmark", "Fransiscan", "Garamond", "Geneva", "Haettenschweiler", "Heather", "Helvetica", "Herald", "Impact", "Jester", "Letter Gothic", "Lithograph", "Lithograph Light", "Long Island", "Lucida Console", "Lucida Handwriting", "Lucida Sans", "Lucida Sans Unicode", "Marigold", "Market", "Matisse ITC", "MS LineDraw", "News GothicMT", "OCR A Extended", "Old Century", "Pegasus", "Pickwick", "Poster", "Pythagoras", "Sceptre", "Sherwood", "Signboard", "Socket", "Steamer", "Storybook", "Subway", "Tahoma", "Technical", "Teletype", "Tempus Sans ITC", "Times", "Times New Roman", "Times New Roman PS", "Trebuchet MS", "Tristan", "Tubular", "Unicorn", "Univers", "Univers Condensed", "Vagabond", "Verdana", "Westminster "}));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(11, 38, 207, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		rdbtnPlain = new JRadioButton("Plain");
		rdbtnPlain.setBackground(Color.WHITE);
		rdbtnPlain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FontBox();
			}
		});
		rdbtnPlain.setBounds(9, 6, 57, 23);
		rdbtnPlain.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(rdbtnPlain);
		
		rdbtnBold = new JRadioButton("Bold");
		rdbtnBold.setSelected(true);
		rdbtnBold.setBackground(Color.WHITE);
		rdbtnBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FontBox();
			}
		});
		rdbtnBold.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnBold.setBounds(71, 6, 51, 23);
		panel_1.add(rdbtnBold);
		
		rdbtnItalic = new JRadioButton("Italic");
		rdbtnItalic.setBackground(Color.WHITE);
		rdbtnItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FontBox();
			}
		});
		rdbtnItalic.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnItalic.setBounds(135, 6, 57, 23);
		panel_1.add(rdbtnItalic);
		group.add(rdbtnPlain);
		group.add(rdbtnBold);
		group.add(rdbtnItalic);
		
		button = new JButton("");
		button.setBounds(236, 46, 27, 23);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = JColorChooser.showDialog(null, "Select Font Color", color);
				if (color != null)
				{
				button.setBackground(color);
				font = Integer.toHexString(color.getRGB());
				font = "#" + font.substring(2, font.length());
				}
				FontBox();
			}
		});
		button.setBackground(Color.BLACK);
		
		titleSize = new JComboBox<Object>();		
		titleSize.setBounds(242, 9, 57, 22);
		panel.add(titleSize);
		titleSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FontBox();
			}
		});
		titleSize.setModel(new DefaultComboBoxModel<Object>(new String[] {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"}));
		titleSize.setSelectedIndex(6);
		
		JLabel label = new JLabel("Font Color");
		label.setBounds(268, 51, 73, 14);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		btnCancel = new JButton("");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSelectFont.dispose();
				firstrun = true;
				
			}
		});
		btnCancel.setIcon(new ImageIcon(ChooseTitleFont.class.getResource("/067861-3d-glossy-blue-orb-icon-alphanumeric-crossing_85x85.png")));
		btnCancel.setToolTipText("Cancel");
		btnCancel.setOpaque(false);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setBorderPainted(false);
		btnCancel.setBounds(16, 221, 85, 85);
		frmSelectFont.getContentPane().add(btnCancel);
		
		btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TitleFont = titleFontName.getSelectedItem().toString();
				TitleSize = titleSize.getSelectedItem().toString();
				TitleColor = font;
				TitleWeight = fontweight;
				frmSelectFont.show(false);
				ReportGUI.PreviewPane();
			}
		});
		btnSave.setIcon(new ImageIcon(ChooseTitleFont.class.getResource("/075748-3d-glossy-blue-orb-icon-business-diskette-save_85x85.png")));
		btnSave.setToolTipText("Save");
		btnSave.setOpaque(false);
		btnSave.setContentAreaFilled(false);
		btnSave.setBorderPainted(false);
		btnSave.setBounds(283, 221, 85, 85);
		frmSelectFont.getContentPane().add(btnSave);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TitleReset();
			}
		});
		button_1.setIcon(new ImageIcon(ChooseTitleFont.class.getResource("/075834-3d-glossy-blue-orb-icon-business-magic-wand_85x85.png")));
		button_1.setSelectedIcon(new ImageIcon(ChooseTitleFont.class.getResource("/075834-3d-glossy-blue-orb-icon-business-magic-wand_85x85.png")));
		button_1.setToolTipText("Reset Title");
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(148, 221, 85, 85);
		frmSelectFont.getContentPane().add(button_1);
		
		group1 = new ButtonGroup();

		
		
	}

	private static void TitleReset()
	{
		titleFontName.setSelectedIndex(0);
		color = color.black;
		font = "#000000";
		button.setBackground(color.black);
		titleSize.setSelectedIndex(6);		
		String fontname = "Abadi MT Condensed Light";
		String tmp = "16";		
		int fontSize = Integer.parseInt(tmp);
		rdbtnBold.setSelected(true);
		if (rdbtnBold.isSelected())
		{
			fontweight = Font.BOLD;
		}
		
		textField.setForeground(color.black);

		textField.setFont(new Font(fontname, fontweight, fontSize));
		textField.setText(fontname);
	}
	
	private static void FontBox()
	{
		String fontname = titleFontName.getSelectedItem().toString();
		String tmp = titleSize.getSelectedItem().toString();
		int fontSize = Integer.parseInt(tmp);
		
		if (rdbtnPlain.isSelected())
		{
			fontweight = Font.PLAIN;
		}
		else if (rdbtnBold.isSelected())
		{
			fontweight = Font.BOLD;
		}
		else
		{
			fontweight = Font.ITALIC;
		}	
		textField.setForeground(color);

		textField.setFont(new Font(fontname, fontweight, fontSize));
		textField.setText(fontname);
		
		
		
		
	}
	
}
