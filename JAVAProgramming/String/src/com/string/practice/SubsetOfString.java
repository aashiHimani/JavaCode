package com.string.practice;

public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GOOD";
		int len=s.length();//3
		int temp=0;
		String[] str=new String[len*(len+1)/2];//6
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				str[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("subset of string are:");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
