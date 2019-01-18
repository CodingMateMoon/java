package com.array1.controller;

import java.util.Scanner;

import com.oop.array1.model.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address, jumin;
		int i, age;
		double height, weight, avgAge = 0, avgHeight = 0, avgWeight = 0;
		Person[] persons = new Person[5];
		int length = persons.length;
		// 이름, 나이, 주소, 키, 몸무게, 주민번호
		for(i = 0; i < length; i++) {
			System.out.print("이름 :");
			name = sc.nextLine();
			System.out.print("나이 : ");
			age = sc.nextInt();
			sc.nextLine();
			System.out.print("주소 :");
			address = sc.nextLine();
			System.out.print("키 : ");
			height = sc.nextDouble();
			System.out.print("몸무게 : ");
			weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("주민번호 : ");
			jumin = sc.nextLine();
			avgAge += age;
			avgHeight += height;
			avgWeight += weight;
			persons[i] = new Person(name, age, address, height, weight, jumin);
		}
		
		for (i = 0; i < persons.length; i++) {
			System.out.println(persons[i].toString());
		}
		
		avgAge /= length;
		avgHeight /= length;
		avgWeight /= length;
		System.out.println("나이 : " + avgAge + " 키 : " + avgHeight + " 몸무게 : " + avgWeight);
	}

}
