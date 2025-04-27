package com.string.practice;

public class CountTotalNoOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The best of both worlds";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
