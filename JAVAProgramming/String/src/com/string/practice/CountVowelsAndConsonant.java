package com.string.practice;

public class CountVowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Himani";
		str=str.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount+=1;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				ccount+=1;
			}
		}
		System.out.println("vowel count:"+vcount);
		System.out.println("consonant count:"+ccount);
	}

}
