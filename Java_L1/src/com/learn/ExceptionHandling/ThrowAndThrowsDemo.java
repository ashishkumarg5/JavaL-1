package com.learn.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

//Throw - To explicitly throw an exception
//Throws - To declare that a particular method can throw an exception(s)


public class ThrowAndThrowsDemo {
	public static void main(String[] args) throws IOException{
		getFileName("Bat.txt");
	}
	
	//Throws Demo
	private static void displayFile() throws FileNotFoundException, RemoteException{
		
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
	}
	
	//Throw Demo
	private static void getFileName(String fileName) throws FileNotFoundException {
		
		if(fileName.charAt(0) == 'A') {
			System.out.println("Accepted!");
		}else {
			throw new FileNotFoundException();
		}
	}
}
