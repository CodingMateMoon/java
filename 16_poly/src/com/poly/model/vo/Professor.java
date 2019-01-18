package com.poly.model.vo;

public class Professor extends Person{

	
	private String major;
	private int empNum;
	private String subMajor;
	public Professor() {}
	public Professor(String name, int age, String address, String major, int empNum, String subMajor) {
		super(name, age, address);
		
		this.major = major;
		this.empNum = empNum;
		this.subMajor = subMajor;
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
		return "Professor [name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", major=" + major + ", empNum="
				+ empNum + ", subMajor=" + subMajor + "]";
	}
	
	public String information() {
		return "Professor : " + major + " " + empNum + " " + subMajor;
	}
	
}
