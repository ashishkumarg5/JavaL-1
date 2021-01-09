package com.learn.java.polymorphism;

public class Car {
	String colour = "Black";
	
	public int getMaxSpeed(String carId) {
		int myCarId = Integer.parseInt(carId);
		
		if(myCarId > 1000) {
			return 200;
		}else {
			return 150;
		}
	}
}
