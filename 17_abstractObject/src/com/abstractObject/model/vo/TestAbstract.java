package com.abstractObject.model.vo;

public abstract class TestAbstract {
	
	private String name;
	
	public TestAbstract() {}

	public TestAbstract(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//추상 메소드를 선언하는 순간 클래스는 추상 클래스로 변경해주어야한다.
	public abstract void print();
}
