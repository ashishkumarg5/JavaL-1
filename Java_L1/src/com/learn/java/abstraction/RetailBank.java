package com.learn.java.abstraction;

//Keeping abstract methods in an abstract class is optional
//You cannot instantiate abstract class
public abstract class RetailBank {
	
	int x = 10;
	public RetailBank() {
		System.out.println("abc");
		
	}
	public float calculateInterest() {
		System.out.println("Calculating interest");
		return 3.5f;
	}
	
	public abstract int calculateDepositIntRate();
}
