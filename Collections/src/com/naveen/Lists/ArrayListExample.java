package com.naveen.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    static double time;

    public static void main(String[] args) {

	List<Double> linkedList = new LinkedList<>();

	List<Integer> arrayList = new ArrayList<>();

	time = System.currentTimeMillis();

	System.out.println(time);

	for (int i = 0; i <= 10; i++) {
	    linkedList.add(Math.random());
	}

	System.out.println(System.currentTimeMillis() - time);

	time = System.currentTimeMillis();

	System.out.println(time);

	for (int i = 0; i <= 10; i++) {
	    arrayList.add(i * 100);
	}

	System.out.println(System.currentTimeMillis() - time);

	Collections.reverse(arrayList);
	
	for (Double num : linkedList)
	    System.out.println(num);

	for (Integer num : arrayList)
	    System.out.println(num);
    }

}
