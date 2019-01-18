package com.inherit.model.vo;

public class Beaksu {
	private String name;
	private int age;
	private String address;
	private int money;
	private int period;
	private String skill;
	
	public Beaksu() {}
	public Beaksu(String name, int age, String address, int money, int period, String skill) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.money = money;
		this.period = period;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Beaksu [name=" + name + ", age=" + age + ", address=" + address + ", money=" + money + ", period="
				+ period + ", skill=" + skill + "]";
	}
	
	
}
