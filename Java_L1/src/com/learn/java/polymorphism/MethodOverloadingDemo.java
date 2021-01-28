package com.learn.java.polymorphism;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.display("abc","xyz","pqr");
		//shape.display();
		//shape.display("First");
		shape.display(new Integer(1007));
		//shape.display("First", "Second");
		//shape.display(1.0f);
		
		Triangle t = new Triangle();
		t.display(0, -1, 4);
		t.display("display");
	}
}
