package com.pawana.model;



public class Employee {
	
	private int id;
	private String name;
	private Department dept;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
