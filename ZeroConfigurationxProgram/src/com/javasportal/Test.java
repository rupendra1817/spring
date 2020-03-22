package com.javasportal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(
				AppContext.class);

		Employee employee = (Employee) context.getBean(Employee.class);
		employee.setName("Rahul Sharma (C.A)");
		employee.displayInfo();
		context.registerShutdownHook();
	}

}
