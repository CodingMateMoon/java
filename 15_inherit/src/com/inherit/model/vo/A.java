package com.inherit.model.vo;

public class A {

	private String superName;
	
	public A() {}
	
	public A(String superName) {
		this.superName = superName;
	}
	
	public void setSuperName(String superName) {
		this.superName = superName;
	}
	
	public String getSuperName() {
		return superName;
	}
	
	
	protected int plus(int su1, int su2) {
		return su1 + su2;
	}
}
