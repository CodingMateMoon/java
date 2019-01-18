package objectStream.vo;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4667594321096237439L;
	private String name;
	private int age, number;
/*	private String major;
	private int grade;*/

	public Student(String name, int age, int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		
	}
	
	/*public Student(String name, int age, int number, String major, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.major = major;
		this.grade = grade;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", number=" + number + "]";
	}

/*	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}*/

	
	
	
}
