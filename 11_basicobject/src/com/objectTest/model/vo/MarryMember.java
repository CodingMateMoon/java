package com.objectTest.model.vo;

public class MarryMember {
	//멤버변수, 캡슐화가 되어있어서 각 데이터에 접근못함
	private String name;
	private int age;
	private double height;
	private double weight;
	private long salary;
	private long property;
	private String[] holic;
	private int[] years;
	private DefaultTest df; // 객체도 멤버변수 가능!
	
	//default 생성자
	public MarryMember() {
		DefaultTest df = new DefaultTest();
	}
	// 데이터를 접근하기 위한 getter/setter만들어줘야함
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(!name.equals(""))
			this.name = name;
		else
			System.out.println("이름에 공백은 들어갈 수 없습니다!");
	}
}
