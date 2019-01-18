package com.gui.run;

import java.io.IOException;

import javax.swing.JFrame;

import com.gui.view.CardLayoutTest;

public class Main extends JFrame{

	public static void main(String[] args) throws IOException {
		// 1. 직접 상속 받아 처리
		/*JFrame frame = new Main();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 창 닫아도 프로그램 계속 실행중
		frame.setVisible(true);*/
		
		// 2. 직접 생성해서 처리
		/*JFrame frame = new JFrame();
		// pixel 단위
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);*/
		
//		new MainFrame();
//		new FlowLayoutTest();
//		new GridLayOutTest();
		new CardLayoutTest();
//		new NullLayout();
//		new MainFrame2();
//		new EventTest();
	}

}
