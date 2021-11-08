package com;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quesion2 {
	public static void main(String[] args) {
		
		Map<Integer,Double> m1=new HashMap<>();
		
		m1.put(1,1.1);
		m1.put(2,2.2);
		m1.put(3,3.3);
		m1.put(4,4.4);
		m1.put(5,5.5);
		m1.put(6,6.6);
		m1.put(7,7.7);
		m1.put(8,8.8);
		m1.put(9,9.9);
		m1.put(10,10.10);
		
	    Set entrySet = m1.entrySet();
	 

	    Iterator<?> it = entrySet.iterator();
	 
	  
	    System.out.println("Values stored in HashMap: ");
	    while(it.hasNext()){
	       Map.Entry me = (Map.Entry)it.next();
	       System.out.println("Key is: "+me.getKey() + " & " + " value is: "+me.getValue());
	   }
	
		
	}

}
