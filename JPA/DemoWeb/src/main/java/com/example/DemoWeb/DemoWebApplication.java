package com.example.DemoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context =SpringApplication.run(DemoWebApplication.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.showdata();

	}

}
