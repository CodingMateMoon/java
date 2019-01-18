package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {
	
	
	public static void main(String[] args) {
		String s = "J a v a P r o g r a m";
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st);
		System.out.println(s);
		System.out.println("토큰 처리 전 글자 갯수 : " + st.countTokens());
		char[] arr = new char[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = st.nextToken().charAt(0);
			i++;
		}
		System.out.println("토큰 처리 후 글자 갯수 : " + st.countTokens());
		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println();
		
		System.out.println(String.valueOf(arr).toUpperCase());
	}
	
}
