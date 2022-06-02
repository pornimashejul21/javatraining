package com.example.DemoManyToOne;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Items {
	int item_id;
	int item_cost;
	String item_desc;
	
	
	@ManyToOne
	@JoinColumn (name = "cart_id")
	private Cart cartobj;
	
	
	public Items() {
		
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


		

	public Items(int item_id, int item_cost, String item_desc, Set<com.example.DemoManyToOne.Items> Cart) {
		super();
		this.item_id = item_id;
		this.item_cost = item_cost;
		this.item_desc = item_desc;
	
}
	
}