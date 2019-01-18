package com.network.udp;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int myport = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트"));
		int otherport = Integer.parseInt(JOptionPane.showInputDialog("상대방의 포트"));
		String otherAddress = JOptionPane.showInputDialog("상대방의 주소");
		
		Messenger m = new Messenger(myport, otherport, otherAddress);
		TocFrame f = m.getTocFrame();
		f.process();
	}

}
