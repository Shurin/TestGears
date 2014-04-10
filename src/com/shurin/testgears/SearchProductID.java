package com.shurin.testgears;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SearchProductID extends JFrame {
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			final String result = args[0];
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SearchProductID frame = new SearchProductID(result);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * Create the frame.
	 */
	public SearchProductID(String result) {
		addKeyListener(new Keyboard());
		setFocusable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 411);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblProductId = new JLabel("Product ID:");
		lblProductId.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProductId.setBounds(43, 32, 85, 14);
		contentPane.add(lblProductId);

		JLabel label_2 = new JLabel("Location:");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(291, 32, 66, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Owners:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setBounds(43, 75, 48, 14);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("Ownership:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setBounds(291, 75, 66, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("Available Amount:");
		label_5.setFont(new Font("Dialog", Font.BOLD, 12));
		label_5.setBounds(43, 222, 105, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("Current Production:");
		label_6.setFont(new Font("Dialog", Font.BOLD, 12));
		label_6.setBounds(43, 281, 114, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("Quarter:");
		label_7.setFont(new Font("Dialog", Font.BOLD, 12));
		label_7.setBounds(237, 281, 64, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("Year:");
		label_8.setFont(new Font("Dialog", Font.BOLD, 12));
		label_8.setBounds(375, 281, 29, 14);
		contentPane.add(label_8);

		textField = new JTextField(result);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(138, 29, 105, 20);
		contentPane.add(textField);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(356, 29, 135, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(43, 100, 200, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(43, 131, 200, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(43, 162, 200, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(43, 193, 200, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(291, 100, 200, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(291, 131, 200, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(291, 162, 200, 20);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(291, 193, 200, 20);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(43, 247, 116, 20);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(43, 306, 116, 20);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(237, 306, 116, 20);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(375, 306, 116, 20);
		contentPane.add(textField_13);

		JButton btnNewButton = new JButton("Back to Main");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainScreen.main(null);
			}
		});
		btnNewButton.setBounds(302, 355, 135, 23);
		contentPane.add(btnNewButton);
	}
}
