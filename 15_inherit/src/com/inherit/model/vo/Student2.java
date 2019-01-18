package com.inherit.model.vo;

public class Student2 extends Person{
	
	/*private String name;
	private int age;
	private String address;
	private double height;
	private double weight;
	private String jumin;*/

	private int grade;
	private int ban;
	private int num;
	
	public Student2() {}

	public Student2(int grade, int ban, int num) {
		super(); // Person의 디폴트! == new Person()
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}
	
	public Student2(String name, int age, String address, double height, double weight, String jumin, 
			int grade, int ban, int num) {
		super(name, age, address, height, weight, jumin);
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student2 [ name = "+ super.getName() + ", age = " + super.getAge() + ", address = " + super.getAddress() + 
				" grade=" + grade + ", ban=" + ban + ", num=" + num + "]";
	}
	
	
}
