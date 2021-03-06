package com.learn.java.polymorphism;

public class Shape {
	
	void display() {
		System.out.println("No Parameters");
	}
	
	public void display(String first) {
		System.out.println("One Parameter " + first);
	}
	
	public void display(String...first) {
		System.out.println("One Parameter varargs" + first[0] + " " + first[1] + " " + first[2]);
	}
	
	void display(String first, String second) {
		System.out.println("Two Parameters " + first + " and " + second);
	}
	
	//Wrapper class will be last
	public boolean display(Integer x) {
		System.out.println("Integer " + x);
		return true;
	}
	
	
	//Ovrerloaded methods must change argument list
	/*
	boolean display() {
		System.out.println("No Parameters");
		return true;
	}*/
	
	
	/*
	 * public void display(long y) { System.out.println("long primitve " + y); }
	 */
	
	//int will be first preference
	
	  public void display(int z) { System.out.println("int primitve " + z); }
	 
	
	public void display(byte a) {
		System.out.println("byte primitve " + a);
	}
	
	public void display(short a) {
		System.out.println("short primitve " + a);
	}
	
	/*
	 * public void display(float a) { System.out.println("float primitve " + a); }
	 */
	
	/*
	 * public void display(double a) { System.out.println("double primitve " + a); }
	 */
	
	//int value -> int, long, float
}
