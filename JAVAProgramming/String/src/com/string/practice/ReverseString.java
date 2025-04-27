package com.string.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi my name is himu";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.print(reverse);
	}

}
