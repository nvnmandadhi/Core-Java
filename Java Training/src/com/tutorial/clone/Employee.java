package com.tutorial.clone;

public class Employee implements Cloneable {
	
	int employeeId;
	String name;
	
	Employee(int employeeId,String name){
		
		this.employeeId=employeeId;
		this.name=name;
		
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}

/***
 * 
 * Cloneable is a MarkUp interface .
 * 
 * Markup Interface : An Interface which doesnt have any method signatures.
 * 
 * This provides additioinal information to JVM
 * 
 */
