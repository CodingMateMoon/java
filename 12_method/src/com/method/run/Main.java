package com.method.run;

import java.util.Arrays;
import java.util.Scanner;
import com.method.model.vo.*;

import com.method.model.vo.Function;
import com.member.controller.*;

public class Main {

	
	public static void main(String[] args) {
//		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		Function f = new Function();
		/*f.plus(); // 매개변수가 없는 메소드 호출
		f.plus1(20, 50);
		f.plus2(); // return 값 반환 30
		// 30;
		
		System.out.println(f.plus2());
		System.out.println(f.plus3(50, 60));
		int re2= f.plus3(50, 50) - 200;
		System.out.println(re2);
		System.out.print("문자열 입력 : ");
		String s1 = sc.nextLine();
		System.out.print("문자열 입력2 : ");
		String s2 = sc.nextLine();
		System.out.println(f.plusString("ha", "ho"));
		System.out.println(f.plusString(s1, s2));
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(f.plusInt(num1, num2));
		System.out.println(f.plusInt(1, 10));
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("결과 : " + f.isChar('a'));
		
		System.out.println("결과 : " + f.isChar(c));*/
		int[] nums = new int[5];
		int su1 = 10;
		int su2 = 20;
		System.out.println("메소드 실행전 : " + Arrays.toString(nums));
		System.out.println("메소드 실행전 : " + su1 + " : " + su2);
		f.plus3(su1, su2);
		f.arrayTest(nums);
		
		System.out.println("메소드 실행후 : " + Arrays.toString(nums));
		System.out.println("메소드 실행후 : " + su1 + " : " + su2);
		
		MemberController member = new MemberController();
		member.loginCheck();
		
		MemberController m = new MemberController();
		
		
	}
	
	
	
}
