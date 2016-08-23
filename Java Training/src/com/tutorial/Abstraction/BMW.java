package com.tutorial.Abstraction;

public class BMW extends Car{

	@Override
	void speed() {

		
		System.out.println("BMW will have top speed 300");
		
	}

	@Override
	void features() {
		
		System.out.println("BMW provides wide variety of features");
		
	}

	@Override
	void carModel() {
		
		System.out.println("Merc offers both coupe and sedan");
	}

	
	
	

}


// Any Child class which impements abstract class should implement its abstract methods
