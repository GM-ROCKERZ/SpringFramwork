package com.collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> hm = new HashMap();

		hm.put(101, "Amit");
		hm.put(102, "Gopal");
		hm.put(103, "Ravi");
		hm.put(104, "Ram");
		System.out.println(hm);

		Set<Map.Entry<Integer,String>> st = hm.entrySet();
		System.out.println(st);
		Collection<String> c = hm.values();
		System.out.println(c);
		Set<Integer> st1 =hm.keySet();
		System.out.println(st1);
		Iterator itr = st.iterator();

		while(itr.hasNext()) {

			Map.Entry<Integer,String> m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+":"+m.getValue());

//			if(m.getKey().equals(101)) {
//				m.setValue("Anil");
//				//System.out.println("Hey Amit");
//			}

		}
		System.out.println(hm);

	}

}
