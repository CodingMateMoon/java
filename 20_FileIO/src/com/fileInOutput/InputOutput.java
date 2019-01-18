package com.fileInOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

	public void saveFile() {
		// InputStream OuputStream 오디오 그림 읽어올때 사용
		Scanner input = new Scanner(System.in);
		System.out.print("파일에 입력 내용(exit종료) : ");
		String content ="";
		while(true) {
			String temp = input.next();
			if (temp.equals("exit"))
					break;
			else
				content += temp;
		}
		
		FileOutputStream fos = null;
		String fileName = "test.txt";
		try {
			// test.txt 파일에 길을 연결함(Stream)
			fos = new FileOutputStream("test.txt");
//			String str = "tommorrow exam!"; // byte단위로 데이터를 읽어들이며 2바이트를 1바이트로 쪼개서 읽기때문에 글씨가 깨짐
			// 바이트 단위 통신이기 때문에 데이터를 전송할때도 byte로 변경해서 전송해야함!
			fos.write(content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void loadFile() {
		FileInputStream fis = null;
		String filename = "test.txt";
		try {
			File f = new File(filename);
			fis = new FileInputStream(filename);
//			int temp = 0; // Byte단위 입출력 처리, 파일을 받아오는 변수
			byte[] temp = new byte[(int)f.length()];
			StringBuffer sb = new StringBuffer(); 
			// int 형태 byte단위로 끊어서 데이터 받아옴 "ABCDE" -> 65 66 67 68 69
			fis.read(temp);
			for (byte a : temp) {
				System.out.println((char)a);
			}
			/*while((temp = fis.read()) != -1) {
				System.out.println(temp);
				sb.append((char)temp);
			}*/
			System.out.println(sb);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
