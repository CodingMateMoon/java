package objectStream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import objectStream.vo.Student;

public class StudentController {

	private ArrayList<Student> al;
	
	public StudentController() {
		loadData();
		if (al == null) {
			al = new ArrayList<Student>();
		}
	}
	
	public void init() {
		
		/*loadData();
		if (al == null) {
			al = new ArrayList<Student>();
		}*/
	}
	
	public void saveData() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))){
//			Student[] students = new Student[5];
			
			
			/*students[0] = new Student("하하하1", 20, 1980, "컴퓨터1", 1);
			students[1] = new Student("호호호", 21, 1985, "컴퓨터2", 2);
			students[2] = new Student("히히히", 23, 1982, "컴퓨터3", 5);
			students[3] = new Student("후후후", 24, 1987, "컴퓨터4", 4);
			students[4] = new Student("헤헤헤", 22, 1983, "컴퓨터5", 6);
			for (int i = 0; i < students.length; i++) {
				al.add(students[i]);
			}*/
			oos.writeObject(al);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveTemp(Student s) {
		al.add(s);
	}
	
	public void loadData() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))){
//			Student[] students = (Student[]) ois.readObject();
			
			
			/*for (Student s : students) {
				System.out.println(s);
			}*/
			
			al = (ArrayList<Student>) ois.readObject();
			for (Student s : al) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cne) {
			cne.printStackTrace();
		}
		/*if (al == null) {
			al = new ArrayList<Student>();
		}*/
	}
}
