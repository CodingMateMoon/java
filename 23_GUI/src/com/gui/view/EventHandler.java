package com.gui.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class EventHandler extends MouseAdapter implements KeyListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("외부이벤트핸들러!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		b.setBackground(Color.RED);
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		b.setBackground(Color.YELLOW);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		if(e.isAltDown() && c == 'B') {
			System.out.println("호호호");
		}
		System.out.println(c + " : " + keyCode);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
