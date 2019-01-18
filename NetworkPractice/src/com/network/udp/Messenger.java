package com.network.udp;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class Messenger {
	private TocFrame f;
	private DatagramSocket socket;
	private InetAddress address = null;
	private final int MY_PORT;
	private final int OTHER_PORT;
	
	public Messenger(int myport, int otherport, String otherAdress)
	{
		this.MY_PORT = myport;
		this.OTHER_PORT = otherport;
		
		try {
			address = InetAddress.getByName(otherAdress);
			socket = new DatagramSocket(MY_PORT);
			f = new TocFrame(address, OTHER_PORT, socket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public TocFrame getTocFrame() {
		return f;
	}
}
