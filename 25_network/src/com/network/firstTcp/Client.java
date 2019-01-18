package com.network.firstTcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		// 접속할 주소, 포트 설정
		// 192.168.20.2, 192.168.20.241
		int port = 8888;
		// 스트림 연결
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket soc = null;
		try {
			String serverIp = "192.168.20.2";
			// 서버 연결 소켓 작성
			soc = new Socket(serverIp, port);
			if (soc != null) {
				InputStream input = soc.getInputStream();
				OutputStream out = soc.getOutputStream();
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(out);
				
				Scanner sc = new Scanner(System.in);
				do {
					System.out.print("메세지 입력 : ");
					String message = sc.nextLine();
					pw.println(message);
					pw.flush();
					
					// 서버가 보낸 메세지 확인
					String rcvMessage = br.readLine();
					System.out.println(rcvMessage);
					if (message.equals("exit")) {
						break;
					}
				} while (true);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				soc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
