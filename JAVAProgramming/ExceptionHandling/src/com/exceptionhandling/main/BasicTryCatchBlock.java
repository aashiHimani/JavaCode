package com.exceptionhandling.main;

import java.util.Scanner;

/*
 * int a=50/0;//ArithmeticException  
 * String s=null;  System.out.println(s.length());//NullPointerException
 * String s="abc";  int i=Integer.parseInt(s);//NumberFormatException 
 * int a[]=new int[5];  a[10]=50; //ArrayIndexOutOfBoundsException  
 * compile time error when to handle the exception without maintaining the order of exceptions 
 */

public class BasicTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:-");
		int num=sc.nextInt();
		try {
			//int i=num/0;
			int result=divide(num,0);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("hi");
	}
	
	public static int divide(int dividend,int divisor) {
		if(divisor==0) {
			throw new ArithmeticException("can't divide by zero....");
		}
		else {
			return dividend/divisor;
		}
	}

}
