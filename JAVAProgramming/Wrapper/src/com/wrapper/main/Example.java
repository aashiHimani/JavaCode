package com.wrapper.main;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		float y=2.7f;
		long z=5000;
		Integer intobj=x;
		Float floatobj=y;
		Long longobj=z;
		System.out.println(intobj);
		System.out.println(floatobj);
		System.out.println(longobj);
		
		Float floatwrap=Float.valueOf(45.12f);
		int floatToInt=floatwrap.intValue();
		System.out.println(floatToInt);
		Integer i=Integer.valueOf("100",2);
		System.out.println(i);
	}

}
