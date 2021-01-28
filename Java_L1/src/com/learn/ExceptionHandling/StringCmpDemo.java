package com.learn.ExceptionHandling;

public class StringCmpDemo {
	public static void main(String[] args) {
		//String objects
		String a = new String("JavaPro");
		String b = new String("JavAPRO");
		String j = "1234";
		
		System.out.println(j.split("")[1]);
		
		//String literals
		String x = "Jaipur";
		String y = "Jaipur";
		
		String z = null;
		
		//false
		//== compares references, not content of string
		if(a == b) {
			System.out.println("a==b");
		}
		
		//true
		if(a.equals(b)) {
			System.out.println("a equals b");
		}
		
		//true
		if(a.equalsIgnoreCase(b)) {
			System.out.println("a equals ignore case b");
		}
		
		if(x==y) {
			System.out.println("x==y");
		}
		
		if(x.equals(y)) {
			System.out.println("x equals y");
		}
		
		if("JavaPro".equals(z)) {
			System.out.println("Yes??");
		}
	}
}
