package com.learn.java;


public class InheritanceDemo {

	public static void main(String[] args) {
		Animal animal = new Animal("New Cow","White",false);
		Cow cow = new Cow("Moo",10);

		animal = cow;
		
		
	}

}
