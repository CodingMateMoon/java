package com.gui.view;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NullLayout extends JFrame{

	public NullLayout() throws IOException {
		
		setBounds(0, 0, 1000, 700);
		setTitle("Test");
		setIconImage(ImageIO.read(new File("images/hobbang.png")));
		setLayout(null); // panel에서 지정 가능
		JLabel id = new JLabel("ID : ");
		id.setBounds(200, 200, 20, 40);
		id.setVisible(true);
		JTextField inputId = new JTextField();
		inputId.setBounds(220, 200, 60, 40);
		inputId.setVisible(true);
		JButton b1 = new JButton("입력");
		b1.setBounds(210, 250, 60, 20);
		b1.setVisible(true);
		
		
		// 컴포넌트 추가
		add(id);
		add(inputId);
		add(b1);
//		b1.setBounds(100, 300, 100, 50);
//		b1.setVisible(true);
//		b1.setVisible(true)
		/*JPanel panel = new JPanel();
		panel.add(but);
		add(panel);*/
		getContentPane().setBackground(Color.CYAN);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
