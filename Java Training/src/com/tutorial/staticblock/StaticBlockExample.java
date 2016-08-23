package com.tutorial.staticblock;

public class StaticBlockExample {
	
	
	static String location;
	
	public StaticBlockExample(){
		
		
		
		System.out.println("This is default Constructor :"+location);
	}
	
	static {
		location = "HYd";
		System.out.println("I am initializer block or static block");
	}
	

}



/***
 * 
 * Let say we need some predefined values already set. Before creating an object
 * 
 * THis can be achieved using Static BLocks or Initializer Block
 * '
 * 
 
 * **/
