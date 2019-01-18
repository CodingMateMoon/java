package objectStream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import objectStream.vo.Student;

public class StudentController {

	private ArrayList<Student> studentList;
	
	public StudentController() {
//		studentList = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
		loadFile();
		if (studentList == null)
			studentList = new ArrayList<Student>();
		print();
	}
	
	public void saveData() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))){
			/*Student[] students = new Student[5];
			students[0] = new Student("하하하", 20, 1980, "컴퓨터1", 1);
			students[1] = new Student("호호호", 21, 1985, "컴퓨터2", 2);
			students[2] = new Student("히히히", 23, 1982, "컴퓨터3", 5);
			students[3] = new Student("후후후", 24, 1987, "컴퓨터4", 4);
			students[4] = new Student("헤헤헤", 22, 1983, "컴퓨터5", 6);
			
			for (int i = 0; i < students.length; i++) {
				studentList.add(students[i]);
			}*/
			/*for (int i = 0; i < studentList.size(); i++) {
				oos.writeObject(studentList.get(i));
			}*/
			oos.writeObject(studentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadFile() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))){
			/*Object obj = ois.readObject();
			if (obj instanceof ArrayList) {
				studentList = (ArrayList<Student>) ois.readObject();
			Student[] students = (Student[]) ois.readObject();
			for (Student s : students) {
				System.out.println(s);
			}
			
				for (Student s : studentList) {
					System.out.println(s);
				}
			}*/
			/*while (true) {
				Object obj = ois.readObject();
				if (obj instanceof Student) {
					
				}
			}*/
			studentList = (ArrayList<Student>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cne) {
			cne.printStackTrace();
		}
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	public void print() {
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
}
