package com.generic.model.vo;

public class GenericTest<T, U> {

	private T name;
	private U age;
	private double height;
	private double weight;
	
	public GenericTest() {
	}
	
	public GenericTest(T name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public T getName() {
		return name;
	}
	
	public void setAge(U age) {
		this.age = age;
	}
	
	public U getAge() {
		return age;
	}
}
