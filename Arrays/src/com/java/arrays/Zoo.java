package com.java.arrays;

public class Zoo{

	public static void main(String[] args) {
		
		Animals[] animals = { new Dog("Doggy", "four legged animal"), new Cat("Kitty","cat is timid")};
		
		System.out.println(animals[0].display());
		System.out.println(animals[1].display());
		
	}

}
