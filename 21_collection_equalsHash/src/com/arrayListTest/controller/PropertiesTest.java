package com.arrayListTest.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	
	public void loadProperties() throws IOException{
		
	}

	public void properties() throws IOException {
		// key value는 '='으로 구분 가능, 문자열인데 "" 안씀, 외부파일로 저장 및 관리
		Properties prop = new Properties();
		prop.load(new FileReader("test.properties"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		prop.put("재민", "호빵맨");
		System.out.println(prop.getProperty("재민"));
		prop.store(new FileWriter("test.properties"), "addJeaMin"); // comment
		
		// 키 값을 모를 때 전체 불러옴
		Enumeration e = prop.keys();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
