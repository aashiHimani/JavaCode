package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadPositiveValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile(
					"C:\\Users\\Windows-10\\eclipse-workspace\\JavaProgramming\\ExceptionHandling\\src\\com\\exceptionhandling\\read.txt");
			System.out.println("File is not available");
			System.out.println("Number are non- positive");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (EmptyFileException ex) {
			System.out.println(ex.getMessage());
		} catch (PositiveNumberFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	private static void readFile(String string) throws EmptyFileException, PositiveNumberFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File(string);
		Scanner sc = new Scanner(file);
		try (BufferedReader reader = new BufferedReader(new FileReader(string))) {
			String line;
			while ((line = reader.readLine()) != null) {
				int number = Integer.parseInt(line);
				if (number > 0) {
					throw new PositiveNumberFoundException("Positive number found: " + number);
				}
			}
		}
	}
}
class EmptyFileException extends Exception {
	public EmptyFileException(String msg) {
		super(msg);
	}
}

class PositiveNumberFoundException extends Exception {
	public PositiveNumberFoundException(String msg) {
		super(msg);
	}
}
