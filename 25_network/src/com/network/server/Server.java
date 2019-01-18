package com.network.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Server {

	private HashMap clients;

	public Server() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
		// 데이터의 무결성을 보장하기 위해 동기화처리를 하는 것
	}

	class ServerReceiver extends Thread {
		private Socket socket;
		private DataInputStream in;
		private DataOutputStream out;

		public ServerReceiver(Socket socket) {
			try {
				this.socket = socket;
				this.in = new DataInputStream(socket.getInputStream());
				this.out = new DataOutputStream(socket.getOutputStream());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			String name = null;
			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어오셨습니다.");
				clients.put(name, out);
				System.out.println("현재 접속자 수 :  " + clients.size() + "입니다.");
				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("현재 접속자수 : " + clients.size() + "입니다.");
			}
		}
	}

	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void start() {
		ServerSocket server = null;
		Socket socket = null;
		try {
			server = new ServerSocket(8888);
			System.out.println("서버가 시작되었습니다.");

			while (true) {
				socket = server.accept();
				System.out.println("새로운 유저가 로그인 했습니다.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
