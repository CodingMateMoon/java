package com.gui.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutTest extends JFrame {
	
	private JFrame mf;

	public CardLayoutTest() {
		
		mf = this;
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CardLayout card = new CardLayout();
		setLayout(card);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.setBackground(Color.MAGENTA);
//		p1.add(new JButton("Test1"));
		p2.setBackground(Color.RED);
		p2.add(new JButton("Test2"));
		p3.setBackground(Color.YELLOW);
		p3.add(new JButton("Test3"));
		
		p1.setLayout(new GridLayout(6, 5));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		for (int i = 0; i < 25; i++) {
			p1.add(new JButton(""+i));
		} 
		
		for (int i = 0; i < 25; i++) {
			p2.add(new JButton(""+i));
		} 
		
		p3.setLayout(new BorderLayout());
		p3.add(new JTextField(), BorderLayout.NORTH);
		p3.add(new JButton("확인"), BorderLayout.SOUTH);
		
		add(p1);
		add(p2);
		add(p3);
		
		p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.next(p1.getParent());
				p1.add(new JButton("눌림"));
			}
		});
		
		p2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.next(p2.getParent());
			}
		});
		
		p3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.next(p3.getParent());
			}
		});
		setVisible(true);
	}
}
