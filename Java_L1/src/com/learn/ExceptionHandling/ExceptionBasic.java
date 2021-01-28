package com.learn.ExceptionHandling;

import com.learn.java.Animal;

public class ExceptionBasic {
	public static void main(String[] args) {
		testTryCatch(null);
	}
	
	public static void testTryCatch(Animal animal) {
		String animalName = "";
		String myName = null;
		
		//every try block must be associated with at least one catch block
		try {
			//System.out.println("Inside try");
			//Very very important
			if(null != animal) {
				animalName = animal.getName();
			}
			
		}catch (Exception e) {
			System.out.println("Some Exception occurred");
		}
	}
}
