package com.example.ManyToOneDemo;
import java.util.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
public class cart {
	
    @Id
	private int cart_id;
	private String uname;
	@OneToMany (mappedBy = "cartobj")
	private Set<items> items;
	
	public cart() {
		
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public cart(int cart_id, String uname, Set<com.example.ManyToOneDemo.items> items) {
		super();
		this.cart_id = cart_id;
		this.uname = uname;
		
	}
	

	
	
}

