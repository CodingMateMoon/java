package com.array2.controller;

import java.util.Scanner;

import com.oop.array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[10];
		int grade, kor, math, eng, sum, i, index = 0;
		double avg;
		String name;
		char flag;
		while (true) {
			// 이름 학년 국 수 영 합 평균
			System.out.println("********학생 정보 입력********");
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
			sc.nextLine();
			students[index] = new Student(name, grade, kor, math, eng);
			students[index].setSum(students[index].getKor() + students[index].getMath() + 
					students[index].getEng());
			students[index].setAvg(students[index].getSum() / 3.0);
			index++;
			System.out.print("계속 추가하시겠습니까?(y/n) : ");
			flag = sc.nextLine().charAt(0);
			if (!(flag == 'y' || flag == 'Y')) {
				for (i = 0; i < index; i++) {
					System.out.println(students[i].toString());
				}
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
