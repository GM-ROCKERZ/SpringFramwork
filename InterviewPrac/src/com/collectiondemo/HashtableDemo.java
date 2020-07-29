package com.collectiondemo;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {

		Map h = new Hashtable();
		
		h.put("A", new TempHash(5));
		h.put("B", new TempHash(2));
		h.put("C", new TempHash(6));
		h.put("D", new TempHash(15));
		
		System.out.println(h);
	}

}
