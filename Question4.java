package com;

import java.util.Date;

public class Question4 {
	public static void main(String[] args) {
		Pair<String,String> p1=new Pair<>("hi","hello");
		System.out.println(p1.getKey()+" "+p1.getValue());
		
		Pair<String,String> p3=new Pair<>("100","hello");
		
		Pair<String,Date> p2=new Pair<>("Today is ",new java.util.Date());
		System.out.println(p2.getKey()+" "+p2.getValue());
	}

}
