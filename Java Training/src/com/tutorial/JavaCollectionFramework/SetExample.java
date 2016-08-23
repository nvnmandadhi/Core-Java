package com.tutorial.JavaCollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	
	
	@SuppressWarnings("rawtypes")
	public Set getSetOfAvailableStudents(){
		String a = "srikanth";
		String b = "naveen";
		String c = "sukanya";
		String d = "sunil";
		String e =  "Sunil";
		
		Set setA = new HashSet();
		
		setA.add(a);
		setA.add(b);
		setA.add(c);
		setA.add(d);
		setA.add(e);
		
		
		return setA;
	}



}
