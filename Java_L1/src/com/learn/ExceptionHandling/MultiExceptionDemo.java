package com.learn.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiExceptionDemo {
	public static void main(String[] args) {
		
		//More specific exception comes first
		try {
			File file = new File("abc.txt");
			FileReader f = new FileReader(file);
		}catch(NullPointerException | FileNotFoundException | ArrayIndexOutOfBoundsException e1) {
			System.out.println("FileNotFoundException");
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
	}
}
