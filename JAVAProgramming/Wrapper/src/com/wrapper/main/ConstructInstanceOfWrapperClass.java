package com.wrapper.main;

public class ConstructInstanceOfWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1=new Integer(1);
		Integer num2=new Integer(1);
		Integer num3=Integer.valueOf(1);
		Integer num4=Integer.valueOf(1);
		Integer num5=5;
		Integer num6=5;
		boolean value1=(num1==num2);
		boolean value2=(num3==num4);
		boolean value3=(num5==num6);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
