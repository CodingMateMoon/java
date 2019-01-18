package com.gui.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame2 extends JFrame{

	public MainFrame2() {
		
		setBounds(100, 100, 500, 500);
		setLayout(new BorderLayout());
		add(new TestPanel(), "Center");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
