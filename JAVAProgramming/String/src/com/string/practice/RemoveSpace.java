package com.string.practice;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Remove white spaces";
		s=s.replaceAll("\\s+","");
		System.out.println(s);
		s=s.trim();
		System.out.println(s);
	}

}
