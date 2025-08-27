package org.jdbcapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"org.jdbcapp"})
	public class Config {

			@Bean(name="dataSource")
			public DriverManagerDataSource getDataSource() {
				return new DriverManagerDataSource("jdbc:mysql://localhost://3306/mysql","root","root");
				
			}
			@Bean("template")
			public JdbcTemplate getTemplate() {
				return new JdbcTemplate(this.getDataSource());
			}
	}


