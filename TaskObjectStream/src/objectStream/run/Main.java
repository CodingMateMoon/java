package objectStream.run;

import java.util.Scanner;

import objectStream.controller.StudentController;
import objectStream.vo.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController sc = new StudentController();
//		sc.init();
		
		while (true) {
			//String name, int age, int number, String major, int grade
			System.out.println("***학생 정보 입력***");
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			System.out.print("번호 : ");
			int number = scan.nextInt();
			scan.nextLine();
			System.out.print("전공 : ");
			String major = scan.nextLine();
			System.out.print("학년 : ");
			int grade = scan.nextInt();
			scan.nextLine();
			Student s = new Student(name, age, number, major, grade);
			sc.saveTemp(s);
			System.out.println("추가 입력? (y/n) : ");
			char answer = scan.nextLine().charAt(0);
			if (answer == 'n' || answer == 'N') {
				sc.saveData();
				break;
			}
		}
		
	}

}
