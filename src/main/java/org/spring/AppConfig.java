package org.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring")
public class AppConfig {


	    @Bean(name = "e")
	    public Employee employee() {
	        Employee emp = new Employee();
	        emp.setId(1);
	        emp.setName("ram");
	        emp.setSal(20000);
	        return emp;
	    }
	    @Bean
	    public Company company() {
	        return new Company();
	    }
}
