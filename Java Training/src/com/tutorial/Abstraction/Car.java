package com.tutorial.Abstraction;

public abstract class Car {
	
	abstract void speed();
	abstract void features();
	abstract void carModel();
	
	
	public void numOfTires(){
		
		System.out.println("All cars should have 4 tires");
	}
	
	
	/// speed
	// features
	//Type : coupe or sedan
	
	
	// Vendors :BMW, audi, merc
	
	

}


/* 
 * Abstract Class : ANy class declared with keyword abstract is called abstract class.
 * it can have both abstract methods and non abstract methods
 * any class which impements abstract class should implement this abstract methods
 * 
 * Abstract class should have atleast one abstract method
 * 
 * Abstracted Classes cannot be instantiated. They can only be extended or implemented
 * 
 * 
 * Abstract Method : Abstract method will have only method signature. And child class will have actual implementation
 * 
 * 
 * 
 * 
 * 
 * Annotations :Annotations provide us or classes with additional meta information
 * 
 * 
 * Contreate Class : ALl the methods will be implemented. 
 * 
 * Differences Between Concreate and Abstract Classes
*/ 