package com.poly.model.vo;

public class Bmw extends Car{

	private String model;
	private String fire;
	
	public Bmw() {
		// TODO Auto-generated constructor stub
	}

	public Bmw(String model, String fire) {
		this.model = model;
		this.fire = fire;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}
	
	
}
