package com.inherit.model.vo;

public class Person{

	private String name;
	private int age;
	private String address;
	private double height;
	private double weight;
	private String jumin;
	
	public Person() {}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	public Person(String name, int age, String address, double height, double weight, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.jumin = jumin;
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

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", height=" + height + ", weight="
				+ weight + ", jumin=" + jumin + "]";
	}
	
	
	
}
