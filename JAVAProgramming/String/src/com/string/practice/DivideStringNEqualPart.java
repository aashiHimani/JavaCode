package com.string.practice;

public class DivideStringNEqualPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbbbcccc";
		int len=s.length();
		int n=4;
		int temp=0;
		int chars=len/n;
		String[] str=new String[n];
		if(len%n!=0) {
			System.out.println("not divided");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String part=s.substring(i, i+chars);
				str[temp]=part;
				temp++;
			}
			System.out.println(n+" equals parts in string:");
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
		}
	}

}
