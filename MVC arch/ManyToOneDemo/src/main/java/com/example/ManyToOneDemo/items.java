package com.example.ManyToOneDemo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class items {
	int item_id;
	int item_cost;
	String item_desc;
	
	
	@ManyToOne
	@JoinColumn (name = "cart_id")
	private cart cartobj;
	
	
	public items() {
		
	}


	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}


	public int getItem_cost() {
		return item_cost;
	}


	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}


	public String getItem_desc() {
		return item_desc;
	}


	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}


	public cart getCartobj() {
		return cartobj;
	}


	public void setCartobj(cart cartobj) {
		this.cartobj = cartobj;
	}
	
	

}

