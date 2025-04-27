package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile("C:\\Users\\Windows-10\\eclipse-workspace\\JavaProgramming\\ExceptionHandling\\src\\com\\exceptionhandling\\read.txt");
			System.out.println("File is not empty");
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(EmptyFileExcption ex) {
			System.out.println(ex.getMessage());
		}
	}
	private static void readFile(String string) throws EmptyFileExcption,FileNotFoundException{
		// TODO Auto-generated method stub
		File file=new File(string);
		Scanner sc=new Scanner(file);
		if(!sc.hasNextLine()) {
			sc.close();
			throw new EmptyFileExcption("file is empty..");
		}
		sc.close();
	}
}
class EmptyFileExcption extends Exception{
	public EmptyFileExcption(String msg) {
		super(msg);
	}
}
