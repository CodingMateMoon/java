package com.gui.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventTest extends JFrame implements MouseListener, KeyListener {

	boolean eventCheck = true;
	JLabel name;

	public EventTest() {

		setBounds(100, 100, 500, 500);
		setLayout(new FlowLayout());
		JButton b1 = new JButton("이벤트!");
		// 이벤트설정 스스로 객체가 처리하게
		// 1. 컴포넌트에 리스너를 연결해주자!
		b1.addMouseListener(new EventHandler());
		add(b1);
		name = new JLabel("유병승");
		name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (eventCheck) {
					name.setText("하하하");
					eventCheck = false;
				} else {
					name.setText("호호호");
					eventCheck = true;
				}
			}
		});
		add(name);
		JTextField input = new JTextField(5);
		input.addKeyListener(new EventHandler());
		add(input);

		JButton b2 = new JButton("action!");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton) e.getSource()).setBackground(Color.MAGENTA);
			}
		});
		add(b2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("버튼이 눌렸당께!");
		JButton b1 = (JButton) e.getComponent();

		if (eventCheck) {
			b1.setBackground(Color.CYAN);
			name.setText("왕찬웅");
			eventCheck = false;
			this.add(new TextField());
		} else {
			b1.setBackground(Color.ORANGE);
			name.setText("신재민");
			eventCheck = true;
			this.add(new JButton());
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
