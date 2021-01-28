package com.learn.java.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 - Streams
public class ListStreamDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(10, "APJ");
		Employee e2 = new Employee(11, "MKJ");
		Employee e3 = new Employee(12, "LBS");
		Employee e4 = new Employee(13, "ABC");
		Employee e5 = new Employee(14, "DEF");
		Employee e6 = new Employee(15, "XYZ");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		//Two types of operations for streams - Terminal operations, Intermediate operations
		//Lambda Expression
		// i -> i.getName()
		List<String> employeeNames = empList.stream().map(i -> i.getName()).collect(Collectors.toList());
		
		for(String name : employeeNames) {
			System.out.println(name);
		}
	}
}
