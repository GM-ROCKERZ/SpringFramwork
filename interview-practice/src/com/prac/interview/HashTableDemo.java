package com.prac.interview;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Temp, String> h=new Hashtable<>();
		
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		
		System.out.println(h);
	}

}
