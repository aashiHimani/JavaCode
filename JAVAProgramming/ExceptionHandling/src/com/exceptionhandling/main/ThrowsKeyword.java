package com.exceptionhandling.main;

import java.io.IOException;

/*
 * If we are calling a method that declares an exception, we must either caught or declare the exception.
 * We have caught the exception i.e. we have handled the exception using try/catch block.
 * We have declared the exception i.e. specified throws keyword with the method.
 * Checked Exception can be propagated (forwarded in call stack).
 * It provides information to the caller of the method about the exception.
 */
public class ThrowsKeyword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
		catch(Exception e) {
			System.out.println("eception handled");
		}
		System.out.println("done...");

	}
	private static void method() throws IOException {
		// TODO Auto-generated method stub
		throw new IOException("erxception");
	}
}
