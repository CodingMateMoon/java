package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Employee;

public class CollectionController {

	public void printEmployee() {
		ArrayList al = new ArrayList();
		al.add(new Employee("홍길동", 29, "대리", 300));
		al.add(new Employee("이순신", 30, "과장", 500));
		al.add(new Employee("유병승", 18, "사장", 1000));
		al.add(new Employee("장길산", 85, "고문", 10));
		al.add(new Employee("용석", 26, "인턴", 1));
		al.add(new Employee("유병승", 18, "사장", 1000));
		
		System.out.println(al);
		Set set = new HashSet(al);
		System.out.println("Set : " + set);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.println(e.getName() + " " + e.getAge());
		}
	}
}
