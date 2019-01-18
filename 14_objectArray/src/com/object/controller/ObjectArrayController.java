package com.object.controller;

import com.object.model.vo.Car;

public class ObjectArrayController {

	public static void main(String[] args) {
		// 객체 배열 선언 및 할당
		/*Person[] persons = new Person[5];
		System.out.println("할당 전 : " + persons[0]);
		System.out.println("할당 전 : " + persons[1]);
		
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}
		
		persons[0] = new Person(); // == Person p = new Person();
		
		System.out.println("할당 후 : " + persons[0]);
		System.out.println("할당 전 : " + persons[1]);
		
		
		System.out.println(persons[0].getName());
		persons[0] = new Person("유병승", 19, "시흥시 정왕동");
		System.out.println(persons[0].getName());
		persons[1] = new Person();
		persons[1].setName("왕찬웅");
		persons[1].setAge(20);
		persons[1].setAddress("일산");
		System.out.println(persons[1].getName());
		// 객체 배열에 있는 객체에 값을 넣을 때는 생성자를 이용하여 값 초기화
		// 참조형 변수안에 아무것도 없는 경우, null 일 때 : NullPointerException
//		persons[0].getName(); 
		// 선언과 동시 할당 및 초기화
		Person[] persons2 = {new Person(), new Person(), new Person()};
		System.out.println(persons2[0].getName());
		System.out.println(Arrays.toString(persons2));
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getName());
		}
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}*/
	/*	Car car1 = new Car("쏭나타", 1000, "회색", false);
		Car car2 = new Car("그란죠", 5000, "검은색", false);
		Car car3 = new Car("쏜란토", 4000, "흰색", false);
		
		// 한 사용자가 우리가게에 있는 모든 차량을 보고싶다!
		System.out.println(car1.getName() + " " + car1.getPrice() + " " + car1.getColor() + " " + car1.getSold());
		System.out.println(car2.getName() + " " + car2.getPrice() + " " + car2.getColor() + " " + car2.getSold());
		System.out.println(car3.getName() + " " + car3.getPrice() + " " + car3.getColor() + " " + car3.getSold());
		
		// 그 중에서  쏭나타를 찾고 싶어! 차량 검색!
		if(car1.getName().equals("쏭나타")) {
			
		}
		else if (car2.getName().equals("쏭나타")) {
			
		}
		else {}*/
		Car[] cars = new Car[3];
		cars[0] = new Car("쏭나타", 1000, "회색", false);
		cars[1] = new Car("그란죠", 5000, "검은색", false);
		cars[2] = new Car("쏜란토", 4000, "흰색", false);
		// 차량 전체를 확인하고 싶어
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].getName() + " " + cars[i].getPrice() + " " + cars[i].getColor() + " " + cars[i].getSold());
		}
		
		for (Car c : cars) {
			if (c.getName().equals("쏭나타")) {
				System.out.println(c.getName() + " " + c.getColor());
			}
		}
		int finder = -1;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getName().equals("쏭나타")) {
				finder = i;
			}
		}
		System.out.println(cars[finder].getName() + " " + finder);
	}
}
