package com.java.examples;

import java.io.*;

class StringReverse{
	
	public void StringRev(String s){
		
		char[] c=s.toCharArray();
		int j=c.length;
		System.out.println("Entered string length: "+j);
		
		String str="";
		
		for(int i=j-1;i>=0;i--){
			
			str=str+c[i];
		}
		System.out.println("Reversed string to entered is: "+str);
	}
}

public class ReverseString {

	public static void main(String[] args) throws IOException{
		
		StringReverse obj=new StringReverse();
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter anything");
		try{
			String s= br.readLine();
			obj.StringRev(s);
		}
		catch(Exception e){
			System.out.println("Enter only strings");
		}
	}
}
