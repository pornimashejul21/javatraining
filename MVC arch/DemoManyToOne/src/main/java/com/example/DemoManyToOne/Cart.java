package com.example.DemoManyToOne;
import java.util.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
public class Cart {
	
    @Id
	private int cart_id;
	private String uname;
	@OneToMany (mappedBy = "cartobj")
	private Set<Items> Items;
	
	public Cart() {
		
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

	public Cart(int cart_id, String uname, Set<com.example.DemoManyToOne.Items>Items) {
		super();
		this.cart_id = cart_id;
		this.uname = uname;
		
	}
	

	
	
}


