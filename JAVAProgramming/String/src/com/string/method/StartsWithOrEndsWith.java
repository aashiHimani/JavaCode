package com.string.method;

public class StartsWithOrEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="himu";
		System.out.println(s.startsWith("h"));
		System.out.println(s.startsWith("i",1));
		System.out.println(s.endsWith("u"));
		System.out.println(s.endsWith(""));
		System.out.println(s.endsWith(" "));
	}

}
