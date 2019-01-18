package com.practice2.model.entity;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		double area, circumference;
		area = width * height;
		circumference = 2 * (width + height);
		System.out.printf("Rectangle 좌표 : (%d, %d), 면적 : %.1f, 둘레 : %.1f \n", x, y, area, circumference);
	}
}
