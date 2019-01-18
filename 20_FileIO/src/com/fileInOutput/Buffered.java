package com.fileInOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {

	public void input() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력하세요 : ");
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
		String comment = br.readLine();
		System.out.println(comment);
		br.close();
	}
}
