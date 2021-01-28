package com.learn.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<Employee>();
		
		List<List<String>> teacherSchoolNameList = new ArrayList<>();
		Queue<String> queue = new LinkedList<String>();
		Queue<String> pQueue = new PriorityQueue<String>();
		
		Employee e1 = new Employee(10, "APJ");
		Employee e2 = new Employee(11, "MKJ");
		Employee e3 = new Employee(10, "LBS");
		Employee e4 = new Employee(13, "ABC");
		Employee e5 = new Employee(14, "DEF");
		Employee e6 = new Employee(15, "XYZ");
		
		System.out.println(empSet.add(e1));
		System.out.println(empSet.add(e2));
		System.out.println(empSet.add(e3));
		
		System.out.println(empSet.size());
		
		for(Employee e : empSet) {
			System.out.println(e.getName());
		}
	}
}
