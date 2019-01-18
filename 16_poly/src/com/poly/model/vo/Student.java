package com.poly.model.vo;

public class Student extends Person{


	private int grade;
	private int ban;
	private int num;
	
	public Student() {};
	public Student(String name, int age, String address, int grade, int ban, int num) {
		super(name, age, address);
		
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
	
	public String toString() {
		return super.getName() + " " + super.getAge() + " " + super.getAddress() + " "+ grade + " " + ban + " " + num;
	}
	
	public String information() {
		return "Student : " + grade + " " + ban + " " + num;
	}
	
	@Override
	public void printa() {
		System.out.println("I'm Student");
	}
}
