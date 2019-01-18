package com.oop.array3.model;

public class BookCustom {

	// 제목, 출판사, 저자, 가격, 할인률
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public BookCustom(){}
	
	public BookCustom(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public BookCustom(String title, String publisher, String author, int price, 
			double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String information() {
		/*System.out.printf("title : %s, publisher : %s, author : %s, price : %d, discountRate : %f", 
				title, publisher, author, price, discountRate);*/
		String result = String.format("title : %s, publisher : %s, author : %s, price : %d, discountRate : %f", 
				title, publisher, author, price, discountRate);
		return result;
	}

	
}

