package com.inherit.model.vo;

public class Employee {

	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;
	private int empNo;
	double height;
	double weight;
	
	public Employee() {}
	

	public Employee(String name, int age, String address, String department, int salary, int empNo) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.salary = salary;
		this.empNo = empNo;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String toString() {
		return name +" " + age + " " + address + " " + department + " " + salary + " " + empNo;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
