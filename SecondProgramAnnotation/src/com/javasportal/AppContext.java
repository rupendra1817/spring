package com.javasportal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Employee employeeBean()
	{
		return new Employee();
	}
	
	@Bean()
	public Student studentBean()
	{
		return new Student();
	}
	
}
