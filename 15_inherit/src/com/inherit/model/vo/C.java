package com.inherit.model.vo;

public class C extends A{

	private int age;
	
	public C() {}
	
	public C(String name, int age) {
		super(name); // this(name)
		this.age = age;
	}
	
	public C(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	protected int plus(int su1, int su2) {
		return su1 - su2;
	}
}
