package com.vipul.java;

public class Car {             // How many times we are creating classes that are not public
	final private int year =0 ;
	private int miles;          // we can create getters/ setters by IDE, why? 
								//Why we are warming the IDE when IDE is able to understand this by own
	
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;         // There is no other miles but we are still writing #this - which makes chances of mistakes
	}
	public int getYear() {
		return year;
	}
	
	// we also need to create constructors , is it really require ?
}
