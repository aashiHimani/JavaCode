package com.string.practice;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hi", s2="himu";
		s1=s1+s2;//hihimu
		s2=s1.substring(0,(s1.length()-s2.length()));//hi
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
