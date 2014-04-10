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
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class SearchResult extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtFbsbv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			if (args != null && args.length > 0) {
				SearchResult dialog = new SearchResult(args[0]);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SearchResult(final String search) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setUndecorated(true);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		{
			JLabel lblFoundResults = new JLabel("Found (1) Result(s):");
			lblFoundResults.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblFoundResults.setVerticalAlignment(SwingConstants.TOP);
			lblFoundResults.setBounds(10, 127, 237, 19);
			contentPanel.add(lblFoundResults);
		}
		{
			if (Search.data.contains(search)) {
				int results = 1;
				for (int i = 0; i < results; i++) {
					JButton button = new JButton(search);
					button.setBounds(10, 157 + (25 * i), 86, 20);
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							final String[] result = new String[1];
							result[0] = search;
							SearchProductID.main(result);
						}
					});
					contentPanel.add(button);
				}
				txtFbsbv = new JTextField();
				txtFbsbv.setEditable(false);
				txtFbsbv.setText("F5B1S42BV");
				txtFbsbv.setBounds(10, 157, 86, 20);
				contentPanel.add(txtFbsbv);
				txtFbsbv.setColumns(10);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(SearchResult.class.getResource("/com/shurin/testgears/new girs2.jpg")));
			lblNewLabel.setBounds(104, 11, 231, 105);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(UIManager.getBorder("DesktopIcon.border"));
			buttonPane.setBackground(SystemColor.activeCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Search Again");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setBackground(SystemColor.activeCaption);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(SystemColor.activeCaption);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
