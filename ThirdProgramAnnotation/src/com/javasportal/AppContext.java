package com.javasportal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean(name = "employee", initMethod = "init", destroyMethod = "destroy")
	public Employee employeeBean() {
		return new Employee();
	}

}
