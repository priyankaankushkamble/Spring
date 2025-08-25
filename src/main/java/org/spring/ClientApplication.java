package org.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Company company=context.getBean(Company.class);
		company.show();
		context.close();
		

	}

}
