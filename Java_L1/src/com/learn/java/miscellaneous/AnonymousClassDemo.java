package com.learn.java.miscellaneous;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		
		//Anonymous class
		ITest test = new ITest() {
			public String displayCapital() {
				return "New Delhi";
			}
			
			public String displayCurrency() {
				return "Rupee";
			}
		};
		
		test.displayCapital();
	}
}
