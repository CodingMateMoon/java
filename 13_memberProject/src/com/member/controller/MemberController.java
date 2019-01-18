package com.member.controller;

import java.util.Scanner;

import com.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[5];
	private int index = 0;

//	public Member addMember() 
	public void addMember() {
		if (index < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("패스워드 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			/*
			 * m.setId(id); m.setPw(pw); m.setName(name); m.setAge(age);
			 */
			Member member = new Member(id, pw, name, age);
//		return m;
			m[index] = member;
			index++;
		}
	}

	public void updateMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (m[i].getId().equals(id)) {
				System.out.print("패스워드 : ");
				String pw = sc.nextLine();
				m[i].setPw(pw);
				System.out.print("이름 : ");
				String name = sc.nextLine();
				m[i].setName(name);
				System.out.print("나이 : ");
				int age = sc.nextInt();
				m[i].setAge(age);
			}
		}
	}

	public void updateMember2() {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		System.out.print("패스워드 : ");
		String pw = sc.nextLine();
		m.setPw(pw);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		m.setName(name);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		m.setAge(age);
	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("####회원 로그인!!!####");
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		boolean flag = true;

		for (int i = 0; i < index; i++) {
			if (m[i].getId().equals(id) && m[i].getPw().equals(pw)) {
				System.out.println("로그인 성공!");
				flag = false;
			}
		}
		if (flag) {
			System.out.println("로그인 실패");
		}
	}

	public void memberPrint(Member m) {
		System.out.println(m.getId() + " " + m.getPw() + " " + m.getName() + " " + m.getAge());
	}

//	public void show(Member m) 
	public void show() {
		for (int i = 0; i < index; i++) {
			System.out.printf("아이디 : %s, 비번 : %s, 이름 : %s, 나이 : %d\n", m[i].getId(), m[i].getPw(), m[i].getName(),
					m[i].getAge());
		}
	}
}
