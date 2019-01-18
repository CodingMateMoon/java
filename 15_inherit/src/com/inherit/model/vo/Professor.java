package com.inherit.model.vo;

public class Professor {

	private String name;
	private int age;
	private String address;
	private String major;
	private int empNum;
	private String subMajor;
	public Professor(String name, int age, String address, String major, int empNum, String subMajor) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.major = major;
		this.empNum = empNum;
		this.subMajor = subMajor;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getSubMajor() {
		return subMajor;
	}
	public void setSubMajor(String subMajor) {
		this.subMajor = subMajor;
	}
	@Override
	public String toString() {
		return "Professor [name=" + name + ", age=" + age + ", address=" + address + ", major=" + major + ", empNum="
				+ empNum + ", subMajor=" + subMajor + "]";
	}
	
	
}
