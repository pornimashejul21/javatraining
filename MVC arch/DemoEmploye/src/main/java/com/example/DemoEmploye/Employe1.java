package com.example.DemoEmploye;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe1 {

	@Id
	private int emp_id;
	private String emp_name;
	private int emp_salary;
	private String emp_ad;
	private String emp_email;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_ad() {
		return emp_ad;
	}
	public void setEmp_ad(String emp_ad) {
		this.emp_ad = emp_ad;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	
}
