package com.string.method;

public class IsEmptyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		String s1="himu";
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		
		//blank string
		String str=" ";
		if(str.length()==0) {
			System.out.println("string is empty");
		}
		else if(str.length()>0 && str.trim().isEmpty()) {
			System.out.println("string is blank");
		}
		else
			System.out.println("string is not blank");
	}

}
