package com.collectiondemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	static TreeMap<Integer,String> treemap;

	static void create() {

		treemap=new TreeMap();

		System.out.println("TreeMap is created");
	}

	static void insert() {

		treemap.put(1, "Practice");
		treemap.put(2, "makes");
		treemap.put(3, "mens");
		treemap.put(4, "Perfect");
		System.out.println("\nInserted the element successfully: "+treemap);

	}

	static void search(int key) {

		System.out.println("\nIs Key prsent? "+key+":"+treemap.containsKey(key));

	}

	static void search(String value) {

		System.out.println("\nIs value prsent? "+value+":"+treemap.containsValue(value));

	}
	
	static void dispaly() {
		
		System.out.println("\nDisplaying the TreeMap");
		System.out.println("\n TreeMap:"+treemap);
	}

	static void traverse() {
		
		for (Map.Entry<Integer, String> m:treemap.entrySet()) {
			
			System.out.println(m.getKey()+" "+":"+m.getValue());
		}
	}
}
