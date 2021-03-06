package com.shurin.testgears;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Search extends JDialog {
	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	JLabel lblTypeDetails, lblPickType;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox;
	public static List<String> data = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		data.add("F5B1S42BV");
		try {
			Search dialog = new Search();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Search() {
		addKeyListener(new Keyboard());
		setFocusable(true);
		setTitle("Search");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		setUndecorated(true);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Search.class.getResource("/com/shurin/testgears/new girs2.jpg")));
		lblNewLabel.setBounds(106, 11, 231, 105);
		contentPanel.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Pick a Subject", "Product ID", "Product Type", "C.I.N.", "Person First Name", "Person Last Name", "Blood Type" }));
		comboBox.setBounds(207, 136, 119, 20);
		contentPanel.add(comboBox);

		textField = new JTextField();
		textField.setBounds(207, 167, 177, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		lblPickType = new JLabel("Pick Type:");
		lblPickType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPickType.setBounds(78, 136, 119, 20);
		contentPanel.add(lblPickType);

		lblTypeDetails = new JLabel("Type details:");
		lblTypeDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTypeDetails.setBounds(78, 165, 119, 20);
		contentPanel.add(lblTypeDetails);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Search");
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (!lblPickType.getText().equalsIgnoreCase("Pick a Subject")) {
							if (textField.getText().length() > 0) {
								if (data.contains(textField.getText())) {
									lblPickType.setVisible(false);
									lblTypeDetails.setVisible(false);
									textField.setVisible(false);
									comboBox.setVisible(false);
									int results = 1;
									JOptionPane.showMessageDialog(null, "Found (" + results + ") Result(s).");
									String[] search = new String[1];
									search[0] = textField.getText();
									SearchResult.main(search);
									dispose();
								} else JOptionPane.showMessageDialog(null, "Found (0) Result(s).");
							} else JOptionPane.showMessageDialog(null, "Your Details are empty.");
						} else JOptionPane.showMessageDialog(null, "You did not pick a subject.");
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.activeCaption);
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainScreen.main(null);
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
}
