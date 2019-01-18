package com.arrayListTest.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.collection.model.vo.Person;

import common.AscendingAge;
import common.AscendingHeight;
import common.AscendingName;
import common.DescendingHeight;
import common.DescendingName;

public class ArrayListController {

	public void arrayList() {
//		ArrayList list = new ArrayList();
//		List list = new ArrayList();
		Collection list = new ArrayList();
		// list에 객체를 넣어보자
		// 객체를 넣을 때는 add()메소드를 이용
		list.add("유병승");
		list.add("박진우");
		list.add("한혜진");

		// list 출력 get 메소드 이용 각 객체를 인덱스로 접근함
		// get()으로 불러온 인덱스의 객체는 주소값을 반환하기 때문에 일반객체랑 똑같이 멤버변수에 접근하면 된다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((List) list).get(i));
		}
		/*
		 * list.add(new Person("유병승", 19, 180.5, 65.4)); // list.clear(); list.add(new
		 * Person("정우진", 30, 173, 66.4)); list.add(new Person("김지섭", 28, 173, 67.4));
		 * list.add(new Person("왕찬웅", 20, 173, 67.4)); list.add(1, "내가 중간에 넣은것");
		 * list.remove(3); list.set(0, "임지안");
		 * 
		 * 
		 * for (int i = 0; i < list.size(); i++) { if (list.get(i) instanceof String) {
		 * System.out.println(list.get(i)); } else if (list.get(i) instanceof Person) {
		 * Person p = (Person) list.get(i); System.out.println(p.getName() + " " +
		 * p.getAge()); } }
		 */
	}

	public void sortList() {
		List list = new ArrayList();
		list.add("java");
		list.add("C언어");
		list.add("oracle");
		list.add("html");
		list.add("css");

		System.out.println("정렬 전 " + list);
//		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("reverse 후 : " + list);
		Collections.reverse(list);
		Collections.sort(list);
		System.out.println("정렬 후 : " + list);

	}

	public void customSort() {
		// List 객체를 정렬하기 위해서는 자바에서 제공하는 Comparator를 구현하여 처리
		List list = new ArrayList();
		list.add(new Person("유병승", 19, 180.5, 65.4));
		list.add(new Person("신재민", 26, 180.1, 60.4));
		list.add(new Person("김지섭", 28, 180.2, 62.4));
		list.add(new Person("박진우", 26, 180.3, 64.4));
		list.add(new Person("이일교", 28, 180.4, 61.4));
		System.out.println("변경전 : " + list);
		Collections.sort(list, new AscendingName());
		System.out.println("변경후 : " + list);
		Collections.sort(list, new DescendingName());
		System.out.println("내림차순 정렬 : " + list);
		Collections.sort(list, new AscendingAge());
		System.out.println("나이순 오름차순 정렬 : " + list);
		
		Collections.sort(list, new AscendingHeight());
		System.out.println("키 순 오름차순 정렬 : " + list);
		
		Collections.sort(list, new DescendingHeight());
		System.out.println("키 순 내림차순 정렬 : " + list);
	}
}
