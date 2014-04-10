package com.shurin.testgears;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class AddInfo extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldPoB;
	private JTextField textFieldHairColor;
	private JTextField textFieldEyeColor;
	private JTextField txtJosm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddInfo frame = new AddInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AddInfo() {
		addKeyListener(new Keyboard());
		setFocusable(true);
		setTitle("G.I.R.S. Add Entry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(AddInfo.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		image.setBounds(301, 50, 231, 105);
		contentPane.add(image);

		textFieldFirstName = new JTextField();
		textFieldFirstName.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldFirstName.setBounds(197, 176, 280, 22);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);

		textFieldLastName = new JTextField();
		textFieldLastName.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldLastName.setBounds(197, 209, 280, 22);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(10);

		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldAddress.setBounds(197, 242, 280, 22);
		contentPane.add(textFieldAddress);
		textFieldAddress.setColumns(10);

		textFieldPoB = new JTextField();
		textFieldPoB.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldPoB.setBounds(197, 310, 280, 22);
		contentPane.add(textFieldPoB);
		textFieldPoB.setColumns(10);

		textFieldHairColor = new JTextField();
		textFieldHairColor.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldHairColor.setBounds(197, 343, 100, 22);
		contentPane.add(textFieldHairColor);
		textFieldHairColor.setColumns(10);

		textFieldEyeColor = new JTextField();
		textFieldEyeColor.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldEyeColor.setBounds(387, 343, 90, 22);
		contentPane.add(textFieldEyeColor);
		textFieldEyeColor.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFirstName.setBounds(99, 176, 72, 16);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLastName.setBounds(99, 209, 72, 16);
		contentPane.add(lblLastName);

		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDateOfBirth.setBounds(99, 280, 88, 16);
		contentPane.add(lblDateOfBirth);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAddress.setBounds(99, 243, 72, 14);
		contentPane.add(lblAddress);

		JLabel lblPlaceOfBirth = new JLabel("Place of Birth:");
		lblPlaceOfBirth.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPlaceOfBirth.setBounds(99, 314, 88, 14);
		contentPane.add(lblPlaceOfBirth);

		JLabel lblHairColor = new JLabel("Hair Color:");
		lblHairColor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHairColor.setBounds(99, 347, 60, 14);
		contentPane.add(lblHairColor);

		JLabel lblEyeColor = new JLabel("Eye Color:");
		lblEyeColor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEyeColor.setBounds(324, 347, 56, 14);
		contentPane.add(lblEyeColor);

		JLabel lblBloodType = new JLabel("Blood Type:");
		lblBloodType.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBloodType.setBounds(487, 347, 66, 14);
		contentPane.add(lblBloodType);

		JLabel lblCIN = new JLabel("C.I.N.:");
		lblCIN.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCIN.setBounds(487, 180, 33, 14);
		contentPane.add(lblCIN);

		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBoxMonth.setBounds(197, 278, 63, 20);
		contentPane.add(comboBoxMonth);

		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setModel(new DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBoxDay.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		comboBoxDay.setBounds(270, 278, 47, 20);
		contentPane.add(comboBoxDay);

		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] { "Year", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901",
				"1900" }));
		comboBoxYear.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		comboBoxYear.setBounds(327, 278, 53, 20);
		contentPane.add(comboBoxYear);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));
		comboBox.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		comboBox.setBounds(563, 345, 49, 20);
		contentPane.add(comboBox);

		JButton btnCancel = new JButton("Reset");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldFirstName.setText("");
			}
		});
		btnCancel.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnCancel.setBounds(706, 497, 89, 23);
		contentPane.add(btnCancel);

		JButton btnAccept = new JButton("Add Entry");
		btnAccept.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnAccept.setBounds(596, 497, 89, 23);
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Entry made for Person C.I.N.: A726446819", "Sent for Review", 1);
			}
		});
		contentPane.add(btnAccept);

		txtJosm = new JTextField();
		txtJosm.setHorizontalAlignment(SwingConstants.CENTER);
		txtJosm.setText("A726446819");
		txtJosm.setEditable(false);
		txtJosm.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		txtJosm.setBounds(530, 176, 155, 22);
		contentPane.add(txtJosm);
		txtJosm.setColumns(10);

		JMenuBar bar = new JMenuBar();
		bar.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setJMenuBar(bar);

		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenu help = new JMenu("Search");
		help.setMnemonic('S');

		bar.add(file);
		bar.add(help);

		JMenuItem mntmSearchEntries = new JMenuItem("Search Entries");
		mntmSearchEntries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Search.main(null);
			}
		});
		help.add(mntmSearchEntries);

		JMenuItem login = new JMenuItem("Back to Login");
		login.setMnemonic('L');
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginTest.main(null);
			}
		});

		file.add(login);

		JMenuItem mntmOpenAddinfo = new JMenuItem("Add New Person");
		mntmOpenAddinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				AddInfo.main(null);
			}
		});
		file.add(mntmOpenAddinfo);

		JMenuItem mntmOpenProductregistration = new JMenuItem("Add New Product");
		mntmOpenProductregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ProductRegistration.main(null);
			}
		});

		JMenuItem mntmReviewNewPerson = new JMenuItem("Review New Person");
		mntmReviewNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Review1.main(null);
			}
		});
		file.add(mntmReviewNewPerson);
		file.add(mntmOpenProductregistration);

		JMenuItem mntmReviewNewProduct = new JMenuItem("Review New Product");
		mntmReviewNewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Review2.main(null);
			}
		});
		file.add(mntmReviewNewProduct);
	}
}
