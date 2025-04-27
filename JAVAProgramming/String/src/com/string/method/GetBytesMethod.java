package com.string.method;

public class GetBytesMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		byte[] b=s.getBytes();
		for(int i=0;i<s.length()-1;i++) {
			System.out.println(b[i]);
		}
	}

}
