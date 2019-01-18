package com.poly.model.vo;

public class Car {
	
	private String div;
	private String company;
	
	public Car() {}

	public Car(String div, String company) {
		this.div = div;
		this.company = company;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
}
