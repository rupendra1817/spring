package com.javasportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(AppContext.class);
		
		Employee employee=context.getBean(Employee.class);
		employee.setName("Rahul Sharma (C.A)");
		employee.displayInfo();
		
		Student	student=context.getBean(Student.class);
		student.setName("Rahul Sharma");
		student.displayInfo();
	}

}
