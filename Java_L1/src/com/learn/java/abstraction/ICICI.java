package com.learn.java.abstraction;

public class ICICI implements Bank{
	
	public void displayMsg() {
		System.out.println("Welcome to ICICI Bank! ");
	}
	
	public float getInterestRate() {
		return 3.55f;
		
	}
}
