package com.java.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharToString {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter characters");
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		char c1 = 'H';
		char c2 = 'E';
		char c3 = 'Y';
		char c4 = '!';
	
		
		char[] c = {c1, c2, c3, c4};
		
		System.out.println(CharString(c));

	}

	private static String CharString(char[] c) {
		
		String result = "";
		String[] s = new String[c.length];
		
		for(int i=(c.length-1);i>=0;i--){
			
			s[i] = Character.toString(c[i]);
			System.out.println(s[i]);
			result = s[i]+result;
		}
		return result;
	}

}
