package com.inherit.run;

import com.inherit.model.vo.A;
import com.inherit.model.vo.B;
import com.inherit.model.vo.C;
import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Employee2;
import com.inherit.model.vo.Professor;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Student2;

public class Main {

	public static void main(String[] args) {
		/*A a = new A("나는 이미 생성된 변수!");
		System.out.println(a.getSuperName());
		
		B b = new B("생성 name", 19);
		System.out.println(b.getName() + b.getAge());
		
		C c = new C("난 안만들", 20);
		System.out.println(c.getSuperName());
		
		// 사람 관리 프로그램
		// 직업에 따라 관리 - 학생, 사원, 교수, 백수   
		// 공통필드 : 이름 나이 주소 주민번호 키 몸무게
		Student s = new Student("홍길동", 19, "경기도 시흥", 3, 4, 12);
		System.out.println(s.getName() + " " + s.getAge() + " " +s.getAddress() + " " +s.getGrade() + " " +s.getBan() + " " +s.getNum());
		System.out.println(s);
		
		Employee emp = new Employee("홍길동", 19, "경기도 시흥", "자바 학부", 100, 1);
		System.out.println(emp);
		Professor pf = new Professor("길동홍", 20, "안양", "컴퓨터", 10, "전자");
		System.out.println(pf);
		
		Student2 s1 = new Student2(); // 상속받은 Person 객체에서 name 가져옴!
		s1.setName("hong");
		s1.setAge(19);
		s1.setGrade(3);
		System.out.println(s1.getName() + s1.getAge() + s1.getGrade());
		System.out.println(s1);
		
		Employee2 emp2 = new Employee2();
		emp2.setName("길동홍");
		emp2.setDepartment("자바학부");
		emp2.setJumin("000224-1235678");
		emp2.setHeight(180.5);
		System.out.println(emp2.getName() + emp2.getDepartment() + " " + emp2.getJumin() + " " + emp2.getHeight());
		System.out.println(emp2);
		
		Student2 s2 = new Student2("길동홍", 19, "경기도 시흥", 180.5, 60.5, "000218-12345678", 3, 3, 1);
		System.out.println(s2);*/
		C c = new C();
//		System.out.println(c.plus(10, 20));
		Student2 s1 = new Student2();
	}

}
