package com.thread.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarRace extends JFrame{

	// 경주차
	private JLabel la1;
	private JLabel la2;
	private JLabel la3;
	int x1 = 1, x2 = 2, x3 = 1; // 위치

	class MyThread extends Thread {
		@Override
		public void run()
		{
			for (int i = 0; i < 500; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int) (Math.random() * 50);
				la1.setBounds(x1, 100, 300, 300);
				x2 += (int) (Math.random() * 50);
				la2.setBounds(x2, 400, 300, 300);
				x3 += (int) (Math.random() * 50);
				la3.setBounds(x3, 700, 300, 300);
				
				if (x1 >= 1000 || x2 >= 1000 || x3 >= 1000) {
					System.out.println("경주 종료" + x1 + " " + x2 + " " + x3);
					break;
				}
			}
		}
	}
	
	// 경주 프레임 작성
	public CarRace() {
		setTitle("자동차 경주");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		JButton b1 = new JButton("시작");
		b1.setBounds(0, 0, 100, 100);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				(new MyThread()).start();
			}
		});
		this.add(b1);
		la1 = new JLabel();
		la1.setIcon(new ImageIcon("image/baby.jpg"));
		la1.setBounds(0, 100, 300, 300);
//		la1.setVisible(true);
		
		la2 = new JLabel();
		la2.setIcon(new ImageIcon("image/baby2.jpg"));
		la2.setBounds(0, 400, 300, 300);
//		la2.setVisible(true);
		la3 = new JLabel();
		la3.setIcon(new ImageIcon("image/baby3.jpg"));
		la3.setBounds(0, 700, 300, 300);
//		la3.setVisible(true);
		
		this.add(la1);
		this.add(la2);
		this.add(la3);
		
//		(new MyThread()).start();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarRace();
	}
}
