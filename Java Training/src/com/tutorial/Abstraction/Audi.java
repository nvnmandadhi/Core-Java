package com.tutorial.Abstraction;

public class Audi extends Car {
	
	@Override
	void speed() {

		
		System.out.println("Audi will have top speed 300");
		
	}

	@Override
	void features() {
		
		System.out.println("Audi provides wide variety of features");
		
	}

	@Override
	void carModel() {
		
		System.out.println("Audi offers both coupe and sedan");
		
	}

}
