package com.example.DemoSecurityUserID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String home() {
		
		String s1 = "<h1>Hello world</h1>";
		String s2 = "<br><a href=/logout>Logout</a>";
		return s1+s2;
		
	}
}
