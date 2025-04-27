package com.string.method;

public class CharAtMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="himani";
		System.out.println(s.charAt(0));//start value
		System.out.println(s.charAt(s.length()-1));//last value
		//System.out.println(s.charAt(9));//StringIndexOutOfBoundsException
		
		//print character presented at odd position
		for(int i=0;i<s.length()-1;i++) {
			if(i%2!=0) {
				System.out.println("character prenset at "+i+"postion is :"+s.charAt(i));
			}
		}
		
		//count frequency of character
		String str="Hi, my name is himani kumari";
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='m') {
				count++;
			}
		}
		System.out.println("frequency is: "+count);
		
		//count number of vowel
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				c++;
			}
		}
		System.out.println("count number of vowel: "+c);
	}

}
