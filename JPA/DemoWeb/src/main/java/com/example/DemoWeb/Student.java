package com.example.DemoWeb;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
