package com.practice2.model.entity;

public class Circle extends Point{

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void draw() {
		double area, circumference;
		area = Math.PI * radius * radius;
		circumference = 2 * Math.PI * radius;
		System.out.printf("Circle 좌표 : (%d, %d), 면적 : %.1f, 둘레 : %.1f \n", x, y, area, circumference);
	}
}
