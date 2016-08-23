package com.tutorial.JavaCollectionFramework;

import java.util.Map;

public class MapTester {

	public static void main(String[] args) {
		
		
		MapExample mapExample = new MapExample();
		Map artist =mapExample.getArtishMap();
		
		System.out.println("get value at Key 1 : "+artist.get(1));
		System.out.println("get KeySet :"+artist.keySet());
		System.out.println("get entrySet :"+artist.entrySet());
		System.out.println("Values in the map :"+artist.values());

	}

}
