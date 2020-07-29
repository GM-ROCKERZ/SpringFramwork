package com.collectiondemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String args[]) {
		
		Queue<Integer> q = new LinkedList();
		
		for(int i=0;i<=10;i++) {
			
			q.add(i);
		}
		System.out.println(q);
		
		System.out.println(q.peek());
		//System.out.println(q.poll());
		int removedel = q.remove();
        System.out.println("Removable int= "+ removedel);
        System.out.println(q); 
		
	}
	

}
