package com.generic.model.vo;

public class Product {

	private String name;
	private int price, size;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	
	
}
