package com.javasportal;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Welcome Employee, " + name);
	}

	public void init() {
		System.out.println("Employee bean is going through init.");
	}

	public void destroy() {
		System.out.println("Employee bean will destroy now.");
	}
	 
}
