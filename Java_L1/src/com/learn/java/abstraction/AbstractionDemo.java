package com.learn.java.abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {
		Bank b = new ICICI();
		Bank b1 = new PNB();
		
		RetailBank retailBank = new PSUBank();
		
		
		System.out.println(getYearOfEstd(b));
		
		b.displayMsg();
		b1.displayMsg();
	}
	
	 static int getYearOfEstd(Bank bank) {
		
		if(bank instanceof ICICI) {
			return 1995;
		}else if(bank instanceof PNB) {
			return 1925;
		}
		
		return -1;
	}
}
