package com.wrapper.booleanclass;

public class ImplementBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=Boolean.parseBoolean("True");
		boolean b2=Boolean.parseBoolean("TruE");
		boolean b3=Boolean.parseBoolean("False");
		boolean b4=Boolean.parseBoolean("FALSE");
		boolean b5=Boolean.parseBoolean("HimaniKumari");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		boolean b6 = b1.booleanValue();
	}

}
