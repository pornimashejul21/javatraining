package com.example.onetoonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoonedemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		
		context=SpringApplication.run(OnetoonedemoApplication.class, args);
		
		RoleRepository role;
		role = context.getBean(RoleRepository.class);
		
		EmployeRepository emp;
		emp = context.getBean(EmployeRepository.class);
		
		Role r1 = new Role(1, "Admin");
		role.save(r1);
		
		Employe e1 = new Employe(100, "abc", r1);
		emp.save(e1);
		
		
	}

}
