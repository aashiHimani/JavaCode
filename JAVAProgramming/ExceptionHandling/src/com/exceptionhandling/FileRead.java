package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile("C:\\Users\\Windows-10\\eclipse-workspace\\JavaProgramming\\ExceptionHandling\\src\\com\\exceptionhandling\\read.txt");
			System.out.println("file found");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static void readFile(String fileName) throws FileNotFoundException {
		 File file = new File(fileName);
		 Scanner sc = new Scanner(file);
		 while (sc.hasNextLine()) {
			 String line = sc.nextLine();
		     System.out.println(line);
		 }
		 sc.close();
	}

}
