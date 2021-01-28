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
	
	
	//public -> protected -> default -> private
	public GetCarResponse getCarDetails() {
		
		Car car = new Car();
		car.getQuote();
		GetCarResponse resp = new GetCarResponse();
		System.out.println("i20 " + "Asta " + "2020" );
		
		return resp;
	}
	
	//This is not overriding, this re-declaration
	public static String getCarRegCity() {
		return "Jodhpur";
	}
}
