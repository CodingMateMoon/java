package com.inherit.model.vo;

public class Student {

	private String name;
	private int age;
	private String address;
	private int grade;
	private int ban;
	private int num;
	
	public Student() {};
	public Student(String name, int age, String address, int grade, int ban, int num) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return name + " " + age + " " + address + " "+ grade + " " + ban + " " + num;
	}
}
