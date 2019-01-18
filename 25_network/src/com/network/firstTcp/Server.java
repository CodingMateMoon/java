package com.network.firstTcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		// 포트를 정한다
		int port = 8888;
		
		// serversocket 생성
		// IOException 처리 필요
		ServerSocket server = new ServerSocket(port);
		
		while (true) {
			// 서버가 client 접속하는 것을 확인 후 연결받음
			Socket client = server.accept();
			// 데이터를 주고 받을 Stream 연결 해줌
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			// 문자를 주고받기 때문에 효율을 높이기 위해 보조 스트림 적용
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			while (true) {
				String message = br.readLine();
				if (message.equals("exit")) {
					System.out.println("접속종료");
					break;
				}
				System.out.println(client.getInetAddress() + "가 보낸 메세지 : " + message);
				pw.println("보내기 성공");
				pw.flush();
				
				/*if (!(message.equals("exit"))) {
					System.out.println(client.getInetAddress() + "가 보낸 메세지 : " + message);
					pw.println("보내기 성공");
					pw.flush();
				} else {
					System.out.println("접속종료");
					break;
				}*/
			}
			br.close();
			pw.close();
			client.close();
		}
	}

}
