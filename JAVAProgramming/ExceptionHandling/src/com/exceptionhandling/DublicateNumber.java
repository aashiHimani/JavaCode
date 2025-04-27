package com.exceptionhandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DublicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<Integer> list=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the count of number:-");
			int n=sc.nextInt();
			System.out.println("Enter number=");
			for(int i=0;i<n;i++) {
				int num=sc.nextInt();
				list.add(num);
			}
			checkDublicateNumber(list);
			System.out.println("Not duplicate..");
		}catch(DublicateNumberException ex) {
			System.out.println(ex.getMessage());
		}
	}
	private static void checkDublicateNumber(List<Integer> list) throws DublicateNumberException{
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		for(int n:list) {
			if(set.contains(n)) {
				throw new DublicateNumberException("Dublicate number found...");
			}
			set.add(n);
		}
	}
}
class DublicateNumberException extends Exception {
	public DublicateNumberException(String msg) {
		super(msg);
	}
}