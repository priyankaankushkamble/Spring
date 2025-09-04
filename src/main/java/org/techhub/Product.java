package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"org.sepspringtest"})

public class Product {
	@Bean(name="dataSource")
	public DriverManagerDataSource getDataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost://3306/mysql","root","root");

}
}