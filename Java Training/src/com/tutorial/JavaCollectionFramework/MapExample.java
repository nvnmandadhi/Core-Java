package com.tutorial.JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	
	
	public Map<Integer, String> getArtishMap(){
		
		
		Map<Integer,String> artistMap = new HashMap<Integer,String>();
		artistMap.put(1,"Adele");
		artistMap.put(2, "justin");
		artistMap.put(3, "drake");
		
		
		return artistMap;
	}

}

/*
java.util.HashMap   ---- not thread safe / not synchronized , can have one null Key
java.util.Hashtable  ----- thread safe / synchronized  , doesnt allow key to be null
java.util.EnumMap
java.util.IdentityHashMap
java.util.LinkedHashMap
java.util.Properties   ----  
java.util.TreeMap   ---  
java.util.WeakHashMap
*/