package com.exceptionhandling.main;

import java.util.Scanner;

public class ThrowUncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age :-");
		int age=sc.nextInt();
		if(age<18) {
			throw new ArithmeticException("person is not eligible");
		}
		else
		{
			System.out.println("person is eligible");
		}
		System.out.println("end...");
	}

}
