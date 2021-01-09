package com.learn.java.polymorphism;

public class SUV extends Car {
	String colour = "White";
	
	@Override
	public int getMaxSpeed(String carId) {
		int myCarId = Integer.parseInt(carId);
		
		if(myCarId > 2000) {
			return 300;
		}else if(myCarId == 0){
			return 210;
		}
		
		return 0;
	}
}
