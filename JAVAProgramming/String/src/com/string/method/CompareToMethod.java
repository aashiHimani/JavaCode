package com.string.method;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="hello";
		String s2="himu";
		String s3="Somu";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		
		//compare with empty string
		String str="hello";
		String str1="";
		String str2="somu";
		System.out.println(str.compareTo(str1));//. If second string is empty method return positive number that is length of string.
		System.out.println(str1.compareTo(str2));//if first string is empty method return negative.
		
		//case sensitive
		String ss="Himani";
		String ss1="himani";
		System.out.println(ss.compareTo(ss1));
		
		//classcastexception
		//nullpointerexception
		String sss=null;
		System.out.println(sss.compareTo("himu"));
	}

}
