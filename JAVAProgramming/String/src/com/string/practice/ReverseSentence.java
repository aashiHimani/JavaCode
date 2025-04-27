package com.string.practice;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world";
		String s[]=str.split(" ");
		String rev="";
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+" "+s[i];
		}
		System.out.println(rev);
	}

}
