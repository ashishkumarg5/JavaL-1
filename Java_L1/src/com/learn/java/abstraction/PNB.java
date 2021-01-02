package com.learn.java.abstraction;

public class PNB implements Bank{
	
	public void displayMsg() {
		System.out.println("Welcome to PNB Bank! ");
	}
	
	public float getInterestRate() {
		return 4.5f;
	}
}
