package com.exceptionhandling;

import java.util.Scanner;

public class NotContainVowelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String str=sc.nextLine();
		try {
			checkvowels(str);
			System.out.println("vowels contain..");
		}catch(NoVowelsException ex) {
			System.out.println(ex.getMessage());
		}
	}
	private static void checkvowels(String str) throws NoVowelsException{
		// TODO Auto-generated method stub
		boolean containVowels=false;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(vowels.contains(String.valueOf(ch))) {
				containVowels=true;
				break;
			}
		}
		if(!containVowels) {
			throw new NoVowelsException("no vowels contain");
		}
	}
}
class NoVowelsException extends Exception {
	public NoVowelsException(String msg) {
		super(msg);
	}
}