package com.variable.run;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VariableTest {

	private static int e;

	public static void main(String[] args) {
		// ���̸� �����ϴ� ���� �����
		// ���� : ������, ������ : ?
		int age = 27;
		// ��ȥ ���θ� �����ϴ� ������ ������!
		// ������(true, false), ������ : ?
		boolean isMarried = false;

		// ������ ���� ����
		// ���� : �Ǽ���
		double weight = 100.5;
		float weight2 = 100.2f;

		// ���� ����
		// ���� : ������
		int salary = 40;

		// ���� ���� ����
		// ���� : ��, ��, M, F
		String gender = "����";
		char gender2 = 'M';

		// ����� �����ϴ� ���� ����
		// ���� : 2��, ������ :??
		long property = 10000000000000L;

		// ����� �μ��� ������ �� �ִ� ���� ����!
		// �μ��� �� : �ڹ��кη� �ʱ�ȭ

		String department = "�ڹ��к�";

		// ����� ���ʽ��� ������ �� �ִ� ����
		// �� : 0.03���� �ʱ�ȭ
		float bonus = 0.03f;

		int familyCnt = 3;

		boolean vacation = false;

		String address = "����";

		// ����� ����� �ʱ�ȭ!
		final int age2;
		age2 = 27;

		String str = "������ 19��";
		System.out.println(str);
		str = new String("�� 20��");
		System.out.println(str);
		// String�� ��ü�̱� ������ new������ ��밡��

		// ���ڿ��� +�� �ϸ� ������ �ȴ�.
		str = "������" + "����";
		System.out.println(str);
		// ������ �� ������ Ȱ���� �� ����
		str = "��̸� ���ڸ��� " + str;
		System.out.println(str);

		// ����(�ٸ� �ڷ���)�� ���ڸ� �������� ���! '+'�� �� ���
		str = "������ " + 30 + 20;
		System.out.println(str);

		str = 1 + 2 + "������ " + "��̸�";
		System.out.println(str);

		// ���� ���� �����غ���
		String name = "������";
		String address2 = "��⵵ �����";
		String gen = "��";
		int age1 = 19;
		double height = 180.5;
		System.out.println(name + " " + address2 + " " + gen);

		// Ű�ϰ� ���� ���!
		System.out.println("" + age1 + height);
		Calendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.YEAR) + c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR) + " " + (c.get(Calendar.MONTH) + 1));
		
		// ������ �����÷ο�
		byte b = 127;
		System.out.println(++b);
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(++b);
		}
		
		
		
		byte b1 = 100;
		int su1 = b1;
		System.out.println(su1);
		double d1 = su1;
		System.out.println(d1);
		char ch = '��';
		char ch2 = '��';
		int su2 = ch;
		int su3 = ch2;
		System.out.println(su2);
		System.out.println(su3);
		System.out.println((int) 'A');
		
		long l = 123123123123123L;
		float f = l;
		System.out.println(f);
		
		// ����� �� ���� ���ͷ��� �ڷ����� ���ƾ���!
		// �� ���ͷ��� �� ū �ڷ������� �ڵ�����ȯ�� ����
		System.out.println(100 + 100.2);
		
		// short, byte �ڷ��� ���� �� ������ int������ ��ȯ�Ͽ� ó��
		byte b3 = 100, b4 = 50;
		byte result = (byte) (b3 + b4);
		
		System.out.println("��� : " + (b3 + b4));
		
		// ������ ����ȯ
		double pi = 3.14;
		int pi2 = (int) pi;
		System.out.println(pi2);
		
		int su5 = 290;
		byte b5 = (byte) su5;
		System.out.println(b5);
		//byte bb = 0;
		
		/*for (int i = 0; i < 320; i++) {
			System.out.println(++b);
		}*/
		System.out.println(String.format("%d test", 55));
		
		System.out.printf("%d 8: %o %A %e %.2f\n", 33, 33, 40.0, 1.7e+3, 1.7e+2);
		
		System.out.printf("���� : %4d �̸� : %-7s Ű : %2.5f \n", 19, '��', 199.9326);
		System.out.printf("���� : %4d �̸� : %s   Ű : %2.5f \n", 19, "������", 199.9326);
		
		System.out.println("\\");
		System.out.println("\"��\t��\n��\"\'");
	}
}
