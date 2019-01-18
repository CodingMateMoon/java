package com.network.client;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {

	private Socket socket;
	private String name;
	private DataOutputStream out;

	public ClientSender(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
		try {
			out = new DataOutputStream(socket.getOutputStream());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		if (out != null) {
			try {
				out.writeUTF(name);
				while(out != null) {
					System.out.print("대화 입력 : ");
					out.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
