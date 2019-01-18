package com.poly.model.vo;

public class Benz extends Car{

	private String model;
	private String cc;
	private String engine;
	
	public Benz() {}

	public Benz(String model, String cc, String engine) {
		super();
		this.model = model;
		this.cc = cc;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
}
