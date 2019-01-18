package student.controller.run;

import student.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(3, 1, 1, "권오현");
		students[1] = new Student(2, 1, 4, "김준현");
		students[2] = new Student(3, 2, 2, "백주현");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].information());
		}
	}

}
