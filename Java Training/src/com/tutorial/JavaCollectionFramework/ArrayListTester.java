package com.tutorial.JavaCollectionFramework;

import java.util.Iterator;
import java.util.List;

public class ArrayListTester {

	public static void main(String[] args) {
		
		
		ArrayListExample listExample = new ArrayListExample();
		
		  List<String> arrayListResponse = listExample.getEmployeeArrayList();
		  
		
		for(String a : arrayListResponse){
			
			
			System.out.println(a);
			
		}
		
		Iterator iterator = arrayListResponse.iterator();
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
			
		}

	}

}
