package com.learn.java.inheritance;

public class Metro extends City implements DemoInterface1, DemoInterface2{
	private long population;
	
	public Metro() {
		System.out.println("Metro called");
		//super("Jaipur","Rajasthan");
	}
}
