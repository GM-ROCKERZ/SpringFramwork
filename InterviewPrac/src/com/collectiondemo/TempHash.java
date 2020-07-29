package com.collectiondemo;

public class TempHash {
	
	int i;
	TempHash(int i){
		this.i = i;
		
	}
	
	public int hashCode() {
		return i;

	}
	
	public String toString() {
		return i +" ";
	}

}
