package com.adactin.BaseclassDemo;

public class PojoDemo {

	private String name; // Private element

	public String getName() { // getter method will have return
		return name;
	}

	public void setName(String name) { // setter will not have return type
		this.name = name;
	}

	//Using Right-Click-->Source-->Generate getter and setter
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}