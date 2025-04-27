package com.array.practice;

import java.util.Scanner;

public class ArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= {3,8,9};
		boolean b=isSorted(a);
		System.out.println(b);
	}

	private static boolean isSorted(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[i+1]) {
				return true;
			}
		}
		return false;
	}

}
