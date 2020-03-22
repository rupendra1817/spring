package com.javasportal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				"applicationContext.xml");

		Employee employee = (Employee) context.getBean("employee");
		employee.setName("Rahul Sharma (C.A)");
		employee.displayInfo();
		context.registerShutdownHook();
	}

}
