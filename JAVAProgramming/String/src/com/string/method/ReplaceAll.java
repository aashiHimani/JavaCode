package com.string.method;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi my name is himani";
		System.out.println(s.replaceAll("m", "z"));
		System.out.println(s.replaceAll("himani", "himu"));
		System.out.println(s.replaceAll("//s",""));//remove white space
		System.out.println(s.replaceAll("\\", "himu"));
	}

}
