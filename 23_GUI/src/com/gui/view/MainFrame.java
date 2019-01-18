package com.gui.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	// 객체를 생성할 때 환경설정을 해줘야함.
	// 생성자에서 프레임에 대한 환경설정 (프레임이 어떻게 뜰 지)

	public MainFrame() {

		try {
			setIconImage(ImageIO.read(new File("images/hobbang.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setBounds(300, 0, 500, 500);
		setTitle("나의 첫 프레임");
		getContentPane().setBackground(Color.CYAN);
		// Layout Setting
		setLayout(new BorderLayout());
//		setLayout(null);
		JButton button1 = new JButton("북");
		JButton button2 = new JButton("남");
		JButton button3 = new JButton("서");
		JButton button4 = new JButton("동");
		JButton button5 = new JButton("중앙");
		button3.setBounds(100, 100, 200, 200);
		button3.setVisible(true);
//		add(button1, BorderLayout.NORTH);
//		add(button2, BorderLayout.SOUTH);
//		add(button3, BorderLayout.WEST);
//		add(button4, BorderLayout.EAST);
//		add(button5, BorderLayout.CENTER);
		add(new JButton("생성 후 바로 부착"), "North");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
