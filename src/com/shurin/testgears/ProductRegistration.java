package com.shurin.testgears;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
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
import javax.swing.UIManager;

public class ProductRegistration extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txtFbsbv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductRegistration frame = new ProductRegistration();
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
	public ProductRegistration() {
		setTitle("G.I.R.S. Product Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(AddInfo.class
				.getResource("/com/shurin/testgears/new girs2.jpg")));
		image.setBounds(301, 50, 231, 105);
		contentPane.add(image);

		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProductName.setBounds(51, 169, 85, 14);
		contentPane.add(lblProductName);

		JLabel lblProductID = new JLabel("Product ID:");
		lblProductID.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProductID.setBounds(509, 169, 64, 14);
		contentPane.add(lblProductID);

		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLocation.setBounds(299, 169, 66, 14);
		contentPane.add(lblLocation);

		JLabel lblOwners = new JLabel("Owners:");
		lblOwners.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOwners.setBounds(51, 212, 48, 14);
		contentPane.add(lblOwners);

		JLabel lblOwnership = new JLabel("Ownership:");
		lblOwnership.setFont(new Font("Dialog", Font.BOLD, 12));
		lblOwnership.setBounds(299, 212, 66, 14);
		contentPane.add(lblOwnership);

		JLabel lblAvailableAmount = new JLabel("Available Amount:");
		lblAvailableAmount.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAvailableAmount.setBounds(51, 359, 105, 14);
		contentPane.add(lblAvailableAmount);

		JLabel lblCurrentProduction = new JLabel("Current Production:");
		lblCurrentProduction.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCurrentProduction.setBounds(51, 418, 114, 14);
		contentPane.add(lblCurrentProduction);

		JLabel lblQuater = new JLabel("Quarter:");
		lblQuater.setFont(new Font("Dialog", Font.BOLD, 12));
		lblQuater.setBounds(245, 418, 64, 14);
		contentPane.add(lblQuater);

		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Dialog", Font.BOLD, 12));
		lblYear.setBounds(383, 418, 29, 14);
		contentPane.add(lblYear);

		textField = new JTextField();
		textField.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField.setBounds(146, 166, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(364, 166, 135, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(51, 237, 200, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(51, 268, 200, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(51, 299, 200, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(51, 330, 200, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(299, 237, 200, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(299, 268, 200, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(299, 299, 200, 20);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(299, 330, 200, 20);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(51, 384, 116, 20);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(51, 443, 116, 20);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(245, 443, 116, 20);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(383, 443, 116, 20);
		contentPane.add(textField_13);

		txtFbsbv = new JTextField();
		txtFbsbv.setHorizontalAlignment(SwingConstants.CENTER);
		txtFbsbv.setText("F5B1S42BV");
		txtFbsbv.setEditable(false);
		txtFbsbv.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		txtFbsbv.setColumns(10);
		txtFbsbv.setBounds(583, 166, 122, 20);
		contentPane.add(txtFbsbv);

		JButton btnCancel = new JButton("Reset");
		btnCancel.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnCancel.setBounds(685, 516, 89, 23);
		contentPane.add(btnCancel);

		JButton btnAccept = new JButton("Add Entry");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Entry made for Product ID: F5B1S42BV", "Sent for Review", 1);
			}
		});
		btnAccept.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnAccept.setBounds(589, 516, 89, 23);
		contentPane.add(btnAccept);

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
