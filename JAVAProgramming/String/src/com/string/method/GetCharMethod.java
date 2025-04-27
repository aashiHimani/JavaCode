package com.string.method;

public class GetCharMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love my family";
		char[] ch=new char[10];
		try {
			s.getChars(2, 6, ch, 0);
			System.out.println(ch);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
