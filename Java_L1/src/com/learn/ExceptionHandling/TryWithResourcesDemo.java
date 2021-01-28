package com.learn.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

//Try with resources
public class TryWithResourcesDemo {
	public static void main(String[] args) {
		//FileReader fr = null;
		try(FileReader fr = new FileReader("xyz")) {
			fr.read();
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
