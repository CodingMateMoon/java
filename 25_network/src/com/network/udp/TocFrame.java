package com.network.udp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TocFrame extends JFrame implements ActionListener {

	private DatagramSocket socket; // UDP 통신에 필요한 객체
	private DatagramPacket packet; // UDP 통신에 필요한 데이터 전송용 객체
	private JTextField textField; // 입력창
	private JTextArea textArea; // 출력창
	private InetAddress address; // 전송하는 곳의 주소
	private int otherPort; // 상대방 포트 
	
	public TocFrame(InetAddress address, int port, DatagramSocket socket) {
		this.address = address;
		this.otherPort = port;
		this.socket = socket;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		this.add(textField, BorderLayout.PAGE_END);
		this.add(textArea, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		
	}

	// 전송하는 것 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textField.getText();
		byte[] buffer = str.getBytes();
		DatagramPacket send = new DatagramPacket(buffer, buffer.length, address, otherPort);
		
		try {
			socket.send(send);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		textArea.append("Send : " + str + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	
	// 전송된 메세지를 처리
	public void process() {
		while(true) {
			byte[] buf = new byte[256];
			packet = new DatagramPacket(buf, buf.length);
			try {
				socket.receive(packet);
				textArea.append("RECIEVE : " + new String(buf) + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
