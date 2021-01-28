package com.learn.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		
		//More specific exception comes first
		try {
			File file = new File("abc.txt");
			FileReader f = new FileReader(file);
		}catch(FileNotFoundException e1) {
			System.out.println("FileNotFoundException");
		}catch(IOException e2) {
			System.out.println("IOException");
		}catch(Exception e3) {
			System.out.println("Exception");
		}
	}
}
