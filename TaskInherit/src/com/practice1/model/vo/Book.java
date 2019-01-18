package com.practice1.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;
	
	public Book(String title, String author, int price) {
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
	public boolean equals(Object anObject) {
		if (this.toString().equals(anObject.toString())) {
			return true;
		}
		else
			return false;
	}
	
	
}
