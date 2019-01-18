package com.practice1.model.vo;

public class BookCustom implements Cloneable{
	
	private String title;
	private String author;
	private int price;
	
	public BookCustom() {
		// TODO Auto-generated constructor stub
	}

	public BookCustom(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + author + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.toString().equals(obj.toString())) {
			return true;
		}
		else 
			return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
