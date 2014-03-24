package com.shurin.testgears;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainScreen extends JFrame {

	private JPanel contentPane;

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
		setTitle("G.I.R.S.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		setResizable(false);
		contentPane = new JPanel();
		Color myColor = new Color(10, 10, 10, 10);
		contentPane.setBackground(myColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(89, 97, 291, 135);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);

		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenu help = new JMenu("Help");
		help.setMnemonic('H');

		bar.add(file);
		bar.add(help);

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
		file.add(mntmOpenProductregistration);

		JLabel label = new JLabel("New label");
		//contentPane.setViewportView(label);
	}
}
