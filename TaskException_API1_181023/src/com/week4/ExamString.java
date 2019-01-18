package com.week4;

public class ExamString {

	public String preChar(String s) {
		char[] arr = s.toCharArray();
		if ('a' <= arr[0] && arr[0] <= 'z') {
			arr[0] -= 'a' - 'A';
		}
		return String.valueOf(arr);
	}
	
	public int CharSu(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}
