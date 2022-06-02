package com.example.ManyToOneDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ManyToOneDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		 context = SpringApplication.run(ManyToOneDemoApplication.class, args);
		 
		    itemsRepository item;
			item = context.getBean(itemsRepository.class);
			
			cartRepository car;
			car = context.getBean(cartRepository.class);
			
			cart c1 = new cart();
			car.save(c1);
			
			items i1 = new items(100,"laptop",800);
			item.save(i1);
			
			
	}

}
