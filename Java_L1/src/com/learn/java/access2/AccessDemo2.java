package com.learn.java.access2;

import com.learn.java.access1.AccessDemo1;

public class AccessDemo2 extends AccessDemo1{
	public static void main(String[] args) {
		AccessDemo2 newObj = new AccessDemo2();
		System.out.println(newObj.protectedVar);
		
		final int x = 100;
		
		System.out.println(x);
		
	}
}
