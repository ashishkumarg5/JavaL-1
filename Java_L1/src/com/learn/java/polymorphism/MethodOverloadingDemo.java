package com.learn.java.polymorphism;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		//shape.display();
		//shape.display("First");
		shape.display(new Integer(1007));
		//shape.display("First", "Second");
		//shape.display(1.0f);
	}
}
