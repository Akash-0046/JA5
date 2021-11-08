package com;

public class Employee {

	int id;
	String name;
	double salary;
	String department;
	
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Emolpyee Id: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Department: "+this.department);
		System.out.println("Employee Salary: "+this.salary);
		
	}
	
}
