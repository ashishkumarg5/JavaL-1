package com.learn.ExceptionHandling;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		executeTransaction(600.0f);
	}
	
	public static float executeTransaction(float deduction) {
		float currentAmount = 500.0f;
		
		try {
			if(deduction > currentAmount)
				throw new InsufficientFundsException("Funds insufficient! Please deposit");
		}catch (InsufficientFundsException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return currentAmount - deduction;
	}
}
