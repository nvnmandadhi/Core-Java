package com.java.exceptions;

/* Modify the program and correct errors, if any, so that when you compile and execute it as 

java Case7 20,

it should print

You are eligible


if you execute it as, 

java Case7 10

it should print,

You are Not eligible
You should be atleast 18 years


if you execute it as

java Case7

it should print

Enter the age as command line argument


if you execute it as

java Case7 A

it should print

Enter only numbers

(Note : Use throws clause wherever appropriate)

*/



public class Case7 {
	public static void main(String args[]) {
		try {
			int i=Integer.parseInt(args[0]);
			Case7 obj=new Case7();
			obj.m1(i);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the age as command line argument");
		}
		catch(NumberFormatException e) {
			System.out.println("Enter only numbers");
		}
		catch(AgeException e) {
			System.out.println("You should be atleast 18 years!!!!");
		}
	}
	void m1(int age) throws AgeException{
			if(age<18)
				throw new AgeException();
			else
				System.out.println("You are eligible");	
	}
}

@SuppressWarnings("serial")
class AgeException extends Exception {
	public AgeException(){
		System.out.println("You are Not eligible");
	}
}
