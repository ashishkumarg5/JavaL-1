package com.learn.java.polymorphism;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		Car car = new Car();
		SUV suv = new SUV();
		//child class object can be assigned into parent class reference
		Car newCar = new SUV();
		Car oneMoreCar = new SPORTS();
		
		System.out.println(car.colour);	//Black
		System.out.println(suv.colour);	//White
		System.out.println(newCar.colour);	//White	-- wrong
		System.out.println(oneMoreCar.colour);
		
		System.out.println(car.getMaxSpeed("1001"));	//200
		System.out.println(suv.getMaxSpeed("2001"));	//300
		System.out.println(newCar.getMaxSpeed("2500"));	//300
		System.out.println(oneMoreCar.getMaxSpeed("2500"));
		
	}
	
}
