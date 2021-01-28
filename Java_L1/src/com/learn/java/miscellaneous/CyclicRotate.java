package com.learn.java.miscellaneous;

public class CyclicRotate {
	public static void main(String[] args) {
		System.out.println(isRotation("jaipur", "jaipru"));
	}
	
	private static boolean isRotation(String s1, String s2) {
		String s3 = s1 + s1;
		return s3.contains(s2);
	}
}

