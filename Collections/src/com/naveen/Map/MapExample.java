package com.naveen.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExample {

    public static void main(String[] args) {

	Map<String, Integer> accountMap = new TreeMap<>();

	accountMap.put("60115", 200);
	accountMap.put("60116", 390);
	accountMap.put("60114", 918);
	accountMap.put("60109", 305);
	accountMap.put("60100", 406);

	Set<Integer> numSet = new TreeSet<Integer>();

	numSet.add(10);
	numSet.add(20);
	numSet.add(30);
	numSet.add(15);
	numSet.add(22);
	numSet.add(24);
	numSet.add(-8);
	numSet.add(-45);

	Iterator<Integer> obj = numSet.iterator();

	while (obj.hasNext())
	    System.out.println(obj.next());

	for (String key : accountMap.keySet()) {
	    System.out.println(key + " " + accountMap.get(key));
	}
    }

}
