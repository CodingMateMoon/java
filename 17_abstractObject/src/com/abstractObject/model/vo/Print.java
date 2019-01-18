package com.abstractObject.model.vo;

public interface Print {
	
	String name = "a";
//	public static final String name = "a";
	// 인터페이스는 abstract 메소드만 사용 가능
	public abstract void print();
	void scanner();
	void copy();
}
