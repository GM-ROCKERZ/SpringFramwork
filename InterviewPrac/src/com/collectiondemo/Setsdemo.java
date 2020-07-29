package com.collectiondemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setsdemo {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer> b =new HashSet();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,0,7,5}));

		Set<Integer> union = new HashSet(a);
		union.addAll(b);
		System.out.println("Union of the two sets are!!");
		System.out.println(union);


		Set<Integer> intersection = new HashSet(a);
		intersection.retainAll(b);
		System.out.println("intersection of the two sets are!!");
		System.out.println(intersection);

		Set<Integer> difference = new HashSet(a);
		difference.removeAll(b);
		System.out.println("differenece of the two sets are!!");
		System.out.println(difference);

	}

}
