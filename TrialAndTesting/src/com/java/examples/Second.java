package com.java.examples;

public class Second extends First {

	static int i=40;
	
	@Override
	public void display() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		 First obj = new First();
		 obj.display();
		 
		 System.out.println(i);
		 
		 System.out.println(obj.j);
		 
		 obj = new Second();
		 obj.display();
	}
}
