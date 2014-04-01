package com.shurin.testgears;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SearchProductID extends JFrame {

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
	private JTextField textField_14;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel label = new JLabel("Product Name:");
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setBounds(10, 14, 85, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Product ID:");
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(468, 14, 64, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Location:");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(258, 14, 66, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Owners:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setBounds(10, 57, 48, 14);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("Ownership:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setBounds(258, 57, 66, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("Available Amount:");
		label_5.setFont(new Font("Dialog", Font.BOLD, 12));
		label_5.setBounds(10, 204, 105, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("Current Production:");
		label_6.setFont(new Font("Dialog", Font.BOLD, 12));
		label_6.setBounds(10, 263, 114, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("Quarter:");
		label_7.setFont(new Font("Dialog", Font.BOLD, 12));
		label_7.setBounds(204, 263, 64, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("Year:");
		label_8.setFont(new Font("Dialog", Font.BOLD, 12));
		label_8.setBounds(342, 263, 29, 14);
		contentPane.add(label_8);

		textField = new JTextField(result);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(105, 11, 105, 20);
		contentPane.add(textField);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(323, 11, 135, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 82, 200, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(10, 113, 200, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 144, 200, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(10, 175, 200, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(258, 82, 200, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(258, 113, 200, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(258, 144, 200, 20);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(258, 175, 200, 20);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(10, 229, 116, 20);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(10, 288, 116, 20);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(204, 288, 116, 20);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(342, 288, 116, 20);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setText("F5B1S42BV");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(542, 11, 122, 20);
		contentPane.add(textField_14);
	}

}
