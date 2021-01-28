package com.learn.java.Collections;

public class HashcodeEqualsDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Virendra");
		Employee e2 = new Employee(1001, "Viru");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//shallow comparison
		if(e1 == e2) {
			System.out.println("e1 == e2");
		}else {
			System.out.println("e1 == e2 is false");
		}
		
		//Deep comparison
		if(e1.equals(e2)) {
			System.out.println("e1 equals e2");
		}else {
			System.out.println("e1 equals e2 is false");
		}	
		
		
	}
}
