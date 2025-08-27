package org.jdbcapp;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class TestConnect {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
			

			
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = xyz.nextLine();

			System.out.println("Enter Email");
			String email = xyz.nextLine();

			System.out.println("Enter Contact");
			String contact = xyz.nextLine();

			JdbcTemplate template=(JdbcTemplate)context.getBean("template");
			template.execute("insert into springjdbcapp values('0','"+name+"','"+email+"','"+contact+"')");
			System.out.println("Record Save....");
		}

}

