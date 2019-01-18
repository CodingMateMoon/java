package com.inherit.model.vo;

public class Employee2 extends Person {
	private String department;
	private int salary;
	private int empNo;

	public Employee2() {}
	public Employee2(String department, int salary, int empNo) {
		super();
		this.department = department;
		this.salary = salary;
		this.empNo = empNo;
	}
	
//	public Employee2(String name, int age, String address)

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

	@Override
	public String toString() {
		return "Employee2 [department=" + department + ", salary=" + salary + ", empNo=" + empNo + "]";
	}

}
