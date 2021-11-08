package com;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
	public static void main(String[] args) {
		
		Employee e1=new Employee(001, "Iron Man", 100000.00, "A");
		Employee e2=new Employee(002, "Captain America", 90000.00, "B");
		Employee e3=new Employee(003, "Thor ", 80000.00, "C");
		Employee e4=new Employee(004, "Hulk", 60000.00, "D");
		Employee e5=new Employee(005, "Loki", 50000.00, "E");
		
		Question1 q1=new Question1();
		
		Set<Employee> emp= new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
//		emp.add(q1);
		
		e1.displayDetails();

 
		
		
		
	}

}
