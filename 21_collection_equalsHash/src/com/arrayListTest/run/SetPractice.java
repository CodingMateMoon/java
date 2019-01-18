package com.arrayListTest.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.collection.model.vo.Person;

public class SetPractice {

	public static void main(String[] args) {

		Set set = new HashSet();
		LinkedHashSet lhSet = new LinkedHashSet();
		TreeSet treeSet = new TreeSet();
		set.add("안녕하세요");
		set.add(new Person("테스트", 19, 179.4, 66.7));
		set.add(new Person("테스트2", 20, 179.4, 66.7));
		set.add(new Person("테스트3", 21, 179.4, 66.7));
		System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof String) {
				System.out.println("String : " + obj);
			} else if (obj instanceof Person) {
//				System.out.println("Person : " + ((Person)obj).getName());
				System.out.println("Person : " + obj);
			}
		}
	}

}
