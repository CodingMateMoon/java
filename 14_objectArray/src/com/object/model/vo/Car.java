package com.object.model.vo;

public class Car {

	private String name;
	private long price;
	private String color;
	private boolean sold; // true : 팔림, false : 안팔림
	
	public Car() {}
	
	public Car(String name, long price, String color, boolean sold) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.sold = sold;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean getSold() {
		return sold;
	}
	
	public void setSold(boolean sold) {
		this.sold = sold;
	}
}
