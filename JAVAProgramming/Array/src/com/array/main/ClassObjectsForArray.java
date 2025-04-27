package com.array.main;

public class ClassObjectsForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]=new int[2];
		byte byteArray[]=new byte[2];
		short shortArray[]=new short[2];
		String stringArray[]=new String[2];
		System.out.println(intArray.getClass());
		System.out.println(byteArray.getClass());
		System.out.println(shortArray.getClass());
		System.out.println(stringArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
	}

}
