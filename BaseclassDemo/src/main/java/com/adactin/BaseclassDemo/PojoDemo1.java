package com.adactin.BaseclassDemo;

public class PojoDemo1 {

	public static void main(String[] args) {
		
		//Class object = new Class();
		PojoDemo demo = new PojoDemo();
		
		//calling the method - object.method
		String s = demo.getName();
		
		System.out.println("Getter-Before Setter:" + s);
		
		//Calling a setter method
		
		 demo.setName("James");
		 
		 //No return type so we create a variable to store
		 String name = demo.getName(); //Again calling the method after setter
		 System.out.println("Setter-AfterSetter:" + name);
	}

}
