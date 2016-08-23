package com.tutorial.langpackage;

public class StringComparision {

	public static void main(String[] args) {
		
		String a= new String("1");    
		String b = new String("1");
		
		String sentence1 = "   he is a poet";
		String sentence2="HE IS A POET";
		
		String x = "1";
		String y = "1";
		
		String c =a;
		
		if(a==b){  // Its Comparing memory location . new it allocated new memory location. Even though the values are same ,these two are not equal
			System.out.println("true using == ");
		}else{
			System.out.println("false using ==");
		}
		
		if (x==y){ // Its Comparing memory location. x and y are pointing to same memory location which stored value as 1. SO it print equals
			
			System.out.println("x is equal to y");
		
		}else{
			
			System.out.println("x is not equal to y");
			
		}
		
		if(c==a){ // a and c are points to same address so.. it prints equals
			System.out.println("C is equal to a");
		}else{
			System.out.println("C is not equal to a");
		}
		
		
		// Using Equals Method
		
		if (a.equals(b)){
			
			System.out.println(" a is equal to b using equals method");
			
		}
		
		if(sentence1.trim().equalsIgnoreCase(sentence2.trim())){
			System.out.println("sentence 1  is equal to sentence 2");
			
		}else{
			System.out.println("sentence 1  is not equal  to sentence 2");
			
		}
		
		// 

	}

}

/*
 *  ==  : It compares memory of an object. Basically is 2 object names are basically references to same memory location
 *  equals method : This is in Object Class. If you are trying to compare any object like String or user defined , we will go with equals method
 *  This will compare values of a string or object.
 * 
 * Starts with , Substring , uppercase , lowercase,trims, endswith
 * */
