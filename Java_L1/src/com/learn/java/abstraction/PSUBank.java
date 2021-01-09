package com.learn.java.abstraction;

//Abstract classes achieve 0 to 100% abstraction
public class PSUBank extends RetailBank{
	
	int x = 15;
	
	public int calculateDepositIntRate() {
		System.out.println("Interest rates in PSU banks for deposits");
		return 7;
	}
}
