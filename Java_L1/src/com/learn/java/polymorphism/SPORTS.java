package com.learn.java.polymorphism;

public class SPORTS extends Car {
	String colour = "Red";
	
	@Override
	public int getMaxSpeed(String carId) {
		int myCarId = Integer.parseInt(carId);
		
		if(myCarId > 2000) {
			return 500;
		}else if(myCarId == 0){
			return 199;
		}
		
		return 0;
	}
}
