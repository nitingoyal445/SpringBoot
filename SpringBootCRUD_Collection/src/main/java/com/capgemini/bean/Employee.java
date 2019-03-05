package com.capgemini.bean;

public class Employee {
	
	private int id;
	private String name;
	private String Designation;
	private int Salary;
	public Employee(int id, String name, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		Designation = designation;
		Salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Designation=" + Designation + ", Salary=" + Salary + "]";
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	

}
