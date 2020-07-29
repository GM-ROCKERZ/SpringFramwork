package com.collectiondemo;

import java.util.TreeMap;

public class TreeMapwithComp {

	public static void main(String[] args) {

		TreeMap<String,Integer> t = new TreeMap(new MyCompareator());
		
		t.put("xxx", 10);
		t.put("aaa", 20);
		t.put("zzz", 30);
		t.put("lll", 40);
		System.out.println(t);
	}

}
