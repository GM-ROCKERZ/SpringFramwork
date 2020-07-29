package com.collectiondemo;

import java.util.Comparator;

public class MyCompareator implements Comparator {

	@Override
	public int compare(Object t1, Object t2) {

		String s1= t1.toString();
		String s2 = t2.toString();
		return s2.compareTo(s1) ;
	}
	

}
