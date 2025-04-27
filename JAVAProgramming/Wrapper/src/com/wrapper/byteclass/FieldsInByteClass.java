package com.wrapper.byteclass;

public class FieldsInByteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte max_value;
		max_value=Byte.MAX_VALUE;
		System.out.println(max_value);
		
		byte min_value;
		min_value=Byte.MIN_VALUE;
		System.out.println(min_value);
		
		int output=Byte.SIZE;
		System.out.println(output);
		
		Class<Byte> out=Byte.TYPE;
		System.out.println(out);
	}

}
