package com.exceptionhandling;

import java.util.Scanner;

public class ThrowsExceptionNumberOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:-");
		int num=sc.nextInt();
		number(num);
	}
	private static void number(int num) {
		// TODO Auto-generated method stub
		try {
			checkoddnumber(num);
			System.out.println("even number...");
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void checkoddnumber(int num) {
		// TODO Auto-generated method stub
		if(num%2!=0) {
			throw new IllegalArgumentException("number is odd...");
		}
	}
}
