package com.gui.view;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class TestPanel extends JPanel {

	public TestPanel() {

		setLayout(null);
		setSize(500, 500);
		String[] listdata = { "유병승", "신재민", "호빵맨", "lol망함" };
		/*JList list = new JList(listdata);
		list.setBounds(200, 200, 50, 100);
		list.setVisible(true);*/
		JComboBox combox = new JComboBox<>(listdata);
		combox.setBounds(200, 200, 70, 40);
		combox.setVisible(true);
		JCheckBox ck1 = new JCheckBox("lol");
		ck1.setBounds(200, 180, 70, 30);
		ck1.setVisible(true);
		JCheckBox ck2 = new JCheckBox("유투브");
		ck2.setBounds(270, 180, 70, 30);
		ck2.setVisible(true);
		JCheckBox ck3 = new JCheckBox("야구");
		ck3.setBounds(340, 180, 70, 30);
		ck3.setVisible(true);
		JCheckBox ck4 = new JCheckBox("술");
		ck4.setBounds(410, 180, 70, 30);
		ck4.setVisible(true);
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(ck4);
		add(combox);
	}
}
