package com.string.method;

public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="himu";
		System.out.println(s.intern());
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);//true because reference variables are pointing to same instance  
	}

}
