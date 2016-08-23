package com.tutorial.JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListExample {

	public List<String> getEmployeeArrayList() {
		
		List<String> listA = new ArrayList<String>();  // not thread safe/ not synchronized
		
		SetExample setEx = new SetExample();
		
		//Collection c  = setEx.getSetOfAvailableStudents();
		
		
		listA.addAll(setEx.getSetOfAvailableStudents());
		
		return listA;

	}

	public List getEmployeeLinkedList() {
		
		List listB = new LinkedList();
		
		return listB;

	}

	public List getEmployeeVector() {

		
		List listc = new Vector();       // thread safe/ sychronized
		
		return listc;
	}

	public List getEmployeeStack() {
		
		List listd = new Stack(); 		// LIFO    push pop peek,  CustomStack class
		return listd;

	}

}
