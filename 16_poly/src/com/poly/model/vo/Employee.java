package com.poly.model.vo;

public class Employee extends Person{

	
	private String department;
	private int salary;
	private int empNo;
	
	
	public Employee() {}
	

	public Employee(String name, int age, String address, String department, int salary, int empNo) {
		super(name, age, address);
		
		this.department = department;
		this.salary = salary;
		this.empNo = empNo;
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

	public String information() {
		return "Employee : " + department + " " + salary + " " + empNo;
	}
	
	
}
