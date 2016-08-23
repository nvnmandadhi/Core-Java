package com.tutorial.JavaCollectionFramework;

import java.util.Iterator;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		
		
		SetExample setEx = new SetExample();
		
		Set setOfStudents = setEx.getSetOfAvailableStudents();
		
		Object[] arrayOfStudents = setOfStudents.toArray();
		
		
		
		// using for loop
		/*for (int i = 0; i < arrayOfStudents.length; i++) {
			
			System.out.println(arrayOfStudents[i]);
		}*/
		
		
		// Using Iterator
		
		Iterator iterator =  setOfStudents.iterator();
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
			
		}
		
		
		// Using Enhance for loop
		
		for( Object studentName :setOfStudents){
			System.out.println(studentName);
			
		}
		
	}

}
