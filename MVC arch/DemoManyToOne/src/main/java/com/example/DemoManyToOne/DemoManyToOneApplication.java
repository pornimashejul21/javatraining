package com.example.DemoManyToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoManyToOneApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		 context = SpringApplication.run(DemoManyToOneApplication.class, args);
		 
		 CartRepository car;
			car = context.getBean(CartRepository.class);
			   
		     ItemsRepository item;
		    item = context.getBean(ItemsRepository.class);
			
			
			Items i1 = new Items(100, 500,"abc");
			item.save(i1);
			
			
			Cart c1 = new Cart(100,"hsc");
			car.save(c1);
			
			
			
	}

}
