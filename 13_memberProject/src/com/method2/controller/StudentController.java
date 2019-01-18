package com.method2.controller;

import java.util.Scanner;

import com.method2.model.vo.Student;

public class StudentController {

	Scanner sc = new Scanner(System.in);
	public Student insertStudent() {
		String name;
		int grade, kor, math, eng, sum;
		double avg;
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		
	}
}
