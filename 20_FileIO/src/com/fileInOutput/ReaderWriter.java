package com.fileInOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public void saveFile() {
		
		// RAM 에서 파일로 write
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("test.txt"); // 기존 파일에 이어서 파일 작성하는 경우  new FileWriter("test.txt",true)
			fw.write("유병승");
			char[] temp = {'a', 'b', 'c'};
			fw.write(temp);
			fw.write('남');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void loadFile() {
		// try with resource
		try (FileReader fr = new FileReader("test.txt")){
			int temp = 0;
			char[] chs = new char[256];
//			fr.read(chs);
			// 2byte 단위로 데이터 읽은 후 char로 형변환
			while((temp = fr.read()) != -1) {
				System.out.println(temp);
				System.out.println((char) temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
