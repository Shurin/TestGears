package com.shurin.testgears;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginTest extends JDialog {
	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginTest dialog = new LoginTest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginTest() {
		setTitle("G.I.R.S.");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JLabel lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblUsername.setBounds(115, 144, 74, 24);
			contentPanel.add(lblUsername);
		}
		{
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPassword.setBounds(115, 175, 74, 24);
			contentPanel.add(lblPassword);
		}

		textField = new JTextField();
		textField.setBounds(199, 146, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 177, 86, 20);
		contentPanel.add(textField_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginTest.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		lblNewLabel.setBounds(91, 11, 231, 105);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Login");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
						MainScreen.main(null);
					}
				});
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("Cancel");
						// What action do you want to add in each button?
					}
				});
				buttonPane.add(cancelButton);
			}
		}

	}

}
