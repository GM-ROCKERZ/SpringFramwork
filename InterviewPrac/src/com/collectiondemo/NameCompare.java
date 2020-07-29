package com.collectiondemo;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie n1, Movie n2) {
		
	  return n1.getName().compareTo(n2.getName());
		
	}

}
