package com.practice1.controller;

import com.practice1.model.vo.BookCustom;

public class TestSilsub1 {

	public static void main(String[] args) {
		// String title, String author, int price
		BookCustom b1 = new BookCustom("해리포터", "롤링", 10000);
		BookCustom b2 = new BookCustom("해리포터", "롤링", 10000);
		BookCustom c = null;
		try {
			 c = (BookCustom) b1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(c.hashCode());
		System.out.println(c);
		System.out.println(b1.equals(c));
	}

}
