package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ColllectionsDemo {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		
		System.out.println(Collections.binarySearch(l,10 ,new MyComparator()));
		System.out.println(Collections.binarySearch(l,5 ,new MyComparator()));
		System.out.println(Collections.binarySearch(l,12 ,new MyComparator()));
	}

}
