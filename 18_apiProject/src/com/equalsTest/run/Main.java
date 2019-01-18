package com.equalsTest.run;

import com.equalsTest.model.vo.Member;
import com.equalsTest.model.vo.Person;

public class Main {

	public static void main(String[] args) {

		// variables : ${string_prompt}
		System.out.println(args + " " + args.length);
		/*args[0] = "하하";
		args[1] = "호호";
		args[2] = "히히";*/
		for (String a : args) {
			System.out.println(a);
		}
		args[0] = "이슬";
		args[1] = "처음";
		args[2] = "한라";
		for (String a : args) {
			System.out.println(a);
		}
		
		Person p1 = new Person("유병승", 19, "010-3644-6259");
		Person p2 = new Person("유병승", 19, "010-3644-6259");
		if (p1 == p2) {
			p2 = null;
		}
		/*if (p1.equals(p2)) {
			p2 = new Person();
		}*/
		System.out.println(p1.equals(new Member("aaaa", "aaa", "aaa")));
		System.out.println(p1 + " " + p1.hashCode());
		System.out.println(p2 + " " + p2.hashCode());
		
		Person p3 = /*(Person)*/ p1.clone();
		System.out.println(p3 + " " + p3.hashCode());
		
		Member m1 = new Member("gg123", "1234", "허허허");
		Member m2 = new Member("gg123", "5678", "호호호");
		System.out.println(m1.equals(m2));
		System.out.println(m1 + " " + m1.hashCode());
		System.out.println(m2 + " " + m2.hashCode());
	}

}
