package com.string.method;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi, how are you";
		System.out.println(s.contains("how are"));
		System.out.println(s.contains("hello"));
		System.out.println(s.contains("How are"));//case sensitive
		System.out.println(s.contains(null));
	}

}
