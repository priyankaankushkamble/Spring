package org.techhub;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ProductApp {

	public static void main(String[] args) {
	
	
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter Product Id");
			int Id = xyz.nextInt();
			xyz.nextLine();

			System.out.println("Enter Product Name");
			String name = xyz.nextLine();

			System.out.println("Enter Price");
			int price = xyz.nextInt();

			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

			JdbcTemplate template = new JdbcTemplate(dataSource);
			template.execute("insert into sepspringtest values('0','"+name+"','"+price+"')");
			System.out.println("Save Record ....");
			
			 List<Map<String, Object>> rows = template.queryForList("select * from sepspringtest");

		        System.out.println("\nFetched Records:");
		        for (Map<String, Object> row : rows) {
		            System.out.println("Id: " + row.get("id") + 
		                               ", Name: " + row.get("name") + 
		                               ", Price: " + row.get("price"));
		}

	}
}

