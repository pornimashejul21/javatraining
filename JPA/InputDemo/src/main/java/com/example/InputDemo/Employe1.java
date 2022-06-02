package com.example.InputDemo;



import com.example.InputDemo.Role1;

@Entity
@Table(name = "emp")
public class Employe1 {

	@Id
	private int emp_id;
	private String name;
	@InputDemo
	@JoinColumn(name="roll_id")
	private Role1 rollobj;
	
	public  Employe1() {
		
		
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role1 getRollobj() {
		return rollobj;
	}

	public void setRollobj(Role1 rollobj) {
		this.rollobj = rollobj;
	}

	