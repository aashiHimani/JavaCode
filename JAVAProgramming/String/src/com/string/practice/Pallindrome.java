package com.string.practice;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mada";
		s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("pallindrome string "+s);
		}
		else {
			System.out.println("not pallindrome string "+s);
		}
	}

}
