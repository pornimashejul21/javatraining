package com.example.InputDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.InputDemo;
import javax.persistence.Table;

import com.example.InputDemo.Employe1;

@Entity
@Table(name = "role")
public class Role1 {
	
	@Id
	private int roll_id;	
	private String roll_desc;
	
    @InputDemo(mappedBy ="rollobj" )
	private Employe1 emp;
	
    public Role1() {
    	
    }

	public int getRoll_id() {
		return roll_id;
	}

	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}

	public String getRoll_desc() {
		return roll_desc;
	}

	public void setRoll_desc(String roll_desc) {
		this.roll_desc = roll_desc;
	}

	public Employe1 getEmp() {
		return emp;
	}

	public void setEmp(Employe1 emp) {
		this.emp = emp;
	}
    