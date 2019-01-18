package com.checkedException.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UncheckedException {

	// 메인 호출한 JVM에 알아서 처리하도록 위임
	public static void main(String[] args) /* throws FileNotFoundException */ {
		Scanner sc = new Scanner(System.in);
		// Arithmetic Exception
		/*
		 * int a = 10; int b = 0; System.out.println(a / b);
		 */

		// NullPointException
		/*
		 * String str = null; System.out.println(str.charAt(0));
		 */

		// NegativeArraySizeException
//		int[] nums = new int[-2];

		// ArrayIndexOutofBoundExcepiton
		/*
		 * int[] nums = new int[1]; System.out.println(nums[1]);
		 */

		// ClassCastException
		/*
		 * Object obj = new Scanner(System.in); String str = (String) obj;
		 */

		// FileInputStream 함수를 호출한 main 함수에 처리 위임
//		System.exit(0);
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("test");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("여기 발생 전 실행 되니?");
			System.out.println("에러 발생 후 실행 되니?");
//			new ExceptionFunction().methodB();
			new ExceptionFunction().methodA(); // EOF
			new ExceptionFunction().methodC(); // FileNotFoundException
			System.out.println("에러발생 후 2 실행되니");
		} /*
			 * catch (FileNotFoundException e) { // System.out.println(e.getMessage());
			 * System.out.println("FileNot"); } catch (EOFException eof) {
			 * System.out.println("EOF"); }
			 */ catch (Exception e) {
			System.out.println(e.getClass());
		} finally {
			/*try {
				fi.close();
			} catch (IOException e) {

			}*/
//			System.out.println("에러 발생 후 실행 되니?");
		}
		
		try (FileInputStream fi2 = new FileInputStream("test")) {
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 에러 나든 안나든 출력");
		}
		System.out.println("예외 뭐있니");
		
		System.out.print("당신의 나이는? : ");
		
		if (sc.nextInt() < 19) {
			
			try {
				throw new MyException("미성년자 출입금지");
			} catch (MyException e) {
//				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
