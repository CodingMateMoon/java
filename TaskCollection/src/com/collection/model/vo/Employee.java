package com.collection.model.vo;

import java.util.Objects;

public class Employee {

	private String name;
	private int age;
	private String position;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String position, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (name.equals(e.getName())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
