package com.example.DemoController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoControllerApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context =SpringApplication.run(DemoControllerApplication.class, args);
	}

}
