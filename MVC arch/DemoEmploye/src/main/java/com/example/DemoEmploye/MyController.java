package com.example.DemoEmploye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private Employe1Repository emp;
	
	@GetMapping

}
