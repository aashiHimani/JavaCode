package com.practiceset;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,original,rem,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		original=num;
		while(num>0) {
			rem=num%10;
			res+=Math.pow(rem, 3);
			num=num/10;
		}
		if(original==res) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
