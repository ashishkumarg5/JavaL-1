package com.learn.java.polymorphism;

public class Car {
	String colour = "Black";
	
	public Car() {
		
	}
	
	public int getMaxSpeed(String carId) {
		int myCarId = Integer.parseInt(carId);
		
		if(myCarId > 1000) {
			return 200;
		}else {
			return 150;
		}
	}
	
	private IGetCarResp getCarDetails() {
		IGetCarResp resp = null;
		System.out.println("i20 " + "Asta " + "2020" );
		
		return resp;
	}
	
	//Static methods cannot be overridden in child classes
	public static String getCarRegCity() {
		return "Jaipur";
	}
	
	private String displayName() {
		return "M&M Thar";
	}
	
	public String getQuote() {
		String text = "Quote for : " + displayName();
		
		return text;
	}
}
