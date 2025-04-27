package com.string.practice;

public class DublicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="great responsibility";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					break;
				}
			}
		}
	}

}
