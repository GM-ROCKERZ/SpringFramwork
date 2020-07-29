package com.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> dq = new ArrayDeque();
		
		dq.add("elemnet 1 (tai)");
		dq.addFirst("element 2 (head)");
		dq.addLast("element 3 (tail)");
		dq.push("Element 5 (head)");
		dq.offer("elment 6 (tail)");
		dq.offerFirst("element 8 (head)");
		System.out.println(dq);
		dq.removeLast();
		dq.removeFirst();
		System.out.println(dq);
		
		Iterator itr = dq.descendingIterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next()+" ");
		}
		
		
	}

}
