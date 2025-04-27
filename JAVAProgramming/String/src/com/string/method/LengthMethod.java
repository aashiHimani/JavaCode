package com.string.method;

public class LengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="himu";
		System.out.println(s.length());
		System.out.println("reverse string:");
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(s.length()-i-1));
		}
	}

}
