package com.kh.project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi!");
		if (args[0] == null) {
			System.out.println("값을 입력하세요");
			System.exit(0);
		}
		
		char[] temp = (args[0].toUpperCase()).toCharArray();
		
		for (int i = 0; i < temp.length / 2; i++) {
			int n = temp.length - 1;
			char tmp = temp[i];
			temp[i] = temp[n - i];
			temp[n - i] = tmp;
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
