package com.exceptionhandling.main;

class ThrowUserDefinedException extends Exception{
	public ThrowUserDefinedException(String str) {
		super(str);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		throw new ThrowUserDefinedException("user defined excption");
	}
	catch(ThrowUserDefinedException ex) {
		System.out.println("caught exception");
		System.out.println(ex.getMessage());
	}
	}
}
