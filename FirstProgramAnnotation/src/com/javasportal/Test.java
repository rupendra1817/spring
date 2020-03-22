package com.javasportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(AppContext.class);
		
		Employee employee=(Employee) context.getBean("employee");
		employee.setName("Rahul Sharma (C.A)");
		employee.displayInfo();
		
		Student	student=(Student) context.getBean("student");
		student.setName("Rahul Sharma");
		student.displayInfo();
	}

}
