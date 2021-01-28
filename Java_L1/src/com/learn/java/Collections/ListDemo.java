package com.learn.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
	//List is a collection of objects
		List<String> nameList = new ArrayList<String>(); 
		nameList.add("Virat");
		nameList.add("Rohit");
		nameList.add("Dinesh");
		
		for(String element : nameList) {
			System.out.println(element);
		}
		
		Employee e1 = new Employee(1001, "Rohit");
		Employee e2 = new Employee(1002, "Dinesh");
		Employee e3 = new Employee(1001, "Mr.R");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		
		
		if(empList.contains(e3)) {
			System.out.println("list contain e3");
		}else {
			System.out.println("FALSE");
		}
		
	}
}
