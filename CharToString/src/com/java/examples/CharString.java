package com.java.examples;

import java.util.Scanner;

public class CharString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		
		System.out.println("Enter the string to be reversed!!!!");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringRev(s);
	}

	private static void StringRev(String s) {
		
		char[] c = s.toCharArray();
	
		String result = "";
		
		for(int i=c.length-1;i>=0;i--){
			
			result = result+c[i];
		}
		
		System.out.println("Reversed String is " + result);
	}
}
