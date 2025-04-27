package com.string.main;

public class HashCodeTestOfStringAndStringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hashcode test of string:");
		String s="himu";
		System.out.println(s.hashCode());
		s+="somu";
		System.out.println(s.hashCode());
		
		System.out.println("hashcode test of string buffer:");
		StringBuffer sb=new StringBuffer("himu");
		System.out.println(sb.hashCode());
		sb.append("somu");
		System.out.println(sb.hashCode());
	}

}
