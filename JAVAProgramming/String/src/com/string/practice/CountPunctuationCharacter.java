package com.string.practice;

public class CountPunctuationCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="He said, 'The mailman loves you.' I heard !it with my own ears.";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='-'||
					str.charAt(i)==':'||str.charAt(i)=='!'||str.charAt(i)=='.'||
					str.charAt(i)=='?') {
				count+=1;
			}
		}
		System.out.println(count);	
	}
}
