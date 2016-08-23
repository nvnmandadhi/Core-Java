package com.java.examples;

public class People {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.feature();
		System.out.println(obj.property);
		
		Father obj1 = new Father();
		obj1.feature();
		System.out.println(obj1.property);
		
		obj1 = new Child();	//Dynamic type has been changed to Child
		obj1.feature();
		System.out.println(obj1.property); //Is it because of the Object type Father of obj1?

		
	}

}
