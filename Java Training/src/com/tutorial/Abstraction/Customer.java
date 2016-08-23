package com.tutorial.Abstraction;

public class Customer {

	public static void main(String[] args) {
		
		Car c1 = new BMW();
		c1.carModel();
		c1.features();
		c1.speed();
		c1.numOfTires();
		
		
		
		Car c2 = new Merc();
		c2.carModel();
		c2.features();
		c2.speed();
		c2.numOfTires();
		
		
		Car c3 = new Audi();
		c3.carModel();
		c3.features();
		c3.speed();
		c3.numOfTires();
		
		
		
		

	}

}
