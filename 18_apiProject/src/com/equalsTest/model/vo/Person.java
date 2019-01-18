package com.equalsTest.model.vo;

import java.util.Objects;

/**
 * @author user2
 *
 */
public class Person {

	private String name;
	private int age;
	private String phone;

	public Person() {
	}

	public Person(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if(this.name.equals(p.getName()) 
					/*&& this.age == p.getAge() 
					&& this.phone.equals(p.getPhone())*/){
				return true;
			}
			else
				return false;
		}
		else
			return false;
		
	}
	
	@Override
	public int hashCode() {
//		return Objects.hash(name, age, phone);
		return Objects.hash(name);
	}
	
	@Override
	public Person clone()
	/*public Object clone()*/ {
//		return new Person(name, age, phone);
		Person p = new Person();
		p.setName(name);
//		p.setAge(age);
		p.setPhone(phone);
		return p;
	}

}
