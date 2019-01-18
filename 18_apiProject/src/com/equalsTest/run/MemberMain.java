package com.equalsTest.run;

import com.equalsTest.model.vo.Member;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member("gg123", "1234", "허허허");
		Member m2 = new Member("gg123", "5678", "호호호");
		System.out.println(m1.equals(m2));
		System.out.println(m1 + " " + m1.hashCode());
		System.out.println(m2 + " " + m2.hashCode());
	}

}
