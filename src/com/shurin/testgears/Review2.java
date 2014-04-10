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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Review2 extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textFieldDepartmantA, textFieldDepartmantB, textFieldDapartmentC, textFieldDepartmentD, textFieldProductID, textFieldAvailableAmount, textFieldQuater, textFieldYear;
	private JButton btnAccept;

	public void ClearFields() {
		textFieldDepartmantA.setText("");
		textFieldDepartmantB.setText("");
		textFieldDapartmentC.setText("");
		textFieldDepartmentD.setText("");
		textFieldProductID.setText("");
		textFieldAvailableAmount.setText("");
		textFieldQuater.setText("");
		textFieldYear.setText("");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Review2 frame = new Review2();
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
	public Review2() {
		addKeyListener(new Keyboard());
		setFocusable(true);
		setTitle("G.I.R.S. Product Review");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(AddInfo.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		image.setBounds(301, 50, 231, 105);
		contentPane.add(image);

		JLabel lblDepartmentEntryCodes = new JLabel("Department Entry Codes:");
		lblDepartmentEntryCodes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDepartmentEntryCodes.setBounds(99, 187, 141, 16);
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

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnCancel.setBounds(658, 266, 89, 23);
		contentPane.add(btnCancel);

		btnAccept = new JButton("Check");
		btnAccept.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		btnAccept.setBounds(658, 236, 89, 23);
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
					if (textFieldAvailableAmount.getText().length() > 0) {
						int i = JOptionPane.showConfirmDialog(null, "Is the information below correct?", "Please Review", 1);
						if (i == 0) {
							// Save
							JOptionPane.showMessageDialog(null, "Entry #F5B1S42BV added to the mainframe.", "Entry Made", 1);
							ClearFields();
						}
						if (i == 1) {
							ClearFields();
							// Save
							JOptionPane.showMessageDialog(null, "No entry made.", "Canceled", 1);
						}
					} else {
						textFieldProductID.setText("F5B1S42BV"); // Imagine the data is 10...
						textFieldAvailableAmount.setText("197,830"); // Imagine the data is 10..
						textFieldQuater.setText("1st"); // Imagine the data is 10...
						textFieldYear.setText("2013"); // Imagine the data is 10...
					}
				} else {
					btnAccept.setText("Check");
					JOptionPane.showMessageDialog(null, message);
				}
			}
		});
		contentPane.add(btnAccept);

		JLabel lblProductID = new JLabel("Product ID:");
		lblProductID.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProductID.setBounds(116, 286, 64, 14);
		contentPane.add(lblProductID);

		textFieldProductID = new JTextField();
		textFieldProductID.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldProductID.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldProductID.setEditable(false);
		textFieldProductID.setColumns(10);
		textFieldProductID.setBounds(190, 283, 122, 20);
		contentPane.add(textFieldProductID);

		JLabel lblAvailableAmount = new JLabel("Available Amount:");
		lblAvailableAmount.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAvailableAmount.setBounds(116, 331, 105, 14);
		contentPane.add(lblAvailableAmount);

		textFieldAvailableAmount = new JTextField();
		textFieldAvailableAmount.setEditable(false);
		textFieldAvailableAmount.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldAvailableAmount.setColumns(10);
		textFieldAvailableAmount.setBounds(116, 356, 116, 20);
		contentPane.add(textFieldAvailableAmount);

		JLabel lblQuater = new JLabel("Quarter:");
		lblQuater.setFont(new Font("Dialog", Font.BOLD, 12));
		lblQuater.setBounds(245, 331, 50, 14);
		contentPane.add(lblQuater);

		textFieldQuater = new JTextField();
		textFieldQuater.setEditable(false);
		textFieldQuater.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldQuater.setColumns(10);
		textFieldQuater.setBounds(245, 356, 116, 20);
		contentPane.add(textFieldQuater);

		textFieldYear = new JTextField();
		textFieldYear.setEditable(false);
		textFieldYear.setFont(new Font("Eras Demi ITC", Font.PLAIN, 12));
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(375, 356, 116, 20);
		contentPane.add(textFieldYear);

		JLabel labelYear = new JLabel("Year:");
		labelYear.setFont(new Font("Dialog", Font.BOLD, 12));
		labelYear.setBounds(375, 331, 29, 14);
		contentPane.add(labelYear);

		new TopMenu(this);
	}

}
