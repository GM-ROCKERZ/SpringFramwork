package com.collectiondemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack();
		
		s.push("Gopal");
		s.push("Sachin");
		s.push("Praveen");
		s.push("Ravi");
		
		Iterator itr =  s.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next()+" ");
		}
		
		System.out.println("--------------------------------");
		
		s.pop();
		//System.out.println(s.peek());
		//System.out.println(s.pop());
		Iterator itr1 =  s.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next()+" ");
		}
		

	}

}
