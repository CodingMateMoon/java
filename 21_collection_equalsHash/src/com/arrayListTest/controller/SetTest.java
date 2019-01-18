package com.arrayListTest.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.collection.model.vo.Person;

public class SetTest {
	public static void main(String[] args) {

		new SetTest().hashSet();
	}

	public void hashSet() {

		HashSet set = new HashSet();
		Set set1 = new HashSet();
		set.add("유병승");
		set.add("신재민");
		set.add("왕찬웅");
		set.add("왕찬웅");
		set.add("정우진");
		set.add("윤준혁");
		set.add("임지안");
		set.add("유병승");
		set.add("신재민");
		set.add("왕찬웅");
		set.add("왕찬웅");
		set.add("정우진");
		set.add("윤준혁");
		set.add("임지안");
		System.out.println(set);

		// 객체를 하나씩 출력할 때!
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		set.clear();
		System.out.println(set);
		set.add(new Person("유병승", 19, 180.5, 65.4));
		set.add(new Person("신재민", 19, 180.5, 65.4));
		set.add(new Person("왕찬웅", 19, 180.5, 65.4));
		set.add(new Person("정우진", 19, 180.5, 65.4));
		System.out.println(set);

		// iterator는 재사용이 불가능하다
		it = set.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			p.setWeight(10000);
		}
		System.out.println(set);

		ArrayList list = new ArrayList();
		list.add(new Person("유병승", 19, 180.5, 65.4));
		list.add(new Person("신재민", 19, 180.5, 65.4));
		list.add(new Person("왕찬웅", 19, 180.5, 65.4));
		list.add(new Person("정우진", 19, 180.5, 65.4));
		list.add(new Person("유병승", 19, 180.5, 65.4));
		list.add(new Person("신재민", 19, 180.5, 65.4));
		list.add(new Person("왕찬웅", 19, 180.5, 65.4));
		list.add(new Person("정우진", 19, 180.5, 65.4));
		System.out.println("---------list 출력 -----------------");
		System.out.println(list);
		System.out.println("---------list 출력 종료 -----------------");
		/*
		 * if(list.get(0).equals(list.get(1))) list.remove(1);
		 */
		set = new HashSet(list);
		list = new ArrayList(set);
		System.out.println(list);

		TreeSet treeset = new TreeSet();
		treeset.add("정우진");
		treeset.add("신재민");
		treeset.add("유병승");
		treeset.add("박진우");
		treeset.add("손성식");
		System.out.println(treeset);
	}
}
