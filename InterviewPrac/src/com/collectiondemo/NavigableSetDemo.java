package com.collectiondemo;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet();
		
		ts.add(1000);
		ts.add(2000);
		ts.add(3000);
		ts.add(4000);
		ts.add(5000);
		ts.add(6000);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(3000));
		System.out.println(ts.higher(2000));
		System.out.println(ts.lower(4000));
		System.out.println(ts.pollFirst());
		System.out.println(ts.descendingSet());
		System.out.println("------------------------");
		System.out.println(ts);
	}

}
