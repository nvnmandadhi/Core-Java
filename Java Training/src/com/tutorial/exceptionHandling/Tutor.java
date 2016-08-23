package com.tutorial.exceptionHandling;

public class Tutor {

	public static void main(String[] args) {
		
		
		
		ExceptionExample ea = new ExceptionExample();
		
		try {
			ea.testThrowKeyword();
		} catch (Exception e) {
			
			System.out.println("I am in Tutor Class : Catch block");
			e.printStackTrace();
		}

	}

}
