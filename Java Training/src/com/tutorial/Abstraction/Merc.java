package com.tutorial.Abstraction;

public class Merc extends Car {

	@Override
	void speed() {

		
		System.out.println("Merc will have top speed 300");
		
	}

	@Override
	void features() {
		
		System.out.println("Merc provides wide variety of features");
		
	}

	@Override
	void carModel() {
		
		System.out.println("Merc offers both coupe and sedan");
		
	}

}
