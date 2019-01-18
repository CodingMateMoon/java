package com.thread.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressThread extends Thread{

	private JProgressBar bar;
	private JButton b;
	
	public ProgressThread(JProgressBar bar, JButton b) {
		this.bar = bar;
		this.b = b;
	}

	@Override
	public void run() {
		int current = 0;
		while (current <= 1000) {
			current += Math.random() * 100;
			bar.setValue(current);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		b.setEnabled(true);
	}



	public static void main(String[] args) {
		new ProgressEx();
	}

}

class ProgressEx extends JFrame implements ActionListener{
	private JProgressBar bar1, bar2;
	private JButton start;
	public ProgressEx() {
		
		start = new JButton("Start");
		start.addActionListener(this);
		bar1 = new JProgressBar(0, 10000);
		bar2 = new JProgressBar(0, 10000);
		bar1.setValue(0);
		bar1.setStringPainted(true);
		bar2.setValue(0);
		bar2.setStringPainted(true);
		
		JPanel p = new JPanel();
		p.add(start);
		p.add(bar1);
		p.add(bar2);
		this.add(p);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		start.setEnabled(false);
		ProgressThread p1 = new ProgressThread(bar1, start);
		ProgressThread p2 = new ProgressThread(bar2, start);
		p1.start();
		p2.start();
	}
	
}
