package com.javasportal;

public class Employee {
	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void displayInfo() {
		System.out.println("Employee Name: " + employeeName);
	}

}
