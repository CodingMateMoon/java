package ncs.test9;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		Calculate calc = new Calculate();
		System.out.print("���� �Է� 1 : ");
		a = sc.nextInt();
		System.out.print("���� �Է� 2 : ");
		b = sc.nextInt();
		System.out.println("�� : " + calc.sum(a, b));
		System.out.println("�� : " + calc.subtract(a, b));
		System.out.println("�� : " + calc.multiply(a, b));
		System.out.println("������ : " + calc.divide(a, b));
	}

}
