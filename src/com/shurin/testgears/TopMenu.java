package com.shurin.testgears;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class TopMenu {

	public TopMenu(final JFrame frame) {
		JMenuBar bar = new JMenuBar();
		bar.setBorder(UIManager.getBorder("DesktopIcon.border"));
		frame.setJMenuBar(bar);

		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenu help = new JMenu("Search");
		help.setMnemonic('S');

		bar.add(file);
		bar.add(help);

		JMenuItem mntmSearchEntries = new JMenuItem("Search Entries");
		mntmSearchEntries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Search.main(null);
			}
		});
		help.add(mntmSearchEntries);

		JMenuItem login = new JMenuItem("Back to Login");
		login.setMnemonic('L');
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LoginTest.main(null);
			}
		});

		file.add(login);

		JMenuItem mntmOpenAddinfo = new JMenuItem("Add New Person");
		mntmOpenAddinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				AddInfo.main(null);
			}
		});
		file.add(mntmOpenAddinfo);

		JMenuItem mntmOpenProductregistration = new JMenuItem("Add New Product");
		mntmOpenProductregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ProductRegistration.main(null);
			}
		});

		JMenuItem mntmReviewNewPerson = new JMenuItem("Review New Person");
		mntmReviewNewPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Review1.main(null);
			}
		});
		file.add(mntmReviewNewPerson);
		file.add(mntmOpenProductregistration);

		JMenuItem mntmReviewNewProduct = new JMenuItem("Review New Product");
		mntmReviewNewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Review2.main(null);
			}
		});
		file.add(mntmReviewNewProduct);
	}
	
}