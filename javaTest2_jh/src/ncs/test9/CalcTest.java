package ncs.test9;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		Calculate calc = new Calculate();
		System.out.print("정수 입력 1 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		b = sc.nextInt();
		System.out.println("합 : " + calc.sum(a, b));
		System.out.println("차 : " + calc.subtract(a, b));
		System.out.println("곱 : " + calc.multiply(a, b));
		System.out.println("나누기 : " + calc.divide(a, b));
	}

}
