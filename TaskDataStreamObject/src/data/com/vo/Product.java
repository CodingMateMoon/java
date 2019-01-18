package data.com.vo;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5088168384475890116L;
	private String name;
	private double price;
	private int count;
	private double discountRate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, int count, double discountRate) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", count=" + count + ", discountRate=" + discountRate
				+ "]";
	}
	
	
	
	
}
