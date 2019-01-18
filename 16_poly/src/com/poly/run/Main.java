package com.poly.run;

import com.poly.model.vo.Benz;
import com.poly.model.vo.Bmw;
import com.poly.model.vo.Car;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Professor;
import com.poly.model.vo.Sol;
import com.poly.model.vo.Student;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("승용차", "현대");
		System.out.println(car.getDiv() + car.getClass());
		// 다형성이란 상속관계에 있는 부모 자식 클래스 간에 자료형에 상관없이 부모 참조형 변수에 자식 객체가 대입될 수 있는 것
		Car car1 = new Benz("Eclass", "4", "8000"); // auto up casting
		System.out.println(((Benz) car1).getModel());

		// 상속관계인 자식클래스가 아니면 못들어감
		Car car2 = new Bmw();
		car1 = new Bmw();

		calculatorMember(new Employee("유병승", 19, "시흥", "자바", 100, 1));
		calculatorMember(new Student("신재민", 26, "서울시 동대문구", 3, 3, 3));
		calculatorMember(new Professor("박진우", 28, "남양주", "동영상보기", 50, "전자"));
		calculatorMember(new Sol());
		Employee[] emps = new Employee[10];
		Student[] students = new Student[10];
		Professor[] pros = new Professor[10];
		Sol[] sols = new Sol[10];

		Person[] persons = new Person[40];
		persons[0] = new Employee();
		persons[1] = new Student();
		persons[2] = new Professor();
		System.out.println(persons[0] instanceof Employee);
		
		/*for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				((Student) persons[i]).getGrade();
			} else if (persons[i] instanceof Employee) {

			} else if (persons[i] instanceof Student)
		}*/
		
		// 다형성을 이용한 동적바인딩 이용!
//		System.out.println(persons[0].information());
		Person p = new Student("신재민", 26, "서울", 3, 3 ,3);
		// 부모 참조 변수에 자식 객체가 대입이 되는 경우 부모한테 있는 필드 메소드 밖에 볼 수 없다.
		// Person 상속 Student - 자식 재정의
		System.out.println(p.information());
		
		p = new Employee("유병승", 19, "시흥", "자바학부", 1000, 10);
		System.out.println(p.information());
		System.out.println(persons[0].information());
		System.out.println(persons[1].information());
		persons[1].printa();
	}

	public static void calculatorMember(Person p) {

	}

	/*
	 * public static void calculatorMember(Sol s1) {
	 * 
	 * }
	 * 
	 * public static void calculatorMember(Student s1) {
	 * System.out.println(s1.getAge() + 1); System.out.println(s1.getGrade()); }
	 * 
	 * public static void calculatorMember(Professor p1) {
	 * System.out.println(p1.getAge() + 1); System.out.println(p1.getMajor()); }
	 * 
	 * public static void calculatorMember(Employee e1) {
	 * System.out.println(e1.getAge() + 1); System.out.println(e1.getDepartment());
	 * }
	 */
}
