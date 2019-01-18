package objectStream.run;

import java.util.Scanner;

import objectStream.controller.StudentController;
import objectStream.vo.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentController scr = new StudentController();
		scr.loadFile();
		System.out.print("이름 : ");
		String name= sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		Student s = new Student(name, age, num);
		scr.addStudent(s);
		/*Student[] students = new Student[5];
		students[0] = new Student("하하하", (int) (Math.random() * 20), 1980, "컴퓨터1", 1);
		students[1] = new Student("호호호", (int) (Math.random() * 20), 1985, "컴퓨터2", 2);
		students[2] = new Student("히히히", (int) (Math.random() * 20), 1982, "컴퓨터3", 5);
		students[3] = new Student("후후후", (int) (Math.random() * 20), 1987, "컴퓨터4", 4);
		students[4] = new Student("헤헤헤", (int) (Math.random() * 20), 1983, "컴퓨터5", 6);*/
		scr.print();
		scr.saveData();
	}

}
