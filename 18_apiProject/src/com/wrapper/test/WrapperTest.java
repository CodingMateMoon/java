package com.wrapper.test;

public class WrapperTest {

	public static void main(String[] args) {

		// 기본자료형을 객체화시키는 클래스!
		int age = 19;
		Integer ageObj = age; // == new Integer(age)
		System.out.println(ageObj);
		Integer ageObj2 = new Integer(age);
		//AutoUnboxing 이용, 자동형변환 후 연산
		System.out.println(ageObj2 + ageObj);
		int temp = ageObj;
		System.out.println(temp);
		System.out.println(plus(10, 20));
		Double a = 3.14;
		double b = a;
		
		String ageStr = "19";
		String height = "180.5";
		int ageTrans = Integer.parseInt(ageStr) + 3;
		double heightTrans = Double.parseDouble(height);
		System.out.println(ageTrans);
		System.out.println(heightTrans + 1);
		
		String tt = Integer.valueOf(ageTrans).toString();
		tt = String.valueOf(ageTrans);
	}
	
	public static Integer plus(Integer a, int b) {
		return a + b;
	}

}
