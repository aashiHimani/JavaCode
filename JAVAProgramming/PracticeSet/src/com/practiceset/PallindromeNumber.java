package com.practiceset;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		int r,sum=0;
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("pallindrome number");
		}
		else {
			System.out.println("not pallindrome number");
		}
		*/
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("pallindrome number");
		}
		else {
			System.out.println("not pallindrome number");
		}
	}

}
