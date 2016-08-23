package com.tutorial.exceptionHandling;

public class ExceptionExample {

	// Calling
	public static void main(String arg[]) throws Exception {

		Java ja = new Java();

		try {
			String x = ja.getName();
			x.length();
			
		} 
		
		catch ( NullPointerException e ) {
			
			
			System.out.println("I am taking care of Exception as i am calling method");
			
			
		} finally {
			System.out.println("Mandatory Conditions please do this for sure no matter you encountered with exception");
		}

	}
	
	
	public void testThrowKeyword() throws Exception{
		
		
		Java ja = new Java();

		try {
			String x = ja.getName();
			x.length();
			
		} 
		
		catch ( NullPointerException e ) {
			
			System.out.println("I am in ExceptionExample and will throw personalized exception message");
			
			e.printStackTrace();
			
			throw new Exception(" I will throw personalized exception ");
			
			
		} finally {
			System.out.println("Mandatory Conditions please do this for sure no matter you encountered with exception");
		}
	}

}

/***
 * 
 * 
 * 
 * 
 * Throwable : Java handles Exception using Throwable class
 * 
 * Error: Something from which our program cannot recover. Programs stops
 * completely. We wont be able to handle them programmatically.
 * 
 * 
 * Exceptions : Anything which interrupts the program flow is called Exceptions.
 * we will be able to do something about this programmatically. These are two
 * types
 * 
 * 
 * 
 * 1) Checked : these are something you predict and try to handle in your code
 * IO,SQL Exception 2) Unchecked :
 * nullpointer,arrayindexoutofbound,classnotfound class.forname
 * ,noclassdefinitionFound --
 * 
 * try/Catch block , finally, throw , throws keywords
 * 
 * You can have multiple catch blocks
 * 
 * Throws : is used to say that Called method will not handle exception instead
 * it will throw it to calling method. Its Calling methods responsibilty
 * 
 * Finally Block: is used to write code which should be executed even if we encounter an exception
 * 
 * 
 * We will have only one try block for multiple catch blocks. Vice versa is not true.
 * 
 * From Java 8 we can handle multiple exceptions in a single catch block
 * 
 * Final/Finally and Finalize
 * 
 * 
 * 
 * Calling Method : A method which invokes another method (for eg  :Operators Class we have method main ) 
 * Called Method : A method which gets invoked by another method  (eg : Exception class we have method main)
 **/
