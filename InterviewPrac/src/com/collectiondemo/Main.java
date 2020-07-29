package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) {

		ArrayList<Movie> list = new ArrayList<>();

		list.add(new Movie("Force Awakens", 8.3, 2015)); 
		list.add(new Movie("Star Wars", 8.7, 1977)); 
		list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
		list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
		System.out.println("Sort by ratings");
		System.out.println("-------------------------------------");
		//RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, new RatingCompare());
		
		for(Movie list1:list) {
			
			System.out.println(list1.getRating()+" " +
			                   list1.getName()+" "+
					           list1.getYear());
		}
	System.out.println("\nsort by moive names");
	System.out.println("----------------------");
	//NameCompare nameCompare = new NameCompare();
	Collections.sort(list,new NameCompare());
	
	for(Movie names:list) {
		
		System.out.println(names.getName()+" " +
		                   names.getRating()+" "+
				           names.getYear()); 
	}

    System.out.println("\nSorted by year"); 
    System.out.println("-----------------");
    Collections.sort(list); 
    for (Movie movie: list) 
        System.out.println(movie.getYear() + " " + 
                           movie.getRating() + " " + 
                           movie.getName()+" ");
		
	}
}
