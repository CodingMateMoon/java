package com.variable.run;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VariableTest {

	private static int e;

	public static void main(String[] args) {
		// 나이를 저장하는 변수 만들기
		// 숫자 : 정수형, 변수명 : ?
		int age = 27;
		// 결혼 여부를 저장하는 변수를 만들어보자!
		// 진위값(true, false), 변수명 : ?
		boolean isMarried = false;

		// 몸무게 저장 변수
		// 숫자 : 실수형
		double weight = 100.5;
		float weight2 = 100.2f;

		// 월급 저장
		// 숫자 : 정수형
		int salary = 40;

		// 성별 저장 변수
		// 문자 : 남, 여, M, F
		String gender = "남자";
		char gender2 = 'M';

		// 재산을 보관하는 변수 선언
		// 숫자 : 2조, 변수명 :??
		long property = 10000000000000L;

		// 사원의 부서를 저장할 수 있는 변수 선언!
		// 부서의 값 : 자바학부로 초기화

		String department = "자바학부";

		// 사원의 보너스를 저장할 수 있는 변수
		// 값 : 0.03으로 초기화
		float bonus = 0.03f;

		int familyCnt = 3;

		boolean vacation = false;

		String address = "김포";

		// 상수의 선언과 초기화!
		final int age2;
		age2 = 27;

		String str = "유병승 19살";
		System.out.println(str);
		str = new String("유 20살");
		System.out.println(str);
		// String은 객체이기 때문에 new연산자 사용가능

		// 문자에서 +를 하면 결합이 된다.
		str = "왕찬웅" + "막내";
		System.out.println(str);
		// 결합할 때 변수를 활용할 수 있음
		str = "김미리 옆자리는 " + str;
		System.out.println(str);

		// 숫자(다른 자료형)과 문자를 결합했을 경우! '+'를 쓴 경우
		str = "정우진 " + 30 + 20;
		System.out.println(str);

		str = 1 + 2 + "왕찬웅 " + "김미리";
		System.out.println(str);

		// 문자 변수 응용해보기
		String name = "유병승";
		String address2 = "경기도 시흥시";
		String gen = "남";
		int age1 = 19;
		double height = 180.5;
		System.out.println(name + " " + address2 + " " + gen);

		// 키하고 나이 출력!
		System.out.println("" + age1 + height);
		Calendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.YEAR) + c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR) + " " + (c.get(Calendar.MONTH) + 1));
		
		// 데이터 오버플로우
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
		char ch = 'ㄱ';
		char ch2 = 'ㄴ';
		int su2 = ch;
		int su3 = ch2;
		System.out.println(su2);
		System.out.println(su3);
		System.out.println((int) 'A');
		
		long l = 123123123123123L;
		float f = l;
		System.out.println(f);
		
		// 계산을 할 때도 리터럴의 자료형이 같아야함!
		// 각 리터럴을 더 큰 자료형으로 자동형변환을 해줌
		System.out.println(100 + 100.2);
		
		// short, byte 자료형 연산 시 무조건 int형으로 변환하여 처리
		byte b3 = 100, b4 = 50;
		byte result = (byte) (b3 + b4);
		
		System.out.println("결과 : " + (b3 + b4));
		
		// 강제적 형변환
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
		
		System.out.printf("나이 : %4d 이름 : %-7s 키 : %2.5f \n", 19, '문', 199.9326);
		System.out.printf("나이 : %4d 이름 : %s   키 : %2.5f \n", 19, "문장현", 199.9326);
		
		System.out.println("\\");
		System.out.println("\"문\t장\n현\"\'");
	}
}
