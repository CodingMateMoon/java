package com.kh.startjava;

//import java.util.Date;
// 외부패키지에 있는 클래스를 사용할 때 

public class FirstJava {
	
	public static void main(String[] args) {
		
		//System.out.println(new Date());
		System.out.println(new java.util.Date());
		plus();
	}
	
	public static void plus() {
		System.out.println(10 + 20);
	}
}
