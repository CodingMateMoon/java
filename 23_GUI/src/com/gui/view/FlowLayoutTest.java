package com.gui.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{

	public FlowLayoutTest() {
		
		setBounds(100, 100, 1600, 800);
		// 중앙정렬
//		setLayout(new FlowLayout());
		// 왼쪽정렬
//		setLayout(new FlowLayout(FlowLayout.LEFT));
		// 오른쪽정렬
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		/*add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));*/
		for (int i = 1; i <= 31; i++) {
			add(new JButton(""+i));
		}
		// 창 고정
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
