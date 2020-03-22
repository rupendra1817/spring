package com.javasportal;

public class Company {

	private String companyName;

	private Employee employee;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void displayInfo() {
		System.out.println("Company Name : " + companyName);
	}

}
