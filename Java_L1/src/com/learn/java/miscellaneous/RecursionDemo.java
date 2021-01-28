package com.learn.java.miscellaneous;

import java.util.Scanner;

public class RecursionDemo {
	
	//varargs
	public static void main(String...arguments) {
		int factVal;
		
		factVal = getFactorial(5);
		
		System.out.println(factVal);
		
	}
	
	private static int getFactorial(int n) {
		
		if(n == 1)
			return 1;
		
		return n * getFactorial(n-1);
	}
	
	//1*2*3*4*5
	
}
