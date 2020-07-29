package com.collectiondemo;

public class Movie implements Comparable<Movie> {

	private double rating;
	private int year;
	private String name;

	//used to sort movies by year
	public int compareTo(Movie m) {

		return this.year - m.year;

	}

	public Movie(String nm, double rt, int yr) {
		super();
		this.rating = rt;
		this.year = yr;
		this.name = nm;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}


}
