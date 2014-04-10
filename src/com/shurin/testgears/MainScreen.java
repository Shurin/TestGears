package com.shurin.testgears;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class MainScreen extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtJdoe, textField, txtPersonProduct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		addKeyListener(new Keyboard());
		setFocusable(true);
		setTitle("G.I.R.S.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(129, 110, 238, 61);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 166, 115, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblAccessLevel = new JLabel("Access Level:");
		lblAccessLevel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAccessLevel.setBounds(20, 195, 115, 29);
		contentPane.add(lblAccessLevel);

		JLabel lblAccessType = new JLabel("Access Type:");
		lblAccessType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAccessType.setBounds(20, 224, 115, 29);
		contentPane.add(lblAccessType);

		txtJdoe = new JTextField();
		txtJdoe.setEditable(false);
		txtJdoe.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtJdoe.setText("JDoe224");
		txtJdoe.setBounds(129, 172, 79, 20);
		contentPane.add(txtJdoe);
		txtJdoe.setColumns(10);

		textField = new JTextField();
		textField.setText("01");
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(129, 200, 27, 20);
		contentPane.add(textField);

		txtPersonProduct = new JTextField();
		txtPersonProduct.setText("Person & Product Registration");
		txtPersonProduct.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPersonProduct.setEditable(false);
		txtPersonProduct.setColumns(10);
		txtPersonProduct.setBounds(129, 230, 178, 20);
		contentPane.add(txtPersonProduct);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(MainScreen.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		label_1.setBounds(133, 11, 231, 105);
		contentPane.add(label_1);
		setLocationRelativeTo(null);

		new TopMenu(this);
	}

}
