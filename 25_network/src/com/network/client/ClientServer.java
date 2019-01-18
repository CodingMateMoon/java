package com.network.client;

import java.net.Socket;
import java.util.Scanner;

public class ClientServer {
	
	String serverIp = "127.0.0.1";
	Scanner sc = new Scanner(System.in);
	
	public ClientServer() {
		System.out.print("대화명 : ");
		String name = sc.nextLine();
		try {
			Socket socket = new Socket(serverIp, 8888);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new ClientSender(socket, name);
			Thread receiver = new ClientReceiver(socket);
			sender.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
