package com.fileTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {

		// 파일을 생성하는 방법은 자바에서 제공하는 File객체를 이용하여 생성
		File dir = new File("e:\\testfile\\a\\b");
//		dir.mkdir(); // 단일 디렉토리를 생성
		dir.mkdirs(); // 
		File file = new File("e:\\testfile\\a\\b\\text"); // 메모리 공간안에 파일 생성, \하나는 escape문 의미  \\써야 \ 의미
		
		// 매개변수에 있는 파일명으로 지정된 경로에 파일 생성
		file.createNewFile(); // reflash로 생성된 파일 확인
		System.out.println(file.exists());
		
		if (file.exists()) {
			
		}
		System.out.println(file.isFile()); // "d:\\testfile\\a\\text" text 파일이 없어서 null 이므로 false
		System.out.println(file.isDirectory());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		Date modified = new Date(file.lastModified());
		System.out.println(modified);
	}

}
