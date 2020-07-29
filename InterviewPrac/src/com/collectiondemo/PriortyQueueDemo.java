package com.collectiondemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyQueueDemo {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue();
		
		pq.offer("Gopal");
		pq.offer("Sachin");
		pq.add("Ravi");
		
		System.out.println(pq);
		Object[] arr=pq.toArray();
		
		for(int i=0 ;i<=arr.length;i++) {
			
			System.out.println(i);
		}
		
/*		Iterator<String> itr =  pq.iterator();
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next()+ " ");
		 }*/
	}

}
