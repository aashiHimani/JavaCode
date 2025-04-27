package com.practiceset;

import java.util.Scanner;

public class FactorialNumber {
	//factorial
		static int Factorial(int n) {
			if(n==0)
				return 1;
			else
				return(n*Factorial(n-1));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		/*
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}*/
		//factorial
		fact=Factorial(num);
		System.out.println("factorial number of "+num+" is: "+fact);
	}

}
