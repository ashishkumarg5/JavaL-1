package com.learn.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("xyz");
			fr.read();
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally executed");
			
			try {
				fr.close();
			}catch(IOException e) {
				
			}
		}
		
	}
}
