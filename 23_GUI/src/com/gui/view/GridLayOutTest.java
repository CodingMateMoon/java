package com.gui.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayOutTest extends JFrame {

	public GridLayOutTest() {
		setBounds(100, 100, 500, 500);
	
		setLayout(new GridLayout(4, 31));
		
		for (int j = 0; j < 4; j++) { 
			for (int i = 1; i <= 31; i++) {
				add(new JButton(""+i));
			}
		}
		// 창 고정
//		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
