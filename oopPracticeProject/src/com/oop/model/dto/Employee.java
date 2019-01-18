package com.oop.model.dto;

import java.util.Scanner;

public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
	}
	
	public Employee(int empNo, String empName, int salary, String dept, String job) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.job = job;
	}
	
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 :");
		empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 :");
		empName = sc.nextLine();
		System.out.print("소속부서 :");
		dept = sc.nextLine();
		System.out.print("직급 :");
		job = sc.nextLine();
		System.out.print("급여 :");
		salary = sc.nextInt();
	}
	
	public void empOutput() {
		System.out.println("사번 : " + empNo + ", 이름 : " + empName + ", 소속부서 : " + dept
				+ ", 직급 : " + job + ", 급여 : " + salary);
	}
}
