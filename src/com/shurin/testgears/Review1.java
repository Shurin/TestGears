package com.shurin.testgears;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Review1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldPoB;
	private JTextField textFieldHairColor;
	private JTextField textFieldEyeColor;
	private JTextField txtJosm;
	private JTextField textFieldMonth;
	private JTextField textFieldDay;
	private JTextField textFieldYear;
	private JTextField textFieldBloodType;
	private JTextField textFieldDepartmantA;
	private JTextField textFieldDepartmantB, textFieldDapartmentC, textFieldDepartmentD;
	private JButton btnAccept;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Review1 frame = new Review1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void ClearFields() {
		textFieldFirstName.setText("");
		textFieldLastName.setText("");
		textFieldAddress.setText("");
		textFieldPoB.setText("");
		textFieldHairColor.setText("");
		textFieldEyeColor.setText("");
		txtJosm.setText("");
		textFieldMonth.setText("");
		textFieldDay.setText("");
		textFieldYear.setText("");
		textFieldBloodType.setText("");
		textFieldDepartmantA.setText("");
		textFieldDepartmantB.setText("");
		textFieldDapartmentC.setText("");
		textFieldDepartmentD.setText("");
	}

	/**
	 * Create the frame.
	 */
	public Review1() {
		setTitle("G.I.R.S. Review Entry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(AddInfo.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		image.setBounds(301, 50, 231, 105);
		contentPane.add(image);

		textFieldFirstName = new JTextField();
		textFieldFirstName.setEditable(false);
		textFieldFirstName.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldFirstName.setBounds(176, 269, 280, 22);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);

		textFieldLastName = new JTextField();
		textFieldLastName.setEditable(false);
		textFieldLastName.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldLastName.setBounds(176, 302, 280, 22);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(10);

		textFieldAddress = new JTextField();
		textFieldAddress.setEditable(false);
		textFieldAddress.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldAddress.setBounds(176, 335, 280, 22);
		contentPane.add(textFieldAddress);
		textFieldAddress.setColumns(10);

		textFieldPoB = new JTextField();
		textFieldPoB.setEditable(false);
		textFieldPoB.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldPoB.setBounds(176, 403, 280, 22);
		contentPane.add(textFieldPoB);
		textFieldPoB.setColumns(10);

		textFieldHairColor = new JTextField();
		textFieldHairColor.setEditable(false);
		textFieldHairColor.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldHairColor.setBounds(176, 436, 100, 22);
		contentPane.add(textFieldHairColor);
		textFieldHairColor.setColumns(10);

		textFieldEyeColor = new JTextField();
		textFieldEyeColor.setEditable(false);
		textFieldEyeColor.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldEyeColor.setBounds(366, 436, 90, 22);
		contentPane.add(textFieldEyeColor);
		textFieldEyeColor.setColumns(10);

		txtJosm = new JTextField();
		txtJosm.setHorizontalAlignment(SwingConstants.CENTER);
		txtJosm.setText("");
		txtJosm.setEditable(false);
		txtJosm.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		txtJosm.setBounds(503, 269, 155, 22);
		contentPane.add(txtJosm);
		txtJosm.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFirstName.setBounds(78, 272, 88, 16);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLastName.setBounds(78, 305, 88, 16);
		contentPane.add(lblLastName);

		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDateOfBirth.setBounds(78, 373, 88, 16);
		contentPane.add(lblDateOfBirth);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAddress.setBounds(78, 339, 88, 14);
		contentPane.add(lblAddress);

		JLabel lblPlaceOfBirth = new JLabel("Place of Birth:");
		lblPlaceOfBirth.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPlaceOfBirth.setBounds(78, 407, 88, 14);
		contentPane.add(lblPlaceOfBirth);

		JLabel lblHairColor = new JLabel("Hair Color:");
		lblHairColor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblHairColor.setBounds(78, 440, 88, 14);
		contentPane.add(lblHairColor);

		JLabel lblEyeColor = new JLabel("Eye Color:");
		lblEyeColor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEyeColor.setBounds(303, 440, 56, 14);
		contentPane.add(lblEyeColor);

		JLabel lblBloodType = new JLabel("Blood Type:");
		lblBloodType.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBloodType.setBounds(466, 440, 66, 14);
		contentPane.add(lblBloodType);

		JLabel lblCIN = new JLabel("C.I.N.:");
		lblCIN.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCIN.setBounds(466, 273, 33, 14);
		contentPane.add(lblCIN);

		textFieldMonth = new JTextField();
		textFieldMonth.setEditable(false);
		textFieldMonth.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldMonth.setColumns(10);
		textFieldMonth.setBounds(176, 370, 60, 22);
		contentPane.add(textFieldMonth);

		textFieldDay = new JTextField();
		textFieldDay.setEditable(false);
		textFieldDay.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldDay.setColumns(10);
		textFieldDay.setBounds(245, 370, 60, 22);
		contentPane.add(textFieldDay);

		textFieldYear = new JTextField();
		textFieldYear.setEditable(false);
		textFieldYear.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(315, 370, 60, 22);
		contentPane.add(textFieldYear);

		textFieldBloodType = new JTextField();
		textFieldBloodType.setEditable(false);
		textFieldBloodType.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldBloodType.setColumns(10);
		textFieldBloodType.setBounds(538, 436, 60, 22);
		contentPane.add(textFieldBloodType);

		JLabel lblDepartmentEntryCodes = new JLabel("Department Entry Codes:");
		lblDepartmentEntryCodes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentEntryCodes.setBounds(78, 187, 141, 16);
		contentPane.add(lblDepartmentEntryCodes);

		JLabel lblDepartmentA = new JLabel("Department A:");
		lblDepartmentA.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentA.setBounds(116, 214, 81, 16);
		contentPane.add(lblDepartmentA);

		JLabel lblDepartmentB = new JLabel("Department B:");
		lblDepartmentB.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentB.setBounds(245, 214, 81, 16);
		contentPane.add(lblDepartmentB);

		JLabel lblDepartmentC = new JLabel("Department C:");
		lblDepartmentC.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentC.setBounds(375, 214, 81, 16);
		contentPane.add(lblDepartmentC);

		JLabel lblDepartmentD = new JLabel("Department D:");
		lblDepartmentD.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentD.setBounds(503, 214, 81, 16);
		contentPane.add(lblDepartmentD);

		textFieldDepartmantA = new JTextField();
		textFieldDepartmantA.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldDepartmantA.setColumns(10);
		textFieldDepartmantA.setBounds(116, 236, 100, 22);
		contentPane.add(textFieldDepartmantA);

		textFieldDepartmantB = new JTextField();
		textFieldDepartmantB.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldDepartmantB.setColumns(10);
		textFieldDepartmantB.setBounds(245, 236, 100, 22);
		contentPane.add(textFieldDepartmantB);

		textFieldDapartmentC = new JTextField();
		textFieldDapartmentC.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldDapartmentC.setColumns(10);
		textFieldDapartmentC.setBounds(375, 236, 100, 22);
		contentPane.add(textFieldDapartmentC);

		textFieldDepartmentD = new JTextField();
		textFieldDepartmentD.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldDepartmentD.setColumns(10);
		textFieldDepartmentD.setBounds(503, 236, 100, 22);
		contentPane.add(textFieldDepartmentD);

		JButton btnCancel = new JButton("Reset");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnCancel.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnCancel.setBounds(668, 268, 89, 23);
		contentPane.add(btnCancel);

		btnAccept = new JButton("Check");
		btnAccept.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnAccept.setBounds(668, 234, 89, 23);
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean hasError = false;
				String message = "has unknown code.";
				if (!textFieldDepartmentD.getText().equalsIgnoreCase("A")) {
					hasError = true;
					message = " D " + message;
				}
				if (!textFieldDapartmentC.getText().equalsIgnoreCase("B")) {
					hasError = true;
					message = " C " + message;
				}
				if (!textFieldDepartmantB.getText().equalsIgnoreCase("C")) {
					hasError = true;
					message = " B " + message;
				}
				if (!textFieldDepartmantA.getText().equalsIgnoreCase("D")) {
					hasError = true;
					message = " A " + message;
				}
				if (!hasError) {
					btnAccept.setText("Accept");
					if (textFieldFirstName.getText().length() > 0) {
						int i = JOptionPane.showConfirmDialog(null, "Is the information below correct?", "Please Review", 1);
						if (i == 0) {
							// Save
							JOptionPane.showMessageDialog(null, "Entry #A726446819 added to the mainframe.", "Entry Made", 1);
							ClearFields();
						} 
						if (i == 1) {
							ClearFields();
							// Save
							JOptionPane.showMessageDialog(null, "No entry made.", "Canceled", 1);
						}
					} else {
						txtJosm.setText("A726446819"); // Imagine the data is 10...
						textFieldFirstName.setText("John"); // Imagine the data is 10...
						textFieldLastName.setText("Smith"); // Imagine the data is 10...
						textFieldAddress.setText("1234 Patterson Road"); // Imagine the data is 10...
						textFieldMonth.setText("10"); // Imagine the data is 10...
						textFieldDay.setText("10"); // Imagine the data is 10...
						textFieldYear.setText("2013"); // Imagine the data is 10...
						textFieldPoB.setText("Conakry, Guinea"); // Imagine the data is 10...
						textFieldHairColor.setText("Black"); // Imagine the data is 10...
						textFieldEyeColor.setText("Brown"); // Imagine the data is 10...
						textFieldBloodType.setText("B+"); // Imagine the data is 10...
					}
				} else {
					btnAccept.setText("Check");
					JOptionPane.showMessageDialog(null, message);
				}
			}
		});
		contentPane.add(btnAccept);

		JMenuBar bar = new JMenuBar();
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
