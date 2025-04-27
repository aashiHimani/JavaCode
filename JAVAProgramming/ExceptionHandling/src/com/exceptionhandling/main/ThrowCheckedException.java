package com.exceptionhandling.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("end...");
	}

	private static void method() throws FileNotFoundException{
		// TODO Auto-generated method stub
		FileReader file=new FileReader("read.txt");
		BufferedReader buffer=new BufferedReader(file);
		throw new FileNotFoundException();
	}
}
