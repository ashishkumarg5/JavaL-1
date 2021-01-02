package com.learn.java.abstraction;


//interfaces are always meant to be implemented
public interface Bank {
	
	//interface member variables are final by default
	public String name = "ALL BANKS";
	
	//interface member functions are public by default
	void displayMsg();
	
	float getInterestRate();
}
